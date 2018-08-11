/*
 * MamaOrder.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-08-06 Created
 */
package com.jiabian.beans.basic.shoppingMall;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单表
 * 
 * @author 菠萝大象
 * @version 1.0 2018-08-06
 */
public class MamaOrder implements Serializable {

    /**
     * 订单id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userid;
    /**
     * 商品id
     */
    private Long goodid;
    /**
     * 成交价格
     */
    private Double price;
    /**
     * 支付状态：1、未支付 2、已支付
     */
    private Byte payment;
    /**
     * 发货状态：1、未发货 2、待发货 3.待收货 4.待分享 5.待评价
     */
    private Byte deliver;
    /**
     * 订单号
     */
    private String orderNumber;
    /**
     * 1.正常 2.删除
     */
    private Byte isDel;
    private Date createTime;
    /**
     * 支付时间
     */
    private Date paytime;
    /**
     * 地址ID
     */
    private Long addressid;
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
    public Long getGoodid() {
        return goodid;
    }
    public void setGoodid(Long goodid) {
        this.goodid = goodid;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Byte getPayment() {
        return payment;
    }
    public void setPayment(Byte payment) {
        this.payment = payment;
    }
    public Byte getDeliver() {
        return deliver;
    }
    public void setDeliver(Byte deliver) {
        this.deliver = deliver;
    }
    public String getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }
    public Byte getIsDel() {
        return isDel;
    }
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getPaytime() {
        return paytime;
    }
    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }
    public Long getAddressid() {
        return addressid;
    }
    public void setAddressid(Long addressid) {
        this.addressid = addressid;
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
        MamaOrder other = (MamaOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getGoodid() == null ? other.getGoodid() == null : this.getGoodid().equals(other.getGoodid()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getPayment() == null ? other.getPayment() == null : this.getPayment().equals(other.getPayment()))
            && (this.getDeliver() == null ? other.getDeliver() == null : this.getDeliver().equals(other.getDeliver()))
            && (this.getOrderNumber() == null ? other.getOrderNumber() == null : this.getOrderNumber().equals(other.getOrderNumber()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getPaytime() == null ? other.getPaytime() == null : this.getPaytime().equals(other.getPaytime()))
            && (this.getAddressid() == null ? other.getAddressid() == null : this.getAddressid().equals(other.getAddressid()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getGoodid() == null) ? 0 : getGoodid().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getPayment() == null) ? 0 : getPayment().hashCode());
        result = prime * result + ((getDeliver() == null) ? 0 : getDeliver().hashCode());
        result = prime * result + ((getOrderNumber() == null) ? 0 : getOrderNumber().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getPaytime() == null) ? 0 : getPaytime().hashCode());
        result = prime * result + ((getAddressid() == null) ? 0 : getAddressid().hashCode());
        return result;
    }
}