package com.seeu.shopper.user.model;

import javax.persistence.*;

@Table(name = "user_address")
public class UserAddress {
    @Id
    @Column(name = "addr_id")
    private Integer addrId;

    @Column(name = "user_id")
    private Integer userId;

    private String phone;

    private String address;

    @Column(name = "addr_status")
    private Integer addrStatus;

    private String postcode;

    /**
     * @return addr_id
     */
    public Integer getAddrId() {
        return addrId;
    }

    /**
     * @param addrId
     */
    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return addr_status
     */
    public Integer getAddrStatus() {
        return addrStatus;
    }

    /**
     * @param addrStatus
     */
    public void setAddrStatus(Integer addrStatus) {
        this.addrStatus = addrStatus;
    }

    /**
     * @return postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * @param postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}