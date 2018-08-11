package com.jiabian.mama.request;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseReq;

public class MamaUserReq extends BaseReq implements Serializable {

	/**
     * 用户id
     */
    private Long id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 头像
     */
    private String img;
    /**
     * 积分
     */
    private Integer score;
    /**
     * openid
     */
    private String openid;
    /**
     * 添加时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 1.正常 2.删除
     */
    private Byte isDel;
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
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public String getOpenid() {
        return openid;
    }
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Byte getIsDel() {
        return isDel;
    }
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
	@Override
	public String toString() {
		return "MamaUserReq [id=" + id + ", name=" + name + ", img=" + img + ", score=" + score + ", openid=" + openid
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", isDel=" + isDel + "]";
	}
	
}
