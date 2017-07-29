package com.seeu.shopper.product.model;

import javax.persistence.*;

@Table(name = "product_specificationgroup")
public class ProductSpecificationgroup {
    @Id
    @Column(name = "specificationgroup_id")
    private Integer specificationgroupId;

    @Column(name = "specificationgroup_category")
    private Integer specificationgroupCategory;

    @Column(name = "specificationgourp_name")
    private String specificationgourpName;

    /**
     * @return specificationgroup_id
     */
    public Integer getSpecificationgroupId() {
        return specificationgroupId;
    }

    /**
     * @param specificationgroupId
     */
    public void setSpecificationgroupId(Integer specificationgroupId) {
        this.specificationgroupId = specificationgroupId;
    }

    /**
     * @return specificationgroup_category
     */
    public Integer getSpecificationgroupCategory() {
        return specificationgroupCategory;
    }

    /**
     * @param specificationgroupCategory
     */
    public void setSpecificationgroupCategory(Integer specificationgroupCategory) {
        this.specificationgroupCategory = specificationgroupCategory;
    }

    /**
     * @return specificationgourp_name
     */
    public String getSpecificationgourpName() {
        return specificationgourpName;
    }

    /**
     * @param specificationgourpName
     */
    public void setSpecificationgourpName(String specificationgourpName) {
        this.specificationgourpName = specificationgourpName;
    }
}