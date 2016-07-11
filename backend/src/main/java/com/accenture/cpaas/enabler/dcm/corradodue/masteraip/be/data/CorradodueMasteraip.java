
package com.accenture.cpaas.enabler.dcm.corradodue.masteraip.be.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.accenture.cpaas.enabler.dcm.common.data.Request;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonPropertyOrder({
    "tripId",
    "starts",
    "ends",
    "startLoc",
    "endLoc",
    "dist",
    "startMode",
    "stopMode",
    "unit",
    "sample",
    "userAction",
    "deviceDetail",
    "tenant",
    "enterprise",
    "date"
})
public class CorradodueMasteraip
    extends Request
{

    @JsonProperty("tripId")
    private String tripId;
    @XmlJavaTypeAdapter(com.accenture.cpaas.core.request.DateAdapter.class)
    @JsonProperty("starts")
    private Date starts;
    @XmlJavaTypeAdapter(com.accenture.cpaas.core.request.DateAdapter.class)
    @JsonProperty("ends")
    private Date ends;
    @JsonProperty("startLoc")
    private String startLoc;
    @JsonProperty("endLoc")
    private String endLoc;
    @JsonProperty("dist")
    private Double dist;
    @JsonProperty("startMode")
    private String startMode;
    @JsonProperty("stopMode")
    private String stopMode;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("sample")
    private List<Sample> sample = new ArrayList<Sample>();
    @JsonProperty("userAction")
    private UserAction userAction;
    @JsonProperty("deviceDetail")
    private DeviceDetail deviceDetail;
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
     *     The tripId
     */
    @JsonProperty("tripId")
    public String getTripId() {
        return tripId;
    }

    /**
     * 
     * @param tripId
     *     The tripId
     */
    @JsonProperty("tripId")
    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    /**
     * 
     * @return
     *     The starts
     */
    @JsonProperty("starts")
    public Date getStarts() {
        return starts;
    }

    /**
     * 
     * @param starts
     *     The starts
     */
    @JsonProperty("starts")
    public void setStarts(Date starts) {
        this.starts = starts;
    }

    /**
     * 
     * @return
     *     The ends
     */
    @JsonProperty("ends")
    public Date getEnds() {
        return ends;
    }

    /**
     * 
     * @param ends
     *     The ends
     */
    @JsonProperty("ends")
    public void setEnds(Date ends) {
        this.ends = ends;
    }

    /**
     * 
     * @return
     *     The startLoc
     */
    @JsonProperty("startLoc")
    public String getStartLoc() {
        return startLoc;
    }

    /**
     * 
     * @param startLoc
     *     The startLoc
     */
    @JsonProperty("startLoc")
    public void setStartLoc(String startLoc) {
        this.startLoc = startLoc;
    }

    /**
     * 
     * @return
     *     The endLoc
     */
    @JsonProperty("endLoc")
    public String getEndLoc() {
        return endLoc;
    }

    /**
     * 
     * @param endLoc
     *     The endLoc
     */
    @JsonProperty("endLoc")
    public void setEndLoc(String endLoc) {
        this.endLoc = endLoc;
    }

    /**
     * 
     * @return
     *     The dist
     */
    @JsonProperty("dist")
    public Double getDist() {
        return dist;
    }

    /**
     * 
     * @param dist
     *     The dist
     */
    @JsonProperty("dist")
    public void setDist(Double dist) {
        this.dist = dist;
    }

    /**
     * 
     * @return
     *     The startMode
     */
    @JsonProperty("startMode")
    public String getStartMode() {
        return startMode;
    }

    /**
     * 
     * @param startMode
     *     The startMode
     */
    @JsonProperty("startMode")
    public void setStartMode(String startMode) {
        this.startMode = startMode;
    }

    /**
     * 
     * @return
     *     The stopMode
     */
    @JsonProperty("stopMode")
    public String getStopMode() {
        return stopMode;
    }

    /**
     * 
     * @param stopMode
     *     The stopMode
     */
    @JsonProperty("stopMode")
    public void setStopMode(String stopMode) {
        this.stopMode = stopMode;
    }

    /**
     * 
     * @return
     *     The unit
     */
    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    /**
     * 
     * @param unit
     *     The unit
     */
    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 
     * @return
     *     The sample
     */
    @JsonProperty("sample")
    public List<Sample> getSample() {
        return sample;
    }

    /**
     * 
     * @param sample
     *     The sample
     */
    @JsonProperty("sample")
    public void setSample(List<Sample> sample) {
        this.sample = sample;
    }

    /**
     * 
     * @return
     *     The userAction
     */
    @JsonProperty("userAction")
    public UserAction getUserAction() {
        return userAction;
    }

    /**
     * 
     * @param userAction
     *     The userAction
     */
    @JsonProperty("userAction")
    public void setUserAction(UserAction userAction) {
        this.userAction = userAction;
    }

    /**
     * 
     * @return
     *     The deviceDetail
     */
    @JsonProperty("deviceDetail")
    public DeviceDetail getDeviceDetail() {
        return deviceDetail;
    }

    /**
     * 
     * @param deviceDetail
     *     The deviceDetail
     */
    @JsonProperty("deviceDetail")
    public void setDeviceDetail(DeviceDetail deviceDetail) {
        this.deviceDetail = deviceDetail;
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
