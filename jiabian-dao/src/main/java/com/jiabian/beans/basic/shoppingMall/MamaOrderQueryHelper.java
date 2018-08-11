/*
 * MamaOrderQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-08-06 Created
 */
package com.jiabian.beans.basic.shoppingMall;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MamaOrderQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public MamaOrderQueryHelper() {
        oredCriteria = new ArrayList<Criteria>();
    }
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }
    public String getOrderByClause() {
        return orderByClause;
    }
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }
    public boolean isDistinct() {
        return distinct;
    }
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 订单表
     * 
     * @author 菠萝大象
     * @version 1.0 2018-08-06
     */
    protected abstract static class GeneratedCriteria {

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }
        public boolean isValid() {
            return criteria.size() > 0;
        }
        public List<Criterion> getAllCriteria() {
            return criteria;
        }
        public List<Criterion> getCriteria() {
            return criteria;
        }
        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }
        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }
        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }
        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }
        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }
        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }
        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }
        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }
        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }
        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }
        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }
        public Criteria andGoodidIsNull() {
            addCriterion("goodid is null");
            return (Criteria) this;
        }
        public Criteria andGoodidIsNotNull() {
            addCriterion("goodid is not null");
            return (Criteria) this;
        }
        public Criteria andGoodidEqualTo(Long value) {
            addCriterion("goodid =", value, "goodid");
            return (Criteria) this;
        }
        public Criteria andGoodidNotEqualTo(Long value) {
            addCriterion("goodid <>", value, "goodid");
            return (Criteria) this;
        }
        public Criteria andGoodidGreaterThan(Long value) {
            addCriterion("goodid >", value, "goodid");
            return (Criteria) this;
        }
        public Criteria andGoodidGreaterThanOrEqualTo(Long value) {
            addCriterion("goodid >=", value, "goodid");
            return (Criteria) this;
        }
        public Criteria andGoodidLessThan(Long value) {
            addCriterion("goodid <", value, "goodid");
            return (Criteria) this;
        }
        public Criteria andGoodidLessThanOrEqualTo(Long value) {
            addCriterion("goodid <=", value, "goodid");
            return (Criteria) this;
        }
        public Criteria andGoodidIn(List<Long> values) {
            addCriterion("goodid in", values, "goodid");
            return (Criteria) this;
        }
        public Criteria andGoodidNotIn(List<Long> values) {
            addCriterion("goodid not in", values, "goodid");
            return (Criteria) this;
        }
        public Criteria andGoodidBetween(Long value1, Long value2) {
            addCriterion("goodid between", value1, value2, "goodid");
            return (Criteria) this;
        }
        public Criteria andGoodidNotBetween(Long value1, Long value2) {
            addCriterion("goodid not between", value1, value2, "goodid");
            return (Criteria) this;
        }
        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }
        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }
        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }
        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }
        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }
        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }
        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }
        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }
        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }
        public Criteria andPaymentEqualTo(Byte value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }
        public Criteria andPaymentNotEqualTo(Byte value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }
        public Criteria andPaymentGreaterThan(Byte value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }
        public Criteria andPaymentGreaterThanOrEqualTo(Byte value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }
        public Criteria andPaymentLessThan(Byte value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }
        public Criteria andPaymentLessThanOrEqualTo(Byte value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }
        public Criteria andPaymentIn(List<Byte> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }
        public Criteria andPaymentNotIn(List<Byte> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }
        public Criteria andPaymentBetween(Byte value1, Byte value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }
        public Criteria andPaymentNotBetween(Byte value1, Byte value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }
        public Criteria andDeliverIsNull() {
            addCriterion("deliver is null");
            return (Criteria) this;
        }
        public Criteria andDeliverIsNotNull() {
            addCriterion("deliver is not null");
            return (Criteria) this;
        }
        public Criteria andDeliverEqualTo(Byte value) {
            addCriterion("deliver =", value, "deliver");
            return (Criteria) this;
        }
        public Criteria andDeliverNotEqualTo(Byte value) {
            addCriterion("deliver <>", value, "deliver");
            return (Criteria) this;
        }
        public Criteria andDeliverGreaterThan(Byte value) {
            addCriterion("deliver >", value, "deliver");
            return (Criteria) this;
        }
        public Criteria andDeliverGreaterThanOrEqualTo(Byte value) {
            addCriterion("deliver >=", value, "deliver");
            return (Criteria) this;
        }
        public Criteria andDeliverLessThan(Byte value) {
            addCriterion("deliver <", value, "deliver");
            return (Criteria) this;
        }
        public Criteria andDeliverLessThanOrEqualTo(Byte value) {
            addCriterion("deliver <=", value, "deliver");
            return (Criteria) this;
        }
        public Criteria andDeliverIn(List<Byte> values) {
            addCriterion("deliver in", values, "deliver");
            return (Criteria) this;
        }
        public Criteria andDeliverNotIn(List<Byte> values) {
            addCriterion("deliver not in", values, "deliver");
            return (Criteria) this;
        }
        public Criteria andDeliverBetween(Byte value1, Byte value2) {
            addCriterion("deliver between", value1, value2, "deliver");
            return (Criteria) this;
        }
        public Criteria andDeliverNotBetween(Byte value1, Byte value2) {
            addCriterion("deliver not between", value1, value2, "deliver");
            return (Criteria) this;
        }
        public Criteria andOrderNumberIsNull() {
            addCriterion("orderNumber is null");
            return (Criteria) this;
        }
        public Criteria andOrderNumberIsNotNull() {
            addCriterion("orderNumber is not null");
            return (Criteria) this;
        }
        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("orderNumber =", value, "orderNumber");
            return (Criteria) this;
        }
        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("orderNumber <>", value, "orderNumber");
            return (Criteria) this;
        }
        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("orderNumber >", value, "orderNumber");
            return (Criteria) this;
        }
        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("orderNumber >=", value, "orderNumber");
            return (Criteria) this;
        }
        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("orderNumber <", value, "orderNumber");
            return (Criteria) this;
        }
        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("orderNumber <=", value, "orderNumber");
            return (Criteria) this;
        }
        public Criteria andOrderNumberLike(String value) {
            addCriterion("orderNumber like", value, "orderNumber");
            return (Criteria) this;
        }
        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("orderNumber not like", value, "orderNumber");
            return (Criteria) this;
        }
        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("orderNumber in", values, "orderNumber");
            return (Criteria) this;
        }
        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("orderNumber not in", values, "orderNumber");
            return (Criteria) this;
        }
        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("orderNumber between", value1, value2, "orderNumber");
            return (Criteria) this;
        }
        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("orderNumber not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }
        public Criteria andIsDelIsNull() {
            addCriterion("isDel is null");
            return (Criteria) this;
        }
        public Criteria andIsDelIsNotNull() {
            addCriterion("isDel is not null");
            return (Criteria) this;
        }
        public Criteria andIsDelEqualTo(Byte value) {
            addCriterion("isDel =", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelNotEqualTo(Byte value) {
            addCriterion("isDel <>", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelGreaterThan(Byte value) {
            addCriterion("isDel >", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("isDel >=", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelLessThan(Byte value) {
            addCriterion("isDel <", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("isDel <=", value, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelIn(List<Byte> values) {
            addCriterion("isDel in", values, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelNotIn(List<Byte> values) {
            addCriterion("isDel not in", values, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelBetween(Byte value1, Byte value2) {
            addCriterion("isDel between", value1, value2, "isDel");
            return (Criteria) this;
        }
        public Criteria andIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("isDel not between", value1, value2, "isDel");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }
        public Criteria andPaytimeIsNull() {
            addCriterion("paytime is null");
            return (Criteria) this;
        }
        public Criteria andPaytimeIsNotNull() {
            addCriterion("paytime is not null");
            return (Criteria) this;
        }
        public Criteria andPaytimeEqualTo(Date value) {
            addCriterion("paytime =", value, "paytime");
            return (Criteria) this;
        }
        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterion("paytime <>", value, "paytime");
            return (Criteria) this;
        }
        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterion("paytime >", value, "paytime");
            return (Criteria) this;
        }
        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("paytime >=", value, "paytime");
            return (Criteria) this;
        }
        public Criteria andPaytimeLessThan(Date value) {
            addCriterion("paytime <", value, "paytime");
            return (Criteria) this;
        }
        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("paytime <=", value, "paytime");
            return (Criteria) this;
        }
        public Criteria andPaytimeIn(List<Date> values) {
            addCriterion("paytime in", values, "paytime");
            return (Criteria) this;
        }
        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterion("paytime not in", values, "paytime");
            return (Criteria) this;
        }
        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterion("paytime between", value1, value2, "paytime");
            return (Criteria) this;
        }
        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("paytime not between", value1, value2, "paytime");
            return (Criteria) this;
        }
        public Criteria andAddressidIsNull() {
            addCriterion("addressid is null");
            return (Criteria) this;
        }
        public Criteria andAddressidIsNotNull() {
            addCriterion("addressid is not null");
            return (Criteria) this;
        }
        public Criteria andAddressidEqualTo(Long value) {
            addCriterion("addressid =", value, "addressid");
            return (Criteria) this;
        }
        public Criteria andAddressidNotEqualTo(Long value) {
            addCriterion("addressid <>", value, "addressid");
            return (Criteria) this;
        }
        public Criteria andAddressidGreaterThan(Long value) {
            addCriterion("addressid >", value, "addressid");
            return (Criteria) this;
        }
        public Criteria andAddressidGreaterThanOrEqualTo(Long value) {
            addCriterion("addressid >=", value, "addressid");
            return (Criteria) this;
        }
        public Criteria andAddressidLessThan(Long value) {
            addCriterion("addressid <", value, "addressid");
            return (Criteria) this;
        }
        public Criteria andAddressidLessThanOrEqualTo(Long value) {
            addCriterion("addressid <=", value, "addressid");
            return (Criteria) this;
        }
        public Criteria andAddressidIn(List<Long> values) {
            addCriterion("addressid in", values, "addressid");
            return (Criteria) this;
        }
        public Criteria andAddressidNotIn(List<Long> values) {
            addCriterion("addressid not in", values, "addressid");
            return (Criteria) this;
        }
        public Criteria andAddressidBetween(Long value1, Long value2) {
            addCriterion("addressid between", value1, value2, "addressid");
            return (Criteria) this;
        }
        public Criteria andAddressidNotBetween(Long value1, Long value2) {
            addCriterion("addressid not between", value1, value2, "addressid");
            return (Criteria) this;
        }
        public Criteria andOrderNumberLikeInsensitive(String value) {
            addCriterion("upper(orderNumber) like", value.toUpperCase(), "orderNumber");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 订单表
     * 
     * @author 菠萝大象
     * @version 1.0 2018-08-06
     */
    public static class Criterion {

        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;

        public String getCondition() {
            return condition;
        }
        public Object getValue() {
            return value;
        }
        public Object getSecondValue() {
            return secondValue;
        }
        public boolean isNoValue() {
            return noValue;
        }
        public boolean isSingleValue() {
            return singleValue;
        }
        public boolean isBetweenValue() {
            return betweenValue;
        }
        public boolean isListValue() {
            return listValue;
        }
        public String getTypeHandler() {
            return typeHandler;
        }
        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }
        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }
        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }
        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}