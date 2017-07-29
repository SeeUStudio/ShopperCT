package com.seeu.shopper.product.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "product_tag")
public class ProductTag {
    @Id
    @Column(name = "tag_id")
    private Integer tagId;

    @Column(name = "tag_name")
    private String tagName;

    @Column(name = "tag_icon")
    private String tagIcon;

    @Column(name = "tag_addition")
    private String tagAddition;

    @Column(name = "tag_creatdate")
    private Date tagCreatdate;

    /**
     * @return tag_id
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * @param tagId
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * @return tag_name
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * @param tagName
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * @return tag_icon
     */
    public String getTagIcon() {
        return tagIcon;
    }

    /**
     * @param tagIcon
     */
    public void setTagIcon(String tagIcon) {
        this.tagIcon = tagIcon;
    }

    /**
     * @return tag_addition
     */
    public String getTagAddition() {
        return tagAddition;
    }

    /**
     * @param tagAddition
     */
    public void setTagAddition(String tagAddition) {
        this.tagAddition = tagAddition;
    }

    /**
     * @return tag_creatdate
     */
    public Date getTagCreatdate() {
        return tagCreatdate;
    }

    /**
     * @param tagCreatdate
     */
    public void setTagCreatdate(Date tagCreatdate) {
        this.tagCreatdate = tagCreatdate;
    }
}