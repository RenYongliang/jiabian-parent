/*
 * ConfigBrand.java
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
public class ConfigBrand implements Serializable {

    private Integer id;
    private String zm;
    private String name;
    private String name_id;
    private String logo;
    private String time;
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getZm() {
        return zm;
    }
    public void setZm(String zm) {
        this.zm = zm == null ? null : zm.trim();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getName_id() {
        return name_id;
    }
    public void setName_id(String name_id) {
        this.name_id = name_id == null ? null : name_id.trim();
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
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
        ConfigBrand other = (ConfigBrand) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getZm() == null ? other.getZm() == null : this.getZm().equals(other.getZm()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getName_id() == null ? other.getName_id() == null : this.getName_id().equals(other.getName_id()))
            && (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getZm() == null) ? 0 : getZm().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getName_id() == null) ? 0 : getName_id().hashCode());
        result = prime * result + ((getLogo() == null) ? 0 : getLogo().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        return result;
    }
}