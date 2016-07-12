
package com.accenture.cpaas.enabler.dcm.corradodue.masteraip.be.data;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonPropertyOrder({
    "events",
    "dateVal",
    "lon",
    "lat"
})
public class EventList {

    @JsonProperty("events")
    private String events;
    @JsonProperty("dateVal")
    private String dateVal;
    @JsonProperty("lon")
    private Double lon;
    @JsonProperty("lat")
    private Double lat;

    /**
     * 
     * @return
     *     The events
     */
    @JsonProperty("events")
    public String getEvents() {
        return events;
    }

    /**
     * 
     * @param events
     *     The events
     */
    @JsonProperty("events")
    public void setEvents(String events) {
        this.events = events;
    }

    /**
     * 
     * @return
     *     The dateVal
     */
    @JsonProperty("dateVal")
    public String getDateVal() {
        return dateVal;
    }

    /**
     * 
     * @param dateVal
     *     The dateVal
     */
    @JsonProperty("dateVal")
    public void setDateVal(String dateVal) {
        this.dateVal = dateVal;
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

}
