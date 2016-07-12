package com.accenture.cpaas.enabler.dcm.corradodue.masteraip.be.formatter;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.spi.DataFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.accenture.cpaas.core.util.TimeUtility;

import com.accenture.cpaas.enabler.dcm.corradodue.masteraip.be.data.CorradodueMasteraip;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RequestFormat implements DataFormat {
	
	private Logger log = LoggerFactory.getLogger(RequestFormat.class);
	
	private final ObjectMapper objectMapper;
	
	public RequestFormat() {
		this.objectMapper = new ObjectMapper();
	}

	public void marshal(Exchange exchange, Object graph, OutputStream stream) throws Exception {
		this.objectMapper.writeValue(stream, graph);
	}

	public Object unmarshal(Exchange exchange, InputStream stream) throws Exception {
		try {
			String json = exchange.getIn().getBody(String.class);
			
			CorradodueMasteraip request = this.objectMapper.readValue(json, CorradodueMasteraip.class);
			request.getHeader().setTimestamp(TimeUtility.normalizeDateinGMTWithMillis(new Date()));
			
			return request;
		} catch (Exception e) {
			log.error("Impossible to parse request. ", e);
		}
		
		return null;
	}
	
}
