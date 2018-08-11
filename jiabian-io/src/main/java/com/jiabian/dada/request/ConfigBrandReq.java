package com.jiabian.dada.request;

import java.io.Serializable;

import com.jiabian.base.BaseReq;

public class ConfigBrandReq extends BaseReq implements Serializable {
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
}
