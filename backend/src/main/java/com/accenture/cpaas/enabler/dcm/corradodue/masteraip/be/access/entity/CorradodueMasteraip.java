
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
public class CorradodueMasteraip {

    private String tripId;
    @XmlJavaTypeAdapter(com.accenture.cpaas.core.request.DateAdapter.class)
    private Date starts;
    @XmlJavaTypeAdapter(com.accenture.cpaas.core.request.DateAdapter.class)
    private Date ends;
    private String startLoc;
    private String endLoc;
    private Double dist;
    private String startMode;
    private String stopMode;
    private String unit;
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
     *     The tripId
     */
    public String getTripId() {
        return tripId;
    }

    /**
     * 
     * @param tripId
     *     The tripId
     */
    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    /**
     * 
     * @return
     *     The starts
     */
    public Date getStarts() {
        return starts;
    }

    /**
     * 
     * @param starts
     *     The starts
     */
    public void setStarts(Date starts) {
        this.starts = starts;
    }

    /**
     * 
     * @return
     *     The ends
     */
    public Date getEnds() {
        return ends;
    }

    /**
     * 
     * @param ends
     *     The ends
     */
    public void setEnds(Date ends) {
        this.ends = ends;
    }

    /**
     * 
     * @return
     *     The startLoc
     */
    public String getStartLoc() {
        return startLoc;
    }

    /**
     * 
     * @param startLoc
     *     The startLoc
     */
    public void setStartLoc(String startLoc) {
        this.startLoc = startLoc;
    }

    /**
     * 
     * @return
     *     The endLoc
     */
    public String getEndLoc() {
        return endLoc;
    }

    /**
     * 
     * @param endLoc
     *     The endLoc
     */
    public void setEndLoc(String endLoc) {
        this.endLoc = endLoc;
    }

    /**
     * 
     * @return
     *     The dist
     */
    public Double getDist() {
        return dist;
    }

    /**
     * 
     * @param dist
     *     The dist
     */
    public void setDist(Double dist) {
        this.dist = dist;
    }

    /**
     * 
     * @return
     *     The startMode
     */
    public String getStartMode() {
        return startMode;
    }

    /**
     * 
     * @param startMode
     *     The startMode
     */
    public void setStartMode(String startMode) {
        this.startMode = startMode;
    }

    /**
     * 
     * @return
     *     The stopMode
     */
    public String getStopMode() {
        return stopMode;
    }

    /**
     * 
     * @param stopMode
     *     The stopMode
     */
    public void setStopMode(String stopMode) {
        this.stopMode = stopMode;
    }

    /**
     * 
     * @return
     *     The unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 
     * @param unit
     *     The unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
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
