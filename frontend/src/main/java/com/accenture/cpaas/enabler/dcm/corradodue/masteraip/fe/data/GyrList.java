
package com.accenture.cpaas.enabler.dcm.corradodue.masteraip.fe.data;

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
    "gyrX",
    "gyrY",
    "gyrZ",
    "gyrMs",
    "gyrId"
})
public class GyrList {

    @JsonProperty("gyrX")
    private Double gyrX;
    @JsonProperty("gyrY")
    private Double gyrY;
    @JsonProperty("gyrZ")
    private Double gyrZ;
    @JsonProperty("gyrMs")
    private Double gyrMs;
    @JsonProperty("gyrId")
    private String gyrId;

    /**
     * 
     * @return
     *     The gyrX
     */
    @JsonProperty("gyrX")
    public Double getGyrX() {
        return gyrX;
    }

    /**
     * 
     * @param gyrX
     *     The gyrX
     */
    @JsonProperty("gyrX")
    public void setGyrX(Double gyrX) {
        this.gyrX = gyrX;
    }

    /**
     * 
     * @return
     *     The gyrY
     */
    @JsonProperty("gyrY")
    public Double getGyrY() {
        return gyrY;
    }

    /**
     * 
     * @param gyrY
     *     The gyrY
     */
    @JsonProperty("gyrY")
    public void setGyrY(Double gyrY) {
        this.gyrY = gyrY;
    }

    /**
     * 
     * @return
     *     The gyrZ
     */
    @JsonProperty("gyrZ")
    public Double getGyrZ() {
        return gyrZ;
    }

    /**
     * 
     * @param gyrZ
     *     The gyrZ
     */
    @JsonProperty("gyrZ")
    public void setGyrZ(Double gyrZ) {
        this.gyrZ = gyrZ;
    }

    /**
     * 
     * @return
     *     The gyrMs
     */
    @JsonProperty("gyrMs")
    public Double getGyrMs() {
        return gyrMs;
    }

    /**
     * 
     * @param gyrMs
     *     The gyrMs
     */
    @JsonProperty("gyrMs")
    public void setGyrMs(Double gyrMs) {
        this.gyrMs = gyrMs;
    }

    /**
     * 
     * @return
     *     The gyrId
     */
    @JsonProperty("gyrId")
    public String getGyrId() {
        return gyrId;
    }

    /**
     * 
     * @param gyrId
     *     The gyrId
     */
    @JsonProperty("gyrId")
    public void setGyrId(String gyrId) {
        this.gyrId = gyrId;
    }

}
