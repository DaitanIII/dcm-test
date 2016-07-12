
package com.accenture.cpaas.enabler.dcm.corradodue.masteraip.be.access.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EventList {

    private String events;
    private String dateVal;
    private Double lon;
    private Double lat;
    private String id;
    private String deviceId;
    private String deviceType;
    private Integer idTenant;
    private Integer idEnterprise;
    @XmlJavaTypeAdapter(com.accenture.cpaas.core.request.DateAdapter.class)
    private Date systemDate;
    @XmlJavaTypeAdapter(com.accenture.cpaas.core.request.DateAdapter.class)
    private Date deviceDate;
    private String fkCorradodueMasteraipUseraction;

    /**
     * 
     * @return
     *     The events
     */
    public String getEvents() {
        return events;
    }

    /**
     * 
     * @param events
     *     The events
     */
    public void setEvents(String events) {
        this.events = events;
    }

    /**
     * 
     * @return
     *     The dateVal
     */
    public String getDateVal() {
        return dateVal;
    }

    /**
     * 
     * @param dateVal
     *     The dateVal
     */
    public void setDateVal(String dateVal) {
        this.dateVal = dateVal;
    }

    /**
     * 
     * @return
     *     The lon
     */
    public Double getLon() {
        return lon;
    }

    /**
     * 
     * @param lon
     *     The lon
     */
    public void setLon(Double lon) {
        this.lon = lon;
    }

    /**
     * 
     * @return
     *     The lat
     */
    public Double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(Double lat) {
        this.lat = lat;
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

    /**
     * 
     * @return
     *     The fkCorradodueMasteraipUseraction
     */
    public String getFkCorradodueMasteraipUseraction() {
        return fkCorradodueMasteraipUseraction;
    }

    /**
     * 
     * @param fkCorradodueMasteraipUseraction
     *     The fk_corradodue_masteraip_useraction
     */
    public void setFkCorradodueMasteraipUseraction(String fkCorradodueMasteraipUseraction) {
        this.fkCorradodueMasteraipUseraction = fkCorradodueMasteraipUseraction;
    }

}
