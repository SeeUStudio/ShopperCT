package com.seeu.shopper.product.model;

import javax.persistence.*;

@Table(name = "product_img")
public class ProductImg {
    @Id
    @Column(name = "img_id")
    private Integer imgId;

    private Integer pid;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "img_order")
    private Integer imgOrder;

    @Column(name = "img_name")
    private String imgName;

    /**
     * @return img_id
     */
    public Integer getImgId() {
        return imgId;
    }

    /**
     * @param imgId
     */
    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

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
     * @return img_url
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * @param imgUrl
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * @return img_order
     */
    public Integer getImgOrder() {
        return imgOrder;
    }

    /**
     * @param imgOrder
     */
    public void setImgOrder(Integer imgOrder) {
        this.imgOrder = imgOrder;
    }

    /**
     * @return img_name
     */
    public String getImgName() {
        return imgName;
    }

    /**
     * @param imgName
     */
    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
}