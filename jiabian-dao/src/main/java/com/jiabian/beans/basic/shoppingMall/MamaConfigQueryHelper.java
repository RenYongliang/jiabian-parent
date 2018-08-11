/*
 * MamaConfigQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-08-06 Created
 */
package com.jiabian.beans.basic.shoppingMall;

import java.util.ArrayList;
import java.util.List;

public class MamaConfigQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public MamaConfigQueryHelper() {
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
        public Criteria andKeyIsNull() {
            addCriterion("key is null");
            return (Criteria) this;
        }
        public Criteria andKeyIsNotNull() {
            addCriterion("key is not null");
            return (Criteria) this;
        }
        public Criteria andKeyEqualTo(String value) {
            addCriterion("key =", value, "key");
            return (Criteria) this;
        }
        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("key <>", value, "key");
            return (Criteria) this;
        }
        public Criteria andKeyGreaterThan(String value) {
            addCriterion("key >", value, "key");
            return (Criteria) this;
        }
        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("key >=", value, "key");
            return (Criteria) this;
        }
        public Criteria andKeyLessThan(String value) {
            addCriterion("key <", value, "key");
            return (Criteria) this;
        }
        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("key <=", value, "key");
            return (Criteria) this;
        }
        public Criteria andKeyLike(String value) {
            addCriterion("key like", value, "key");
            return (Criteria) this;
        }
        public Criteria andKeyNotLike(String value) {
            addCriterion("key not like", value, "key");
            return (Criteria) this;
        }
        public Criteria andKeyIn(List<String> values) {
            addCriterion("key in", values, "key");
            return (Criteria) this;
        }
        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("key not in", values, "key");
            return (Criteria) this;
        }
        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("key between", value1, value2, "key");
            return (Criteria) this;
        }
        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("key not between", value1, value2, "key");
            return (Criteria) this;
        }
        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }
        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }
        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }
        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }
        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }
        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }
        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }
        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }
        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }
        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }
        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }
        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }
        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }
        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }
        public Criteria andMch_idIsNull() {
            addCriterion("mch_id is null");
            return (Criteria) this;
        }
        public Criteria andMch_idIsNotNull() {
            addCriterion("mch_id is not null");
            return (Criteria) this;
        }
        public Criteria andMch_idEqualTo(String value) {
            addCriterion("mch_id =", value, "mch_id");
            return (Criteria) this;
        }
        public Criteria andMch_idNotEqualTo(String value) {
            addCriterion("mch_id <>", value, "mch_id");
            return (Criteria) this;
        }
        public Criteria andMch_idGreaterThan(String value) {
            addCriterion("mch_id >", value, "mch_id");
            return (Criteria) this;
        }
        public Criteria andMch_idGreaterThanOrEqualTo(String value) {
            addCriterion("mch_id >=", value, "mch_id");
            return (Criteria) this;
        }
        public Criteria andMch_idLessThan(String value) {
            addCriterion("mch_id <", value, "mch_id");
            return (Criteria) this;
        }
        public Criteria andMch_idLessThanOrEqualTo(String value) {
            addCriterion("mch_id <=", value, "mch_id");
            return (Criteria) this;
        }
        public Criteria andMch_idLike(String value) {
            addCriterion("mch_id like", value, "mch_id");
            return (Criteria) this;
        }
        public Criteria andMch_idNotLike(String value) {
            addCriterion("mch_id not like", value, "mch_id");
            return (Criteria) this;
        }
        public Criteria andMch_idIn(List<String> values) {
            addCriterion("mch_id in", values, "mch_id");
            return (Criteria) this;
        }
        public Criteria andMch_idNotIn(List<String> values) {
            addCriterion("mch_id not in", values, "mch_id");
            return (Criteria) this;
        }
        public Criteria andMch_idBetween(String value1, String value2) {
            addCriterion("mch_id between", value1, value2, "mch_id");
            return (Criteria) this;
        }
        public Criteria andMch_idNotBetween(String value1, String value2) {
            addCriterion("mch_id not between", value1, value2, "mch_id");
            return (Criteria) this;
        }
        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }
        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }
        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }
        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }
        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }
        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }
        public Criteria andMch_keyIsNull() {
            addCriterion("mch_key is null");
            return (Criteria) this;
        }
        public Criteria andMch_keyIsNotNull() {
            addCriterion("mch_key is not null");
            return (Criteria) this;
        }
        public Criteria andMch_keyEqualTo(String value) {
            addCriterion("mch_key =", value, "mch_key");
            return (Criteria) this;
        }
        public Criteria andMch_keyNotEqualTo(String value) {
            addCriterion("mch_key <>", value, "mch_key");
            return (Criteria) this;
        }
        public Criteria andMch_keyGreaterThan(String value) {
            addCriterion("mch_key >", value, "mch_key");
            return (Criteria) this;
        }
        public Criteria andMch_keyGreaterThanOrEqualTo(String value) {
            addCriterion("mch_key >=", value, "mch_key");
            return (Criteria) this;
        }
        public Criteria andMch_keyLessThan(String value) {
            addCriterion("mch_key <", value, "mch_key");
            return (Criteria) this;
        }
        public Criteria andMch_keyLessThanOrEqualTo(String value) {
            addCriterion("mch_key <=", value, "mch_key");
            return (Criteria) this;
        }
        public Criteria andMch_keyLike(String value) {
            addCriterion("mch_key like", value, "mch_key");
            return (Criteria) this;
        }
        public Criteria andMch_keyNotLike(String value) {
            addCriterion("mch_key not like", value, "mch_key");
            return (Criteria) this;
        }
        public Criteria andMch_keyIn(List<String> values) {
            addCriterion("mch_key in", values, "mch_key");
            return (Criteria) this;
        }
        public Criteria andMch_keyNotIn(List<String> values) {
            addCriterion("mch_key not in", values, "mch_key");
            return (Criteria) this;
        }
        public Criteria andMch_keyBetween(String value1, String value2) {
            addCriterion("mch_key between", value1, value2, "mch_key");
            return (Criteria) this;
        }
        public Criteria andMch_keyNotBetween(String value1, String value2) {
            addCriterion("mch_key not between", value1, value2, "mch_key");
            return (Criteria) this;
        }
        public Criteria andNotify_urlIsNull() {
            addCriterion("notify_url is null");
            return (Criteria) this;
        }
        public Criteria andNotify_urlIsNotNull() {
            addCriterion("notify_url is not null");
            return (Criteria) this;
        }
        public Criteria andNotify_urlEqualTo(String value) {
            addCriterion("notify_url =", value, "notify_url");
            return (Criteria) this;
        }
        public Criteria andNotify_urlNotEqualTo(String value) {
            addCriterion("notify_url <>", value, "notify_url");
            return (Criteria) this;
        }
        public Criteria andNotify_urlGreaterThan(String value) {
            addCriterion("notify_url >", value, "notify_url");
            return (Criteria) this;
        }
        public Criteria andNotify_urlGreaterThanOrEqualTo(String value) {
            addCriterion("notify_url >=", value, "notify_url");
            return (Criteria) this;
        }
        public Criteria andNotify_urlLessThan(String value) {
            addCriterion("notify_url <", value, "notify_url");
            return (Criteria) this;
        }
        public Criteria andNotify_urlLessThanOrEqualTo(String value) {
            addCriterion("notify_url <=", value, "notify_url");
            return (Criteria) this;
        }
        public Criteria andNotify_urlLike(String value) {
            addCriterion("notify_url like", value, "notify_url");
            return (Criteria) this;
        }
        public Criteria andNotify_urlNotLike(String value) {
            addCriterion("notify_url not like", value, "notify_url");
            return (Criteria) this;
        }
        public Criteria andNotify_urlIn(List<String> values) {
            addCriterion("notify_url in", values, "notify_url");
            return (Criteria) this;
        }
        public Criteria andNotify_urlNotIn(List<String> values) {
            addCriterion("notify_url not in", values, "notify_url");
            return (Criteria) this;
        }
        public Criteria andNotify_urlBetween(String value1, String value2) {
            addCriterion("notify_url between", value1, value2, "notify_url");
            return (Criteria) this;
        }
        public Criteria andNotify_urlNotBetween(String value1, String value2) {
            addCriterion("notify_url not between", value1, value2, "notify_url");
            return (Criteria) this;
        }
        public Criteria andKeyLikeInsensitive(String value) {
            addCriterion("upper(key) like", value.toUpperCase(), "key");
            return (Criteria) this;
        }
        public Criteria andValueLikeInsensitive(String value) {
            addCriterion("upper(value) like", value.toUpperCase(), "value");
            return (Criteria) this;
        }
        public Criteria andMch_idLikeInsensitive(String value) {
            addCriterion("upper(mch_id) like", value.toUpperCase(), "mch_id");
            return (Criteria) this;
        }
        public Criteria andMch_keyLikeInsensitive(String value) {
            addCriterion("upper(mch_key) like", value.toUpperCase(), "mch_key");
            return (Criteria) this;
        }
        public Criteria andNotify_urlLikeInsensitive(String value) {
            addCriterion("upper(notify_url) like", value.toUpperCase(), "notify_url");
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