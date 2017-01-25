
package com.accenture.cpaas.enabler.dcm.amaro.masteraip.be.data;

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
 * Weather station
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@XmlRootElement(name = "amaro_masteraip")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonPropertyOrder({
    "sampleId",
    "sampleDate",
    "outSideTemperature",
    "maxTemperature",
    "minTemperature",
    "unitOfMeasure",
    "longitudine",
    "latitude",
    "altitude",
    "tenant",
    "enterprise",
    "date"
})
public class AmaroMasteraip
    extends Request
{

    @JsonProperty("sampleId")
    private String sampleId;
    @JsonProperty("sampleDate")
    private String sampleDate;
    @JsonProperty("outSideTemperature")
    private Double outSideTemperature;
    @JsonProperty("maxTemperature")
    private Double maxTemperature;
    @JsonProperty("minTemperature")
    private Double minTemperature;
    @JsonProperty("unitOfMeasure")
    private String unitOfMeasure;
    @JsonProperty("longitudine")
    private String longitudine;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("altitude")
    private String altitude;
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
    public String getSampleId() {
        return sampleId;
    }

    /**
     * 
     * @param sampleId
     *     The sampleId
     */
    @JsonProperty("sampleId")
    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    /**
     * 
     * @return
     *     The sampleDate
     */
    @JsonProperty("sampleDate")
    public String getSampleDate() {
        return sampleDate;
    }

    /**
     * 
     * @param sampleDate
     *     The sampleDate
     */
    @JsonProperty("sampleDate")
    public void setSampleDate(String sampleDate) {
        this.sampleDate = sampleDate;
    }

    /**
     * 
     * @return
     *     The outSideTemperature
     */
    @JsonProperty("outSideTemperature")
    public Double getOutSideTemperature() {
        return outSideTemperature;
    }

    /**
     * 
     * @param outSideTemperature
     *     The outSideTemperature
     */
    @JsonProperty("outSideTemperature")
    public void setOutSideTemperature(Double outSideTemperature) {
        this.outSideTemperature = outSideTemperature;
    }

    /**
     * 
     * @return
     *     The maxTemperature
     */
    @JsonProperty("maxTemperature")
    public Double getMaxTemperature() {
        return maxTemperature;
    }

    /**
     * 
     * @param maxTemperature
     *     The maxTemperature
     */
    @JsonProperty("maxTemperature")
    public void setMaxTemperature(Double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    /**
     * 
     * @return
     *     The minTemperature
     */
    @JsonProperty("minTemperature")
    public Double getMinTemperature() {
        return minTemperature;
    }

    /**
     * 
     * @param minTemperature
     *     The minTemperature
     */
    @JsonProperty("minTemperature")
    public void setMinTemperature(Double minTemperature) {
        this.minTemperature = minTemperature;
    }

    /**
     * 
     * @return
     *     The unitOfMeasure
     */
    @JsonProperty("unitOfMeasure")
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 
     * @param unitOfMeasure
     *     The unitOfMeasure
     */
    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    /**
     * 
     * @return
     *     The longitudine
     */
    @JsonProperty("longitudine")
    public String getLongitudine() {
        return longitudine;
    }

    /**
     * 
     * @param longitudine
     *     The longitudine
     */
    @JsonProperty("longitudine")
    public void setLongitudine(String longitudine) {
        this.longitudine = longitudine;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The altitude
     */
    @JsonProperty("altitude")
    public String getAltitude() {
        return altitude;
    }

    /**
     * 
     * @param altitude
     *     The altitude
     */
    @JsonProperty("altitude")
    public void setAltitude(String altitude) {
        this.altitude = altitude;
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
