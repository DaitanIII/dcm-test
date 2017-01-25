package com.accenture.cpaas.enabler.dcm.amarozerosette.masteraip.be.data;

import java.util.Date;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import javax.validation.constraints.NotNull;

import com.accenture.cpaas.core.request.DateAdapter;
import com.accenture.cpaas.enabler.dcm.common.data.Request;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DCMRequest extends Request {

	private static final long serialVersionUID = 1L;
	
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date date;
	
	/**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date
     *            the date to set
     */
    public void setDate(Date date) {
        if (date != null) {
            this.date = new Date(date.getTime());
        }
    }
	
	
}
    
