/*
 * ConfigSeries.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-11 Created
 */
package com.jiabian.beans.basic.dada;

import java.io.Serializable;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2018-07-11
 */
public class ConfigSeries implements Serializable {

    private Integer id;
    private String cx_id;
    private String zm;
    private String logo_id;
    private String chexi;
    private String changjia;
    private String dijia;
    private String gaojia;
    private String img;
    private String time;
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCx_id() {
        return cx_id;
    }
    public void setCx_id(String cx_id) {
        this.cx_id = cx_id == null ? null : cx_id.trim();
    }
    public String getZm() {
        return zm;
    }
    public void setZm(String zm) {
        this.zm = zm == null ? null : zm.trim();
    }
    public String getLogo_id() {
        return logo_id;
    }
    public void setLogo_id(String logo_id) {
        this.logo_id = logo_id == null ? null : logo_id.trim();
    }
    public String getChexi() {
        return chexi;
    }
    public void setChexi(String chexi) {
        this.chexi = chexi == null ? null : chexi.trim();
    }
    public String getChangjia() {
        return changjia;
    }
    public void setChangjia(String changjia) {
        this.changjia = changjia == null ? null : changjia.trim();
    }
    public String getDijia() {
        return dijia;
    }
    public void setDijia(String dijia) {
        this.dijia = dijia == null ? null : dijia.trim();
    }
    public String getGaojia() {
        return gaojia;
    }
    public void setGaojia(String gaojia) {
        this.gaojia = gaojia == null ? null : gaojia.trim();
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
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
        ConfigSeries other = (ConfigSeries) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCx_id() == null ? other.getCx_id() == null : this.getCx_id().equals(other.getCx_id()))
            && (this.getZm() == null ? other.getZm() == null : this.getZm().equals(other.getZm()))
            && (this.getLogo_id() == null ? other.getLogo_id() == null : this.getLogo_id().equals(other.getLogo_id()))
            && (this.getChexi() == null ? other.getChexi() == null : this.getChexi().equals(other.getChexi()))
            && (this.getChangjia() == null ? other.getChangjia() == null : this.getChangjia().equals(other.getChangjia()))
            && (this.getDijia() == null ? other.getDijia() == null : this.getDijia().equals(other.getDijia()))
            && (this.getGaojia() == null ? other.getGaojia() == null : this.getGaojia().equals(other.getGaojia()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCx_id() == null) ? 0 : getCx_id().hashCode());
        result = prime * result + ((getZm() == null) ? 0 : getZm().hashCode());
        result = prime * result + ((getLogo_id() == null) ? 0 : getLogo_id().hashCode());
        result = prime * result + ((getChexi() == null) ? 0 : getChexi().hashCode());
        result = prime * result + ((getChangjia() == null) ? 0 : getChangjia().hashCode());
        result = prime * result + ((getDijia() == null) ? 0 : getDijia().hashCode());
        result = prime * result + ((getGaojia() == null) ? 0 : getGaojia().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        return result;
    }
}