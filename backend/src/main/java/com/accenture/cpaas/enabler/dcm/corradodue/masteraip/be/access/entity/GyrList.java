
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
public class GyrList {

    private Double gyrX;
    private Double gyrY;
    private Double gyrZ;
    private Double gyrMs;
    private String gyrId;
    private String id;
    private String deviceId;
    private String deviceType;
    private Integer idTenant;
    private Integer idEnterprise;
    @XmlJavaTypeAdapter(com.accenture.cpaas.core.request.DateAdapter.class)
    private Date systemDate;
    @XmlJavaTypeAdapter(com.accenture.cpaas.core.request.DateAdapter.class)
    private Date deviceDate;
    private String fkCorradodueMasteraipSample;

    /**
     * 
     * @return
     *     The gyrX
     */
    public Double getGyrX() {
        return gyrX;
    }

    /**
     * 
     * @param gyrX
     *     The gyrX
     */
    public void setGyrX(Double gyrX) {
        this.gyrX = gyrX;
    }

    /**
     * 
     * @return
     *     The gyrY
     */
    public Double getGyrY() {
        return gyrY;
    }

    /**
     * 
     * @param gyrY
     *     The gyrY
     */
    public void setGyrY(Double gyrY) {
        this.gyrY = gyrY;
    }

    /**
     * 
     * @return
     *     The gyrZ
     */
    public Double getGyrZ() {
        return gyrZ;
    }

    /**
     * 
     * @param gyrZ
     *     The gyrZ
     */
    public void setGyrZ(Double gyrZ) {
        this.gyrZ = gyrZ;
    }

    /**
     * 
     * @return
     *     The gyrMs
     */
    public Double getGyrMs() {
        return gyrMs;
    }

    /**
     * 
     * @param gyrMs
     *     The gyrMs
     */
    public void setGyrMs(Double gyrMs) {
        this.gyrMs = gyrMs;
    }

    /**
     * 
     * @return
     *     The gyrId
     */
    public String getGyrId() {
        return gyrId;
    }

    /**
     * 
     * @param gyrId
     *     The gyrId
     */
    public void setGyrId(String gyrId) {
        this.gyrId = gyrId;
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
     *     The fkCorradodueMasteraipSample
     */
    public String getFkCorradodueMasteraipSample() {
        return fkCorradodueMasteraipSample;
    }

    /**
     * 
     * @param fkCorradodueMasteraipSample
     *     The fk_corradodue_masteraip_sample
     */
    public void setFkCorradodueMasteraipSample(String fkCorradodueMasteraipSample) {
        this.fkCorradodueMasteraipSample = fkCorradodueMasteraipSample;
    }

}
