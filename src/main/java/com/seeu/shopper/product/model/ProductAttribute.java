package com.seeu.shopper.product.model;

import javax.persistence.*;

@Table(name = "product_attribute")
public class ProductAttribute {
    @Id
    private Integer pid;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "attribute_value")
    private String attributeValue;

    @Column(name = "attribute_name")
    private String attributeName;

    @Column(name = "attribute_id")
    private Integer attributeId;

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
     * @return category_id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return attribute_value
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * @param attributeValue
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * @return attribute_name
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * @param attributeName
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * @return attribute_id
     */
    public Integer getAttributeId() {
        return attributeId;
    }

    /**
     * @param attributeId
     */
    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }
}