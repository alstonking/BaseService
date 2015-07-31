package com.xinnet.baseservice.entity;

import java.util.Date;

public class VirtualHostUpend {
    private Long id;

    private String serviceCode;

    private String goodsCode;

    private String productCode;

    private String goodsType;

    private String firstServiceCode;

    private String renewType;

    private String returnsType;

    private String upgradeType;

    private String tasteType;

    private String serviceState;

    private String domainName;

    private String userName;

    private String password;

    private String homeDir;

    private String siteType;

    private Long quotaSize;

    private String openMark;

    private Long loginCount;

    private String loginIp;

    private String agentCode;

    private Date serviceStartDate;

    private Date serviceEndDate;

    private Date modifyTime;

    private String setDns;

    private String setWeb;

    private String hostServerGroup;

    private String databaseGroup;

    private String dbType;

    private Integer dbSpaceSize;

    private String serviceType;

    private String messageDate;

    private String manualClose;

    private Short currentstatus;

    private String ftppass;

    private String dbpass;

    private Long usedwebspace;

    private Long totalwebspace;

    private String webserver;

    private String dbserver;

    private Short netversion;

    private Short serviceTypeHcp;

    private String icpLoopState;

    private String virtualhostId;

    private String oldDomainName;

    private Long datacenterCount;

    private Date serviceUpendDate;

    private String useState;

    private String virtualhostUuid;

    private String db2pass;

    private String dbUuid;

    private String db2Uuid;

    private String database2Group;

    private String db2Type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode == null ? null : serviceCode.trim();
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public String getFirstServiceCode() {
        return firstServiceCode;
    }

    public void setFirstServiceCode(String firstServiceCode) {
        this.firstServiceCode = firstServiceCode == null ? null : firstServiceCode.trim();
    }

    public String getRenewType() {
        return renewType;
    }

    public void setRenewType(String renewType) {
        this.renewType = renewType == null ? null : renewType.trim();
    }

    public String getReturnsType() {
        return returnsType;
    }

    public void setReturnsType(String returnsType) {
        this.returnsType = returnsType == null ? null : returnsType.trim();
    }

    public String getUpgradeType() {
        return upgradeType;
    }

