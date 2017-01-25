package com.accenture.cpaas.enabler.dcm.amarozerosette.masteraip.be.processor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.camel.Exchange;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.accenture.cpaas.core.util.provider.JsonObjectMapper;
import com.accenture.cpaas.enabler.dcm.common.data.Header;
import com.accenture.cpaas.enabler.dcm.common.processor.GenericProcessor;

import com.accenture.cpaas.enabler.dcm.amarozerosette.masteraip.be.data.AmarozerosetteMasteraip;
import com.accenture.cpaas.enabler.dcm.amarozerosette.masteraip.be.util.EntityBean;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializeRequestProcessor  extends GenericProcessor {

    private Logger log = LoggerFactory.getLogger(SerializeRequestProcessor.class);

    
    public void process(Exchange exchange) throws Exception {
        
        log.debug("Process sampling to prepare request to be stored");
        
        AmarozerosetteMasteraip request = exchange.getIn().getBody(AmarozerosetteMasteraip.class);
        
        String rootSchema = AmarozerosetteMasteraip.class.getSimpleName();

		String root = rootSchema.replaceAll("(.)([A-Z])", "$1_$2").toLowerCase(); 

        List<EntityBean> entityBeans = new ArrayList<EntityBean>();

        ricorsivo(rootSchema, request, entityBeans, rootSchema, rootSchema, request.getHeader(), null, root);
        
        exchange.getIn().setBody(entityBeans);
        
    }
    
    
    private void ricorsivo(String rootSchema, Object request, List<EntityBean> entityBeans, String tableName, String tableRoot, Header header, String randomId, String root) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, JsonProcessingException, ClassNotFoundException, InstantiationException {
        Class<?> clazz = Class.forName("com.accenture.cpaas.enabler.dcm.amarozerosette.masteraip.be.access.entity."+ rootSchema); 

        Object t = clazz.newInstance();

        ObjectMapper objectMapper = JsonObjectMapper.getMapper();
        
        String randomUUID = UUID.randomUUID().toString();
        
        if (request == null) {
            return;
        }
        
        t.getClass().getDeclaredMethod("setDeviceId", String.class).invoke(t, header.getDeviceId());

        t.getClass().getDeclaredMethod("setDeviceType", String.class).invoke(t, header.getDeviceType());
        
        t.getClass().getDeclaredMethod("setSystemDate", Date.class).invoke(t, header.getTimestamp());

        t.getClass().getDeclaredMethod("setId", String.class).invoke(t, randomUUID);
        
        t.getClass().getDeclaredMethod("setIdTenant", Integer.class).invoke(t, header.getTenantId());
        
        t.getClass().getDeclaredMethod("setIdEnterprise", Integer.class).invoke(t, header.getEnterpriseId()); 
        
        List<Method> asList = Arrays.asList(t.getClass().getDeclaredMethods());
        for (int i = 0; i < asList.size(); i++) {
            if (asList.get(i).getName().toLowerCase().equalsIgnoreCase(StringUtils.substringBefore("setfk"+tableName.toLowerCase().replaceAll("_", ""), rootSchema.toLowerCase()) )) {
                t.getClass().getDeclaredMethod(asList.get(i).getName(), String.class).invoke(t, randomId);
            }
        }
        
        for (Method method : request.getClass().getDeclaredMethods()) {
            
            
            if (method.getName().equals("getTenant")) {
                if(method.invoke(request)!=null){
                    t.getClass().getDeclaredMethod("setIdTenant", method.getReturnType()).invoke(t, method.invoke(request));
                }else{
                    continue;
                }
            } else 
                if (method.getName().equals("getEnterprise")) {
                   if(method.invoke(request)!=null){
                       t.getClass().getDeclaredMethod("setIdEnterprise", method.getReturnType()).invoke(t, method.invoke(request));
                   }else{
                       continue;
                   }
            } else
            
                if (method.getName().equals("getDate")) {
                    t.getClass().getDeclaredMethod("setDeviceDate", Date.class).invoke(t, method.invoke(request));
            } else 
                if (method.getName().startsWith("get")&& !isCustomObj(method.getReturnType())) {
                    t.getClass().getDeclaredMethod("set" + method.getName().substring(3), method.getReturnType()).invoke(t, method.invoke(request));
            } else 
                if (method.getName().startsWith("get")&& isCustomObj(method.getReturnType())) {
                    
                	if (method.isAnnotationPresent(JsonProperty.class)) {
    					JsonProperty ta = method.getAnnotation(JsonProperty.class);
    					if (method.getReturnType().getName().startsWith("java.util.List")) {
                            if (StringUtils.substringAfterLast(tableRoot, "_") != null && StringUtils.substringAfterLast(tableRoot, "_").equalsIgnoreCase(method.getName().substring(3))) {

    						  ricorsivolist(method.getName().substring(3), method.invoke(request), entityBeans, tableRoot, (tableRoot.replaceAll("(.)([A-Z])", "$1_$2")).equalsIgnoreCase(root) ? root : tableRoot, header, randomUUID, root);
    						} else {
                                ricorsivolist(method.getName().substring(3), method.invoke(request), entityBeans, tableRoot + method.getName().substring(3).toLowerCase(), ((tableRoot.replaceAll("(.)([A-Z])", "$1_$2")).equalsIgnoreCase(root) ? root : tableRoot) + "_" + ta.value().toLowerCase(), header, randomUUID, root);
                            }
                        } else {
                        	if (StringUtils.substringAfterLast(tableRoot, "_") != null && StringUtils.substringAfterLast(tableRoot, "_").equalsIgnoreCase(method.getName().substring(3))) {
                                ricorsivo(method.getName().substring(3), method.invoke(request), entityBeans, tableRoot, (tableRoot.replaceAll("(.)([A-Z])", "$1_$2")).equalsIgnoreCase(root) ? root : tableRoot, header, randomUUID, root);
                            } else {
                                ricorsivo(method.getName().substring(3), method.invoke(request), entityBeans, tableRoot + method.getName().substring(3).toLowerCase(), ((tableRoot.replaceAll("(.)([A-Z])", "$1_$2")).equalsIgnoreCase(root) ? root : tableRoot) + "_" + ta.value().toLowerCase(), header, randomUUID, root);
                            }
                        }
    				}
            }        
        }
        
		entityBeans.add(new EntityBean((tableRoot.replaceAll("(.)([A-Z])", "$1_$2")).equalsIgnoreCase(root) ? root : tableRoot, objectMapper.writeValueAsString(t)));
    }
    
    
    private void ricorsivolist(String rootSchema, Object request, List<EntityBean> entityBeans, String tableName, String tableRoot, Header header, String randomId, String root) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, JsonProcessingException, ClassNotFoundException, InstantiationException {

        List<Object> list = (List<Object>) request;
        
        for (int i = 0; i < list.size(); i++) {
            
            ricorsivo(rootSchema, list.get(i), entityBeans, tableName, tableRoot, header, randomId, root);
            
        }
    }
    
    
    private boolean isCustomObj(Class<?> check) {
        boolean iscustom;
        if (check.getName().startsWith("com.accenture") || check.getName().startsWith("java.util.List")) {
            iscustom = true;
        } else {
            iscustom = false;
        }
        return iscustom;
    }
    
    

}
