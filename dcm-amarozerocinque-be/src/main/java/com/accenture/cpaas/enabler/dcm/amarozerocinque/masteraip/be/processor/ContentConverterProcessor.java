package com.accenture.cpaas.enabler.dcm.amarozerocinque.masteraip.be.processor;

import java.util.Date;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.accenture.cpaas.core.util.TimeUtility;
import com.accenture.cpaas.enabler.dcm.common.data.Request;
import com.accenture.cpaas.enabler.dcm.common.processor.GenericProcessor;

import com.accenture.cpaas.enabler.dcm.amarozerocinque.masteraip.be.data.AmarozerocinqueMasteraip;

import com.fasterxml.jackson.databind.ObjectMapper;


public class ContentConverterProcessor extends GenericProcessor {
 private Logger log = LoggerFactory.getLogger(ContentConverterProcessor.class);
    
    public void process(Exchange exchange) throws Exception {
        
        String requestContent = exchange.getIn().getBody(String.class);
        
        log.debug("request content: {}", requestContent);
        
        ObjectMapper mapper = new ObjectMapper();
        
        Request request = mapper.readValue(requestContent, AmarozerocinqueMasteraip.class);
        
        Date timestamp = TimeUtility.normalizeDateinGMTWithMillis(new Date());
//        Date timestamp = TimeUtility.parseDateWithMillis(new Date());
//        Date timestamp = new Date();
        request.setHeadersFields(request.getHeader().getTransactionId(), request.getHeader().getDeviceId(), request.getHeader().getDeviceType(), request.getHeader().getTenantId(), request.getHeader().getEnterpriseId(), timestamp);
        
        log.debug("request converted: {}", request);
        
        exchange.getIn().setBody(request);
        
    }
    
    
}
