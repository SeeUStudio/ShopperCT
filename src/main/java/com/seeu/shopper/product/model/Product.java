package com.seeu.shopper.product.model;

import java.util.Date;
import javax.persistence.*;

public class Product {
    @Id
    private Integer pid;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_subname")
    private String productSubname;

    @Column(name = "product_categoryid")
    private Integer productCategoryid;

    @Column(name = "product_cost")
    private Integer productCost;

    @Column(name = "product_price")
    private Integer productPrice;

    @Column(name = "product_img")
    private String productImg;

    @Column(name = "product_unit")
    private String productUnit;

    @Column(name = "product_tag")
    private String productTag;

    @Column(name = "product_status")
    private Integer productStatus;

    @Column(name = "product_createdate")
    private Date productCreatedate;

    @Column(name = "product_updatedate")
    private Date productUpdatedate;

    @Column(name = "product_keyword")
    private String productKeyword;

    /**
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * @return product_name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return product_subname
     */
    public String getProductSubname() {
        return productSubname;
    }

    /**
     * @param productSubname
     */
    public void setProductSubname(String productSubname) {
        this.productSubname = productSubname;
    }

    /**
     * @return product_categoryid
     */
    public Integer getProductCategoryid() {
        return productCategoryid;
    }

    /**
     * @param productCategoryid
     */
    public void setProductCategoryid(Integer productCategoryid) {
        this.productCategoryid = productCategoryid;
    }

    /**
     * @return product_cost
     */
    public Integer getProductCost() {
        return productCost;
    }

    /**
     * @param productCost
     */
    public void setProductCost(Integer productCost) {
        this.productCost = productCost;
    }

    /**
     * @return product_price
     */
    public Integer getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice
     */
    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return product_img
     */
    public String getProductImg() {
        return productImg;
    }

    /**
     * @param productImg
     */
    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    /**
     * @return product_unit
     */
    public String getProductUnit() {
        return productUnit;
    }

    /**
     * @param productUnit
     */
    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    /**
     * @return product_tag
     */
    public String getProductTag() {
        return productTag;
    }

    /**
     * @param productTag
     */
    public void setProductTag(String productTag) {
        this.productTag = productTag;
    }

    /**
     * @return product_status
     */
    public Integer getProductStatus() {
        return productStatus;
    }

    /**
     * @param productStatus
     */
    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    /**
     * @return product_createdate
     */
    public Date getProductCreatedate() {
        return productCreatedate;
    }

    /**
     * @param productCreatedate
     */
    public void setProductCreatedate(Date productCreatedate) {
        this.productCreatedate = productCreatedate;
    }

    /**
     * @return product_updatedate
     */
    public Date getProductUpdatedate() {
        return productUpdatedate;
    }

    /**
     * @param productUpdatedate
     */
    public void setProductUpdatedate(Date productUpdatedate) {
        this.productUpdatedate = productUpdatedate;
    }

    /**
     * @return product_keyword
     */
    public String getProductKeyword() {
        return productKeyword;
    }

    /**
     * @param productKeyword
     */
    public void setProductKeyword(String productKeyword) {
        this.productKeyword = productKeyword;
    }
}