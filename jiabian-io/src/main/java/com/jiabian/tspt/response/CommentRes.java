package com.jiabian.tspt.response;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseRes;

public class CommentRes extends BaseRes implements Serializable {

	/**
     * 评论编号
     */
    private Long id;
    /**
     * 投诉单编号
     */
    private Long compid;
    /**
     * 用户编号
     */
    private String userid;
    /**
     * 用户头像
     */
    private String img;
    /**
     * 用户名
     */
    private String username;
    /**
     * 评论内容
     */
    private String comment;
    /**
     * 评论时间
     */
    private Date time;
    /**
     * 用户信息
     */
    private ComplUserRes complUserRes;
    
    private static final long serialVersionUID = 1L;

    public ComplUserRes getComplUserRes() {
		return complUserRes;
	}
	public void setComplUserRes(ComplUserRes complUserRes) {
		this.complUserRes = complUserRes;
	}
	public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getCompid() {
        return compid;
    }
    public void setCompid(Long compid) {
        this.compid = compid;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
	@Override
	public String toString() {
		return "CommentRes [id=" + id + ", compid=" + compid + ", userid=" + userid + ", img=" + img + ", username="
				+ username + ", comment=" + comment + ", time=" + time + ", complUserRes=" + complUserRes + "]";
	}
	
}
