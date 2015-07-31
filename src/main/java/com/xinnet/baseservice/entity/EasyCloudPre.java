package com.xinnet.baseservice.entity;

import java.util.Date;

public class EasyCloudPre {
    private Long id;

    private String serviceCode;

    private String goodsCode;

    private String productCode;

    private String goodsType;

    private String serviceState;

    private Integer timeAmount;

    private String timeUnit;

    private Date serviceActiveLimit;

    private Date serviceBuyTime;

    private String agentCode;

    private Date modifyTime;

    private Integer dbSpaceSize;

    private String serviceType;

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

    public String getServiceState() {
        return serviceState;
    }

    public void setServiceState(String serviceState) {
        this.serviceState = serviceState == null ? null : serviceState.trim();
    }

    public Integer getTimeAmount() {
        return timeAmount;
    }

    public void setTimeAmount(Integer timeAmount) {
        this.timeAmount = timeAmount;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit == null ? null : timeUnit.trim();
    }

    public Date getServiceActiveLimit() {
        return serviceActiveLimit;
    }

    public void setServiceActiveLimit(Date serviceActiveLimit) {
        this.serviceActiveLimit = serviceActiveLimit;
    }

    public Date getServiceBuyTime() {
        return serviceBuyTime;
    }

    public void setServiceBuyTime(Date serviceBuyTime) {
        this.serviceBuyTime = serviceBuyTime;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode == null ? null : agentCode.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
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
}