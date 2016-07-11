
package com.accenture.cpaas.enabler.dcm.corradodue.masteraip.be.data;

import java.util.ArrayList;
import java.util.List;
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
    "eventList"
})
public class UserAction {

    @JsonProperty("eventList")
    private List<EventList> eventList = new ArrayList<EventList>();

    /**
     * 
     * @return
     *     The eventList
     */
    @JsonProperty("eventList")
    public List<EventList> getEventList() {
        return eventList;
    }

    /**
     * 
     * @param eventList
     *     The eventList
     */
    @JsonProperty("eventList")
    public void setEventList(List<EventList> eventList) {
        this.eventList = eventList;
    }

}
