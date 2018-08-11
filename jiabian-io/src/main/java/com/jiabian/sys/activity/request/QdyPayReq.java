package com.jiabian.sys.activity.request;

import java.math.BigDecimal;

import com.jiabian.base.BaseReq;

public class QdyPayReq extends BaseReq{
	private String checkIds;

    /**
     * 支付记录id
     */
    private Long payPartake_id;
    /**
     * 订单号
     */
    private String payPartake_num;
    /**
	 * 用户名
	 */
	private String userName;
	/**
	 * 用户电话
	 */
	private String userTel;
	/**
     * 订单号
     */
    private String PayPartakeNum;
	/**
     * 商品id
     */
    private Long id;
    /**
     * 支付状态(1.已支付 2.未支付)
     */
    private Byte payPartake_isPay;
    /**
     * 支付时间
     */
    private String payPartake_time;
    /**
     * 支付金额
     */
    private BigDecimal payPartake_money;
    /**
     * 支付方式(1.家边通宝 2.一网通 3.微信支付 4.支付宝)
     */
    private Byte payPartake_method;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 支付商品数量
     */
    private Integer payPartake_quantity;
    /**
     * 查询开始时间
     */
    private String theSeekStarTime;
    /**
     * 查询结束时间
     */
    private String theSeekEndTime;
    /**
     * 商品Id
     */
    private Long prodId;
    
    /**
     * 溢出金额
     */
    private BigDecimal spilMoney;
    public BigDecimal getSpilMoney() {
		return spilMoney;
	}
	public void setSpilMoney(BigDecimal spilMoney) {
		this.spilMoney = spilMoney;
	}
	public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public String getTheSeekStarTime() {
		return theSeekStarTime;
	}
	public void setTheSeekStarTime(String theSeekStarTime) {
		this.theSeekStarTime = theSeekStarTime;
	}
	public String getTheSeekEndTime() {
		return theSeekEndTime;
	}
	public void setTheSeekEndTime(String theSeekEndTime) {
		this.theSeekEndTime = theSeekEndTime;
	}
	private static final long serialVersionUID = 1L;

    public Long getPayPartake_id() {
        return payPartake_id;
    }
    public void setPayPartake_id(Long payPartake_id) {
        this.payPartake_id = payPartake_id;
    }
    public String getPayPartake_num() {
        return payPartake_num;
    }
    public void setPayPartake_num(String payPartake_num) {
        this.payPartake_num = payPartake_num == null ? null : payPartake_num.trim();
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Byte getPayPartake_isPay() {
        return payPartake_isPay;
    }
    public void setPayPartake_isPay(Byte payPartake_isPay) {
        this.payPartake_isPay = payPartake_isPay;
    }
    public BigDecimal getPayPartake_money() {
        return payPartake_money;
    }
    public void setPayPartake_money(BigDecimal payPartake_money) {
        this.payPartake_money = payPartake_money;
    }
    public Byte getPayPartake_method() {
        return payPartake_method;
    }
    public void setPayPartake_method(Byte payPartake_method) {
        this.payPartake_method = payPartake_method;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Integer getPayPartake_quantity() {
        return payPartake_quantity;
    }
    public void setPayPartake_quantity(Integer payPartake_quantity) {
        this.payPartake_quantity = payPartake_quantity;
    }
    public String getPayPartakeNum() {
		return PayPartakeNum;
	}
	public String getPayPartake_time() {
		return payPartake_time;
	}
	public void setPayPartake_time(String payPartake_time) {
		this.payPartake_time = payPartake_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setPayPartakeNum(String payPartakeNum) {
		PayPartakeNum = payPartakeNum;
	}

	public String getCheckIds() {
		return checkIds;
	}
	public void setCheckIds(String checkIds) {
		this.checkIds = checkIds;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}


}
