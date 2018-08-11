package com.jiabian.mama.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.jiabian.base.BaseRes;

public class MamaGoodsRes extends BaseRes implements Serializable {

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
	
}
