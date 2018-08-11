/*
 * MamaConfig.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-08-06 Created
 */
package com.jiabian.beans.basic.shoppingMall;

import java.io.Serializable;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2018-08-06
 */
public class MamaConfig implements Serializable {

    private Long id;
    /**
     * 小程序appid
     */
    private String key;
    /**
     * 小程序秘钥
     */
    private String value;
    /**
     * 商户id
     */
    private String mch_id;
    /**
     * 1.小程序APPID
     */
    private Byte type;
    /**
     * 商户秘钥
     */
    private String mch_key;
    /**
     * 回调路径
     */
    private String notify_url;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
    public String getMch_id() {
        return mch_id;
    }
    public void setMch_id(String mch_id) {
        this.mch_id = mch_id == null ? null : mch_id.trim();
    }
    public Byte getType() {
        return type;
    }
    public void setType(Byte type) {
        this.type = type;
    }
    public String getMch_key() {
        return mch_key;
    }
    public void setMch_key(String mch_key) {
        this.mch_key = mch_key == null ? null : mch_key.trim();
    }
    public String getNotify_url() {
        return notify_url;
    }
    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url == null ? null : notify_url.trim();
    }
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MamaConfig other = (MamaConfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getMch_id() == null ? other.getMch_id() == null : this.getMch_id().equals(other.getMch_id()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getMch_key() == null ? other.getMch_key() == null : this.getMch_key().equals(other.getMch_key()))
            && (this.getNotify_url() == null ? other.getNotify_url() == null : this.getNotify_url().equals(other.getNotify_url()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getMch_id() == null) ? 0 : getMch_id().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getMch_key() == null) ? 0 : getMch_key().hashCode());
        result = prime * result + ((getNotify_url() == null) ? 0 : getNotify_url().hashCode());
        return result;
    }
}