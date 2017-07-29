package com.seeu.shopper.demo.model;

import javax.persistence.*;

public class Demo {
    @Id
    private Integer iddemo;

    /**
     * @return iddemo
     */
    public Integer getIddemo() {
        return iddemo;
    }

    /**
     * @param iddemo
     */
    public void setIddemo(Integer iddemo) {
        this.iddemo = iddemo;
    }
}