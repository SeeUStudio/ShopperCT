package com.seeu.shopper.product.model;

import javax.persistence.*;

@Table(name = "product_param")
public class ProductParam {
    @Id
    private Integer pid;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_id")
    private Integer paramId;

    @Column(name = "param_value")
    private String paramValue;

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
     * @return param_name
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * @param paramName
     */
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    /**
     * @return param_id
     */
    public Integer getParamId() {
        return paramId;
    }

    /**
     * @param paramId
     */
    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    /**
     * @return param_value
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * @param paramValue
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }
}