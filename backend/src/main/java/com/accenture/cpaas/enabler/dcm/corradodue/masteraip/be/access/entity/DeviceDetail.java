
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
public class DeviceDetail {

    private String os;
    private String phBrand;
    private String blStart;
    private String blStop;
    private String osVersion;
    private String appVersion;
    private String id;
    private String deviceId;
    private String deviceType;
    private Integer idTenant;
    private Integer idEnterprise;
    @XmlJavaTypeAdapter(com.accenture.cpaas.core.request.DateAdapter.class)
    private Date systemDate;
    @XmlJavaTypeAdapter(com.accenture.cpaas.core.request.DateAdapter.class)
    private Date deviceDate;
    private String fkCorradodueMasteraip;

    /**
     * 
     * @return
     *     The os
     */
    public String getOs() {
        return os;
    }

    /**
     * 
     * @param os
     *     The os
     */
    public void setOs(String os) {
        this.os = os;
    }

    /**
     * 
     * @return
     *     The phBrand
     */
    public String getPhBrand() {
        return phBrand;
    }

    /**
     * 
     * @param phBrand
     *     The phBrand
     */
    public void setPhBrand(String phBrand) {
        this.phBrand = phBrand;
    }

    /**
     * 
     * @return
     *     The blStart
     */
    public String getBlStart() {
        return blStart;
    }

    /**
     * 
     * @param blStart
     *     The blStart
     */
    public void setBlStart(String blStart) {
        this.blStart = blStart;
    }

    /**
     * 
     * @return
     *     The blStop
     */
    public String getBlStop() {
        return blStop;
    }

    /**
     * 
     * @param blStop
     *     The blStop
     */
    public void setBlStop(String blStop) {
        this.blStop = blStop;
    }

    /**
     * 
     * @return
     *     The osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * 
     * @param osVersion
     *     The osVersion
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * 
     * @return
     *     The appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * 
     * @param appVersion
     *     The appVersion
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
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
     *     The fkCorradodueMasteraip
     */
    public String getFkCorradodueMasteraip() {
        return fkCorradodueMasteraip;
    }

    /**
     * 
     * @param fkCorradodueMasteraip
     *     The fk_corradodue_masteraip
     */
    public void setFkCorradodueMasteraip(String fkCorradodueMasteraip) {
        this.fkCorradodueMasteraip = fkCorradodueMasteraip;
    }

}
