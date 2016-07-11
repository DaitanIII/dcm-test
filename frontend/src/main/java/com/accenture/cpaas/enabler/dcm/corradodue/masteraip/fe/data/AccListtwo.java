
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
    "x",
    "y",
    "z",
    "ms",
    "accid"
})
public class AccListtwo {

    @JsonProperty("x")
    private Double x;
    @JsonProperty("y")
    private Double y;
    @JsonProperty("z")
    private Double z;
    @JsonProperty("ms")
    private Double ms;
    @JsonProperty("accid")
    private String accid;

    /**
     * 
     * @return
     *     The x
     */
    @JsonProperty("x")
    public Double getX() {
        return x;
    }

    /**
     * 
     * @param x
     *     The x
     */
    @JsonProperty("x")
    public void setX(Double x) {
        this.x = x;
    }

    /**
     * 
     * @return
     *     The y
     */
    @JsonProperty("y")
    public Double getY() {
        return y;
    }

    /**
     * 
     * @param y
     *     The y
     */
    @JsonProperty("y")
    public void setY(Double y) {
        this.y = y;
    }

    /**
     * 
     * @return
     *     The z
     */
    @JsonProperty("z")
    public Double getZ() {
        return z;
    }

    /**
     * 
     * @param z
     *     The z
     */
    @JsonProperty("z")
    public void setZ(Double z) {
        this.z = z;
    }

    /**
     * 
     * @return
     *     The ms
     */
    @JsonProperty("ms")
    public Double getMs() {
        return ms;
    }

    /**
     * 
     * @param ms
     *     The ms
     */
    @JsonProperty("ms")
    public void setMs(Double ms) {
        this.ms = ms;
    }

    /**
     * 
     * @return
     *     The accid
     */
    @JsonProperty("accid")
    public String getAccid() {
        return accid;
    }

    /**
     * 
     * @param accid
     *     The accid
     */
    @JsonProperty("accid")
    public void setAccid(String accid) {
        this.accid = accid;
    }

}
