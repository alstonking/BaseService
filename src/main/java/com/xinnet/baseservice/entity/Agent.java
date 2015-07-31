package com.xinnet.baseservice.entity;

import java.util.Date;

public class Agent {
    private Long id;

    private String agentCode;

    private String userName;

    private String password;

    private String agentLevelCode;

    private Date applyDate;

    private Date startDate;

    private String admUserCode;

    private String ceoUserCode;

    private String feeUserCode;

    private String nsHandle;

    private String ns2Handle;

    private String organCode;

    private String state;

    private String refuseReason;

    private String organizeNameCn;

    private String ns3Handle;

    private String ns4Handle;

    private Date firstStartDate;

    private String invoiceUserCode;

    private Date iucUpdateDate;

    private String isTokenLogin;

    private String verification;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode == null ? null : agentCode.trim();
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

    public String getAgentLevelCode() {
        return agentLevelCode;
    }

    public void setAgentLevelCode(String agentLevelCode) {
        this.agentLevelCode = agentLevelCode == null ? null : agentLevelCode.trim();
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getAdmUserCode() {
        return admUserCode;
    }

    public void setAdmUserCode(String admUserCode) {
        this.admUserCode = admUserCode == null ? null : admUserCode.trim();
    }

    public String getCeoUserCode() {
        return ceoUserCode;
    }

    public void setCeoUserCode(String ceoUserCode) {
        this.ceoUserCode = ceoUserCode == null ? null : ceoUserCode.trim();
    }

    public String getFeeUserCode() {
        return feeUserCode;
    }

    public void setFeeUserCode(String feeUserCode) {
        this.feeUserCode = feeUserCode == null ? null : feeUserCode.trim();
    }

    public String getNsHandle() {
        return nsHandle;
    }

    public void setNsHandle(String nsHandle) {
        this.nsHandle = nsHandle == null ? null : nsHandle.trim();
    }

    public String getNs2Handle() {
        return ns2Handle;
    }

    public void setNs2Handle(String ns2Handle) {
        this.ns2Handle = ns2Handle == null ? null : ns2Handle.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason == null ? null : refuseReason.trim();
    }

    public String getOrganizeNameCn() {
        return organizeNameCn;
    }

    public void setOrganizeNameCn(String organizeNameCn) {
        this.organizeNameCn = organizeNameCn == null ? null : organizeNameCn.trim();
    }

    public String getNs3Handle() {
        return ns3Handle;
    }

    public void setNs3Handle(String ns3Handle) {
        this.ns3Handle = ns3Handle == null ? null : ns3Handle.trim();
    }

    public String getNs4Handle() {
        return ns4Handle;
    }

    public void setNs4Handle(String ns4Handle) {
        this.ns4Handle = ns4Handle == null ? null : ns4Handle.trim();
    }

    public Date getFirstStartDate() {
        return firstStartDate;
    }

    public void setFirstStartDate(Date firstStartDate) {
        this.firstStartDate = firstStartDate;
    }

    public String getInvoiceUserCode() {
        return invoiceUserCode;
    }

    public void setInvoiceUserCode(String invoiceUserCode) {
        this.invoiceUserCode = invoiceUserCode == null ? null : invoiceUserCode.trim();
    }

    public Date getIucUpdateDate() {
        return iucUpdateDate;
    }

    public void setIucUpdateDate(Date iucUpdateDate) {
        this.iucUpdateDate = iucUpdateDate;
    }

    public String getIsTokenLogin() {
        return isTokenLogin;
    }

    public void setIsTokenLogin(String isTokenLogin) {
        this.isTokenLogin = isTokenLogin == null ? null : isTokenLogin.trim();
    }

    public String getVerification() {
        return verification;
    }

    public void setVerification(String verification) {
        this.verification = verification == null ? null : verification.trim();
    }
}