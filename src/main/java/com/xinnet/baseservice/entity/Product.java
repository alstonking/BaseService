package com.xinnet.baseservice.entity;

import java.math.BigDecimal;

public class Product {
    private Long id;

    private String productCode;

    private String productName;

    private String productClass;

    private String state;

    private String description;

    private Integer maxlife;

    private Integer renewLimit;

    private String subProduct;

    private String domainType;

    private Integer maxSpaceSize;

    private Integer spaceSize;

    private Integer userAmount;

    private Integer openLimit;

    private Integer repayLimit;

    private String isNeedIntervention;

    private Integer dbSpaceSize;

    private Integer mailAmount;

    private String dbType;

    private String serviceType;

    private Integer domainAmount;

    private Integer streamSize;

    private Integer goodsAmount;

    private Integer newsAmount;

    private Integer themeGrade;

    private Integer xinnetCoin;

    private BigDecimal historyTemplateAmount;

    private String language;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductClass() {
        return productClass;
    }

    public void setProductClass(String productClass) {
        this.productClass = productClass == null ? null : productClass.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getMaxlife() {
        return maxlife;
    }

    public void setMaxlife(Integer maxlife) {
        this.maxlife = maxlife;
    }

    public Integer getRenewLimit() {
        return renewLimit;
    }

    public void setRenewLimit(Integer renewLimit) {
        this.renewLimit = renewLimit;
    }

    public String getSubProduct() {
        return subProduct;
    }

    public void setSubProduct(String subProduct) {
        this.subProduct = subProduct == null ? null : subProduct.trim();
    }

    public String getDomainType() {
        return domainType;
    }

    public void setDomainType(String domainType) {
        this.domainType = domainType == null ? null : domainType.trim();
    }

    public Integer getMaxSpaceSize() {
        return maxSpaceSize;
    }

    public void setMaxSpaceSize(Integer maxSpaceSize) {
        this.maxSpaceSize = maxSpaceSize;
    }

    public Integer getSpaceSize() {
        return spaceSize;
    }

    public void setSpaceSize(Integer spaceSize) {
        this.spaceSize = spaceSize;
    }

    public Integer getUserAmount() {
        return userAmount;
    }

    public void setUserAmount(Integer userAmount) {
        this.userAmount = userAmount;
    }

    public Integer getOpenLimit() {
        return openLimit;
    }

    public void setOpenLimit(Integer openLimit) {
        this.openLimit = openLimit;
    }

    public Integer getRepayLimit() {
        return repayLimit;
    }

    public void setRepayLimit(Integer repayLimit) {
        this.repayLimit = repayLimit;
    }

    public String getIsNeedIntervention() {
        return isNeedIntervention;
    }

    public void setIsNeedIntervention(String isNeedIntervention) {
        this.isNeedIntervention = isNeedIntervention == null ? null : isNeedIntervention.trim();
    }

    public Integer getDbSpaceSize() {
        return dbSpaceSize;
    }

    public void setDbSpaceSize(Integer dbSpaceSize) {
        this.dbSpaceSize = dbSpaceSize;
    }

    public Integer getMailAmount() {
        return mailAmount;
    }

    public void setMailAmount(Integer mailAmount) {
        this.mailAmount = mailAmount;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType == null ? null : dbType.trim();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public Integer getDomainAmount() {
        return domainAmount;
    }

    public void setDomainAmount(Integer domainAmount) {
        this.domainAmount = domainAmount;
    }

    public Integer getStreamSize() {
        return streamSize;
    }

    public void setStreamSize(Integer streamSize) {
        this.streamSize = streamSize;
    }

    public Integer getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Integer goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public Integer getNewsAmount() {
        return newsAmount;
    }

    public void setNewsAmount(Integer newsAmount) {
        this.newsAmount = newsAmount;
    }

    public Integer getThemeGrade() {
        return themeGrade;
    }

    public void setThemeGrade(Integer themeGrade) {
        this.themeGrade = themeGrade;
    }

    public Integer getXinnetCoin() {
        return xinnetCoin;
    }

    public void setXinnetCoin(Integer xinnetCoin) {
        this.xinnetCoin = xinnetCoin;
    }

    public BigDecimal getHistoryTemplateAmount() {
        return historyTemplateAmount;
    }

    public void setHistoryTemplateAmount(BigDecimal historyTemplateAmount) {
        this.historyTemplateAmount = historyTemplateAmount;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }
}