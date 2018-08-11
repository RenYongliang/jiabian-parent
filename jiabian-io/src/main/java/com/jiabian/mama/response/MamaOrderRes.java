package com.jiabian.mama.response;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseRes;

public class MamaOrderRes extends BaseRes implements Serializable {

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
	
}
