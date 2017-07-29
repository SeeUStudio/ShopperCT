package com.seeu.shopper.product.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "product_stock")
public class ProductStock {
    @Id
    private Integer pid;

    @Column(name = "stock_id")
    private Integer stockId;

    @Column(name = "stock_input")
    private Integer stockInput;

    @Column(name = "stock_output")
    private Integer stockOutput;

    @Column(name = "stock_current")
    private Integer stockCurrent;

    @Column(name = "specification_id")
    private Integer specificationId;

    @Column(name = "specification_value")
    private String specificationValue;

    @Column(name = "stock_addtion")
    private String stockAddtion;

    @Column(name = "stock_createdate")
    private Date stockCreatedate;

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
     * @return stock_id
     */
    public Integer getStockId() {
        return stockId;
    }

    /**
     * @param stockId
     */
    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    /**
     * @return stock_input
     */
    public Integer getStockInput() {
        return stockInput;
    }

    /**
     * @param stockInput
     */
    public void setStockInput(Integer stockInput) {
        this.stockInput = stockInput;
    }

    /**
     * @return stock_output
     */
    public Integer getStockOutput() {
        return stockOutput;
    }

    /**
     * @param stockOutput
     */
    public void setStockOutput(Integer stockOutput) {
        this.stockOutput = stockOutput;
    }

    /**
     * @return stock_current
     */
    public Integer getStockCurrent() {
        return stockCurrent;
    }

    /**
     * @param stockCurrent
     */
    public void setStockCurrent(Integer stockCurrent) {
        this.stockCurrent = stockCurrent;
    }

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
     * @return specification_value
     */
    public String getSpecificationValue() {
        return specificationValue;
    }

    /**
     * @param specificationValue
     */
    public void setSpecificationValue(String specificationValue) {
        this.specificationValue = specificationValue;
    }

    /**
     * @return stock_addtion
     */
    public String getStockAddtion() {
        return stockAddtion;
    }

    /**
     * @param stockAddtion
     */
    public void setStockAddtion(String stockAddtion) {
        this.stockAddtion = stockAddtion;
    }

    /**
     * @return stock_createdate
     */
    public Date getStockCreatedate() {
        return stockCreatedate;
    }

    /**
     * @param stockCreatedate
     */
    public void setStockCreatedate(Date stockCreatedate) {
        this.stockCreatedate = stockCreatedate;
    }
}