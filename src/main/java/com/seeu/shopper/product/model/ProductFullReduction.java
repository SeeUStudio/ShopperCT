package com.seeu.shopper.product.model;

import javax.persistence.*;

@Table(name = "product_full_reduction")
public class ProductFullReduction {
    @Id
    private Integer pid;

    private Integer fid;

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
     * @return fid
     */
    public Integer getFid() {
        return fid;
    }

    /**
     * @param fid
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }
}