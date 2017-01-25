package com.accenture.cpaas.enabler.dcm.amarosei.masteraip.be.processor;

import static com.accenture.cpaas.enabler.dcm.common.util.Constants.IS_NOT_VALID;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.accenture.cpaas.enabler.dcm.amarosei.masteraip.be.data.AmaroseiMasteraip;


import com.accenture.cpaas.enabler.dcm.common.processor.GenericProcessor;


public class DCMProcessor extends GenericProcessor {

	private Logger log = LoggerFactory.getLogger(DCMProcessor.class);
	
	public static final String SERVICE = "amarosei_masteraip";
	public static final String SYSTEM = "DCMAMAROSEIMASTERAIP";
	
	public void process(Exchange exchange) throws Exception {
	    
		log.debug("Process sampling before to store in the DB");

		AmaroseiMasteraip request = exchange.getIn().getBody(AmaroseiMasteraip.class);

		log.debug("Check if request is well formed");
		boolean result = isNotValid(exchange, request, SERVICE);
		
		exchange.getIn().setHeader(IS_NOT_VALID, Boolean.valueOf(result));
		
        if (!result) {
        	log.debug("Check if device is able to send sampling for amarosei_masteraip service");
			//checkSubscription(exchange, request, SERVICE, SYSTEM);

			request.getHeader().updateHeadersInfo(exchange);
        }
	}

}
