package com.jiabian.mama.request;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseReq;

public class MamaNewsReq extends BaseReq implements Serializable {

	private Long id;
    /**
     * 图片
     */
    private String img;
    /**
     * 标题
     */
    private String title;
    /**
     * 简介
     */
    private String briefIntroduction;
    /**
     * 简介
     */
    private String details;
    private Date updateTime;
    private Date createTime;
    /**
     * 1.正常 2.删除
     */
    private Byte isDel;
    /**
     * 1.每日推荐 2.热文
     */
    private Byte type;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
    public String getBriefIntroduction() {
        return briefIntroduction;
    }
    public void setBriefIntroduction(String briefIntroduction) {
        this.briefIntroduction = briefIntroduction == null ? null : briefIntroduction.trim();
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
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
    public Byte getType() {
        return type;
    }
    public void setType(Byte type) {
        this.type = type;
    }
	
}
