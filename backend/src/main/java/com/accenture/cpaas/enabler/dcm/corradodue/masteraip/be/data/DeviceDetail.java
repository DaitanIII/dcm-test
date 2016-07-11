
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
    "os",
    "phBrand",
    "blStart",
    "blStop",
    "osVersion",
    "appVersion"
})
public class DeviceDetail {

    @JsonProperty("os")
    private String os;
    @JsonProperty("phBrand")
    private String phBrand;
    @JsonProperty("blStart")
    private String blStart;
    @JsonProperty("blStop")
    private String blStop;
    @JsonProperty("osVersion")
    private String osVersion;
    @JsonProperty("appVersion")
    private String appVersion;

    /**
     * 
     * @return
     *     The os
     */
    @JsonProperty("os")
    public String getOs() {
        return os;
    }

    /**
     * 
     * @param os
     *     The os
     */
    @JsonProperty("os")
    public void setOs(String os) {
        this.os = os;
    }

    /**
     * 
     * @return
     *     The phBrand
     */
    @JsonProperty("phBrand")
    public String getPhBrand() {
        return phBrand;
    }

    /**
     * 
     * @param phBrand
     *     The phBrand
     */
    @JsonProperty("phBrand")
    public void setPhBrand(String phBrand) {
        this.phBrand = phBrand;
    }

    /**
     * 
     * @return
     *     The blStart
     */
    @JsonProperty("blStart")
    public String getBlStart() {
        return blStart;
    }

    /**
     * 
     * @param blStart
     *     The blStart
     */
    @JsonProperty("blStart")
    public void setBlStart(String blStart) {
        this.blStart = blStart;
    }

    /**
     * 
     * @return
     *     The blStop
     */
    @JsonProperty("blStop")
    public String getBlStop() {
        return blStop;
    }

    /**
     * 
     * @param blStop
     *     The blStop
     */
    @JsonProperty("blStop")
    public void setBlStop(String blStop) {
        this.blStop = blStop;
    }

    /**
     * 
     * @return
     *     The osVersion
     */
    @JsonProperty("osVersion")
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * 
     * @param osVersion
     *     The osVersion
     */
    @JsonProperty("osVersion")
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * 
     * @return
     *     The appVersion
     */
    @JsonProperty("appVersion")
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * 
     * @param appVersion
     *     The appVersion
     */
    @JsonProperty("appVersion")
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

}
