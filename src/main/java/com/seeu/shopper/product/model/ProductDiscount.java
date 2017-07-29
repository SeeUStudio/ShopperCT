package com.seeu.shopper.product.model;

import javax.persistence.*;

@Table(name = "product_discount")
public class ProductDiscount {
    @Id
    private Integer pid;

    private Integer did;

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
     * @return did
     */
    public Integer getDid() {
        return did;
    }

    /**
     * @param did
     */
    public void setDid(Integer did) {
        this.did = did;
    }
}