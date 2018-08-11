package com.jiabian.mama.response;

import java.io.Serializable;

import com.jiabian.base.BaseRes;

public class MamaConfigRes extends BaseRes implements Serializable {

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
	
}
