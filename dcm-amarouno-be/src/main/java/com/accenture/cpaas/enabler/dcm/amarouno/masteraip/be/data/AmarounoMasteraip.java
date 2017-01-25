
package com.accenture.cpaas.enabler.dcm.amarouno.masteraip.be.data;

import java.util.Date;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.accenture.cpaas.enabler.dcm.common.data.Request;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Stazione meteo mobile
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@XmlRootElement(name = "amarouno_masteraip")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonPropertyOrder({
    "sampleId",
    "location",
    "OutsideTemperature",
    "tenant",
    "enterprise",
    "date"
})
public class AmarounoMasteraip
    extends Request
{

    @JsonProperty("sampleId")
    private Double sampleId;
    @JsonProperty("location")
    private String location;
    @JsonProperty("OutsideTemperature")
    private Double OutsideTemperature;
    @JsonProperty("tenant")
    private Integer tenant;
    @JsonProperty("enterprise")
    private Integer enterprise;
    @XmlJavaTypeAdapter(com.accenture.cpaas.core.request.DateAdapter.class)
    @JsonProperty("date")
    private Date date;

    /**
     * 
     * @return
     *     The sampleId
     */
    @JsonProperty("sampleId")
    public Double getSampleId() {
        return sampleId;
    }

    /**
     * 
     * @param sampleId
     *     The sampleId
     */
    @JsonProperty("sampleId")
    public void setSampleId(Double sampleId) {
        this.sampleId = sampleId;
    }

    /**
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The OutsideTemperature
     */
    @JsonProperty("OutsideTemperature")
    public Double getOutsideTemperature() {
        return OutsideTemperature;
    }

    /**
     * 
     * @param OutsideTemperature
     *     The OutsideTemperature
     */
    @JsonProperty("OutsideTemperature")
    public void setOutsideTemperature(Double OutsideTemperature) {
        this.OutsideTemperature = OutsideTemperature;
    }

    /**
     * 
     * @return
     *     The tenant
     */
    @JsonProperty("tenant")
    public Integer getTenant() {
        return tenant;
    }

    /**
     * 
     * @param tenant
     *     The tenant
     */
    @JsonProperty("tenant")
    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }

    /**
     * 
     * @return
     *     The enterprise
     */
    @JsonProperty("enterprise")
    public Integer getEnterprise() {
        return enterprise;
    }

    /**
     * 
     * @param enterprise
     *     The enterprise
     */
    @JsonProperty("enterprise")
    public void setEnterprise(Integer enterprise) {
        this.enterprise = enterprise;
    }

    /**
     * 
     * @return
     *     The date
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

}
