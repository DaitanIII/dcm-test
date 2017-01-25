package com.accenture.cpaas.enabler.dcm.amarozerosette.masteraip.be.access;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.accenture.cpaas.enabler.dcm.cassandra.utility.client.CassandraClient;
import com.accenture.cpaas.enabler.dcm.cassandra.utility.util.CassandraHelper;

import com.accenture.cpaas.enabler.dcm.amarozerosette.masteraip.be.util.EntityBean;

import com.datastax.driver.core.ResultSet;
import com.fasterxml.jackson.core.JsonProcessingException;

public class DcmCqlAccessImpl {

    private Logger              log    = LoggerFactory.getLogger(DcmCqlAccessImpl.class);

    private CassandraClient     client;

    public void writeNewSampling(List<List<EntityBean>> entityBeans) throws JsonProcessingException, IOException {
  
        log.debug("Save new sampling list for AmarozerosetteMasteraip");

        client.start();

        log.debug("# of lists: {}", entityBeans.size());
        
        for (int i = 0; i <entityBeans.size(); i++) {
            log.debug("# of elems in this list: {}", entityBeans.get(i).size());
            
            for (int j = 0; j < entityBeans.get(i).size(); j++) {
                
                EntityBean entityBean = entityBeans.get(i).get(j);
                
                log.debug("table name: [{}], json to store: [{}]", entityBean.getTableName(), entityBean.getJsonContent());
                
                String insert = CassandraHelper.buildQuery(entityBean.getTableName(), entityBean.getJsonContent());
                
                log.debug("QUERY to execute: {} ", insert);
                
                ResultSet resultSet = client.getSession().execute(insert);
                log.debug("{}", resultSet);
                
           }
        }

        client.stop();

    }


    
    /**
     * @return the client
     */
    public CassandraClient getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(CassandraClient client) {
        this.client = client;
    }

}
