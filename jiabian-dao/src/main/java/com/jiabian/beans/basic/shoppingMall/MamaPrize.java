/*
 * MamaPrize.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-08-09 Created
 */
package com.jiabian.beans.basic.shoppingMall;

import java.io.Serializable;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2018-08-09
 */
public class MamaPrize implements Serializable {

    /**
     * 抽将奖品id
     */
    private Long id;
    /**
     * 活动id
     */
    private Long hid;
    /**
     * 抽将奖品名称
     */
    private String prize;
    /**
     * 奖品的概率
     */
    private String chance;
    /**
     * 图片
     */
    private String url;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getHid() {
        return hid;
    }
    public void setHid(Long hid) {
        this.hid = hid;
    }
    public String getPrize() {
        return prize;
    }
    public void setPrize(String prize) {
        this.prize = prize == null ? null : prize.trim();
    }
    public String getChance() {
        return chance;
    }
    public void setChance(String chance) {
        this.chance = chance == null ? null : chance.trim();
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
        MamaPrize other = (MamaPrize) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHid() == null ? other.getHid() == null : this.getHid().equals(other.getHid()))
            && (this.getPrize() == null ? other.getPrize() == null : this.getPrize().equals(other.getPrize()))
            && (this.getChance() == null ? other.getChance() == null : this.getChance().equals(other.getChance()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHid() == null) ? 0 : getHid().hashCode());
        result = prime * result + ((getPrize() == null) ? 0 : getPrize().hashCode());
        result = prime * result + ((getChance() == null) ? 0 : getChance().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return result;
    }
}