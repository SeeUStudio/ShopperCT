package com.seeu.shopper.product.model;

import javax.persistence.*;

@Table(name = "product_coupon")
public class ProductCoupon {
    @Id
    private Integer pid;

    private Integer cid;

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
     * @return cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }
}