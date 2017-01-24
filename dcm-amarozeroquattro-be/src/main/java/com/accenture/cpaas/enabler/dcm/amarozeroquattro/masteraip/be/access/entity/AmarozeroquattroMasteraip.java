
package com.accenture.cpaas.enabler.dcm.amarozeroquattro.masteraip.be.access.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * Weather station
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AmarozeroquattroMasteraip {

    private String sampleId;
    private String sampleDate;
    private Double outSideTemperature;
    private Double maxTemperature;
    private Double minTemperature;
    private String unitOfMeasure;
    private String longitudine;
    private String latitude;
    private String altitude;
    private String id;
    private String deviceId;
    private String deviceType;
    private Integer idTenant;
    private Integer idEnterprise;
    @XmlJavaTypeAdapter(com.accenture.cpaas.core.request.DateAdapter.class)
    private Date systemDate;
    @XmlJavaTypeAdapter(com.accenture.cpaas.core.request.DateAdapter.class)
    private Date deviceDate;

    /**
     * 
     * @return
     *     The sampleId
     */
    public String getSampleId() {
        return sampleId;
    }

    /**
     * 
     * @param sampleId
     *     The sampleId
     */
    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    /**
     * 
     * @return
     *     The sampleDate
     */
    public String getSampleDate() {
        return sampleDate;
    }

    /**
     * 
     * @param sampleDate
     *     The sampleDate
     */
    public void setSampleDate(String sampleDate) {
        this.sampleDate = sampleDate;
    }

    /**
     * 
     * @return
     *     The outSideTemperature
     */
    public Double getOutSideTemperature() {
        return outSideTemperature;
    }

    /**
     * 
     * @param outSideTemperature
     *     The outSideTemperature
     */
    public void setOutSideTemperature(Double outSideTemperature) {
        this.outSideTemperature = outSideTemperature;
    }

    /**
     * 
     * @return
     *     The maxTemperature
     */
    public Double getMaxTemperature() {
        return maxTemperature;
    }

    /**
     * 
     * @param maxTemperature
     *     The maxTemperature
     */
    public void setMaxTemperature(Double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    /**
     * 
     * @return
     *     The minTemperature
     */
    public Double getMinTemperature() {
        return minTemperature;
    }

    /**
     * 
     * @param minTemperature
     *     The minTemperature
     */
    public void setMinTemperature(Double minTemperature) {
        this.minTemperature = minTemperature;
    }

    /**
     * 
     * @return
     *     The unitOfMeasure
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 
     * @param unitOfMeasure
     *     The unitOfMeasure
     */
    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    /**
     * 
     * @return
     *     The longitudine
     */
    public String getLongitudine() {
        return longitudine;
    }

    /**
     * 
     * @param longitudine
     *     The longitudine
     */
    public void setLongitudine(String longitudine) {
        this.longitudine = longitudine;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The altitude
     */
    public String getAltitude() {
        return altitude;
    }

    /**
     * 
     * @param altitude
     *     The altitude
     */
    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 
     * @param deviceId
     *     The device_id
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 
     * @return
     *     The deviceType
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * 
     * @param deviceType
     *     The device_type
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 
     * @return
     *     The idTenant
     */
    public Integer getIdTenant() {
        return idTenant;
    }

    /**
     * 
     * @param idTenant
     *     The id_tenant
     */
    public void setIdTenant(Integer idTenant) {
        this.idTenant = idTenant;
    }

    /**
     * 
     * @return
     *     The idEnterprise
     */
    public Integer getIdEnterprise() {
        return idEnterprise;
    }

    /**
     * 
     * @param idEnterprise
     *     The id_enterprise
     */
    public void setIdEnterprise(Integer idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    /**
     * 
     * @return
     *     The systemDate
     */
    public Date getSystemDate() {
        return systemDate;
    }

    /**
     * 
     * @param systemDate
     *     The system_date
     */
    public void setSystemDate(Date systemDate) {
        this.systemDate = systemDate;
    }

    /**
     * 
     * @return
     *     The deviceDate
     */
    public Date getDeviceDate() {
        return deviceDate;
    }

    /**
     * 
     * @param deviceDate
     *     The device_date
     */
    public void setDeviceDate(Date deviceDate) {
        this.deviceDate = deviceDate;
    }

}
