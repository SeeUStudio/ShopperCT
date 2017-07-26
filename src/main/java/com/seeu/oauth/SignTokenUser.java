package com.seeu.oauth;

/**
 * Created by neo on 02/07/2017.
 */
public class SignTokenUser {
    private String uid;
    private String type;//允许备注为 CAS 、SEEU、QQ、WeChat 等等
    private String extra;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
