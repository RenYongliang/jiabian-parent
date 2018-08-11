package com.jiabian.mama.request;

import java.io.Serializable;
import java.util.Date;

import com.jiabian.base.BaseReq;

public class MamaBannerReq extends BaseReq implements Serializable {

	private Long id;
    /**
     * 图片
     */
    private String img;
    /**
     * 添加时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 1.正常 2.删除
     */
    private Byte isDel;
    /**
     * banner位置 1、首页 2、商城 3、福利 4、精选包邮位置一 5、精选包邮位置二 6、精选包邮位置三 7、0元砍价 8、厨币商城
     */
    private Byte type;
    /**
     * 跳转链接
     */
    private String url;
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
    public Byte getType() {
        return type;
    }
    public void setType(Byte type) {
        this.type = type;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
	
}
