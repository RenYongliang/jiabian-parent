package com.jiabian.mama.response;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseRes;

public class MamaCommentRes extends BaseRes implements Serializable {

	/**
     * 评论id
     */
    private Long id;
    /**
     * 商品id
     */
    private Long goodid;
    /**
     * 用户id
     */
    private Long userid;
    /**
     * 评论
     */
    private String comment;
    /**
     * 时间
     */
    private Date createTime;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getGoodid() {
        return goodid;
    }
    public void setGoodid(Long goodid) {
        this.goodid = goodid;
    }
    public Long getUserid() {
        return userid;
    }
    public void setUserid(Long userid) {
        this.userid = userid;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
	
}
