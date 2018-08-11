package com.jiabian.dada.response;

import java.io.Serializable;

import com.jiabian.base.BaseRes;

public class ConfigSeriesRes extends BaseRes implements Serializable {
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
}
