package com.seeu.shopper.product.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "product_intro")
public class ProductIntro {
    @Id
    private Integer pid;

    @Column(name = "html_addr")
    private String htmlAddr;

    private Date creatdate;

    @Column(name = "intro_id")
    private Integer introId;

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
     * @return html_addr
     */
    public String getHtmlAddr() {
        return htmlAddr;
    }

    /**
     * @param htmlAddr
     */
    public void setHtmlAddr(String htmlAddr) {
        this.htmlAddr = htmlAddr;
    }

    /**
     * @return creatdate
     */
    public Date getCreatdate() {
        return creatdate;
    }

    /**
     * @param creatdate
     */
    public void setCreatdate(Date creatdate) {
        this.creatdate = creatdate;
    }

    /**
     * @return intro_id
     */
    public Integer getIntroId() {
        return introId;
    }

    /**
     * @param introId
     */
    public void setIntroId(Integer introId) {
        this.introId = introId;
    }
}