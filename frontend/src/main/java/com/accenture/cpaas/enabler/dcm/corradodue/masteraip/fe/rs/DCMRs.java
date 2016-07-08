package com.accenture.cpaas.enabler.dcm.corradodue.masteraip.fe.rs;

import static com.accenture.cpaas.enabler.dcm.common.util.Constants.HEADER_DEVICE_ID;
import static com.accenture.cpaas.enabler.dcm.common.util.Constants.HEADER_DEVICE_TYPE;
import static com.accenture.cpaas.enabler.dcm.common.util.Constants.HEADER_TRANSACTION_ID;


import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.accenture.cpaas.enabler.dcm.corradodue.masteraip.fe.data.CorradodueMasteraip;

public interface DCMRs {

	@POST
    @Path("/{" + HEADER_DEVICE_ID + "}/{" + HEADER_DEVICE_TYPE + "}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
	Response corradodue_masteraip(
	        @PathParam(HEADER_DEVICE_ID) String deviceId, 
	        @PathParam(HEADER_DEVICE_TYPE) String deviceType,
	        @HeaderParam(HEADER_TRANSACTION_ID) String transactionId,
	        CorradodueMasteraip request);

}
