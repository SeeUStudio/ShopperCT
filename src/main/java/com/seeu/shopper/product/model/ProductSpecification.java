package com.seeu.shopper.product.model;

import javax.persistence.*;

@Table(name = "product_specification")
public class ProductSpecification {
    @Id
    @Column(name = "specification_id")
    private Integer specificationId;

    @Column(name = "specificationgroup_id")
    private Integer specificationgroupId;

    @Column(name = "specification_name")
    private String specificationName;

    /**
     * @return specification_id
     */
    public Integer getSpecificationId() {
        return specificationId;
    }

    /**
     * @param specificationId
     */
    public void setSpecificationId(Integer specificationId) {
        this.specificationId = specificationId;
    }

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
     * @return specification_name
     */
    public String getSpecificationName() {
        return specificationName;
    }

    /**
     * @param specificationName
     */
    public void setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
    }
}