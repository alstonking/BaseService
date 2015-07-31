package com.xinnet.baseservice.entity;

public class ProductClass {
    private Long id;

    private String productClassCode;

    private String productClassName;

    private String description;

    private String superProductClassCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductClassCode() {
        return productClassCode;
    }

    public void setProductClassCode(String productClassCode) {
        this.productClassCode = productClassCode == null ? null : productClassCode.trim();
    }

    public String getProductClassName() {
        return productClassName;
    }

    public void setProductClassName(String productClassName) {
        this.productClassName = productClassName == null ? null : productClassName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getSuperProductClassCode() {
        return superProductClassCode;
    }

    public void setSuperProductClassCode(String superProductClassCode) {
        this.superProductClassCode = superProductClassCode == null ? null : superProductClassCode.trim();
    }
}