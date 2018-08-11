/*
 * MamaGoods.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-08-04 Created
 */
package com.jiabian.beans.basic.shoppingMall;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品表
 * 
 * @author 菠萝大象
 * @version 1.0 2018-08-04
 */
public class MamaGoods implements Serializable {

    /**
     * 商品id
     */
    private Long id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 首页图片
     */
    private String img;
    /**
     * 现价
     */
    private Double price;
    /**
     * 原价
     */
    private Double orgPrice;
    /**
     * 位置 1.拼团 2.特价 3.包邮位置一 4.包邮位置二 3.包邮位置三
     */
    private Byte type;
    /**
     * 详情
     */
    private String details;
    /**
     * 销量
     */
    private Integer volume;
    /**
     * 详情轮播图
     */
    private String banner;
    private Date updateTime;
    private Date createTime;
    /**
     * 1.正常 2.删除
     */
    private Byte isDel;
    /**
     * 运费
     */
    private Double freight;
    /**
     * 拼团结束时间
     */
    private Date endTime;
    /**
     * 所需拼团人数
     */
    private Integer numberPeople;
    /**
     * 拼团价格
     */
    private BigDecimal collagePrice;
    /**
     * 库存
     */
    private Integer stock;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getOrgPrice() {
        return orgPrice;
    }
    public void setOrgPrice(Double orgPrice) {
        this.orgPrice = orgPrice;
    }
    public Byte getType() {
        return type;
    }
    public void setType(Byte type) {
        this.type = type;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }
    public Integer getVolume() {
        return volume;
    }
    public void setVolume(Integer volume) {
        this.volume = volume;
    }
    public String getBanner() {
        return banner;
    }
    public void setBanner(String banner) {
        this.banner = banner == null ? null : banner.trim();
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Byte getIsDel() {
        return isDel;
    }
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
    public Double getFreight() {
        return freight;
    }
    public void setFreight(Double freight) {
        this.freight = freight;
    }
    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    public Integer getNumberPeople() {
        return numberPeople;
    }
    public void setNumberPeople(Integer numberPeople) {
        this.numberPeople = numberPeople;
    }
    public BigDecimal getCollagePrice() {
        return collagePrice;
    }
    public void setCollagePrice(BigDecimal collagePrice) {
        this.collagePrice = collagePrice;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
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
        MamaGoods other = (MamaGoods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getOrgPrice() == null ? other.getOrgPrice() == null : this.getOrgPrice().equals(other.getOrgPrice()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getDetails() == null ? other.getDetails() == null : this.getDetails().equals(other.getDetails()))
            && (this.getVolume() == null ? other.getVolume() == null : this.getVolume().equals(other.getVolume()))
            && (this.getBanner() == null ? other.getBanner() == null : this.getBanner().equals(other.getBanner()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getFreight() == null ? other.getFreight() == null : this.getFreight().equals(other.getFreight()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getNumberPeople() == null ? other.getNumberPeople() == null : this.getNumberPeople().equals(other.getNumberPeople()))
            && (this.getCollagePrice() == null ? other.getCollagePrice() == null : this.getCollagePrice().equals(other.getCollagePrice()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getOrgPrice() == null) ? 0 : getOrgPrice().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getDetails() == null) ? 0 : getDetails().hashCode());
        result = prime * result + ((getVolume() == null) ? 0 : getVolume().hashCode());
        result = prime * result + ((getBanner() == null) ? 0 : getBanner().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getFreight() == null) ? 0 : getFreight().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getNumberPeople() == null) ? 0 : getNumberPeople().hashCode());
        result = prime * result + ((getCollagePrice() == null) ? 0 : getCollagePrice().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        return result;
    }
}