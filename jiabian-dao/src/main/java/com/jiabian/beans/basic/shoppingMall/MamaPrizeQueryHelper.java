/*
 * MamaPrizeQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-08-09 Created
 */
package com.jiabian.beans.basic.shoppingMall;

import java.util.ArrayList;
import java.util.List;

public class MamaPrizeQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public MamaPrizeQueryHelper() {
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
     * 
     * 
     * @author 菠萝大象
     * @version 1.0 2018-08-09
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
        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }
        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }
        public Criteria andHidEqualTo(Long value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }
        public Criteria andHidNotEqualTo(Long value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }
        public Criteria andHidGreaterThan(Long value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }
        public Criteria andHidGreaterThanOrEqualTo(Long value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }
        public Criteria andHidLessThan(Long value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }
        public Criteria andHidLessThanOrEqualTo(Long value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }
        public Criteria andHidIn(List<Long> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }
        public Criteria andHidNotIn(List<Long> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }
        public Criteria andHidBetween(Long value1, Long value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }
        public Criteria andHidNotBetween(Long value1, Long value2) {
            addCriterion("hid not between", value1, value2, "hid");
            return (Criteria) this;
        }
        public Criteria andPrizeIsNull() {
            addCriterion("prize is null");
            return (Criteria) this;
        }
        public Criteria andPrizeIsNotNull() {
            addCriterion("prize is not null");
            return (Criteria) this;
        }
        public Criteria andPrizeEqualTo(String value) {
            addCriterion("prize =", value, "prize");
            return (Criteria) this;
        }
        public Criteria andPrizeNotEqualTo(String value) {
            addCriterion("prize <>", value, "prize");
            return (Criteria) this;
        }
        public Criteria andPrizeGreaterThan(String value) {
            addCriterion("prize >", value, "prize");
            return (Criteria) this;
        }
        public Criteria andPrizeGreaterThanOrEqualTo(String value) {
            addCriterion("prize >=", value, "prize");
            return (Criteria) this;
        }
        public Criteria andPrizeLessThan(String value) {
            addCriterion("prize <", value, "prize");
            return (Criteria) this;
        }
        public Criteria andPrizeLessThanOrEqualTo(String value) {
            addCriterion("prize <=", value, "prize");
            return (Criteria) this;
        }
        public Criteria andPrizeLike(String value) {
            addCriterion("prize like", value, "prize");
            return (Criteria) this;
        }
        public Criteria andPrizeNotLike(String value) {
            addCriterion("prize not like", value, "prize");
            return (Criteria) this;
        }
        public Criteria andPrizeIn(List<String> values) {
            addCriterion("prize in", values, "prize");
            return (Criteria) this;
        }
        public Criteria andPrizeNotIn(List<String> values) {
            addCriterion("prize not in", values, "prize");
            return (Criteria) this;
        }
        public Criteria andPrizeBetween(String value1, String value2) {
            addCriterion("prize between", value1, value2, "prize");
            return (Criteria) this;
        }
        public Criteria andPrizeNotBetween(String value1, String value2) {
            addCriterion("prize not between", value1, value2, "prize");
            return (Criteria) this;
        }
        public Criteria andChanceIsNull() {
            addCriterion("chance is null");
            return (Criteria) this;
        }
        public Criteria andChanceIsNotNull() {
            addCriterion("chance is not null");
            return (Criteria) this;
        }
        public Criteria andChanceEqualTo(String value) {
            addCriterion("chance =", value, "chance");
            return (Criteria) this;
        }
        public Criteria andChanceNotEqualTo(String value) {
            addCriterion("chance <>", value, "chance");
            return (Criteria) this;
        }
        public Criteria andChanceGreaterThan(String value) {
            addCriterion("chance >", value, "chance");
            return (Criteria) this;
        }
        public Criteria andChanceGreaterThanOrEqualTo(String value) {
            addCriterion("chance >=", value, "chance");
            return (Criteria) this;
        }
        public Criteria andChanceLessThan(String value) {
            addCriterion("chance <", value, "chance");
            return (Criteria) this;
        }
        public Criteria andChanceLessThanOrEqualTo(String value) {
            addCriterion("chance <=", value, "chance");
            return (Criteria) this;
        }
        public Criteria andChanceLike(String value) {
            addCriterion("chance like", value, "chance");
            return (Criteria) this;
        }
        public Criteria andChanceNotLike(String value) {
            addCriterion("chance not like", value, "chance");
            return (Criteria) this;
        }
        public Criteria andChanceIn(List<String> values) {
            addCriterion("chance in", values, "chance");
            return (Criteria) this;
        }
        public Criteria andChanceNotIn(List<String> values) {
            addCriterion("chance not in", values, "chance");
            return (Criteria) this;
        }
        public Criteria andChanceBetween(String value1, String value2) {
            addCriterion("chance between", value1, value2, "chance");
            return (Criteria) this;
        }
        public Criteria andChanceNotBetween(String value1, String value2) {
            addCriterion("chance not between", value1, value2, "chance");
            return (Criteria) this;
        }
        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }
        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }
        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }
        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }
        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }
        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }
        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }
        public Criteria andPrizeLikeInsensitive(String value) {
            addCriterion("upper(prize) like", value.toUpperCase(), "prize");
            return (Criteria) this;
        }
        public Criteria andChanceLikeInsensitive(String value) {
            addCriterion("upper(chance) like", value.toUpperCase(), "chance");
            return (Criteria) this;
        }
        public Criteria andUrlLikeInsensitive(String value) {
            addCriterion("upper(url) like", value.toUpperCase(), "url");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author 菠萝大象
     * @version 1.0 2018-08-09
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