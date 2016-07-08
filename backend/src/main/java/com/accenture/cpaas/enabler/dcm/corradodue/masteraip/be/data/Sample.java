
package com.accenture.cpaas.enabler.dcm.corradodue.masteraip.be.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonPropertyOrder({
    "speed",
    "alt",
    "dist",
    "date",
    "lon",
    "lat",
    "event",
    "accuracy",
    "accListtwo",
    "gyrList"
})
public class Sample {

    @JsonProperty("speed")
    private Double speed;
    @JsonProperty("alt")
    private Double alt;
    @JsonProperty("dist")
    private Double dist;
    @XmlJavaTypeAdapter(com.accenture.cpaas.core.request.DateAdapter.class)
    @JsonProperty("date")
    private Date date;
    @JsonProperty("lon")
    private Double lon;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("event")
    private String event;
    @JsonProperty("accuracy")
    private Integer accuracy;
    @JsonProperty("accListtwo")
    private List<AccListtwo> accListtwo = new ArrayList<AccListtwo>();
    @JsonProperty("gyrList")
    private List<GyrList> gyrList = new ArrayList<GyrList>();

    /**
     * 
     * @return
     *     The speed
     */
    @JsonProperty("speed")
    public Double getSpeed() {
        return speed;
    }

    /**
     * 
     * @param speed
     *     The speed
     */
    @JsonProperty("speed")
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    /**
     * 
     * @return
     *     The alt
     */
    @JsonProperty("alt")
    public Double getAlt() {
        return alt;
    }

    /**
     * 
     * @param alt
     *     The alt
     */
    @JsonProperty("alt")
    public void setAlt(Double alt) {
        this.alt = alt;
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

    /**
     * 
     * @return
     *     The lon
     */
    @JsonProperty("lon")
    public Double getLon() {
        return lon;
    }

    /**
     * 
     * @param lon
     *     The lon
     */
    @JsonProperty("lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }

    /**
     * 
     * @return
     *     The lat
     */
    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * 
     * @return
     *     The event
     */
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    /**
     * 
     * @param event
     *     The event
     */
    @JsonProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * 
     * @return
     *     The accuracy
     */
    @JsonProperty("accuracy")
    public Integer getAccuracy() {
        return accuracy;
    }

    /**
     * 
     * @param accuracy
     *     The accuracy
     */
    @JsonProperty("accuracy")
    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * 
     * @return
     *     The accListtwo
     */
    @JsonProperty("accListtwo")
    public List<AccListtwo> getAccListtwo() {
        return accListtwo;
    }

    /**
     * 
     * @param accListtwo
     *     The accListtwo
     */
    @JsonProperty("accListtwo")
    public void setAccListtwo(List<AccListtwo> accListtwo) {
        this.accListtwo = accListtwo;
    }

    /**
     * 
     * @return
     *     The gyrList
     */
    @JsonProperty("gyrList")
    public List<GyrList> getGyrList() {
        return gyrList;
    }

    /**
     * 
     * @param gyrList
     *     The gyrList
     */
    @JsonProperty("gyrList")
    public void setGyrList(List<GyrList> gyrList) {
        this.gyrList = gyrList;
    }

}
