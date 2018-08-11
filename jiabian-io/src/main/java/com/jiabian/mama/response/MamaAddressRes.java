package com.jiabian.mama.response;

import java.io.Serializable;

import com.jiabian.base.BaseRes;

public class MamaAddressRes extends BaseRes implements Serializable {

	/**
     * 地址id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userid;
    /**
     * 收货人姓名
     */
    private String name;
    /**
     * 收货地址
     */
    private String address;
    /**
     * 联系方式
     */
    private String telephone;
    /**
     * 默认地址：1、是 2、否
     */
    private Byte type;
    /**
     * 1.无 2.家 3.公司 4.学校
     */
    private Byte label;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserid() {
        return userid;
    }
    public void setUserid(Long userid) {
        this.userid = userid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
    public Byte getType() {
        return type;
    }
    public void setType(Byte type) {
        this.type = type;
    }
    public Byte getLabel() {
        return label;
    }
    public void setLabel(Byte label) {
        this.label = label;
    }
	
}