    public void setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType == null ? null : upgradeType.trim();
    }

    public String getTasteType() {
        return tasteType;
    }

    public void setTasteType(String tasteType) {
        this.tasteType = tasteType == null ? null : tasteType.trim();
    }

    public String getServiceState() {
        return serviceState;
    }

    public void setServiceState(String serviceState) {
        this.serviceState = serviceState == null ? null : serviceState.trim();
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName == null ? null : domainName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getHomeDir() {
        return homeDir;
    }

    public void setHomeDir(String homeDir) {
        this.homeDir = homeDir == null ? null : homeDir.trim();
    }

    public String getSiteType() {
        return siteType;
    }

    public void setSiteType(String siteType) {
        this.siteType = siteType == null ? null : siteType.trim();
    }

    public Long getQuotaSize() {
        return quotaSize;
    }

    public void setQuotaSize(Long quotaSize) {
        this.quotaSize = quotaSize;
    }

    public String getOpenMark() {
        return openMark;
    }

    public void setOpenMark(String openMark) {
        this.openMark = openMark == null ? null : openMark.trim();
    }

    public Long getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Long loginCount) {
        this.loginCount = loginCount;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode == null ? null : agentCode.trim();
    }

    public Date getServiceStartDate() {
        return serviceStartDate;
    }

    public void setServiceStartDate(Date serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    public Date getServiceEndDate() {
        return serviceEndDate;
    }

    public void setServiceEndDate(Date serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getSetDns() {
        return setDns;
    }

    public void setSetDns(String setDns) {
        this.setDns = setDns == null ? null : setDns.trim();
    }

    public String getSetWeb() {
        return setWeb;
    }

    public void setSetWeb(String setWeb) {
        this.setWeb = setWeb == null ? null : setWeb.trim();
    }

    public String getHostServerGroup() {
        return hostServerGroup;
    }

    public void setHostServerGroup(String hostServerGroup) {
        this.hostServerGroup = hostServerGroup == null ? null : hostServerGroup.trim();
    }

    public String getDatabaseGroup() {
        return databaseGroup;
    }

    public void setDatabaseGroup(String databaseGroup) {
        this.databaseGroup = databaseGroup == null ? null : databaseGroup.trim();
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType == null ? null : dbType.trim();
    }

    public Integer getDbSpaceSize() {
        return dbSpaceSize;
    }

    public void setDbSpaceSize(Integer dbSpaceSize) {
        this.dbSpaceSize = dbSpaceSize;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public String getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate == null ? null : messageDate.trim();
    }

    public String getManualClose() {
        return manualClose;
    }

    public void setManualClose(String manualClose) {
        this.manualClose = manualClose == null ? null : manualClose.trim();
    }

    public Short getCurrentstatus() {
        return currentstatus;
    }

    public void setCurrentstatus(Short currentstatus) {
        this.currentstatus = currentstatus;
    }

    public String getFtppass() {
        return ftppass;
    }

    public void setFtppass(String ftppass) {
        this.ftppass = ftppass == null ? null : ftppass.trim();
    }

    public String getDbpass() {
        return dbpass;
    }

    public void setDbpass(String dbpass) {
        this.dbpass = dbpass == null ? null : dbpass.trim();
    }

    public Long getUsedwebspace() {
        return usedwebspace;
    }

    public void setUsedwebspace(Long usedwebspace) {
        this.usedwebspace = usedwebspace;
    }

    public Long getTotalwebspace() {
        return totalwebspace;
    }

    public void setTotalwebspace(Long totalwebspace) {
        this.totalwebspace = totalwebspace;
    }

    public String getWebserver() {
        return webserver;
    }

    public void setWebserver(String webserver) {
        this.webserver = webserver == null ? null : webserver.trim();
    }

    public String getDbserver() {
        return dbserver;
    }

    public void setDbserver(String dbserver) {
        this.dbserver = dbserver == null ? null : dbserver.trim();
    }

    public Short getNetversion() {
        return netversion;
    }

    public void setNetversion(Short netversion) {
        this.netversion = netversion;
    }

    public Short getServiceTypeHcp() {
        return serviceTypeHcp;
    }

    public void setServiceTypeHcp(Short serviceTypeHcp) {
        this.serviceTypeHcp = serviceTypeHcp;
    }

    public String getIcpLoopState() {
        return icpLoopState;
    }

    public void setIcpLoopState(String icpLoopState) {
        this.icpLoopState = icpLoopState == null ? null : icpLoopState.trim();
    }

    public String getVirtualhostId() {
        return virtualhostId;
    }

    public void setVirtualhostId(String virtualhostId) {
        this.virtualhostId = virtualhostId == null ? null : virtualhostId.trim();
    }

    public String getOldDomainName() {
        return oldDomainName;
    }

    public void setOldDomainName(String oldDomainName) {
        this.oldDomainName = oldDomainName == null ? null : oldDomainName.trim();
    }

    public Long getDatacenterCount() {
        return datacenterCount;
    }

    public void setDatacenterCount(Long datacenterCount) {
        this.datacenterCount = datacenterCount;
    }

    public Date getServiceUpendDate() {
        return serviceUpendDate;
    }

    public void setServiceUpendDate(Date serviceUpendDate) {
        this.serviceUpendDate = serviceUpendDate;
    }

    public String getUseState() {
        return useState;
    }

    public void setUseState(String useState) {
        this.useState = useState == null ? null : useState.trim();
    }

    public String getVirtualhostUuid() {
        return virtualhostUuid;
    }

    public void setVirtualhostUuid(String virtualhostUuid) {
        this.virtualhostUuid = virtualhostUuid == null ? null : virtualhostUuid.trim();
    }

    public String getDb2pass() {
        return db2pass;
    }

    public void setDb2pass(String db2pass) {
        this.db2pass = db2pass == null ? null : db2pass.trim();
    }

    public String getDbUuid() {
        return dbUuid;
    }

    public void setDbUuid(String dbUuid) {
        this.dbUuid = dbUuid == null ? null : dbUuid.trim();
    }

    public String getDb2Uuid() {
        return db2Uuid;
    }

    public void setDb2Uuid(String db2Uuid) {
        this.db2Uuid = db2Uuid == null ? null : db2Uuid.trim();
    }

    public String getDatabase2Group() {
        return database2Group;
    }

    public void setDatabase2Group(String database2Group) {
        this.database2Group = database2Group == null ? null : database2Group.trim();
    }

    public String getDb2Type() {
        return db2Type;
    }

    public void setDb2Type(String db2Type) {
        this.db2Type = db2Type == null ? null : db2Type.trim();
    }
}