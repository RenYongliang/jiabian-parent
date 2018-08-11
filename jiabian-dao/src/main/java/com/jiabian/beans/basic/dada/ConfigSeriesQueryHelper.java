/*
 * ConfigSeriesQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-11 Created
 */
package com.jiabian.beans.basic.dada;

import java.util.ArrayList;
import java.util.List;

public class ConfigSeriesQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public ConfigSeriesQueryHelper() {
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
     * @version 1.0 2018-07-11
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
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }
        public Criteria andCx_idIsNull() {
            addCriterion("cx_id is null");
            return (Criteria) this;
        }
        public Criteria andCx_idIsNotNull() {
            addCriterion("cx_id is not null");
            return (Criteria) this;
        }
        public Criteria andCx_idEqualTo(String value) {
            addCriterion("cx_id =", value, "cx_id");
            return (Criteria) this;
        }
        public Criteria andCx_idNotEqualTo(String value) {
            addCriterion("cx_id <>", value, "cx_id");
            return (Criteria) this;
        }
        public Criteria andCx_idGreaterThan(String value) {
            addCriterion("cx_id >", value, "cx_id");
            return (Criteria) this;
        }
        public Criteria andCx_idGreaterThanOrEqualTo(String value) {
            addCriterion("cx_id >=", value, "cx_id");
            return (Criteria) this;
        }
        public Criteria andCx_idLessThan(String value) {
            addCriterion("cx_id <", value, "cx_id");
            return (Criteria) this;
        }
        public Criteria andCx_idLessThanOrEqualTo(String value) {
            addCriterion("cx_id <=", value, "cx_id");
            return (Criteria) this;
        }
        public Criteria andCx_idLike(String value) {
            addCriterion("cx_id like", value, "cx_id");
            return (Criteria) this;
        }
        public Criteria andCx_idNotLike(String value) {
            addCriterion("cx_id not like", value, "cx_id");
            return (Criteria) this;
        }
        public Criteria andCx_idIn(List<String> values) {
            addCriterion("cx_id in", values, "cx_id");
            return (Criteria) this;
        }
        public Criteria andCx_idNotIn(List<String> values) {
            addCriterion("cx_id not in", values, "cx_id");
            return (Criteria) this;
        }
        public Criteria andCx_idBetween(String value1, String value2) {
            addCriterion("cx_id between", value1, value2, "cx_id");
            return (Criteria) this;
        }
        public Criteria andCx_idNotBetween(String value1, String value2) {
            addCriterion("cx_id not between", value1, value2, "cx_id");
            return (Criteria) this;
        }
        public Criteria andZmIsNull() {
            addCriterion("zm is null");
            return (Criteria) this;
        }
        public Criteria andZmIsNotNull() {
            addCriterion("zm is not null");
            return (Criteria) this;
        }
        public Criteria andZmEqualTo(String value) {
            addCriterion("zm =", value, "zm");
            return (Criteria) this;
        }
        public Criteria andZmNotEqualTo(String value) {
            addCriterion("zm <>", value, "zm");
            return (Criteria) this;
        }
        public Criteria andZmGreaterThan(String value) {
            addCriterion("zm >", value, "zm");
            return (Criteria) this;
        }
        public Criteria andZmGreaterThanOrEqualTo(String value) {
            addCriterion("zm >=", value, "zm");
            return (Criteria) this;
        }
        public Criteria andZmLessThan(String value) {
            addCriterion("zm <", value, "zm");
            return (Criteria) this;
        }
        public Criteria andZmLessThanOrEqualTo(String value) {
            addCriterion("zm <=", value, "zm");
            return (Criteria) this;
        }
        public Criteria andZmLike(String value) {
            addCriterion("zm like", value, "zm");
            return (Criteria) this;
        }
        public Criteria andZmNotLike(String value) {
            addCriterion("zm not like", value, "zm");
            return (Criteria) this;
        }
        public Criteria andZmIn(List<String> values) {
            addCriterion("zm in", values, "zm");
            return (Criteria) this;
        }
        public Criteria andZmNotIn(List<String> values) {
            addCriterion("zm not in", values, "zm");
            return (Criteria) this;
        }
        public Criteria andZmBetween(String value1, String value2) {
            addCriterion("zm between", value1, value2, "zm");
            return (Criteria) this;
        }
        public Criteria andZmNotBetween(String value1, String value2) {
            addCriterion("zm not between", value1, value2, "zm");
            return (Criteria) this;
        }
        public Criteria andLogo_idIsNull() {
            addCriterion("logo_id is null");
            return (Criteria) this;
        }
        public Criteria andLogo_idIsNotNull() {
            addCriterion("logo_id is not null");
            return (Criteria) this;
        }
        public Criteria andLogo_idEqualTo(String value) {
            addCriterion("logo_id =", value, "logo_id");
            return (Criteria) this;
        }
        public Criteria andLogo_idNotEqualTo(String value) {
            addCriterion("logo_id <>", value, "logo_id");
            return (Criteria) this;
        }
        public Criteria andLogo_idGreaterThan(String value) {
            addCriterion("logo_id >", value, "logo_id");
            return (Criteria) this;
        }
        public Criteria andLogo_idGreaterThanOrEqualTo(String value) {
            addCriterion("logo_id >=", value, "logo_id");
            return (Criteria) this;
        }
        public Criteria andLogo_idLessThan(String value) {
            addCriterion("logo_id <", value, "logo_id");
            return (Criteria) this;
        }
        public Criteria andLogo_idLessThanOrEqualTo(String value) {
            addCriterion("logo_id <=", value, "logo_id");
            return (Criteria) this;
        }
        public Criteria andLogo_idLike(String value) {
            addCriterion("logo_id like", value, "logo_id");
            return (Criteria) this;
        }
        public Criteria andLogo_idNotLike(String value) {
            addCriterion("logo_id not like", value, "logo_id");
            return (Criteria) this;
        }
        public Criteria andLogo_idIn(List<String> values) {
            addCriterion("logo_id in", values, "logo_id");
            return (Criteria) this;
        }
        public Criteria andLogo_idNotIn(List<String> values) {
            addCriterion("logo_id not in", values, "logo_id");
            return (Criteria) this;
        }
        public Criteria andLogo_idBetween(String value1, String value2) {
            addCriterion("logo_id between", value1, value2, "logo_id");
            return (Criteria) this;
        }
        public Criteria andLogo_idNotBetween(String value1, String value2) {
            addCriterion("logo_id not between", value1, value2, "logo_id");
            return (Criteria) this;
        }
        public Criteria andChexiIsNull() {
            addCriterion("chexi is null");
            return (Criteria) this;
        }
        public Criteria andChexiIsNotNull() {
            addCriterion("chexi is not null");
            return (Criteria) this;
        }
        public Criteria andChexiEqualTo(String value) {
            addCriterion("chexi =", value, "chexi");
            return (Criteria) this;
        }
        public Criteria andChexiNotEqualTo(String value) {
            addCriterion("chexi <>", value, "chexi");
            return (Criteria) this;
        }
        public Criteria andChexiGreaterThan(String value) {
            addCriterion("chexi >", value, "chexi");
            return (Criteria) this;
        }
        public Criteria andChexiGreaterThanOrEqualTo(String value) {
            addCriterion("chexi >=", value, "chexi");
            return (Criteria) this;
        }
        public Criteria andChexiLessThan(String value) {
            addCriterion("chexi <", value, "chexi");
            return (Criteria) this;
        }
        public Criteria andChexiLessThanOrEqualTo(String value) {
            addCriterion("chexi <=", value, "chexi");
            return (Criteria) this;
        }
        public Criteria andChexiLike(String value) {
            addCriterion("chexi like", value, "chexi");
            return (Criteria) this;
        }
        public Criteria andChexiNotLike(String value) {
            addCriterion("chexi not like", value, "chexi");
            return (Criteria) this;
        }
        public Criteria andChexiIn(List<String> values) {
            addCriterion("chexi in", values, "chexi");
            return (Criteria) this;
        }
        public Criteria andChexiNotIn(List<String> values) {
            addCriterion("chexi not in", values, "chexi");
            return (Criteria) this;
        }
        public Criteria andChexiBetween(String value1, String value2) {
            addCriterion("chexi between", value1, value2, "chexi");
            return (Criteria) this;
        }
        public Criteria andChexiNotBetween(String value1, String value2) {
            addCriterion("chexi not between", value1, value2, "chexi");
            return (Criteria) this;
        }
        public Criteria andChangjiaIsNull() {
            addCriterion("changjia is null");
            return (Criteria) this;
        }
        public Criteria andChangjiaIsNotNull() {
            addCriterion("changjia is not null");
            return (Criteria) this;
        }
        public Criteria andChangjiaEqualTo(String value) {
            addCriterion("changjia =", value, "changjia");
            return (Criteria) this;
        }
        public Criteria andChangjiaNotEqualTo(String value) {
            addCriterion("changjia <>", value, "changjia");
            return (Criteria) this;
        }
        public Criteria andChangjiaGreaterThan(String value) {
            addCriterion("changjia >", value, "changjia");
            return (Criteria) this;
        }
        public Criteria andChangjiaGreaterThanOrEqualTo(String value) {
            addCriterion("changjia >=", value, "changjia");
            return (Criteria) this;
        }
        public Criteria andChangjiaLessThan(String value) {
            addCriterion("changjia <", value, "changjia");
            return (Criteria) this;
        }
        public Criteria andChangjiaLessThanOrEqualTo(String value) {
            addCriterion("changjia <=", value, "changjia");
            return (Criteria) this;
        }
        public Criteria andChangjiaLike(String value) {
            addCriterion("changjia like", value, "changjia");
            return (Criteria) this;
        }
        public Criteria andChangjiaNotLike(String value) {
            addCriterion("changjia not like", value, "changjia");
            return (Criteria) this;
        }
        public Criteria andChangjiaIn(List<String> values) {
            addCriterion("changjia in", values, "changjia");
            return (Criteria) this;
        }
        public Criteria andChangjiaNotIn(List<String> values) {
            addCriterion("changjia not in", values, "changjia");
            return (Criteria) this;
        }
        public Criteria andChangjiaBetween(String value1, String value2) {
            addCriterion("changjia between", value1, value2, "changjia");
            return (Criteria) this;
        }
        public Criteria andChangjiaNotBetween(String value1, String value2) {
            addCriterion("changjia not between", value1, value2, "changjia");
            return (Criteria) this;
        }
        public Criteria andDijiaIsNull() {
            addCriterion("dijia is null");
            return (Criteria) this;
        }
        public Criteria andDijiaIsNotNull() {
            addCriterion("dijia is not null");
            return (Criteria) this;
        }
        public Criteria andDijiaEqualTo(String value) {
            addCriterion("dijia =", value, "dijia");
            return (Criteria) this;
        }
        public Criteria andDijiaNotEqualTo(String value) {
            addCriterion("dijia <>", value, "dijia");
            return (Criteria) this;
        }
        public Criteria andDijiaGreaterThan(String value) {
            addCriterion("dijia >", value, "dijia");
            return (Criteria) this;
        }
        public Criteria andDijiaGreaterThanOrEqualTo(String value) {
            addCriterion("dijia >=", value, "dijia");
            return (Criteria) this;
        }
        public Criteria andDijiaLessThan(String value) {
            addCriterion("dijia <", value, "dijia");
            return (Criteria) this;
        }
        public Criteria andDijiaLessThanOrEqualTo(String value) {
            addCriterion("dijia <=", value, "dijia");
            return (Criteria) this;
        }
        public Criteria andDijiaLike(String value) {
            addCriterion("dijia like", value, "dijia");
            return (Criteria) this;
        }
        public Criteria andDijiaNotLike(String value) {
            addCriterion("dijia not like", value, "dijia");
            return (Criteria) this;
        }
        public Criteria andDijiaIn(List<String> values) {
            addCriterion("dijia in", values, "dijia");
            return (Criteria) this;
        }
        public Criteria andDijiaNotIn(List<String> values) {
            addCriterion("dijia not in", values, "dijia");
            return (Criteria) this;
        }
        public Criteria andDijiaBetween(String value1, String value2) {
            addCriterion("dijia between", value1, value2, "dijia");
            return (Criteria) this;
        }
        public Criteria andDijiaNotBetween(String value1, String value2) {
            addCriterion("dijia not between", value1, value2, "dijia");
            return (Criteria) this;
        }
        public Criteria andGaojiaIsNull() {
            addCriterion("gaojia is null");
            return (Criteria) this;
        }
        public Criteria andGaojiaIsNotNull() {
            addCriterion("gaojia is not null");
            return (Criteria) this;
        }
        public Criteria andGaojiaEqualTo(String value) {
            addCriterion("gaojia =", value, "gaojia");
            return (Criteria) this;
        }
        public Criteria andGaojiaNotEqualTo(String value) {
            addCriterion("gaojia <>", value, "gaojia");
            return (Criteria) this;
        }
        public Criteria andGaojiaGreaterThan(String value) {
            addCriterion("gaojia >", value, "gaojia");
            return (Criteria) this;
        }
        public Criteria andGaojiaGreaterThanOrEqualTo(String value) {
            addCriterion("gaojia >=", value, "gaojia");
            return (Criteria) this;
        }
        public Criteria andGaojiaLessThan(String value) {
            addCriterion("gaojia <", value, "gaojia");
            return (Criteria) this;
        }
        public Criteria andGaojiaLessThanOrEqualTo(String value) {
            addCriterion("gaojia <=", value, "gaojia");
            return (Criteria) this;
        }
        public Criteria andGaojiaLike(String value) {
            addCriterion("gaojia like", value, "gaojia");
            return (Criteria) this;
        }
        public Criteria andGaojiaNotLike(String value) {
            addCriterion("gaojia not like", value, "gaojia");
            return (Criteria) this;
        }
        public Criteria andGaojiaIn(List<String> values) {
            addCriterion("gaojia in", values, "gaojia");
            return (Criteria) this;
        }
        public Criteria andGaojiaNotIn(List<String> values) {
            addCriterion("gaojia not in", values, "gaojia");
            return (Criteria) this;
        }
        public Criteria andGaojiaBetween(String value1, String value2) {
            addCriterion("gaojia between", value1, value2, "gaojia");
            return (Criteria) this;
        }
        public Criteria andGaojiaNotBetween(String value1, String value2) {
            addCriterion("gaojia not between", value1, value2, "gaojia");
            return (Criteria) this;
        }
        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }
        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }
        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }
        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }
        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }
        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }
        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }
        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }
        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }
        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }
        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }
        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }
        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }
        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }
        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }
        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }
        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }
        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }
        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }
        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }
        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }
        public Criteria andCx_idLikeInsensitive(String value) {
            addCriterion("upper(cx_id) like", value.toUpperCase(), "cx_id");
            return (Criteria) this;
        }
        public Criteria andZmLikeInsensitive(String value) {
            addCriterion("upper(zm) like", value.toUpperCase(), "zm");
            return (Criteria) this;
        }
        public Criteria andLogo_idLikeInsensitive(String value) {
            addCriterion("upper(logo_id) like", value.toUpperCase(), "logo_id");
            return (Criteria) this;
        }
        public Criteria andChexiLikeInsensitive(String value) {
            addCriterion("upper(chexi) like", value.toUpperCase(), "chexi");
            return (Criteria) this;
        }
        public Criteria andChangjiaLikeInsensitive(String value) {
            addCriterion("upper(changjia) like", value.toUpperCase(), "changjia");
            return (Criteria) this;
        }
        public Criteria andDijiaLikeInsensitive(String value) {
            addCriterion("upper(dijia) like", value.toUpperCase(), "dijia");
            return (Criteria) this;
        }
        public Criteria andGaojiaLikeInsensitive(String value) {
            addCriterion("upper(gaojia) like", value.toUpperCase(), "gaojia");
            return (Criteria) this;
        }
        public Criteria andImgLikeInsensitive(String value) {
            addCriterion("upper(img) like", value.toUpperCase(), "img");
            return (Criteria) this;
        }
        public Criteria andTimeLikeInsensitive(String value) {
            addCriterion("upper(time) like", value.toUpperCase(), "time");
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
     * @version 1.0 2018-07-11
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