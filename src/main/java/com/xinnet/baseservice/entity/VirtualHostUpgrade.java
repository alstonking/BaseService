package com.xinnet.baseservice.entity;

import java.util.Date;

public class VirtualHostUpgrade {
    private Long id;

    private String newServiceCode;

    private String oldServiceCode;

    private String domainName;

    private String oldProductCode;

    private String newProductCode;

    private String newGoodsCode;

    private String oldGoodsCode;

    private String state;

    private Integer timeAmount;

    private String timeUnit;

    private Date beginTime;

    private Integer operateNum;

    private String virtualhostId;

    private String dbType;

    private String newPassword;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNewServiceCode() {
        return newServiceCode;
    }

    public void setNewServiceCode(String newServiceCode) {
        this.newServiceCode = newServiceCode == null ? null : newServiceCode.trim();
    }

    public String getOldServiceCode() {
        return oldServiceCode;
    }

    public void setOldServiceCode(String oldServiceCode) {
        this.oldServiceCode = oldServiceCode == null ? null : oldServiceCode.trim();
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName == null ? null : domainName.trim();
    }

    public String getOldProductCode() {
        return oldProductCode;
    }

    public void setOldProductCode(String oldProductCode) {
        this.oldProductCode = oldProductCode == null ? null : oldProductCode.trim();
    }

    public String getNewProductCode() {
        return newProductCode;
    }

    public void setNewProductCode(String newProductCode) {
        this.newProductCode = newProductCode == null ? null : newProductCode.trim();
    }

    public String getNewGoodsCode() {
        return newGoodsCode;
    }

    public void setNewGoodsCode(String newGoodsCode) {
        this.newGoodsCode = newGoodsCode == null ? null : newGoodsCode.trim();
    }

    public String getOldGoodsCode() {
        return oldGoodsCode;
    }

    public void setOldGoodsCode(String oldGoodsCode) {
        this.oldGoodsCode = oldGoodsCode == null ? null : oldGoodsCode.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getOperateNum() {
        return operateNum;
    }

    public void setOperateNum(Integer operateNum) {
        this.operateNum = operateNum;
    }

    public String getVirtualhostId() {
        return virtualhostId;
    }

    public void setVirtualhostId(String virtualhostId) {
        this.virtualhostId = virtualhostId == null ? null : virtualhostId.trim();
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType == null ? null : dbType.trim();
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword == null ? null : newPassword.trim();
    }
}