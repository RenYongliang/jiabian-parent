/*
 * ConfigCarQueryHelper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-11 Created
 */
package com.jiabian.beans.basic.dada;

import java.util.ArrayList;
import java.util.List;

public class ConfigCarQueryHelper {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public ConfigCarQueryHelper() {
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
        public Criteria andPinpaiIsNull() {
            addCriterion("pinpai is null");
            return (Criteria) this;
        }
        public Criteria andPinpaiIsNotNull() {
            addCriterion("pinpai is not null");
            return (Criteria) this;
        }
        public Criteria andPinpaiEqualTo(String value) {
            addCriterion("pinpai =", value, "pinpai");
            return (Criteria) this;
        }
        public Criteria andPinpaiNotEqualTo(String value) {
            addCriterion("pinpai <>", value, "pinpai");
            return (Criteria) this;
        }
        public Criteria andPinpaiGreaterThan(String value) {
            addCriterion("pinpai >", value, "pinpai");
            return (Criteria) this;
        }
        public Criteria andPinpaiGreaterThanOrEqualTo(String value) {
            addCriterion("pinpai >=", value, "pinpai");
            return (Criteria) this;
        }
        public Criteria andPinpaiLessThan(String value) {
            addCriterion("pinpai <", value, "pinpai");
            return (Criteria) this;
        }
        public Criteria andPinpaiLessThanOrEqualTo(String value) {
            addCriterion("pinpai <=", value, "pinpai");
            return (Criteria) this;
        }
        public Criteria andPinpaiLike(String value) {
            addCriterion("pinpai like", value, "pinpai");
            return (Criteria) this;
        }
        public Criteria andPinpaiNotLike(String value) {
            addCriterion("pinpai not like", value, "pinpai");
            return (Criteria) this;
        }
        public Criteria andPinpaiIn(List<String> values) {
            addCriterion("pinpai in", values, "pinpai");
            return (Criteria) this;
        }
        public Criteria andPinpaiNotIn(List<String> values) {
            addCriterion("pinpai not in", values, "pinpai");
            return (Criteria) this;
        }
        public Criteria andPinpaiBetween(String value1, String value2) {
            addCriterion("pinpai between", value1, value2, "pinpai");
            return (Criteria) this;
        }
        public Criteria andPinpaiNotBetween(String value1, String value2) {
            addCriterion("pinpai not between", value1, value2, "pinpai");
            return (Criteria) this;
        }
        public Criteria andPinpai_idIsNull() {
            addCriterion("pinpai_id is null");
            return (Criteria) this;
        }
        public Criteria andPinpai_idIsNotNull() {
            addCriterion("pinpai_id is not null");
            return (Criteria) this;
        }
        public Criteria andPinpai_idEqualTo(String value) {
            addCriterion("pinpai_id =", value, "pinpai_id");
            return (Criteria) this;
        }
        public Criteria andPinpai_idNotEqualTo(String value) {
            addCriterion("pinpai_id <>", value, "pinpai_id");
            return (Criteria) this;
        }
        public Criteria andPinpai_idGreaterThan(String value) {
            addCriterion("pinpai_id >", value, "pinpai_id");
            return (Criteria) this;
        }
        public Criteria andPinpai_idGreaterThanOrEqualTo(String value) {
            addCriterion("pinpai_id >=", value, "pinpai_id");
            return (Criteria) this;
        }
        public Criteria andPinpai_idLessThan(String value) {
            addCriterion("pinpai_id <", value, "pinpai_id");
            return (Criteria) this;
        }
        public Criteria andPinpai_idLessThanOrEqualTo(String value) {
            addCriterion("pinpai_id <=", value, "pinpai_id");
            return (Criteria) this;
        }
        public Criteria andPinpai_idLike(String value) {
            addCriterion("pinpai_id like", value, "pinpai_id");
            return (Criteria) this;
        }
        public Criteria andPinpai_idNotLike(String value) {
            addCriterion("pinpai_id not like", value, "pinpai_id");
            return (Criteria) this;
        }
        public Criteria andPinpai_idIn(List<String> values) {
            addCriterion("pinpai_id in", values, "pinpai_id");
            return (Criteria) this;
        }
        public Criteria andPinpai_idNotIn(List<String> values) {
            addCriterion("pinpai_id not in", values, "pinpai_id");
            return (Criteria) this;
        }
        public Criteria andPinpai_idBetween(String value1, String value2) {
            addCriterion("pinpai_id between", value1, value2, "pinpai_id");
            return (Criteria) this;
        }
        public Criteria andPinpai_idNotBetween(String value1, String value2) {
            addCriterion("pinpai_id not between", value1, value2, "pinpai_id");
            return (Criteria) this;
        }
        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }
        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }
        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }
        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }
        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }
        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }
        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }
        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }
        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }
        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }
        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }
        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }
        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }
        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
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
        public Criteria andChexi_idIsNull() {
            addCriterion("chexi_id is null");
            return (Criteria) this;
        }
        public Criteria andChexi_idIsNotNull() {
            addCriterion("chexi_id is not null");
            return (Criteria) this;
        }
        public Criteria andChexi_idEqualTo(String value) {
            addCriterion("chexi_id =", value, "chexi_id");
            return (Criteria) this;
        }
        public Criteria andChexi_idNotEqualTo(String value) {
            addCriterion("chexi_id <>", value, "chexi_id");
            return (Criteria) this;
        }
        public Criteria andChexi_idGreaterThan(String value) {
            addCriterion("chexi_id >", value, "chexi_id");
            return (Criteria) this;
        }
        public Criteria andChexi_idGreaterThanOrEqualTo(String value) {
            addCriterion("chexi_id >=", value, "chexi_id");
            return (Criteria) this;
        }
        public Criteria andChexi_idLessThan(String value) {
            addCriterion("chexi_id <", value, "chexi_id");
            return (Criteria) this;
        }
        public Criteria andChexi_idLessThanOrEqualTo(String value) {
            addCriterion("chexi_id <=", value, "chexi_id");
            return (Criteria) this;
        }
        public Criteria andChexi_idLike(String value) {
            addCriterion("chexi_id like", value, "chexi_id");
            return (Criteria) this;
        }
        public Criteria andChexi_idNotLike(String value) {
            addCriterion("chexi_id not like", value, "chexi_id");
            return (Criteria) this;
        }
        public Criteria andChexi_idIn(List<String> values) {
            addCriterion("chexi_id in", values, "chexi_id");
            return (Criteria) this;
        }
        public Criteria andChexi_idNotIn(List<String> values) {
            addCriterion("chexi_id not in", values, "chexi_id");
            return (Criteria) this;
        }
        public Criteria andChexi_idBetween(String value1, String value2) {
            addCriterion("chexi_id between", value1, value2, "chexi_id");
            return (Criteria) this;
        }
        public Criteria andChexi_idNotBetween(String value1, String value2) {
            addCriterion("chexi_id not between", value1, value2, "chexi_id");
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
        public Criteria andChemingIsNull() {
            addCriterion("cheming is null");
            return (Criteria) this;
        }
        public Criteria andChemingIsNotNull() {
            addCriterion("cheming is not null");
            return (Criteria) this;
        }
        public Criteria andChemingEqualTo(String value) {
            addCriterion("cheming =", value, "cheming");
            return (Criteria) this;
        }
        public Criteria andChemingNotEqualTo(String value) {
            addCriterion("cheming <>", value, "cheming");
            return (Criteria) this;
        }
        public Criteria andChemingGreaterThan(String value) {
            addCriterion("cheming >", value, "cheming");
            return (Criteria) this;
        }
        public Criteria andChemingGreaterThanOrEqualTo(String value) {
            addCriterion("cheming >=", value, "cheming");
            return (Criteria) this;
        }
        public Criteria andChemingLessThan(String value) {
            addCriterion("cheming <", value, "cheming");
            return (Criteria) this;
        }
        public Criteria andChemingLessThanOrEqualTo(String value) {
            addCriterion("cheming <=", value, "cheming");
            return (Criteria) this;
        }
        public Criteria andChemingLike(String value) {
            addCriterion("cheming like", value, "cheming");
            return (Criteria) this;
        }
        public Criteria andChemingNotLike(String value) {
            addCriterion("cheming not like", value, "cheming");
            return (Criteria) this;
        }
        public Criteria andChemingIn(List<String> values) {
            addCriterion("cheming in", values, "cheming");
            return (Criteria) this;
        }
        public Criteria andChemingNotIn(List<String> values) {
            addCriterion("cheming not in", values, "cheming");
            return (Criteria) this;
        }
        public Criteria andChemingBetween(String value1, String value2) {
            addCriterion("cheming between", value1, value2, "cheming");
            return (Criteria) this;
        }
        public Criteria andChemingNotBetween(String value1, String value2) {
            addCriterion("cheming not between", value1, value2, "cheming");
            return (Criteria) this;
        }
        public Criteria andChexing_idIsNull() {
            addCriterion("chexing_id is null");
            return (Criteria) this;
        }
        public Criteria andChexing_idIsNotNull() {
            addCriterion("chexing_id is not null");
            return (Criteria) this;
        }
        public Criteria andChexing_idEqualTo(String value) {
            addCriterion("chexing_id =", value, "chexing_id");
            return (Criteria) this;
        }
        public Criteria andChexing_idNotEqualTo(String value) {
            addCriterion("chexing_id <>", value, "chexing_id");
            return (Criteria) this;
        }
        public Criteria andChexing_idGreaterThan(String value) {
            addCriterion("chexing_id >", value, "chexing_id");
            return (Criteria) this;
        }
        public Criteria andChexing_idGreaterThanOrEqualTo(String value) {
            addCriterion("chexing_id >=", value, "chexing_id");
            return (Criteria) this;
        }
        public Criteria andChexing_idLessThan(String value) {
            addCriterion("chexing_id <", value, "chexing_id");
            return (Criteria) this;
        }
        public Criteria andChexing_idLessThanOrEqualTo(String value) {
            addCriterion("chexing_id <=", value, "chexing_id");
            return (Criteria) this;
        }
        public Criteria andChexing_idLike(String value) {
            addCriterion("chexing_id like", value, "chexing_id");
            return (Criteria) this;
        }
        public Criteria andChexing_idNotLike(String value) {
            addCriterion("chexing_id not like", value, "chexing_id");
            return (Criteria) this;
        }
        public Criteria andChexing_idIn(List<String> values) {
            addCriterion("chexing_id in", values, "chexing_id");
            return (Criteria) this;
        }
        public Criteria andChexing_idNotIn(List<String> values) {
            addCriterion("chexing_id not in", values, "chexing_id");
            return (Criteria) this;
        }
        public Criteria andChexing_idBetween(String value1, String value2) {
            addCriterion("chexing_id between", value1, value2, "chexing_id");
            return (Criteria) this;
        }
        public Criteria andChexing_idNotBetween(String value1, String value2) {
            addCriterion("chexing_id not between", value1, value2, "chexing_id");
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
        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }
        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }
        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }
        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }
        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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
        public Criteria andNiankuanIsNull() {
            addCriterion("niankuan is null");
            return (Criteria) this;
        }
        public Criteria andNiankuanIsNotNull() {
            addCriterion("niankuan is not null");
            return (Criteria) this;
        }
        public Criteria andNiankuanEqualTo(String value) {
            addCriterion("niankuan =", value, "niankuan");
            return (Criteria) this;
        }
        public Criteria andNiankuanNotEqualTo(String value) {
            addCriterion("niankuan <>", value, "niankuan");
            return (Criteria) this;
        }
        public Criteria andNiankuanGreaterThan(String value) {
            addCriterion("niankuan >", value, "niankuan");
            return (Criteria) this;
        }
        public Criteria andNiankuanGreaterThanOrEqualTo(String value) {
            addCriterion("niankuan >=", value, "niankuan");
            return (Criteria) this;
        }
        public Criteria andNiankuanLessThan(String value) {
            addCriterion("niankuan <", value, "niankuan");
            return (Criteria) this;
        }
        public Criteria andNiankuanLessThanOrEqualTo(String value) {
            addCriterion("niankuan <=", value, "niankuan");
            return (Criteria) this;
        }
        public Criteria andNiankuanLike(String value) {
            addCriterion("niankuan like", value, "niankuan");
            return (Criteria) this;
        }
        public Criteria andNiankuanNotLike(String value) {
            addCriterion("niankuan not like", value, "niankuan");
            return (Criteria) this;
        }
        public Criteria andNiankuanIn(List<String> values) {
            addCriterion("niankuan in", values, "niankuan");
            return (Criteria) this;
        }
        public Criteria andNiankuanNotIn(List<String> values) {
            addCriterion("niankuan not in", values, "niankuan");
            return (Criteria) this;
        }
        public Criteria andNiankuanBetween(String value1, String value2) {
            addCriterion("niankuan between", value1, value2, "niankuan");
            return (Criteria) this;
        }
        public Criteria andNiankuanNotBetween(String value1, String value2) {
            addCriterion("niankuan not between", value1, value2, "niankuan");
            return (Criteria) this;
        }
        public Criteria andGengxin_timeIsNull() {
            addCriterion("gengxin_time is null");
            return (Criteria) this;
        }
        public Criteria andGengxin_timeIsNotNull() {
            addCriterion("gengxin_time is not null");
            return (Criteria) this;
        }
        public Criteria andGengxin_timeEqualTo(String value) {
            addCriterion("gengxin_time =", value, "gengxin_time");
            return (Criteria) this;
        }
        public Criteria andGengxin_timeNotEqualTo(String value) {
            addCriterion("gengxin_time <>", value, "gengxin_time");
            return (Criteria) this;
        }
        public Criteria andGengxin_timeGreaterThan(String value) {
            addCriterion("gengxin_time >", value, "gengxin_time");
            return (Criteria) this;
        }
        public Criteria andGengxin_timeGreaterThanOrEqualTo(String value) {
            addCriterion("gengxin_time >=", value, "gengxin_time");
            return (Criteria) this;
        }
        public Criteria andGengxin_timeLessThan(String value) {
            addCriterion("gengxin_time <", value, "gengxin_time");
            return (Criteria) this;
        }
        public Criteria andGengxin_timeLessThanOrEqualTo(String value) {
            addCriterion("gengxin_time <=", value, "gengxin_time");
            return (Criteria) this;
        }
        public Criteria andGengxin_timeLike(String value) {
            addCriterion("gengxin_time like", value, "gengxin_time");
            return (Criteria) this;
        }
        public Criteria andGengxin_timeNotLike(String value) {
            addCriterion("gengxin_time not like", value, "gengxin_time");
            return (Criteria) this;
        }
        public Criteria andGengxin_timeIn(List<String> values) {
            addCriterion("gengxin_time in", values, "gengxin_time");
            return (Criteria) this;
        }
        public Criteria andGengxin_timeNotIn(List<String> values) {
            addCriterion("gengxin_time not in", values, "gengxin_time");
            return (Criteria) this;
        }
        public Criteria andGengxin_timeBetween(String value1, String value2) {
            addCriterion("gengxin_time between", value1, value2, "gengxin_time");
            return (Criteria) this;
        }
        public Criteria andGengxin_timeNotBetween(String value1, String value2) {
            addCriterion("gengxin_time not between", value1, value2, "gengxin_time");
            return (Criteria) this;
        }
        public Criteria andShangshi_timeIsNull() {
            addCriterion("shangshi_time is null");
            return (Criteria) this;
        }
        public Criteria andShangshi_timeIsNotNull() {
            addCriterion("shangshi_time is not null");
            return (Criteria) this;
        }
        public Criteria andShangshi_timeEqualTo(String value) {
            addCriterion("shangshi_time =", value, "shangshi_time");
            return (Criteria) this;
        }
        public Criteria andShangshi_timeNotEqualTo(String value) {
            addCriterion("shangshi_time <>", value, "shangshi_time");
            return (Criteria) this;
        }
        public Criteria andShangshi_timeGreaterThan(String value) {
            addCriterion("shangshi_time >", value, "shangshi_time");
            return (Criteria) this;
        }
        public Criteria andShangshi_timeGreaterThanOrEqualTo(String value) {
            addCriterion("shangshi_time >=", value, "shangshi_time");
            return (Criteria) this;
        }
        public Criteria andShangshi_timeLessThan(String value) {
            addCriterion("shangshi_time <", value, "shangshi_time");
            return (Criteria) this;
        }
        public Criteria andShangshi_timeLessThanOrEqualTo(String value) {
            addCriterion("shangshi_time <=", value, "shangshi_time");
            return (Criteria) this;
        }
        public Criteria andShangshi_timeLike(String value) {
            addCriterion("shangshi_time like", value, "shangshi_time");
            return (Criteria) this;
        }
        public Criteria andShangshi_timeNotLike(String value) {
            addCriterion("shangshi_time not like", value, "shangshi_time");
            return (Criteria) this;
        }
        public Criteria andShangshi_timeIn(List<String> values) {
            addCriterion("shangshi_time in", values, "shangshi_time");
            return (Criteria) this;
        }
        public Criteria andShangshi_timeNotIn(List<String> values) {
            addCriterion("shangshi_time not in", values, "shangshi_time");
            return (Criteria) this;
        }
        public Criteria andShangshi_timeBetween(String value1, String value2) {
            addCriterion("shangshi_time between", value1, value2, "shangshi_time");
            return (Criteria) this;
        }
        public Criteria andShangshi_timeNotBetween(String value1, String value2) {
            addCriterion("shangshi_time not between", value1, value2, "shangshi_time");
            return (Criteria) this;
        }
        public Criteria andZhidaojiaIsNull() {
            addCriterion("zhidaojia is null");
            return (Criteria) this;
        }
        public Criteria andZhidaojiaIsNotNull() {
            addCriterion("zhidaojia is not null");
            return (Criteria) this;
        }
        public Criteria andZhidaojiaEqualTo(String value) {
            addCriterion("zhidaojia =", value, "zhidaojia");
            return (Criteria) this;
        }
        public Criteria andZhidaojiaNotEqualTo(String value) {
            addCriterion("zhidaojia <>", value, "zhidaojia");
            return (Criteria) this;
        }
        public Criteria andZhidaojiaGreaterThan(String value) {
            addCriterion("zhidaojia >", value, "zhidaojia");
            return (Criteria) this;
        }
        public Criteria andZhidaojiaGreaterThanOrEqualTo(String value) {
            addCriterion("zhidaojia >=", value, "zhidaojia");
            return (Criteria) this;
        }
        public Criteria andZhidaojiaLessThan(String value) {
            addCriterion("zhidaojia <", value, "zhidaojia");
            return (Criteria) this;
        }
        public Criteria andZhidaojiaLessThanOrEqualTo(String value) {
            addCriterion("zhidaojia <=", value, "zhidaojia");
            return (Criteria) this;
        }
        public Criteria andZhidaojiaLike(String value) {
            addCriterion("zhidaojia like", value, "zhidaojia");
            return (Criteria) this;
        }
        public Criteria andZhidaojiaNotLike(String value) {
            addCriterion("zhidaojia not like", value, "zhidaojia");
            return (Criteria) this;
        }
        public Criteria andZhidaojiaIn(List<String> values) {
            addCriterion("zhidaojia in", values, "zhidaojia");
            return (Criteria) this;
        }
        public Criteria andZhidaojiaNotIn(List<String> values) {
            addCriterion("zhidaojia not in", values, "zhidaojia");
            return (Criteria) this;
        }
        public Criteria andZhidaojiaBetween(String value1, String value2) {
            addCriterion("zhidaojia between", value1, value2, "zhidaojia");
            return (Criteria) this;
        }
        public Criteria andZhidaojiaNotBetween(String value1, String value2) {
            addCriterion("zhidaojia not between", value1, value2, "zhidaojia");
            return (Criteria) this;
        }
        public Criteria andJibieIsNull() {
            addCriterion("jibie is null");
            return (Criteria) this;
        }
        public Criteria andJibieIsNotNull() {
            addCriterion("jibie is not null");
            return (Criteria) this;
        }
        public Criteria andJibieEqualTo(String value) {
            addCriterion("jibie =", value, "jibie");
            return (Criteria) this;
        }
        public Criteria andJibieNotEqualTo(String value) {
            addCriterion("jibie <>", value, "jibie");
            return (Criteria) this;
        }
        public Criteria andJibieGreaterThan(String value) {
            addCriterion("jibie >", value, "jibie");
            return (Criteria) this;
        }
        public Criteria andJibieGreaterThanOrEqualTo(String value) {
            addCriterion("jibie >=", value, "jibie");
            return (Criteria) this;
        }
        public Criteria andJibieLessThan(String value) {
            addCriterion("jibie <", value, "jibie");
            return (Criteria) this;
        }
        public Criteria andJibieLessThanOrEqualTo(String value) {
            addCriterion("jibie <=", value, "jibie");
            return (Criteria) this;
        }
        public Criteria andJibieLike(String value) {
            addCriterion("jibie like", value, "jibie");
            return (Criteria) this;
        }
        public Criteria andJibieNotLike(String value) {
            addCriterion("jibie not like", value, "jibie");
            return (Criteria) this;
        }
        public Criteria andJibieIn(List<String> values) {
            addCriterion("jibie in", values, "jibie");
            return (Criteria) this;
        }
        public Criteria andJibieNotIn(List<String> values) {
            addCriterion("jibie not in", values, "jibie");
            return (Criteria) this;
        }
        public Criteria andJibieBetween(String value1, String value2) {
            addCriterion("jibie between", value1, value2, "jibie");
            return (Criteria) this;
        }
        public Criteria andJibieNotBetween(String value1, String value2) {
            addCriterion("jibie not between", value1, value2, "jibie");
            return (Criteria) this;
        }
        public Criteria andFadongjiIsNull() {
            addCriterion("fadongji is null");
            return (Criteria) this;
        }
        public Criteria andFadongjiIsNotNull() {
            addCriterion("fadongji is not null");
            return (Criteria) this;
        }
        public Criteria andFadongjiEqualTo(String value) {
            addCriterion("fadongji =", value, "fadongji");
            return (Criteria) this;
        }
        public Criteria andFadongjiNotEqualTo(String value) {
            addCriterion("fadongji <>", value, "fadongji");
            return (Criteria) this;
        }
        public Criteria andFadongjiGreaterThan(String value) {
            addCriterion("fadongji >", value, "fadongji");
            return (Criteria) this;
        }
        public Criteria andFadongjiGreaterThanOrEqualTo(String value) {
            addCriterion("fadongji >=", value, "fadongji");
            return (Criteria) this;
        }
        public Criteria andFadongjiLessThan(String value) {
            addCriterion("fadongji <", value, "fadongji");
            return (Criteria) this;
        }
        public Criteria andFadongjiLessThanOrEqualTo(String value) {
            addCriterion("fadongji <=", value, "fadongji");
            return (Criteria) this;
        }
        public Criteria andFadongjiLike(String value) {
            addCriterion("fadongji like", value, "fadongji");
            return (Criteria) this;
        }
        public Criteria andFadongjiNotLike(String value) {
            addCriterion("fadongji not like", value, "fadongji");
            return (Criteria) this;
        }
        public Criteria andFadongjiIn(List<String> values) {
            addCriterion("fadongji in", values, "fadongji");
            return (Criteria) this;
        }
        public Criteria andFadongjiNotIn(List<String> values) {
            addCriterion("fadongji not in", values, "fadongji");
            return (Criteria) this;
        }
        public Criteria andFadongjiBetween(String value1, String value2) {
            addCriterion("fadongji between", value1, value2, "fadongji");
            return (Criteria) this;
        }
        public Criteria andFadongjiNotBetween(String value1, String value2) {
            addCriterion("fadongji not between", value1, value2, "fadongji");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangIsNull() {
            addCriterion("biansuxiang is null");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangIsNotNull() {
            addCriterion("biansuxiang is not null");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangEqualTo(String value) {
            addCriterion("biansuxiang =", value, "biansuxiang");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangNotEqualTo(String value) {
            addCriterion("biansuxiang <>", value, "biansuxiang");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangGreaterThan(String value) {
            addCriterion("biansuxiang >", value, "biansuxiang");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangGreaterThanOrEqualTo(String value) {
            addCriterion("biansuxiang >=", value, "biansuxiang");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangLessThan(String value) {
            addCriterion("biansuxiang <", value, "biansuxiang");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangLessThanOrEqualTo(String value) {
            addCriterion("biansuxiang <=", value, "biansuxiang");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangLike(String value) {
            addCriterion("biansuxiang like", value, "biansuxiang");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangNotLike(String value) {
            addCriterion("biansuxiang not like", value, "biansuxiang");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangIn(List<String> values) {
            addCriterion("biansuxiang in", values, "biansuxiang");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangNotIn(List<String> values) {
            addCriterion("biansuxiang not in", values, "biansuxiang");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangBetween(String value1, String value2) {
            addCriterion("biansuxiang between", value1, value2, "biansuxiang");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangNotBetween(String value1, String value2) {
            addCriterion("biansuxiang not between", value1, value2, "biansuxiang");
            return (Criteria) this;
        }
        public Criteria andChangkuanggaoIsNull() {
            addCriterion("changkuanggao is null");
            return (Criteria) this;
        }
        public Criteria andChangkuanggaoIsNotNull() {
            addCriterion("changkuanggao is not null");
            return (Criteria) this;
        }
        public Criteria andChangkuanggaoEqualTo(String value) {
            addCriterion("changkuanggao =", value, "changkuanggao");
            return (Criteria) this;
        }
        public Criteria andChangkuanggaoNotEqualTo(String value) {
            addCriterion("changkuanggao <>", value, "changkuanggao");
            return (Criteria) this;
        }
        public Criteria andChangkuanggaoGreaterThan(String value) {
            addCriterion("changkuanggao >", value, "changkuanggao");
            return (Criteria) this;
        }
        public Criteria andChangkuanggaoGreaterThanOrEqualTo(String value) {
            addCriterion("changkuanggao >=", value, "changkuanggao");
            return (Criteria) this;
        }
        public Criteria andChangkuanggaoLessThan(String value) {
            addCriterion("changkuanggao <", value, "changkuanggao");
            return (Criteria) this;
        }
        public Criteria andChangkuanggaoLessThanOrEqualTo(String value) {
            addCriterion("changkuanggao <=", value, "changkuanggao");
            return (Criteria) this;
        }
        public Criteria andChangkuanggaoLike(String value) {
            addCriterion("changkuanggao like", value, "changkuanggao");
            return (Criteria) this;
        }
        public Criteria andChangkuanggaoNotLike(String value) {
            addCriterion("changkuanggao not like", value, "changkuanggao");
            return (Criteria) this;
        }
        public Criteria andChangkuanggaoIn(List<String> values) {
            addCriterion("changkuanggao in", values, "changkuanggao");
            return (Criteria) this;
        }
        public Criteria andChangkuanggaoNotIn(List<String> values) {
            addCriterion("changkuanggao not in", values, "changkuanggao");
            return (Criteria) this;
        }
        public Criteria andChangkuanggaoBetween(String value1, String value2) {
            addCriterion("changkuanggao between", value1, value2, "changkuanggao");
            return (Criteria) this;
        }
        public Criteria andChangkuanggaoNotBetween(String value1, String value2) {
            addCriterion("changkuanggao not between", value1, value2, "changkuanggao");
            return (Criteria) this;
        }
        public Criteria andJiegouIsNull() {
            addCriterion("jiegou is null");
            return (Criteria) this;
        }
        public Criteria andJiegouIsNotNull() {
            addCriterion("jiegou is not null");
            return (Criteria) this;
        }
        public Criteria andJiegouEqualTo(String value) {
            addCriterion("jiegou =", value, "jiegou");
            return (Criteria) this;
        }
        public Criteria andJiegouNotEqualTo(String value) {
            addCriterion("jiegou <>", value, "jiegou");
            return (Criteria) this;
        }
        public Criteria andJiegouGreaterThan(String value) {
            addCriterion("jiegou >", value, "jiegou");
            return (Criteria) this;
        }
        public Criteria andJiegouGreaterThanOrEqualTo(String value) {
            addCriterion("jiegou >=", value, "jiegou");
            return (Criteria) this;
        }
        public Criteria andJiegouLessThan(String value) {
            addCriterion("jiegou <", value, "jiegou");
            return (Criteria) this;
        }
        public Criteria andJiegouLessThanOrEqualTo(String value) {
            addCriterion("jiegou <=", value, "jiegou");
            return (Criteria) this;
        }
        public Criteria andJiegouLike(String value) {
            addCriterion("jiegou like", value, "jiegou");
            return (Criteria) this;
        }
        public Criteria andJiegouNotLike(String value) {
            addCriterion("jiegou not like", value, "jiegou");
            return (Criteria) this;
        }
        public Criteria andJiegouIn(List<String> values) {
            addCriterion("jiegou in", values, "jiegou");
            return (Criteria) this;
        }
        public Criteria andJiegouNotIn(List<String> values) {
            addCriterion("jiegou not in", values, "jiegou");
            return (Criteria) this;
        }
        public Criteria andJiegouBetween(String value1, String value2) {
            addCriterion("jiegou between", value1, value2, "jiegou");
            return (Criteria) this;
        }
        public Criteria andJiegouNotBetween(String value1, String value2) {
            addCriterion("jiegou not between", value1, value2, "jiegou");
            return (Criteria) this;
        }
        public Criteria andZuigaochesuIsNull() {
            addCriterion("zuigaochesu is null");
            return (Criteria) this;
        }
        public Criteria andZuigaochesuIsNotNull() {
            addCriterion("zuigaochesu is not null");
            return (Criteria) this;
        }
        public Criteria andZuigaochesuEqualTo(String value) {
            addCriterion("zuigaochesu =", value, "zuigaochesu");
            return (Criteria) this;
        }
        public Criteria andZuigaochesuNotEqualTo(String value) {
            addCriterion("zuigaochesu <>", value, "zuigaochesu");
            return (Criteria) this;
        }
        public Criteria andZuigaochesuGreaterThan(String value) {
            addCriterion("zuigaochesu >", value, "zuigaochesu");
            return (Criteria) this;
        }
        public Criteria andZuigaochesuGreaterThanOrEqualTo(String value) {
            addCriterion("zuigaochesu >=", value, "zuigaochesu");
            return (Criteria) this;
        }
        public Criteria andZuigaochesuLessThan(String value) {
            addCriterion("zuigaochesu <", value, "zuigaochesu");
            return (Criteria) this;
        }
        public Criteria andZuigaochesuLessThanOrEqualTo(String value) {
            addCriterion("zuigaochesu <=", value, "zuigaochesu");
            return (Criteria) this;
        }
        public Criteria andZuigaochesuLike(String value) {
            addCriterion("zuigaochesu like", value, "zuigaochesu");
            return (Criteria) this;
        }
        public Criteria andZuigaochesuNotLike(String value) {
            addCriterion("zuigaochesu not like", value, "zuigaochesu");
            return (Criteria) this;
        }
        public Criteria andZuigaochesuIn(List<String> values) {
            addCriterion("zuigaochesu in", values, "zuigaochesu");
            return (Criteria) this;
        }
        public Criteria andZuigaochesuNotIn(List<String> values) {
            addCriterion("zuigaochesu not in", values, "zuigaochesu");
            return (Criteria) this;
        }
        public Criteria andZuigaochesuBetween(String value1, String value2) {
            addCriterion("zuigaochesu between", value1, value2, "zuigaochesu");
            return (Criteria) this;
        }
        public Criteria andZuigaochesuNotBetween(String value1, String value2) {
            addCriterion("zuigaochesu not between", value1, value2, "zuigaochesu");
            return (Criteria) this;
        }
        public Criteria andGuangfang_jiasuIsNull() {
            addCriterion("guangfang_jiasu is null");
            return (Criteria) this;
        }
        public Criteria andGuangfang_jiasuIsNotNull() {
            addCriterion("guangfang_jiasu is not null");
            return (Criteria) this;
        }
        public Criteria andGuangfang_jiasuEqualTo(String value) {
            addCriterion("guangfang_jiasu =", value, "guangfang_jiasu");
            return (Criteria) this;
        }
        public Criteria andGuangfang_jiasuNotEqualTo(String value) {
            addCriterion("guangfang_jiasu <>", value, "guangfang_jiasu");
            return (Criteria) this;
        }
        public Criteria andGuangfang_jiasuGreaterThan(String value) {
            addCriterion("guangfang_jiasu >", value, "guangfang_jiasu");
            return (Criteria) this;
        }
        public Criteria andGuangfang_jiasuGreaterThanOrEqualTo(String value) {
            addCriterion("guangfang_jiasu >=", value, "guangfang_jiasu");
            return (Criteria) this;
        }
        public Criteria andGuangfang_jiasuLessThan(String value) {
            addCriterion("guangfang_jiasu <", value, "guangfang_jiasu");
            return (Criteria) this;
        }
        public Criteria andGuangfang_jiasuLessThanOrEqualTo(String value) {
            addCriterion("guangfang_jiasu <=", value, "guangfang_jiasu");
            return (Criteria) this;
        }
        public Criteria andGuangfang_jiasuLike(String value) {
            addCriterion("guangfang_jiasu like", value, "guangfang_jiasu");
            return (Criteria) this;
        }
        public Criteria andGuangfang_jiasuNotLike(String value) {
            addCriterion("guangfang_jiasu not like", value, "guangfang_jiasu");
            return (Criteria) this;
        }
        public Criteria andGuangfang_jiasuIn(List<String> values) {
            addCriterion("guangfang_jiasu in", values, "guangfang_jiasu");
            return (Criteria) this;
        }
        public Criteria andGuangfang_jiasuNotIn(List<String> values) {
            addCriterion("guangfang_jiasu not in", values, "guangfang_jiasu");
            return (Criteria) this;
        }
        public Criteria andGuangfang_jiasuBetween(String value1, String value2) {
            addCriterion("guangfang_jiasu between", value1, value2, "guangfang_jiasu");
            return (Criteria) this;
        }
        public Criteria andGuangfang_jiasuNotBetween(String value1, String value2) {
            addCriterion("guangfang_jiasu not between", value1, value2, "guangfang_jiasu");
            return (Criteria) this;
        }
        public Criteria andShice__jiasuIsNull() {
            addCriterion("shice__jiasu is null");
            return (Criteria) this;
        }
        public Criteria andShice__jiasuIsNotNull() {
            addCriterion("shice__jiasu is not null");
            return (Criteria) this;
        }
        public Criteria andShice__jiasuEqualTo(String value) {
            addCriterion("shice__jiasu =", value, "shice__jiasu");
            return (Criteria) this;
        }
        public Criteria andShice__jiasuNotEqualTo(String value) {
            addCriterion("shice__jiasu <>", value, "shice__jiasu");
            return (Criteria) this;
        }
        public Criteria andShice__jiasuGreaterThan(String value) {
            addCriterion("shice__jiasu >", value, "shice__jiasu");
            return (Criteria) this;
        }
        public Criteria andShice__jiasuGreaterThanOrEqualTo(String value) {
            addCriterion("shice__jiasu >=", value, "shice__jiasu");
            return (Criteria) this;
        }
        public Criteria andShice__jiasuLessThan(String value) {
            addCriterion("shice__jiasu <", value, "shice__jiasu");
            return (Criteria) this;
        }
        public Criteria andShice__jiasuLessThanOrEqualTo(String value) {
            addCriterion("shice__jiasu <=", value, "shice__jiasu");
            return (Criteria) this;
        }
        public Criteria andShice__jiasuLike(String value) {
            addCriterion("shice__jiasu like", value, "shice__jiasu");
            return (Criteria) this;
        }
        public Criteria andShice__jiasuNotLike(String value) {
            addCriterion("shice__jiasu not like", value, "shice__jiasu");
            return (Criteria) this;
        }
        public Criteria andShice__jiasuIn(List<String> values) {
            addCriterion("shice__jiasu in", values, "shice__jiasu");
            return (Criteria) this;
        }
        public Criteria andShice__jiasuNotIn(List<String> values) {
            addCriterion("shice__jiasu not in", values, "shice__jiasu");
            return (Criteria) this;
        }
        public Criteria andShice__jiasuBetween(String value1, String value2) {
            addCriterion("shice__jiasu between", value1, value2, "shice__jiasu");
            return (Criteria) this;
        }
        public Criteria andShice__jiasuNotBetween(String value1, String value2) {
            addCriterion("shice__jiasu not between", value1, value2, "shice__jiasu");
            return (Criteria) this;
        }
        public Criteria andZhidongIsNull() {
            addCriterion("zhidong is null");
            return (Criteria) this;
        }
        public Criteria andZhidongIsNotNull() {
            addCriterion("zhidong is not null");
            return (Criteria) this;
        }
        public Criteria andZhidongEqualTo(String value) {
            addCriterion("zhidong =", value, "zhidong");
            return (Criteria) this;
        }
        public Criteria andZhidongNotEqualTo(String value) {
            addCriterion("zhidong <>", value, "zhidong");
            return (Criteria) this;
        }
        public Criteria andZhidongGreaterThan(String value) {
            addCriterion("zhidong >", value, "zhidong");
            return (Criteria) this;
        }
        public Criteria andZhidongGreaterThanOrEqualTo(String value) {
            addCriterion("zhidong >=", value, "zhidong");
            return (Criteria) this;
        }
        public Criteria andZhidongLessThan(String value) {
            addCriterion("zhidong <", value, "zhidong");
            return (Criteria) this;
        }
        public Criteria andZhidongLessThanOrEqualTo(String value) {
            addCriterion("zhidong <=", value, "zhidong");
            return (Criteria) this;
        }
        public Criteria andZhidongLike(String value) {
            addCriterion("zhidong like", value, "zhidong");
            return (Criteria) this;
        }
        public Criteria andZhidongNotLike(String value) {
            addCriterion("zhidong not like", value, "zhidong");
            return (Criteria) this;
        }
        public Criteria andZhidongIn(List<String> values) {
            addCriterion("zhidong in", values, "zhidong");
            return (Criteria) this;
        }
        public Criteria andZhidongNotIn(List<String> values) {
            addCriterion("zhidong not in", values, "zhidong");
            return (Criteria) this;
        }
        public Criteria andZhidongBetween(String value1, String value2) {
            addCriterion("zhidong between", value1, value2, "zhidong");
            return (Criteria) this;
        }
        public Criteria andZhidongNotBetween(String value1, String value2) {
            addCriterion("zhidong not between", value1, value2, "zhidong");
            return (Criteria) this;
        }
        public Criteria andLidijianxiIsNull() {
            addCriterion("lidijianxi is null");
            return (Criteria) this;
        }
        public Criteria andLidijianxiIsNotNull() {
            addCriterion("lidijianxi is not null");
            return (Criteria) this;
        }
        public Criteria andLidijianxiEqualTo(String value) {
            addCriterion("lidijianxi =", value, "lidijianxi");
            return (Criteria) this;
        }
        public Criteria andLidijianxiNotEqualTo(String value) {
            addCriterion("lidijianxi <>", value, "lidijianxi");
            return (Criteria) this;
        }
        public Criteria andLidijianxiGreaterThan(String value) {
            addCriterion("lidijianxi >", value, "lidijianxi");
            return (Criteria) this;
        }
        public Criteria andLidijianxiGreaterThanOrEqualTo(String value) {
            addCriterion("lidijianxi >=", value, "lidijianxi");
            return (Criteria) this;
        }
        public Criteria andLidijianxiLessThan(String value) {
            addCriterion("lidijianxi <", value, "lidijianxi");
            return (Criteria) this;
        }
        public Criteria andLidijianxiLessThanOrEqualTo(String value) {
            addCriterion("lidijianxi <=", value, "lidijianxi");
            return (Criteria) this;
        }
        public Criteria andLidijianxiLike(String value) {
            addCriterion("lidijianxi like", value, "lidijianxi");
            return (Criteria) this;
        }
        public Criteria andLidijianxiNotLike(String value) {
            addCriterion("lidijianxi not like", value, "lidijianxi");
            return (Criteria) this;
        }
        public Criteria andLidijianxiIn(List<String> values) {
            addCriterion("lidijianxi in", values, "lidijianxi");
            return (Criteria) this;
        }
        public Criteria andLidijianxiNotIn(List<String> values) {
            addCriterion("lidijianxi not in", values, "lidijianxi");
            return (Criteria) this;
        }
        public Criteria andLidijianxiBetween(String value1, String value2) {
            addCriterion("lidijianxi between", value1, value2, "lidijianxi");
            return (Criteria) this;
        }
        public Criteria andLidijianxiNotBetween(String value1, String value2) {
            addCriterion("lidijianxi not between", value1, value2, "lidijianxi");
            return (Criteria) this;
        }
        public Criteria andZonghe_youhaoIsNull() {
            addCriterion("zonghe_youhao is null");
            return (Criteria) this;
        }
        public Criteria andZonghe_youhaoIsNotNull() {
            addCriterion("zonghe_youhao is not null");
            return (Criteria) this;
        }
        public Criteria andZonghe_youhaoEqualTo(String value) {
            addCriterion("zonghe_youhao =", value, "zonghe_youhao");
            return (Criteria) this;
        }
        public Criteria andZonghe_youhaoNotEqualTo(String value) {
            addCriterion("zonghe_youhao <>", value, "zonghe_youhao");
            return (Criteria) this;
        }
        public Criteria andZonghe_youhaoGreaterThan(String value) {
            addCriterion("zonghe_youhao >", value, "zonghe_youhao");
            return (Criteria) this;
        }
        public Criteria andZonghe_youhaoGreaterThanOrEqualTo(String value) {
            addCriterion("zonghe_youhao >=", value, "zonghe_youhao");
            return (Criteria) this;
        }
        public Criteria andZonghe_youhaoLessThan(String value) {
            addCriterion("zonghe_youhao <", value, "zonghe_youhao");
            return (Criteria) this;
        }
        public Criteria andZonghe_youhaoLessThanOrEqualTo(String value) {
            addCriterion("zonghe_youhao <=", value, "zonghe_youhao");
            return (Criteria) this;
        }
        public Criteria andZonghe_youhaoLike(String value) {
            addCriterion("zonghe_youhao like", value, "zonghe_youhao");
            return (Criteria) this;
        }
        public Criteria andZonghe_youhaoNotLike(String value) {
            addCriterion("zonghe_youhao not like", value, "zonghe_youhao");
            return (Criteria) this;
        }
        public Criteria andZonghe_youhaoIn(List<String> values) {
            addCriterion("zonghe_youhao in", values, "zonghe_youhao");
            return (Criteria) this;
        }
        public Criteria andZonghe_youhaoNotIn(List<String> values) {
            addCriterion("zonghe_youhao not in", values, "zonghe_youhao");
            return (Criteria) this;
        }
        public Criteria andZonghe_youhaoBetween(String value1, String value2) {
            addCriterion("zonghe_youhao between", value1, value2, "zonghe_youhao");
            return (Criteria) this;
        }
        public Criteria andZonghe_youhaoNotBetween(String value1, String value2) {
            addCriterion("zonghe_youhao not between", value1, value2, "zonghe_youhao");
            return (Criteria) this;
        }
        public Criteria andShice__youhaoIsNull() {
            addCriterion("shice__youhao is null");
            return (Criteria) this;
        }
        public Criteria andShice__youhaoIsNotNull() {
            addCriterion("shice__youhao is not null");
            return (Criteria) this;
        }
        public Criteria andShice__youhaoEqualTo(String value) {
            addCriterion("shice__youhao =", value, "shice__youhao");
            return (Criteria) this;
        }
        public Criteria andShice__youhaoNotEqualTo(String value) {
            addCriterion("shice__youhao <>", value, "shice__youhao");
            return (Criteria) this;
        }
        public Criteria andShice__youhaoGreaterThan(String value) {
            addCriterion("shice__youhao >", value, "shice__youhao");
            return (Criteria) this;
        }
        public Criteria andShice__youhaoGreaterThanOrEqualTo(String value) {
            addCriterion("shice__youhao >=", value, "shice__youhao");
            return (Criteria) this;
        }
        public Criteria andShice__youhaoLessThan(String value) {
            addCriterion("shice__youhao <", value, "shice__youhao");
            return (Criteria) this;
        }
        public Criteria andShice__youhaoLessThanOrEqualTo(String value) {
            addCriterion("shice__youhao <=", value, "shice__youhao");
            return (Criteria) this;
        }
        public Criteria andShice__youhaoLike(String value) {
            addCriterion("shice__youhao like", value, "shice__youhao");
            return (Criteria) this;
        }
        public Criteria andShice__youhaoNotLike(String value) {
            addCriterion("shice__youhao not like", value, "shice__youhao");
            return (Criteria) this;
        }
        public Criteria andShice__youhaoIn(List<String> values) {
            addCriterion("shice__youhao in", values, "shice__youhao");
            return (Criteria) this;
        }
        public Criteria andShice__youhaoNotIn(List<String> values) {
            addCriterion("shice__youhao not in", values, "shice__youhao");
            return (Criteria) this;
        }
        public Criteria andShice__youhaoBetween(String value1, String value2) {
            addCriterion("shice__youhao between", value1, value2, "shice__youhao");
            return (Criteria) this;
        }
        public Criteria andShice__youhaoNotBetween(String value1, String value2) {
            addCriterion("shice__youhao not between", value1, value2, "shice__youhao");
            return (Criteria) this;
        }
        public Criteria andBaozhiqiIsNull() {
            addCriterion("baozhiqi is null");
            return (Criteria) this;
        }
        public Criteria andBaozhiqiIsNotNull() {
            addCriterion("baozhiqi is not null");
            return (Criteria) this;
        }
        public Criteria andBaozhiqiEqualTo(String value) {
            addCriterion("baozhiqi =", value, "baozhiqi");
            return (Criteria) this;
        }
        public Criteria andBaozhiqiNotEqualTo(String value) {
            addCriterion("baozhiqi <>", value, "baozhiqi");
            return (Criteria) this;
        }
        public Criteria andBaozhiqiGreaterThan(String value) {
            addCriterion("baozhiqi >", value, "baozhiqi");
            return (Criteria) this;
        }
        public Criteria andBaozhiqiGreaterThanOrEqualTo(String value) {
            addCriterion("baozhiqi >=", value, "baozhiqi");
            return (Criteria) this;
        }
        public Criteria andBaozhiqiLessThan(String value) {
            addCriterion("baozhiqi <", value, "baozhiqi");
            return (Criteria) this;
        }
        public Criteria andBaozhiqiLessThanOrEqualTo(String value) {
            addCriterion("baozhiqi <=", value, "baozhiqi");
            return (Criteria) this;
        }
        public Criteria andBaozhiqiLike(String value) {
            addCriterion("baozhiqi like", value, "baozhiqi");
            return (Criteria) this;
        }
        public Criteria andBaozhiqiNotLike(String value) {
            addCriterion("baozhiqi not like", value, "baozhiqi");
            return (Criteria) this;
        }
        public Criteria andBaozhiqiIn(List<String> values) {
            addCriterion("baozhiqi in", values, "baozhiqi");
            return (Criteria) this;
        }
        public Criteria andBaozhiqiNotIn(List<String> values) {
            addCriterion("baozhiqi not in", values, "baozhiqi");
            return (Criteria) this;
        }
        public Criteria andBaozhiqiBetween(String value1, String value2) {
            addCriterion("baozhiqi between", value1, value2, "baozhiqi");
            return (Criteria) this;
        }
        public Criteria andBaozhiqiNotBetween(String value1, String value2) {
            addCriterion("baozhiqi not between", value1, value2, "baozhiqi");
            return (Criteria) this;
        }
        public Criteria andChangduIsNull() {
            addCriterion("changdu is null");
            return (Criteria) this;
        }
        public Criteria andChangduIsNotNull() {
            addCriterion("changdu is not null");
            return (Criteria) this;
        }
        public Criteria andChangduEqualTo(String value) {
            addCriterion("changdu =", value, "changdu");
            return (Criteria) this;
        }
        public Criteria andChangduNotEqualTo(String value) {
            addCriterion("changdu <>", value, "changdu");
            return (Criteria) this;
        }
        public Criteria andChangduGreaterThan(String value) {
            addCriterion("changdu >", value, "changdu");
            return (Criteria) this;
        }
        public Criteria andChangduGreaterThanOrEqualTo(String value) {
            addCriterion("changdu >=", value, "changdu");
            return (Criteria) this;
        }
        public Criteria andChangduLessThan(String value) {
            addCriterion("changdu <", value, "changdu");
            return (Criteria) this;
        }
        public Criteria andChangduLessThanOrEqualTo(String value) {
            addCriterion("changdu <=", value, "changdu");
            return (Criteria) this;
        }
        public Criteria andChangduLike(String value) {
            addCriterion("changdu like", value, "changdu");
            return (Criteria) this;
        }
        public Criteria andChangduNotLike(String value) {
            addCriterion("changdu not like", value, "changdu");
            return (Criteria) this;
        }
        public Criteria andChangduIn(List<String> values) {
            addCriterion("changdu in", values, "changdu");
            return (Criteria) this;
        }
        public Criteria andChangduNotIn(List<String> values) {
            addCriterion("changdu not in", values, "changdu");
            return (Criteria) this;
        }
        public Criteria andChangduBetween(String value1, String value2) {
            addCriterion("changdu between", value1, value2, "changdu");
            return (Criteria) this;
        }
        public Criteria andChangduNotBetween(String value1, String value2) {
            addCriterion("changdu not between", value1, value2, "changdu");
            return (Criteria) this;
        }
        public Criteria andKuanduIsNull() {
            addCriterion("kuandu is null");
            return (Criteria) this;
        }
        public Criteria andKuanduIsNotNull() {
            addCriterion("kuandu is not null");
            return (Criteria) this;
        }
        public Criteria andKuanduEqualTo(String value) {
            addCriterion("kuandu =", value, "kuandu");
            return (Criteria) this;
        }
        public Criteria andKuanduNotEqualTo(String value) {
            addCriterion("kuandu <>", value, "kuandu");
            return (Criteria) this;
        }
        public Criteria andKuanduGreaterThan(String value) {
            addCriterion("kuandu >", value, "kuandu");
            return (Criteria) this;
        }
        public Criteria andKuanduGreaterThanOrEqualTo(String value) {
            addCriterion("kuandu >=", value, "kuandu");
            return (Criteria) this;
        }
        public Criteria andKuanduLessThan(String value) {
            addCriterion("kuandu <", value, "kuandu");
            return (Criteria) this;
        }
        public Criteria andKuanduLessThanOrEqualTo(String value) {
            addCriterion("kuandu <=", value, "kuandu");
            return (Criteria) this;
        }
        public Criteria andKuanduLike(String value) {
            addCriterion("kuandu like", value, "kuandu");
            return (Criteria) this;
        }
        public Criteria andKuanduNotLike(String value) {
            addCriterion("kuandu not like", value, "kuandu");
            return (Criteria) this;
        }
        public Criteria andKuanduIn(List<String> values) {
            addCriterion("kuandu in", values, "kuandu");
            return (Criteria) this;
        }
        public Criteria andKuanduNotIn(List<String> values) {
            addCriterion("kuandu not in", values, "kuandu");
            return (Criteria) this;
        }
        public Criteria andKuanduBetween(String value1, String value2) {
            addCriterion("kuandu between", value1, value2, "kuandu");
            return (Criteria) this;
        }
        public Criteria andKuanduNotBetween(String value1, String value2) {
            addCriterion("kuandu not between", value1, value2, "kuandu");
            return (Criteria) this;
        }
        public Criteria andGaoduIsNull() {
            addCriterion("gaodu is null");
            return (Criteria) this;
        }
        public Criteria andGaoduIsNotNull() {
            addCriterion("gaodu is not null");
            return (Criteria) this;
        }
        public Criteria andGaoduEqualTo(String value) {
            addCriterion("gaodu =", value, "gaodu");
            return (Criteria) this;
        }
        public Criteria andGaoduNotEqualTo(String value) {
            addCriterion("gaodu <>", value, "gaodu");
            return (Criteria) this;
        }
        public Criteria andGaoduGreaterThan(String value) {
            addCriterion("gaodu >", value, "gaodu");
            return (Criteria) this;
        }
        public Criteria andGaoduGreaterThanOrEqualTo(String value) {
            addCriterion("gaodu >=", value, "gaodu");
            return (Criteria) this;
        }
        public Criteria andGaoduLessThan(String value) {
            addCriterion("gaodu <", value, "gaodu");
            return (Criteria) this;
        }
        public Criteria andGaoduLessThanOrEqualTo(String value) {
            addCriterion("gaodu <=", value, "gaodu");
            return (Criteria) this;
        }
        public Criteria andGaoduLike(String value) {
            addCriterion("gaodu like", value, "gaodu");
            return (Criteria) this;
        }
        public Criteria andGaoduNotLike(String value) {
            addCriterion("gaodu not like", value, "gaodu");
            return (Criteria) this;
        }
        public Criteria andGaoduIn(List<String> values) {
            addCriterion("gaodu in", values, "gaodu");
            return (Criteria) this;
        }
        public Criteria andGaoduNotIn(List<String> values) {
            addCriterion("gaodu not in", values, "gaodu");
            return (Criteria) this;
        }
        public Criteria andGaoduBetween(String value1, String value2) {
            addCriterion("gaodu between", value1, value2, "gaodu");
            return (Criteria) this;
        }
        public Criteria andGaoduNotBetween(String value1, String value2) {
            addCriterion("gaodu not between", value1, value2, "gaodu");
            return (Criteria) this;
        }
        public Criteria andZhoujvIsNull() {
            addCriterion("zhoujv is null");
            return (Criteria) this;
        }
        public Criteria andZhoujvIsNotNull() {
            addCriterion("zhoujv is not null");
            return (Criteria) this;
        }
        public Criteria andZhoujvEqualTo(String value) {
            addCriterion("zhoujv =", value, "zhoujv");
            return (Criteria) this;
        }
        public Criteria andZhoujvNotEqualTo(String value) {
            addCriterion("zhoujv <>", value, "zhoujv");
            return (Criteria) this;
        }
        public Criteria andZhoujvGreaterThan(String value) {
            addCriterion("zhoujv >", value, "zhoujv");
            return (Criteria) this;
        }
        public Criteria andZhoujvGreaterThanOrEqualTo(String value) {
            addCriterion("zhoujv >=", value, "zhoujv");
            return (Criteria) this;
        }
        public Criteria andZhoujvLessThan(String value) {
            addCriterion("zhoujv <", value, "zhoujv");
            return (Criteria) this;
        }
        public Criteria andZhoujvLessThanOrEqualTo(String value) {
            addCriterion("zhoujv <=", value, "zhoujv");
            return (Criteria) this;
        }
        public Criteria andZhoujvLike(String value) {
            addCriterion("zhoujv like", value, "zhoujv");
            return (Criteria) this;
        }
        public Criteria andZhoujvNotLike(String value) {
            addCriterion("zhoujv not like", value, "zhoujv");
            return (Criteria) this;
        }
        public Criteria andZhoujvIn(List<String> values) {
            addCriterion("zhoujv in", values, "zhoujv");
            return (Criteria) this;
        }
        public Criteria andZhoujvNotIn(List<String> values) {
            addCriterion("zhoujv not in", values, "zhoujv");
            return (Criteria) this;
        }
        public Criteria andZhoujvBetween(String value1, String value2) {
            addCriterion("zhoujv between", value1, value2, "zhoujv");
            return (Criteria) this;
        }
        public Criteria andZhoujvNotBetween(String value1, String value2) {
            addCriterion("zhoujv not between", value1, value2, "zhoujv");
            return (Criteria) this;
        }
        public Criteria andQianlun_jvIsNull() {
            addCriterion("qianlun_jv is null");
            return (Criteria) this;
        }
        public Criteria andQianlun_jvIsNotNull() {
            addCriterion("qianlun_jv is not null");
            return (Criteria) this;
        }
        public Criteria andQianlun_jvEqualTo(String value) {
            addCriterion("qianlun_jv =", value, "qianlun_jv");
            return (Criteria) this;
        }
        public Criteria andQianlun_jvNotEqualTo(String value) {
            addCriterion("qianlun_jv <>", value, "qianlun_jv");
            return (Criteria) this;
        }
        public Criteria andQianlun_jvGreaterThan(String value) {
            addCriterion("qianlun_jv >", value, "qianlun_jv");
            return (Criteria) this;
        }
        public Criteria andQianlun_jvGreaterThanOrEqualTo(String value) {
            addCriterion("qianlun_jv >=", value, "qianlun_jv");
            return (Criteria) this;
        }
        public Criteria andQianlun_jvLessThan(String value) {
            addCriterion("qianlun_jv <", value, "qianlun_jv");
            return (Criteria) this;
        }
        public Criteria andQianlun_jvLessThanOrEqualTo(String value) {
            addCriterion("qianlun_jv <=", value, "qianlun_jv");
            return (Criteria) this;
        }
        public Criteria andQianlun_jvLike(String value) {
            addCriterion("qianlun_jv like", value, "qianlun_jv");
            return (Criteria) this;
        }
        public Criteria andQianlun_jvNotLike(String value) {
            addCriterion("qianlun_jv not like", value, "qianlun_jv");
            return (Criteria) this;
        }
        public Criteria andQianlun_jvIn(List<String> values) {
            addCriterion("qianlun_jv in", values, "qianlun_jv");
            return (Criteria) this;
        }
        public Criteria andQianlun_jvNotIn(List<String> values) {
            addCriterion("qianlun_jv not in", values, "qianlun_jv");
            return (Criteria) this;
        }
        public Criteria andQianlun_jvBetween(String value1, String value2) {
            addCriterion("qianlun_jv between", value1, value2, "qianlun_jv");
            return (Criteria) this;
        }
        public Criteria andQianlun_jvNotBetween(String value1, String value2) {
            addCriterion("qianlun_jv not between", value1, value2, "qianlun_jv");
            return (Criteria) this;
        }
        public Criteria andHoulun_jvIsNull() {
            addCriterion("houlun_jv is null");
            return (Criteria) this;
        }
        public Criteria andHoulun_jvIsNotNull() {
            addCriterion("houlun_jv is not null");
            return (Criteria) this;
        }
        public Criteria andHoulun_jvEqualTo(String value) {
            addCriterion("houlun_jv =", value, "houlun_jv");
            return (Criteria) this;
        }
        public Criteria andHoulun_jvNotEqualTo(String value) {
            addCriterion("houlun_jv <>", value, "houlun_jv");
            return (Criteria) this;
        }
        public Criteria andHoulun_jvGreaterThan(String value) {
            addCriterion("houlun_jv >", value, "houlun_jv");
            return (Criteria) this;
        }
        public Criteria andHoulun_jvGreaterThanOrEqualTo(String value) {
            addCriterion("houlun_jv >=", value, "houlun_jv");
            return (Criteria) this;
        }
        public Criteria andHoulun_jvLessThan(String value) {
            addCriterion("houlun_jv <", value, "houlun_jv");
            return (Criteria) this;
        }
        public Criteria andHoulun_jvLessThanOrEqualTo(String value) {
            addCriterion("houlun_jv <=", value, "houlun_jv");
            return (Criteria) this;
        }
        public Criteria andHoulun_jvLike(String value) {
            addCriterion("houlun_jv like", value, "houlun_jv");
            return (Criteria) this;
        }
        public Criteria andHoulun_jvNotLike(String value) {
            addCriterion("houlun_jv not like", value, "houlun_jv");
            return (Criteria) this;
        }
        public Criteria andHoulun_jvIn(List<String> values) {
            addCriterion("houlun_jv in", values, "houlun_jv");
            return (Criteria) this;
        }
        public Criteria andHoulun_jvNotIn(List<String> values) {
            addCriterion("houlun_jv not in", values, "houlun_jv");
            return (Criteria) this;
        }
        public Criteria andHoulun_jvBetween(String value1, String value2) {
            addCriterion("houlun_jv between", value1, value2, "houlun_jv");
            return (Criteria) this;
        }
        public Criteria andHoulun_jvNotBetween(String value1, String value2) {
            addCriterion("houlun_jv not between", value1, value2, "houlun_jv");
            return (Criteria) this;
        }
        public Criteria andLidi_jianxiIsNull() {
            addCriterion("lidi_jianxi is null");
            return (Criteria) this;
        }
        public Criteria andLidi_jianxiIsNotNull() {
            addCriterion("lidi_jianxi is not null");
            return (Criteria) this;
        }
        public Criteria andLidi_jianxiEqualTo(String value) {
            addCriterion("lidi_jianxi =", value, "lidi_jianxi");
            return (Criteria) this;
        }
        public Criteria andLidi_jianxiNotEqualTo(String value) {
            addCriterion("lidi_jianxi <>", value, "lidi_jianxi");
            return (Criteria) this;
        }
        public Criteria andLidi_jianxiGreaterThan(String value) {
            addCriterion("lidi_jianxi >", value, "lidi_jianxi");
            return (Criteria) this;
        }
        public Criteria andLidi_jianxiGreaterThanOrEqualTo(String value) {
            addCriterion("lidi_jianxi >=", value, "lidi_jianxi");
            return (Criteria) this;
        }
        public Criteria andLidi_jianxiLessThan(String value) {
            addCriterion("lidi_jianxi <", value, "lidi_jianxi");
            return (Criteria) this;
        }
        public Criteria andLidi_jianxiLessThanOrEqualTo(String value) {
            addCriterion("lidi_jianxi <=", value, "lidi_jianxi");
            return (Criteria) this;
        }
        public Criteria andLidi_jianxiLike(String value) {
            addCriterion("lidi_jianxi like", value, "lidi_jianxi");
            return (Criteria) this;
        }
        public Criteria andLidi_jianxiNotLike(String value) {
            addCriterion("lidi_jianxi not like", value, "lidi_jianxi");
            return (Criteria) this;
        }
        public Criteria andLidi_jianxiIn(List<String> values) {
            addCriterion("lidi_jianxi in", values, "lidi_jianxi");
            return (Criteria) this;
        }
        public Criteria andLidi_jianxiNotIn(List<String> values) {
            addCriterion("lidi_jianxi not in", values, "lidi_jianxi");
            return (Criteria) this;
        }
        public Criteria andLidi_jianxiBetween(String value1, String value2) {
            addCriterion("lidi_jianxi between", value1, value2, "lidi_jianxi");
            return (Criteria) this;
        }
        public Criteria andLidi_jianxiNotBetween(String value1, String value2) {
            addCriterion("lidi_jianxi not between", value1, value2, "lidi_jianxi");
            return (Criteria) this;
        }
        public Criteria andChemenshuIsNull() {
            addCriterion("chemenshu is null");
            return (Criteria) this;
        }
        public Criteria andChemenshuIsNotNull() {
            addCriterion("chemenshu is not null");
            return (Criteria) this;
        }
        public Criteria andChemenshuEqualTo(String value) {
            addCriterion("chemenshu =", value, "chemenshu");
            return (Criteria) this;
        }
        public Criteria andChemenshuNotEqualTo(String value) {
            addCriterion("chemenshu <>", value, "chemenshu");
            return (Criteria) this;
        }
        public Criteria andChemenshuGreaterThan(String value) {
            addCriterion("chemenshu >", value, "chemenshu");
            return (Criteria) this;
        }
        public Criteria andChemenshuGreaterThanOrEqualTo(String value) {
            addCriterion("chemenshu >=", value, "chemenshu");
            return (Criteria) this;
        }
        public Criteria andChemenshuLessThan(String value) {
            addCriterion("chemenshu <", value, "chemenshu");
            return (Criteria) this;
        }
        public Criteria andChemenshuLessThanOrEqualTo(String value) {
            addCriterion("chemenshu <=", value, "chemenshu");
            return (Criteria) this;
        }
        public Criteria andChemenshuLike(String value) {
            addCriterion("chemenshu like", value, "chemenshu");
            return (Criteria) this;
        }
        public Criteria andChemenshuNotLike(String value) {
            addCriterion("chemenshu not like", value, "chemenshu");
            return (Criteria) this;
        }
        public Criteria andChemenshuIn(List<String> values) {
            addCriterion("chemenshu in", values, "chemenshu");
            return (Criteria) this;
        }
        public Criteria andChemenshuNotIn(List<String> values) {
            addCriterion("chemenshu not in", values, "chemenshu");
            return (Criteria) this;
        }
        public Criteria andChemenshuBetween(String value1, String value2) {
            addCriterion("chemenshu between", value1, value2, "chemenshu");
            return (Criteria) this;
        }
        public Criteria andChemenshuNotBetween(String value1, String value2) {
            addCriterion("chemenshu not between", value1, value2, "chemenshu");
            return (Criteria) this;
        }
        public Criteria andZuoweishuIsNull() {
            addCriterion("zuoweishu is null");
            return (Criteria) this;
        }
        public Criteria andZuoweishuIsNotNull() {
            addCriterion("zuoweishu is not null");
            return (Criteria) this;
        }
        public Criteria andZuoweishuEqualTo(String value) {
            addCriterion("zuoweishu =", value, "zuoweishu");
            return (Criteria) this;
        }
        public Criteria andZuoweishuNotEqualTo(String value) {
            addCriterion("zuoweishu <>", value, "zuoweishu");
            return (Criteria) this;
        }
        public Criteria andZuoweishuGreaterThan(String value) {
            addCriterion("zuoweishu >", value, "zuoweishu");
            return (Criteria) this;
        }
        public Criteria andZuoweishuGreaterThanOrEqualTo(String value) {
            addCriterion("zuoweishu >=", value, "zuoweishu");
            return (Criteria) this;
        }
        public Criteria andZuoweishuLessThan(String value) {
            addCriterion("zuoweishu <", value, "zuoweishu");
            return (Criteria) this;
        }
        public Criteria andZuoweishuLessThanOrEqualTo(String value) {
            addCriterion("zuoweishu <=", value, "zuoweishu");
            return (Criteria) this;
        }
        public Criteria andZuoweishuLike(String value) {
            addCriterion("zuoweishu like", value, "zuoweishu");
            return (Criteria) this;
        }
        public Criteria andZuoweishuNotLike(String value) {
            addCriterion("zuoweishu not like", value, "zuoweishu");
            return (Criteria) this;
        }
        public Criteria andZuoweishuIn(List<String> values) {
            addCriterion("zuoweishu in", values, "zuoweishu");
            return (Criteria) this;
        }
        public Criteria andZuoweishuNotIn(List<String> values) {
            addCriterion("zuoweishu not in", values, "zuoweishu");
            return (Criteria) this;
        }
        public Criteria andZuoweishuBetween(String value1, String value2) {
            addCriterion("zuoweishu between", value1, value2, "zuoweishu");
            return (Criteria) this;
        }
        public Criteria andZuoweishuNotBetween(String value1, String value2) {
            addCriterion("zuoweishu not between", value1, value2, "zuoweishu");
            return (Criteria) this;
        }
        public Criteria andYouxiangIsNull() {
            addCriterion("youxiang is null");
            return (Criteria) this;
        }
        public Criteria andYouxiangIsNotNull() {
            addCriterion("youxiang is not null");
            return (Criteria) this;
        }
        public Criteria andYouxiangEqualTo(String value) {
            addCriterion("youxiang =", value, "youxiang");
            return (Criteria) this;
        }
        public Criteria andYouxiangNotEqualTo(String value) {
            addCriterion("youxiang <>", value, "youxiang");
            return (Criteria) this;
        }
        public Criteria andYouxiangGreaterThan(String value) {
            addCriterion("youxiang >", value, "youxiang");
            return (Criteria) this;
        }
        public Criteria andYouxiangGreaterThanOrEqualTo(String value) {
            addCriterion("youxiang >=", value, "youxiang");
            return (Criteria) this;
        }
        public Criteria andYouxiangLessThan(String value) {
            addCriterion("youxiang <", value, "youxiang");
            return (Criteria) this;
        }
        public Criteria andYouxiangLessThanOrEqualTo(String value) {
            addCriterion("youxiang <=", value, "youxiang");
            return (Criteria) this;
        }
        public Criteria andYouxiangLike(String value) {
            addCriterion("youxiang like", value, "youxiang");
            return (Criteria) this;
        }
        public Criteria andYouxiangNotLike(String value) {
            addCriterion("youxiang not like", value, "youxiang");
            return (Criteria) this;
        }
        public Criteria andYouxiangIn(List<String> values) {
            addCriterion("youxiang in", values, "youxiang");
            return (Criteria) this;
        }
        public Criteria andYouxiangNotIn(List<String> values) {
            addCriterion("youxiang not in", values, "youxiang");
            return (Criteria) this;
        }
        public Criteria andYouxiangBetween(String value1, String value2) {
            addCriterion("youxiang between", value1, value2, "youxiang");
            return (Criteria) this;
        }
        public Criteria andYouxiangNotBetween(String value1, String value2) {
            addCriterion("youxiang not between", value1, value2, "youxiang");
            return (Criteria) this;
        }
        public Criteria andHoubeixiangIsNull() {
            addCriterion("houbeixiang is null");
            return (Criteria) this;
        }
        public Criteria andHoubeixiangIsNotNull() {
            addCriterion("houbeixiang is not null");
            return (Criteria) this;
        }
        public Criteria andHoubeixiangEqualTo(String value) {
            addCriterion("houbeixiang =", value, "houbeixiang");
            return (Criteria) this;
        }
        public Criteria andHoubeixiangNotEqualTo(String value) {
            addCriterion("houbeixiang <>", value, "houbeixiang");
            return (Criteria) this;
        }
        public Criteria andHoubeixiangGreaterThan(String value) {
            addCriterion("houbeixiang >", value, "houbeixiang");
            return (Criteria) this;
        }
        public Criteria andHoubeixiangGreaterThanOrEqualTo(String value) {
            addCriterion("houbeixiang >=", value, "houbeixiang");
            return (Criteria) this;
        }
        public Criteria andHoubeixiangLessThan(String value) {
            addCriterion("houbeixiang <", value, "houbeixiang");
            return (Criteria) this;
        }
        public Criteria andHoubeixiangLessThanOrEqualTo(String value) {
            addCriterion("houbeixiang <=", value, "houbeixiang");
            return (Criteria) this;
        }
        public Criteria andHoubeixiangLike(String value) {
            addCriterion("houbeixiang like", value, "houbeixiang");
            return (Criteria) this;
        }
        public Criteria andHoubeixiangNotLike(String value) {
            addCriterion("houbeixiang not like", value, "houbeixiang");
            return (Criteria) this;
        }
        public Criteria andHoubeixiangIn(List<String> values) {
            addCriterion("houbeixiang in", values, "houbeixiang");
            return (Criteria) this;
        }
        public Criteria andHoubeixiangNotIn(List<String> values) {
            addCriterion("houbeixiang not in", values, "houbeixiang");
            return (Criteria) this;
        }
        public Criteria andHoubeixiangBetween(String value1, String value2) {
            addCriterion("houbeixiang between", value1, value2, "houbeixiang");
            return (Criteria) this;
        }
        public Criteria andHoubeixiangNotBetween(String value1, String value2) {
            addCriterion("houbeixiang not between", value1, value2, "houbeixiang");
            return (Criteria) this;
        }
        public Criteria andHoumenkaiqiIsNull() {
            addCriterion("houmenkaiqi is null");
            return (Criteria) this;
        }
        public Criteria andHoumenkaiqiIsNotNull() {
            addCriterion("houmenkaiqi is not null");
            return (Criteria) this;
        }
        public Criteria andHoumenkaiqiEqualTo(String value) {
            addCriterion("houmenkaiqi =", value, "houmenkaiqi");
            return (Criteria) this;
        }
        public Criteria andHoumenkaiqiNotEqualTo(String value) {
            addCriterion("houmenkaiqi <>", value, "houmenkaiqi");
            return (Criteria) this;
        }
        public Criteria andHoumenkaiqiGreaterThan(String value) {
            addCriterion("houmenkaiqi >", value, "houmenkaiqi");
            return (Criteria) this;
        }
        public Criteria andHoumenkaiqiGreaterThanOrEqualTo(String value) {
            addCriterion("houmenkaiqi >=", value, "houmenkaiqi");
            return (Criteria) this;
        }
        public Criteria andHoumenkaiqiLessThan(String value) {
            addCriterion("houmenkaiqi <", value, "houmenkaiqi");
            return (Criteria) this;
        }
        public Criteria andHoumenkaiqiLessThanOrEqualTo(String value) {
            addCriterion("houmenkaiqi <=", value, "houmenkaiqi");
            return (Criteria) this;
        }
        public Criteria andHoumenkaiqiLike(String value) {
            addCriterion("houmenkaiqi like", value, "houmenkaiqi");
            return (Criteria) this;
        }
        public Criteria andHoumenkaiqiNotLike(String value) {
            addCriterion("houmenkaiqi not like", value, "houmenkaiqi");
            return (Criteria) this;
        }
        public Criteria andHoumenkaiqiIn(List<String> values) {
            addCriterion("houmenkaiqi in", values, "houmenkaiqi");
            return (Criteria) this;
        }
        public Criteria andHoumenkaiqiNotIn(List<String> values) {
            addCriterion("houmenkaiqi not in", values, "houmenkaiqi");
            return (Criteria) this;
        }
        public Criteria andHoumenkaiqiBetween(String value1, String value2) {
            addCriterion("houmenkaiqi between", value1, value2, "houmenkaiqi");
            return (Criteria) this;
        }
        public Criteria andHoumenkaiqiNotBetween(String value1, String value2) {
            addCriterion("houmenkaiqi not between", value1, value2, "houmenkaiqi");
            return (Criteria) this;
        }
        public Criteria andHuoxiangchichunIsNull() {
            addCriterion("huoxiangchichun is null");
            return (Criteria) this;
        }
        public Criteria andHuoxiangchichunIsNotNull() {
            addCriterion("huoxiangchichun is not null");
            return (Criteria) this;
        }
        public Criteria andHuoxiangchichunEqualTo(String value) {
            addCriterion("huoxiangchichun =", value, "huoxiangchichun");
            return (Criteria) this;
        }
        public Criteria andHuoxiangchichunNotEqualTo(String value) {
            addCriterion("huoxiangchichun <>", value, "huoxiangchichun");
            return (Criteria) this;
        }
        public Criteria andHuoxiangchichunGreaterThan(String value) {
            addCriterion("huoxiangchichun >", value, "huoxiangchichun");
            return (Criteria) this;
        }
        public Criteria andHuoxiangchichunGreaterThanOrEqualTo(String value) {
            addCriterion("huoxiangchichun >=", value, "huoxiangchichun");
            return (Criteria) this;
        }
        public Criteria andHuoxiangchichunLessThan(String value) {
            addCriterion("huoxiangchichun <", value, "huoxiangchichun");
            return (Criteria) this;
        }
        public Criteria andHuoxiangchichunLessThanOrEqualTo(String value) {
            addCriterion("huoxiangchichun <=", value, "huoxiangchichun");
            return (Criteria) this;
        }
        public Criteria andHuoxiangchichunLike(String value) {
            addCriterion("huoxiangchichun like", value, "huoxiangchichun");
            return (Criteria) this;
        }
        public Criteria andHuoxiangchichunNotLike(String value) {
            addCriterion("huoxiangchichun not like", value, "huoxiangchichun");
            return (Criteria) this;
        }
        public Criteria andHuoxiangchichunIn(List<String> values) {
            addCriterion("huoxiangchichun in", values, "huoxiangchichun");
            return (Criteria) this;
        }
        public Criteria andHuoxiangchichunNotIn(List<String> values) {
            addCriterion("huoxiangchichun not in", values, "huoxiangchichun");
            return (Criteria) this;
        }
        public Criteria andHuoxiangchichunBetween(String value1, String value2) {
            addCriterion("huoxiangchichun between", value1, value2, "huoxiangchichun");
            return (Criteria) this;
        }
        public Criteria andHuoxiangchichunNotBetween(String value1, String value2) {
            addCriterion("huoxiangchichun not between", value1, value2, "huoxiangchichun");
            return (Criteria) this;
        }
        public Criteria andZhengbeizhiliangIsNull() {
            addCriterion("zhengbeizhiliang is null");
            return (Criteria) this;
        }
        public Criteria andZhengbeizhiliangIsNotNull() {
            addCriterion("zhengbeizhiliang is not null");
            return (Criteria) this;
        }
        public Criteria andZhengbeizhiliangEqualTo(String value) {
            addCriterion("zhengbeizhiliang =", value, "zhengbeizhiliang");
            return (Criteria) this;
        }
        public Criteria andZhengbeizhiliangNotEqualTo(String value) {
            addCriterion("zhengbeizhiliang <>", value, "zhengbeizhiliang");
            return (Criteria) this;
        }
        public Criteria andZhengbeizhiliangGreaterThan(String value) {
            addCriterion("zhengbeizhiliang >", value, "zhengbeizhiliang");
            return (Criteria) this;
        }
        public Criteria andZhengbeizhiliangGreaterThanOrEqualTo(String value) {
            addCriterion("zhengbeizhiliang >=", value, "zhengbeizhiliang");
            return (Criteria) this;
        }
        public Criteria andZhengbeizhiliangLessThan(String value) {
            addCriterion("zhengbeizhiliang <", value, "zhengbeizhiliang");
            return (Criteria) this;
        }
        public Criteria andZhengbeizhiliangLessThanOrEqualTo(String value) {
            addCriterion("zhengbeizhiliang <=", value, "zhengbeizhiliang");
            return (Criteria) this;
        }
        public Criteria andZhengbeizhiliangLike(String value) {
            addCriterion("zhengbeizhiliang like", value, "zhengbeizhiliang");
            return (Criteria) this;
        }
        public Criteria andZhengbeizhiliangNotLike(String value) {
            addCriterion("zhengbeizhiliang not like", value, "zhengbeizhiliang");
            return (Criteria) this;
        }
        public Criteria andZhengbeizhiliangIn(List<String> values) {
            addCriterion("zhengbeizhiliang in", values, "zhengbeizhiliang");
            return (Criteria) this;
        }
        public Criteria andZhengbeizhiliangNotIn(List<String> values) {
            addCriterion("zhengbeizhiliang not in", values, "zhengbeizhiliang");
            return (Criteria) this;
        }
        public Criteria andZhengbeizhiliangBetween(String value1, String value2) {
            addCriterion("zhengbeizhiliang between", value1, value2, "zhengbeizhiliang");
            return (Criteria) this;
        }
        public Criteria andZhengbeizhiliangNotBetween(String value1, String value2) {
            addCriterion("zhengbeizhiliang not between", value1, value2, "zhengbeizhiliang");
            return (Criteria) this;
        }
        public Criteria andFadongjiaxinghaoIsNull() {
            addCriterion("fadongjiaxinghao is null");
            return (Criteria) this;
        }
        public Criteria andFadongjiaxinghaoIsNotNull() {
            addCriterion("fadongjiaxinghao is not null");
            return (Criteria) this;
        }
        public Criteria andFadongjiaxinghaoEqualTo(String value) {
            addCriterion("fadongjiaxinghao =", value, "fadongjiaxinghao");
            return (Criteria) this;
        }
        public Criteria andFadongjiaxinghaoNotEqualTo(String value) {
            addCriterion("fadongjiaxinghao <>", value, "fadongjiaxinghao");
            return (Criteria) this;
        }
        public Criteria andFadongjiaxinghaoGreaterThan(String value) {
            addCriterion("fadongjiaxinghao >", value, "fadongjiaxinghao");
            return (Criteria) this;
        }
        public Criteria andFadongjiaxinghaoGreaterThanOrEqualTo(String value) {
            addCriterion("fadongjiaxinghao >=", value, "fadongjiaxinghao");
            return (Criteria) this;
        }
        public Criteria andFadongjiaxinghaoLessThan(String value) {
            addCriterion("fadongjiaxinghao <", value, "fadongjiaxinghao");
            return (Criteria) this;
        }
        public Criteria andFadongjiaxinghaoLessThanOrEqualTo(String value) {
            addCriterion("fadongjiaxinghao <=", value, "fadongjiaxinghao");
            return (Criteria) this;
        }
        public Criteria andFadongjiaxinghaoLike(String value) {
            addCriterion("fadongjiaxinghao like", value, "fadongjiaxinghao");
            return (Criteria) this;
        }
        public Criteria andFadongjiaxinghaoNotLike(String value) {
            addCriterion("fadongjiaxinghao not like", value, "fadongjiaxinghao");
            return (Criteria) this;
        }
        public Criteria andFadongjiaxinghaoIn(List<String> values) {
            addCriterion("fadongjiaxinghao in", values, "fadongjiaxinghao");
            return (Criteria) this;
        }
        public Criteria andFadongjiaxinghaoNotIn(List<String> values) {
            addCriterion("fadongjiaxinghao not in", values, "fadongjiaxinghao");
            return (Criteria) this;
        }
        public Criteria andFadongjiaxinghaoBetween(String value1, String value2) {
            addCriterion("fadongjiaxinghao between", value1, value2, "fadongjiaxinghao");
            return (Criteria) this;
        }
        public Criteria andFadongjiaxinghaoNotBetween(String value1, String value2) {
            addCriterion("fadongjiaxinghao not between", value1, value2, "fadongjiaxinghao");
            return (Criteria) this;
        }
        public Criteria andPailiangIsNull() {
            addCriterion("pailiang is null");
            return (Criteria) this;
        }
        public Criteria andPailiangIsNotNull() {
            addCriterion("pailiang is not null");
            return (Criteria) this;
        }
        public Criteria andPailiangEqualTo(String value) {
            addCriterion("pailiang =", value, "pailiang");
            return (Criteria) this;
        }
        public Criteria andPailiangNotEqualTo(String value) {
            addCriterion("pailiang <>", value, "pailiang");
            return (Criteria) this;
        }
        public Criteria andPailiangGreaterThan(String value) {
            addCriterion("pailiang >", value, "pailiang");
            return (Criteria) this;
        }
        public Criteria andPailiangGreaterThanOrEqualTo(String value) {
            addCriterion("pailiang >=", value, "pailiang");
            return (Criteria) this;
        }
        public Criteria andPailiangLessThan(String value) {
            addCriterion("pailiang <", value, "pailiang");
            return (Criteria) this;
        }
        public Criteria andPailiangLessThanOrEqualTo(String value) {
            addCriterion("pailiang <=", value, "pailiang");
            return (Criteria) this;
        }
        public Criteria andPailiangLike(String value) {
            addCriterion("pailiang like", value, "pailiang");
            return (Criteria) this;
        }
        public Criteria andPailiangNotLike(String value) {
            addCriterion("pailiang not like", value, "pailiang");
            return (Criteria) this;
        }
        public Criteria andPailiangIn(List<String> values) {
            addCriterion("pailiang in", values, "pailiang");
            return (Criteria) this;
        }
        public Criteria andPailiangNotIn(List<String> values) {
            addCriterion("pailiang not in", values, "pailiang");
            return (Criteria) this;
        }
        public Criteria andPailiangBetween(String value1, String value2) {
            addCriterion("pailiang between", value1, value2, "pailiang");
            return (Criteria) this;
        }
        public Criteria andPailiangNotBetween(String value1, String value2) {
            addCriterion("pailiang not between", value1, value2, "pailiang");
            return (Criteria) this;
        }
        public Criteria andJinqixiangshiIsNull() {
            addCriterion("jinqixiangshi is null");
            return (Criteria) this;
        }
        public Criteria andJinqixiangshiIsNotNull() {
            addCriterion("jinqixiangshi is not null");
            return (Criteria) this;
        }
        public Criteria andJinqixiangshiEqualTo(String value) {
            addCriterion("jinqixiangshi =", value, "jinqixiangshi");
            return (Criteria) this;
        }
        public Criteria andJinqixiangshiNotEqualTo(String value) {
            addCriterion("jinqixiangshi <>", value, "jinqixiangshi");
            return (Criteria) this;
        }
        public Criteria andJinqixiangshiGreaterThan(String value) {
            addCriterion("jinqixiangshi >", value, "jinqixiangshi");
            return (Criteria) this;
        }
        public Criteria andJinqixiangshiGreaterThanOrEqualTo(String value) {
            addCriterion("jinqixiangshi >=", value, "jinqixiangshi");
            return (Criteria) this;
        }
        public Criteria andJinqixiangshiLessThan(String value) {
            addCriterion("jinqixiangshi <", value, "jinqixiangshi");
            return (Criteria) this;
        }
        public Criteria andJinqixiangshiLessThanOrEqualTo(String value) {
            addCriterion("jinqixiangshi <=", value, "jinqixiangshi");
            return (Criteria) this;
        }
        public Criteria andJinqixiangshiLike(String value) {
            addCriterion("jinqixiangshi like", value, "jinqixiangshi");
            return (Criteria) this;
        }
        public Criteria andJinqixiangshiNotLike(String value) {
            addCriterion("jinqixiangshi not like", value, "jinqixiangshi");
            return (Criteria) this;
        }
        public Criteria andJinqixiangshiIn(List<String> values) {
            addCriterion("jinqixiangshi in", values, "jinqixiangshi");
            return (Criteria) this;
        }
        public Criteria andJinqixiangshiNotIn(List<String> values) {
            addCriterion("jinqixiangshi not in", values, "jinqixiangshi");
            return (Criteria) this;
        }
        public Criteria andJinqixiangshiBetween(String value1, String value2) {
            addCriterion("jinqixiangshi between", value1, value2, "jinqixiangshi");
            return (Criteria) this;
        }
        public Criteria andJinqixiangshiNotBetween(String value1, String value2) {
            addCriterion("jinqixiangshi not between", value1, value2, "jinqixiangshi");
            return (Criteria) this;
        }
        public Criteria andQigangpailiexingshiIsNull() {
            addCriterion("qigangpailiexingshi is null");
            return (Criteria) this;
        }
        public Criteria andQigangpailiexingshiIsNotNull() {
            addCriterion("qigangpailiexingshi is not null");
            return (Criteria) this;
        }
        public Criteria andQigangpailiexingshiEqualTo(String value) {
            addCriterion("qigangpailiexingshi =", value, "qigangpailiexingshi");
            return (Criteria) this;
        }
        public Criteria andQigangpailiexingshiNotEqualTo(String value) {
            addCriterion("qigangpailiexingshi <>", value, "qigangpailiexingshi");
            return (Criteria) this;
        }
        public Criteria andQigangpailiexingshiGreaterThan(String value) {
            addCriterion("qigangpailiexingshi >", value, "qigangpailiexingshi");
            return (Criteria) this;
        }
        public Criteria andQigangpailiexingshiGreaterThanOrEqualTo(String value) {
            addCriterion("qigangpailiexingshi >=", value, "qigangpailiexingshi");
            return (Criteria) this;
        }
        public Criteria andQigangpailiexingshiLessThan(String value) {
            addCriterion("qigangpailiexingshi <", value, "qigangpailiexingshi");
            return (Criteria) this;
        }
        public Criteria andQigangpailiexingshiLessThanOrEqualTo(String value) {
            addCriterion("qigangpailiexingshi <=", value, "qigangpailiexingshi");
            return (Criteria) this;
        }
        public Criteria andQigangpailiexingshiLike(String value) {
            addCriterion("qigangpailiexingshi like", value, "qigangpailiexingshi");
            return (Criteria) this;
        }
        public Criteria andQigangpailiexingshiNotLike(String value) {
            addCriterion("qigangpailiexingshi not like", value, "qigangpailiexingshi");
            return (Criteria) this;
        }
        public Criteria andQigangpailiexingshiIn(List<String> values) {
            addCriterion("qigangpailiexingshi in", values, "qigangpailiexingshi");
            return (Criteria) this;
        }
        public Criteria andQigangpailiexingshiNotIn(List<String> values) {
            addCriterion("qigangpailiexingshi not in", values, "qigangpailiexingshi");
            return (Criteria) this;
        }
        public Criteria andQigangpailiexingshiBetween(String value1, String value2) {
            addCriterion("qigangpailiexingshi between", value1, value2, "qigangpailiexingshi");
            return (Criteria) this;
        }
        public Criteria andQigangpailiexingshiNotBetween(String value1, String value2) {
            addCriterion("qigangpailiexingshi not between", value1, value2, "qigangpailiexingshi");
            return (Criteria) this;
        }
        public Criteria andQigangIsNull() {
            addCriterion("qigang is null");
            return (Criteria) this;
        }
        public Criteria andQigangIsNotNull() {
            addCriterion("qigang is not null");
            return (Criteria) this;
        }
        public Criteria andQigangEqualTo(String value) {
            addCriterion("qigang =", value, "qigang");
            return (Criteria) this;
        }
        public Criteria andQigangNotEqualTo(String value) {
            addCriterion("qigang <>", value, "qigang");
            return (Criteria) this;
        }
        public Criteria andQigangGreaterThan(String value) {
            addCriterion("qigang >", value, "qigang");
            return (Criteria) this;
        }
        public Criteria andQigangGreaterThanOrEqualTo(String value) {
            addCriterion("qigang >=", value, "qigang");
            return (Criteria) this;
        }
        public Criteria andQigangLessThan(String value) {
            addCriterion("qigang <", value, "qigang");
            return (Criteria) this;
        }
        public Criteria andQigangLessThanOrEqualTo(String value) {
            addCriterion("qigang <=", value, "qigang");
            return (Criteria) this;
        }
        public Criteria andQigangLike(String value) {
            addCriterion("qigang like", value, "qigang");
            return (Criteria) this;
        }
        public Criteria andQigangNotLike(String value) {
            addCriterion("qigang not like", value, "qigang");
            return (Criteria) this;
        }
        public Criteria andQigangIn(List<String> values) {
            addCriterion("qigang in", values, "qigang");
            return (Criteria) this;
        }
        public Criteria andQigangNotIn(List<String> values) {
            addCriterion("qigang not in", values, "qigang");
            return (Criteria) this;
        }
        public Criteria andQigangBetween(String value1, String value2) {
            addCriterion("qigang between", value1, value2, "qigang");
            return (Criteria) this;
        }
        public Criteria andQigangNotBetween(String value1, String value2) {
            addCriterion("qigang not between", value1, value2, "qigang");
            return (Criteria) this;
        }
        public Criteria andMeigangqimenshuIsNull() {
            addCriterion("meigangqimenshu is null");
            return (Criteria) this;
        }
        public Criteria andMeigangqimenshuIsNotNull() {
            addCriterion("meigangqimenshu is not null");
            return (Criteria) this;
        }
        public Criteria andMeigangqimenshuEqualTo(String value) {
            addCriterion("meigangqimenshu =", value, "meigangqimenshu");
            return (Criteria) this;
        }
        public Criteria andMeigangqimenshuNotEqualTo(String value) {
            addCriterion("meigangqimenshu <>", value, "meigangqimenshu");
            return (Criteria) this;
        }
        public Criteria andMeigangqimenshuGreaterThan(String value) {
            addCriterion("meigangqimenshu >", value, "meigangqimenshu");
            return (Criteria) this;
        }
        public Criteria andMeigangqimenshuGreaterThanOrEqualTo(String value) {
            addCriterion("meigangqimenshu >=", value, "meigangqimenshu");
            return (Criteria) this;
        }
        public Criteria andMeigangqimenshuLessThan(String value) {
            addCriterion("meigangqimenshu <", value, "meigangqimenshu");
            return (Criteria) this;
        }
        public Criteria andMeigangqimenshuLessThanOrEqualTo(String value) {
            addCriterion("meigangqimenshu <=", value, "meigangqimenshu");
            return (Criteria) this;
        }
        public Criteria andMeigangqimenshuLike(String value) {
            addCriterion("meigangqimenshu like", value, "meigangqimenshu");
            return (Criteria) this;
        }
        public Criteria andMeigangqimenshuNotLike(String value) {
            addCriterion("meigangqimenshu not like", value, "meigangqimenshu");
            return (Criteria) this;
        }
        public Criteria andMeigangqimenshuIn(List<String> values) {
            addCriterion("meigangqimenshu in", values, "meigangqimenshu");
            return (Criteria) this;
        }
        public Criteria andMeigangqimenshuNotIn(List<String> values) {
            addCriterion("meigangqimenshu not in", values, "meigangqimenshu");
            return (Criteria) this;
        }
        public Criteria andMeigangqimenshuBetween(String value1, String value2) {
            addCriterion("meigangqimenshu between", value1, value2, "meigangqimenshu");
            return (Criteria) this;
        }
        public Criteria andMeigangqimenshuNotBetween(String value1, String value2) {
            addCriterion("meigangqimenshu not between", value1, value2, "meigangqimenshu");
            return (Criteria) this;
        }
        public Criteria andYasuobiIsNull() {
            addCriterion("yasuobi is null");
            return (Criteria) this;
        }
        public Criteria andYasuobiIsNotNull() {
            addCriterion("yasuobi is not null");
            return (Criteria) this;
        }
        public Criteria andYasuobiEqualTo(String value) {
            addCriterion("yasuobi =", value, "yasuobi");
            return (Criteria) this;
        }
        public Criteria andYasuobiNotEqualTo(String value) {
            addCriterion("yasuobi <>", value, "yasuobi");
            return (Criteria) this;
        }
        public Criteria andYasuobiGreaterThan(String value) {
            addCriterion("yasuobi >", value, "yasuobi");
            return (Criteria) this;
        }
        public Criteria andYasuobiGreaterThanOrEqualTo(String value) {
            addCriterion("yasuobi >=", value, "yasuobi");
            return (Criteria) this;
        }
        public Criteria andYasuobiLessThan(String value) {
            addCriterion("yasuobi <", value, "yasuobi");
            return (Criteria) this;
        }
        public Criteria andYasuobiLessThanOrEqualTo(String value) {
            addCriterion("yasuobi <=", value, "yasuobi");
            return (Criteria) this;
        }
        public Criteria andYasuobiLike(String value) {
            addCriterion("yasuobi like", value, "yasuobi");
            return (Criteria) this;
        }
        public Criteria andYasuobiNotLike(String value) {
            addCriterion("yasuobi not like", value, "yasuobi");
            return (Criteria) this;
        }
        public Criteria andYasuobiIn(List<String> values) {
            addCriterion("yasuobi in", values, "yasuobi");
            return (Criteria) this;
        }
        public Criteria andYasuobiNotIn(List<String> values) {
            addCriterion("yasuobi not in", values, "yasuobi");
            return (Criteria) this;
        }
        public Criteria andYasuobiBetween(String value1, String value2) {
            addCriterion("yasuobi between", value1, value2, "yasuobi");
            return (Criteria) this;
        }
        public Criteria andYasuobiNotBetween(String value1, String value2) {
            addCriterion("yasuobi not between", value1, value2, "yasuobi");
            return (Criteria) this;
        }
        public Criteria andPeiqijigouIsNull() {
            addCriterion("peiqijigou is null");
            return (Criteria) this;
        }
        public Criteria andPeiqijigouIsNotNull() {
            addCriterion("peiqijigou is not null");
            return (Criteria) this;
        }
        public Criteria andPeiqijigouEqualTo(String value) {
            addCriterion("peiqijigou =", value, "peiqijigou");
            return (Criteria) this;
        }
        public Criteria andPeiqijigouNotEqualTo(String value) {
            addCriterion("peiqijigou <>", value, "peiqijigou");
            return (Criteria) this;
        }
        public Criteria andPeiqijigouGreaterThan(String value) {
            addCriterion("peiqijigou >", value, "peiqijigou");
            return (Criteria) this;
        }
        public Criteria andPeiqijigouGreaterThanOrEqualTo(String value) {
            addCriterion("peiqijigou >=", value, "peiqijigou");
            return (Criteria) this;
        }
        public Criteria andPeiqijigouLessThan(String value) {
            addCriterion("peiqijigou <", value, "peiqijigou");
            return (Criteria) this;
        }
        public Criteria andPeiqijigouLessThanOrEqualTo(String value) {
            addCriterion("peiqijigou <=", value, "peiqijigou");
            return (Criteria) this;
        }
        public Criteria andPeiqijigouLike(String value) {
            addCriterion("peiqijigou like", value, "peiqijigou");
            return (Criteria) this;
        }
        public Criteria andPeiqijigouNotLike(String value) {
            addCriterion("peiqijigou not like", value, "peiqijigou");
            return (Criteria) this;
        }
        public Criteria andPeiqijigouIn(List<String> values) {
            addCriterion("peiqijigou in", values, "peiqijigou");
            return (Criteria) this;
        }
        public Criteria andPeiqijigouNotIn(List<String> values) {
            addCriterion("peiqijigou not in", values, "peiqijigou");
            return (Criteria) this;
        }
        public Criteria andPeiqijigouBetween(String value1, String value2) {
            addCriterion("peiqijigou between", value1, value2, "peiqijigou");
            return (Criteria) this;
        }
        public Criteria andPeiqijigouNotBetween(String value1, String value2) {
            addCriterion("peiqijigou not between", value1, value2, "peiqijigou");
            return (Criteria) this;
        }
        public Criteria andGangjingIsNull() {
            addCriterion("gangjing is null");
            return (Criteria) this;
        }
        public Criteria andGangjingIsNotNull() {
            addCriterion("gangjing is not null");
            return (Criteria) this;
        }
        public Criteria andGangjingEqualTo(String value) {
            addCriterion("gangjing =", value, "gangjing");
            return (Criteria) this;
        }
        public Criteria andGangjingNotEqualTo(String value) {
            addCriterion("gangjing <>", value, "gangjing");
            return (Criteria) this;
        }
        public Criteria andGangjingGreaterThan(String value) {
            addCriterion("gangjing >", value, "gangjing");
            return (Criteria) this;
        }
        public Criteria andGangjingGreaterThanOrEqualTo(String value) {
            addCriterion("gangjing >=", value, "gangjing");
            return (Criteria) this;
        }
        public Criteria andGangjingLessThan(String value) {
            addCriterion("gangjing <", value, "gangjing");
            return (Criteria) this;
        }
        public Criteria andGangjingLessThanOrEqualTo(String value) {
            addCriterion("gangjing <=", value, "gangjing");
            return (Criteria) this;
        }
        public Criteria andGangjingLike(String value) {
            addCriterion("gangjing like", value, "gangjing");
            return (Criteria) this;
        }
        public Criteria andGangjingNotLike(String value) {
            addCriterion("gangjing not like", value, "gangjing");
            return (Criteria) this;
        }
        public Criteria andGangjingIn(List<String> values) {
            addCriterion("gangjing in", values, "gangjing");
            return (Criteria) this;
        }
        public Criteria andGangjingNotIn(List<String> values) {
            addCriterion("gangjing not in", values, "gangjing");
            return (Criteria) this;
        }
        public Criteria andGangjingBetween(String value1, String value2) {
            addCriterion("gangjing between", value1, value2, "gangjing");
            return (Criteria) this;
        }
        public Criteria andGangjingNotBetween(String value1, String value2) {
            addCriterion("gangjing not between", value1, value2, "gangjing");
            return (Criteria) this;
        }
        public Criteria andXingchengIsNull() {
            addCriterion("xingcheng is null");
            return (Criteria) this;
        }
        public Criteria andXingchengIsNotNull() {
            addCriterion("xingcheng is not null");
            return (Criteria) this;
        }
        public Criteria andXingchengEqualTo(String value) {
            addCriterion("xingcheng =", value, "xingcheng");
            return (Criteria) this;
        }
        public Criteria andXingchengNotEqualTo(String value) {
            addCriterion("xingcheng <>", value, "xingcheng");
            return (Criteria) this;
        }
        public Criteria andXingchengGreaterThan(String value) {
            addCriterion("xingcheng >", value, "xingcheng");
            return (Criteria) this;
        }
        public Criteria andXingchengGreaterThanOrEqualTo(String value) {
            addCriterion("xingcheng >=", value, "xingcheng");
            return (Criteria) this;
        }
        public Criteria andXingchengLessThan(String value) {
            addCriterion("xingcheng <", value, "xingcheng");
            return (Criteria) this;
        }
        public Criteria andXingchengLessThanOrEqualTo(String value) {
            addCriterion("xingcheng <=", value, "xingcheng");
            return (Criteria) this;
        }
        public Criteria andXingchengLike(String value) {
            addCriterion("xingcheng like", value, "xingcheng");
            return (Criteria) this;
        }
        public Criteria andXingchengNotLike(String value) {
            addCriterion("xingcheng not like", value, "xingcheng");
            return (Criteria) this;
        }
        public Criteria andXingchengIn(List<String> values) {
            addCriterion("xingcheng in", values, "xingcheng");
            return (Criteria) this;
        }
        public Criteria andXingchengNotIn(List<String> values) {
            addCriterion("xingcheng not in", values, "xingcheng");
            return (Criteria) this;
        }
        public Criteria andXingchengBetween(String value1, String value2) {
            addCriterion("xingcheng between", value1, value2, "xingcheng");
            return (Criteria) this;
        }
        public Criteria andXingchengNotBetween(String value1, String value2) {
            addCriterion("xingcheng not between", value1, value2, "xingcheng");
            return (Criteria) this;
        }
        public Criteria andZuida_maliIsNull() {
            addCriterion("zuida_mali is null");
            return (Criteria) this;
        }
        public Criteria andZuida_maliIsNotNull() {
            addCriterion("zuida_mali is not null");
            return (Criteria) this;
        }
        public Criteria andZuida_maliEqualTo(String value) {
            addCriterion("zuida_mali =", value, "zuida_mali");
            return (Criteria) this;
        }
        public Criteria andZuida_maliNotEqualTo(String value) {
            addCriterion("zuida_mali <>", value, "zuida_mali");
            return (Criteria) this;
        }
        public Criteria andZuida_maliGreaterThan(String value) {
            addCriterion("zuida_mali >", value, "zuida_mali");
            return (Criteria) this;
        }
        public Criteria andZuida_maliGreaterThanOrEqualTo(String value) {
            addCriterion("zuida_mali >=", value, "zuida_mali");
            return (Criteria) this;
        }
        public Criteria andZuida_maliLessThan(String value) {
            addCriterion("zuida_mali <", value, "zuida_mali");
            return (Criteria) this;
        }
        public Criteria andZuida_maliLessThanOrEqualTo(String value) {
            addCriterion("zuida_mali <=", value, "zuida_mali");
            return (Criteria) this;
        }
        public Criteria andZuida_maliLike(String value) {
            addCriterion("zuida_mali like", value, "zuida_mali");
            return (Criteria) this;
        }
        public Criteria andZuida_maliNotLike(String value) {
            addCriterion("zuida_mali not like", value, "zuida_mali");
            return (Criteria) this;
        }
        public Criteria andZuida_maliIn(List<String> values) {
            addCriterion("zuida_mali in", values, "zuida_mali");
            return (Criteria) this;
        }
        public Criteria andZuida_maliNotIn(List<String> values) {
            addCriterion("zuida_mali not in", values, "zuida_mali");
            return (Criteria) this;
        }
        public Criteria andZuida_maliBetween(String value1, String value2) {
            addCriterion("zuida_mali between", value1, value2, "zuida_mali");
            return (Criteria) this;
        }
        public Criteria andZuida_maliNotBetween(String value1, String value2) {
            addCriterion("zuida_mali not between", value1, value2, "zuida_mali");
            return (Criteria) this;
        }
        public Criteria andZuida_gonglvIsNull() {
            addCriterion("zuida_gonglv is null");
            return (Criteria) this;
        }
        public Criteria andZuida_gonglvIsNotNull() {
            addCriterion("zuida_gonglv is not null");
            return (Criteria) this;
        }
        public Criteria andZuida_gonglvEqualTo(String value) {
            addCriterion("zuida_gonglv =", value, "zuida_gonglv");
            return (Criteria) this;
        }
        public Criteria andZuida_gonglvNotEqualTo(String value) {
            addCriterion("zuida_gonglv <>", value, "zuida_gonglv");
            return (Criteria) this;
        }
        public Criteria andZuida_gonglvGreaterThan(String value) {
            addCriterion("zuida_gonglv >", value, "zuida_gonglv");
            return (Criteria) this;
        }
        public Criteria andZuida_gonglvGreaterThanOrEqualTo(String value) {
            addCriterion("zuida_gonglv >=", value, "zuida_gonglv");
            return (Criteria) this;
        }
        public Criteria andZuida_gonglvLessThan(String value) {
            addCriterion("zuida_gonglv <", value, "zuida_gonglv");
            return (Criteria) this;
        }
        public Criteria andZuida_gonglvLessThanOrEqualTo(String value) {
            addCriterion("zuida_gonglv <=", value, "zuida_gonglv");
            return (Criteria) this;
        }
        public Criteria andZuida_gonglvLike(String value) {
            addCriterion("zuida_gonglv like", value, "zuida_gonglv");
            return (Criteria) this;
        }
        public Criteria andZuida_gonglvNotLike(String value) {
            addCriterion("zuida_gonglv not like", value, "zuida_gonglv");
            return (Criteria) this;
        }
        public Criteria andZuida_gonglvIn(List<String> values) {
            addCriterion("zuida_gonglv in", values, "zuida_gonglv");
            return (Criteria) this;
        }
        public Criteria andZuida_gonglvNotIn(List<String> values) {
            addCriterion("zuida_gonglv not in", values, "zuida_gonglv");
            return (Criteria) this;
        }
        public Criteria andZuida_gonglvBetween(String value1, String value2) {
            addCriterion("zuida_gonglv between", value1, value2, "zuida_gonglv");
            return (Criteria) this;
        }
        public Criteria andZuida_gonglvNotBetween(String value1, String value2) {
            addCriterion("zuida_gonglv not between", value1, value2, "zuida_gonglv");
            return (Criteria) this;
        }
        public Criteria andZuida_zhuansuIsNull() {
            addCriterion("zuida_zhuansu is null");
            return (Criteria) this;
        }
        public Criteria andZuida_zhuansuIsNotNull() {
            addCriterion("zuida_zhuansu is not null");
            return (Criteria) this;
        }
        public Criteria andZuida_zhuansuEqualTo(String value) {
            addCriterion("zuida_zhuansu =", value, "zuida_zhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_zhuansuNotEqualTo(String value) {
            addCriterion("zuida_zhuansu <>", value, "zuida_zhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_zhuansuGreaterThan(String value) {
            addCriterion("zuida_zhuansu >", value, "zuida_zhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_zhuansuGreaterThanOrEqualTo(String value) {
            addCriterion("zuida_zhuansu >=", value, "zuida_zhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_zhuansuLessThan(String value) {
            addCriterion("zuida_zhuansu <", value, "zuida_zhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_zhuansuLessThanOrEqualTo(String value) {
            addCriterion("zuida_zhuansu <=", value, "zuida_zhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_zhuansuLike(String value) {
            addCriterion("zuida_zhuansu like", value, "zuida_zhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_zhuansuNotLike(String value) {
            addCriterion("zuida_zhuansu not like", value, "zuida_zhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_zhuansuIn(List<String> values) {
            addCriterion("zuida_zhuansu in", values, "zuida_zhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_zhuansuNotIn(List<String> values) {
            addCriterion("zuida_zhuansu not in", values, "zuida_zhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_zhuansuBetween(String value1, String value2) {
            addCriterion("zuida_zhuansu between", value1, value2, "zuida_zhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_zhuansuNotBetween(String value1, String value2) {
            addCriterion("zuida_zhuansu not between", value1, value2, "zuida_zhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_niujvIsNull() {
            addCriterion("zuida_niujv is null");
            return (Criteria) this;
        }
        public Criteria andZuida_niujvIsNotNull() {
            addCriterion("zuida_niujv is not null");
            return (Criteria) this;
        }
        public Criteria andZuida_niujvEqualTo(String value) {
            addCriterion("zuida_niujv =", value, "zuida_niujv");
            return (Criteria) this;
        }
        public Criteria andZuida_niujvNotEqualTo(String value) {
            addCriterion("zuida_niujv <>", value, "zuida_niujv");
            return (Criteria) this;
        }
        public Criteria andZuida_niujvGreaterThan(String value) {
            addCriterion("zuida_niujv >", value, "zuida_niujv");
            return (Criteria) this;
        }
        public Criteria andZuida_niujvGreaterThanOrEqualTo(String value) {
            addCriterion("zuida_niujv >=", value, "zuida_niujv");
            return (Criteria) this;
        }
        public Criteria andZuida_niujvLessThan(String value) {
            addCriterion("zuida_niujv <", value, "zuida_niujv");
            return (Criteria) this;
        }
        public Criteria andZuida_niujvLessThanOrEqualTo(String value) {
            addCriterion("zuida_niujv <=", value, "zuida_niujv");
            return (Criteria) this;
        }
        public Criteria andZuida_niujvLike(String value) {
            addCriterion("zuida_niujv like", value, "zuida_niujv");
            return (Criteria) this;
        }
        public Criteria andZuida_niujvNotLike(String value) {
            addCriterion("zuida_niujv not like", value, "zuida_niujv");
            return (Criteria) this;
        }
        public Criteria andZuida_niujvIn(List<String> values) {
            addCriterion("zuida_niujv in", values, "zuida_niujv");
            return (Criteria) this;
        }
        public Criteria andZuida_niujvNotIn(List<String> values) {
            addCriterion("zuida_niujv not in", values, "zuida_niujv");
            return (Criteria) this;
        }
        public Criteria andZuida_niujvBetween(String value1, String value2) {
            addCriterion("zuida_niujv between", value1, value2, "zuida_niujv");
            return (Criteria) this;
        }
        public Criteria andZuida_niujvNotBetween(String value1, String value2) {
            addCriterion("zuida_niujv not between", value1, value2, "zuida_niujv");
            return (Criteria) this;
        }
        public Criteria andZuida_nuijvzhuansuIsNull() {
            addCriterion("zuida_nuijvzhuansu is null");
            return (Criteria) this;
        }
        public Criteria andZuida_nuijvzhuansuIsNotNull() {
            addCriterion("zuida_nuijvzhuansu is not null");
            return (Criteria) this;
        }
        public Criteria andZuida_nuijvzhuansuEqualTo(String value) {
            addCriterion("zuida_nuijvzhuansu =", value, "zuida_nuijvzhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_nuijvzhuansuNotEqualTo(String value) {
            addCriterion("zuida_nuijvzhuansu <>", value, "zuida_nuijvzhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_nuijvzhuansuGreaterThan(String value) {
            addCriterion("zuida_nuijvzhuansu >", value, "zuida_nuijvzhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_nuijvzhuansuGreaterThanOrEqualTo(String value) {
            addCriterion("zuida_nuijvzhuansu >=", value, "zuida_nuijvzhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_nuijvzhuansuLessThan(String value) {
            addCriterion("zuida_nuijvzhuansu <", value, "zuida_nuijvzhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_nuijvzhuansuLessThanOrEqualTo(String value) {
            addCriterion("zuida_nuijvzhuansu <=", value, "zuida_nuijvzhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_nuijvzhuansuLike(String value) {
            addCriterion("zuida_nuijvzhuansu like", value, "zuida_nuijvzhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_nuijvzhuansuNotLike(String value) {
            addCriterion("zuida_nuijvzhuansu not like", value, "zuida_nuijvzhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_nuijvzhuansuIn(List<String> values) {
            addCriterion("zuida_nuijvzhuansu in", values, "zuida_nuijvzhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_nuijvzhuansuNotIn(List<String> values) {
            addCriterion("zuida_nuijvzhuansu not in", values, "zuida_nuijvzhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_nuijvzhuansuBetween(String value1, String value2) {
            addCriterion("zuida_nuijvzhuansu between", value1, value2, "zuida_nuijvzhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_nuijvzhuansuNotBetween(String value1, String value2) {
            addCriterion("zuida_nuijvzhuansu not between", value1, value2, "zuida_nuijvzhuansu");
            return (Criteria) this;
        }
        public Criteria andTeyoujishhuIsNull() {
            addCriterion("teyoujishhu is null");
            return (Criteria) this;
        }
        public Criteria andTeyoujishhuIsNotNull() {
            addCriterion("teyoujishhu is not null");
            return (Criteria) this;
        }
        public Criteria andTeyoujishhuEqualTo(String value) {
            addCriterion("teyoujishhu =", value, "teyoujishhu");
            return (Criteria) this;
        }
        public Criteria andTeyoujishhuNotEqualTo(String value) {
            addCriterion("teyoujishhu <>", value, "teyoujishhu");
            return (Criteria) this;
        }
        public Criteria andTeyoujishhuGreaterThan(String value) {
            addCriterion("teyoujishhu >", value, "teyoujishhu");
            return (Criteria) this;
        }
        public Criteria andTeyoujishhuGreaterThanOrEqualTo(String value) {
            addCriterion("teyoujishhu >=", value, "teyoujishhu");
            return (Criteria) this;
        }
        public Criteria andTeyoujishhuLessThan(String value) {
            addCriterion("teyoujishhu <", value, "teyoujishhu");
            return (Criteria) this;
        }
        public Criteria andTeyoujishhuLessThanOrEqualTo(String value) {
            addCriterion("teyoujishhu <=", value, "teyoujishhu");
            return (Criteria) this;
        }
        public Criteria andTeyoujishhuLike(String value) {
            addCriterion("teyoujishhu like", value, "teyoujishhu");
            return (Criteria) this;
        }
        public Criteria andTeyoujishhuNotLike(String value) {
            addCriterion("teyoujishhu not like", value, "teyoujishhu");
            return (Criteria) this;
        }
        public Criteria andTeyoujishhuIn(List<String> values) {
            addCriterion("teyoujishhu in", values, "teyoujishhu");
            return (Criteria) this;
        }
        public Criteria andTeyoujishhuNotIn(List<String> values) {
            addCriterion("teyoujishhu not in", values, "teyoujishhu");
            return (Criteria) this;
        }
        public Criteria andTeyoujishhuBetween(String value1, String value2) {
            addCriterion("teyoujishhu between", value1, value2, "teyoujishhu");
            return (Criteria) this;
        }
        public Criteria andTeyoujishhuNotBetween(String value1, String value2) {
            addCriterion("teyoujishhu not between", value1, value2, "teyoujishhu");
            return (Criteria) this;
        }
        public Criteria andRanliaoxingshiIsNull() {
            addCriterion("ranliaoxingshi is null");
            return (Criteria) this;
        }
        public Criteria andRanliaoxingshiIsNotNull() {
            addCriterion("ranliaoxingshi is not null");
            return (Criteria) this;
        }
        public Criteria andRanliaoxingshiEqualTo(String value) {
            addCriterion("ranliaoxingshi =", value, "ranliaoxingshi");
            return (Criteria) this;
        }
        public Criteria andRanliaoxingshiNotEqualTo(String value) {
            addCriterion("ranliaoxingshi <>", value, "ranliaoxingshi");
            return (Criteria) this;
        }
        public Criteria andRanliaoxingshiGreaterThan(String value) {
            addCriterion("ranliaoxingshi >", value, "ranliaoxingshi");
            return (Criteria) this;
        }
        public Criteria andRanliaoxingshiGreaterThanOrEqualTo(String value) {
            addCriterion("ranliaoxingshi >=", value, "ranliaoxingshi");
            return (Criteria) this;
        }
        public Criteria andRanliaoxingshiLessThan(String value) {
            addCriterion("ranliaoxingshi <", value, "ranliaoxingshi");
            return (Criteria) this;
        }
        public Criteria andRanliaoxingshiLessThanOrEqualTo(String value) {
            addCriterion("ranliaoxingshi <=", value, "ranliaoxingshi");
            return (Criteria) this;
        }
        public Criteria andRanliaoxingshiLike(String value) {
            addCriterion("ranliaoxingshi like", value, "ranliaoxingshi");
            return (Criteria) this;
        }
        public Criteria andRanliaoxingshiNotLike(String value) {
            addCriterion("ranliaoxingshi not like", value, "ranliaoxingshi");
            return (Criteria) this;
        }
        public Criteria andRanliaoxingshiIn(List<String> values) {
            addCriterion("ranliaoxingshi in", values, "ranliaoxingshi");
            return (Criteria) this;
        }
        public Criteria andRanliaoxingshiNotIn(List<String> values) {
            addCriterion("ranliaoxingshi not in", values, "ranliaoxingshi");
            return (Criteria) this;
        }
        public Criteria andRanliaoxingshiBetween(String value1, String value2) {
            addCriterion("ranliaoxingshi between", value1, value2, "ranliaoxingshi");
            return (Criteria) this;
        }
        public Criteria andRanliaoxingshiNotBetween(String value1, String value2) {
            addCriterion("ranliaoxingshi not between", value1, value2, "ranliaoxingshi");
            return (Criteria) this;
        }
        public Criteria andRanyoubiaohaoIsNull() {
            addCriterion("ranyoubiaohao is null");
            return (Criteria) this;
        }
        public Criteria andRanyoubiaohaoIsNotNull() {
            addCriterion("ranyoubiaohao is not null");
            return (Criteria) this;
        }
        public Criteria andRanyoubiaohaoEqualTo(String value) {
            addCriterion("ranyoubiaohao =", value, "ranyoubiaohao");
            return (Criteria) this;
        }
        public Criteria andRanyoubiaohaoNotEqualTo(String value) {
            addCriterion("ranyoubiaohao <>", value, "ranyoubiaohao");
            return (Criteria) this;
        }
        public Criteria andRanyoubiaohaoGreaterThan(String value) {
            addCriterion("ranyoubiaohao >", value, "ranyoubiaohao");
            return (Criteria) this;
        }
        public Criteria andRanyoubiaohaoGreaterThanOrEqualTo(String value) {
            addCriterion("ranyoubiaohao >=", value, "ranyoubiaohao");
            return (Criteria) this;
        }
        public Criteria andRanyoubiaohaoLessThan(String value) {
            addCriterion("ranyoubiaohao <", value, "ranyoubiaohao");
            return (Criteria) this;
        }
        public Criteria andRanyoubiaohaoLessThanOrEqualTo(String value) {
            addCriterion("ranyoubiaohao <=", value, "ranyoubiaohao");
            return (Criteria) this;
        }
        public Criteria andRanyoubiaohaoLike(String value) {
            addCriterion("ranyoubiaohao like", value, "ranyoubiaohao");
            return (Criteria) this;
        }
        public Criteria andRanyoubiaohaoNotLike(String value) {
            addCriterion("ranyoubiaohao not like", value, "ranyoubiaohao");
            return (Criteria) this;
        }
        public Criteria andRanyoubiaohaoIn(List<String> values) {
            addCriterion("ranyoubiaohao in", values, "ranyoubiaohao");
            return (Criteria) this;
        }
        public Criteria andRanyoubiaohaoNotIn(List<String> values) {
            addCriterion("ranyoubiaohao not in", values, "ranyoubiaohao");
            return (Criteria) this;
        }
        public Criteria andRanyoubiaohaoBetween(String value1, String value2) {
            addCriterion("ranyoubiaohao between", value1, value2, "ranyoubiaohao");
            return (Criteria) this;
        }
        public Criteria andRanyoubiaohaoNotBetween(String value1, String value2) {
            addCriterion("ranyoubiaohao not between", value1, value2, "ranyoubiaohao");
            return (Criteria) this;
        }
        public Criteria andGongyoufangshiIsNull() {
            addCriterion("gongyoufangshi is null");
            return (Criteria) this;
        }
        public Criteria andGongyoufangshiIsNotNull() {
            addCriterion("gongyoufangshi is not null");
            return (Criteria) this;
        }
        public Criteria andGongyoufangshiEqualTo(String value) {
            addCriterion("gongyoufangshi =", value, "gongyoufangshi");
            return (Criteria) this;
        }
        public Criteria andGongyoufangshiNotEqualTo(String value) {
            addCriterion("gongyoufangshi <>", value, "gongyoufangshi");
            return (Criteria) this;
        }
        public Criteria andGongyoufangshiGreaterThan(String value) {
            addCriterion("gongyoufangshi >", value, "gongyoufangshi");
            return (Criteria) this;
        }
        public Criteria andGongyoufangshiGreaterThanOrEqualTo(String value) {
            addCriterion("gongyoufangshi >=", value, "gongyoufangshi");
            return (Criteria) this;
        }
        public Criteria andGongyoufangshiLessThan(String value) {
            addCriterion("gongyoufangshi <", value, "gongyoufangshi");
            return (Criteria) this;
        }
        public Criteria andGongyoufangshiLessThanOrEqualTo(String value) {
            addCriterion("gongyoufangshi <=", value, "gongyoufangshi");
            return (Criteria) this;
        }
        public Criteria andGongyoufangshiLike(String value) {
            addCriterion("gongyoufangshi like", value, "gongyoufangshi");
            return (Criteria) this;
        }
        public Criteria andGongyoufangshiNotLike(String value) {
            addCriterion("gongyoufangshi not like", value, "gongyoufangshi");
            return (Criteria) this;
        }
        public Criteria andGongyoufangshiIn(List<String> values) {
            addCriterion("gongyoufangshi in", values, "gongyoufangshi");
            return (Criteria) this;
        }
        public Criteria andGongyoufangshiNotIn(List<String> values) {
            addCriterion("gongyoufangshi not in", values, "gongyoufangshi");
            return (Criteria) this;
        }
        public Criteria andGongyoufangshiBetween(String value1, String value2) {
            addCriterion("gongyoufangshi between", value1, value2, "gongyoufangshi");
            return (Criteria) this;
        }
        public Criteria andGongyoufangshiNotBetween(String value1, String value2) {
            addCriterion("gongyoufangshi not between", value1, value2, "gongyoufangshi");
            return (Criteria) this;
        }
        public Criteria andGanggaicailiaoIsNull() {
            addCriterion("ganggaicailiao is null");
            return (Criteria) this;
        }
        public Criteria andGanggaicailiaoIsNotNull() {
            addCriterion("ganggaicailiao is not null");
            return (Criteria) this;
        }
        public Criteria andGanggaicailiaoEqualTo(String value) {
            addCriterion("ganggaicailiao =", value, "ganggaicailiao");
            return (Criteria) this;
        }
        public Criteria andGanggaicailiaoNotEqualTo(String value) {
            addCriterion("ganggaicailiao <>", value, "ganggaicailiao");
            return (Criteria) this;
        }
        public Criteria andGanggaicailiaoGreaterThan(String value) {
            addCriterion("ganggaicailiao >", value, "ganggaicailiao");
            return (Criteria) this;
        }
        public Criteria andGanggaicailiaoGreaterThanOrEqualTo(String value) {
            addCriterion("ganggaicailiao >=", value, "ganggaicailiao");
            return (Criteria) this;
        }
        public Criteria andGanggaicailiaoLessThan(String value) {
            addCriterion("ganggaicailiao <", value, "ganggaicailiao");
            return (Criteria) this;
        }
        public Criteria andGanggaicailiaoLessThanOrEqualTo(String value) {
            addCriterion("ganggaicailiao <=", value, "ganggaicailiao");
            return (Criteria) this;
        }
        public Criteria andGanggaicailiaoLike(String value) {
            addCriterion("ganggaicailiao like", value, "ganggaicailiao");
            return (Criteria) this;
        }
        public Criteria andGanggaicailiaoNotLike(String value) {
            addCriterion("ganggaicailiao not like", value, "ganggaicailiao");
            return (Criteria) this;
        }
        public Criteria andGanggaicailiaoIn(List<String> values) {
            addCriterion("ganggaicailiao in", values, "ganggaicailiao");
            return (Criteria) this;
        }
        public Criteria andGanggaicailiaoNotIn(List<String> values) {
            addCriterion("ganggaicailiao not in", values, "ganggaicailiao");
            return (Criteria) this;
        }
        public Criteria andGanggaicailiaoBetween(String value1, String value2) {
            addCriterion("ganggaicailiao between", value1, value2, "ganggaicailiao");
            return (Criteria) this;
        }
        public Criteria andGanggaicailiaoNotBetween(String value1, String value2) {
            addCriterion("ganggaicailiao not between", value1, value2, "ganggaicailiao");
            return (Criteria) this;
        }
        public Criteria andGangticailiaoIsNull() {
            addCriterion("gangticailiao is null");
            return (Criteria) this;
        }
        public Criteria andGangticailiaoIsNotNull() {
            addCriterion("gangticailiao is not null");
            return (Criteria) this;
        }
        public Criteria andGangticailiaoEqualTo(String value) {
            addCriterion("gangticailiao =", value, "gangticailiao");
            return (Criteria) this;
        }
        public Criteria andGangticailiaoNotEqualTo(String value) {
            addCriterion("gangticailiao <>", value, "gangticailiao");
            return (Criteria) this;
        }
        public Criteria andGangticailiaoGreaterThan(String value) {
            addCriterion("gangticailiao >", value, "gangticailiao");
            return (Criteria) this;
        }
        public Criteria andGangticailiaoGreaterThanOrEqualTo(String value) {
            addCriterion("gangticailiao >=", value, "gangticailiao");
            return (Criteria) this;
        }
        public Criteria andGangticailiaoLessThan(String value) {
            addCriterion("gangticailiao <", value, "gangticailiao");
            return (Criteria) this;
        }
        public Criteria andGangticailiaoLessThanOrEqualTo(String value) {
            addCriterion("gangticailiao <=", value, "gangticailiao");
            return (Criteria) this;
        }
        public Criteria andGangticailiaoLike(String value) {
            addCriterion("gangticailiao like", value, "gangticailiao");
            return (Criteria) this;
        }
        public Criteria andGangticailiaoNotLike(String value) {
            addCriterion("gangticailiao not like", value, "gangticailiao");
            return (Criteria) this;
        }
        public Criteria andGangticailiaoIn(List<String> values) {
            addCriterion("gangticailiao in", values, "gangticailiao");
            return (Criteria) this;
        }
        public Criteria andGangticailiaoNotIn(List<String> values) {
            addCriterion("gangticailiao not in", values, "gangticailiao");
            return (Criteria) this;
        }
        public Criteria andGangticailiaoBetween(String value1, String value2) {
            addCriterion("gangticailiao between", value1, value2, "gangticailiao");
            return (Criteria) this;
        }
        public Criteria andGangticailiaoNotBetween(String value1, String value2) {
            addCriterion("gangticailiao not between", value1, value2, "gangticailiao");
            return (Criteria) this;
        }
        public Criteria andHuanbaobiaozhuanIsNull() {
            addCriterion("huanbaobiaozhuan is null");
            return (Criteria) this;
        }
        public Criteria andHuanbaobiaozhuanIsNotNull() {
            addCriterion("huanbaobiaozhuan is not null");
            return (Criteria) this;
        }
        public Criteria andHuanbaobiaozhuanEqualTo(String value) {
            addCriterion("huanbaobiaozhuan =", value, "huanbaobiaozhuan");
            return (Criteria) this;
        }
        public Criteria andHuanbaobiaozhuanNotEqualTo(String value) {
            addCriterion("huanbaobiaozhuan <>", value, "huanbaobiaozhuan");
            return (Criteria) this;
        }
        public Criteria andHuanbaobiaozhuanGreaterThan(String value) {
            addCriterion("huanbaobiaozhuan >", value, "huanbaobiaozhuan");
            return (Criteria) this;
        }
        public Criteria andHuanbaobiaozhuanGreaterThanOrEqualTo(String value) {
            addCriterion("huanbaobiaozhuan >=", value, "huanbaobiaozhuan");
            return (Criteria) this;
        }
        public Criteria andHuanbaobiaozhuanLessThan(String value) {
            addCriterion("huanbaobiaozhuan <", value, "huanbaobiaozhuan");
            return (Criteria) this;
        }
        public Criteria andHuanbaobiaozhuanLessThanOrEqualTo(String value) {
            addCriterion("huanbaobiaozhuan <=", value, "huanbaobiaozhuan");
            return (Criteria) this;
        }
        public Criteria andHuanbaobiaozhuanLike(String value) {
            addCriterion("huanbaobiaozhuan like", value, "huanbaobiaozhuan");
            return (Criteria) this;
        }
        public Criteria andHuanbaobiaozhuanNotLike(String value) {
            addCriterion("huanbaobiaozhuan not like", value, "huanbaobiaozhuan");
            return (Criteria) this;
        }
        public Criteria andHuanbaobiaozhuanIn(List<String> values) {
            addCriterion("huanbaobiaozhuan in", values, "huanbaobiaozhuan");
            return (Criteria) this;
        }
        public Criteria andHuanbaobiaozhuanNotIn(List<String> values) {
            addCriterion("huanbaobiaozhuan not in", values, "huanbaobiaozhuan");
            return (Criteria) this;
        }
        public Criteria andHuanbaobiaozhuanBetween(String value1, String value2) {
            addCriterion("huanbaobiaozhuan between", value1, value2, "huanbaobiaozhuan");
            return (Criteria) this;
        }
        public Criteria andHuanbaobiaozhuanNotBetween(String value1, String value2) {
            addCriterion("huanbaobiaozhuan not between", value1, value2, "huanbaobiaozhuan");
            return (Criteria) this;
        }
        public Criteria andDianjia_leixingIsNull() {
            addCriterion("dianjia_leixing is null");
            return (Criteria) this;
        }
        public Criteria andDianjia_leixingIsNotNull() {
            addCriterion("dianjia_leixing is not null");
            return (Criteria) this;
        }
        public Criteria andDianjia_leixingEqualTo(String value) {
            addCriterion("dianjia_leixing =", value, "dianjia_leixing");
            return (Criteria) this;
        }
        public Criteria andDianjia_leixingNotEqualTo(String value) {
            addCriterion("dianjia_leixing <>", value, "dianjia_leixing");
            return (Criteria) this;
        }
        public Criteria andDianjia_leixingGreaterThan(String value) {
            addCriterion("dianjia_leixing >", value, "dianjia_leixing");
            return (Criteria) this;
        }
        public Criteria andDianjia_leixingGreaterThanOrEqualTo(String value) {
            addCriterion("dianjia_leixing >=", value, "dianjia_leixing");
            return (Criteria) this;
        }
        public Criteria andDianjia_leixingLessThan(String value) {
            addCriterion("dianjia_leixing <", value, "dianjia_leixing");
            return (Criteria) this;
        }
        public Criteria andDianjia_leixingLessThanOrEqualTo(String value) {
            addCriterion("dianjia_leixing <=", value, "dianjia_leixing");
            return (Criteria) this;
        }
        public Criteria andDianjia_leixingLike(String value) {
            addCriterion("dianjia_leixing like", value, "dianjia_leixing");
            return (Criteria) this;
        }
        public Criteria andDianjia_leixingNotLike(String value) {
            addCriterion("dianjia_leixing not like", value, "dianjia_leixing");
            return (Criteria) this;
        }
        public Criteria andDianjia_leixingIn(List<String> values) {
            addCriterion("dianjia_leixing in", values, "dianjia_leixing");
            return (Criteria) this;
        }
        public Criteria andDianjia_leixingNotIn(List<String> values) {
            addCriterion("dianjia_leixing not in", values, "dianjia_leixing");
            return (Criteria) this;
        }
        public Criteria andDianjia_leixingBetween(String value1, String value2) {
            addCriterion("dianjia_leixing between", value1, value2, "dianjia_leixing");
            return (Criteria) this;
        }
        public Criteria andDianjia_leixingNotBetween(String value1, String value2) {
            addCriterion("dianjia_leixing not between", value1, value2, "dianjia_leixing");
            return (Criteria) this;
        }
        public Criteria andDainji_zongguonglvIsNull() {
            addCriterion("dainji_zongguonglv is null");
            return (Criteria) this;
        }
        public Criteria andDainji_zongguonglvIsNotNull() {
            addCriterion("dainji_zongguonglv is not null");
            return (Criteria) this;
        }
        public Criteria andDainji_zongguonglvEqualTo(String value) {
            addCriterion("dainji_zongguonglv =", value, "dainji_zongguonglv");
            return (Criteria) this;
        }
        public Criteria andDainji_zongguonglvNotEqualTo(String value) {
            addCriterion("dainji_zongguonglv <>", value, "dainji_zongguonglv");
            return (Criteria) this;
        }
        public Criteria andDainji_zongguonglvGreaterThan(String value) {
            addCriterion("dainji_zongguonglv >", value, "dainji_zongguonglv");
            return (Criteria) this;
        }
        public Criteria andDainji_zongguonglvGreaterThanOrEqualTo(String value) {
            addCriterion("dainji_zongguonglv >=", value, "dainji_zongguonglv");
            return (Criteria) this;
        }
        public Criteria andDainji_zongguonglvLessThan(String value) {
            addCriterion("dainji_zongguonglv <", value, "dainji_zongguonglv");
            return (Criteria) this;
        }
        public Criteria andDainji_zongguonglvLessThanOrEqualTo(String value) {
            addCriterion("dainji_zongguonglv <=", value, "dainji_zongguonglv");
            return (Criteria) this;
        }
        public Criteria andDainji_zongguonglvLike(String value) {
            addCriterion("dainji_zongguonglv like", value, "dainji_zongguonglv");
            return (Criteria) this;
        }
        public Criteria andDainji_zongguonglvNotLike(String value) {
            addCriterion("dainji_zongguonglv not like", value, "dainji_zongguonglv");
            return (Criteria) this;
        }
        public Criteria andDainji_zongguonglvIn(List<String> values) {
            addCriterion("dainji_zongguonglv in", values, "dainji_zongguonglv");
            return (Criteria) this;
        }
        public Criteria andDainji_zongguonglvNotIn(List<String> values) {
            addCriterion("dainji_zongguonglv not in", values, "dainji_zongguonglv");
            return (Criteria) this;
        }
        public Criteria andDainji_zongguonglvBetween(String value1, String value2) {
            addCriterion("dainji_zongguonglv between", value1, value2, "dainji_zongguonglv");
            return (Criteria) this;
        }
        public Criteria andDainji_zongguonglvNotBetween(String value1, String value2) {
            addCriterion("dainji_zongguonglv not between", value1, value2, "dainji_zongguonglv");
            return (Criteria) this;
        }
        public Criteria andDianji_zongniujvIsNull() {
            addCriterion("dianji_zongniujv is null");
            return (Criteria) this;
        }
        public Criteria andDianji_zongniujvIsNotNull() {
            addCriterion("dianji_zongniujv is not null");
            return (Criteria) this;
        }
        public Criteria andDianji_zongniujvEqualTo(String value) {
            addCriterion("dianji_zongniujv =", value, "dianji_zongniujv");
            return (Criteria) this;
        }
        public Criteria andDianji_zongniujvNotEqualTo(String value) {
            addCriterion("dianji_zongniujv <>", value, "dianji_zongniujv");
            return (Criteria) this;
        }
        public Criteria andDianji_zongniujvGreaterThan(String value) {
            addCriterion("dianji_zongniujv >", value, "dianji_zongniujv");
            return (Criteria) this;
        }
        public Criteria andDianji_zongniujvGreaterThanOrEqualTo(String value) {
            addCriterion("dianji_zongniujv >=", value, "dianji_zongniujv");
            return (Criteria) this;
        }
        public Criteria andDianji_zongniujvLessThan(String value) {
            addCriterion("dianji_zongniujv <", value, "dianji_zongniujv");
            return (Criteria) this;
        }
        public Criteria andDianji_zongniujvLessThanOrEqualTo(String value) {
            addCriterion("dianji_zongniujv <=", value, "dianji_zongniujv");
            return (Criteria) this;
        }
        public Criteria andDianji_zongniujvLike(String value) {
            addCriterion("dianji_zongniujv like", value, "dianji_zongniujv");
            return (Criteria) this;
        }
        public Criteria andDianji_zongniujvNotLike(String value) {
            addCriterion("dianji_zongniujv not like", value, "dianji_zongniujv");
            return (Criteria) this;
        }
        public Criteria andDianji_zongniujvIn(List<String> values) {
            addCriterion("dianji_zongniujv in", values, "dianji_zongniujv");
            return (Criteria) this;
        }
        public Criteria andDianji_zongniujvNotIn(List<String> values) {
            addCriterion("dianji_zongniujv not in", values, "dianji_zongniujv");
            return (Criteria) this;
        }
        public Criteria andDianji_zongniujvBetween(String value1, String value2) {
            addCriterion("dianji_zongniujv between", value1, value2, "dianji_zongniujv");
            return (Criteria) this;
        }
        public Criteria andDianji_zongniujvNotBetween(String value1, String value2) {
            addCriterion("dianji_zongniujv not between", value1, value2, "dianji_zongniujv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidadonglvIsNull() {
            addCriterion("qiandainji_zuidadonglv is null");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidadonglvIsNotNull() {
            addCriterion("qiandainji_zuidadonglv is not null");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidadonglvEqualTo(String value) {
            addCriterion("qiandainji_zuidadonglv =", value, "qiandainji_zuidadonglv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidadonglvNotEqualTo(String value) {
            addCriterion("qiandainji_zuidadonglv <>", value, "qiandainji_zuidadonglv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidadonglvGreaterThan(String value) {
            addCriterion("qiandainji_zuidadonglv >", value, "qiandainji_zuidadonglv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidadonglvGreaterThanOrEqualTo(String value) {
            addCriterion("qiandainji_zuidadonglv >=", value, "qiandainji_zuidadonglv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidadonglvLessThan(String value) {
            addCriterion("qiandainji_zuidadonglv <", value, "qiandainji_zuidadonglv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidadonglvLessThanOrEqualTo(String value) {
            addCriterion("qiandainji_zuidadonglv <=", value, "qiandainji_zuidadonglv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidadonglvLike(String value) {
            addCriterion("qiandainji_zuidadonglv like", value, "qiandainji_zuidadonglv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidadonglvNotLike(String value) {
            addCriterion("qiandainji_zuidadonglv not like", value, "qiandainji_zuidadonglv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidadonglvIn(List<String> values) {
            addCriterion("qiandainji_zuidadonglv in", values, "qiandainji_zuidadonglv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidadonglvNotIn(List<String> values) {
            addCriterion("qiandainji_zuidadonglv not in", values, "qiandainji_zuidadonglv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidadonglvBetween(String value1, String value2) {
            addCriterion("qiandainji_zuidadonglv between", value1, value2, "qiandainji_zuidadonglv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidadonglvNotBetween(String value1, String value2) {
            addCriterion("qiandainji_zuidadonglv not between", value1, value2, "qiandainji_zuidadonglv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidaniujvIsNull() {
            addCriterion("qiandainji_zuidaniujv is null");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidaniujvIsNotNull() {
            addCriterion("qiandainji_zuidaniujv is not null");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidaniujvEqualTo(String value) {
            addCriterion("qiandainji_zuidaniujv =", value, "qiandainji_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidaniujvNotEqualTo(String value) {
            addCriterion("qiandainji_zuidaniujv <>", value, "qiandainji_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidaniujvGreaterThan(String value) {
            addCriterion("qiandainji_zuidaniujv >", value, "qiandainji_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidaniujvGreaterThanOrEqualTo(String value) {
            addCriterion("qiandainji_zuidaniujv >=", value, "qiandainji_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidaniujvLessThan(String value) {
            addCriterion("qiandainji_zuidaniujv <", value, "qiandainji_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidaniujvLessThanOrEqualTo(String value) {
            addCriterion("qiandainji_zuidaniujv <=", value, "qiandainji_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidaniujvLike(String value) {
            addCriterion("qiandainji_zuidaniujv like", value, "qiandainji_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidaniujvNotLike(String value) {
            addCriterion("qiandainji_zuidaniujv not like", value, "qiandainji_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidaniujvIn(List<String> values) {
            addCriterion("qiandainji_zuidaniujv in", values, "qiandainji_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidaniujvNotIn(List<String> values) {
            addCriterion("qiandainji_zuidaniujv not in", values, "qiandainji_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidaniujvBetween(String value1, String value2) {
            addCriterion("qiandainji_zuidaniujv between", value1, value2, "qiandainji_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidaniujvNotBetween(String value1, String value2) {
            addCriterion("qiandainji_zuidaniujv not between", value1, value2, "qiandainji_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andHoutianji_zuidagonglvIsNull() {
            addCriterion("houtianji_zuidagonglv is null");
            return (Criteria) this;
        }
        public Criteria andHoutianji_zuidagonglvIsNotNull() {
            addCriterion("houtianji_zuidagonglv is not null");
            return (Criteria) this;
        }
        public Criteria andHoutianji_zuidagonglvEqualTo(String value) {
            addCriterion("houtianji_zuidagonglv =", value, "houtianji_zuidagonglv");
            return (Criteria) this;
        }
        public Criteria andHoutianji_zuidagonglvNotEqualTo(String value) {
            addCriterion("houtianji_zuidagonglv <>", value, "houtianji_zuidagonglv");
            return (Criteria) this;
        }
        public Criteria andHoutianji_zuidagonglvGreaterThan(String value) {
            addCriterion("houtianji_zuidagonglv >", value, "houtianji_zuidagonglv");
            return (Criteria) this;
        }
        public Criteria andHoutianji_zuidagonglvGreaterThanOrEqualTo(String value) {
            addCriterion("houtianji_zuidagonglv >=", value, "houtianji_zuidagonglv");
            return (Criteria) this;
        }
        public Criteria andHoutianji_zuidagonglvLessThan(String value) {
            addCriterion("houtianji_zuidagonglv <", value, "houtianji_zuidagonglv");
            return (Criteria) this;
        }
        public Criteria andHoutianji_zuidagonglvLessThanOrEqualTo(String value) {
            addCriterion("houtianji_zuidagonglv <=", value, "houtianji_zuidagonglv");
            return (Criteria) this;
        }
        public Criteria andHoutianji_zuidagonglvLike(String value) {
            addCriterion("houtianji_zuidagonglv like", value, "houtianji_zuidagonglv");
            return (Criteria) this;
        }
        public Criteria andHoutianji_zuidagonglvNotLike(String value) {
            addCriterion("houtianji_zuidagonglv not like", value, "houtianji_zuidagonglv");
            return (Criteria) this;
        }
        public Criteria andHoutianji_zuidagonglvIn(List<String> values) {
            addCriterion("houtianji_zuidagonglv in", values, "houtianji_zuidagonglv");
            return (Criteria) this;
        }
        public Criteria andHoutianji_zuidagonglvNotIn(List<String> values) {
            addCriterion("houtianji_zuidagonglv not in", values, "houtianji_zuidagonglv");
            return (Criteria) this;
        }
        public Criteria andHoutianji_zuidagonglvBetween(String value1, String value2) {
            addCriterion("houtianji_zuidagonglv between", value1, value2, "houtianji_zuidagonglv");
            return (Criteria) this;
        }
        public Criteria andHoutianji_zuidagonglvNotBetween(String value1, String value2) {
            addCriterion("houtianji_zuidagonglv not between", value1, value2, "houtianji_zuidagonglv");
            return (Criteria) this;
        }
        public Criteria andHoudainjia_zuidaniujvIsNull() {
            addCriterion("houdainjia_zuidaniujv is null");
            return (Criteria) this;
        }
        public Criteria andHoudainjia_zuidaniujvIsNotNull() {
            addCriterion("houdainjia_zuidaniujv is not null");
            return (Criteria) this;
        }
        public Criteria andHoudainjia_zuidaniujvEqualTo(String value) {
            addCriterion("houdainjia_zuidaniujv =", value, "houdainjia_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andHoudainjia_zuidaniujvNotEqualTo(String value) {
            addCriterion("houdainjia_zuidaniujv <>", value, "houdainjia_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andHoudainjia_zuidaniujvGreaterThan(String value) {
            addCriterion("houdainjia_zuidaniujv >", value, "houdainjia_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andHoudainjia_zuidaniujvGreaterThanOrEqualTo(String value) {
            addCriterion("houdainjia_zuidaniujv >=", value, "houdainjia_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andHoudainjia_zuidaniujvLessThan(String value) {
            addCriterion("houdainjia_zuidaniujv <", value, "houdainjia_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andHoudainjia_zuidaniujvLessThanOrEqualTo(String value) {
            addCriterion("houdainjia_zuidaniujv <=", value, "houdainjia_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andHoudainjia_zuidaniujvLike(String value) {
            addCriterion("houdainjia_zuidaniujv like", value, "houdainjia_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andHoudainjia_zuidaniujvNotLike(String value) {
            addCriterion("houdainjia_zuidaniujv not like", value, "houdainjia_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andHoudainjia_zuidaniujvIn(List<String> values) {
            addCriterion("houdainjia_zuidaniujv in", values, "houdainjia_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andHoudainjia_zuidaniujvNotIn(List<String> values) {
            addCriterion("houdainjia_zuidaniujv not in", values, "houdainjia_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andHoudainjia_zuidaniujvBetween(String value1, String value2) {
            addCriterion("houdainjia_zuidaniujv between", value1, value2, "houdainjia_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andHoudainjia_zuidaniujvNotBetween(String value1, String value2) {
            addCriterion("houdainjia_zuidaniujv not between", value1, value2, "houdainjia_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andXitong_zonghegonglvIsNull() {
            addCriterion("xitong_zonghegonglv is null");
            return (Criteria) this;
        }
        public Criteria andXitong_zonghegonglvIsNotNull() {
            addCriterion("xitong_zonghegonglv is not null");
            return (Criteria) this;
        }
        public Criteria andXitong_zonghegonglvEqualTo(String value) {
            addCriterion("xitong_zonghegonglv =", value, "xitong_zonghegonglv");
            return (Criteria) this;
        }
        public Criteria andXitong_zonghegonglvNotEqualTo(String value) {
            addCriterion("xitong_zonghegonglv <>", value, "xitong_zonghegonglv");
            return (Criteria) this;
        }
        public Criteria andXitong_zonghegonglvGreaterThan(String value) {
            addCriterion("xitong_zonghegonglv >", value, "xitong_zonghegonglv");
            return (Criteria) this;
        }
        public Criteria andXitong_zonghegonglvGreaterThanOrEqualTo(String value) {
            addCriterion("xitong_zonghegonglv >=", value, "xitong_zonghegonglv");
            return (Criteria) this;
        }
        public Criteria andXitong_zonghegonglvLessThan(String value) {
            addCriterion("xitong_zonghegonglv <", value, "xitong_zonghegonglv");
            return (Criteria) this;
        }
        public Criteria andXitong_zonghegonglvLessThanOrEqualTo(String value) {
            addCriterion("xitong_zonghegonglv <=", value, "xitong_zonghegonglv");
            return (Criteria) this;
        }
        public Criteria andXitong_zonghegonglvLike(String value) {
            addCriterion("xitong_zonghegonglv like", value, "xitong_zonghegonglv");
            return (Criteria) this;
        }
        public Criteria andXitong_zonghegonglvNotLike(String value) {
            addCriterion("xitong_zonghegonglv not like", value, "xitong_zonghegonglv");
            return (Criteria) this;
        }
        public Criteria andXitong_zonghegonglvIn(List<String> values) {
            addCriterion("xitong_zonghegonglv in", values, "xitong_zonghegonglv");
            return (Criteria) this;
        }
        public Criteria andXitong_zonghegonglvNotIn(List<String> values) {
            addCriterion("xitong_zonghegonglv not in", values, "xitong_zonghegonglv");
            return (Criteria) this;
        }
        public Criteria andXitong_zonghegonglvBetween(String value1, String value2) {
            addCriterion("xitong_zonghegonglv between", value1, value2, "xitong_zonghegonglv");
            return (Criteria) this;
        }
        public Criteria andXitong_zonghegonglvNotBetween(String value1, String value2) {
            addCriterion("xitong_zonghegonglv not between", value1, value2, "xitong_zonghegonglv");
            return (Criteria) this;
        }
        public Criteria andXitong_zongheniujvIsNull() {
            addCriterion("xitong_zongheniujv is null");
            return (Criteria) this;
        }
        public Criteria andXitong_zongheniujvIsNotNull() {
            addCriterion("xitong_zongheniujv is not null");
            return (Criteria) this;
        }
        public Criteria andXitong_zongheniujvEqualTo(String value) {
            addCriterion("xitong_zongheniujv =", value, "xitong_zongheniujv");
            return (Criteria) this;
        }
        public Criteria andXitong_zongheniujvNotEqualTo(String value) {
            addCriterion("xitong_zongheniujv <>", value, "xitong_zongheniujv");
            return (Criteria) this;
        }
        public Criteria andXitong_zongheniujvGreaterThan(String value) {
            addCriterion("xitong_zongheniujv >", value, "xitong_zongheniujv");
            return (Criteria) this;
        }
        public Criteria andXitong_zongheniujvGreaterThanOrEqualTo(String value) {
            addCriterion("xitong_zongheniujv >=", value, "xitong_zongheniujv");
            return (Criteria) this;
        }
        public Criteria andXitong_zongheniujvLessThan(String value) {
            addCriterion("xitong_zongheniujv <", value, "xitong_zongheniujv");
            return (Criteria) this;
        }
        public Criteria andXitong_zongheniujvLessThanOrEqualTo(String value) {
            addCriterion("xitong_zongheniujv <=", value, "xitong_zongheniujv");
            return (Criteria) this;
        }
        public Criteria andXitong_zongheniujvLike(String value) {
            addCriterion("xitong_zongheniujv like", value, "xitong_zongheniujv");
            return (Criteria) this;
        }
        public Criteria andXitong_zongheniujvNotLike(String value) {
            addCriterion("xitong_zongheniujv not like", value, "xitong_zongheniujv");
            return (Criteria) this;
        }
        public Criteria andXitong_zongheniujvIn(List<String> values) {
            addCriterion("xitong_zongheniujv in", values, "xitong_zongheniujv");
            return (Criteria) this;
        }
        public Criteria andXitong_zongheniujvNotIn(List<String> values) {
            addCriterion("xitong_zongheniujv not in", values, "xitong_zongheniujv");
            return (Criteria) this;
        }
        public Criteria andXitong_zongheniujvBetween(String value1, String value2) {
            addCriterion("xitong_zongheniujv between", value1, value2, "xitong_zongheniujv");
            return (Criteria) this;
        }
        public Criteria andXitong_zongheniujvNotBetween(String value1, String value2) {
            addCriterion("xitong_zongheniujv not between", value1, value2, "xitong_zongheniujv");
            return (Criteria) this;
        }
        public Criteria andQvdongdianjishuIsNull() {
            addCriterion("qvdongdianjishu is null");
            return (Criteria) this;
        }
        public Criteria andQvdongdianjishuIsNotNull() {
            addCriterion("qvdongdianjishu is not null");
            return (Criteria) this;
        }
        public Criteria andQvdongdianjishuEqualTo(String value) {
            addCriterion("qvdongdianjishu =", value, "qvdongdianjishu");
            return (Criteria) this;
        }
        public Criteria andQvdongdianjishuNotEqualTo(String value) {
            addCriterion("qvdongdianjishu <>", value, "qvdongdianjishu");
            return (Criteria) this;
        }
        public Criteria andQvdongdianjishuGreaterThan(String value) {
            addCriterion("qvdongdianjishu >", value, "qvdongdianjishu");
            return (Criteria) this;
        }
        public Criteria andQvdongdianjishuGreaterThanOrEqualTo(String value) {
            addCriterion("qvdongdianjishu >=", value, "qvdongdianjishu");
            return (Criteria) this;
        }
        public Criteria andQvdongdianjishuLessThan(String value) {
            addCriterion("qvdongdianjishu <", value, "qvdongdianjishu");
            return (Criteria) this;
        }
        public Criteria andQvdongdianjishuLessThanOrEqualTo(String value) {
            addCriterion("qvdongdianjishu <=", value, "qvdongdianjishu");
            return (Criteria) this;
        }
        public Criteria andQvdongdianjishuLike(String value) {
            addCriterion("qvdongdianjishu like", value, "qvdongdianjishu");
            return (Criteria) this;
        }
        public Criteria andQvdongdianjishuNotLike(String value) {
            addCriterion("qvdongdianjishu not like", value, "qvdongdianjishu");
            return (Criteria) this;
        }
        public Criteria andQvdongdianjishuIn(List<String> values) {
            addCriterion("qvdongdianjishu in", values, "qvdongdianjishu");
            return (Criteria) this;
        }
        public Criteria andQvdongdianjishuNotIn(List<String> values) {
            addCriterion("qvdongdianjishu not in", values, "qvdongdianjishu");
            return (Criteria) this;
        }
        public Criteria andQvdongdianjishuBetween(String value1, String value2) {
            addCriterion("qvdongdianjishu between", value1, value2, "qvdongdianjishu");
            return (Criteria) this;
        }
        public Criteria andQvdongdianjishuNotBetween(String value1, String value2) {
            addCriterion("qvdongdianjishu not between", value1, value2, "qvdongdianjishu");
            return (Criteria) this;
        }
        public Criteria andDianjibuqvIsNull() {
            addCriterion("dianjibuqv is null");
            return (Criteria) this;
        }
        public Criteria andDianjibuqvIsNotNull() {
            addCriterion("dianjibuqv is not null");
            return (Criteria) this;
        }
        public Criteria andDianjibuqvEqualTo(String value) {
            addCriterion("dianjibuqv =", value, "dianjibuqv");
            return (Criteria) this;
        }
        public Criteria andDianjibuqvNotEqualTo(String value) {
            addCriterion("dianjibuqv <>", value, "dianjibuqv");
            return (Criteria) this;
        }
        public Criteria andDianjibuqvGreaterThan(String value) {
            addCriterion("dianjibuqv >", value, "dianjibuqv");
            return (Criteria) this;
        }
        public Criteria andDianjibuqvGreaterThanOrEqualTo(String value) {
            addCriterion("dianjibuqv >=", value, "dianjibuqv");
            return (Criteria) this;
        }
        public Criteria andDianjibuqvLessThan(String value) {
            addCriterion("dianjibuqv <", value, "dianjibuqv");
            return (Criteria) this;
        }
        public Criteria andDianjibuqvLessThanOrEqualTo(String value) {
            addCriterion("dianjibuqv <=", value, "dianjibuqv");
            return (Criteria) this;
        }
        public Criteria andDianjibuqvLike(String value) {
            addCriterion("dianjibuqv like", value, "dianjibuqv");
            return (Criteria) this;
        }
        public Criteria andDianjibuqvNotLike(String value) {
            addCriterion("dianjibuqv not like", value, "dianjibuqv");
            return (Criteria) this;
        }
        public Criteria andDianjibuqvIn(List<String> values) {
            addCriterion("dianjibuqv in", values, "dianjibuqv");
            return (Criteria) this;
        }
        public Criteria andDianjibuqvNotIn(List<String> values) {
            addCriterion("dianjibuqv not in", values, "dianjibuqv");
            return (Criteria) this;
        }
        public Criteria andDianjibuqvBetween(String value1, String value2) {
            addCriterion("dianjibuqv between", value1, value2, "dianjibuqv");
            return (Criteria) this;
        }
        public Criteria andDianjibuqvNotBetween(String value1, String value2) {
            addCriterion("dianjibuqv not between", value1, value2, "dianjibuqv");
            return (Criteria) this;
        }
        public Criteria andDianchileixingIsNull() {
            addCriterion("dianchileixing is null");
            return (Criteria) this;
        }
        public Criteria andDianchileixingIsNotNull() {
            addCriterion("dianchileixing is not null");
            return (Criteria) this;
        }
        public Criteria andDianchileixingEqualTo(String value) {
            addCriterion("dianchileixing =", value, "dianchileixing");
            return (Criteria) this;
        }
        public Criteria andDianchileixingNotEqualTo(String value) {
            addCriterion("dianchileixing <>", value, "dianchileixing");
            return (Criteria) this;
        }
        public Criteria andDianchileixingGreaterThan(String value) {
            addCriterion("dianchileixing >", value, "dianchileixing");
            return (Criteria) this;
        }
        public Criteria andDianchileixingGreaterThanOrEqualTo(String value) {
            addCriterion("dianchileixing >=", value, "dianchileixing");
            return (Criteria) this;
        }
        public Criteria andDianchileixingLessThan(String value) {
            addCriterion("dianchileixing <", value, "dianchileixing");
            return (Criteria) this;
        }
        public Criteria andDianchileixingLessThanOrEqualTo(String value) {
            addCriterion("dianchileixing <=", value, "dianchileixing");
            return (Criteria) this;
        }
        public Criteria andDianchileixingLike(String value) {
            addCriterion("dianchileixing like", value, "dianchileixing");
            return (Criteria) this;
        }
        public Criteria andDianchileixingNotLike(String value) {
            addCriterion("dianchileixing not like", value, "dianchileixing");
            return (Criteria) this;
        }
        public Criteria andDianchileixingIn(List<String> values) {
            addCriterion("dianchileixing in", values, "dianchileixing");
            return (Criteria) this;
        }
        public Criteria andDianchileixingNotIn(List<String> values) {
            addCriterion("dianchileixing not in", values, "dianchileixing");
            return (Criteria) this;
        }
        public Criteria andDianchileixingBetween(String value1, String value2) {
            addCriterion("dianchileixing between", value1, value2, "dianchileixing");
            return (Criteria) this;
        }
        public Criteria andDianchileixingNotBetween(String value1, String value2) {
            addCriterion("dianchileixing not between", value1, value2, "dianchileixing");
            return (Criteria) this;
        }
        public Criteria andNengyuanleixingIsNull() {
            addCriterion("nengyuanleixing is null");
            return (Criteria) this;
        }
        public Criteria andNengyuanleixingIsNotNull() {
            addCriterion("nengyuanleixing is not null");
            return (Criteria) this;
        }
        public Criteria andNengyuanleixingEqualTo(String value) {
            addCriterion("nengyuanleixing =", value, "nengyuanleixing");
            return (Criteria) this;
        }
        public Criteria andNengyuanleixingNotEqualTo(String value) {
            addCriterion("nengyuanleixing <>", value, "nengyuanleixing");
            return (Criteria) this;
        }
        public Criteria andNengyuanleixingGreaterThan(String value) {
            addCriterion("nengyuanleixing >", value, "nengyuanleixing");
            return (Criteria) this;
        }
        public Criteria andNengyuanleixingGreaterThanOrEqualTo(String value) {
            addCriterion("nengyuanleixing >=", value, "nengyuanleixing");
            return (Criteria) this;
        }
        public Criteria andNengyuanleixingLessThan(String value) {
            addCriterion("nengyuanleixing <", value, "nengyuanleixing");
            return (Criteria) this;
        }
        public Criteria andNengyuanleixingLessThanOrEqualTo(String value) {
            addCriterion("nengyuanleixing <=", value, "nengyuanleixing");
            return (Criteria) this;
        }
        public Criteria andNengyuanleixingLike(String value) {
            addCriterion("nengyuanleixing like", value, "nengyuanleixing");
            return (Criteria) this;
        }
        public Criteria andNengyuanleixingNotLike(String value) {
            addCriterion("nengyuanleixing not like", value, "nengyuanleixing");
            return (Criteria) this;
        }
        public Criteria andNengyuanleixingIn(List<String> values) {
            addCriterion("nengyuanleixing in", values, "nengyuanleixing");
            return (Criteria) this;
        }
        public Criteria andNengyuanleixingNotIn(List<String> values) {
            addCriterion("nengyuanleixing not in", values, "nengyuanleixing");
            return (Criteria) this;
        }
        public Criteria andNengyuanleixingBetween(String value1, String value2) {
            addCriterion("nengyuanleixing between", value1, value2, "nengyuanleixing");
            return (Criteria) this;
        }
        public Criteria andNengyuanleixingNotBetween(String value1, String value2) {
            addCriterion("nengyuanleixing not between", value1, value2, "nengyuanleixing");
            return (Criteria) this;
        }
        public Criteria andXvhuanglichengIsNull() {
            addCriterion("xvhuanglicheng is null");
            return (Criteria) this;
        }
        public Criteria andXvhuanglichengIsNotNull() {
            addCriterion("xvhuanglicheng is not null");
            return (Criteria) this;
        }
        public Criteria andXvhuanglichengEqualTo(String value) {
            addCriterion("xvhuanglicheng =", value, "xvhuanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhuanglichengNotEqualTo(String value) {
            addCriterion("xvhuanglicheng <>", value, "xvhuanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhuanglichengGreaterThan(String value) {
            addCriterion("xvhuanglicheng >", value, "xvhuanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhuanglichengGreaterThanOrEqualTo(String value) {
            addCriterion("xvhuanglicheng >=", value, "xvhuanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhuanglichengLessThan(String value) {
            addCriterion("xvhuanglicheng <", value, "xvhuanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhuanglichengLessThanOrEqualTo(String value) {
            addCriterion("xvhuanglicheng <=", value, "xvhuanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhuanglichengLike(String value) {
            addCriterion("xvhuanglicheng like", value, "xvhuanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhuanglichengNotLike(String value) {
            addCriterion("xvhuanglicheng not like", value, "xvhuanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhuanglichengIn(List<String> values) {
            addCriterion("xvhuanglicheng in", values, "xvhuanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhuanglichengNotIn(List<String> values) {
            addCriterion("xvhuanglicheng not in", values, "xvhuanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhuanglichengBetween(String value1, String value2) {
            addCriterion("xvhuanglicheng between", value1, value2, "xvhuanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhuanglichengNotBetween(String value1, String value2) {
            addCriterion("xvhuanglicheng not between", value1, value2, "xvhuanglicheng");
            return (Criteria) this;
        }
        public Criteria andBaiFenBiIsNull() {
            addCriterion("baiFenBi is null");
            return (Criteria) this;
        }
        public Criteria andBaiFenBiIsNotNull() {
            addCriterion("baiFenBi is not null");
            return (Criteria) this;
        }
        public Criteria andBaiFenBiEqualTo(String value) {
            addCriterion("baiFenBi =", value, "baiFenBi");
            return (Criteria) this;
        }
        public Criteria andBaiFenBiNotEqualTo(String value) {
            addCriterion("baiFenBi <>", value, "baiFenBi");
            return (Criteria) this;
        }
        public Criteria andBaiFenBiGreaterThan(String value) {
            addCriterion("baiFenBi >", value, "baiFenBi");
            return (Criteria) this;
        }
        public Criteria andBaiFenBiGreaterThanOrEqualTo(String value) {
            addCriterion("baiFenBi >=", value, "baiFenBi");
            return (Criteria) this;
        }
        public Criteria andBaiFenBiLessThan(String value) {
            addCriterion("baiFenBi <", value, "baiFenBi");
            return (Criteria) this;
        }
        public Criteria andBaiFenBiLessThanOrEqualTo(String value) {
            addCriterion("baiFenBi <=", value, "baiFenBi");
            return (Criteria) this;
        }
        public Criteria andBaiFenBiLike(String value) {
            addCriterion("baiFenBi like", value, "baiFenBi");
            return (Criteria) this;
        }
        public Criteria andBaiFenBiNotLike(String value) {
            addCriterion("baiFenBi not like", value, "baiFenBi");
            return (Criteria) this;
        }
        public Criteria andBaiFenBiIn(List<String> values) {
            addCriterion("baiFenBi in", values, "baiFenBi");
            return (Criteria) this;
        }
        public Criteria andBaiFenBiNotIn(List<String> values) {
            addCriterion("baiFenBi not in", values, "baiFenBi");
            return (Criteria) this;
        }
        public Criteria andBaiFenBiBetween(String value1, String value2) {
            addCriterion("baiFenBi between", value1, value2, "baiFenBi");
            return (Criteria) this;
        }
        public Criteria andBaiFenBiNotBetween(String value1, String value2) {
            addCriterion("baiFenBi not between", value1, value2, "baiFenBi");
            return (Criteria) this;
        }
        public Criteria andXvhanglichengIsNull() {
            addCriterion("xvhanglicheng is null");
            return (Criteria) this;
        }
        public Criteria andXvhanglichengIsNotNull() {
            addCriterion("xvhanglicheng is not null");
            return (Criteria) this;
        }
        public Criteria andXvhanglichengEqualTo(String value) {
            addCriterion("xvhanglicheng =", value, "xvhanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhanglichengNotEqualTo(String value) {
            addCriterion("xvhanglicheng <>", value, "xvhanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhanglichengGreaterThan(String value) {
            addCriterion("xvhanglicheng >", value, "xvhanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhanglichengGreaterThanOrEqualTo(String value) {
            addCriterion("xvhanglicheng >=", value, "xvhanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhanglichengLessThan(String value) {
            addCriterion("xvhanglicheng <", value, "xvhanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhanglichengLessThanOrEqualTo(String value) {
            addCriterion("xvhanglicheng <=", value, "xvhanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhanglichengLike(String value) {
            addCriterion("xvhanglicheng like", value, "xvhanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhanglichengNotLike(String value) {
            addCriterion("xvhanglicheng not like", value, "xvhanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhanglichengIn(List<String> values) {
            addCriterion("xvhanglicheng in", values, "xvhanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhanglichengNotIn(List<String> values) {
            addCriterion("xvhanglicheng not in", values, "xvhanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhanglichengBetween(String value1, String value2) {
            addCriterion("xvhanglicheng between", value1, value2, "xvhanglicheng");
            return (Criteria) this;
        }
        public Criteria andXvhanglichengNotBetween(String value1, String value2) {
            addCriterion("xvhanglicheng not between", value1, value2, "xvhanglicheng");
            return (Criteria) this;
        }
        public Criteria andDainchirongliangIsNull() {
            addCriterion("dainchirongliang is null");
            return (Criteria) this;
        }
        public Criteria andDainchirongliangIsNotNull() {
            addCriterion("dainchirongliang is not null");
            return (Criteria) this;
        }
        public Criteria andDainchirongliangEqualTo(String value) {
            addCriterion("dainchirongliang =", value, "dainchirongliang");
            return (Criteria) this;
        }
        public Criteria andDainchirongliangNotEqualTo(String value) {
            addCriterion("dainchirongliang <>", value, "dainchirongliang");
            return (Criteria) this;
        }
        public Criteria andDainchirongliangGreaterThan(String value) {
            addCriterion("dainchirongliang >", value, "dainchirongliang");
            return (Criteria) this;
        }
        public Criteria andDainchirongliangGreaterThanOrEqualTo(String value) {
            addCriterion("dainchirongliang >=", value, "dainchirongliang");
            return (Criteria) this;
        }
        public Criteria andDainchirongliangLessThan(String value) {
            addCriterion("dainchirongliang <", value, "dainchirongliang");
            return (Criteria) this;
        }
        public Criteria andDainchirongliangLessThanOrEqualTo(String value) {
            addCriterion("dainchirongliang <=", value, "dainchirongliang");
            return (Criteria) this;
        }
        public Criteria andDainchirongliangLike(String value) {
            addCriterion("dainchirongliang like", value, "dainchirongliang");
            return (Criteria) this;
        }
        public Criteria andDainchirongliangNotLike(String value) {
            addCriterion("dainchirongliang not like", value, "dainchirongliang");
            return (Criteria) this;
        }
        public Criteria andDainchirongliangIn(List<String> values) {
            addCriterion("dainchirongliang in", values, "dainchirongliang");
            return (Criteria) this;
        }
        public Criteria andDainchirongliangNotIn(List<String> values) {
            addCriterion("dainchirongliang not in", values, "dainchirongliang");
            return (Criteria) this;
        }
        public Criteria andDainchirongliangBetween(String value1, String value2) {
            addCriterion("dainchirongliang between", value1, value2, "dainchirongliang");
            return (Criteria) this;
        }
        public Criteria andDainchirongliangNotBetween(String value1, String value2) {
            addCriterion("dainchirongliang not between", value1, value2, "dainchirongliang");
            return (Criteria) this;
        }
        public Criteria andYouhaoIsNull() {
            addCriterion("youhao is null");
            return (Criteria) this;
        }
        public Criteria andYouhaoIsNotNull() {
            addCriterion("youhao is not null");
            return (Criteria) this;
        }
        public Criteria andYouhaoEqualTo(String value) {
            addCriterion("youhao =", value, "youhao");
            return (Criteria) this;
        }
        public Criteria andYouhaoNotEqualTo(String value) {
            addCriterion("youhao <>", value, "youhao");
            return (Criteria) this;
        }
        public Criteria andYouhaoGreaterThan(String value) {
            addCriterion("youhao >", value, "youhao");
            return (Criteria) this;
        }
        public Criteria andYouhaoGreaterThanOrEqualTo(String value) {
            addCriterion("youhao >=", value, "youhao");
            return (Criteria) this;
        }
        public Criteria andYouhaoLessThan(String value) {
            addCriterion("youhao <", value, "youhao");
            return (Criteria) this;
        }
        public Criteria andYouhaoLessThanOrEqualTo(String value) {
            addCriterion("youhao <=", value, "youhao");
            return (Criteria) this;
        }
        public Criteria andYouhaoLike(String value) {
            addCriterion("youhao like", value, "youhao");
            return (Criteria) this;
        }
        public Criteria andYouhaoNotLike(String value) {
            addCriterion("youhao not like", value, "youhao");
            return (Criteria) this;
        }
        public Criteria andYouhaoIn(List<String> values) {
            addCriterion("youhao in", values, "youhao");
            return (Criteria) this;
        }
        public Criteria andYouhaoNotIn(List<String> values) {
            addCriterion("youhao not in", values, "youhao");
            return (Criteria) this;
        }
        public Criteria andYouhaoBetween(String value1, String value2) {
            addCriterion("youhao between", value1, value2, "youhao");
            return (Criteria) this;
        }
        public Criteria andYouhaoNotBetween(String value1, String value2) {
            addCriterion("youhao not between", value1, value2, "youhao");
            return (Criteria) this;
        }
        public Criteria andKuaichnegdainliangIsNull() {
            addCriterion("kuaichnegdainliang is null");
            return (Criteria) this;
        }
        public Criteria andKuaichnegdainliangIsNotNull() {
            addCriterion("kuaichnegdainliang is not null");
            return (Criteria) this;
        }
        public Criteria andKuaichnegdainliangEqualTo(String value) {
            addCriterion("kuaichnegdainliang =", value, "kuaichnegdainliang");
            return (Criteria) this;
        }
        public Criteria andKuaichnegdainliangNotEqualTo(String value) {
            addCriterion("kuaichnegdainliang <>", value, "kuaichnegdainliang");
            return (Criteria) this;
        }
        public Criteria andKuaichnegdainliangGreaterThan(String value) {
            addCriterion("kuaichnegdainliang >", value, "kuaichnegdainliang");
            return (Criteria) this;
        }
        public Criteria andKuaichnegdainliangGreaterThanOrEqualTo(String value) {
            addCriterion("kuaichnegdainliang >=", value, "kuaichnegdainliang");
            return (Criteria) this;
        }
        public Criteria andKuaichnegdainliangLessThan(String value) {
            addCriterion("kuaichnegdainliang <", value, "kuaichnegdainliang");
            return (Criteria) this;
        }
        public Criteria andKuaichnegdainliangLessThanOrEqualTo(String value) {
            addCriterion("kuaichnegdainliang <=", value, "kuaichnegdainliang");
            return (Criteria) this;
        }
        public Criteria andKuaichnegdainliangLike(String value) {
            addCriterion("kuaichnegdainliang like", value, "kuaichnegdainliang");
            return (Criteria) this;
        }
        public Criteria andKuaichnegdainliangNotLike(String value) {
            addCriterion("kuaichnegdainliang not like", value, "kuaichnegdainliang");
            return (Criteria) this;
        }
        public Criteria andKuaichnegdainliangIn(List<String> values) {
            addCriterion("kuaichnegdainliang in", values, "kuaichnegdainliang");
            return (Criteria) this;
        }
        public Criteria andKuaichnegdainliangNotIn(List<String> values) {
            addCriterion("kuaichnegdainliang not in", values, "kuaichnegdainliang");
            return (Criteria) this;
        }
        public Criteria andKuaichnegdainliangBetween(String value1, String value2) {
            addCriterion("kuaichnegdainliang between", value1, value2, "kuaichnegdainliang");
            return (Criteria) this;
        }
        public Criteria andKuaichnegdainliangNotBetween(String value1, String value2) {
            addCriterion("kuaichnegdainliang not between", value1, value2, "kuaichnegdainliang");
            return (Criteria) this;
        }
        public Criteria andChengdianzhnagjiageIsNull() {
            addCriterion("chengdianzhnagjiage is null");
            return (Criteria) this;
        }
        public Criteria andChengdianzhnagjiageIsNotNull() {
            addCriterion("chengdianzhnagjiage is not null");
            return (Criteria) this;
        }
        public Criteria andChengdianzhnagjiageEqualTo(String value) {
            addCriterion("chengdianzhnagjiage =", value, "chengdianzhnagjiage");
            return (Criteria) this;
        }
        public Criteria andChengdianzhnagjiageNotEqualTo(String value) {
            addCriterion("chengdianzhnagjiage <>", value, "chengdianzhnagjiage");
            return (Criteria) this;
        }
        public Criteria andChengdianzhnagjiageGreaterThan(String value) {
            addCriterion("chengdianzhnagjiage >", value, "chengdianzhnagjiage");
            return (Criteria) this;
        }
        public Criteria andChengdianzhnagjiageGreaterThanOrEqualTo(String value) {
            addCriterion("chengdianzhnagjiage >=", value, "chengdianzhnagjiage");
            return (Criteria) this;
        }
        public Criteria andChengdianzhnagjiageLessThan(String value) {
            addCriterion("chengdianzhnagjiage <", value, "chengdianzhnagjiage");
            return (Criteria) this;
        }
        public Criteria andChengdianzhnagjiageLessThanOrEqualTo(String value) {
            addCriterion("chengdianzhnagjiage <=", value, "chengdianzhnagjiage");
            return (Criteria) this;
        }
        public Criteria andChengdianzhnagjiageLike(String value) {
            addCriterion("chengdianzhnagjiage like", value, "chengdianzhnagjiage");
            return (Criteria) this;
        }
        public Criteria andChengdianzhnagjiageNotLike(String value) {
            addCriterion("chengdianzhnagjiage not like", value, "chengdianzhnagjiage");
            return (Criteria) this;
        }
        public Criteria andChengdianzhnagjiageIn(List<String> values) {
            addCriterion("chengdianzhnagjiage in", values, "chengdianzhnagjiage");
            return (Criteria) this;
        }
        public Criteria andChengdianzhnagjiageNotIn(List<String> values) {
            addCriterion("chengdianzhnagjiage not in", values, "chengdianzhnagjiage");
            return (Criteria) this;
        }
        public Criteria andChengdianzhnagjiageBetween(String value1, String value2) {
            addCriterion("chengdianzhnagjiage between", value1, value2, "chengdianzhnagjiage");
            return (Criteria) this;
        }
        public Criteria andChengdianzhnagjiageNotBetween(String value1, String value2) {
            addCriterion("chengdianzhnagjiage not between", value1, value2, "chengdianzhnagjiage");
            return (Criteria) this;
        }
        public Criteria andDangweishuIsNull() {
            addCriterion("dangweishu is null");
            return (Criteria) this;
        }
        public Criteria andDangweishuIsNotNull() {
            addCriterion("dangweishu is not null");
            return (Criteria) this;
        }
        public Criteria andDangweishuEqualTo(String value) {
            addCriterion("dangweishu =", value, "dangweishu");
            return (Criteria) this;
        }
        public Criteria andDangweishuNotEqualTo(String value) {
            addCriterion("dangweishu <>", value, "dangweishu");
            return (Criteria) this;
        }
        public Criteria andDangweishuGreaterThan(String value) {
            addCriterion("dangweishu >", value, "dangweishu");
            return (Criteria) this;
        }
        public Criteria andDangweishuGreaterThanOrEqualTo(String value) {
            addCriterion("dangweishu >=", value, "dangweishu");
            return (Criteria) this;
        }
        public Criteria andDangweishuLessThan(String value) {
            addCriterion("dangweishu <", value, "dangweishu");
            return (Criteria) this;
        }
        public Criteria andDangweishuLessThanOrEqualTo(String value) {
            addCriterion("dangweishu <=", value, "dangweishu");
            return (Criteria) this;
        }
        public Criteria andDangweishuLike(String value) {
            addCriterion("dangweishu like", value, "dangweishu");
            return (Criteria) this;
        }
        public Criteria andDangweishuNotLike(String value) {
            addCriterion("dangweishu not like", value, "dangweishu");
            return (Criteria) this;
        }
        public Criteria andDangweishuIn(List<String> values) {
            addCriterion("dangweishu in", values, "dangweishu");
            return (Criteria) this;
        }
        public Criteria andDangweishuNotIn(List<String> values) {
            addCriterion("dangweishu not in", values, "dangweishu");
            return (Criteria) this;
        }
        public Criteria andDangweishuBetween(String value1, String value2) {
            addCriterion("dangweishu between", value1, value2, "dangweishu");
            return (Criteria) this;
        }
        public Criteria andDangweishuNotBetween(String value1, String value2) {
            addCriterion("dangweishu not between", value1, value2, "dangweishu");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangleixingIsNull() {
            addCriterion("biansuxiangleixing is null");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangleixingIsNotNull() {
            addCriterion("biansuxiangleixing is not null");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangleixingEqualTo(String value) {
            addCriterion("biansuxiangleixing =", value, "biansuxiangleixing");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangleixingNotEqualTo(String value) {
            addCriterion("biansuxiangleixing <>", value, "biansuxiangleixing");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangleixingGreaterThan(String value) {
            addCriterion("biansuxiangleixing >", value, "biansuxiangleixing");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangleixingGreaterThanOrEqualTo(String value) {
            addCriterion("biansuxiangleixing >=", value, "biansuxiangleixing");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangleixingLessThan(String value) {
            addCriterion("biansuxiangleixing <", value, "biansuxiangleixing");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangleixingLessThanOrEqualTo(String value) {
            addCriterion("biansuxiangleixing <=", value, "biansuxiangleixing");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangleixingLike(String value) {
            addCriterion("biansuxiangleixing like", value, "biansuxiangleixing");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangleixingNotLike(String value) {
            addCriterion("biansuxiangleixing not like", value, "biansuxiangleixing");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangleixingIn(List<String> values) {
            addCriterion("biansuxiangleixing in", values, "biansuxiangleixing");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangleixingNotIn(List<String> values) {
            addCriterion("biansuxiangleixing not in", values, "biansuxiangleixing");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangleixingBetween(String value1, String value2) {
            addCriterion("biansuxiangleixing between", value1, value2, "biansuxiangleixing");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangleixingNotBetween(String value1, String value2) {
            addCriterion("biansuxiangleixing not between", value1, value2, "biansuxiangleixing");
            return (Criteria) this;
        }
        public Criteria andJianchengIsNull() {
            addCriterion("jiancheng is null");
            return (Criteria) this;
        }
        public Criteria andJianchengIsNotNull() {
            addCriterion("jiancheng is not null");
            return (Criteria) this;
        }
        public Criteria andJianchengEqualTo(String value) {
            addCriterion("jiancheng =", value, "jiancheng");
            return (Criteria) this;
        }
        public Criteria andJianchengNotEqualTo(String value) {
            addCriterion("jiancheng <>", value, "jiancheng");
            return (Criteria) this;
        }
        public Criteria andJianchengGreaterThan(String value) {
            addCriterion("jiancheng >", value, "jiancheng");
            return (Criteria) this;
        }
        public Criteria andJianchengGreaterThanOrEqualTo(String value) {
            addCriterion("jiancheng >=", value, "jiancheng");
            return (Criteria) this;
        }
        public Criteria andJianchengLessThan(String value) {
            addCriterion("jiancheng <", value, "jiancheng");
            return (Criteria) this;
        }
        public Criteria andJianchengLessThanOrEqualTo(String value) {
            addCriterion("jiancheng <=", value, "jiancheng");
            return (Criteria) this;
        }
        public Criteria andJianchengLike(String value) {
            addCriterion("jiancheng like", value, "jiancheng");
            return (Criteria) this;
        }
        public Criteria andJianchengNotLike(String value) {
            addCriterion("jiancheng not like", value, "jiancheng");
            return (Criteria) this;
        }
        public Criteria andJianchengIn(List<String> values) {
            addCriterion("jiancheng in", values, "jiancheng");
            return (Criteria) this;
        }
        public Criteria andJianchengNotIn(List<String> values) {
            addCriterion("jiancheng not in", values, "jiancheng");
            return (Criteria) this;
        }
        public Criteria andJianchengBetween(String value1, String value2) {
            addCriterion("jiancheng between", value1, value2, "jiancheng");
            return (Criteria) this;
        }
        public Criteria andJianchengNotBetween(String value1, String value2) {
            addCriterion("jiancheng not between", value1, value2, "jiancheng");
            return (Criteria) this;
        }
        public Criteria andQvdongfangshiIsNull() {
            addCriterion("qvdongfangshi is null");
            return (Criteria) this;
        }
        public Criteria andQvdongfangshiIsNotNull() {
            addCriterion("qvdongfangshi is not null");
            return (Criteria) this;
        }
        public Criteria andQvdongfangshiEqualTo(String value) {
            addCriterion("qvdongfangshi =", value, "qvdongfangshi");
            return (Criteria) this;
        }
        public Criteria andQvdongfangshiNotEqualTo(String value) {
            addCriterion("qvdongfangshi <>", value, "qvdongfangshi");
            return (Criteria) this;
        }
        public Criteria andQvdongfangshiGreaterThan(String value) {
            addCriterion("qvdongfangshi >", value, "qvdongfangshi");
            return (Criteria) this;
        }
        public Criteria andQvdongfangshiGreaterThanOrEqualTo(String value) {
            addCriterion("qvdongfangshi >=", value, "qvdongfangshi");
            return (Criteria) this;
        }
        public Criteria andQvdongfangshiLessThan(String value) {
            addCriterion("qvdongfangshi <", value, "qvdongfangshi");
            return (Criteria) this;
        }
        public Criteria andQvdongfangshiLessThanOrEqualTo(String value) {
            addCriterion("qvdongfangshi <=", value, "qvdongfangshi");
            return (Criteria) this;
        }
        public Criteria andQvdongfangshiLike(String value) {
            addCriterion("qvdongfangshi like", value, "qvdongfangshi");
            return (Criteria) this;
        }
        public Criteria andQvdongfangshiNotLike(String value) {
            addCriterion("qvdongfangshi not like", value, "qvdongfangshi");
            return (Criteria) this;
        }
        public Criteria andQvdongfangshiIn(List<String> values) {
            addCriterion("qvdongfangshi in", values, "qvdongfangshi");
            return (Criteria) this;
        }
        public Criteria andQvdongfangshiNotIn(List<String> values) {
            addCriterion("qvdongfangshi not in", values, "qvdongfangshi");
            return (Criteria) this;
        }
        public Criteria andQvdongfangshiBetween(String value1, String value2) {
            addCriterion("qvdongfangshi between", value1, value2, "qvdongfangshi");
            return (Criteria) this;
        }
        public Criteria andQvdongfangshiNotBetween(String value1, String value2) {
            addCriterion("qvdongfangshi not between", value1, value2, "qvdongfangshi");
            return (Criteria) this;
        }
        public Criteria andQianxuan_jialeixingIsNull() {
            addCriterion("qianxuan_jialeixing is null");
            return (Criteria) this;
        }
        public Criteria andQianxuan_jialeixingIsNotNull() {
            addCriterion("qianxuan_jialeixing is not null");
            return (Criteria) this;
        }
        public Criteria andQianxuan_jialeixingEqualTo(String value) {
            addCriterion("qianxuan_jialeixing =", value, "qianxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andQianxuan_jialeixingNotEqualTo(String value) {
            addCriterion("qianxuan_jialeixing <>", value, "qianxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andQianxuan_jialeixingGreaterThan(String value) {
            addCriterion("qianxuan_jialeixing >", value, "qianxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andQianxuan_jialeixingGreaterThanOrEqualTo(String value) {
            addCriterion("qianxuan_jialeixing >=", value, "qianxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andQianxuan_jialeixingLessThan(String value) {
            addCriterion("qianxuan_jialeixing <", value, "qianxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andQianxuan_jialeixingLessThanOrEqualTo(String value) {
            addCriterion("qianxuan_jialeixing <=", value, "qianxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andQianxuan_jialeixingLike(String value) {
            addCriterion("qianxuan_jialeixing like", value, "qianxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andQianxuan_jialeixingNotLike(String value) {
            addCriterion("qianxuan_jialeixing not like", value, "qianxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andQianxuan_jialeixingIn(List<String> values) {
            addCriterion("qianxuan_jialeixing in", values, "qianxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andQianxuan_jialeixingNotIn(List<String> values) {
            addCriterion("qianxuan_jialeixing not in", values, "qianxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andQianxuan_jialeixingBetween(String value1, String value2) {
            addCriterion("qianxuan_jialeixing between", value1, value2, "qianxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andQianxuan_jialeixingNotBetween(String value1, String value2) {
            addCriterion("qianxuan_jialeixing not between", value1, value2, "qianxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andHouxuan_jialeixingIsNull() {
            addCriterion("houxuan_jialeixing is null");
            return (Criteria) this;
        }
        public Criteria andHouxuan_jialeixingIsNotNull() {
            addCriterion("houxuan_jialeixing is not null");
            return (Criteria) this;
        }
        public Criteria andHouxuan_jialeixingEqualTo(String value) {
            addCriterion("houxuan_jialeixing =", value, "houxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andHouxuan_jialeixingNotEqualTo(String value) {
            addCriterion("houxuan_jialeixing <>", value, "houxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andHouxuan_jialeixingGreaterThan(String value) {
            addCriterion("houxuan_jialeixing >", value, "houxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andHouxuan_jialeixingGreaterThanOrEqualTo(String value) {
            addCriterion("houxuan_jialeixing >=", value, "houxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andHouxuan_jialeixingLessThan(String value) {
            addCriterion("houxuan_jialeixing <", value, "houxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andHouxuan_jialeixingLessThanOrEqualTo(String value) {
            addCriterion("houxuan_jialeixing <=", value, "houxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andHouxuan_jialeixingLike(String value) {
            addCriterion("houxuan_jialeixing like", value, "houxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andHouxuan_jialeixingNotLike(String value) {
            addCriterion("houxuan_jialeixing not like", value, "houxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andHouxuan_jialeixingIn(List<String> values) {
            addCriterion("houxuan_jialeixing in", values, "houxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andHouxuan_jialeixingNotIn(List<String> values) {
            addCriterion("houxuan_jialeixing not in", values, "houxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andHouxuan_jialeixingBetween(String value1, String value2) {
            addCriterion("houxuan_jialeixing between", value1, value2, "houxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andHouxuan_jialeixingNotBetween(String value1, String value2) {
            addCriterion("houxuan_jialeixing not between", value1, value2, "houxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andZhulileixingIsNull() {
            addCriterion("zhulileixing is null");
            return (Criteria) this;
        }
        public Criteria andZhulileixingIsNotNull() {
            addCriterion("zhulileixing is not null");
            return (Criteria) this;
        }
        public Criteria andZhulileixingEqualTo(String value) {
            addCriterion("zhulileixing =", value, "zhulileixing");
            return (Criteria) this;
        }
        public Criteria andZhulileixingNotEqualTo(String value) {
            addCriterion("zhulileixing <>", value, "zhulileixing");
            return (Criteria) this;
        }
        public Criteria andZhulileixingGreaterThan(String value) {
            addCriterion("zhulileixing >", value, "zhulileixing");
            return (Criteria) this;
        }
        public Criteria andZhulileixingGreaterThanOrEqualTo(String value) {
            addCriterion("zhulileixing >=", value, "zhulileixing");
            return (Criteria) this;
        }
        public Criteria andZhulileixingLessThan(String value) {
            addCriterion("zhulileixing <", value, "zhulileixing");
            return (Criteria) this;
        }
        public Criteria andZhulileixingLessThanOrEqualTo(String value) {
            addCriterion("zhulileixing <=", value, "zhulileixing");
            return (Criteria) this;
        }
        public Criteria andZhulileixingLike(String value) {
            addCriterion("zhulileixing like", value, "zhulileixing");
            return (Criteria) this;
        }
        public Criteria andZhulileixingNotLike(String value) {
            addCriterion("zhulileixing not like", value, "zhulileixing");
            return (Criteria) this;
        }
        public Criteria andZhulileixingIn(List<String> values) {
            addCriterion("zhulileixing in", values, "zhulileixing");
            return (Criteria) this;
        }
        public Criteria andZhulileixingNotIn(List<String> values) {
            addCriterion("zhulileixing not in", values, "zhulileixing");
            return (Criteria) this;
        }
        public Criteria andZhulileixingBetween(String value1, String value2) {
            addCriterion("zhulileixing between", value1, value2, "zhulileixing");
            return (Criteria) this;
        }
        public Criteria andZhulileixingNotBetween(String value1, String value2) {
            addCriterion("zhulileixing not between", value1, value2, "zhulileixing");
            return (Criteria) this;
        }
        public Criteria andChetijiegouIsNull() {
            addCriterion("chetijiegou is null");
            return (Criteria) this;
        }
        public Criteria andChetijiegouIsNotNull() {
            addCriterion("chetijiegou is not null");
            return (Criteria) this;
        }
        public Criteria andChetijiegouEqualTo(String value) {
            addCriterion("chetijiegou =", value, "chetijiegou");
            return (Criteria) this;
        }
        public Criteria andChetijiegouNotEqualTo(String value) {
            addCriterion("chetijiegou <>", value, "chetijiegou");
            return (Criteria) this;
        }
        public Criteria andChetijiegouGreaterThan(String value) {
            addCriterion("chetijiegou >", value, "chetijiegou");
            return (Criteria) this;
        }
        public Criteria andChetijiegouGreaterThanOrEqualTo(String value) {
            addCriterion("chetijiegou >=", value, "chetijiegou");
            return (Criteria) this;
        }
        public Criteria andChetijiegouLessThan(String value) {
            addCriterion("chetijiegou <", value, "chetijiegou");
            return (Criteria) this;
        }
        public Criteria andChetijiegouLessThanOrEqualTo(String value) {
            addCriterion("chetijiegou <=", value, "chetijiegou");
            return (Criteria) this;
        }
        public Criteria andChetijiegouLike(String value) {
            addCriterion("chetijiegou like", value, "chetijiegou");
            return (Criteria) this;
        }
        public Criteria andChetijiegouNotLike(String value) {
            addCriterion("chetijiegou not like", value, "chetijiegou");
            return (Criteria) this;
        }
        public Criteria andChetijiegouIn(List<String> values) {
            addCriterion("chetijiegou in", values, "chetijiegou");
            return (Criteria) this;
        }
        public Criteria andChetijiegouNotIn(List<String> values) {
            addCriterion("chetijiegou not in", values, "chetijiegou");
            return (Criteria) this;
        }
        public Criteria andChetijiegouBetween(String value1, String value2) {
            addCriterion("chetijiegou between", value1, value2, "chetijiegou");
            return (Criteria) this;
        }
        public Criteria andChetijiegouNotBetween(String value1, String value2) {
            addCriterion("chetijiegou not between", value1, value2, "chetijiegou");
            return (Criteria) this;
        }
        public Criteria andHouzhidongIsNull() {
            addCriterion("houzhidong is null");
            return (Criteria) this;
        }
        public Criteria andHouzhidongIsNotNull() {
            addCriterion("houzhidong is not null");
            return (Criteria) this;
        }
        public Criteria andHouzhidongEqualTo(String value) {
            addCriterion("houzhidong =", value, "houzhidong");
            return (Criteria) this;
        }
        public Criteria andHouzhidongNotEqualTo(String value) {
            addCriterion("houzhidong <>", value, "houzhidong");
            return (Criteria) this;
        }
        public Criteria andHouzhidongGreaterThan(String value) {
            addCriterion("houzhidong >", value, "houzhidong");
            return (Criteria) this;
        }
        public Criteria andHouzhidongGreaterThanOrEqualTo(String value) {
            addCriterion("houzhidong >=", value, "houzhidong");
            return (Criteria) this;
        }
        public Criteria andHouzhidongLessThan(String value) {
            addCriterion("houzhidong <", value, "houzhidong");
            return (Criteria) this;
        }
        public Criteria andHouzhidongLessThanOrEqualTo(String value) {
            addCriterion("houzhidong <=", value, "houzhidong");
            return (Criteria) this;
        }
        public Criteria andHouzhidongLike(String value) {
            addCriterion("houzhidong like", value, "houzhidong");
            return (Criteria) this;
        }
        public Criteria andHouzhidongNotLike(String value) {
            addCriterion("houzhidong not like", value, "houzhidong");
            return (Criteria) this;
        }
        public Criteria andHouzhidongIn(List<String> values) {
            addCriterion("houzhidong in", values, "houzhidong");
            return (Criteria) this;
        }
        public Criteria andHouzhidongNotIn(List<String> values) {
            addCriterion("houzhidong not in", values, "houzhidong");
            return (Criteria) this;
        }
        public Criteria andHouzhidongBetween(String value1, String value2) {
            addCriterion("houzhidong between", value1, value2, "houzhidong");
            return (Criteria) this;
        }
        public Criteria andHouzhidongNotBetween(String value1, String value2) {
            addCriterion("houzhidong not between", value1, value2, "houzhidong");
            return (Criteria) this;
        }
        public Criteria andHouzhidongleixingIsNull() {
            addCriterion("houzhidongleixing is null");
            return (Criteria) this;
        }
        public Criteria andHouzhidongleixingIsNotNull() {
            addCriterion("houzhidongleixing is not null");
            return (Criteria) this;
        }
        public Criteria andHouzhidongleixingEqualTo(String value) {
            addCriterion("houzhidongleixing =", value, "houzhidongleixing");
            return (Criteria) this;
        }
        public Criteria andHouzhidongleixingNotEqualTo(String value) {
            addCriterion("houzhidongleixing <>", value, "houzhidongleixing");
            return (Criteria) this;
        }
        public Criteria andHouzhidongleixingGreaterThan(String value) {
            addCriterion("houzhidongleixing >", value, "houzhidongleixing");
            return (Criteria) this;
        }
        public Criteria andHouzhidongleixingGreaterThanOrEqualTo(String value) {
            addCriterion("houzhidongleixing >=", value, "houzhidongleixing");
            return (Criteria) this;
        }
        public Criteria andHouzhidongleixingLessThan(String value) {
            addCriterion("houzhidongleixing <", value, "houzhidongleixing");
            return (Criteria) this;
        }
        public Criteria andHouzhidongleixingLessThanOrEqualTo(String value) {
            addCriterion("houzhidongleixing <=", value, "houzhidongleixing");
            return (Criteria) this;
        }
        public Criteria andHouzhidongleixingLike(String value) {
            addCriterion("houzhidongleixing like", value, "houzhidongleixing");
            return (Criteria) this;
        }
        public Criteria andHouzhidongleixingNotLike(String value) {
            addCriterion("houzhidongleixing not like", value, "houzhidongleixing");
            return (Criteria) this;
        }
        public Criteria andHouzhidongleixingIn(List<String> values) {
            addCriterion("houzhidongleixing in", values, "houzhidongleixing");
            return (Criteria) this;
        }
        public Criteria andHouzhidongleixingNotIn(List<String> values) {
            addCriterion("houzhidongleixing not in", values, "houzhidongleixing");
            return (Criteria) this;
        }
        public Criteria andHouzhidongleixingBetween(String value1, String value2) {
            addCriterion("houzhidongleixing between", value1, value2, "houzhidongleixing");
            return (Criteria) this;
        }
        public Criteria andHouzhidongleixingNotBetween(String value1, String value2) {
            addCriterion("houzhidongleixing not between", value1, value2, "houzhidongleixing");
            return (Criteria) this;
        }
        public Criteria andZhuchezhidongIsNull() {
            addCriterion("zhuchezhidong is null");
            return (Criteria) this;
        }
        public Criteria andZhuchezhidongIsNotNull() {
            addCriterion("zhuchezhidong is not null");
            return (Criteria) this;
        }
        public Criteria andZhuchezhidongEqualTo(String value) {
            addCriterion("zhuchezhidong =", value, "zhuchezhidong");
            return (Criteria) this;
        }
        public Criteria andZhuchezhidongNotEqualTo(String value) {
            addCriterion("zhuchezhidong <>", value, "zhuchezhidong");
            return (Criteria) this;
        }
        public Criteria andZhuchezhidongGreaterThan(String value) {
            addCriterion("zhuchezhidong >", value, "zhuchezhidong");
            return (Criteria) this;
        }
        public Criteria andZhuchezhidongGreaterThanOrEqualTo(String value) {
            addCriterion("zhuchezhidong >=", value, "zhuchezhidong");
            return (Criteria) this;
        }
        public Criteria andZhuchezhidongLessThan(String value) {
            addCriterion("zhuchezhidong <", value, "zhuchezhidong");
            return (Criteria) this;
        }
        public Criteria andZhuchezhidongLessThanOrEqualTo(String value) {
            addCriterion("zhuchezhidong <=", value, "zhuchezhidong");
            return (Criteria) this;
        }
        public Criteria andZhuchezhidongLike(String value) {
            addCriterion("zhuchezhidong like", value, "zhuchezhidong");
            return (Criteria) this;
        }
        public Criteria andZhuchezhidongNotLike(String value) {
            addCriterion("zhuchezhidong not like", value, "zhuchezhidong");
            return (Criteria) this;
        }
        public Criteria andZhuchezhidongIn(List<String> values) {
            addCriterion("zhuchezhidong in", values, "zhuchezhidong");
            return (Criteria) this;
        }
        public Criteria andZhuchezhidongNotIn(List<String> values) {
            addCriterion("zhuchezhidong not in", values, "zhuchezhidong");
            return (Criteria) this;
        }
        public Criteria andZhuchezhidongBetween(String value1, String value2) {
            addCriterion("zhuchezhidong between", value1, value2, "zhuchezhidong");
            return (Criteria) this;
        }
        public Criteria andZhuchezhidongNotBetween(String value1, String value2) {
            addCriterion("zhuchezhidong not between", value1, value2, "zhuchezhidong");
            return (Criteria) this;
        }
        public Criteria andQianluantaiIsNull() {
            addCriterion("qianluantai is null");
            return (Criteria) this;
        }
        public Criteria andQianluantaiIsNotNull() {
            addCriterion("qianluantai is not null");
            return (Criteria) this;
        }
        public Criteria andQianluantaiEqualTo(String value) {
            addCriterion("qianluantai =", value, "qianluantai");
            return (Criteria) this;
        }
        public Criteria andQianluantaiNotEqualTo(String value) {
            addCriterion("qianluantai <>", value, "qianluantai");
            return (Criteria) this;
        }
        public Criteria andQianluantaiGreaterThan(String value) {
            addCriterion("qianluantai >", value, "qianluantai");
            return (Criteria) this;
        }
        public Criteria andQianluantaiGreaterThanOrEqualTo(String value) {
            addCriterion("qianluantai >=", value, "qianluantai");
            return (Criteria) this;
        }
        public Criteria andQianluantaiLessThan(String value) {
            addCriterion("qianluantai <", value, "qianluantai");
            return (Criteria) this;
        }
        public Criteria andQianluantaiLessThanOrEqualTo(String value) {
            addCriterion("qianluantai <=", value, "qianluantai");
            return (Criteria) this;
        }
        public Criteria andQianluantaiLike(String value) {
            addCriterion("qianluantai like", value, "qianluantai");
            return (Criteria) this;
        }
        public Criteria andQianluantaiNotLike(String value) {
            addCriterion("qianluantai not like", value, "qianluantai");
            return (Criteria) this;
        }
        public Criteria andQianluantaiIn(List<String> values) {
            addCriterion("qianluantai in", values, "qianluantai");
            return (Criteria) this;
        }
        public Criteria andQianluantaiNotIn(List<String> values) {
            addCriterion("qianluantai not in", values, "qianluantai");
            return (Criteria) this;
        }
        public Criteria andQianluantaiBetween(String value1, String value2) {
            addCriterion("qianluantai between", value1, value2, "qianluantai");
            return (Criteria) this;
        }
        public Criteria andQianluantaiNotBetween(String value1, String value2) {
            addCriterion("qianluantai not between", value1, value2, "qianluantai");
            return (Criteria) this;
        }
        public Criteria andHouluantaiIsNull() {
            addCriterion("houluantai is null");
            return (Criteria) this;
        }
        public Criteria andHouluantaiIsNotNull() {
            addCriterion("houluantai is not null");
            return (Criteria) this;
        }
        public Criteria andHouluantaiEqualTo(String value) {
            addCriterion("houluantai =", value, "houluantai");
            return (Criteria) this;
        }
        public Criteria andHouluantaiNotEqualTo(String value) {
            addCriterion("houluantai <>", value, "houluantai");
            return (Criteria) this;
        }
        public Criteria andHouluantaiGreaterThan(String value) {
            addCriterion("houluantai >", value, "houluantai");
            return (Criteria) this;
        }
        public Criteria andHouluantaiGreaterThanOrEqualTo(String value) {
            addCriterion("houluantai >=", value, "houluantai");
            return (Criteria) this;
        }
        public Criteria andHouluantaiLessThan(String value) {
            addCriterion("houluantai <", value, "houluantai");
            return (Criteria) this;
        }
        public Criteria andHouluantaiLessThanOrEqualTo(String value) {
            addCriterion("houluantai <=", value, "houluantai");
            return (Criteria) this;
        }
        public Criteria andHouluantaiLike(String value) {
            addCriterion("houluantai like", value, "houluantai");
            return (Criteria) this;
        }
        public Criteria andHouluantaiNotLike(String value) {
            addCriterion("houluantai not like", value, "houluantai");
            return (Criteria) this;
        }
        public Criteria andHouluantaiIn(List<String> values) {
            addCriterion("houluantai in", values, "houluantai");
            return (Criteria) this;
        }
        public Criteria andHouluantaiNotIn(List<String> values) {
            addCriterion("houluantai not in", values, "houluantai");
            return (Criteria) this;
        }
        public Criteria andHouluantaiBetween(String value1, String value2) {
            addCriterion("houluantai between", value1, value2, "houluantai");
            return (Criteria) this;
        }
        public Criteria andHouluantaiNotBetween(String value1, String value2) {
            addCriterion("houluantai not between", value1, value2, "houluantai");
            return (Criteria) this;
        }
        public Criteria andBeitaiIsNull() {
            addCriterion("beitai is null");
            return (Criteria) this;
        }
        public Criteria andBeitaiIsNotNull() {
            addCriterion("beitai is not null");
            return (Criteria) this;
        }
        public Criteria andBeitaiEqualTo(String value) {
            addCriterion("beitai =", value, "beitai");
            return (Criteria) this;
        }
        public Criteria andBeitaiNotEqualTo(String value) {
            addCriterion("beitai <>", value, "beitai");
            return (Criteria) this;
        }
        public Criteria andBeitaiGreaterThan(String value) {
            addCriterion("beitai >", value, "beitai");
            return (Criteria) this;
        }
        public Criteria andBeitaiGreaterThanOrEqualTo(String value) {
            addCriterion("beitai >=", value, "beitai");
            return (Criteria) this;
        }
        public Criteria andBeitaiLessThan(String value) {
            addCriterion("beitai <", value, "beitai");
            return (Criteria) this;
        }
        public Criteria andBeitaiLessThanOrEqualTo(String value) {
            addCriterion("beitai <=", value, "beitai");
            return (Criteria) this;
        }
        public Criteria andBeitaiLike(String value) {
            addCriterion("beitai like", value, "beitai");
            return (Criteria) this;
        }
        public Criteria andBeitaiNotLike(String value) {
            addCriterion("beitai not like", value, "beitai");
            return (Criteria) this;
        }
        public Criteria andBeitaiIn(List<String> values) {
            addCriterion("beitai in", values, "beitai");
            return (Criteria) this;
        }
        public Criteria andBeitaiNotIn(List<String> values) {
            addCriterion("beitai not in", values, "beitai");
            return (Criteria) this;
        }
        public Criteria andBeitaiBetween(String value1, String value2) {
            addCriterion("beitai between", value1, value2, "beitai");
            return (Criteria) this;
        }
        public Criteria andBeitaiNotBetween(String value1, String value2) {
            addCriterion("beitai not between", value1, value2, "beitai");
            return (Criteria) this;
        }
        public Criteria andZhufuqilangIsNull() {
            addCriterion("zhufuqilang is null");
            return (Criteria) this;
        }
        public Criteria andZhufuqilangIsNotNull() {
            addCriterion("zhufuqilang is not null");
            return (Criteria) this;
        }
        public Criteria andZhufuqilangEqualTo(String value) {
            addCriterion("zhufuqilang =", value, "zhufuqilang");
            return (Criteria) this;
        }
        public Criteria andZhufuqilangNotEqualTo(String value) {
            addCriterion("zhufuqilang <>", value, "zhufuqilang");
            return (Criteria) this;
        }
        public Criteria andZhufuqilangGreaterThan(String value) {
            addCriterion("zhufuqilang >", value, "zhufuqilang");
            return (Criteria) this;
        }
        public Criteria andZhufuqilangGreaterThanOrEqualTo(String value) {
            addCriterion("zhufuqilang >=", value, "zhufuqilang");
            return (Criteria) this;
        }
        public Criteria andZhufuqilangLessThan(String value) {
            addCriterion("zhufuqilang <", value, "zhufuqilang");
            return (Criteria) this;
        }
        public Criteria andZhufuqilangLessThanOrEqualTo(String value) {
            addCriterion("zhufuqilang <=", value, "zhufuqilang");
            return (Criteria) this;
        }
        public Criteria andZhufuqilangLike(String value) {
            addCriterion("zhufuqilang like", value, "zhufuqilang");
            return (Criteria) this;
        }
        public Criteria andZhufuqilangNotLike(String value) {
            addCriterion("zhufuqilang not like", value, "zhufuqilang");
            return (Criteria) this;
        }
        public Criteria andZhufuqilangIn(List<String> values) {
            addCriterion("zhufuqilang in", values, "zhufuqilang");
            return (Criteria) this;
        }
        public Criteria andZhufuqilangNotIn(List<String> values) {
            addCriterion("zhufuqilang not in", values, "zhufuqilang");
            return (Criteria) this;
        }
        public Criteria andZhufuqilangBetween(String value1, String value2) {
            addCriterion("zhufuqilang between", value1, value2, "zhufuqilang");
            return (Criteria) this;
        }
        public Criteria andZhufuqilangNotBetween(String value1, String value2) {
            addCriterion("zhufuqilang not between", value1, value2, "zhufuqilang");
            return (Criteria) this;
        }
        public Criteria andCepaiqinangIsNull() {
            addCriterion("cepaiqinang is null");
            return (Criteria) this;
        }
        public Criteria andCepaiqinangIsNotNull() {
            addCriterion("cepaiqinang is not null");
            return (Criteria) this;
        }
        public Criteria andCepaiqinangEqualTo(String value) {
            addCriterion("cepaiqinang =", value, "cepaiqinang");
            return (Criteria) this;
        }
        public Criteria andCepaiqinangNotEqualTo(String value) {
            addCriterion("cepaiqinang <>", value, "cepaiqinang");
            return (Criteria) this;
        }
        public Criteria andCepaiqinangGreaterThan(String value) {
            addCriterion("cepaiqinang >", value, "cepaiqinang");
            return (Criteria) this;
        }
        public Criteria andCepaiqinangGreaterThanOrEqualTo(String value) {
            addCriterion("cepaiqinang >=", value, "cepaiqinang");
            return (Criteria) this;
        }
        public Criteria andCepaiqinangLessThan(String value) {
            addCriterion("cepaiqinang <", value, "cepaiqinang");
            return (Criteria) this;
        }
        public Criteria andCepaiqinangLessThanOrEqualTo(String value) {
            addCriterion("cepaiqinang <=", value, "cepaiqinang");
            return (Criteria) this;
        }
        public Criteria andCepaiqinangLike(String value) {
            addCriterion("cepaiqinang like", value, "cepaiqinang");
            return (Criteria) this;
        }
        public Criteria andCepaiqinangNotLike(String value) {
            addCriterion("cepaiqinang not like", value, "cepaiqinang");
            return (Criteria) this;
        }
        public Criteria andCepaiqinangIn(List<String> values) {
            addCriterion("cepaiqinang in", values, "cepaiqinang");
            return (Criteria) this;
        }
        public Criteria andCepaiqinangNotIn(List<String> values) {
            addCriterion("cepaiqinang not in", values, "cepaiqinang");
            return (Criteria) this;
        }
        public Criteria andCepaiqinangBetween(String value1, String value2) {
            addCriterion("cepaiqinang between", value1, value2, "cepaiqinang");
            return (Criteria) this;
        }
        public Criteria andCepaiqinangNotBetween(String value1, String value2) {
            addCriterion("cepaiqinang not between", value1, value2, "cepaiqinang");
            return (Criteria) this;
        }
        public Criteria andToubuqinangIsNull() {
            addCriterion("toubuqinang is null");
            return (Criteria) this;
        }
        public Criteria andToubuqinangIsNotNull() {
            addCriterion("toubuqinang is not null");
            return (Criteria) this;
        }
        public Criteria andToubuqinangEqualTo(String value) {
            addCriterion("toubuqinang =", value, "toubuqinang");
            return (Criteria) this;
        }
        public Criteria andToubuqinangNotEqualTo(String value) {
            addCriterion("toubuqinang <>", value, "toubuqinang");
            return (Criteria) this;
        }
        public Criteria andToubuqinangGreaterThan(String value) {
            addCriterion("toubuqinang >", value, "toubuqinang");
            return (Criteria) this;
        }
        public Criteria andToubuqinangGreaterThanOrEqualTo(String value) {
            addCriterion("toubuqinang >=", value, "toubuqinang");
            return (Criteria) this;
        }
        public Criteria andToubuqinangLessThan(String value) {
            addCriterion("toubuqinang <", value, "toubuqinang");
            return (Criteria) this;
        }
        public Criteria andToubuqinangLessThanOrEqualTo(String value) {
            addCriterion("toubuqinang <=", value, "toubuqinang");
            return (Criteria) this;
        }
        public Criteria andToubuqinangLike(String value) {
            addCriterion("toubuqinang like", value, "toubuqinang");
            return (Criteria) this;
        }
        public Criteria andToubuqinangNotLike(String value) {
            addCriterion("toubuqinang not like", value, "toubuqinang");
            return (Criteria) this;
        }
        public Criteria andToubuqinangIn(List<String> values) {
            addCriterion("toubuqinang in", values, "toubuqinang");
            return (Criteria) this;
        }
        public Criteria andToubuqinangNotIn(List<String> values) {
            addCriterion("toubuqinang not in", values, "toubuqinang");
            return (Criteria) this;
        }
        public Criteria andToubuqinangBetween(String value1, String value2) {
            addCriterion("toubuqinang between", value1, value2, "toubuqinang");
            return (Criteria) this;
        }
        public Criteria andToubuqinangNotBetween(String value1, String value2) {
            addCriterion("toubuqinang not between", value1, value2, "toubuqinang");
            return (Criteria) this;
        }
        public Criteria andXibuqinangIsNull() {
            addCriterion("xibuqinang is null");
            return (Criteria) this;
        }
        public Criteria andXibuqinangIsNotNull() {
            addCriterion("xibuqinang is not null");
            return (Criteria) this;
        }
        public Criteria andXibuqinangEqualTo(String value) {
            addCriterion("xibuqinang =", value, "xibuqinang");
            return (Criteria) this;
        }
        public Criteria andXibuqinangNotEqualTo(String value) {
            addCriterion("xibuqinang <>", value, "xibuqinang");
            return (Criteria) this;
        }
        public Criteria andXibuqinangGreaterThan(String value) {
            addCriterion("xibuqinang >", value, "xibuqinang");
            return (Criteria) this;
        }
        public Criteria andXibuqinangGreaterThanOrEqualTo(String value) {
            addCriterion("xibuqinang >=", value, "xibuqinang");
            return (Criteria) this;
        }
        public Criteria andXibuqinangLessThan(String value) {
            addCriterion("xibuqinang <", value, "xibuqinang");
            return (Criteria) this;
        }
        public Criteria andXibuqinangLessThanOrEqualTo(String value) {
            addCriterion("xibuqinang <=", value, "xibuqinang");
            return (Criteria) this;
        }
        public Criteria andXibuqinangLike(String value) {
            addCriterion("xibuqinang like", value, "xibuqinang");
            return (Criteria) this;
        }
        public Criteria andXibuqinangNotLike(String value) {
            addCriterion("xibuqinang not like", value, "xibuqinang");
            return (Criteria) this;
        }
        public Criteria andXibuqinangIn(List<String> values) {
            addCriterion("xibuqinang in", values, "xibuqinang");
            return (Criteria) this;
        }
        public Criteria andXibuqinangNotIn(List<String> values) {
            addCriterion("xibuqinang not in", values, "xibuqinang");
            return (Criteria) this;
        }
        public Criteria andXibuqinangBetween(String value1, String value2) {
            addCriterion("xibuqinang between", value1, value2, "xibuqinang");
            return (Criteria) this;
        }
        public Criteria andXibuqinangNotBetween(String value1, String value2) {
            addCriterion("xibuqinang not between", value1, value2, "xibuqinang");
            return (Criteria) this;
        }
        public Criteria andTaiyajianceIsNull() {
            addCriterion("taiyajiance is null");
            return (Criteria) this;
        }
        public Criteria andTaiyajianceIsNotNull() {
            addCriterion("taiyajiance is not null");
            return (Criteria) this;
        }
        public Criteria andTaiyajianceEqualTo(String value) {
            addCriterion("taiyajiance =", value, "taiyajiance");
            return (Criteria) this;
        }
        public Criteria andTaiyajianceNotEqualTo(String value) {
            addCriterion("taiyajiance <>", value, "taiyajiance");
            return (Criteria) this;
        }
        public Criteria andTaiyajianceGreaterThan(String value) {
            addCriterion("taiyajiance >", value, "taiyajiance");
            return (Criteria) this;
        }
        public Criteria andTaiyajianceGreaterThanOrEqualTo(String value) {
            addCriterion("taiyajiance >=", value, "taiyajiance");
            return (Criteria) this;
        }
        public Criteria andTaiyajianceLessThan(String value) {
            addCriterion("taiyajiance <", value, "taiyajiance");
            return (Criteria) this;
        }
        public Criteria andTaiyajianceLessThanOrEqualTo(String value) {
            addCriterion("taiyajiance <=", value, "taiyajiance");
            return (Criteria) this;
        }
        public Criteria andTaiyajianceLike(String value) {
            addCriterion("taiyajiance like", value, "taiyajiance");
            return (Criteria) this;
        }
        public Criteria andTaiyajianceNotLike(String value) {
            addCriterion("taiyajiance not like", value, "taiyajiance");
            return (Criteria) this;
        }
        public Criteria andTaiyajianceIn(List<String> values) {
            addCriterion("taiyajiance in", values, "taiyajiance");
            return (Criteria) this;
        }
        public Criteria andTaiyajianceNotIn(List<String> values) {
            addCriterion("taiyajiance not in", values, "taiyajiance");
            return (Criteria) this;
        }
        public Criteria andTaiyajianceBetween(String value1, String value2) {
            addCriterion("taiyajiance between", value1, value2, "taiyajiance");
            return (Criteria) this;
        }
        public Criteria andTaiyajianceNotBetween(String value1, String value2) {
            addCriterion("taiyajiance not between", value1, value2, "taiyajiance");
            return (Criteria) this;
        }
        public Criteria andLiangtaiyaIsNull() {
            addCriterion("liangtaiya is null");
            return (Criteria) this;
        }
        public Criteria andLiangtaiyaIsNotNull() {
            addCriterion("liangtaiya is not null");
            return (Criteria) this;
        }
        public Criteria andLiangtaiyaEqualTo(String value) {
            addCriterion("liangtaiya =", value, "liangtaiya");
            return (Criteria) this;
        }
        public Criteria andLiangtaiyaNotEqualTo(String value) {
            addCriterion("liangtaiya <>", value, "liangtaiya");
            return (Criteria) this;
        }
        public Criteria andLiangtaiyaGreaterThan(String value) {
            addCriterion("liangtaiya >", value, "liangtaiya");
            return (Criteria) this;
        }
        public Criteria andLiangtaiyaGreaterThanOrEqualTo(String value) {
            addCriterion("liangtaiya >=", value, "liangtaiya");
            return (Criteria) this;
        }
        public Criteria andLiangtaiyaLessThan(String value) {
            addCriterion("liangtaiya <", value, "liangtaiya");
            return (Criteria) this;
        }
        public Criteria andLiangtaiyaLessThanOrEqualTo(String value) {
            addCriterion("liangtaiya <=", value, "liangtaiya");
            return (Criteria) this;
        }
        public Criteria andLiangtaiyaLike(String value) {
            addCriterion("liangtaiya like", value, "liangtaiya");
            return (Criteria) this;
        }
        public Criteria andLiangtaiyaNotLike(String value) {
            addCriterion("liangtaiya not like", value, "liangtaiya");
            return (Criteria) this;
        }
        public Criteria andLiangtaiyaIn(List<String> values) {
            addCriterion("liangtaiya in", values, "liangtaiya");
            return (Criteria) this;
        }
        public Criteria andLiangtaiyaNotIn(List<String> values) {
            addCriterion("liangtaiya not in", values, "liangtaiya");
            return (Criteria) this;
        }
        public Criteria andLiangtaiyaBetween(String value1, String value2) {
            addCriterion("liangtaiya between", value1, value2, "liangtaiya");
            return (Criteria) this;
        }
        public Criteria andLiangtaiyaNotBetween(String value1, String value2) {
            addCriterion("liangtaiya not between", value1, value2, "liangtaiya");
            return (Criteria) this;
        }
        public Criteria andAnquandaitishiIsNull() {
            addCriterion("anquandaitishi is null");
            return (Criteria) this;
        }
        public Criteria andAnquandaitishiIsNotNull() {
            addCriterion("anquandaitishi is not null");
            return (Criteria) this;
        }
        public Criteria andAnquandaitishiEqualTo(String value) {
            addCriterion("anquandaitishi =", value, "anquandaitishi");
            return (Criteria) this;
        }
        public Criteria andAnquandaitishiNotEqualTo(String value) {
            addCriterion("anquandaitishi <>", value, "anquandaitishi");
            return (Criteria) this;
        }
        public Criteria andAnquandaitishiGreaterThan(String value) {
            addCriterion("anquandaitishi >", value, "anquandaitishi");
            return (Criteria) this;
        }
        public Criteria andAnquandaitishiGreaterThanOrEqualTo(String value) {
            addCriterion("anquandaitishi >=", value, "anquandaitishi");
            return (Criteria) this;
        }
        public Criteria andAnquandaitishiLessThan(String value) {
            addCriterion("anquandaitishi <", value, "anquandaitishi");
            return (Criteria) this;
        }
        public Criteria andAnquandaitishiLessThanOrEqualTo(String value) {
            addCriterion("anquandaitishi <=", value, "anquandaitishi");
            return (Criteria) this;
        }
        public Criteria andAnquandaitishiLike(String value) {
            addCriterion("anquandaitishi like", value, "anquandaitishi");
            return (Criteria) this;
        }
        public Criteria andAnquandaitishiNotLike(String value) {
            addCriterion("anquandaitishi not like", value, "anquandaitishi");
            return (Criteria) this;
        }
        public Criteria andAnquandaitishiIn(List<String> values) {
            addCriterion("anquandaitishi in", values, "anquandaitishi");
            return (Criteria) this;
        }
        public Criteria andAnquandaitishiNotIn(List<String> values) {
            addCriterion("anquandaitishi not in", values, "anquandaitishi");
            return (Criteria) this;
        }
        public Criteria andAnquandaitishiBetween(String value1, String value2) {
            addCriterion("anquandaitishi between", value1, value2, "anquandaitishi");
            return (Criteria) this;
        }
        public Criteria andAnquandaitishiNotBetween(String value1, String value2) {
            addCriterion("anquandaitishi not between", value1, value2, "anquandaitishi");
            return (Criteria) this;
        }
        public Criteria andISOFIXIsNull() {
            addCriterion("ISOFIX is null");
            return (Criteria) this;
        }
        public Criteria andISOFIXIsNotNull() {
            addCriterion("ISOFIX is not null");
            return (Criteria) this;
        }
        public Criteria andISOFIXEqualTo(String value) {
            addCriterion("ISOFIX =", value, "ISOFIX");
            return (Criteria) this;
        }
        public Criteria andISOFIXNotEqualTo(String value) {
            addCriterion("ISOFIX <>", value, "ISOFIX");
            return (Criteria) this;
        }
        public Criteria andISOFIXGreaterThan(String value) {
            addCriterion("ISOFIX >", value, "ISOFIX");
            return (Criteria) this;
        }
        public Criteria andISOFIXGreaterThanOrEqualTo(String value) {
            addCriterion("ISOFIX >=", value, "ISOFIX");
            return (Criteria) this;
        }
        public Criteria andISOFIXLessThan(String value) {
            addCriterion("ISOFIX <", value, "ISOFIX");
            return (Criteria) this;
        }
        public Criteria andISOFIXLessThanOrEqualTo(String value) {
            addCriterion("ISOFIX <=", value, "ISOFIX");
            return (Criteria) this;
        }
        public Criteria andISOFIXLike(String value) {
            addCriterion("ISOFIX like", value, "ISOFIX");
            return (Criteria) this;
        }
        public Criteria andISOFIXNotLike(String value) {
            addCriterion("ISOFIX not like", value, "ISOFIX");
            return (Criteria) this;
        }
        public Criteria andISOFIXIn(List<String> values) {
            addCriterion("ISOFIX in", values, "ISOFIX");
            return (Criteria) this;
        }
        public Criteria andISOFIXNotIn(List<String> values) {
            addCriterion("ISOFIX not in", values, "ISOFIX");
            return (Criteria) this;
        }
        public Criteria andISOFIXBetween(String value1, String value2) {
            addCriterion("ISOFIX between", value1, value2, "ISOFIX");
            return (Criteria) this;
        }
        public Criteria andISOFIXNotBetween(String value1, String value2) {
            addCriterion("ISOFIX not between", value1, value2, "ISOFIX");
            return (Criteria) this;
        }
        public Criteria andABSIsNull() {
            addCriterion("ABS is null");
            return (Criteria) this;
        }
        public Criteria andABSIsNotNull() {
            addCriterion("ABS is not null");
            return (Criteria) this;
        }
        public Criteria andABSEqualTo(String value) {
            addCriterion("ABS =", value, "ABS");
            return (Criteria) this;
        }
        public Criteria andABSNotEqualTo(String value) {
            addCriterion("ABS <>", value, "ABS");
            return (Criteria) this;
        }
        public Criteria andABSGreaterThan(String value) {
            addCriterion("ABS >", value, "ABS");
            return (Criteria) this;
        }
        public Criteria andABSGreaterThanOrEqualTo(String value) {
            addCriterion("ABS >=", value, "ABS");
            return (Criteria) this;
        }
        public Criteria andABSLessThan(String value) {
            addCriterion("ABS <", value, "ABS");
            return (Criteria) this;
        }
        public Criteria andABSLessThanOrEqualTo(String value) {
            addCriterion("ABS <=", value, "ABS");
            return (Criteria) this;
        }
        public Criteria andABSLike(String value) {
            addCriterion("ABS like", value, "ABS");
            return (Criteria) this;
        }
        public Criteria andABSNotLike(String value) {
            addCriterion("ABS not like", value, "ABS");
            return (Criteria) this;
        }
        public Criteria andABSIn(List<String> values) {
            addCriterion("ABS in", values, "ABS");
            return (Criteria) this;
        }
        public Criteria andABSNotIn(List<String> values) {
            addCriterion("ABS not in", values, "ABS");
            return (Criteria) this;
        }
        public Criteria andABSBetween(String value1, String value2) {
            addCriterion("ABS between", value1, value2, "ABS");
            return (Criteria) this;
        }
        public Criteria andABSNotBetween(String value1, String value2) {
            addCriterion("ABS not between", value1, value2, "ABS");
            return (Criteria) this;
        }
        public Criteria andZhidongfanpeiIsNull() {
            addCriterion("zhidongfanpei is null");
            return (Criteria) this;
        }
        public Criteria andZhidongfanpeiIsNotNull() {
            addCriterion("zhidongfanpei is not null");
            return (Criteria) this;
        }
        public Criteria andZhidongfanpeiEqualTo(String value) {
            addCriterion("zhidongfanpei =", value, "zhidongfanpei");
            return (Criteria) this;
        }
        public Criteria andZhidongfanpeiNotEqualTo(String value) {
            addCriterion("zhidongfanpei <>", value, "zhidongfanpei");
            return (Criteria) this;
        }
        public Criteria andZhidongfanpeiGreaterThan(String value) {
            addCriterion("zhidongfanpei >", value, "zhidongfanpei");
            return (Criteria) this;
        }
        public Criteria andZhidongfanpeiGreaterThanOrEqualTo(String value) {
            addCriterion("zhidongfanpei >=", value, "zhidongfanpei");
            return (Criteria) this;
        }
        public Criteria andZhidongfanpeiLessThan(String value) {
            addCriterion("zhidongfanpei <", value, "zhidongfanpei");
            return (Criteria) this;
        }
        public Criteria andZhidongfanpeiLessThanOrEqualTo(String value) {
            addCriterion("zhidongfanpei <=", value, "zhidongfanpei");
            return (Criteria) this;
        }
        public Criteria andZhidongfanpeiLike(String value) {
            addCriterion("zhidongfanpei like", value, "zhidongfanpei");
            return (Criteria) this;
        }
        public Criteria andZhidongfanpeiNotLike(String value) {
            addCriterion("zhidongfanpei not like", value, "zhidongfanpei");
            return (Criteria) this;
        }
        public Criteria andZhidongfanpeiIn(List<String> values) {
            addCriterion("zhidongfanpei in", values, "zhidongfanpei");
            return (Criteria) this;
        }
        public Criteria andZhidongfanpeiNotIn(List<String> values) {
            addCriterion("zhidongfanpei not in", values, "zhidongfanpei");
            return (Criteria) this;
        }
        public Criteria andZhidongfanpeiBetween(String value1, String value2) {
            addCriterion("zhidongfanpei between", value1, value2, "zhidongfanpei");
            return (Criteria) this;
        }
        public Criteria andZhidongfanpeiNotBetween(String value1, String value2) {
            addCriterion("zhidongfanpei not between", value1, value2, "zhidongfanpei");
            return (Criteria) this;
        }
        public Criteria andShachefuzhuIsNull() {
            addCriterion("shachefuzhu is null");
            return (Criteria) this;
        }
        public Criteria andShachefuzhuIsNotNull() {
            addCriterion("shachefuzhu is not null");
            return (Criteria) this;
        }
        public Criteria andShachefuzhuEqualTo(String value) {
            addCriterion("shachefuzhu =", value, "shachefuzhu");
            return (Criteria) this;
        }
        public Criteria andShachefuzhuNotEqualTo(String value) {
            addCriterion("shachefuzhu <>", value, "shachefuzhu");
            return (Criteria) this;
        }
        public Criteria andShachefuzhuGreaterThan(String value) {
            addCriterion("shachefuzhu >", value, "shachefuzhu");
            return (Criteria) this;
        }
        public Criteria andShachefuzhuGreaterThanOrEqualTo(String value) {
            addCriterion("shachefuzhu >=", value, "shachefuzhu");
            return (Criteria) this;
        }
        public Criteria andShachefuzhuLessThan(String value) {
            addCriterion("shachefuzhu <", value, "shachefuzhu");
            return (Criteria) this;
        }
        public Criteria andShachefuzhuLessThanOrEqualTo(String value) {
            addCriterion("shachefuzhu <=", value, "shachefuzhu");
            return (Criteria) this;
        }
        public Criteria andShachefuzhuLike(String value) {
            addCriterion("shachefuzhu like", value, "shachefuzhu");
            return (Criteria) this;
        }
        public Criteria andShachefuzhuNotLike(String value) {
            addCriterion("shachefuzhu not like", value, "shachefuzhu");
            return (Criteria) this;
        }
        public Criteria andShachefuzhuIn(List<String> values) {
            addCriterion("shachefuzhu in", values, "shachefuzhu");
            return (Criteria) this;
        }
        public Criteria andShachefuzhuNotIn(List<String> values) {
            addCriterion("shachefuzhu not in", values, "shachefuzhu");
            return (Criteria) this;
        }
        public Criteria andShachefuzhuBetween(String value1, String value2) {
            addCriterion("shachefuzhu between", value1, value2, "shachefuzhu");
            return (Criteria) this;
        }
        public Criteria andShachefuzhuNotBetween(String value1, String value2) {
            addCriterion("shachefuzhu not between", value1, value2, "shachefuzhu");
            return (Criteria) this;
        }
        public Criteria andQianyinlikongzhiIsNull() {
            addCriterion("qianyinlikongzhi is null");
            return (Criteria) this;
        }
        public Criteria andQianyinlikongzhiIsNotNull() {
            addCriterion("qianyinlikongzhi is not null");
            return (Criteria) this;
        }
        public Criteria andQianyinlikongzhiEqualTo(String value) {
            addCriterion("qianyinlikongzhi =", value, "qianyinlikongzhi");
            return (Criteria) this;
        }
        public Criteria andQianyinlikongzhiNotEqualTo(String value) {
            addCriterion("qianyinlikongzhi <>", value, "qianyinlikongzhi");
            return (Criteria) this;
        }
        public Criteria andQianyinlikongzhiGreaterThan(String value) {
            addCriterion("qianyinlikongzhi >", value, "qianyinlikongzhi");
            return (Criteria) this;
        }
        public Criteria andQianyinlikongzhiGreaterThanOrEqualTo(String value) {
            addCriterion("qianyinlikongzhi >=", value, "qianyinlikongzhi");
            return (Criteria) this;
        }
        public Criteria andQianyinlikongzhiLessThan(String value) {
            addCriterion("qianyinlikongzhi <", value, "qianyinlikongzhi");
            return (Criteria) this;
        }
        public Criteria andQianyinlikongzhiLessThanOrEqualTo(String value) {
            addCriterion("qianyinlikongzhi <=", value, "qianyinlikongzhi");
            return (Criteria) this;
        }
        public Criteria andQianyinlikongzhiLike(String value) {
            addCriterion("qianyinlikongzhi like", value, "qianyinlikongzhi");
            return (Criteria) this;
        }
        public Criteria andQianyinlikongzhiNotLike(String value) {
            addCriterion("qianyinlikongzhi not like", value, "qianyinlikongzhi");
            return (Criteria) this;
        }
        public Criteria andQianyinlikongzhiIn(List<String> values) {
            addCriterion("qianyinlikongzhi in", values, "qianyinlikongzhi");
            return (Criteria) this;
        }
        public Criteria andQianyinlikongzhiNotIn(List<String> values) {
            addCriterion("qianyinlikongzhi not in", values, "qianyinlikongzhi");
            return (Criteria) this;
        }
        public Criteria andQianyinlikongzhiBetween(String value1, String value2) {
            addCriterion("qianyinlikongzhi between", value1, value2, "qianyinlikongzhi");
            return (Criteria) this;
        }
        public Criteria andQianyinlikongzhiNotBetween(String value1, String value2) {
            addCriterion("qianyinlikongzhi not between", value1, value2, "qianyinlikongzhi");
            return (Criteria) this;
        }
        public Criteria andCheshenwendingkongzhiIsNull() {
            addCriterion("cheshenwendingkongzhi is null");
            return (Criteria) this;
        }
        public Criteria andCheshenwendingkongzhiIsNotNull() {
            addCriterion("cheshenwendingkongzhi is not null");
            return (Criteria) this;
        }
        public Criteria andCheshenwendingkongzhiEqualTo(String value) {
            addCriterion("cheshenwendingkongzhi =", value, "cheshenwendingkongzhi");
            return (Criteria) this;
        }
        public Criteria andCheshenwendingkongzhiNotEqualTo(String value) {
            addCriterion("cheshenwendingkongzhi <>", value, "cheshenwendingkongzhi");
            return (Criteria) this;
        }
        public Criteria andCheshenwendingkongzhiGreaterThan(String value) {
            addCriterion("cheshenwendingkongzhi >", value, "cheshenwendingkongzhi");
            return (Criteria) this;
        }
        public Criteria andCheshenwendingkongzhiGreaterThanOrEqualTo(String value) {
            addCriterion("cheshenwendingkongzhi >=", value, "cheshenwendingkongzhi");
            return (Criteria) this;
        }
        public Criteria andCheshenwendingkongzhiLessThan(String value) {
            addCriterion("cheshenwendingkongzhi <", value, "cheshenwendingkongzhi");
            return (Criteria) this;
        }
        public Criteria andCheshenwendingkongzhiLessThanOrEqualTo(String value) {
            addCriterion("cheshenwendingkongzhi <=", value, "cheshenwendingkongzhi");
            return (Criteria) this;
        }
        public Criteria andCheshenwendingkongzhiLike(String value) {
            addCriterion("cheshenwendingkongzhi like", value, "cheshenwendingkongzhi");
            return (Criteria) this;
        }
        public Criteria andCheshenwendingkongzhiNotLike(String value) {
            addCriterion("cheshenwendingkongzhi not like", value, "cheshenwendingkongzhi");
            return (Criteria) this;
        }
        public Criteria andCheshenwendingkongzhiIn(List<String> values) {
            addCriterion("cheshenwendingkongzhi in", values, "cheshenwendingkongzhi");
            return (Criteria) this;
        }
        public Criteria andCheshenwendingkongzhiNotIn(List<String> values) {
            addCriterion("cheshenwendingkongzhi not in", values, "cheshenwendingkongzhi");
            return (Criteria) this;
        }
        public Criteria andCheshenwendingkongzhiBetween(String value1, String value2) {
            addCriterion("cheshenwendingkongzhi between", value1, value2, "cheshenwendingkongzhi");
            return (Criteria) this;
        }
        public Criteria andCheshenwendingkongzhiNotBetween(String value1, String value2) {
            addCriterion("cheshenwendingkongzhi not between", value1, value2, "cheshenwendingkongzhi");
            return (Criteria) this;
        }
        public Criteria andBingxianfuzhuIsNull() {
            addCriterion("bingxianfuzhu is null");
            return (Criteria) this;
        }
        public Criteria andBingxianfuzhuIsNotNull() {
            addCriterion("bingxianfuzhu is not null");
            return (Criteria) this;
        }
        public Criteria andBingxianfuzhuEqualTo(String value) {
            addCriterion("bingxianfuzhu =", value, "bingxianfuzhu");
            return (Criteria) this;
        }
        public Criteria andBingxianfuzhuNotEqualTo(String value) {
            addCriterion("bingxianfuzhu <>", value, "bingxianfuzhu");
            return (Criteria) this;
        }
        public Criteria andBingxianfuzhuGreaterThan(String value) {
            addCriterion("bingxianfuzhu >", value, "bingxianfuzhu");
            return (Criteria) this;
        }
        public Criteria andBingxianfuzhuGreaterThanOrEqualTo(String value) {
            addCriterion("bingxianfuzhu >=", value, "bingxianfuzhu");
            return (Criteria) this;
        }
        public Criteria andBingxianfuzhuLessThan(String value) {
            addCriterion("bingxianfuzhu <", value, "bingxianfuzhu");
            return (Criteria) this;
        }
        public Criteria andBingxianfuzhuLessThanOrEqualTo(String value) {
            addCriterion("bingxianfuzhu <=", value, "bingxianfuzhu");
            return (Criteria) this;
        }
        public Criteria andBingxianfuzhuLike(String value) {
            addCriterion("bingxianfuzhu like", value, "bingxianfuzhu");
            return (Criteria) this;
        }
        public Criteria andBingxianfuzhuNotLike(String value) {
            addCriterion("bingxianfuzhu not like", value, "bingxianfuzhu");
            return (Criteria) this;
        }
        public Criteria andBingxianfuzhuIn(List<String> values) {
            addCriterion("bingxianfuzhu in", values, "bingxianfuzhu");
            return (Criteria) this;
        }
        public Criteria andBingxianfuzhuNotIn(List<String> values) {
            addCriterion("bingxianfuzhu not in", values, "bingxianfuzhu");
            return (Criteria) this;
        }
        public Criteria andBingxianfuzhuBetween(String value1, String value2) {
            addCriterion("bingxianfuzhu between", value1, value2, "bingxianfuzhu");
            return (Criteria) this;
        }
        public Criteria andBingxianfuzhuNotBetween(String value1, String value2) {
            addCriterion("bingxianfuzhu not between", value1, value2, "bingxianfuzhu");
            return (Criteria) this;
        }
        public Criteria andPianliyvjingIsNull() {
            addCriterion("pianliyvjing is null");
            return (Criteria) this;
        }
        public Criteria andPianliyvjingIsNotNull() {
            addCriterion("pianliyvjing is not null");
            return (Criteria) this;
        }
        public Criteria andPianliyvjingEqualTo(String value) {
            addCriterion("pianliyvjing =", value, "pianliyvjing");
            return (Criteria) this;
        }
        public Criteria andPianliyvjingNotEqualTo(String value) {
            addCriterion("pianliyvjing <>", value, "pianliyvjing");
            return (Criteria) this;
        }
        public Criteria andPianliyvjingGreaterThan(String value) {
            addCriterion("pianliyvjing >", value, "pianliyvjing");
            return (Criteria) this;
        }
        public Criteria andPianliyvjingGreaterThanOrEqualTo(String value) {
            addCriterion("pianliyvjing >=", value, "pianliyvjing");
            return (Criteria) this;
        }
        public Criteria andPianliyvjingLessThan(String value) {
            addCriterion("pianliyvjing <", value, "pianliyvjing");
            return (Criteria) this;
        }
        public Criteria andPianliyvjingLessThanOrEqualTo(String value) {
            addCriterion("pianliyvjing <=", value, "pianliyvjing");
            return (Criteria) this;
        }
        public Criteria andPianliyvjingLike(String value) {
            addCriterion("pianliyvjing like", value, "pianliyvjing");
            return (Criteria) this;
        }
        public Criteria andPianliyvjingNotLike(String value) {
            addCriterion("pianliyvjing not like", value, "pianliyvjing");
            return (Criteria) this;
        }
        public Criteria andPianliyvjingIn(List<String> values) {
            addCriterion("pianliyvjing in", values, "pianliyvjing");
            return (Criteria) this;
        }
        public Criteria andPianliyvjingNotIn(List<String> values) {
            addCriterion("pianliyvjing not in", values, "pianliyvjing");
            return (Criteria) this;
        }
        public Criteria andPianliyvjingBetween(String value1, String value2) {
            addCriterion("pianliyvjing between", value1, value2, "pianliyvjing");
            return (Criteria) this;
        }
        public Criteria andPianliyvjingNotBetween(String value1, String value2) {
            addCriterion("pianliyvjing not between", value1, value2, "pianliyvjing");
            return (Criteria) this;
        }
        public Criteria andZhudongshanchuIsNull() {
            addCriterion("zhudongshanchu is null");
            return (Criteria) this;
        }
        public Criteria andZhudongshanchuIsNotNull() {
            addCriterion("zhudongshanchu is not null");
            return (Criteria) this;
        }
        public Criteria andZhudongshanchuEqualTo(String value) {
            addCriterion("zhudongshanchu =", value, "zhudongshanchu");
            return (Criteria) this;
        }
        public Criteria andZhudongshanchuNotEqualTo(String value) {
            addCriterion("zhudongshanchu <>", value, "zhudongshanchu");
            return (Criteria) this;
        }
        public Criteria andZhudongshanchuGreaterThan(String value) {
            addCriterion("zhudongshanchu >", value, "zhudongshanchu");
            return (Criteria) this;
        }
        public Criteria andZhudongshanchuGreaterThanOrEqualTo(String value) {
            addCriterion("zhudongshanchu >=", value, "zhudongshanchu");
            return (Criteria) this;
        }
        public Criteria andZhudongshanchuLessThan(String value) {
            addCriterion("zhudongshanchu <", value, "zhudongshanchu");
            return (Criteria) this;
        }
        public Criteria andZhudongshanchuLessThanOrEqualTo(String value) {
            addCriterion("zhudongshanchu <=", value, "zhudongshanchu");
            return (Criteria) this;
        }
        public Criteria andZhudongshanchuLike(String value) {
            addCriterion("zhudongshanchu like", value, "zhudongshanchu");
            return (Criteria) this;
        }
        public Criteria andZhudongshanchuNotLike(String value) {
            addCriterion("zhudongshanchu not like", value, "zhudongshanchu");
            return (Criteria) this;
        }
        public Criteria andZhudongshanchuIn(List<String> values) {
            addCriterion("zhudongshanchu in", values, "zhudongshanchu");
            return (Criteria) this;
        }
        public Criteria andZhudongshanchuNotIn(List<String> values) {
            addCriterion("zhudongshanchu not in", values, "zhudongshanchu");
            return (Criteria) this;
        }
        public Criteria andZhudongshanchuBetween(String value1, String value2) {
            addCriterion("zhudongshanchu between", value1, value2, "zhudongshanchu");
            return (Criteria) this;
        }
        public Criteria andZhudongshanchuNotBetween(String value1, String value2) {
            addCriterion("zhudongshanchu not between", value1, value2, "zhudongshanchu");
            return (Criteria) this;
        }
        public Criteria andYieshixitongIsNull() {
            addCriterion("yieshixitong is null");
            return (Criteria) this;
        }
        public Criteria andYieshixitongIsNotNull() {
            addCriterion("yieshixitong is not null");
            return (Criteria) this;
        }
        public Criteria andYieshixitongEqualTo(String value) {
            addCriterion("yieshixitong =", value, "yieshixitong");
            return (Criteria) this;
        }
        public Criteria andYieshixitongNotEqualTo(String value) {
            addCriterion("yieshixitong <>", value, "yieshixitong");
            return (Criteria) this;
        }
        public Criteria andYieshixitongGreaterThan(String value) {
            addCriterion("yieshixitong >", value, "yieshixitong");
            return (Criteria) this;
        }
        public Criteria andYieshixitongGreaterThanOrEqualTo(String value) {
            addCriterion("yieshixitong >=", value, "yieshixitong");
            return (Criteria) this;
        }
        public Criteria andYieshixitongLessThan(String value) {
            addCriterion("yieshixitong <", value, "yieshixitong");
            return (Criteria) this;
        }
        public Criteria andYieshixitongLessThanOrEqualTo(String value) {
            addCriterion("yieshixitong <=", value, "yieshixitong");
            return (Criteria) this;
        }
        public Criteria andYieshixitongLike(String value) {
            addCriterion("yieshixitong like", value, "yieshixitong");
            return (Criteria) this;
        }
        public Criteria andYieshixitongNotLike(String value) {
            addCriterion("yieshixitong not like", value, "yieshixitong");
            return (Criteria) this;
        }
        public Criteria andYieshixitongIn(List<String> values) {
            addCriterion("yieshixitong in", values, "yieshixitong");
            return (Criteria) this;
        }
        public Criteria andYieshixitongNotIn(List<String> values) {
            addCriterion("yieshixitong not in", values, "yieshixitong");
            return (Criteria) this;
        }
        public Criteria andYieshixitongBetween(String value1, String value2) {
            addCriterion("yieshixitong between", value1, value2, "yieshixitong");
            return (Criteria) this;
        }
        public Criteria andYieshixitongNotBetween(String value1, String value2) {
            addCriterion("yieshixitong not between", value1, value2, "yieshixitong");
            return (Criteria) this;
        }
        public Criteria andPilaojiashiIsNull() {
            addCriterion("pilaojiashi is null");
            return (Criteria) this;
        }
        public Criteria andPilaojiashiIsNotNull() {
            addCriterion("pilaojiashi is not null");
            return (Criteria) this;
        }
        public Criteria andPilaojiashiEqualTo(String value) {
            addCriterion("pilaojiashi =", value, "pilaojiashi");
            return (Criteria) this;
        }
        public Criteria andPilaojiashiNotEqualTo(String value) {
            addCriterion("pilaojiashi <>", value, "pilaojiashi");
            return (Criteria) this;
        }
        public Criteria andPilaojiashiGreaterThan(String value) {
            addCriterion("pilaojiashi >", value, "pilaojiashi");
            return (Criteria) this;
        }
        public Criteria andPilaojiashiGreaterThanOrEqualTo(String value) {
            addCriterion("pilaojiashi >=", value, "pilaojiashi");
            return (Criteria) this;
        }
        public Criteria andPilaojiashiLessThan(String value) {
            addCriterion("pilaojiashi <", value, "pilaojiashi");
            return (Criteria) this;
        }
        public Criteria andPilaojiashiLessThanOrEqualTo(String value) {
            addCriterion("pilaojiashi <=", value, "pilaojiashi");
            return (Criteria) this;
        }
        public Criteria andPilaojiashiLike(String value) {
            addCriterion("pilaojiashi like", value, "pilaojiashi");
            return (Criteria) this;
        }
        public Criteria andPilaojiashiNotLike(String value) {
            addCriterion("pilaojiashi not like", value, "pilaojiashi");
            return (Criteria) this;
        }
        public Criteria andPilaojiashiIn(List<String> values) {
            addCriterion("pilaojiashi in", values, "pilaojiashi");
            return (Criteria) this;
        }
        public Criteria andPilaojiashiNotIn(List<String> values) {
            addCriterion("pilaojiashi not in", values, "pilaojiashi");
            return (Criteria) this;
        }
        public Criteria andPilaojiashiBetween(String value1, String value2) {
            addCriterion("pilaojiashi between", value1, value2, "pilaojiashi");
            return (Criteria) this;
        }
        public Criteria andPilaojiashiNotBetween(String value1, String value2) {
            addCriterion("pilaojiashi not between", value1, value2, "pilaojiashi");
            return (Criteria) this;
        }
        public Criteria andZhucheliedaIsNull() {
            addCriterion("zhuchelieda is null");
            return (Criteria) this;
        }
        public Criteria andZhucheliedaIsNotNull() {
            addCriterion("zhuchelieda is not null");
            return (Criteria) this;
        }
        public Criteria andZhucheliedaEqualTo(String value) {
            addCriterion("zhuchelieda =", value, "zhuchelieda");
            return (Criteria) this;
        }
        public Criteria andZhucheliedaNotEqualTo(String value) {
            addCriterion("zhuchelieda <>", value, "zhuchelieda");
            return (Criteria) this;
        }
        public Criteria andZhucheliedaGreaterThan(String value) {
            addCriterion("zhuchelieda >", value, "zhuchelieda");
            return (Criteria) this;
        }
        public Criteria andZhucheliedaGreaterThanOrEqualTo(String value) {
            addCriterion("zhuchelieda >=", value, "zhuchelieda");
            return (Criteria) this;
        }
        public Criteria andZhucheliedaLessThan(String value) {
            addCriterion("zhuchelieda <", value, "zhuchelieda");
            return (Criteria) this;
        }
        public Criteria andZhucheliedaLessThanOrEqualTo(String value) {
            addCriterion("zhuchelieda <=", value, "zhuchelieda");
            return (Criteria) this;
        }
        public Criteria andZhucheliedaLike(String value) {
            addCriterion("zhuchelieda like", value, "zhuchelieda");
            return (Criteria) this;
        }
        public Criteria andZhucheliedaNotLike(String value) {
            addCriterion("zhuchelieda not like", value, "zhuchelieda");
            return (Criteria) this;
        }
        public Criteria andZhucheliedaIn(List<String> values) {
            addCriterion("zhuchelieda in", values, "zhuchelieda");
            return (Criteria) this;
        }
        public Criteria andZhucheliedaNotIn(List<String> values) {
            addCriterion("zhuchelieda not in", values, "zhuchelieda");
            return (Criteria) this;
        }
        public Criteria andZhucheliedaBetween(String value1, String value2) {
            addCriterion("zhuchelieda between", value1, value2, "zhuchelieda");
            return (Criteria) this;
        }
        public Criteria andZhucheliedaNotBetween(String value1, String value2) {
            addCriterion("zhuchelieda not between", value1, value2, "zhuchelieda");
            return (Criteria) this;
        }
        public Criteria andDaocheyangxiangIsNull() {
            addCriterion("daocheyangxiang is null");
            return (Criteria) this;
        }
        public Criteria andDaocheyangxiangIsNotNull() {
            addCriterion("daocheyangxiang is not null");
            return (Criteria) this;
        }
        public Criteria andDaocheyangxiangEqualTo(String value) {
            addCriterion("daocheyangxiang =", value, "daocheyangxiang");
            return (Criteria) this;
        }
        public Criteria andDaocheyangxiangNotEqualTo(String value) {
            addCriterion("daocheyangxiang <>", value, "daocheyangxiang");
            return (Criteria) this;
        }
        public Criteria andDaocheyangxiangGreaterThan(String value) {
            addCriterion("daocheyangxiang >", value, "daocheyangxiang");
            return (Criteria) this;
        }
        public Criteria andDaocheyangxiangGreaterThanOrEqualTo(String value) {
            addCriterion("daocheyangxiang >=", value, "daocheyangxiang");
            return (Criteria) this;
        }
        public Criteria andDaocheyangxiangLessThan(String value) {
            addCriterion("daocheyangxiang <", value, "daocheyangxiang");
            return (Criteria) this;
        }
        public Criteria andDaocheyangxiangLessThanOrEqualTo(String value) {
            addCriterion("daocheyangxiang <=", value, "daocheyangxiang");
            return (Criteria) this;
        }
        public Criteria andDaocheyangxiangLike(String value) {
            addCriterion("daocheyangxiang like", value, "daocheyangxiang");
            return (Criteria) this;
        }
        public Criteria andDaocheyangxiangNotLike(String value) {
            addCriterion("daocheyangxiang not like", value, "daocheyangxiang");
            return (Criteria) this;
        }
        public Criteria andDaocheyangxiangIn(List<String> values) {
            addCriterion("daocheyangxiang in", values, "daocheyangxiang");
            return (Criteria) this;
        }
        public Criteria andDaocheyangxiangNotIn(List<String> values) {
            addCriterion("daocheyangxiang not in", values, "daocheyangxiang");
            return (Criteria) this;
        }
        public Criteria andDaocheyangxiangBetween(String value1, String value2) {
            addCriterion("daocheyangxiang between", value1, value2, "daocheyangxiang");
            return (Criteria) this;
        }
        public Criteria andDaocheyangxiangNotBetween(String value1, String value2) {
            addCriterion("daocheyangxiang not between", value1, value2, "daocheyangxiang");
            return (Criteria) this;
        }
        public Criteria andQuanqingshexaingtoouIsNull() {
            addCriterion("quanqingshexaingtoou is null");
            return (Criteria) this;
        }
        public Criteria andQuanqingshexaingtoouIsNotNull() {
            addCriterion("quanqingshexaingtoou is not null");
            return (Criteria) this;
        }
        public Criteria andQuanqingshexaingtoouEqualTo(String value) {
            addCriterion("quanqingshexaingtoou =", value, "quanqingshexaingtoou");
            return (Criteria) this;
        }
        public Criteria andQuanqingshexaingtoouNotEqualTo(String value) {
            addCriterion("quanqingshexaingtoou <>", value, "quanqingshexaingtoou");
            return (Criteria) this;
        }
        public Criteria andQuanqingshexaingtoouGreaterThan(String value) {
            addCriterion("quanqingshexaingtoou >", value, "quanqingshexaingtoou");
            return (Criteria) this;
        }
        public Criteria andQuanqingshexaingtoouGreaterThanOrEqualTo(String value) {
            addCriterion("quanqingshexaingtoou >=", value, "quanqingshexaingtoou");
            return (Criteria) this;
        }
        public Criteria andQuanqingshexaingtoouLessThan(String value) {
            addCriterion("quanqingshexaingtoou <", value, "quanqingshexaingtoou");
            return (Criteria) this;
        }
        public Criteria andQuanqingshexaingtoouLessThanOrEqualTo(String value) {
            addCriterion("quanqingshexaingtoou <=", value, "quanqingshexaingtoou");
            return (Criteria) this;
        }
        public Criteria andQuanqingshexaingtoouLike(String value) {
            addCriterion("quanqingshexaingtoou like", value, "quanqingshexaingtoou");
            return (Criteria) this;
        }
        public Criteria andQuanqingshexaingtoouNotLike(String value) {
            addCriterion("quanqingshexaingtoou not like", value, "quanqingshexaingtoou");
            return (Criteria) this;
        }
        public Criteria andQuanqingshexaingtoouIn(List<String> values) {
            addCriterion("quanqingshexaingtoou in", values, "quanqingshexaingtoou");
            return (Criteria) this;
        }
        public Criteria andQuanqingshexaingtoouNotIn(List<String> values) {
            addCriterion("quanqingshexaingtoou not in", values, "quanqingshexaingtoou");
            return (Criteria) this;
        }
        public Criteria andQuanqingshexaingtoouBetween(String value1, String value2) {
            addCriterion("quanqingshexaingtoou between", value1, value2, "quanqingshexaingtoou");
            return (Criteria) this;
        }
        public Criteria andQuanqingshexaingtoouNotBetween(String value1, String value2) {
            addCriterion("quanqingshexaingtoou not between", value1, value2, "quanqingshexaingtoou");
            return (Criteria) this;
        }
        public Criteria andDingsuxunhangIsNull() {
            addCriterion("dingsuxunhang is null");
            return (Criteria) this;
        }
        public Criteria andDingsuxunhangIsNotNull() {
            addCriterion("dingsuxunhang is not null");
            return (Criteria) this;
        }
        public Criteria andDingsuxunhangEqualTo(String value) {
            addCriterion("dingsuxunhang =", value, "dingsuxunhang");
            return (Criteria) this;
        }
        public Criteria andDingsuxunhangNotEqualTo(String value) {
            addCriterion("dingsuxunhang <>", value, "dingsuxunhang");
            return (Criteria) this;
        }
        public Criteria andDingsuxunhangGreaterThan(String value) {
            addCriterion("dingsuxunhang >", value, "dingsuxunhang");
            return (Criteria) this;
        }
        public Criteria andDingsuxunhangGreaterThanOrEqualTo(String value) {
            addCriterion("dingsuxunhang >=", value, "dingsuxunhang");
            return (Criteria) this;
        }
        public Criteria andDingsuxunhangLessThan(String value) {
            addCriterion("dingsuxunhang <", value, "dingsuxunhang");
            return (Criteria) this;
        }
        public Criteria andDingsuxunhangLessThanOrEqualTo(String value) {
            addCriterion("dingsuxunhang <=", value, "dingsuxunhang");
            return (Criteria) this;
        }
        public Criteria andDingsuxunhangLike(String value) {
            addCriterion("dingsuxunhang like", value, "dingsuxunhang");
            return (Criteria) this;
        }
        public Criteria andDingsuxunhangNotLike(String value) {
            addCriterion("dingsuxunhang not like", value, "dingsuxunhang");
            return (Criteria) this;
        }
        public Criteria andDingsuxunhangIn(List<String> values) {
            addCriterion("dingsuxunhang in", values, "dingsuxunhang");
            return (Criteria) this;
        }
        public Criteria andDingsuxunhangNotIn(List<String> values) {
            addCriterion("dingsuxunhang not in", values, "dingsuxunhang");
            return (Criteria) this;
        }
        public Criteria andDingsuxunhangBetween(String value1, String value2) {
            addCriterion("dingsuxunhang between", value1, value2, "dingsuxunhang");
            return (Criteria) this;
        }
        public Criteria andDingsuxunhangNotBetween(String value1, String value2) {
            addCriterion("dingsuxunhang not between", value1, value2, "dingsuxunhang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyunhangIsNull() {
            addCriterion("zishiyingyunhang is null");
            return (Criteria) this;
        }
        public Criteria andZishiyingyunhangIsNotNull() {
            addCriterion("zishiyingyunhang is not null");
            return (Criteria) this;
        }
        public Criteria andZishiyingyunhangEqualTo(String value) {
            addCriterion("zishiyingyunhang =", value, "zishiyingyunhang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyunhangNotEqualTo(String value) {
            addCriterion("zishiyingyunhang <>", value, "zishiyingyunhang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyunhangGreaterThan(String value) {
            addCriterion("zishiyingyunhang >", value, "zishiyingyunhang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyunhangGreaterThanOrEqualTo(String value) {
            addCriterion("zishiyingyunhang >=", value, "zishiyingyunhang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyunhangLessThan(String value) {
            addCriterion("zishiyingyunhang <", value, "zishiyingyunhang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyunhangLessThanOrEqualTo(String value) {
            addCriterion("zishiyingyunhang <=", value, "zishiyingyunhang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyunhangLike(String value) {
            addCriterion("zishiyingyunhang like", value, "zishiyingyunhang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyunhangNotLike(String value) {
            addCriterion("zishiyingyunhang not like", value, "zishiyingyunhang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyunhangIn(List<String> values) {
            addCriterion("zishiyingyunhang in", values, "zishiyingyunhang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyunhangNotIn(List<String> values) {
            addCriterion("zishiyingyunhang not in", values, "zishiyingyunhang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyunhangBetween(String value1, String value2) {
            addCriterion("zishiyingyunhang between", value1, value2, "zishiyingyunhang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyunhangNotBetween(String value1, String value2) {
            addCriterion("zishiyingyunhang not between", value1, value2, "zishiyingyunhang");
            return (Criteria) this;
        }
        public Criteria andZidongbuocheIsNull() {
            addCriterion("zidongbuoche is null");
            return (Criteria) this;
        }
        public Criteria andZidongbuocheIsNotNull() {
            addCriterion("zidongbuoche is not null");
            return (Criteria) this;
        }
        public Criteria andZidongbuocheEqualTo(String value) {
            addCriterion("zidongbuoche =", value, "zidongbuoche");
            return (Criteria) this;
        }
        public Criteria andZidongbuocheNotEqualTo(String value) {
            addCriterion("zidongbuoche <>", value, "zidongbuoche");
            return (Criteria) this;
        }
        public Criteria andZidongbuocheGreaterThan(String value) {
            addCriterion("zidongbuoche >", value, "zidongbuoche");
            return (Criteria) this;
        }
        public Criteria andZidongbuocheGreaterThanOrEqualTo(String value) {
            addCriterion("zidongbuoche >=", value, "zidongbuoche");
            return (Criteria) this;
        }
        public Criteria andZidongbuocheLessThan(String value) {
            addCriterion("zidongbuoche <", value, "zidongbuoche");
            return (Criteria) this;
        }
        public Criteria andZidongbuocheLessThanOrEqualTo(String value) {
            addCriterion("zidongbuoche <=", value, "zidongbuoche");
            return (Criteria) this;
        }
        public Criteria andZidongbuocheLike(String value) {
            addCriterion("zidongbuoche like", value, "zidongbuoche");
            return (Criteria) this;
        }
        public Criteria andZidongbuocheNotLike(String value) {
            addCriterion("zidongbuoche not like", value, "zidongbuoche");
            return (Criteria) this;
        }
        public Criteria andZidongbuocheIn(List<String> values) {
            addCriterion("zidongbuoche in", values, "zidongbuoche");
            return (Criteria) this;
        }
        public Criteria andZidongbuocheNotIn(List<String> values) {
            addCriterion("zidongbuoche not in", values, "zidongbuoche");
            return (Criteria) this;
        }
        public Criteria andZidongbuocheBetween(String value1, String value2) {
            addCriterion("zidongbuoche between", value1, value2, "zidongbuoche");
            return (Criteria) this;
        }
        public Criteria andZidongbuocheNotBetween(String value1, String value2) {
            addCriterion("zidongbuoche not between", value1, value2, "zidongbuoche");
            return (Criteria) this;
        }
        public Criteria andFadongjizhantingIsNull() {
            addCriterion("fadongjizhanting is null");
            return (Criteria) this;
        }
        public Criteria andFadongjizhantingIsNotNull() {
            addCriterion("fadongjizhanting is not null");
            return (Criteria) this;
        }
        public Criteria andFadongjizhantingEqualTo(String value) {
            addCriterion("fadongjizhanting =", value, "fadongjizhanting");
            return (Criteria) this;
        }
        public Criteria andFadongjizhantingNotEqualTo(String value) {
            addCriterion("fadongjizhanting <>", value, "fadongjizhanting");
            return (Criteria) this;
        }
        public Criteria andFadongjizhantingGreaterThan(String value) {
            addCriterion("fadongjizhanting >", value, "fadongjizhanting");
            return (Criteria) this;
        }
        public Criteria andFadongjizhantingGreaterThanOrEqualTo(String value) {
            addCriterion("fadongjizhanting >=", value, "fadongjizhanting");
            return (Criteria) this;
        }
        public Criteria andFadongjizhantingLessThan(String value) {
            addCriterion("fadongjizhanting <", value, "fadongjizhanting");
            return (Criteria) this;
        }
        public Criteria andFadongjizhantingLessThanOrEqualTo(String value) {
            addCriterion("fadongjizhanting <=", value, "fadongjizhanting");
            return (Criteria) this;
        }
        public Criteria andFadongjizhantingLike(String value) {
            addCriterion("fadongjizhanting like", value, "fadongjizhanting");
            return (Criteria) this;
        }
        public Criteria andFadongjizhantingNotLike(String value) {
            addCriterion("fadongjizhanting not like", value, "fadongjizhanting");
            return (Criteria) this;
        }
        public Criteria andFadongjizhantingIn(List<String> values) {
            addCriterion("fadongjizhanting in", values, "fadongjizhanting");
            return (Criteria) this;
        }
        public Criteria andFadongjizhantingNotIn(List<String> values) {
            addCriterion("fadongjizhanting not in", values, "fadongjizhanting");
            return (Criteria) this;
        }
        public Criteria andFadongjizhantingBetween(String value1, String value2) {
            addCriterion("fadongjizhanting between", value1, value2, "fadongjizhanting");
            return (Criteria) this;
        }
        public Criteria andFadongjizhantingNotBetween(String value1, String value2) {
            addCriterion("fadongjizhanting not between", value1, value2, "fadongjizhanting");
            return (Criteria) this;
        }
        public Criteria andZhidongjiashiIsNull() {
            addCriterion("zhidongjiashi is null");
            return (Criteria) this;
        }
        public Criteria andZhidongjiashiIsNotNull() {
            addCriterion("zhidongjiashi is not null");
            return (Criteria) this;
        }
        public Criteria andZhidongjiashiEqualTo(String value) {
            addCriterion("zhidongjiashi =", value, "zhidongjiashi");
            return (Criteria) this;
        }
        public Criteria andZhidongjiashiNotEqualTo(String value) {
            addCriterion("zhidongjiashi <>", value, "zhidongjiashi");
            return (Criteria) this;
        }
        public Criteria andZhidongjiashiGreaterThan(String value) {
            addCriterion("zhidongjiashi >", value, "zhidongjiashi");
            return (Criteria) this;
        }
        public Criteria andZhidongjiashiGreaterThanOrEqualTo(String value) {
            addCriterion("zhidongjiashi >=", value, "zhidongjiashi");
            return (Criteria) this;
        }
        public Criteria andZhidongjiashiLessThan(String value) {
            addCriterion("zhidongjiashi <", value, "zhidongjiashi");
            return (Criteria) this;
        }
        public Criteria andZhidongjiashiLessThanOrEqualTo(String value) {
            addCriterion("zhidongjiashi <=", value, "zhidongjiashi");
            return (Criteria) this;
        }
        public Criteria andZhidongjiashiLike(String value) {
            addCriterion("zhidongjiashi like", value, "zhidongjiashi");
            return (Criteria) this;
        }
        public Criteria andZhidongjiashiNotLike(String value) {
            addCriterion("zhidongjiashi not like", value, "zhidongjiashi");
            return (Criteria) this;
        }
        public Criteria andZhidongjiashiIn(List<String> values) {
            addCriterion("zhidongjiashi in", values, "zhidongjiashi");
            return (Criteria) this;
        }
        public Criteria andZhidongjiashiNotIn(List<String> values) {
            addCriterion("zhidongjiashi not in", values, "zhidongjiashi");
            return (Criteria) this;
        }
        public Criteria andZhidongjiashiBetween(String value1, String value2) {
            addCriterion("zhidongjiashi between", value1, value2, "zhidongjiashi");
            return (Criteria) this;
        }
        public Criteria andZhidongjiashiNotBetween(String value1, String value2) {
            addCriterion("zhidongjiashi not between", value1, value2, "zhidongjiashi");
            return (Criteria) this;
        }
        public Criteria andShangbuofuzhuIsNull() {
            addCriterion("shangbuofuzhu is null");
            return (Criteria) this;
        }
        public Criteria andShangbuofuzhuIsNotNull() {
            addCriterion("shangbuofuzhu is not null");
            return (Criteria) this;
        }
        public Criteria andShangbuofuzhuEqualTo(String value) {
            addCriterion("shangbuofuzhu =", value, "shangbuofuzhu");
            return (Criteria) this;
        }
        public Criteria andShangbuofuzhuNotEqualTo(String value) {
            addCriterion("shangbuofuzhu <>", value, "shangbuofuzhu");
            return (Criteria) this;
        }
        public Criteria andShangbuofuzhuGreaterThan(String value) {
            addCriterion("shangbuofuzhu >", value, "shangbuofuzhu");
            return (Criteria) this;
        }
        public Criteria andShangbuofuzhuGreaterThanOrEqualTo(String value) {
            addCriterion("shangbuofuzhu >=", value, "shangbuofuzhu");
            return (Criteria) this;
        }
        public Criteria andShangbuofuzhuLessThan(String value) {
            addCriterion("shangbuofuzhu <", value, "shangbuofuzhu");
            return (Criteria) this;
        }
        public Criteria andShangbuofuzhuLessThanOrEqualTo(String value) {
            addCriterion("shangbuofuzhu <=", value, "shangbuofuzhu");
            return (Criteria) this;
        }
        public Criteria andShangbuofuzhuLike(String value) {
            addCriterion("shangbuofuzhu like", value, "shangbuofuzhu");
            return (Criteria) this;
        }
        public Criteria andShangbuofuzhuNotLike(String value) {
            addCriterion("shangbuofuzhu not like", value, "shangbuofuzhu");
            return (Criteria) this;
        }
        public Criteria andShangbuofuzhuIn(List<String> values) {
            addCriterion("shangbuofuzhu in", values, "shangbuofuzhu");
            return (Criteria) this;
        }
        public Criteria andShangbuofuzhuNotIn(List<String> values) {
            addCriterion("shangbuofuzhu not in", values, "shangbuofuzhu");
            return (Criteria) this;
        }
        public Criteria andShangbuofuzhuBetween(String value1, String value2) {
            addCriterion("shangbuofuzhu between", value1, value2, "shangbuofuzhu");
            return (Criteria) this;
        }
        public Criteria andShangbuofuzhuNotBetween(String value1, String value2) {
            addCriterion("shangbuofuzhu not between", value1, value2, "shangbuofuzhu");
            return (Criteria) this;
        }
        public Criteria andZhidongzhucheIsNull() {
            addCriterion("zhidongzhuche is null");
            return (Criteria) this;
        }
        public Criteria andZhidongzhucheIsNotNull() {
            addCriterion("zhidongzhuche is not null");
            return (Criteria) this;
        }
        public Criteria andZhidongzhucheEqualTo(String value) {
            addCriterion("zhidongzhuche =", value, "zhidongzhuche");
            return (Criteria) this;
        }
        public Criteria andZhidongzhucheNotEqualTo(String value) {
            addCriterion("zhidongzhuche <>", value, "zhidongzhuche");
            return (Criteria) this;
        }
        public Criteria andZhidongzhucheGreaterThan(String value) {
            addCriterion("zhidongzhuche >", value, "zhidongzhuche");
            return (Criteria) this;
        }
        public Criteria andZhidongzhucheGreaterThanOrEqualTo(String value) {
            addCriterion("zhidongzhuche >=", value, "zhidongzhuche");
            return (Criteria) this;
        }
        public Criteria andZhidongzhucheLessThan(String value) {
            addCriterion("zhidongzhuche <", value, "zhidongzhuche");
            return (Criteria) this;
        }
        public Criteria andZhidongzhucheLessThanOrEqualTo(String value) {
            addCriterion("zhidongzhuche <=", value, "zhidongzhuche");
            return (Criteria) this;
        }
        public Criteria andZhidongzhucheLike(String value) {
            addCriterion("zhidongzhuche like", value, "zhidongzhuche");
            return (Criteria) this;
        }
        public Criteria andZhidongzhucheNotLike(String value) {
            addCriterion("zhidongzhuche not like", value, "zhidongzhuche");
            return (Criteria) this;
        }
        public Criteria andZhidongzhucheIn(List<String> values) {
            addCriterion("zhidongzhuche in", values, "zhidongzhuche");
            return (Criteria) this;
        }
        public Criteria andZhidongzhucheNotIn(List<String> values) {
            addCriterion("zhidongzhuche not in", values, "zhidongzhuche");
            return (Criteria) this;
        }
        public Criteria andZhidongzhucheBetween(String value1, String value2) {
            addCriterion("zhidongzhuche between", value1, value2, "zhidongzhuche");
            return (Criteria) this;
        }
        public Criteria andZhidongzhucheNotBetween(String value1, String value2) {
            addCriterion("zhidongzhuche not between", value1, value2, "zhidongzhuche");
            return (Criteria) this;
        }
        public Criteria andDoupohuanjiangIsNull() {
            addCriterion("doupohuanjiang is null");
            return (Criteria) this;
        }
        public Criteria andDoupohuanjiangIsNotNull() {
            addCriterion("doupohuanjiang is not null");
            return (Criteria) this;
        }
        public Criteria andDoupohuanjiangEqualTo(String value) {
            addCriterion("doupohuanjiang =", value, "doupohuanjiang");
            return (Criteria) this;
        }
        public Criteria andDoupohuanjiangNotEqualTo(String value) {
            addCriterion("doupohuanjiang <>", value, "doupohuanjiang");
            return (Criteria) this;
        }
        public Criteria andDoupohuanjiangGreaterThan(String value) {
            addCriterion("doupohuanjiang >", value, "doupohuanjiang");
            return (Criteria) this;
        }
        public Criteria andDoupohuanjiangGreaterThanOrEqualTo(String value) {
            addCriterion("doupohuanjiang >=", value, "doupohuanjiang");
            return (Criteria) this;
        }
        public Criteria andDoupohuanjiangLessThan(String value) {
            addCriterion("doupohuanjiang <", value, "doupohuanjiang");
            return (Criteria) this;
        }
        public Criteria andDoupohuanjiangLessThanOrEqualTo(String value) {
            addCriterion("doupohuanjiang <=", value, "doupohuanjiang");
            return (Criteria) this;
        }
        public Criteria andDoupohuanjiangLike(String value) {
            addCriterion("doupohuanjiang like", value, "doupohuanjiang");
            return (Criteria) this;
        }
        public Criteria andDoupohuanjiangNotLike(String value) {
            addCriterion("doupohuanjiang not like", value, "doupohuanjiang");
            return (Criteria) this;
        }
        public Criteria andDoupohuanjiangIn(List<String> values) {
            addCriterion("doupohuanjiang in", values, "doupohuanjiang");
            return (Criteria) this;
        }
        public Criteria andDoupohuanjiangNotIn(List<String> values) {
            addCriterion("doupohuanjiang not in", values, "doupohuanjiang");
            return (Criteria) this;
        }
        public Criteria andDoupohuanjiangBetween(String value1, String value2) {
            addCriterion("doupohuanjiang between", value1, value2, "doupohuanjiang");
            return (Criteria) this;
        }
        public Criteria andDoupohuanjiangNotBetween(String value1, String value2) {
            addCriterion("doupohuanjiang not between", value1, value2, "doupohuanjiang");
            return (Criteria) this;
        }
        public Criteria andKebianxuanjiaIsNull() {
            addCriterion("kebianxuanjia is null");
            return (Criteria) this;
        }
        public Criteria andKebianxuanjiaIsNotNull() {
            addCriterion("kebianxuanjia is not null");
            return (Criteria) this;
        }
        public Criteria andKebianxuanjiaEqualTo(String value) {
            addCriterion("kebianxuanjia =", value, "kebianxuanjia");
            return (Criteria) this;
        }
        public Criteria andKebianxuanjiaNotEqualTo(String value) {
            addCriterion("kebianxuanjia <>", value, "kebianxuanjia");
            return (Criteria) this;
        }
        public Criteria andKebianxuanjiaGreaterThan(String value) {
            addCriterion("kebianxuanjia >", value, "kebianxuanjia");
            return (Criteria) this;
        }
        public Criteria andKebianxuanjiaGreaterThanOrEqualTo(String value) {
            addCriterion("kebianxuanjia >=", value, "kebianxuanjia");
            return (Criteria) this;
        }
        public Criteria andKebianxuanjiaLessThan(String value) {
            addCriterion("kebianxuanjia <", value, "kebianxuanjia");
            return (Criteria) this;
        }
        public Criteria andKebianxuanjiaLessThanOrEqualTo(String value) {
            addCriterion("kebianxuanjia <=", value, "kebianxuanjia");
            return (Criteria) this;
        }
        public Criteria andKebianxuanjiaLike(String value) {
            addCriterion("kebianxuanjia like", value, "kebianxuanjia");
            return (Criteria) this;
        }
        public Criteria andKebianxuanjiaNotLike(String value) {
            addCriterion("kebianxuanjia not like", value, "kebianxuanjia");
            return (Criteria) this;
        }
        public Criteria andKebianxuanjiaIn(List<String> values) {
            addCriterion("kebianxuanjia in", values, "kebianxuanjia");
            return (Criteria) this;
        }
        public Criteria andKebianxuanjiaNotIn(List<String> values) {
            addCriterion("kebianxuanjia not in", values, "kebianxuanjia");
            return (Criteria) this;
        }
        public Criteria andKebianxuanjiaBetween(String value1, String value2) {
            addCriterion("kebianxuanjia between", value1, value2, "kebianxuanjia");
            return (Criteria) this;
        }
        public Criteria andKebianxuanjiaNotBetween(String value1, String value2) {
            addCriterion("kebianxuanjia not between", value1, value2, "kebianxuanjia");
            return (Criteria) this;
        }
        public Criteria andKongqixuanjiaIsNull() {
            addCriterion("kongqixuanjia is null");
            return (Criteria) this;
        }
        public Criteria andKongqixuanjiaIsNotNull() {
            addCriterion("kongqixuanjia is not null");
            return (Criteria) this;
        }
        public Criteria andKongqixuanjiaEqualTo(String value) {
            addCriterion("kongqixuanjia =", value, "kongqixuanjia");
            return (Criteria) this;
        }
        public Criteria andKongqixuanjiaNotEqualTo(String value) {
            addCriterion("kongqixuanjia <>", value, "kongqixuanjia");
            return (Criteria) this;
        }
        public Criteria andKongqixuanjiaGreaterThan(String value) {
            addCriterion("kongqixuanjia >", value, "kongqixuanjia");
            return (Criteria) this;
        }
        public Criteria andKongqixuanjiaGreaterThanOrEqualTo(String value) {
            addCriterion("kongqixuanjia >=", value, "kongqixuanjia");
            return (Criteria) this;
        }
        public Criteria andKongqixuanjiaLessThan(String value) {
            addCriterion("kongqixuanjia <", value, "kongqixuanjia");
            return (Criteria) this;
        }
        public Criteria andKongqixuanjiaLessThanOrEqualTo(String value) {
            addCriterion("kongqixuanjia <=", value, "kongqixuanjia");
            return (Criteria) this;
        }
        public Criteria andKongqixuanjiaLike(String value) {
            addCriterion("kongqixuanjia like", value, "kongqixuanjia");
            return (Criteria) this;
        }
        public Criteria andKongqixuanjiaNotLike(String value) {
            addCriterion("kongqixuanjia not like", value, "kongqixuanjia");
            return (Criteria) this;
        }
        public Criteria andKongqixuanjiaIn(List<String> values) {
            addCriterion("kongqixuanjia in", values, "kongqixuanjia");
            return (Criteria) this;
        }
        public Criteria andKongqixuanjiaNotIn(List<String> values) {
            addCriterion("kongqixuanjia not in", values, "kongqixuanjia");
            return (Criteria) this;
        }
        public Criteria andKongqixuanjiaBetween(String value1, String value2) {
            addCriterion("kongqixuanjia between", value1, value2, "kongqixuanjia");
            return (Criteria) this;
        }
        public Criteria andKongqixuanjiaNotBetween(String value1, String value2) {
            addCriterion("kongqixuanjia not between", value1, value2, "kongqixuanjia");
            return (Criteria) this;
        }
        public Criteria andDainceganyingxuanjiaIsNull() {
            addCriterion("dainceganyingxuanjia is null");
            return (Criteria) this;
        }
        public Criteria andDainceganyingxuanjiaIsNotNull() {
            addCriterion("dainceganyingxuanjia is not null");
            return (Criteria) this;
        }
        public Criteria andDainceganyingxuanjiaEqualTo(String value) {
            addCriterion("dainceganyingxuanjia =", value, "dainceganyingxuanjia");
            return (Criteria) this;
        }
        public Criteria andDainceganyingxuanjiaNotEqualTo(String value) {
            addCriterion("dainceganyingxuanjia <>", value, "dainceganyingxuanjia");
            return (Criteria) this;
        }
        public Criteria andDainceganyingxuanjiaGreaterThan(String value) {
            addCriterion("dainceganyingxuanjia >", value, "dainceganyingxuanjia");
            return (Criteria) this;
        }
        public Criteria andDainceganyingxuanjiaGreaterThanOrEqualTo(String value) {
            addCriterion("dainceganyingxuanjia >=", value, "dainceganyingxuanjia");
            return (Criteria) this;
        }
        public Criteria andDainceganyingxuanjiaLessThan(String value) {
            addCriterion("dainceganyingxuanjia <", value, "dainceganyingxuanjia");
            return (Criteria) this;
        }
        public Criteria andDainceganyingxuanjiaLessThanOrEqualTo(String value) {
            addCriterion("dainceganyingxuanjia <=", value, "dainceganyingxuanjia");
            return (Criteria) this;
        }
        public Criteria andDainceganyingxuanjiaLike(String value) {
            addCriterion("dainceganyingxuanjia like", value, "dainceganyingxuanjia");
            return (Criteria) this;
        }
        public Criteria andDainceganyingxuanjiaNotLike(String value) {
            addCriterion("dainceganyingxuanjia not like", value, "dainceganyingxuanjia");
            return (Criteria) this;
        }
        public Criteria andDainceganyingxuanjiaIn(List<String> values) {
            addCriterion("dainceganyingxuanjia in", values, "dainceganyingxuanjia");
            return (Criteria) this;
        }
        public Criteria andDainceganyingxuanjiaNotIn(List<String> values) {
            addCriterion("dainceganyingxuanjia not in", values, "dainceganyingxuanjia");
            return (Criteria) this;
        }
        public Criteria andDainceganyingxuanjiaBetween(String value1, String value2) {
            addCriterion("dainceganyingxuanjia between", value1, value2, "dainceganyingxuanjia");
            return (Criteria) this;
        }
        public Criteria andDainceganyingxuanjiaNotBetween(String value1, String value2) {
            addCriterion("dainceganyingxuanjia not between", value1, value2, "dainceganyingxuanjia");
            return (Criteria) this;
        }
        public Criteria andKebianzhuanxiangbiIsNull() {
            addCriterion("kebianzhuanxiangbi is null");
            return (Criteria) this;
        }
        public Criteria andKebianzhuanxiangbiIsNotNull() {
            addCriterion("kebianzhuanxiangbi is not null");
            return (Criteria) this;
        }
        public Criteria andKebianzhuanxiangbiEqualTo(String value) {
            addCriterion("kebianzhuanxiangbi =", value, "kebianzhuanxiangbi");
            return (Criteria) this;
        }
        public Criteria andKebianzhuanxiangbiNotEqualTo(String value) {
            addCriterion("kebianzhuanxiangbi <>", value, "kebianzhuanxiangbi");
            return (Criteria) this;
        }
        public Criteria andKebianzhuanxiangbiGreaterThan(String value) {
            addCriterion("kebianzhuanxiangbi >", value, "kebianzhuanxiangbi");
            return (Criteria) this;
        }
        public Criteria andKebianzhuanxiangbiGreaterThanOrEqualTo(String value) {
            addCriterion("kebianzhuanxiangbi >=", value, "kebianzhuanxiangbi");
            return (Criteria) this;
        }
        public Criteria andKebianzhuanxiangbiLessThan(String value) {
            addCriterion("kebianzhuanxiangbi <", value, "kebianzhuanxiangbi");
            return (Criteria) this;
        }
        public Criteria andKebianzhuanxiangbiLessThanOrEqualTo(String value) {
            addCriterion("kebianzhuanxiangbi <=", value, "kebianzhuanxiangbi");
            return (Criteria) this;
        }
        public Criteria andKebianzhuanxiangbiLike(String value) {
            addCriterion("kebianzhuanxiangbi like", value, "kebianzhuanxiangbi");
            return (Criteria) this;
        }
        public Criteria andKebianzhuanxiangbiNotLike(String value) {
            addCriterion("kebianzhuanxiangbi not like", value, "kebianzhuanxiangbi");
            return (Criteria) this;
        }
        public Criteria andKebianzhuanxiangbiIn(List<String> values) {
            addCriterion("kebianzhuanxiangbi in", values, "kebianzhuanxiangbi");
            return (Criteria) this;
        }
        public Criteria andKebianzhuanxiangbiNotIn(List<String> values) {
            addCriterion("kebianzhuanxiangbi not in", values, "kebianzhuanxiangbi");
            return (Criteria) this;
        }
        public Criteria andKebianzhuanxiangbiBetween(String value1, String value2) {
            addCriterion("kebianzhuanxiangbi between", value1, value2, "kebianzhuanxiangbi");
            return (Criteria) this;
        }
        public Criteria andKebianzhuanxiangbiNotBetween(String value1, String value2) {
            addCriterion("kebianzhuanxiangbi not between", value1, value2, "kebianzhuanxiangbi");
            return (Criteria) this;
        }
        public Criteria andDiandongtianchuangIsNull() {
            addCriterion("diandongtianchuang is null");
            return (Criteria) this;
        }
        public Criteria andDiandongtianchuangIsNotNull() {
            addCriterion("diandongtianchuang is not null");
            return (Criteria) this;
        }
        public Criteria andDiandongtianchuangEqualTo(String value) {
            addCriterion("diandongtianchuang =", value, "diandongtianchuang");
            return (Criteria) this;
        }
        public Criteria andDiandongtianchuangNotEqualTo(String value) {
            addCriterion("diandongtianchuang <>", value, "diandongtianchuang");
            return (Criteria) this;
        }
        public Criteria andDiandongtianchuangGreaterThan(String value) {
            addCriterion("diandongtianchuang >", value, "diandongtianchuang");
            return (Criteria) this;
        }
        public Criteria andDiandongtianchuangGreaterThanOrEqualTo(String value) {
            addCriterion("diandongtianchuang >=", value, "diandongtianchuang");
            return (Criteria) this;
        }
        public Criteria andDiandongtianchuangLessThan(String value) {
            addCriterion("diandongtianchuang <", value, "diandongtianchuang");
            return (Criteria) this;
        }
        public Criteria andDiandongtianchuangLessThanOrEqualTo(String value) {
            addCriterion("diandongtianchuang <=", value, "diandongtianchuang");
            return (Criteria) this;
        }
        public Criteria andDiandongtianchuangLike(String value) {
            addCriterion("diandongtianchuang like", value, "diandongtianchuang");
            return (Criteria) this;
        }
        public Criteria andDiandongtianchuangNotLike(String value) {
            addCriterion("diandongtianchuang not like", value, "diandongtianchuang");
            return (Criteria) this;
        }
        public Criteria andDiandongtianchuangIn(List<String> values) {
            addCriterion("diandongtianchuang in", values, "diandongtianchuang");
            return (Criteria) this;
        }
        public Criteria andDiandongtianchuangNotIn(List<String> values) {
            addCriterion("diandongtianchuang not in", values, "diandongtianchuang");
            return (Criteria) this;
        }
        public Criteria andDiandongtianchuangBetween(String value1, String value2) {
            addCriterion("diandongtianchuang between", value1, value2, "diandongtianchuang");
            return (Criteria) this;
        }
        public Criteria andDiandongtianchuangNotBetween(String value1, String value2) {
            addCriterion("diandongtianchuang not between", value1, value2, "diandongtianchuang");
            return (Criteria) this;
        }
        public Criteria andQuanjingtianchuangIsNull() {
            addCriterion("quanjingtianchuang is null");
            return (Criteria) this;
        }
        public Criteria andQuanjingtianchuangIsNotNull() {
            addCriterion("quanjingtianchuang is not null");
            return (Criteria) this;
        }
        public Criteria andQuanjingtianchuangEqualTo(String value) {
            addCriterion("quanjingtianchuang =", value, "quanjingtianchuang");
            return (Criteria) this;
        }
        public Criteria andQuanjingtianchuangNotEqualTo(String value) {
            addCriterion("quanjingtianchuang <>", value, "quanjingtianchuang");
            return (Criteria) this;
        }
        public Criteria andQuanjingtianchuangGreaterThan(String value) {
            addCriterion("quanjingtianchuang >", value, "quanjingtianchuang");
            return (Criteria) this;
        }
        public Criteria andQuanjingtianchuangGreaterThanOrEqualTo(String value) {
            addCriterion("quanjingtianchuang >=", value, "quanjingtianchuang");
            return (Criteria) this;
        }
        public Criteria andQuanjingtianchuangLessThan(String value) {
            addCriterion("quanjingtianchuang <", value, "quanjingtianchuang");
            return (Criteria) this;
        }
        public Criteria andQuanjingtianchuangLessThanOrEqualTo(String value) {
            addCriterion("quanjingtianchuang <=", value, "quanjingtianchuang");
            return (Criteria) this;
        }
        public Criteria andQuanjingtianchuangLike(String value) {
            addCriterion("quanjingtianchuang like", value, "quanjingtianchuang");
            return (Criteria) this;
        }
        public Criteria andQuanjingtianchuangNotLike(String value) {
            addCriterion("quanjingtianchuang not like", value, "quanjingtianchuang");
            return (Criteria) this;
        }
        public Criteria andQuanjingtianchuangIn(List<String> values) {
            addCriterion("quanjingtianchuang in", values, "quanjingtianchuang");
            return (Criteria) this;
        }
        public Criteria andQuanjingtianchuangNotIn(List<String> values) {
            addCriterion("quanjingtianchuang not in", values, "quanjingtianchuang");
            return (Criteria) this;
        }
        public Criteria andQuanjingtianchuangBetween(String value1, String value2) {
            addCriterion("quanjingtianchuang between", value1, value2, "quanjingtianchuang");
            return (Criteria) this;
        }
        public Criteria andQuanjingtianchuangNotBetween(String value1, String value2) {
            addCriterion("quanjingtianchuang not between", value1, value2, "quanjingtianchuang");
            return (Criteria) this;
        }
        public Criteria andYundongwaiguanIsNull() {
            addCriterion("yundongwaiguan is null");
            return (Criteria) this;
        }
        public Criteria andYundongwaiguanIsNotNull() {
            addCriterion("yundongwaiguan is not null");
            return (Criteria) this;
        }
        public Criteria andYundongwaiguanEqualTo(String value) {
            addCriterion("yundongwaiguan =", value, "yundongwaiguan");
            return (Criteria) this;
        }
        public Criteria andYundongwaiguanNotEqualTo(String value) {
            addCriterion("yundongwaiguan <>", value, "yundongwaiguan");
            return (Criteria) this;
        }
        public Criteria andYundongwaiguanGreaterThan(String value) {
            addCriterion("yundongwaiguan >", value, "yundongwaiguan");
            return (Criteria) this;
        }
        public Criteria andYundongwaiguanGreaterThanOrEqualTo(String value) {
            addCriterion("yundongwaiguan >=", value, "yundongwaiguan");
            return (Criteria) this;
        }
        public Criteria andYundongwaiguanLessThan(String value) {
            addCriterion("yundongwaiguan <", value, "yundongwaiguan");
            return (Criteria) this;
        }
        public Criteria andYundongwaiguanLessThanOrEqualTo(String value) {
            addCriterion("yundongwaiguan <=", value, "yundongwaiguan");
            return (Criteria) this;
        }
        public Criteria andYundongwaiguanLike(String value) {
            addCriterion("yundongwaiguan like", value, "yundongwaiguan");
            return (Criteria) this;
        }
        public Criteria andYundongwaiguanNotLike(String value) {
            addCriterion("yundongwaiguan not like", value, "yundongwaiguan");
            return (Criteria) this;
        }
        public Criteria andYundongwaiguanIn(List<String> values) {
            addCriterion("yundongwaiguan in", values, "yundongwaiguan");
            return (Criteria) this;
        }
        public Criteria andYundongwaiguanNotIn(List<String> values) {
            addCriterion("yundongwaiguan not in", values, "yundongwaiguan");
            return (Criteria) this;
        }
        public Criteria andYundongwaiguanBetween(String value1, String value2) {
            addCriterion("yundongwaiguan between", value1, value2, "yundongwaiguan");
            return (Criteria) this;
        }
        public Criteria andYundongwaiguanNotBetween(String value1, String value2) {
            addCriterion("yundongwaiguan not between", value1, value2, "yundongwaiguan");
            return (Criteria) this;
        }
        public Criteria andLuhejinlunquanIsNull() {
            addCriterion("luhejinlunquan is null");
            return (Criteria) this;
        }
        public Criteria andLuhejinlunquanIsNotNull() {
            addCriterion("luhejinlunquan is not null");
            return (Criteria) this;
        }
        public Criteria andLuhejinlunquanEqualTo(String value) {
            addCriterion("luhejinlunquan =", value, "luhejinlunquan");
            return (Criteria) this;
        }
        public Criteria andLuhejinlunquanNotEqualTo(String value) {
            addCriterion("luhejinlunquan <>", value, "luhejinlunquan");
            return (Criteria) this;
        }
        public Criteria andLuhejinlunquanGreaterThan(String value) {
            addCriterion("luhejinlunquan >", value, "luhejinlunquan");
            return (Criteria) this;
        }
        public Criteria andLuhejinlunquanGreaterThanOrEqualTo(String value) {
            addCriterion("luhejinlunquan >=", value, "luhejinlunquan");
            return (Criteria) this;
        }
        public Criteria andLuhejinlunquanLessThan(String value) {
            addCriterion("luhejinlunquan <", value, "luhejinlunquan");
            return (Criteria) this;
        }
        public Criteria andLuhejinlunquanLessThanOrEqualTo(String value) {
            addCriterion("luhejinlunquan <=", value, "luhejinlunquan");
            return (Criteria) this;
        }
        public Criteria andLuhejinlunquanLike(String value) {
            addCriterion("luhejinlunquan like", value, "luhejinlunquan");
            return (Criteria) this;
        }
        public Criteria andLuhejinlunquanNotLike(String value) {
            addCriterion("luhejinlunquan not like", value, "luhejinlunquan");
            return (Criteria) this;
        }
        public Criteria andLuhejinlunquanIn(List<String> values) {
            addCriterion("luhejinlunquan in", values, "luhejinlunquan");
            return (Criteria) this;
        }
        public Criteria andLuhejinlunquanNotIn(List<String> values) {
            addCriterion("luhejinlunquan not in", values, "luhejinlunquan");
            return (Criteria) this;
        }
        public Criteria andLuhejinlunquanBetween(String value1, String value2) {
            addCriterion("luhejinlunquan between", value1, value2, "luhejinlunquan");
            return (Criteria) this;
        }
        public Criteria andLuhejinlunquanNotBetween(String value1, String value2) {
            addCriterion("luhejinlunquan not between", value1, value2, "luhejinlunquan");
            return (Criteria) this;
        }
        public Criteria andDaindongxihemenIsNull() {
            addCriterion("daindongxihemen is null");
            return (Criteria) this;
        }
        public Criteria andDaindongxihemenIsNotNull() {
            addCriterion("daindongxihemen is not null");
            return (Criteria) this;
        }
        public Criteria andDaindongxihemenEqualTo(String value) {
            addCriterion("daindongxihemen =", value, "daindongxihemen");
            return (Criteria) this;
        }
        public Criteria andDaindongxihemenNotEqualTo(String value) {
            addCriterion("daindongxihemen <>", value, "daindongxihemen");
            return (Criteria) this;
        }
        public Criteria andDaindongxihemenGreaterThan(String value) {
            addCriterion("daindongxihemen >", value, "daindongxihemen");
            return (Criteria) this;
        }
        public Criteria andDaindongxihemenGreaterThanOrEqualTo(String value) {
            addCriterion("daindongxihemen >=", value, "daindongxihemen");
            return (Criteria) this;
        }
        public Criteria andDaindongxihemenLessThan(String value) {
            addCriterion("daindongxihemen <", value, "daindongxihemen");
            return (Criteria) this;
        }
        public Criteria andDaindongxihemenLessThanOrEqualTo(String value) {
            addCriterion("daindongxihemen <=", value, "daindongxihemen");
            return (Criteria) this;
        }
        public Criteria andDaindongxihemenLike(String value) {
            addCriterion("daindongxihemen like", value, "daindongxihemen");
            return (Criteria) this;
        }
        public Criteria andDaindongxihemenNotLike(String value) {
            addCriterion("daindongxihemen not like", value, "daindongxihemen");
            return (Criteria) this;
        }
        public Criteria andDaindongxihemenIn(List<String> values) {
            addCriterion("daindongxihemen in", values, "daindongxihemen");
            return (Criteria) this;
        }
        public Criteria andDaindongxihemenNotIn(List<String> values) {
            addCriterion("daindongxihemen not in", values, "daindongxihemen");
            return (Criteria) this;
        }
        public Criteria andDaindongxihemenBetween(String value1, String value2) {
            addCriterion("daindongxihemen between", value1, value2, "daindongxihemen");
            return (Criteria) this;
        }
        public Criteria andDaindongxihemenNotBetween(String value1, String value2) {
            addCriterion("daindongxihemen not between", value1, value2, "daindongxihemen");
            return (Criteria) this;
        }
        public Criteria andCehuamenIsNull() {
            addCriterion("cehuamen is null");
            return (Criteria) this;
        }
        public Criteria andCehuamenIsNotNull() {
            addCriterion("cehuamen is not null");
            return (Criteria) this;
        }
        public Criteria andCehuamenEqualTo(String value) {
            addCriterion("cehuamen =", value, "cehuamen");
            return (Criteria) this;
        }
        public Criteria andCehuamenNotEqualTo(String value) {
            addCriterion("cehuamen <>", value, "cehuamen");
            return (Criteria) this;
        }
        public Criteria andCehuamenGreaterThan(String value) {
            addCriterion("cehuamen >", value, "cehuamen");
            return (Criteria) this;
        }
        public Criteria andCehuamenGreaterThanOrEqualTo(String value) {
            addCriterion("cehuamen >=", value, "cehuamen");
            return (Criteria) this;
        }
        public Criteria andCehuamenLessThan(String value) {
            addCriterion("cehuamen <", value, "cehuamen");
            return (Criteria) this;
        }
        public Criteria andCehuamenLessThanOrEqualTo(String value) {
            addCriterion("cehuamen <=", value, "cehuamen");
            return (Criteria) this;
        }
        public Criteria andCehuamenLike(String value) {
            addCriterion("cehuamen like", value, "cehuamen");
            return (Criteria) this;
        }
        public Criteria andCehuamenNotLike(String value) {
            addCriterion("cehuamen not like", value, "cehuamen");
            return (Criteria) this;
        }
        public Criteria andCehuamenIn(List<String> values) {
            addCriterion("cehuamen in", values, "cehuamen");
            return (Criteria) this;
        }
        public Criteria andCehuamenNotIn(List<String> values) {
            addCriterion("cehuamen not in", values, "cehuamen");
            return (Criteria) this;
        }
        public Criteria andCehuamenBetween(String value1, String value2) {
            addCriterion("cehuamen between", value1, value2, "cehuamen");
            return (Criteria) this;
        }
        public Criteria andCehuamenNotBetween(String value1, String value2) {
            addCriterion("cehuamen not between", value1, value2, "cehuamen");
            return (Criteria) this;
        }
        public Criteria andDiandonghuobeixiangIsNull() {
            addCriterion("diandonghuobeixiang is null");
            return (Criteria) this;
        }
        public Criteria andDiandonghuobeixiangIsNotNull() {
            addCriterion("diandonghuobeixiang is not null");
            return (Criteria) this;
        }
        public Criteria andDiandonghuobeixiangEqualTo(String value) {
            addCriterion("diandonghuobeixiang =", value, "diandonghuobeixiang");
            return (Criteria) this;
        }
        public Criteria andDiandonghuobeixiangNotEqualTo(String value) {
            addCriterion("diandonghuobeixiang <>", value, "diandonghuobeixiang");
            return (Criteria) this;
        }
        public Criteria andDiandonghuobeixiangGreaterThan(String value) {
            addCriterion("diandonghuobeixiang >", value, "diandonghuobeixiang");
            return (Criteria) this;
        }
        public Criteria andDiandonghuobeixiangGreaterThanOrEqualTo(String value) {
            addCriterion("diandonghuobeixiang >=", value, "diandonghuobeixiang");
            return (Criteria) this;
        }
        public Criteria andDiandonghuobeixiangLessThan(String value) {
            addCriterion("diandonghuobeixiang <", value, "diandonghuobeixiang");
            return (Criteria) this;
        }
        public Criteria andDiandonghuobeixiangLessThanOrEqualTo(String value) {
            addCriterion("diandonghuobeixiang <=", value, "diandonghuobeixiang");
            return (Criteria) this;
        }
        public Criteria andDiandonghuobeixiangLike(String value) {
            addCriterion("diandonghuobeixiang like", value, "diandonghuobeixiang");
            return (Criteria) this;
        }
        public Criteria andDiandonghuobeixiangNotLike(String value) {
            addCriterion("diandonghuobeixiang not like", value, "diandonghuobeixiang");
            return (Criteria) this;
        }
        public Criteria andDiandonghuobeixiangIn(List<String> values) {
            addCriterion("diandonghuobeixiang in", values, "diandonghuobeixiang");
            return (Criteria) this;
        }
        public Criteria andDiandonghuobeixiangNotIn(List<String> values) {
            addCriterion("diandonghuobeixiang not in", values, "diandonghuobeixiang");
            return (Criteria) this;
        }
        public Criteria andDiandonghuobeixiangBetween(String value1, String value2) {
            addCriterion("diandonghuobeixiang between", value1, value2, "diandonghuobeixiang");
            return (Criteria) this;
        }
        public Criteria andDiandonghuobeixiangNotBetween(String value1, String value2) {
            addCriterion("diandonghuobeixiang not between", value1, value2, "diandonghuobeixiang");
            return (Criteria) this;
        }
        public Criteria andGanyinghoubeixingIsNull() {
            addCriterion("ganyinghoubeixing is null");
            return (Criteria) this;
        }
        public Criteria andGanyinghoubeixingIsNotNull() {
            addCriterion("ganyinghoubeixing is not null");
            return (Criteria) this;
        }
        public Criteria andGanyinghoubeixingEqualTo(String value) {
            addCriterion("ganyinghoubeixing =", value, "ganyinghoubeixing");
            return (Criteria) this;
        }
        public Criteria andGanyinghoubeixingNotEqualTo(String value) {
            addCriterion("ganyinghoubeixing <>", value, "ganyinghoubeixing");
            return (Criteria) this;
        }
        public Criteria andGanyinghoubeixingGreaterThan(String value) {
            addCriterion("ganyinghoubeixing >", value, "ganyinghoubeixing");
            return (Criteria) this;
        }
        public Criteria andGanyinghoubeixingGreaterThanOrEqualTo(String value) {
            addCriterion("ganyinghoubeixing >=", value, "ganyinghoubeixing");
            return (Criteria) this;
        }
        public Criteria andGanyinghoubeixingLessThan(String value) {
            addCriterion("ganyinghoubeixing <", value, "ganyinghoubeixing");
            return (Criteria) this;
        }
        public Criteria andGanyinghoubeixingLessThanOrEqualTo(String value) {
            addCriterion("ganyinghoubeixing <=", value, "ganyinghoubeixing");
            return (Criteria) this;
        }
        public Criteria andGanyinghoubeixingLike(String value) {
            addCriterion("ganyinghoubeixing like", value, "ganyinghoubeixing");
            return (Criteria) this;
        }
        public Criteria andGanyinghoubeixingNotLike(String value) {
            addCriterion("ganyinghoubeixing not like", value, "ganyinghoubeixing");
            return (Criteria) this;
        }
        public Criteria andGanyinghoubeixingIn(List<String> values) {
            addCriterion("ganyinghoubeixing in", values, "ganyinghoubeixing");
            return (Criteria) this;
        }
        public Criteria andGanyinghoubeixingNotIn(List<String> values) {
            addCriterion("ganyinghoubeixing not in", values, "ganyinghoubeixing");
            return (Criteria) this;
        }
        public Criteria andGanyinghoubeixingBetween(String value1, String value2) {
            addCriterion("ganyinghoubeixing between", value1, value2, "ganyinghoubeixing");
            return (Criteria) this;
        }
        public Criteria andGanyinghoubeixingNotBetween(String value1, String value2) {
            addCriterion("ganyinghoubeixing not between", value1, value2, "ganyinghoubeixing");
            return (Criteria) this;
        }
        public Criteria andChedingxinglijiaIsNull() {
            addCriterion("chedingxinglijia is null");
            return (Criteria) this;
        }
        public Criteria andChedingxinglijiaIsNotNull() {
            addCriterion("chedingxinglijia is not null");
            return (Criteria) this;
        }
        public Criteria andChedingxinglijiaEqualTo(String value) {
            addCriterion("chedingxinglijia =", value, "chedingxinglijia");
            return (Criteria) this;
        }
        public Criteria andChedingxinglijiaNotEqualTo(String value) {
            addCriterion("chedingxinglijia <>", value, "chedingxinglijia");
            return (Criteria) this;
        }
        public Criteria andChedingxinglijiaGreaterThan(String value) {
            addCriterion("chedingxinglijia >", value, "chedingxinglijia");
            return (Criteria) this;
        }
        public Criteria andChedingxinglijiaGreaterThanOrEqualTo(String value) {
            addCriterion("chedingxinglijia >=", value, "chedingxinglijia");
            return (Criteria) this;
        }
        public Criteria andChedingxinglijiaLessThan(String value) {
            addCriterion("chedingxinglijia <", value, "chedingxinglijia");
            return (Criteria) this;
        }
        public Criteria andChedingxinglijiaLessThanOrEqualTo(String value) {
            addCriterion("chedingxinglijia <=", value, "chedingxinglijia");
            return (Criteria) this;
        }
        public Criteria andChedingxinglijiaLike(String value) {
            addCriterion("chedingxinglijia like", value, "chedingxinglijia");
            return (Criteria) this;
        }
        public Criteria andChedingxinglijiaNotLike(String value) {
            addCriterion("chedingxinglijia not like", value, "chedingxinglijia");
            return (Criteria) this;
        }
        public Criteria andChedingxinglijiaIn(List<String> values) {
            addCriterion("chedingxinglijia in", values, "chedingxinglijia");
            return (Criteria) this;
        }
        public Criteria andChedingxinglijiaNotIn(List<String> values) {
            addCriterion("chedingxinglijia not in", values, "chedingxinglijia");
            return (Criteria) this;
        }
        public Criteria andChedingxinglijiaBetween(String value1, String value2) {
            addCriterion("chedingxinglijia between", value1, value2, "chedingxinglijia");
            return (Criteria) this;
        }
        public Criteria andChedingxinglijiaNotBetween(String value1, String value2) {
            addCriterion("chedingxinglijia not between", value1, value2, "chedingxinglijia");
            return (Criteria) this;
        }
        public Criteria andFadongjiadianzifangdaoIsNull() {
            addCriterion("fadongjiadianzifangdao is null");
            return (Criteria) this;
        }
        public Criteria andFadongjiadianzifangdaoIsNotNull() {
            addCriterion("fadongjiadianzifangdao is not null");
            return (Criteria) this;
        }
        public Criteria andFadongjiadianzifangdaoEqualTo(String value) {
            addCriterion("fadongjiadianzifangdao =", value, "fadongjiadianzifangdao");
            return (Criteria) this;
        }
        public Criteria andFadongjiadianzifangdaoNotEqualTo(String value) {
            addCriterion("fadongjiadianzifangdao <>", value, "fadongjiadianzifangdao");
            return (Criteria) this;
        }
        public Criteria andFadongjiadianzifangdaoGreaterThan(String value) {
            addCriterion("fadongjiadianzifangdao >", value, "fadongjiadianzifangdao");
            return (Criteria) this;
        }
        public Criteria andFadongjiadianzifangdaoGreaterThanOrEqualTo(String value) {
            addCriterion("fadongjiadianzifangdao >=", value, "fadongjiadianzifangdao");
            return (Criteria) this;
        }
        public Criteria andFadongjiadianzifangdaoLessThan(String value) {
            addCriterion("fadongjiadianzifangdao <", value, "fadongjiadianzifangdao");
            return (Criteria) this;
        }
        public Criteria andFadongjiadianzifangdaoLessThanOrEqualTo(String value) {
            addCriterion("fadongjiadianzifangdao <=", value, "fadongjiadianzifangdao");
            return (Criteria) this;
        }
        public Criteria andFadongjiadianzifangdaoLike(String value) {
            addCriterion("fadongjiadianzifangdao like", value, "fadongjiadianzifangdao");
            return (Criteria) this;
        }
        public Criteria andFadongjiadianzifangdaoNotLike(String value) {
            addCriterion("fadongjiadianzifangdao not like", value, "fadongjiadianzifangdao");
            return (Criteria) this;
        }
        public Criteria andFadongjiadianzifangdaoIn(List<String> values) {
            addCriterion("fadongjiadianzifangdao in", values, "fadongjiadianzifangdao");
            return (Criteria) this;
        }
        public Criteria andFadongjiadianzifangdaoNotIn(List<String> values) {
            addCriterion("fadongjiadianzifangdao not in", values, "fadongjiadianzifangdao");
            return (Criteria) this;
        }
        public Criteria andFadongjiadianzifangdaoBetween(String value1, String value2) {
            addCriterion("fadongjiadianzifangdao between", value1, value2, "fadongjiadianzifangdao");
            return (Criteria) this;
        }
        public Criteria andFadongjiadianzifangdaoNotBetween(String value1, String value2) {
            addCriterion("fadongjiadianzifangdao not between", value1, value2, "fadongjiadianzifangdao");
            return (Criteria) this;
        }
        public Criteria andChenenzhongkongsuoIsNull() {
            addCriterion("chenenzhongkongsuo is null");
            return (Criteria) this;
        }
        public Criteria andChenenzhongkongsuoIsNotNull() {
            addCriterion("chenenzhongkongsuo is not null");
            return (Criteria) this;
        }
        public Criteria andChenenzhongkongsuoEqualTo(String value) {
            addCriterion("chenenzhongkongsuo =", value, "chenenzhongkongsuo");
            return (Criteria) this;
        }
        public Criteria andChenenzhongkongsuoNotEqualTo(String value) {
            addCriterion("chenenzhongkongsuo <>", value, "chenenzhongkongsuo");
            return (Criteria) this;
        }
        public Criteria andChenenzhongkongsuoGreaterThan(String value) {
            addCriterion("chenenzhongkongsuo >", value, "chenenzhongkongsuo");
            return (Criteria) this;
        }
        public Criteria andChenenzhongkongsuoGreaterThanOrEqualTo(String value) {
            addCriterion("chenenzhongkongsuo >=", value, "chenenzhongkongsuo");
            return (Criteria) this;
        }
        public Criteria andChenenzhongkongsuoLessThan(String value) {
            addCriterion("chenenzhongkongsuo <", value, "chenenzhongkongsuo");
            return (Criteria) this;
        }
        public Criteria andChenenzhongkongsuoLessThanOrEqualTo(String value) {
            addCriterion("chenenzhongkongsuo <=", value, "chenenzhongkongsuo");
            return (Criteria) this;
        }
        public Criteria andChenenzhongkongsuoLike(String value) {
            addCriterion("chenenzhongkongsuo like", value, "chenenzhongkongsuo");
            return (Criteria) this;
        }
        public Criteria andChenenzhongkongsuoNotLike(String value) {
            addCriterion("chenenzhongkongsuo not like", value, "chenenzhongkongsuo");
            return (Criteria) this;
        }
        public Criteria andChenenzhongkongsuoIn(List<String> values) {
            addCriterion("chenenzhongkongsuo in", values, "chenenzhongkongsuo");
            return (Criteria) this;
        }
        public Criteria andChenenzhongkongsuoNotIn(List<String> values) {
            addCriterion("chenenzhongkongsuo not in", values, "chenenzhongkongsuo");
            return (Criteria) this;
        }
        public Criteria andChenenzhongkongsuoBetween(String value1, String value2) {
            addCriterion("chenenzhongkongsuo between", value1, value2, "chenenzhongkongsuo");
            return (Criteria) this;
        }
        public Criteria andChenenzhongkongsuoNotBetween(String value1, String value2) {
            addCriterion("chenenzhongkongsuo not between", value1, value2, "chenenzhongkongsuo");
            return (Criteria) this;
        }
        public Criteria andYaokongyaoshiIsNull() {
            addCriterion("yaokongyaoshi is null");
            return (Criteria) this;
        }
        public Criteria andYaokongyaoshiIsNotNull() {
            addCriterion("yaokongyaoshi is not null");
            return (Criteria) this;
        }
        public Criteria andYaokongyaoshiEqualTo(String value) {
            addCriterion("yaokongyaoshi =", value, "yaokongyaoshi");
            return (Criteria) this;
        }
        public Criteria andYaokongyaoshiNotEqualTo(String value) {
            addCriterion("yaokongyaoshi <>", value, "yaokongyaoshi");
            return (Criteria) this;
        }
        public Criteria andYaokongyaoshiGreaterThan(String value) {
            addCriterion("yaokongyaoshi >", value, "yaokongyaoshi");
            return (Criteria) this;
        }
        public Criteria andYaokongyaoshiGreaterThanOrEqualTo(String value) {
            addCriterion("yaokongyaoshi >=", value, "yaokongyaoshi");
            return (Criteria) this;
        }
        public Criteria andYaokongyaoshiLessThan(String value) {
            addCriterion("yaokongyaoshi <", value, "yaokongyaoshi");
            return (Criteria) this;
        }
        public Criteria andYaokongyaoshiLessThanOrEqualTo(String value) {
            addCriterion("yaokongyaoshi <=", value, "yaokongyaoshi");
            return (Criteria) this;
        }
        public Criteria andYaokongyaoshiLike(String value) {
            addCriterion("yaokongyaoshi like", value, "yaokongyaoshi");
            return (Criteria) this;
        }
        public Criteria andYaokongyaoshiNotLike(String value) {
            addCriterion("yaokongyaoshi not like", value, "yaokongyaoshi");
            return (Criteria) this;
        }
        public Criteria andYaokongyaoshiIn(List<String> values) {
            addCriterion("yaokongyaoshi in", values, "yaokongyaoshi");
            return (Criteria) this;
        }
        public Criteria andYaokongyaoshiNotIn(List<String> values) {
            addCriterion("yaokongyaoshi not in", values, "yaokongyaoshi");
            return (Criteria) this;
        }
        public Criteria andYaokongyaoshiBetween(String value1, String value2) {
            addCriterion("yaokongyaoshi between", value1, value2, "yaokongyaoshi");
            return (Criteria) this;
        }
        public Criteria andYaokongyaoshiNotBetween(String value1, String value2) {
            addCriterion("yaokongyaoshi not between", value1, value2, "yaokongyaoshi");
            return (Criteria) this;
        }
        public Criteria andWuyaoshiqidongxitongIsNull() {
            addCriterion("wuyaoshiqidongxitong is null");
            return (Criteria) this;
        }
        public Criteria andWuyaoshiqidongxitongIsNotNull() {
            addCriterion("wuyaoshiqidongxitong is not null");
            return (Criteria) this;
        }
        public Criteria andWuyaoshiqidongxitongEqualTo(String value) {
            addCriterion("wuyaoshiqidongxitong =", value, "wuyaoshiqidongxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshiqidongxitongNotEqualTo(String value) {
            addCriterion("wuyaoshiqidongxitong <>", value, "wuyaoshiqidongxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshiqidongxitongGreaterThan(String value) {
            addCriterion("wuyaoshiqidongxitong >", value, "wuyaoshiqidongxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshiqidongxitongGreaterThanOrEqualTo(String value) {
            addCriterion("wuyaoshiqidongxitong >=", value, "wuyaoshiqidongxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshiqidongxitongLessThan(String value) {
            addCriterion("wuyaoshiqidongxitong <", value, "wuyaoshiqidongxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshiqidongxitongLessThanOrEqualTo(String value) {
            addCriterion("wuyaoshiqidongxitong <=", value, "wuyaoshiqidongxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshiqidongxitongLike(String value) {
            addCriterion("wuyaoshiqidongxitong like", value, "wuyaoshiqidongxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshiqidongxitongNotLike(String value) {
            addCriterion("wuyaoshiqidongxitong not like", value, "wuyaoshiqidongxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshiqidongxitongIn(List<String> values) {
            addCriterion("wuyaoshiqidongxitong in", values, "wuyaoshiqidongxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshiqidongxitongNotIn(List<String> values) {
            addCriterion("wuyaoshiqidongxitong not in", values, "wuyaoshiqidongxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshiqidongxitongBetween(String value1, String value2) {
            addCriterion("wuyaoshiqidongxitong between", value1, value2, "wuyaoshiqidongxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshiqidongxitongNotBetween(String value1, String value2) {
            addCriterion("wuyaoshiqidongxitong not between", value1, value2, "wuyaoshiqidongxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshijinruxitongIsNull() {
            addCriterion("wuyaoshijinruxitong is null");
            return (Criteria) this;
        }
        public Criteria andWuyaoshijinruxitongIsNotNull() {
            addCriterion("wuyaoshijinruxitong is not null");
            return (Criteria) this;
        }
        public Criteria andWuyaoshijinruxitongEqualTo(String value) {
            addCriterion("wuyaoshijinruxitong =", value, "wuyaoshijinruxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshijinruxitongNotEqualTo(String value) {
            addCriterion("wuyaoshijinruxitong <>", value, "wuyaoshijinruxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshijinruxitongGreaterThan(String value) {
            addCriterion("wuyaoshijinruxitong >", value, "wuyaoshijinruxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshijinruxitongGreaterThanOrEqualTo(String value) {
            addCriterion("wuyaoshijinruxitong >=", value, "wuyaoshijinruxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshijinruxitongLessThan(String value) {
            addCriterion("wuyaoshijinruxitong <", value, "wuyaoshijinruxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshijinruxitongLessThanOrEqualTo(String value) {
            addCriterion("wuyaoshijinruxitong <=", value, "wuyaoshijinruxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshijinruxitongLike(String value) {
            addCriterion("wuyaoshijinruxitong like", value, "wuyaoshijinruxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshijinruxitongNotLike(String value) {
            addCriterion("wuyaoshijinruxitong not like", value, "wuyaoshijinruxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshijinruxitongIn(List<String> values) {
            addCriterion("wuyaoshijinruxitong in", values, "wuyaoshijinruxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshijinruxitongNotIn(List<String> values) {
            addCriterion("wuyaoshijinruxitong not in", values, "wuyaoshijinruxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshijinruxitongBetween(String value1, String value2) {
            addCriterion("wuyaoshijinruxitong between", value1, value2, "wuyaoshijinruxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshijinruxitongNotBetween(String value1, String value2) {
            addCriterion("wuyaoshijinruxitong not between", value1, value2, "wuyaoshijinruxitong");
            return (Criteria) this;
        }
        public Criteria andYuanchengqidongIsNull() {
            addCriterion("yuanchengqidong is null");
            return (Criteria) this;
        }
        public Criteria andYuanchengqidongIsNotNull() {
            addCriterion("yuanchengqidong is not null");
            return (Criteria) this;
        }
        public Criteria andYuanchengqidongEqualTo(String value) {
            addCriterion("yuanchengqidong =", value, "yuanchengqidong");
            return (Criteria) this;
        }
        public Criteria andYuanchengqidongNotEqualTo(String value) {
            addCriterion("yuanchengqidong <>", value, "yuanchengqidong");
            return (Criteria) this;
        }
        public Criteria andYuanchengqidongGreaterThan(String value) {
            addCriterion("yuanchengqidong >", value, "yuanchengqidong");
            return (Criteria) this;
        }
        public Criteria andYuanchengqidongGreaterThanOrEqualTo(String value) {
            addCriterion("yuanchengqidong >=", value, "yuanchengqidong");
            return (Criteria) this;
        }
        public Criteria andYuanchengqidongLessThan(String value) {
            addCriterion("yuanchengqidong <", value, "yuanchengqidong");
            return (Criteria) this;
        }
        public Criteria andYuanchengqidongLessThanOrEqualTo(String value) {
            addCriterion("yuanchengqidong <=", value, "yuanchengqidong");
            return (Criteria) this;
        }
        public Criteria andYuanchengqidongLike(String value) {
            addCriterion("yuanchengqidong like", value, "yuanchengqidong");
            return (Criteria) this;
        }
        public Criteria andYuanchengqidongNotLike(String value) {
            addCriterion("yuanchengqidong not like", value, "yuanchengqidong");
            return (Criteria) this;
        }
        public Criteria andYuanchengqidongIn(List<String> values) {
            addCriterion("yuanchengqidong in", values, "yuanchengqidong");
            return (Criteria) this;
        }
        public Criteria andYuanchengqidongNotIn(List<String> values) {
            addCriterion("yuanchengqidong not in", values, "yuanchengqidong");
            return (Criteria) this;
        }
        public Criteria andYuanchengqidongBetween(String value1, String value2) {
            addCriterion("yuanchengqidong between", value1, value2, "yuanchengqidong");
            return (Criteria) this;
        }
        public Criteria andYuanchengqidongNotBetween(String value1, String value2) {
            addCriterion("yuanchengqidong not between", value1, value2, "yuanchengqidong");
            return (Criteria) this;
        }
        public Criteria andPizhifangxiangpanIsNull() {
            addCriterion("pizhifangxiangpan is null");
            return (Criteria) this;
        }
        public Criteria andPizhifangxiangpanIsNotNull() {
            addCriterion("pizhifangxiangpan is not null");
            return (Criteria) this;
        }
        public Criteria andPizhifangxiangpanEqualTo(String value) {
            addCriterion("pizhifangxiangpan =", value, "pizhifangxiangpan");
            return (Criteria) this;
        }
        public Criteria andPizhifangxiangpanNotEqualTo(String value) {
            addCriterion("pizhifangxiangpan <>", value, "pizhifangxiangpan");
            return (Criteria) this;
        }
        public Criteria andPizhifangxiangpanGreaterThan(String value) {
            addCriterion("pizhifangxiangpan >", value, "pizhifangxiangpan");
            return (Criteria) this;
        }
        public Criteria andPizhifangxiangpanGreaterThanOrEqualTo(String value) {
            addCriterion("pizhifangxiangpan >=", value, "pizhifangxiangpan");
            return (Criteria) this;
        }
        public Criteria andPizhifangxiangpanLessThan(String value) {
            addCriterion("pizhifangxiangpan <", value, "pizhifangxiangpan");
            return (Criteria) this;
        }
        public Criteria andPizhifangxiangpanLessThanOrEqualTo(String value) {
            addCriterion("pizhifangxiangpan <=", value, "pizhifangxiangpan");
            return (Criteria) this;
        }
        public Criteria andPizhifangxiangpanLike(String value) {
            addCriterion("pizhifangxiangpan like", value, "pizhifangxiangpan");
            return (Criteria) this;
        }
        public Criteria andPizhifangxiangpanNotLike(String value) {
            addCriterion("pizhifangxiangpan not like", value, "pizhifangxiangpan");
            return (Criteria) this;
        }
        public Criteria andPizhifangxiangpanIn(List<String> values) {
            addCriterion("pizhifangxiangpan in", values, "pizhifangxiangpan");
            return (Criteria) this;
        }
        public Criteria andPizhifangxiangpanNotIn(List<String> values) {
            addCriterion("pizhifangxiangpan not in", values, "pizhifangxiangpan");
            return (Criteria) this;
        }
        public Criteria andPizhifangxiangpanBetween(String value1, String value2) {
            addCriterion("pizhifangxiangpan between", value1, value2, "pizhifangxiangpan");
            return (Criteria) this;
        }
        public Criteria andPizhifangxiangpanNotBetween(String value1, String value2) {
            addCriterion("pizhifangxiangpan not between", value1, value2, "pizhifangxiangpan");
            return (Criteria) this;
        }
        public Criteria andFangxiangpantiaojieqiIsNull() {
            addCriterion("fangxiangpantiaojieqi is null");
            return (Criteria) this;
        }
        public Criteria andFangxiangpantiaojieqiIsNotNull() {
            addCriterion("fangxiangpantiaojieqi is not null");
            return (Criteria) this;
        }
        public Criteria andFangxiangpantiaojieqiEqualTo(String value) {
            addCriterion("fangxiangpantiaojieqi =", value, "fangxiangpantiaojieqi");
            return (Criteria) this;
        }
        public Criteria andFangxiangpantiaojieqiNotEqualTo(String value) {
            addCriterion("fangxiangpantiaojieqi <>", value, "fangxiangpantiaojieqi");
            return (Criteria) this;
        }
        public Criteria andFangxiangpantiaojieqiGreaterThan(String value) {
            addCriterion("fangxiangpantiaojieqi >", value, "fangxiangpantiaojieqi");
            return (Criteria) this;
        }
        public Criteria andFangxiangpantiaojieqiGreaterThanOrEqualTo(String value) {
            addCriterion("fangxiangpantiaojieqi >=", value, "fangxiangpantiaojieqi");
            return (Criteria) this;
        }
        public Criteria andFangxiangpantiaojieqiLessThan(String value) {
            addCriterion("fangxiangpantiaojieqi <", value, "fangxiangpantiaojieqi");
            return (Criteria) this;
        }
        public Criteria andFangxiangpantiaojieqiLessThanOrEqualTo(String value) {
            addCriterion("fangxiangpantiaojieqi <=", value, "fangxiangpantiaojieqi");
            return (Criteria) this;
        }
        public Criteria andFangxiangpantiaojieqiLike(String value) {
            addCriterion("fangxiangpantiaojieqi like", value, "fangxiangpantiaojieqi");
            return (Criteria) this;
        }
        public Criteria andFangxiangpantiaojieqiNotLike(String value) {
            addCriterion("fangxiangpantiaojieqi not like", value, "fangxiangpantiaojieqi");
            return (Criteria) this;
        }
        public Criteria andFangxiangpantiaojieqiIn(List<String> values) {
            addCriterion("fangxiangpantiaojieqi in", values, "fangxiangpantiaojieqi");
            return (Criteria) this;
        }
        public Criteria andFangxiangpantiaojieqiNotIn(List<String> values) {
            addCriterion("fangxiangpantiaojieqi not in", values, "fangxiangpantiaojieqi");
            return (Criteria) this;
        }
        public Criteria andFangxiangpantiaojieqiBetween(String value1, String value2) {
            addCriterion("fangxiangpantiaojieqi between", value1, value2, "fangxiangpantiaojieqi");
            return (Criteria) this;
        }
        public Criteria andFangxiangpantiaojieqiNotBetween(String value1, String value2) {
            addCriterion("fangxiangpantiaojieqi not between", value1, value2, "fangxiangpantiaojieqi");
            return (Criteria) this;
        }
        public Criteria andFangxiangpandiandongtiaojieIsNull() {
            addCriterion("fangxiangpandiandongtiaojie is null");
            return (Criteria) this;
        }
        public Criteria andFangxiangpandiandongtiaojieIsNotNull() {
            addCriterion("fangxiangpandiandongtiaojie is not null");
            return (Criteria) this;
        }
        public Criteria andFangxiangpandiandongtiaojieEqualTo(String value) {
            addCriterion("fangxiangpandiandongtiaojie =", value, "fangxiangpandiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andFangxiangpandiandongtiaojieNotEqualTo(String value) {
            addCriterion("fangxiangpandiandongtiaojie <>", value, "fangxiangpandiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andFangxiangpandiandongtiaojieGreaterThan(String value) {
            addCriterion("fangxiangpandiandongtiaojie >", value, "fangxiangpandiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andFangxiangpandiandongtiaojieGreaterThanOrEqualTo(String value) {
            addCriterion("fangxiangpandiandongtiaojie >=", value, "fangxiangpandiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andFangxiangpandiandongtiaojieLessThan(String value) {
            addCriterion("fangxiangpandiandongtiaojie <", value, "fangxiangpandiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andFangxiangpandiandongtiaojieLessThanOrEqualTo(String value) {
            addCriterion("fangxiangpandiandongtiaojie <=", value, "fangxiangpandiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andFangxiangpandiandongtiaojieLike(String value) {
            addCriterion("fangxiangpandiandongtiaojie like", value, "fangxiangpandiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andFangxiangpandiandongtiaojieNotLike(String value) {
            addCriterion("fangxiangpandiandongtiaojie not like", value, "fangxiangpandiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andFangxiangpandiandongtiaojieIn(List<String> values) {
            addCriterion("fangxiangpandiandongtiaojie in", values, "fangxiangpandiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andFangxiangpandiandongtiaojieNotIn(List<String> values) {
            addCriterion("fangxiangpandiandongtiaojie not in", values, "fangxiangpandiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andFangxiangpandiandongtiaojieBetween(String value1, String value2) {
            addCriterion("fangxiangpandiandongtiaojie between", value1, value2, "fangxiangpandiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andFangxiangpandiandongtiaojieNotBetween(String value1, String value2) {
            addCriterion("fangxiangpandiandongtiaojie not between", value1, value2, "fangxiangpandiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andDuogongnnegfangxiangpanIsNull() {
            addCriterion("duogongnnegfangxiangpan is null");
            return (Criteria) this;
        }
        public Criteria andDuogongnnegfangxiangpanIsNotNull() {
            addCriterion("duogongnnegfangxiangpan is not null");
            return (Criteria) this;
        }
        public Criteria andDuogongnnegfangxiangpanEqualTo(String value) {
            addCriterion("duogongnnegfangxiangpan =", value, "duogongnnegfangxiangpan");
            return (Criteria) this;
        }
        public Criteria andDuogongnnegfangxiangpanNotEqualTo(String value) {
            addCriterion("duogongnnegfangxiangpan <>", value, "duogongnnegfangxiangpan");
            return (Criteria) this;
        }
        public Criteria andDuogongnnegfangxiangpanGreaterThan(String value) {
            addCriterion("duogongnnegfangxiangpan >", value, "duogongnnegfangxiangpan");
            return (Criteria) this;
        }
        public Criteria andDuogongnnegfangxiangpanGreaterThanOrEqualTo(String value) {
            addCriterion("duogongnnegfangxiangpan >=", value, "duogongnnegfangxiangpan");
            return (Criteria) this;
        }
        public Criteria andDuogongnnegfangxiangpanLessThan(String value) {
            addCriterion("duogongnnegfangxiangpan <", value, "duogongnnegfangxiangpan");
            return (Criteria) this;
        }
        public Criteria andDuogongnnegfangxiangpanLessThanOrEqualTo(String value) {
            addCriterion("duogongnnegfangxiangpan <=", value, "duogongnnegfangxiangpan");
            return (Criteria) this;
        }
        public Criteria andDuogongnnegfangxiangpanLike(String value) {
            addCriterion("duogongnnegfangxiangpan like", value, "duogongnnegfangxiangpan");
            return (Criteria) this;
        }
        public Criteria andDuogongnnegfangxiangpanNotLike(String value) {
            addCriterion("duogongnnegfangxiangpan not like", value, "duogongnnegfangxiangpan");
            return (Criteria) this;
        }
        public Criteria andDuogongnnegfangxiangpanIn(List<String> values) {
            addCriterion("duogongnnegfangxiangpan in", values, "duogongnnegfangxiangpan");
            return (Criteria) this;
        }
        public Criteria andDuogongnnegfangxiangpanNotIn(List<String> values) {
            addCriterion("duogongnnegfangxiangpan not in", values, "duogongnnegfangxiangpan");
            return (Criteria) this;
        }
        public Criteria andDuogongnnegfangxiangpanBetween(String value1, String value2) {
            addCriterion("duogongnnegfangxiangpan between", value1, value2, "duogongnnegfangxiangpan");
            return (Criteria) this;
        }
        public Criteria andDuogongnnegfangxiangpanNotBetween(String value1, String value2) {
            addCriterion("duogongnnegfangxiangpan not between", value1, value2, "duogongnnegfangxiangpan");
            return (Criteria) this;
        }
        public Criteria andFxp_huandangIsNull() {
            addCriterion("fxp_huandang is null");
            return (Criteria) this;
        }
        public Criteria andFxp_huandangIsNotNull() {
            addCriterion("fxp_huandang is not null");
            return (Criteria) this;
        }
        public Criteria andFxp_huandangEqualTo(String value) {
            addCriterion("fxp_huandang =", value, "fxp_huandang");
            return (Criteria) this;
        }
        public Criteria andFxp_huandangNotEqualTo(String value) {
            addCriterion("fxp_huandang <>", value, "fxp_huandang");
            return (Criteria) this;
        }
        public Criteria andFxp_huandangGreaterThan(String value) {
            addCriterion("fxp_huandang >", value, "fxp_huandang");
            return (Criteria) this;
        }
        public Criteria andFxp_huandangGreaterThanOrEqualTo(String value) {
            addCriterion("fxp_huandang >=", value, "fxp_huandang");
            return (Criteria) this;
        }
        public Criteria andFxp_huandangLessThan(String value) {
            addCriterion("fxp_huandang <", value, "fxp_huandang");
            return (Criteria) this;
        }
        public Criteria andFxp_huandangLessThanOrEqualTo(String value) {
            addCriterion("fxp_huandang <=", value, "fxp_huandang");
            return (Criteria) this;
        }
        public Criteria andFxp_huandangLike(String value) {
            addCriterion("fxp_huandang like", value, "fxp_huandang");
            return (Criteria) this;
        }
        public Criteria andFxp_huandangNotLike(String value) {
            addCriterion("fxp_huandang not like", value, "fxp_huandang");
            return (Criteria) this;
        }
        public Criteria andFxp_huandangIn(List<String> values) {
            addCriterion("fxp_huandang in", values, "fxp_huandang");
            return (Criteria) this;
        }
        public Criteria andFxp_huandangNotIn(List<String> values) {
            addCriterion("fxp_huandang not in", values, "fxp_huandang");
            return (Criteria) this;
        }
        public Criteria andFxp_huandangBetween(String value1, String value2) {
            addCriterion("fxp_huandang between", value1, value2, "fxp_huandang");
            return (Criteria) this;
        }
        public Criteria andFxp_huandangNotBetween(String value1, String value2) {
            addCriterion("fxp_huandang not between", value1, value2, "fxp_huandang");
            return (Criteria) this;
        }
        public Criteria andFxp_jiareIsNull() {
            addCriterion("fxp_jiare is null");
            return (Criteria) this;
        }
        public Criteria andFxp_jiareIsNotNull() {
            addCriterion("fxp_jiare is not null");
            return (Criteria) this;
        }
        public Criteria andFxp_jiareEqualTo(String value) {
            addCriterion("fxp_jiare =", value, "fxp_jiare");
            return (Criteria) this;
        }
        public Criteria andFxp_jiareNotEqualTo(String value) {
            addCriterion("fxp_jiare <>", value, "fxp_jiare");
            return (Criteria) this;
        }
        public Criteria andFxp_jiareGreaterThan(String value) {
            addCriterion("fxp_jiare >", value, "fxp_jiare");
            return (Criteria) this;
        }
        public Criteria andFxp_jiareGreaterThanOrEqualTo(String value) {
            addCriterion("fxp_jiare >=", value, "fxp_jiare");
            return (Criteria) this;
        }
        public Criteria andFxp_jiareLessThan(String value) {
            addCriterion("fxp_jiare <", value, "fxp_jiare");
            return (Criteria) this;
        }
        public Criteria andFxp_jiareLessThanOrEqualTo(String value) {
            addCriterion("fxp_jiare <=", value, "fxp_jiare");
            return (Criteria) this;
        }
        public Criteria andFxp_jiareLike(String value) {
            addCriterion("fxp_jiare like", value, "fxp_jiare");
            return (Criteria) this;
        }
        public Criteria andFxp_jiareNotLike(String value) {
            addCriterion("fxp_jiare not like", value, "fxp_jiare");
            return (Criteria) this;
        }
        public Criteria andFxp_jiareIn(List<String> values) {
            addCriterion("fxp_jiare in", values, "fxp_jiare");
            return (Criteria) this;
        }
        public Criteria andFxp_jiareNotIn(List<String> values) {
            addCriterion("fxp_jiare not in", values, "fxp_jiare");
            return (Criteria) this;
        }
        public Criteria andFxp_jiareBetween(String value1, String value2) {
            addCriterion("fxp_jiare between", value1, value2, "fxp_jiare");
            return (Criteria) this;
        }
        public Criteria andFxp_jiareNotBetween(String value1, String value2) {
            addCriterion("fxp_jiare not between", value1, value2, "fxp_jiare");
            return (Criteria) this;
        }
        public Criteria andFxp_jiyiIsNull() {
            addCriterion("fxp_jiyi is null");
            return (Criteria) this;
        }
        public Criteria andFxp_jiyiIsNotNull() {
            addCriterion("fxp_jiyi is not null");
            return (Criteria) this;
        }
        public Criteria andFxp_jiyiEqualTo(String value) {
            addCriterion("fxp_jiyi =", value, "fxp_jiyi");
            return (Criteria) this;
        }
        public Criteria andFxp_jiyiNotEqualTo(String value) {
            addCriterion("fxp_jiyi <>", value, "fxp_jiyi");
            return (Criteria) this;
        }
        public Criteria andFxp_jiyiGreaterThan(String value) {
            addCriterion("fxp_jiyi >", value, "fxp_jiyi");
            return (Criteria) this;
        }
        public Criteria andFxp_jiyiGreaterThanOrEqualTo(String value) {
            addCriterion("fxp_jiyi >=", value, "fxp_jiyi");
            return (Criteria) this;
        }
        public Criteria andFxp_jiyiLessThan(String value) {
            addCriterion("fxp_jiyi <", value, "fxp_jiyi");
            return (Criteria) this;
        }
        public Criteria andFxp_jiyiLessThanOrEqualTo(String value) {
            addCriterion("fxp_jiyi <=", value, "fxp_jiyi");
            return (Criteria) this;
        }
        public Criteria andFxp_jiyiLike(String value) {
            addCriterion("fxp_jiyi like", value, "fxp_jiyi");
            return (Criteria) this;
        }
        public Criteria andFxp_jiyiNotLike(String value) {
            addCriterion("fxp_jiyi not like", value, "fxp_jiyi");
            return (Criteria) this;
        }
        public Criteria andFxp_jiyiIn(List<String> values) {
            addCriterion("fxp_jiyi in", values, "fxp_jiyi");
            return (Criteria) this;
        }
        public Criteria andFxp_jiyiNotIn(List<String> values) {
            addCriterion("fxp_jiyi not in", values, "fxp_jiyi");
            return (Criteria) this;
        }
        public Criteria andFxp_jiyiBetween(String value1, String value2) {
            addCriterion("fxp_jiyi between", value1, value2, "fxp_jiyi");
            return (Criteria) this;
        }
        public Criteria andFxp_jiyiNotBetween(String value1, String value2) {
            addCriterion("fxp_jiyi not between", value1, value2, "fxp_jiyi");
            return (Criteria) this;
        }
        public Criteria andDainnaoxianshipingIsNull() {
            addCriterion("dainnaoxianshiping is null");
            return (Criteria) this;
        }
        public Criteria andDainnaoxianshipingIsNotNull() {
            addCriterion("dainnaoxianshiping is not null");
            return (Criteria) this;
        }
        public Criteria andDainnaoxianshipingEqualTo(String value) {
            addCriterion("dainnaoxianshiping =", value, "dainnaoxianshiping");
            return (Criteria) this;
        }
        public Criteria andDainnaoxianshipingNotEqualTo(String value) {
            addCriterion("dainnaoxianshiping <>", value, "dainnaoxianshiping");
            return (Criteria) this;
        }
        public Criteria andDainnaoxianshipingGreaterThan(String value) {
            addCriterion("dainnaoxianshiping >", value, "dainnaoxianshiping");
            return (Criteria) this;
        }
        public Criteria andDainnaoxianshipingGreaterThanOrEqualTo(String value) {
            addCriterion("dainnaoxianshiping >=", value, "dainnaoxianshiping");
            return (Criteria) this;
        }
        public Criteria andDainnaoxianshipingLessThan(String value) {
            addCriterion("dainnaoxianshiping <", value, "dainnaoxianshiping");
            return (Criteria) this;
        }
        public Criteria andDainnaoxianshipingLessThanOrEqualTo(String value) {
            addCriterion("dainnaoxianshiping <=", value, "dainnaoxianshiping");
            return (Criteria) this;
        }
        public Criteria andDainnaoxianshipingLike(String value) {
            addCriterion("dainnaoxianshiping like", value, "dainnaoxianshiping");
            return (Criteria) this;
        }
        public Criteria andDainnaoxianshipingNotLike(String value) {
            addCriterion("dainnaoxianshiping not like", value, "dainnaoxianshiping");
            return (Criteria) this;
        }
        public Criteria andDainnaoxianshipingIn(List<String> values) {
            addCriterion("dainnaoxianshiping in", values, "dainnaoxianshiping");
            return (Criteria) this;
        }
        public Criteria andDainnaoxianshipingNotIn(List<String> values) {
            addCriterion("dainnaoxianshiping not in", values, "dainnaoxianshiping");
            return (Criteria) this;
        }
        public Criteria andDainnaoxianshipingBetween(String value1, String value2) {
            addCriterion("dainnaoxianshiping between", value1, value2, "dainnaoxianshiping");
            return (Criteria) this;
        }
        public Criteria andDainnaoxianshipingNotBetween(String value1, String value2) {
            addCriterion("dainnaoxianshiping not between", value1, value2, "dainnaoxianshiping");
            return (Criteria) this;
        }
        public Criteria andYiejingyibiaopanIsNull() {
            addCriterion("yiejingyibiaopan is null");
            return (Criteria) this;
        }
        public Criteria andYiejingyibiaopanIsNotNull() {
            addCriterion("yiejingyibiaopan is not null");
            return (Criteria) this;
        }
        public Criteria andYiejingyibiaopanEqualTo(String value) {
            addCriterion("yiejingyibiaopan =", value, "yiejingyibiaopan");
            return (Criteria) this;
        }
        public Criteria andYiejingyibiaopanNotEqualTo(String value) {
            addCriterion("yiejingyibiaopan <>", value, "yiejingyibiaopan");
            return (Criteria) this;
        }
        public Criteria andYiejingyibiaopanGreaterThan(String value) {
            addCriterion("yiejingyibiaopan >", value, "yiejingyibiaopan");
            return (Criteria) this;
        }
        public Criteria andYiejingyibiaopanGreaterThanOrEqualTo(String value) {
            addCriterion("yiejingyibiaopan >=", value, "yiejingyibiaopan");
            return (Criteria) this;
        }
        public Criteria andYiejingyibiaopanLessThan(String value) {
            addCriterion("yiejingyibiaopan <", value, "yiejingyibiaopan");
            return (Criteria) this;
        }
        public Criteria andYiejingyibiaopanLessThanOrEqualTo(String value) {
            addCriterion("yiejingyibiaopan <=", value, "yiejingyibiaopan");
            return (Criteria) this;
        }
        public Criteria andYiejingyibiaopanLike(String value) {
            addCriterion("yiejingyibiaopan like", value, "yiejingyibiaopan");
            return (Criteria) this;
        }
        public Criteria andYiejingyibiaopanNotLike(String value) {
            addCriterion("yiejingyibiaopan not like", value, "yiejingyibiaopan");
            return (Criteria) this;
        }
        public Criteria andYiejingyibiaopanIn(List<String> values) {
            addCriterion("yiejingyibiaopan in", values, "yiejingyibiaopan");
            return (Criteria) this;
        }
        public Criteria andYiejingyibiaopanNotIn(List<String> values) {
            addCriterion("yiejingyibiaopan not in", values, "yiejingyibiaopan");
            return (Criteria) this;
        }
        public Criteria andYiejingyibiaopanBetween(String value1, String value2) {
            addCriterion("yiejingyibiaopan between", value1, value2, "yiejingyibiaopan");
            return (Criteria) this;
        }
        public Criteria andYiejingyibiaopanNotBetween(String value1, String value2) {
            addCriterion("yiejingyibiaopan not between", value1, value2, "yiejingyibiaopan");
            return (Criteria) this;
        }
        public Criteria andHUDIsNull() {
            addCriterion("HUD is null");
            return (Criteria) this;
        }
        public Criteria andHUDIsNotNull() {
            addCriterion("HUD is not null");
            return (Criteria) this;
        }
        public Criteria andHUDEqualTo(String value) {
            addCriterion("HUD =", value, "HUD");
            return (Criteria) this;
        }
        public Criteria andHUDNotEqualTo(String value) {
            addCriterion("HUD <>", value, "HUD");
            return (Criteria) this;
        }
        public Criteria andHUDGreaterThan(String value) {
            addCriterion("HUD >", value, "HUD");
            return (Criteria) this;
        }
        public Criteria andHUDGreaterThanOrEqualTo(String value) {
            addCriterion("HUD >=", value, "HUD");
            return (Criteria) this;
        }
        public Criteria andHUDLessThan(String value) {
            addCriterion("HUD <", value, "HUD");
            return (Criteria) this;
        }
        public Criteria andHUDLessThanOrEqualTo(String value) {
            addCriterion("HUD <=", value, "HUD");
            return (Criteria) this;
        }
        public Criteria andHUDLike(String value) {
            addCriterion("HUD like", value, "HUD");
            return (Criteria) this;
        }
        public Criteria andHUDNotLike(String value) {
            addCriterion("HUD not like", value, "HUD");
            return (Criteria) this;
        }
        public Criteria andHUDIn(List<String> values) {
            addCriterion("HUD in", values, "HUD");
            return (Criteria) this;
        }
        public Criteria andHUDNotIn(List<String> values) {
            addCriterion("HUD not in", values, "HUD");
            return (Criteria) this;
        }
        public Criteria andHUDBetween(String value1, String value2) {
            addCriterion("HUD between", value1, value2, "HUD");
            return (Criteria) this;
        }
        public Criteria andHUDNotBetween(String value1, String value2) {
            addCriterion("HUD not between", value1, value2, "HUD");
            return (Criteria) this;
        }
        public Criteria andNenzhixingchejiluyiIsNull() {
            addCriterion("nenzhixingchejiluyi is null");
            return (Criteria) this;
        }
        public Criteria andNenzhixingchejiluyiIsNotNull() {
            addCriterion("nenzhixingchejiluyi is not null");
            return (Criteria) this;
        }
        public Criteria andNenzhixingchejiluyiEqualTo(String value) {
            addCriterion("nenzhixingchejiluyi =", value, "nenzhixingchejiluyi");
            return (Criteria) this;
        }
        public Criteria andNenzhixingchejiluyiNotEqualTo(String value) {
            addCriterion("nenzhixingchejiluyi <>", value, "nenzhixingchejiluyi");
            return (Criteria) this;
        }
        public Criteria andNenzhixingchejiluyiGreaterThan(String value) {
            addCriterion("nenzhixingchejiluyi >", value, "nenzhixingchejiluyi");
            return (Criteria) this;
        }
        public Criteria andNenzhixingchejiluyiGreaterThanOrEqualTo(String value) {
            addCriterion("nenzhixingchejiluyi >=", value, "nenzhixingchejiluyi");
            return (Criteria) this;
        }
        public Criteria andNenzhixingchejiluyiLessThan(String value) {
            addCriterion("nenzhixingchejiluyi <", value, "nenzhixingchejiluyi");
            return (Criteria) this;
        }
        public Criteria andNenzhixingchejiluyiLessThanOrEqualTo(String value) {
            addCriterion("nenzhixingchejiluyi <=", value, "nenzhixingchejiluyi");
            return (Criteria) this;
        }
        public Criteria andNenzhixingchejiluyiLike(String value) {
            addCriterion("nenzhixingchejiluyi like", value, "nenzhixingchejiluyi");
            return (Criteria) this;
        }
        public Criteria andNenzhixingchejiluyiNotLike(String value) {
            addCriterion("nenzhixingchejiluyi not like", value, "nenzhixingchejiluyi");
            return (Criteria) this;
        }
        public Criteria andNenzhixingchejiluyiIn(List<String> values) {
            addCriterion("nenzhixingchejiluyi in", values, "nenzhixingchejiluyi");
            return (Criteria) this;
        }
        public Criteria andNenzhixingchejiluyiNotIn(List<String> values) {
            addCriterion("nenzhixingchejiluyi not in", values, "nenzhixingchejiluyi");
            return (Criteria) this;
        }
        public Criteria andNenzhixingchejiluyiBetween(String value1, String value2) {
            addCriterion("nenzhixingchejiluyi between", value1, value2, "nenzhixingchejiluyi");
            return (Criteria) this;
        }
        public Criteria andNenzhixingchejiluyiNotBetween(String value1, String value2) {
            addCriterion("nenzhixingchejiluyi not between", value1, value2, "nenzhixingchejiluyi");
            return (Criteria) this;
        }
        public Criteria andZhudongjiangzaoIsNull() {
            addCriterion("zhudongjiangzao is null");
            return (Criteria) this;
        }
        public Criteria andZhudongjiangzaoIsNotNull() {
            addCriterion("zhudongjiangzao is not null");
            return (Criteria) this;
        }
        public Criteria andZhudongjiangzaoEqualTo(String value) {
            addCriterion("zhudongjiangzao =", value, "zhudongjiangzao");
            return (Criteria) this;
        }
        public Criteria andZhudongjiangzaoNotEqualTo(String value) {
            addCriterion("zhudongjiangzao <>", value, "zhudongjiangzao");
            return (Criteria) this;
        }
        public Criteria andZhudongjiangzaoGreaterThan(String value) {
            addCriterion("zhudongjiangzao >", value, "zhudongjiangzao");
            return (Criteria) this;
        }
        public Criteria andZhudongjiangzaoGreaterThanOrEqualTo(String value) {
            addCriterion("zhudongjiangzao >=", value, "zhudongjiangzao");
            return (Criteria) this;
        }
        public Criteria andZhudongjiangzaoLessThan(String value) {
            addCriterion("zhudongjiangzao <", value, "zhudongjiangzao");
            return (Criteria) this;
        }
        public Criteria andZhudongjiangzaoLessThanOrEqualTo(String value) {
            addCriterion("zhudongjiangzao <=", value, "zhudongjiangzao");
            return (Criteria) this;
        }
        public Criteria andZhudongjiangzaoLike(String value) {
            addCriterion("zhudongjiangzao like", value, "zhudongjiangzao");
            return (Criteria) this;
        }
        public Criteria andZhudongjiangzaoNotLike(String value) {
            addCriterion("zhudongjiangzao not like", value, "zhudongjiangzao");
            return (Criteria) this;
        }
        public Criteria andZhudongjiangzaoIn(List<String> values) {
            addCriterion("zhudongjiangzao in", values, "zhudongjiangzao");
            return (Criteria) this;
        }
        public Criteria andZhudongjiangzaoNotIn(List<String> values) {
            addCriterion("zhudongjiangzao not in", values, "zhudongjiangzao");
            return (Criteria) this;
        }
        public Criteria andZhudongjiangzaoBetween(String value1, String value2) {
            addCriterion("zhudongjiangzao between", value1, value2, "zhudongjiangzao");
            return (Criteria) this;
        }
        public Criteria andZhudongjiangzaoNotBetween(String value1, String value2) {
            addCriterion("zhudongjiangzao not between", value1, value2, "zhudongjiangzao");
            return (Criteria) this;
        }
        public Criteria andShoujiwuxianchengdianIsNull() {
            addCriterion("shoujiwuxianchengdian is null");
            return (Criteria) this;
        }
        public Criteria andShoujiwuxianchengdianIsNotNull() {
            addCriterion("shoujiwuxianchengdian is not null");
            return (Criteria) this;
        }
        public Criteria andShoujiwuxianchengdianEqualTo(String value) {
            addCriterion("shoujiwuxianchengdian =", value, "shoujiwuxianchengdian");
            return (Criteria) this;
        }
        public Criteria andShoujiwuxianchengdianNotEqualTo(String value) {
            addCriterion("shoujiwuxianchengdian <>", value, "shoujiwuxianchengdian");
            return (Criteria) this;
        }
        public Criteria andShoujiwuxianchengdianGreaterThan(String value) {
            addCriterion("shoujiwuxianchengdian >", value, "shoujiwuxianchengdian");
            return (Criteria) this;
        }
        public Criteria andShoujiwuxianchengdianGreaterThanOrEqualTo(String value) {
            addCriterion("shoujiwuxianchengdian >=", value, "shoujiwuxianchengdian");
            return (Criteria) this;
        }
        public Criteria andShoujiwuxianchengdianLessThan(String value) {
            addCriterion("shoujiwuxianchengdian <", value, "shoujiwuxianchengdian");
            return (Criteria) this;
        }
        public Criteria andShoujiwuxianchengdianLessThanOrEqualTo(String value) {
            addCriterion("shoujiwuxianchengdian <=", value, "shoujiwuxianchengdian");
            return (Criteria) this;
        }
        public Criteria andShoujiwuxianchengdianLike(String value) {
            addCriterion("shoujiwuxianchengdian like", value, "shoujiwuxianchengdian");
            return (Criteria) this;
        }
        public Criteria andShoujiwuxianchengdianNotLike(String value) {
            addCriterion("shoujiwuxianchengdian not like", value, "shoujiwuxianchengdian");
            return (Criteria) this;
        }
        public Criteria andShoujiwuxianchengdianIn(List<String> values) {
            addCriterion("shoujiwuxianchengdian in", values, "shoujiwuxianchengdian");
            return (Criteria) this;
        }
        public Criteria andShoujiwuxianchengdianNotIn(List<String> values) {
            addCriterion("shoujiwuxianchengdian not in", values, "shoujiwuxianchengdian");
            return (Criteria) this;
        }
        public Criteria andShoujiwuxianchengdianBetween(String value1, String value2) {
            addCriterion("shoujiwuxianchengdian between", value1, value2, "shoujiwuxianchengdian");
            return (Criteria) this;
        }
        public Criteria andShoujiwuxianchengdianNotBetween(String value1, String value2) {
            addCriterion("shoujiwuxianchengdian not between", value1, value2, "shoujiwuxianchengdian");
            return (Criteria) this;
        }
        public Criteria andZuoyicaizhiIsNull() {
            addCriterion("zuoyicaizhi is null");
            return (Criteria) this;
        }
        public Criteria andZuoyicaizhiIsNotNull() {
            addCriterion("zuoyicaizhi is not null");
            return (Criteria) this;
        }
        public Criteria andZuoyicaizhiEqualTo(String value) {
            addCriterion("zuoyicaizhi =", value, "zuoyicaizhi");
            return (Criteria) this;
        }
        public Criteria andZuoyicaizhiNotEqualTo(String value) {
            addCriterion("zuoyicaizhi <>", value, "zuoyicaizhi");
            return (Criteria) this;
        }
        public Criteria andZuoyicaizhiGreaterThan(String value) {
            addCriterion("zuoyicaizhi >", value, "zuoyicaizhi");
            return (Criteria) this;
        }
        public Criteria andZuoyicaizhiGreaterThanOrEqualTo(String value) {
            addCriterion("zuoyicaizhi >=", value, "zuoyicaizhi");
            return (Criteria) this;
        }
        public Criteria andZuoyicaizhiLessThan(String value) {
            addCriterion("zuoyicaizhi <", value, "zuoyicaizhi");
            return (Criteria) this;
        }
        public Criteria andZuoyicaizhiLessThanOrEqualTo(String value) {
            addCriterion("zuoyicaizhi <=", value, "zuoyicaizhi");
            return (Criteria) this;
        }
        public Criteria andZuoyicaizhiLike(String value) {
            addCriterion("zuoyicaizhi like", value, "zuoyicaizhi");
            return (Criteria) this;
        }
        public Criteria andZuoyicaizhiNotLike(String value) {
            addCriterion("zuoyicaizhi not like", value, "zuoyicaizhi");
            return (Criteria) this;
        }
        public Criteria andZuoyicaizhiIn(List<String> values) {
            addCriterion("zuoyicaizhi in", values, "zuoyicaizhi");
            return (Criteria) this;
        }
        public Criteria andZuoyicaizhiNotIn(List<String> values) {
            addCriterion("zuoyicaizhi not in", values, "zuoyicaizhi");
            return (Criteria) this;
        }
        public Criteria andZuoyicaizhiBetween(String value1, String value2) {
            addCriterion("zuoyicaizhi between", value1, value2, "zuoyicaizhi");
            return (Criteria) this;
        }
        public Criteria andZuoyicaizhiNotBetween(String value1, String value2) {
            addCriterion("zuoyicaizhi not between", value1, value2, "zuoyicaizhi");
            return (Criteria) this;
        }
        public Criteria andYongdongfenggezuoyiIsNull() {
            addCriterion("yongdongfenggezuoyi is null");
            return (Criteria) this;
        }
        public Criteria andYongdongfenggezuoyiIsNotNull() {
            addCriterion("yongdongfenggezuoyi is not null");
            return (Criteria) this;
        }
        public Criteria andYongdongfenggezuoyiEqualTo(String value) {
            addCriterion("yongdongfenggezuoyi =", value, "yongdongfenggezuoyi");
            return (Criteria) this;
        }
        public Criteria andYongdongfenggezuoyiNotEqualTo(String value) {
            addCriterion("yongdongfenggezuoyi <>", value, "yongdongfenggezuoyi");
            return (Criteria) this;
        }
        public Criteria andYongdongfenggezuoyiGreaterThan(String value) {
            addCriterion("yongdongfenggezuoyi >", value, "yongdongfenggezuoyi");
            return (Criteria) this;
        }
        public Criteria andYongdongfenggezuoyiGreaterThanOrEqualTo(String value) {
            addCriterion("yongdongfenggezuoyi >=", value, "yongdongfenggezuoyi");
            return (Criteria) this;
        }
        public Criteria andYongdongfenggezuoyiLessThan(String value) {
            addCriterion("yongdongfenggezuoyi <", value, "yongdongfenggezuoyi");
            return (Criteria) this;
        }
        public Criteria andYongdongfenggezuoyiLessThanOrEqualTo(String value) {
            addCriterion("yongdongfenggezuoyi <=", value, "yongdongfenggezuoyi");
            return (Criteria) this;
        }
        public Criteria andYongdongfenggezuoyiLike(String value) {
            addCriterion("yongdongfenggezuoyi like", value, "yongdongfenggezuoyi");
            return (Criteria) this;
        }
        public Criteria andYongdongfenggezuoyiNotLike(String value) {
            addCriterion("yongdongfenggezuoyi not like", value, "yongdongfenggezuoyi");
            return (Criteria) this;
        }
        public Criteria andYongdongfenggezuoyiIn(List<String> values) {
            addCriterion("yongdongfenggezuoyi in", values, "yongdongfenggezuoyi");
            return (Criteria) this;
        }
        public Criteria andYongdongfenggezuoyiNotIn(List<String> values) {
            addCriterion("yongdongfenggezuoyi not in", values, "yongdongfenggezuoyi");
            return (Criteria) this;
        }
        public Criteria andYongdongfenggezuoyiBetween(String value1, String value2) {
            addCriterion("yongdongfenggezuoyi between", value1, value2, "yongdongfenggezuoyi");
            return (Criteria) this;
        }
        public Criteria andYongdongfenggezuoyiNotBetween(String value1, String value2) {
            addCriterion("yongdongfenggezuoyi not between", value1, value2, "yongdongfenggezuoyi");
            return (Criteria) this;
        }
        public Criteria andZuoyigaoditiaojieIsNull() {
            addCriterion("zuoyigaoditiaojie is null");
            return (Criteria) this;
        }
        public Criteria andZuoyigaoditiaojieIsNotNull() {
            addCriterion("zuoyigaoditiaojie is not null");
            return (Criteria) this;
        }
        public Criteria andZuoyigaoditiaojieEqualTo(String value) {
            addCriterion("zuoyigaoditiaojie =", value, "zuoyigaoditiaojie");
            return (Criteria) this;
        }
        public Criteria andZuoyigaoditiaojieNotEqualTo(String value) {
            addCriterion("zuoyigaoditiaojie <>", value, "zuoyigaoditiaojie");
            return (Criteria) this;
        }
        public Criteria andZuoyigaoditiaojieGreaterThan(String value) {
            addCriterion("zuoyigaoditiaojie >", value, "zuoyigaoditiaojie");
            return (Criteria) this;
        }
        public Criteria andZuoyigaoditiaojieGreaterThanOrEqualTo(String value) {
            addCriterion("zuoyigaoditiaojie >=", value, "zuoyigaoditiaojie");
            return (Criteria) this;
        }
        public Criteria andZuoyigaoditiaojieLessThan(String value) {
            addCriterion("zuoyigaoditiaojie <", value, "zuoyigaoditiaojie");
            return (Criteria) this;
        }
        public Criteria andZuoyigaoditiaojieLessThanOrEqualTo(String value) {
            addCriterion("zuoyigaoditiaojie <=", value, "zuoyigaoditiaojie");
            return (Criteria) this;
        }
        public Criteria andZuoyigaoditiaojieLike(String value) {
            addCriterion("zuoyigaoditiaojie like", value, "zuoyigaoditiaojie");
            return (Criteria) this;
        }
        public Criteria andZuoyigaoditiaojieNotLike(String value) {
            addCriterion("zuoyigaoditiaojie not like", value, "zuoyigaoditiaojie");
            return (Criteria) this;
        }
        public Criteria andZuoyigaoditiaojieIn(List<String> values) {
            addCriterion("zuoyigaoditiaojie in", values, "zuoyigaoditiaojie");
            return (Criteria) this;
        }
        public Criteria andZuoyigaoditiaojieNotIn(List<String> values) {
            addCriterion("zuoyigaoditiaojie not in", values, "zuoyigaoditiaojie");
            return (Criteria) this;
        }
        public Criteria andZuoyigaoditiaojieBetween(String value1, String value2) {
            addCriterion("zuoyigaoditiaojie between", value1, value2, "zuoyigaoditiaojie");
            return (Criteria) this;
        }
        public Criteria andZuoyigaoditiaojieNotBetween(String value1, String value2) {
            addCriterion("zuoyigaoditiaojie not between", value1, value2, "zuoyigaoditiaojie");
            return (Criteria) this;
        }
        public Criteria andYaobuzhichengtiaojieIsNull() {
            addCriterion("yaobuzhichengtiaojie is null");
            return (Criteria) this;
        }
        public Criteria andYaobuzhichengtiaojieIsNotNull() {
            addCriterion("yaobuzhichengtiaojie is not null");
            return (Criteria) this;
        }
        public Criteria andYaobuzhichengtiaojieEqualTo(String value) {
            addCriterion("yaobuzhichengtiaojie =", value, "yaobuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andYaobuzhichengtiaojieNotEqualTo(String value) {
            addCriterion("yaobuzhichengtiaojie <>", value, "yaobuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andYaobuzhichengtiaojieGreaterThan(String value) {
            addCriterion("yaobuzhichengtiaojie >", value, "yaobuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andYaobuzhichengtiaojieGreaterThanOrEqualTo(String value) {
            addCriterion("yaobuzhichengtiaojie >=", value, "yaobuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andYaobuzhichengtiaojieLessThan(String value) {
            addCriterion("yaobuzhichengtiaojie <", value, "yaobuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andYaobuzhichengtiaojieLessThanOrEqualTo(String value) {
            addCriterion("yaobuzhichengtiaojie <=", value, "yaobuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andYaobuzhichengtiaojieLike(String value) {
            addCriterion("yaobuzhichengtiaojie like", value, "yaobuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andYaobuzhichengtiaojieNotLike(String value) {
            addCriterion("yaobuzhichengtiaojie not like", value, "yaobuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andYaobuzhichengtiaojieIn(List<String> values) {
            addCriterion("yaobuzhichengtiaojie in", values, "yaobuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andYaobuzhichengtiaojieNotIn(List<String> values) {
            addCriterion("yaobuzhichengtiaojie not in", values, "yaobuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andYaobuzhichengtiaojieBetween(String value1, String value2) {
            addCriterion("yaobuzhichengtiaojie between", value1, value2, "yaobuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andYaobuzhichengtiaojieNotBetween(String value1, String value2) {
            addCriterion("yaobuzhichengtiaojie not between", value1, value2, "yaobuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andJianbuzhichengtiaojieIsNull() {
            addCriterion("jianbuzhichengtiaojie is null");
            return (Criteria) this;
        }
        public Criteria andJianbuzhichengtiaojieIsNotNull() {
            addCriterion("jianbuzhichengtiaojie is not null");
            return (Criteria) this;
        }
        public Criteria andJianbuzhichengtiaojieEqualTo(String value) {
            addCriterion("jianbuzhichengtiaojie =", value, "jianbuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andJianbuzhichengtiaojieNotEqualTo(String value) {
            addCriterion("jianbuzhichengtiaojie <>", value, "jianbuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andJianbuzhichengtiaojieGreaterThan(String value) {
            addCriterion("jianbuzhichengtiaojie >", value, "jianbuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andJianbuzhichengtiaojieGreaterThanOrEqualTo(String value) {
            addCriterion("jianbuzhichengtiaojie >=", value, "jianbuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andJianbuzhichengtiaojieLessThan(String value) {
            addCriterion("jianbuzhichengtiaojie <", value, "jianbuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andJianbuzhichengtiaojieLessThanOrEqualTo(String value) {
            addCriterion("jianbuzhichengtiaojie <=", value, "jianbuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andJianbuzhichengtiaojieLike(String value) {
            addCriterion("jianbuzhichengtiaojie like", value, "jianbuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andJianbuzhichengtiaojieNotLike(String value) {
            addCriterion("jianbuzhichengtiaojie not like", value, "jianbuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andJianbuzhichengtiaojieIn(List<String> values) {
            addCriterion("jianbuzhichengtiaojie in", values, "jianbuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andJianbuzhichengtiaojieNotIn(List<String> values) {
            addCriterion("jianbuzhichengtiaojie not in", values, "jianbuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andJianbuzhichengtiaojieBetween(String value1, String value2) {
            addCriterion("jianbuzhichengtiaojie between", value1, value2, "jianbuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andJianbuzhichengtiaojieNotBetween(String value1, String value2) {
            addCriterion("jianbuzhichengtiaojie not between", value1, value2, "jianbuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyitiaojieIsNull() {
            addCriterion("diandongzuoyitiaojie is null");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyitiaojieIsNotNull() {
            addCriterion("diandongzuoyitiaojie is not null");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyitiaojieEqualTo(String value) {
            addCriterion("diandongzuoyitiaojie =", value, "diandongzuoyitiaojie");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyitiaojieNotEqualTo(String value) {
            addCriterion("diandongzuoyitiaojie <>", value, "diandongzuoyitiaojie");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyitiaojieGreaterThan(String value) {
            addCriterion("diandongzuoyitiaojie >", value, "diandongzuoyitiaojie");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyitiaojieGreaterThanOrEqualTo(String value) {
            addCriterion("diandongzuoyitiaojie >=", value, "diandongzuoyitiaojie");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyitiaojieLessThan(String value) {
            addCriterion("diandongzuoyitiaojie <", value, "diandongzuoyitiaojie");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyitiaojieLessThanOrEqualTo(String value) {
            addCriterion("diandongzuoyitiaojie <=", value, "diandongzuoyitiaojie");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyitiaojieLike(String value) {
            addCriterion("diandongzuoyitiaojie like", value, "diandongzuoyitiaojie");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyitiaojieNotLike(String value) {
            addCriterion("diandongzuoyitiaojie not like", value, "diandongzuoyitiaojie");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyitiaojieIn(List<String> values) {
            addCriterion("diandongzuoyitiaojie in", values, "diandongzuoyitiaojie");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyitiaojieNotIn(List<String> values) {
            addCriterion("diandongzuoyitiaojie not in", values, "diandongzuoyitiaojie");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyitiaojieBetween(String value1, String value2) {
            addCriterion("diandongzuoyitiaojie between", value1, value2, "diandongzuoyitiaojie");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyitiaojieNotBetween(String value1, String value2) {
            addCriterion("diandongzuoyitiaojie not between", value1, value2, "diandongzuoyitiaojie");
            return (Criteria) this;
        }
        public Criteria andJiaodutiaojieIsNull() {
            addCriterion("jiaodutiaojie is null");
            return (Criteria) this;
        }
        public Criteria andJiaodutiaojieIsNotNull() {
            addCriterion("jiaodutiaojie is not null");
            return (Criteria) this;
        }
        public Criteria andJiaodutiaojieEqualTo(String value) {
            addCriterion("jiaodutiaojie =", value, "jiaodutiaojie");
            return (Criteria) this;
        }
        public Criteria andJiaodutiaojieNotEqualTo(String value) {
            addCriterion("jiaodutiaojie <>", value, "jiaodutiaojie");
            return (Criteria) this;
        }
        public Criteria andJiaodutiaojieGreaterThan(String value) {
            addCriterion("jiaodutiaojie >", value, "jiaodutiaojie");
            return (Criteria) this;
        }
        public Criteria andJiaodutiaojieGreaterThanOrEqualTo(String value) {
            addCriterion("jiaodutiaojie >=", value, "jiaodutiaojie");
            return (Criteria) this;
        }
        public Criteria andJiaodutiaojieLessThan(String value) {
            addCriterion("jiaodutiaojie <", value, "jiaodutiaojie");
            return (Criteria) this;
        }
        public Criteria andJiaodutiaojieLessThanOrEqualTo(String value) {
            addCriterion("jiaodutiaojie <=", value, "jiaodutiaojie");
            return (Criteria) this;
        }
        public Criteria andJiaodutiaojieLike(String value) {
            addCriterion("jiaodutiaojie like", value, "jiaodutiaojie");
            return (Criteria) this;
        }
        public Criteria andJiaodutiaojieNotLike(String value) {
            addCriterion("jiaodutiaojie not like", value, "jiaodutiaojie");
            return (Criteria) this;
        }
        public Criteria andJiaodutiaojieIn(List<String> values) {
            addCriterion("jiaodutiaojie in", values, "jiaodutiaojie");
            return (Criteria) this;
        }
        public Criteria andJiaodutiaojieNotIn(List<String> values) {
            addCriterion("jiaodutiaojie not in", values, "jiaodutiaojie");
            return (Criteria) this;
        }
        public Criteria andJiaodutiaojieBetween(String value1, String value2) {
            addCriterion("jiaodutiaojie between", value1, value2, "jiaodutiaojie");
            return (Criteria) this;
        }
        public Criteria andJiaodutiaojieNotBetween(String value1, String value2) {
            addCriterion("jiaodutiaojie not between", value1, value2, "jiaodutiaojie");
            return (Criteria) this;
        }
        public Criteria andDierpaizuoyiyidongIsNull() {
            addCriterion("dierpaizuoyiyidong is null");
            return (Criteria) this;
        }
        public Criteria andDierpaizuoyiyidongIsNotNull() {
            addCriterion("dierpaizuoyiyidong is not null");
            return (Criteria) this;
        }
        public Criteria andDierpaizuoyiyidongEqualTo(String value) {
            addCriterion("dierpaizuoyiyidong =", value, "dierpaizuoyiyidong");
            return (Criteria) this;
        }
        public Criteria andDierpaizuoyiyidongNotEqualTo(String value) {
            addCriterion("dierpaizuoyiyidong <>", value, "dierpaizuoyiyidong");
            return (Criteria) this;
        }
        public Criteria andDierpaizuoyiyidongGreaterThan(String value) {
            addCriterion("dierpaizuoyiyidong >", value, "dierpaizuoyiyidong");
            return (Criteria) this;
        }
        public Criteria andDierpaizuoyiyidongGreaterThanOrEqualTo(String value) {
            addCriterion("dierpaizuoyiyidong >=", value, "dierpaizuoyiyidong");
            return (Criteria) this;
        }
        public Criteria andDierpaizuoyiyidongLessThan(String value) {
            addCriterion("dierpaizuoyiyidong <", value, "dierpaizuoyiyidong");
            return (Criteria) this;
        }
        public Criteria andDierpaizuoyiyidongLessThanOrEqualTo(String value) {
            addCriterion("dierpaizuoyiyidong <=", value, "dierpaizuoyiyidong");
            return (Criteria) this;
        }
        public Criteria andDierpaizuoyiyidongLike(String value) {
            addCriterion("dierpaizuoyiyidong like", value, "dierpaizuoyiyidong");
            return (Criteria) this;
        }
        public Criteria andDierpaizuoyiyidongNotLike(String value) {
            addCriterion("dierpaizuoyiyidong not like", value, "dierpaizuoyiyidong");
            return (Criteria) this;
        }
        public Criteria andDierpaizuoyiyidongIn(List<String> values) {
            addCriterion("dierpaizuoyiyidong in", values, "dierpaizuoyiyidong");
            return (Criteria) this;
        }
        public Criteria andDierpaizuoyiyidongNotIn(List<String> values) {
            addCriterion("dierpaizuoyiyidong not in", values, "dierpaizuoyiyidong");
            return (Criteria) this;
        }
        public Criteria andDierpaizuoyiyidongBetween(String value1, String value2) {
            addCriterion("dierpaizuoyiyidong between", value1, value2, "dierpaizuoyiyidong");
            return (Criteria) this;
        }
        public Criteria andDierpaizuoyiyidongNotBetween(String value1, String value2) {
            addCriterion("dierpaizuoyiyidong not between", value1, value2, "dierpaizuoyiyidong");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyidiandongtiaojieIsNull() {
            addCriterion("houpaizuoyidiandongtiaojie is null");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyidiandongtiaojieIsNotNull() {
            addCriterion("houpaizuoyidiandongtiaojie is not null");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyidiandongtiaojieEqualTo(String value) {
            addCriterion("houpaizuoyidiandongtiaojie =", value, "houpaizuoyidiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyidiandongtiaojieNotEqualTo(String value) {
            addCriterion("houpaizuoyidiandongtiaojie <>", value, "houpaizuoyidiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyidiandongtiaojieGreaterThan(String value) {
            addCriterion("houpaizuoyidiandongtiaojie >", value, "houpaizuoyidiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyidiandongtiaojieGreaterThanOrEqualTo(String value) {
            addCriterion("houpaizuoyidiandongtiaojie >=", value, "houpaizuoyidiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyidiandongtiaojieLessThan(String value) {
            addCriterion("houpaizuoyidiandongtiaojie <", value, "houpaizuoyidiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyidiandongtiaojieLessThanOrEqualTo(String value) {
            addCriterion("houpaizuoyidiandongtiaojie <=", value, "houpaizuoyidiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyidiandongtiaojieLike(String value) {
            addCriterion("houpaizuoyidiandongtiaojie like", value, "houpaizuoyidiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyidiandongtiaojieNotLike(String value) {
            addCriterion("houpaizuoyidiandongtiaojie not like", value, "houpaizuoyidiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyidiandongtiaojieIn(List<String> values) {
            addCriterion("houpaizuoyidiandongtiaojie in", values, "houpaizuoyidiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyidiandongtiaojieNotIn(List<String> values) {
            addCriterion("houpaizuoyidiandongtiaojie not in", values, "houpaizuoyidiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyidiandongtiaojieBetween(String value1, String value2) {
            addCriterion("houpaizuoyidiandongtiaojie between", value1, value2, "houpaizuoyidiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyidiandongtiaojieNotBetween(String value1, String value2) {
            addCriterion("houpaizuoyidiandongtiaojie not between", value1, value2, "houpaizuoyidiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andFujiashiketiaojieIsNull() {
            addCriterion("fujiashiketiaojie is null");
            return (Criteria) this;
        }
        public Criteria andFujiashiketiaojieIsNotNull() {
            addCriterion("fujiashiketiaojie is not null");
            return (Criteria) this;
        }
        public Criteria andFujiashiketiaojieEqualTo(String value) {
            addCriterion("fujiashiketiaojie =", value, "fujiashiketiaojie");
            return (Criteria) this;
        }
        public Criteria andFujiashiketiaojieNotEqualTo(String value) {
            addCriterion("fujiashiketiaojie <>", value, "fujiashiketiaojie");
            return (Criteria) this;
        }
        public Criteria andFujiashiketiaojieGreaterThan(String value) {
            addCriterion("fujiashiketiaojie >", value, "fujiashiketiaojie");
            return (Criteria) this;
        }
        public Criteria andFujiashiketiaojieGreaterThanOrEqualTo(String value) {
            addCriterion("fujiashiketiaojie >=", value, "fujiashiketiaojie");
            return (Criteria) this;
        }
        public Criteria andFujiashiketiaojieLessThan(String value) {
            addCriterion("fujiashiketiaojie <", value, "fujiashiketiaojie");
            return (Criteria) this;
        }
        public Criteria andFujiashiketiaojieLessThanOrEqualTo(String value) {
            addCriterion("fujiashiketiaojie <=", value, "fujiashiketiaojie");
            return (Criteria) this;
        }
        public Criteria andFujiashiketiaojieLike(String value) {
            addCriterion("fujiashiketiaojie like", value, "fujiashiketiaojie");
            return (Criteria) this;
        }
        public Criteria andFujiashiketiaojieNotLike(String value) {
            addCriterion("fujiashiketiaojie not like", value, "fujiashiketiaojie");
            return (Criteria) this;
        }
        public Criteria andFujiashiketiaojieIn(List<String> values) {
            addCriterion("fujiashiketiaojie in", values, "fujiashiketiaojie");
            return (Criteria) this;
        }
        public Criteria andFujiashiketiaojieNotIn(List<String> values) {
            addCriterion("fujiashiketiaojie not in", values, "fujiashiketiaojie");
            return (Criteria) this;
        }
        public Criteria andFujiashiketiaojieBetween(String value1, String value2) {
            addCriterion("fujiashiketiaojie between", value1, value2, "fujiashiketiaojie");
            return (Criteria) this;
        }
        public Criteria andFujiashiketiaojieNotBetween(String value1, String value2) {
            addCriterion("fujiashiketiaojie not between", value1, value2, "fujiashiketiaojie");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyijiyiIsNull() {
            addCriterion("diandongzuoyijiyi is null");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyijiyiIsNotNull() {
            addCriterion("diandongzuoyijiyi is not null");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyijiyiEqualTo(String value) {
            addCriterion("diandongzuoyijiyi =", value, "diandongzuoyijiyi");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyijiyiNotEqualTo(String value) {
            addCriterion("diandongzuoyijiyi <>", value, "diandongzuoyijiyi");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyijiyiGreaterThan(String value) {
            addCriterion("diandongzuoyijiyi >", value, "diandongzuoyijiyi");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyijiyiGreaterThanOrEqualTo(String value) {
            addCriterion("diandongzuoyijiyi >=", value, "diandongzuoyijiyi");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyijiyiLessThan(String value) {
            addCriterion("diandongzuoyijiyi <", value, "diandongzuoyijiyi");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyijiyiLessThanOrEqualTo(String value) {
            addCriterion("diandongzuoyijiyi <=", value, "diandongzuoyijiyi");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyijiyiLike(String value) {
            addCriterion("diandongzuoyijiyi like", value, "diandongzuoyijiyi");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyijiyiNotLike(String value) {
            addCriterion("diandongzuoyijiyi not like", value, "diandongzuoyijiyi");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyijiyiIn(List<String> values) {
            addCriterion("diandongzuoyijiyi in", values, "diandongzuoyijiyi");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyijiyiNotIn(List<String> values) {
            addCriterion("diandongzuoyijiyi not in", values, "diandongzuoyijiyi");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyijiyiBetween(String value1, String value2) {
            addCriterion("diandongzuoyijiyi between", value1, value2, "diandongzuoyijiyi");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyijiyiNotBetween(String value1, String value2) {
            addCriterion("diandongzuoyijiyi not between", value1, value2, "diandongzuoyijiyi");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyijiareIsNull() {
            addCriterion("qianhoupaizuoyijiare is null");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyijiareIsNotNull() {
            addCriterion("qianhoupaizuoyijiare is not null");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyijiareEqualTo(String value) {
            addCriterion("qianhoupaizuoyijiare =", value, "qianhoupaizuoyijiare");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyijiareNotEqualTo(String value) {
            addCriterion("qianhoupaizuoyijiare <>", value, "qianhoupaizuoyijiare");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyijiareGreaterThan(String value) {
            addCriterion("qianhoupaizuoyijiare >", value, "qianhoupaizuoyijiare");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyijiareGreaterThanOrEqualTo(String value) {
            addCriterion("qianhoupaizuoyijiare >=", value, "qianhoupaizuoyijiare");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyijiareLessThan(String value) {
            addCriterion("qianhoupaizuoyijiare <", value, "qianhoupaizuoyijiare");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyijiareLessThanOrEqualTo(String value) {
            addCriterion("qianhoupaizuoyijiare <=", value, "qianhoupaizuoyijiare");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyijiareLike(String value) {
            addCriterion("qianhoupaizuoyijiare like", value, "qianhoupaizuoyijiare");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyijiareNotLike(String value) {
            addCriterion("qianhoupaizuoyijiare not like", value, "qianhoupaizuoyijiare");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyijiareIn(List<String> values) {
            addCriterion("qianhoupaizuoyijiare in", values, "qianhoupaizuoyijiare");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyijiareNotIn(List<String> values) {
            addCriterion("qianhoupaizuoyijiare not in", values, "qianhoupaizuoyijiare");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyijiareBetween(String value1, String value2) {
            addCriterion("qianhoupaizuoyijiare between", value1, value2, "qianhoupaizuoyijiare");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyijiareNotBetween(String value1, String value2) {
            addCriterion("qianhoupaizuoyijiare not between", value1, value2, "qianhoupaizuoyijiare");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyidongfengIsNull() {
            addCriterion("qianhoupaizuoyidongfeng is null");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyidongfengIsNotNull() {
            addCriterion("qianhoupaizuoyidongfeng is not null");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyidongfengEqualTo(String value) {
            addCriterion("qianhoupaizuoyidongfeng =", value, "qianhoupaizuoyidongfeng");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyidongfengNotEqualTo(String value) {
            addCriterion("qianhoupaizuoyidongfeng <>", value, "qianhoupaizuoyidongfeng");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyidongfengGreaterThan(String value) {
            addCriterion("qianhoupaizuoyidongfeng >", value, "qianhoupaizuoyidongfeng");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyidongfengGreaterThanOrEqualTo(String value) {
            addCriterion("qianhoupaizuoyidongfeng >=", value, "qianhoupaizuoyidongfeng");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyidongfengLessThan(String value) {
            addCriterion("qianhoupaizuoyidongfeng <", value, "qianhoupaizuoyidongfeng");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyidongfengLessThanOrEqualTo(String value) {
            addCriterion("qianhoupaizuoyidongfeng <=", value, "qianhoupaizuoyidongfeng");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyidongfengLike(String value) {
            addCriterion("qianhoupaizuoyidongfeng like", value, "qianhoupaizuoyidongfeng");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyidongfengNotLike(String value) {
            addCriterion("qianhoupaizuoyidongfeng not like", value, "qianhoupaizuoyidongfeng");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyidongfengIn(List<String> values) {
            addCriterion("qianhoupaizuoyidongfeng in", values, "qianhoupaizuoyidongfeng");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyidongfengNotIn(List<String> values) {
            addCriterion("qianhoupaizuoyidongfeng not in", values, "qianhoupaizuoyidongfeng");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyidongfengBetween(String value1, String value2) {
            addCriterion("qianhoupaizuoyidongfeng between", value1, value2, "qianhoupaizuoyidongfeng");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyidongfengNotBetween(String value1, String value2) {
            addCriterion("qianhoupaizuoyidongfeng not between", value1, value2, "qianhoupaizuoyidongfeng");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyianmoIsNull() {
            addCriterion("qianhoupaizuoyianmo is null");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyianmoIsNotNull() {
            addCriterion("qianhoupaizuoyianmo is not null");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyianmoEqualTo(String value) {
            addCriterion("qianhoupaizuoyianmo =", value, "qianhoupaizuoyianmo");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyianmoNotEqualTo(String value) {
            addCriterion("qianhoupaizuoyianmo <>", value, "qianhoupaizuoyianmo");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyianmoGreaterThan(String value) {
            addCriterion("qianhoupaizuoyianmo >", value, "qianhoupaizuoyianmo");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyianmoGreaterThanOrEqualTo(String value) {
            addCriterion("qianhoupaizuoyianmo >=", value, "qianhoupaizuoyianmo");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyianmoLessThan(String value) {
            addCriterion("qianhoupaizuoyianmo <", value, "qianhoupaizuoyianmo");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyianmoLessThanOrEqualTo(String value) {
            addCriterion("qianhoupaizuoyianmo <=", value, "qianhoupaizuoyianmo");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyianmoLike(String value) {
            addCriterion("qianhoupaizuoyianmo like", value, "qianhoupaizuoyianmo");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyianmoNotLike(String value) {
            addCriterion("qianhoupaizuoyianmo not like", value, "qianhoupaizuoyianmo");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyianmoIn(List<String> values) {
            addCriterion("qianhoupaizuoyianmo in", values, "qianhoupaizuoyianmo");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyianmoNotIn(List<String> values) {
            addCriterion("qianhoupaizuoyianmo not in", values, "qianhoupaizuoyianmo");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyianmoBetween(String value1, String value2) {
            addCriterion("qianhoupaizuoyianmo between", value1, value2, "qianhoupaizuoyianmo");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyianmoNotBetween(String value1, String value2) {
            addCriterion("qianhoupaizuoyianmo not between", value1, value2, "qianhoupaizuoyianmo");
            return (Criteria) this;
        }
        public Criteria andDierpaidulizuoyiIsNull() {
            addCriterion("dierpaidulizuoyi is null");
            return (Criteria) this;
        }
        public Criteria andDierpaidulizuoyiIsNotNull() {
            addCriterion("dierpaidulizuoyi is not null");
            return (Criteria) this;
        }
        public Criteria andDierpaidulizuoyiEqualTo(String value) {
            addCriterion("dierpaidulizuoyi =", value, "dierpaidulizuoyi");
            return (Criteria) this;
        }
        public Criteria andDierpaidulizuoyiNotEqualTo(String value) {
            addCriterion("dierpaidulizuoyi <>", value, "dierpaidulizuoyi");
            return (Criteria) this;
        }
        public Criteria andDierpaidulizuoyiGreaterThan(String value) {
            addCriterion("dierpaidulizuoyi >", value, "dierpaidulizuoyi");
            return (Criteria) this;
        }
        public Criteria andDierpaidulizuoyiGreaterThanOrEqualTo(String value) {
            addCriterion("dierpaidulizuoyi >=", value, "dierpaidulizuoyi");
            return (Criteria) this;
        }
        public Criteria andDierpaidulizuoyiLessThan(String value) {
            addCriterion("dierpaidulizuoyi <", value, "dierpaidulizuoyi");
            return (Criteria) this;
        }
        public Criteria andDierpaidulizuoyiLessThanOrEqualTo(String value) {
            addCriterion("dierpaidulizuoyi <=", value, "dierpaidulizuoyi");
            return (Criteria) this;
        }
        public Criteria andDierpaidulizuoyiLike(String value) {
            addCriterion("dierpaidulizuoyi like", value, "dierpaidulizuoyi");
            return (Criteria) this;
        }
        public Criteria andDierpaidulizuoyiNotLike(String value) {
            addCriterion("dierpaidulizuoyi not like", value, "dierpaidulizuoyi");
            return (Criteria) this;
        }
        public Criteria andDierpaidulizuoyiIn(List<String> values) {
            addCriterion("dierpaidulizuoyi in", values, "dierpaidulizuoyi");
            return (Criteria) this;
        }
        public Criteria andDierpaidulizuoyiNotIn(List<String> values) {
            addCriterion("dierpaidulizuoyi not in", values, "dierpaidulizuoyi");
            return (Criteria) this;
        }
        public Criteria andDierpaidulizuoyiBetween(String value1, String value2) {
            addCriterion("dierpaidulizuoyi between", value1, value2, "dierpaidulizuoyi");
            return (Criteria) this;
        }
        public Criteria andDierpaidulizuoyiNotBetween(String value1, String value2) {
            addCriterion("dierpaidulizuoyi not between", value1, value2, "dierpaidulizuoyi");
            return (Criteria) this;
        }
        public Criteria andDisanpaizuoyiIsNull() {
            addCriterion("disanpaizuoyi is null");
            return (Criteria) this;
        }
        public Criteria andDisanpaizuoyiIsNotNull() {
            addCriterion("disanpaizuoyi is not null");
            return (Criteria) this;
        }
        public Criteria andDisanpaizuoyiEqualTo(String value) {
            addCriterion("disanpaizuoyi =", value, "disanpaizuoyi");
            return (Criteria) this;
        }
        public Criteria andDisanpaizuoyiNotEqualTo(String value) {
            addCriterion("disanpaizuoyi <>", value, "disanpaizuoyi");
            return (Criteria) this;
        }
        public Criteria andDisanpaizuoyiGreaterThan(String value) {
            addCriterion("disanpaizuoyi >", value, "disanpaizuoyi");
            return (Criteria) this;
        }
        public Criteria andDisanpaizuoyiGreaterThanOrEqualTo(String value) {
            addCriterion("disanpaizuoyi >=", value, "disanpaizuoyi");
            return (Criteria) this;
        }
        public Criteria andDisanpaizuoyiLessThan(String value) {
            addCriterion("disanpaizuoyi <", value, "disanpaizuoyi");
            return (Criteria) this;
        }
        public Criteria andDisanpaizuoyiLessThanOrEqualTo(String value) {
            addCriterion("disanpaizuoyi <=", value, "disanpaizuoyi");
            return (Criteria) this;
        }
        public Criteria andDisanpaizuoyiLike(String value) {
            addCriterion("disanpaizuoyi like", value, "disanpaizuoyi");
            return (Criteria) this;
        }
        public Criteria andDisanpaizuoyiNotLike(String value) {
            addCriterion("disanpaizuoyi not like", value, "disanpaizuoyi");
            return (Criteria) this;
        }
        public Criteria andDisanpaizuoyiIn(List<String> values) {
            addCriterion("disanpaizuoyi in", values, "disanpaizuoyi");
            return (Criteria) this;
        }
        public Criteria andDisanpaizuoyiNotIn(List<String> values) {
            addCriterion("disanpaizuoyi not in", values, "disanpaizuoyi");
            return (Criteria) this;
        }
        public Criteria andDisanpaizuoyiBetween(String value1, String value2) {
            addCriterion("disanpaizuoyi between", value1, value2, "disanpaizuoyi");
            return (Criteria) this;
        }
        public Criteria andDisanpaizuoyiNotBetween(String value1, String value2) {
            addCriterion("disanpaizuoyi not between", value1, value2, "disanpaizuoyi");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyifabfshiIsNull() {
            addCriterion("houpaizuoyifabfshi is null");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyifabfshiIsNotNull() {
            addCriterion("houpaizuoyifabfshi is not null");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyifabfshiEqualTo(String value) {
            addCriterion("houpaizuoyifabfshi =", value, "houpaizuoyifabfshi");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyifabfshiNotEqualTo(String value) {
            addCriterion("houpaizuoyifabfshi <>", value, "houpaizuoyifabfshi");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyifabfshiGreaterThan(String value) {
            addCriterion("houpaizuoyifabfshi >", value, "houpaizuoyifabfshi");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyifabfshiGreaterThanOrEqualTo(String value) {
            addCriterion("houpaizuoyifabfshi >=", value, "houpaizuoyifabfshi");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyifabfshiLessThan(String value) {
            addCriterion("houpaizuoyifabfshi <", value, "houpaizuoyifabfshi");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyifabfshiLessThanOrEqualTo(String value) {
            addCriterion("houpaizuoyifabfshi <=", value, "houpaizuoyifabfshi");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyifabfshiLike(String value) {
            addCriterion("houpaizuoyifabfshi like", value, "houpaizuoyifabfshi");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyifabfshiNotLike(String value) {
            addCriterion("houpaizuoyifabfshi not like", value, "houpaizuoyifabfshi");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyifabfshiIn(List<String> values) {
            addCriterion("houpaizuoyifabfshi in", values, "houpaizuoyifabfshi");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyifabfshiNotIn(List<String> values) {
            addCriterion("houpaizuoyifabfshi not in", values, "houpaizuoyifabfshi");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyifabfshiBetween(String value1, String value2) {
            addCriterion("houpaizuoyifabfshi between", value1, value2, "houpaizuoyifabfshi");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyifabfshiNotBetween(String value1, String value2) {
            addCriterion("houpaizuoyifabfshi not between", value1, value2, "houpaizuoyifabfshi");
            return (Criteria) this;
        }
        public Criteria andQianhouzhongyangfushouIsNull() {
            addCriterion("qianhouzhongyangfushou is null");
            return (Criteria) this;
        }
        public Criteria andQianhouzhongyangfushouIsNotNull() {
            addCriterion("qianhouzhongyangfushou is not null");
            return (Criteria) this;
        }
        public Criteria andQianhouzhongyangfushouEqualTo(String value) {
            addCriterion("qianhouzhongyangfushou =", value, "qianhouzhongyangfushou");
            return (Criteria) this;
        }
        public Criteria andQianhouzhongyangfushouNotEqualTo(String value) {
            addCriterion("qianhouzhongyangfushou <>", value, "qianhouzhongyangfushou");
            return (Criteria) this;
        }
        public Criteria andQianhouzhongyangfushouGreaterThan(String value) {
            addCriterion("qianhouzhongyangfushou >", value, "qianhouzhongyangfushou");
            return (Criteria) this;
        }
        public Criteria andQianhouzhongyangfushouGreaterThanOrEqualTo(String value) {
            addCriterion("qianhouzhongyangfushou >=", value, "qianhouzhongyangfushou");
            return (Criteria) this;
        }
        public Criteria andQianhouzhongyangfushouLessThan(String value) {
            addCriterion("qianhouzhongyangfushou <", value, "qianhouzhongyangfushou");
            return (Criteria) this;
        }
        public Criteria andQianhouzhongyangfushouLessThanOrEqualTo(String value) {
            addCriterion("qianhouzhongyangfushou <=", value, "qianhouzhongyangfushou");
            return (Criteria) this;
        }
        public Criteria andQianhouzhongyangfushouLike(String value) {
            addCriterion("qianhouzhongyangfushou like", value, "qianhouzhongyangfushou");
            return (Criteria) this;
        }
        public Criteria andQianhouzhongyangfushouNotLike(String value) {
            addCriterion("qianhouzhongyangfushou not like", value, "qianhouzhongyangfushou");
            return (Criteria) this;
        }
        public Criteria andQianhouzhongyangfushouIn(List<String> values) {
            addCriterion("qianhouzhongyangfushou in", values, "qianhouzhongyangfushou");
            return (Criteria) this;
        }
        public Criteria andQianhouzhongyangfushouNotIn(List<String> values) {
            addCriterion("qianhouzhongyangfushou not in", values, "qianhouzhongyangfushou");
            return (Criteria) this;
        }
        public Criteria andQianhouzhongyangfushouBetween(String value1, String value2) {
            addCriterion("qianhouzhongyangfushou between", value1, value2, "qianhouzhongyangfushou");
            return (Criteria) this;
        }
        public Criteria andQianhouzhongyangfushouNotBetween(String value1, String value2) {
            addCriterion("qianhouzhongyangfushou not between", value1, value2, "qianhouzhongyangfushou");
            return (Criteria) this;
        }
        public Criteria andHoupaibeijiaIsNull() {
            addCriterion("houpaibeijia is null");
            return (Criteria) this;
        }
        public Criteria andHoupaibeijiaIsNotNull() {
            addCriterion("houpaibeijia is not null");
            return (Criteria) this;
        }
        public Criteria andHoupaibeijiaEqualTo(String value) {
            addCriterion("houpaibeijia =", value, "houpaibeijia");
            return (Criteria) this;
        }
        public Criteria andHoupaibeijiaNotEqualTo(String value) {
            addCriterion("houpaibeijia <>", value, "houpaibeijia");
            return (Criteria) this;
        }
        public Criteria andHoupaibeijiaGreaterThan(String value) {
            addCriterion("houpaibeijia >", value, "houpaibeijia");
            return (Criteria) this;
        }
        public Criteria andHoupaibeijiaGreaterThanOrEqualTo(String value) {
            addCriterion("houpaibeijia >=", value, "houpaibeijia");
            return (Criteria) this;
        }
        public Criteria andHoupaibeijiaLessThan(String value) {
            addCriterion("houpaibeijia <", value, "houpaibeijia");
            return (Criteria) this;
        }
        public Criteria andHoupaibeijiaLessThanOrEqualTo(String value) {
            addCriterion("houpaibeijia <=", value, "houpaibeijia");
            return (Criteria) this;
        }
        public Criteria andHoupaibeijiaLike(String value) {
            addCriterion("houpaibeijia like", value, "houpaibeijia");
            return (Criteria) this;
        }
        public Criteria andHoupaibeijiaNotLike(String value) {
            addCriterion("houpaibeijia not like", value, "houpaibeijia");
            return (Criteria) this;
        }
        public Criteria andHoupaibeijiaIn(List<String> values) {
            addCriterion("houpaibeijia in", values, "houpaibeijia");
            return (Criteria) this;
        }
        public Criteria andHoupaibeijiaNotIn(List<String> values) {
            addCriterion("houpaibeijia not in", values, "houpaibeijia");
            return (Criteria) this;
        }
        public Criteria andHoupaibeijiaBetween(String value1, String value2) {
            addCriterion("houpaibeijia between", value1, value2, "houpaibeijia");
            return (Criteria) this;
        }
        public Criteria andHoupaibeijiaNotBetween(String value1, String value2) {
            addCriterion("houpaibeijia not between", value1, value2, "houpaibeijia");
            return (Criteria) this;
        }
        public Criteria andJiarezhilingbeijiaIsNull() {
            addCriterion("jiarezhilingbeijia is null");
            return (Criteria) this;
        }
        public Criteria andJiarezhilingbeijiaIsNotNull() {
            addCriterion("jiarezhilingbeijia is not null");
            return (Criteria) this;
        }
        public Criteria andJiarezhilingbeijiaEqualTo(String value) {
            addCriterion("jiarezhilingbeijia =", value, "jiarezhilingbeijia");
            return (Criteria) this;
        }
        public Criteria andJiarezhilingbeijiaNotEqualTo(String value) {
            addCriterion("jiarezhilingbeijia <>", value, "jiarezhilingbeijia");
            return (Criteria) this;
        }
        public Criteria andJiarezhilingbeijiaGreaterThan(String value) {
            addCriterion("jiarezhilingbeijia >", value, "jiarezhilingbeijia");
            return (Criteria) this;
        }
        public Criteria andJiarezhilingbeijiaGreaterThanOrEqualTo(String value) {
            addCriterion("jiarezhilingbeijia >=", value, "jiarezhilingbeijia");
            return (Criteria) this;
        }
        public Criteria andJiarezhilingbeijiaLessThan(String value) {
            addCriterion("jiarezhilingbeijia <", value, "jiarezhilingbeijia");
            return (Criteria) this;
        }
        public Criteria andJiarezhilingbeijiaLessThanOrEqualTo(String value) {
            addCriterion("jiarezhilingbeijia <=", value, "jiarezhilingbeijia");
            return (Criteria) this;
        }
        public Criteria andJiarezhilingbeijiaLike(String value) {
            addCriterion("jiarezhilingbeijia like", value, "jiarezhilingbeijia");
            return (Criteria) this;
        }
        public Criteria andJiarezhilingbeijiaNotLike(String value) {
            addCriterion("jiarezhilingbeijia not like", value, "jiarezhilingbeijia");
            return (Criteria) this;
        }
        public Criteria andJiarezhilingbeijiaIn(List<String> values) {
            addCriterion("jiarezhilingbeijia in", values, "jiarezhilingbeijia");
            return (Criteria) this;
        }
        public Criteria andJiarezhilingbeijiaNotIn(List<String> values) {
            addCriterion("jiarezhilingbeijia not in", values, "jiarezhilingbeijia");
            return (Criteria) this;
        }
        public Criteria andJiarezhilingbeijiaBetween(String value1, String value2) {
            addCriterion("jiarezhilingbeijia between", value1, value2, "jiarezhilingbeijia");
            return (Criteria) this;
        }
        public Criteria andJiarezhilingbeijiaNotBetween(String value1, String value2) {
            addCriterion("jiarezhilingbeijia not between", value1, value2, "jiarezhilingbeijia");
            return (Criteria) this;
        }
        public Criteria andGPSIsNull() {
            addCriterion("GPS is null");
            return (Criteria) this;
        }
        public Criteria andGPSIsNotNull() {
            addCriterion("GPS is not null");
            return (Criteria) this;
        }
        public Criteria andGPSEqualTo(String value) {
            addCriterion("GPS =", value, "GPS");
            return (Criteria) this;
        }
        public Criteria andGPSNotEqualTo(String value) {
            addCriterion("GPS <>", value, "GPS");
            return (Criteria) this;
        }
        public Criteria andGPSGreaterThan(String value) {
            addCriterion("GPS >", value, "GPS");
            return (Criteria) this;
        }
        public Criteria andGPSGreaterThanOrEqualTo(String value) {
            addCriterion("GPS >=", value, "GPS");
            return (Criteria) this;
        }
        public Criteria andGPSLessThan(String value) {
            addCriterion("GPS <", value, "GPS");
            return (Criteria) this;
        }
        public Criteria andGPSLessThanOrEqualTo(String value) {
            addCriterion("GPS <=", value, "GPS");
            return (Criteria) this;
        }
        public Criteria andGPSLike(String value) {
            addCriterion("GPS like", value, "GPS");
            return (Criteria) this;
        }
        public Criteria andGPSNotLike(String value) {
            addCriterion("GPS not like", value, "GPS");
            return (Criteria) this;
        }
        public Criteria andGPSIn(List<String> values) {
            addCriterion("GPS in", values, "GPS");
            return (Criteria) this;
        }
        public Criteria andGPSNotIn(List<String> values) {
            addCriterion("GPS not in", values, "GPS");
            return (Criteria) this;
        }
        public Criteria andGPSBetween(String value1, String value2) {
            addCriterion("GPS between", value1, value2, "GPS");
            return (Criteria) this;
        }
        public Criteria andGPSNotBetween(String value1, String value2) {
            addCriterion("GPS not between", value1, value2, "GPS");
            return (Criteria) this;
        }
        public Criteria andDingweihudongfuwuIsNull() {
            addCriterion("dingweihudongfuwu is null");
            return (Criteria) this;
        }
        public Criteria andDingweihudongfuwuIsNotNull() {
            addCriterion("dingweihudongfuwu is not null");
            return (Criteria) this;
        }
        public Criteria andDingweihudongfuwuEqualTo(String value) {
            addCriterion("dingweihudongfuwu =", value, "dingweihudongfuwu");
            return (Criteria) this;
        }
        public Criteria andDingweihudongfuwuNotEqualTo(String value) {
            addCriterion("dingweihudongfuwu <>", value, "dingweihudongfuwu");
            return (Criteria) this;
        }
        public Criteria andDingweihudongfuwuGreaterThan(String value) {
            addCriterion("dingweihudongfuwu >", value, "dingweihudongfuwu");
            return (Criteria) this;
        }
        public Criteria andDingweihudongfuwuGreaterThanOrEqualTo(String value) {
            addCriterion("dingweihudongfuwu >=", value, "dingweihudongfuwu");
            return (Criteria) this;
        }
        public Criteria andDingweihudongfuwuLessThan(String value) {
            addCriterion("dingweihudongfuwu <", value, "dingweihudongfuwu");
            return (Criteria) this;
        }
        public Criteria andDingweihudongfuwuLessThanOrEqualTo(String value) {
            addCriterion("dingweihudongfuwu <=", value, "dingweihudongfuwu");
            return (Criteria) this;
        }
        public Criteria andDingweihudongfuwuLike(String value) {
            addCriterion("dingweihudongfuwu like", value, "dingweihudongfuwu");
            return (Criteria) this;
        }
        public Criteria andDingweihudongfuwuNotLike(String value) {
            addCriterion("dingweihudongfuwu not like", value, "dingweihudongfuwu");
            return (Criteria) this;
        }
        public Criteria andDingweihudongfuwuIn(List<String> values) {
            addCriterion("dingweihudongfuwu in", values, "dingweihudongfuwu");
            return (Criteria) this;
        }
        public Criteria andDingweihudongfuwuNotIn(List<String> values) {
            addCriterion("dingweihudongfuwu not in", values, "dingweihudongfuwu");
            return (Criteria) this;
        }
        public Criteria andDingweihudongfuwuBetween(String value1, String value2) {
            addCriterion("dingweihudongfuwu between", value1, value2, "dingweihudongfuwu");
            return (Criteria) this;
        }
        public Criteria andDingweihudongfuwuNotBetween(String value1, String value2) {
            addCriterion("dingweihudongfuwu not between", value1, value2, "dingweihudongfuwu");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingIsNull() {
            addCriterion("zhongkongtai_daping is null");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingIsNotNull() {
            addCriterion("zhongkongtai_daping is not null");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingEqualTo(String value) {
            addCriterion("zhongkongtai_daping =", value, "zhongkongtai_daping");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingNotEqualTo(String value) {
            addCriterion("zhongkongtai_daping <>", value, "zhongkongtai_daping");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingGreaterThan(String value) {
            addCriterion("zhongkongtai_daping >", value, "zhongkongtai_daping");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingGreaterThanOrEqualTo(String value) {
            addCriterion("zhongkongtai_daping >=", value, "zhongkongtai_daping");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingLessThan(String value) {
            addCriterion("zhongkongtai_daping <", value, "zhongkongtai_daping");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingLessThanOrEqualTo(String value) {
            addCriterion("zhongkongtai_daping <=", value, "zhongkongtai_daping");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingLike(String value) {
            addCriterion("zhongkongtai_daping like", value, "zhongkongtai_daping");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingNotLike(String value) {
            addCriterion("zhongkongtai_daping not like", value, "zhongkongtai_daping");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingIn(List<String> values) {
            addCriterion("zhongkongtai_daping in", values, "zhongkongtai_daping");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingNotIn(List<String> values) {
            addCriterion("zhongkongtai_daping not in", values, "zhongkongtai_daping");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingBetween(String value1, String value2) {
            addCriterion("zhongkongtai_daping between", value1, value2, "zhongkongtai_daping");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingNotBetween(String value1, String value2) {
            addCriterion("zhongkongtai_daping not between", value1, value2, "zhongkongtai_daping");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingchicunIsNull() {
            addCriterion("zhongkongtai_dapingchicun is null");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingchicunIsNotNull() {
            addCriterion("zhongkongtai_dapingchicun is not null");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingchicunEqualTo(String value) {
            addCriterion("zhongkongtai_dapingchicun =", value, "zhongkongtai_dapingchicun");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingchicunNotEqualTo(String value) {
            addCriterion("zhongkongtai_dapingchicun <>", value, "zhongkongtai_dapingchicun");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingchicunGreaterThan(String value) {
            addCriterion("zhongkongtai_dapingchicun >", value, "zhongkongtai_dapingchicun");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingchicunGreaterThanOrEqualTo(String value) {
            addCriterion("zhongkongtai_dapingchicun >=", value, "zhongkongtai_dapingchicun");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingchicunLessThan(String value) {
            addCriterion("zhongkongtai_dapingchicun <", value, "zhongkongtai_dapingchicun");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingchicunLessThanOrEqualTo(String value) {
            addCriterion("zhongkongtai_dapingchicun <=", value, "zhongkongtai_dapingchicun");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingchicunLike(String value) {
            addCriterion("zhongkongtai_dapingchicun like", value, "zhongkongtai_dapingchicun");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingchicunNotLike(String value) {
            addCriterion("zhongkongtai_dapingchicun not like", value, "zhongkongtai_dapingchicun");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingchicunIn(List<String> values) {
            addCriterion("zhongkongtai_dapingchicun in", values, "zhongkongtai_dapingchicun");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingchicunNotIn(List<String> values) {
            addCriterion("zhongkongtai_dapingchicun not in", values, "zhongkongtai_dapingchicun");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingchicunBetween(String value1, String value2) {
            addCriterion("zhongkongtai_dapingchicun between", value1, value2, "zhongkongtai_dapingchicun");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingchicunNotBetween(String value1, String value2) {
            addCriterion("zhongkongtai_dapingchicun not between", value1, value2, "zhongkongtai_dapingchicun");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_xianshiIsNull() {
            addCriterion("zhongkongtai_xianshi is null");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_xianshiIsNotNull() {
            addCriterion("zhongkongtai_xianshi is not null");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_xianshiEqualTo(String value) {
            addCriterion("zhongkongtai_xianshi =", value, "zhongkongtai_xianshi");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_xianshiNotEqualTo(String value) {
            addCriterion("zhongkongtai_xianshi <>", value, "zhongkongtai_xianshi");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_xianshiGreaterThan(String value) {
            addCriterion("zhongkongtai_xianshi >", value, "zhongkongtai_xianshi");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_xianshiGreaterThanOrEqualTo(String value) {
            addCriterion("zhongkongtai_xianshi >=", value, "zhongkongtai_xianshi");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_xianshiLessThan(String value) {
            addCriterion("zhongkongtai_xianshi <", value, "zhongkongtai_xianshi");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_xianshiLessThanOrEqualTo(String value) {
            addCriterion("zhongkongtai_xianshi <=", value, "zhongkongtai_xianshi");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_xianshiLike(String value) {
            addCriterion("zhongkongtai_xianshi like", value, "zhongkongtai_xianshi");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_xianshiNotLike(String value) {
            addCriterion("zhongkongtai_xianshi not like", value, "zhongkongtai_xianshi");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_xianshiIn(List<String> values) {
            addCriterion("zhongkongtai_xianshi in", values, "zhongkongtai_xianshi");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_xianshiNotIn(List<String> values) {
            addCriterion("zhongkongtai_xianshi not in", values, "zhongkongtai_xianshi");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_xianshiBetween(String value1, String value2) {
            addCriterion("zhongkongtai_xianshi between", value1, value2, "zhongkongtai_xianshi");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_xianshiNotBetween(String value1, String value2) {
            addCriterion("zhongkongtai_xianshi not between", value1, value2, "zhongkongtai_xianshi");
            return (Criteria) this;
        }
        public Criteria andLanyachezaidianhuIsNull() {
            addCriterion("lanyachezaidianhu is null");
            return (Criteria) this;
        }
        public Criteria andLanyachezaidianhuIsNotNull() {
            addCriterion("lanyachezaidianhu is not null");
            return (Criteria) this;
        }
        public Criteria andLanyachezaidianhuEqualTo(String value) {
            addCriterion("lanyachezaidianhu =", value, "lanyachezaidianhu");
            return (Criteria) this;
        }
        public Criteria andLanyachezaidianhuNotEqualTo(String value) {
            addCriterion("lanyachezaidianhu <>", value, "lanyachezaidianhu");
            return (Criteria) this;
        }
        public Criteria andLanyachezaidianhuGreaterThan(String value) {
            addCriterion("lanyachezaidianhu >", value, "lanyachezaidianhu");
            return (Criteria) this;
        }
        public Criteria andLanyachezaidianhuGreaterThanOrEqualTo(String value) {
            addCriterion("lanyachezaidianhu >=", value, "lanyachezaidianhu");
            return (Criteria) this;
        }
        public Criteria andLanyachezaidianhuLessThan(String value) {
            addCriterion("lanyachezaidianhu <", value, "lanyachezaidianhu");
            return (Criteria) this;
        }
        public Criteria andLanyachezaidianhuLessThanOrEqualTo(String value) {
            addCriterion("lanyachezaidianhu <=", value, "lanyachezaidianhu");
            return (Criteria) this;
        }
        public Criteria andLanyachezaidianhuLike(String value) {
            addCriterion("lanyachezaidianhu like", value, "lanyachezaidianhu");
            return (Criteria) this;
        }
        public Criteria andLanyachezaidianhuNotLike(String value) {
            addCriterion("lanyachezaidianhu not like", value, "lanyachezaidianhu");
            return (Criteria) this;
        }
        public Criteria andLanyachezaidianhuIn(List<String> values) {
            addCriterion("lanyachezaidianhu in", values, "lanyachezaidianhu");
            return (Criteria) this;
        }
        public Criteria andLanyachezaidianhuNotIn(List<String> values) {
            addCriterion("lanyachezaidianhu not in", values, "lanyachezaidianhu");
            return (Criteria) this;
        }
        public Criteria andLanyachezaidianhuBetween(String value1, String value2) {
            addCriterion("lanyachezaidianhu between", value1, value2, "lanyachezaidianhu");
            return (Criteria) this;
        }
        public Criteria andLanyachezaidianhuNotBetween(String value1, String value2) {
            addCriterion("lanyachezaidianhu not between", value1, value2, "lanyachezaidianhu");
            return (Criteria) this;
        }
        public Criteria andShoujihulianyingsheIsNull() {
            addCriterion("shoujihulianyingshe is null");
            return (Criteria) this;
        }
        public Criteria andShoujihulianyingsheIsNotNull() {
            addCriterion("shoujihulianyingshe is not null");
            return (Criteria) this;
        }
        public Criteria andShoujihulianyingsheEqualTo(String value) {
            addCriterion("shoujihulianyingshe =", value, "shoujihulianyingshe");
            return (Criteria) this;
        }
        public Criteria andShoujihulianyingsheNotEqualTo(String value) {
            addCriterion("shoujihulianyingshe <>", value, "shoujihulianyingshe");
            return (Criteria) this;
        }
        public Criteria andShoujihulianyingsheGreaterThan(String value) {
            addCriterion("shoujihulianyingshe >", value, "shoujihulianyingshe");
            return (Criteria) this;
        }
        public Criteria andShoujihulianyingsheGreaterThanOrEqualTo(String value) {
            addCriterion("shoujihulianyingshe >=", value, "shoujihulianyingshe");
            return (Criteria) this;
        }
        public Criteria andShoujihulianyingsheLessThan(String value) {
            addCriterion("shoujihulianyingshe <", value, "shoujihulianyingshe");
            return (Criteria) this;
        }
        public Criteria andShoujihulianyingsheLessThanOrEqualTo(String value) {
            addCriterion("shoujihulianyingshe <=", value, "shoujihulianyingshe");
            return (Criteria) this;
        }
        public Criteria andShoujihulianyingsheLike(String value) {
            addCriterion("shoujihulianyingshe like", value, "shoujihulianyingshe");
            return (Criteria) this;
        }
        public Criteria andShoujihulianyingsheNotLike(String value) {
            addCriterion("shoujihulianyingshe not like", value, "shoujihulianyingshe");
            return (Criteria) this;
        }
        public Criteria andShoujihulianyingsheIn(List<String> values) {
            addCriterion("shoujihulianyingshe in", values, "shoujihulianyingshe");
            return (Criteria) this;
        }
        public Criteria andShoujihulianyingsheNotIn(List<String> values) {
            addCriterion("shoujihulianyingshe not in", values, "shoujihulianyingshe");
            return (Criteria) this;
        }
        public Criteria andShoujihulianyingsheBetween(String value1, String value2) {
            addCriterion("shoujihulianyingshe between", value1, value2, "shoujihulianyingshe");
            return (Criteria) this;
        }
        public Criteria andShoujihulianyingsheNotBetween(String value1, String value2) {
            addCriterion("shoujihulianyingshe not between", value1, value2, "shoujihulianyingshe");
            return (Criteria) this;
        }
        public Criteria andChelianwangIsNull() {
            addCriterion("chelianwang is null");
            return (Criteria) this;
        }
        public Criteria andChelianwangIsNotNull() {
            addCriterion("chelianwang is not null");
            return (Criteria) this;
        }
        public Criteria andChelianwangEqualTo(String value) {
            addCriterion("chelianwang =", value, "chelianwang");
            return (Criteria) this;
        }
        public Criteria andChelianwangNotEqualTo(String value) {
            addCriterion("chelianwang <>", value, "chelianwang");
            return (Criteria) this;
        }
        public Criteria andChelianwangGreaterThan(String value) {
            addCriterion("chelianwang >", value, "chelianwang");
            return (Criteria) this;
        }
        public Criteria andChelianwangGreaterThanOrEqualTo(String value) {
            addCriterion("chelianwang >=", value, "chelianwang");
            return (Criteria) this;
        }
        public Criteria andChelianwangLessThan(String value) {
            addCriterion("chelianwang <", value, "chelianwang");
            return (Criteria) this;
        }
        public Criteria andChelianwangLessThanOrEqualTo(String value) {
            addCriterion("chelianwang <=", value, "chelianwang");
            return (Criteria) this;
        }
        public Criteria andChelianwangLike(String value) {
            addCriterion("chelianwang like", value, "chelianwang");
            return (Criteria) this;
        }
        public Criteria andChelianwangNotLike(String value) {
            addCriterion("chelianwang not like", value, "chelianwang");
            return (Criteria) this;
        }
        public Criteria andChelianwangIn(List<String> values) {
            addCriterion("chelianwang in", values, "chelianwang");
            return (Criteria) this;
        }
        public Criteria andChelianwangNotIn(List<String> values) {
            addCriterion("chelianwang not in", values, "chelianwang");
            return (Criteria) this;
        }
        public Criteria andChelianwangBetween(String value1, String value2) {
            addCriterion("chelianwang between", value1, value2, "chelianwang");
            return (Criteria) this;
        }
        public Criteria andChelianwangNotBetween(String value1, String value2) {
            addCriterion("chelianwang not between", value1, value2, "chelianwang");
            return (Criteria) this;
        }
        public Criteria andChezaidianshiIsNull() {
            addCriterion("chezaidianshi is null");
            return (Criteria) this;
        }
        public Criteria andChezaidianshiIsNotNull() {
            addCriterion("chezaidianshi is not null");
            return (Criteria) this;
        }
        public Criteria andChezaidianshiEqualTo(String value) {
            addCriterion("chezaidianshi =", value, "chezaidianshi");
            return (Criteria) this;
        }
        public Criteria andChezaidianshiNotEqualTo(String value) {
            addCriterion("chezaidianshi <>", value, "chezaidianshi");
            return (Criteria) this;
        }
        public Criteria andChezaidianshiGreaterThan(String value) {
            addCriterion("chezaidianshi >", value, "chezaidianshi");
            return (Criteria) this;
        }
        public Criteria andChezaidianshiGreaterThanOrEqualTo(String value) {
            addCriterion("chezaidianshi >=", value, "chezaidianshi");
            return (Criteria) this;
        }
        public Criteria andChezaidianshiLessThan(String value) {
            addCriterion("chezaidianshi <", value, "chezaidianshi");
            return (Criteria) this;
        }
        public Criteria andChezaidianshiLessThanOrEqualTo(String value) {
            addCriterion("chezaidianshi <=", value, "chezaidianshi");
            return (Criteria) this;
        }
        public Criteria andChezaidianshiLike(String value) {
            addCriterion("chezaidianshi like", value, "chezaidianshi");
            return (Criteria) this;
        }
        public Criteria andChezaidianshiNotLike(String value) {
            addCriterion("chezaidianshi not like", value, "chezaidianshi");
            return (Criteria) this;
        }
        public Criteria andChezaidianshiIn(List<String> values) {
            addCriterion("chezaidianshi in", values, "chezaidianshi");
            return (Criteria) this;
        }
        public Criteria andChezaidianshiNotIn(List<String> values) {
            addCriterion("chezaidianshi not in", values, "chezaidianshi");
            return (Criteria) this;
        }
        public Criteria andChezaidianshiBetween(String value1, String value2) {
            addCriterion("chezaidianshi between", value1, value2, "chezaidianshi");
            return (Criteria) this;
        }
        public Criteria andChezaidianshiNotBetween(String value1, String value2) {
            addCriterion("chezaidianshi not between", value1, value2, "chezaidianshi");
            return (Criteria) this;
        }
        public Criteria andHoupaiyiejingpingIsNull() {
            addCriterion("houpaiyiejingping is null");
            return (Criteria) this;
        }
        public Criteria andHoupaiyiejingpingIsNotNull() {
            addCriterion("houpaiyiejingping is not null");
            return (Criteria) this;
        }
        public Criteria andHoupaiyiejingpingEqualTo(String value) {
            addCriterion("houpaiyiejingping =", value, "houpaiyiejingping");
            return (Criteria) this;
        }
        public Criteria andHoupaiyiejingpingNotEqualTo(String value) {
            addCriterion("houpaiyiejingping <>", value, "houpaiyiejingping");
            return (Criteria) this;
        }
        public Criteria andHoupaiyiejingpingGreaterThan(String value) {
            addCriterion("houpaiyiejingping >", value, "houpaiyiejingping");
            return (Criteria) this;
        }
        public Criteria andHoupaiyiejingpingGreaterThanOrEqualTo(String value) {
            addCriterion("houpaiyiejingping >=", value, "houpaiyiejingping");
            return (Criteria) this;
        }
        public Criteria andHoupaiyiejingpingLessThan(String value) {
            addCriterion("houpaiyiejingping <", value, "houpaiyiejingping");
            return (Criteria) this;
        }
        public Criteria andHoupaiyiejingpingLessThanOrEqualTo(String value) {
            addCriterion("houpaiyiejingping <=", value, "houpaiyiejingping");
            return (Criteria) this;
        }
        public Criteria andHoupaiyiejingpingLike(String value) {
            addCriterion("houpaiyiejingping like", value, "houpaiyiejingping");
            return (Criteria) this;
        }
        public Criteria andHoupaiyiejingpingNotLike(String value) {
            addCriterion("houpaiyiejingping not like", value, "houpaiyiejingping");
            return (Criteria) this;
        }
        public Criteria andHoupaiyiejingpingIn(List<String> values) {
            addCriterion("houpaiyiejingping in", values, "houpaiyiejingping");
            return (Criteria) this;
        }
        public Criteria andHoupaiyiejingpingNotIn(List<String> values) {
            addCriterion("houpaiyiejingping not in", values, "houpaiyiejingping");
            return (Criteria) this;
        }
        public Criteria andHoupaiyiejingpingBetween(String value1, String value2) {
            addCriterion("houpaiyiejingping between", value1, value2, "houpaiyiejingping");
            return (Criteria) this;
        }
        public Criteria andHoupaiyiejingpingNotBetween(String value1, String value2) {
            addCriterion("houpaiyiejingping not between", value1, value2, "houpaiyiejingping");
            return (Criteria) this;
        }
        public Criteria andDianyuanIsNull() {
            addCriterion("dianyuan is null");
            return (Criteria) this;
        }
        public Criteria andDianyuanIsNotNull() {
            addCriterion("dianyuan is not null");
            return (Criteria) this;
        }
        public Criteria andDianyuanEqualTo(String value) {
            addCriterion("dianyuan =", value, "dianyuan");
            return (Criteria) this;
        }
        public Criteria andDianyuanNotEqualTo(String value) {
            addCriterion("dianyuan <>", value, "dianyuan");
            return (Criteria) this;
        }
        public Criteria andDianyuanGreaterThan(String value) {
            addCriterion("dianyuan >", value, "dianyuan");
            return (Criteria) this;
        }
        public Criteria andDianyuanGreaterThanOrEqualTo(String value) {
            addCriterion("dianyuan >=", value, "dianyuan");
            return (Criteria) this;
        }
        public Criteria andDianyuanLessThan(String value) {
            addCriterion("dianyuan <", value, "dianyuan");
            return (Criteria) this;
        }
        public Criteria andDianyuanLessThanOrEqualTo(String value) {
            addCriterion("dianyuan <=", value, "dianyuan");
            return (Criteria) this;
        }
        public Criteria andDianyuanLike(String value) {
            addCriterion("dianyuan like", value, "dianyuan");
            return (Criteria) this;
        }
        public Criteria andDianyuanNotLike(String value) {
            addCriterion("dianyuan not like", value, "dianyuan");
            return (Criteria) this;
        }
        public Criteria andDianyuanIn(List<String> values) {
            addCriterion("dianyuan in", values, "dianyuan");
            return (Criteria) this;
        }
        public Criteria andDianyuanNotIn(List<String> values) {
            addCriterion("dianyuan not in", values, "dianyuan");
            return (Criteria) this;
        }
        public Criteria andDianyuanBetween(String value1, String value2) {
            addCriterion("dianyuan between", value1, value2, "dianyuan");
            return (Criteria) this;
        }
        public Criteria andDianyuanNotBetween(String value1, String value2) {
            addCriterion("dianyuan not between", value1, value2, "dianyuan");
            return (Criteria) this;
        }
        public Criteria andWaijieyinwuanjiekouIsNull() {
            addCriterion("waijieyinwuanjiekou is null");
            return (Criteria) this;
        }
        public Criteria andWaijieyinwuanjiekouIsNotNull() {
            addCriterion("waijieyinwuanjiekou is not null");
            return (Criteria) this;
        }
        public Criteria andWaijieyinwuanjiekouEqualTo(String value) {
            addCriterion("waijieyinwuanjiekou =", value, "waijieyinwuanjiekou");
            return (Criteria) this;
        }
        public Criteria andWaijieyinwuanjiekouNotEqualTo(String value) {
            addCriterion("waijieyinwuanjiekou <>", value, "waijieyinwuanjiekou");
            return (Criteria) this;
        }
        public Criteria andWaijieyinwuanjiekouGreaterThan(String value) {
            addCriterion("waijieyinwuanjiekou >", value, "waijieyinwuanjiekou");
            return (Criteria) this;
        }
        public Criteria andWaijieyinwuanjiekouGreaterThanOrEqualTo(String value) {
            addCriterion("waijieyinwuanjiekou >=", value, "waijieyinwuanjiekou");
            return (Criteria) this;
        }
        public Criteria andWaijieyinwuanjiekouLessThan(String value) {
            addCriterion("waijieyinwuanjiekou <", value, "waijieyinwuanjiekou");
            return (Criteria) this;
        }
        public Criteria andWaijieyinwuanjiekouLessThanOrEqualTo(String value) {
            addCriterion("waijieyinwuanjiekou <=", value, "waijieyinwuanjiekou");
            return (Criteria) this;
        }
        public Criteria andWaijieyinwuanjiekouLike(String value) {
            addCriterion("waijieyinwuanjiekou like", value, "waijieyinwuanjiekou");
            return (Criteria) this;
        }
        public Criteria andWaijieyinwuanjiekouNotLike(String value) {
            addCriterion("waijieyinwuanjiekou not like", value, "waijieyinwuanjiekou");
            return (Criteria) this;
        }
        public Criteria andWaijieyinwuanjiekouIn(List<String> values) {
            addCriterion("waijieyinwuanjiekou in", values, "waijieyinwuanjiekou");
            return (Criteria) this;
        }
        public Criteria andWaijieyinwuanjiekouNotIn(List<String> values) {
            addCriterion("waijieyinwuanjiekou not in", values, "waijieyinwuanjiekou");
            return (Criteria) this;
        }
        public Criteria andWaijieyinwuanjiekouBetween(String value1, String value2) {
            addCriterion("waijieyinwuanjiekou between", value1, value2, "waijieyinwuanjiekou");
            return (Criteria) this;
        }
        public Criteria andWaijieyinwuanjiekouNotBetween(String value1, String value2) {
            addCriterion("waijieyinwuanjiekou not between", value1, value2, "waijieyinwuanjiekou");
            return (Criteria) this;
        }
        public Criteria andCDDVDIsNull() {
            addCriterion("CDDVD is null");
            return (Criteria) this;
        }
        public Criteria andCDDVDIsNotNull() {
            addCriterion("CDDVD is not null");
            return (Criteria) this;
        }
        public Criteria andCDDVDEqualTo(String value) {
            addCriterion("CDDVD =", value, "CDDVD");
            return (Criteria) this;
        }
        public Criteria andCDDVDNotEqualTo(String value) {
            addCriterion("CDDVD <>", value, "CDDVD");
            return (Criteria) this;
        }
        public Criteria andCDDVDGreaterThan(String value) {
            addCriterion("CDDVD >", value, "CDDVD");
            return (Criteria) this;
        }
        public Criteria andCDDVDGreaterThanOrEqualTo(String value) {
            addCriterion("CDDVD >=", value, "CDDVD");
            return (Criteria) this;
        }
        public Criteria andCDDVDLessThan(String value) {
            addCriterion("CDDVD <", value, "CDDVD");
            return (Criteria) this;
        }
        public Criteria andCDDVDLessThanOrEqualTo(String value) {
            addCriterion("CDDVD <=", value, "CDDVD");
            return (Criteria) this;
        }
        public Criteria andCDDVDLike(String value) {
            addCriterion("CDDVD like", value, "CDDVD");
            return (Criteria) this;
        }
        public Criteria andCDDVDNotLike(String value) {
            addCriterion("CDDVD not like", value, "CDDVD");
            return (Criteria) this;
        }
        public Criteria andCDDVDIn(List<String> values) {
            addCriterion("CDDVD in", values, "CDDVD");
            return (Criteria) this;
        }
        public Criteria andCDDVDNotIn(List<String> values) {
            addCriterion("CDDVD not in", values, "CDDVD");
            return (Criteria) this;
        }
        public Criteria andCDDVDBetween(String value1, String value2) {
            addCriterion("CDDVD between", value1, value2, "CDDVD");
            return (Criteria) this;
        }
        public Criteria andCDDVDNotBetween(String value1, String value2) {
            addCriterion("CDDVD not between", value1, value2, "CDDVD");
            return (Criteria) this;
        }
        public Criteria andYinxhangpinpaiIsNull() {
            addCriterion("yinxhangpinpai is null");
            return (Criteria) this;
        }
        public Criteria andYinxhangpinpaiIsNotNull() {
            addCriterion("yinxhangpinpai is not null");
            return (Criteria) this;
        }
        public Criteria andYinxhangpinpaiEqualTo(String value) {
            addCriterion("yinxhangpinpai =", value, "yinxhangpinpai");
            return (Criteria) this;
        }
        public Criteria andYinxhangpinpaiNotEqualTo(String value) {
            addCriterion("yinxhangpinpai <>", value, "yinxhangpinpai");
            return (Criteria) this;
        }
        public Criteria andYinxhangpinpaiGreaterThan(String value) {
            addCriterion("yinxhangpinpai >", value, "yinxhangpinpai");
            return (Criteria) this;
        }
        public Criteria andYinxhangpinpaiGreaterThanOrEqualTo(String value) {
            addCriterion("yinxhangpinpai >=", value, "yinxhangpinpai");
            return (Criteria) this;
        }
        public Criteria andYinxhangpinpaiLessThan(String value) {
            addCriterion("yinxhangpinpai <", value, "yinxhangpinpai");
            return (Criteria) this;
        }
        public Criteria andYinxhangpinpaiLessThanOrEqualTo(String value) {
            addCriterion("yinxhangpinpai <=", value, "yinxhangpinpai");
            return (Criteria) this;
        }
        public Criteria andYinxhangpinpaiLike(String value) {
            addCriterion("yinxhangpinpai like", value, "yinxhangpinpai");
            return (Criteria) this;
        }
        public Criteria andYinxhangpinpaiNotLike(String value) {
            addCriterion("yinxhangpinpai not like", value, "yinxhangpinpai");
            return (Criteria) this;
        }
        public Criteria andYinxhangpinpaiIn(List<String> values) {
            addCriterion("yinxhangpinpai in", values, "yinxhangpinpai");
            return (Criteria) this;
        }
        public Criteria andYinxhangpinpaiNotIn(List<String> values) {
            addCriterion("yinxhangpinpai not in", values, "yinxhangpinpai");
            return (Criteria) this;
        }
        public Criteria andYinxhangpinpaiBetween(String value1, String value2) {
            addCriterion("yinxhangpinpai between", value1, value2, "yinxhangpinpai");
            return (Criteria) this;
        }
        public Criteria andYinxhangpinpaiNotBetween(String value1, String value2) {
            addCriterion("yinxhangpinpai not between", value1, value2, "yinxhangpinpai");
            return (Criteria) this;
        }
        public Criteria andYinxiangshuliangIsNull() {
            addCriterion("yinxiangshuliang is null");
            return (Criteria) this;
        }
        public Criteria andYinxiangshuliangIsNotNull() {
            addCriterion("yinxiangshuliang is not null");
            return (Criteria) this;
        }
        public Criteria andYinxiangshuliangEqualTo(String value) {
            addCriterion("yinxiangshuliang =", value, "yinxiangshuliang");
            return (Criteria) this;
        }
        public Criteria andYinxiangshuliangNotEqualTo(String value) {
            addCriterion("yinxiangshuliang <>", value, "yinxiangshuliang");
            return (Criteria) this;
        }
        public Criteria andYinxiangshuliangGreaterThan(String value) {
            addCriterion("yinxiangshuliang >", value, "yinxiangshuliang");
            return (Criteria) this;
        }
        public Criteria andYinxiangshuliangGreaterThanOrEqualTo(String value) {
            addCriterion("yinxiangshuliang >=", value, "yinxiangshuliang");
            return (Criteria) this;
        }
        public Criteria andYinxiangshuliangLessThan(String value) {
            addCriterion("yinxiangshuliang <", value, "yinxiangshuliang");
            return (Criteria) this;
        }
        public Criteria andYinxiangshuliangLessThanOrEqualTo(String value) {
            addCriterion("yinxiangshuliang <=", value, "yinxiangshuliang");
            return (Criteria) this;
        }
        public Criteria andYinxiangshuliangLike(String value) {
            addCriterion("yinxiangshuliang like", value, "yinxiangshuliang");
            return (Criteria) this;
        }
        public Criteria andYinxiangshuliangNotLike(String value) {
            addCriterion("yinxiangshuliang not like", value, "yinxiangshuliang");
            return (Criteria) this;
        }
        public Criteria andYinxiangshuliangIn(List<String> values) {
            addCriterion("yinxiangshuliang in", values, "yinxiangshuliang");
            return (Criteria) this;
        }
        public Criteria andYinxiangshuliangNotIn(List<String> values) {
            addCriterion("yinxiangshuliang not in", values, "yinxiangshuliang");
            return (Criteria) this;
        }
        public Criteria andYinxiangshuliangBetween(String value1, String value2) {
            addCriterion("yinxiangshuliang between", value1, value2, "yinxiangshuliang");
            return (Criteria) this;
        }
        public Criteria andYinxiangshuliangNotBetween(String value1, String value2) {
            addCriterion("yinxiangshuliang not between", value1, value2, "yinxiangshuliang");
            return (Criteria) this;
        }
        public Criteria andJinguangdengIsNull() {
            addCriterion("jinguangdeng is null");
            return (Criteria) this;
        }
        public Criteria andJinguangdengIsNotNull() {
            addCriterion("jinguangdeng is not null");
            return (Criteria) this;
        }
        public Criteria andJinguangdengEqualTo(String value) {
            addCriterion("jinguangdeng =", value, "jinguangdeng");
            return (Criteria) this;
        }
        public Criteria andJinguangdengNotEqualTo(String value) {
            addCriterion("jinguangdeng <>", value, "jinguangdeng");
            return (Criteria) this;
        }
        public Criteria andJinguangdengGreaterThan(String value) {
            addCriterion("jinguangdeng >", value, "jinguangdeng");
            return (Criteria) this;
        }
        public Criteria andJinguangdengGreaterThanOrEqualTo(String value) {
            addCriterion("jinguangdeng >=", value, "jinguangdeng");
            return (Criteria) this;
        }
        public Criteria andJinguangdengLessThan(String value) {
            addCriterion("jinguangdeng <", value, "jinguangdeng");
            return (Criteria) this;
        }
        public Criteria andJinguangdengLessThanOrEqualTo(String value) {
            addCriterion("jinguangdeng <=", value, "jinguangdeng");
            return (Criteria) this;
        }
        public Criteria andJinguangdengLike(String value) {
            addCriterion("jinguangdeng like", value, "jinguangdeng");
            return (Criteria) this;
        }
        public Criteria andJinguangdengNotLike(String value) {
            addCriterion("jinguangdeng not like", value, "jinguangdeng");
            return (Criteria) this;
        }
        public Criteria andJinguangdengIn(List<String> values) {
            addCriterion("jinguangdeng in", values, "jinguangdeng");
            return (Criteria) this;
        }
        public Criteria andJinguangdengNotIn(List<String> values) {
            addCriterion("jinguangdeng not in", values, "jinguangdeng");
            return (Criteria) this;
        }
        public Criteria andJinguangdengBetween(String value1, String value2) {
            addCriterion("jinguangdeng between", value1, value2, "jinguangdeng");
            return (Criteria) this;
        }
        public Criteria andJinguangdengNotBetween(String value1, String value2) {
            addCriterion("jinguangdeng not between", value1, value2, "jinguangdeng");
            return (Criteria) this;
        }
        public Criteria andYuanguangdengIsNull() {
            addCriterion("yuanguangdeng is null");
            return (Criteria) this;
        }
        public Criteria andYuanguangdengIsNotNull() {
            addCriterion("yuanguangdeng is not null");
            return (Criteria) this;
        }
        public Criteria andYuanguangdengEqualTo(String value) {
            addCriterion("yuanguangdeng =", value, "yuanguangdeng");
            return (Criteria) this;
        }
        public Criteria andYuanguangdengNotEqualTo(String value) {
            addCriterion("yuanguangdeng <>", value, "yuanguangdeng");
            return (Criteria) this;
        }
        public Criteria andYuanguangdengGreaterThan(String value) {
            addCriterion("yuanguangdeng >", value, "yuanguangdeng");
            return (Criteria) this;
        }
        public Criteria andYuanguangdengGreaterThanOrEqualTo(String value) {
            addCriterion("yuanguangdeng >=", value, "yuanguangdeng");
            return (Criteria) this;
        }
        public Criteria andYuanguangdengLessThan(String value) {
            addCriterion("yuanguangdeng <", value, "yuanguangdeng");
            return (Criteria) this;
        }
        public Criteria andYuanguangdengLessThanOrEqualTo(String value) {
            addCriterion("yuanguangdeng <=", value, "yuanguangdeng");
            return (Criteria) this;
        }
        public Criteria andYuanguangdengLike(String value) {
            addCriterion("yuanguangdeng like", value, "yuanguangdeng");
            return (Criteria) this;
        }
        public Criteria andYuanguangdengNotLike(String value) {
            addCriterion("yuanguangdeng not like", value, "yuanguangdeng");
            return (Criteria) this;
        }
        public Criteria andYuanguangdengIn(List<String> values) {
            addCriterion("yuanguangdeng in", values, "yuanguangdeng");
            return (Criteria) this;
        }
        public Criteria andYuanguangdengNotIn(List<String> values) {
            addCriterion("yuanguangdeng not in", values, "yuanguangdeng");
            return (Criteria) this;
        }
        public Criteria andYuanguangdengBetween(String value1, String value2) {
            addCriterion("yuanguangdeng between", value1, value2, "yuanguangdeng");
            return (Criteria) this;
        }
        public Criteria andYuanguangdengNotBetween(String value1, String value2) {
            addCriterion("yuanguangdeng not between", value1, value2, "yuanguangdeng");
            return (Criteria) this;
        }
        public Criteria andLEDIsNull() {
            addCriterion("LED is null");
            return (Criteria) this;
        }
        public Criteria andLEDIsNotNull() {
            addCriterion("LED is not null");
            return (Criteria) this;
        }
        public Criteria andLEDEqualTo(String value) {
            addCriterion("LED =", value, "LED");
            return (Criteria) this;
        }
        public Criteria andLEDNotEqualTo(String value) {
            addCriterion("LED <>", value, "LED");
            return (Criteria) this;
        }
        public Criteria andLEDGreaterThan(String value) {
            addCriterion("LED >", value, "LED");
            return (Criteria) this;
        }
        public Criteria andLEDGreaterThanOrEqualTo(String value) {
            addCriterion("LED >=", value, "LED");
            return (Criteria) this;
        }
        public Criteria andLEDLessThan(String value) {
            addCriterion("LED <", value, "LED");
            return (Criteria) this;
        }
        public Criteria andLEDLessThanOrEqualTo(String value) {
            addCriterion("LED <=", value, "LED");
            return (Criteria) this;
        }
        public Criteria andLEDLike(String value) {
            addCriterion("LED like", value, "LED");
            return (Criteria) this;
        }
        public Criteria andLEDNotLike(String value) {
            addCriterion("LED not like", value, "LED");
            return (Criteria) this;
        }
        public Criteria andLEDIn(List<String> values) {
            addCriterion("LED in", values, "LED");
            return (Criteria) this;
        }
        public Criteria andLEDNotIn(List<String> values) {
            addCriterion("LED not in", values, "LED");
            return (Criteria) this;
        }
        public Criteria andLEDBetween(String value1, String value2) {
            addCriterion("LED between", value1, value2, "LED");
            return (Criteria) this;
        }
        public Criteria andLEDNotBetween(String value1, String value2) {
            addCriterion("LED not between", value1, value2, "LED");
            return (Criteria) this;
        }
        public Criteria andZishiyingyuanjinguangIsNull() {
            addCriterion("zishiyingyuanjinguang is null");
            return (Criteria) this;
        }
        public Criteria andZishiyingyuanjinguangIsNotNull() {
            addCriterion("zishiyingyuanjinguang is not null");
            return (Criteria) this;
        }
        public Criteria andZishiyingyuanjinguangEqualTo(String value) {
            addCriterion("zishiyingyuanjinguang =", value, "zishiyingyuanjinguang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyuanjinguangNotEqualTo(String value) {
            addCriterion("zishiyingyuanjinguang <>", value, "zishiyingyuanjinguang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyuanjinguangGreaterThan(String value) {
            addCriterion("zishiyingyuanjinguang >", value, "zishiyingyuanjinguang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyuanjinguangGreaterThanOrEqualTo(String value) {
            addCriterion("zishiyingyuanjinguang >=", value, "zishiyingyuanjinguang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyuanjinguangLessThan(String value) {
            addCriterion("zishiyingyuanjinguang <", value, "zishiyingyuanjinguang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyuanjinguangLessThanOrEqualTo(String value) {
            addCriterion("zishiyingyuanjinguang <=", value, "zishiyingyuanjinguang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyuanjinguangLike(String value) {
            addCriterion("zishiyingyuanjinguang like", value, "zishiyingyuanjinguang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyuanjinguangNotLike(String value) {
            addCriterion("zishiyingyuanjinguang not like", value, "zishiyingyuanjinguang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyuanjinguangIn(List<String> values) {
            addCriterion("zishiyingyuanjinguang in", values, "zishiyingyuanjinguang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyuanjinguangNotIn(List<String> values) {
            addCriterion("zishiyingyuanjinguang not in", values, "zishiyingyuanjinguang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyuanjinguangBetween(String value1, String value2) {
            addCriterion("zishiyingyuanjinguang between", value1, value2, "zishiyingyuanjinguang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyuanjinguangNotBetween(String value1, String value2) {
            addCriterion("zishiyingyuanjinguang not between", value1, value2, "zishiyingyuanjinguang");
            return (Criteria) this;
        }
        public Criteria andZidongtoudengIsNull() {
            addCriterion("zidongtoudeng is null");
            return (Criteria) this;
        }
        public Criteria andZidongtoudengIsNotNull() {
            addCriterion("zidongtoudeng is not null");
            return (Criteria) this;
        }
        public Criteria andZidongtoudengEqualTo(String value) {
            addCriterion("zidongtoudeng =", value, "zidongtoudeng");
            return (Criteria) this;
        }
        public Criteria andZidongtoudengNotEqualTo(String value) {
            addCriterion("zidongtoudeng <>", value, "zidongtoudeng");
            return (Criteria) this;
        }
        public Criteria andZidongtoudengGreaterThan(String value) {
            addCriterion("zidongtoudeng >", value, "zidongtoudeng");
            return (Criteria) this;
        }
        public Criteria andZidongtoudengGreaterThanOrEqualTo(String value) {
            addCriterion("zidongtoudeng >=", value, "zidongtoudeng");
            return (Criteria) this;
        }
        public Criteria andZidongtoudengLessThan(String value) {
            addCriterion("zidongtoudeng <", value, "zidongtoudeng");
            return (Criteria) this;
        }
        public Criteria andZidongtoudengLessThanOrEqualTo(String value) {
            addCriterion("zidongtoudeng <=", value, "zidongtoudeng");
            return (Criteria) this;
        }
        public Criteria andZidongtoudengLike(String value) {
            addCriterion("zidongtoudeng like", value, "zidongtoudeng");
            return (Criteria) this;
        }
        public Criteria andZidongtoudengNotLike(String value) {
            addCriterion("zidongtoudeng not like", value, "zidongtoudeng");
            return (Criteria) this;
        }
        public Criteria andZidongtoudengIn(List<String> values) {
            addCriterion("zidongtoudeng in", values, "zidongtoudeng");
            return (Criteria) this;
        }
        public Criteria andZidongtoudengNotIn(List<String> values) {
            addCriterion("zidongtoudeng not in", values, "zidongtoudeng");
            return (Criteria) this;
        }
        public Criteria andZidongtoudengBetween(String value1, String value2) {
            addCriterion("zidongtoudeng between", value1, value2, "zidongtoudeng");
            return (Criteria) this;
        }
        public Criteria andZidongtoudengNotBetween(String value1, String value2) {
            addCriterion("zidongtoudeng not between", value1, value2, "zidongtoudeng");
            return (Criteria) this;
        }
        public Criteria andZuangxhangfuzhudengIsNull() {
            addCriterion("zuangxhangfuzhudeng is null");
            return (Criteria) this;
        }
        public Criteria andZuangxhangfuzhudengIsNotNull() {
            addCriterion("zuangxhangfuzhudeng is not null");
            return (Criteria) this;
        }
        public Criteria andZuangxhangfuzhudengEqualTo(String value) {
            addCriterion("zuangxhangfuzhudeng =", value, "zuangxhangfuzhudeng");
            return (Criteria) this;
        }
        public Criteria andZuangxhangfuzhudengNotEqualTo(String value) {
            addCriterion("zuangxhangfuzhudeng <>", value, "zuangxhangfuzhudeng");
            return (Criteria) this;
        }
        public Criteria andZuangxhangfuzhudengGreaterThan(String value) {
            addCriterion("zuangxhangfuzhudeng >", value, "zuangxhangfuzhudeng");
            return (Criteria) this;
        }
        public Criteria andZuangxhangfuzhudengGreaterThanOrEqualTo(String value) {
            addCriterion("zuangxhangfuzhudeng >=", value, "zuangxhangfuzhudeng");
            return (Criteria) this;
        }
        public Criteria andZuangxhangfuzhudengLessThan(String value) {
            addCriterion("zuangxhangfuzhudeng <", value, "zuangxhangfuzhudeng");
            return (Criteria) this;
        }
        public Criteria andZuangxhangfuzhudengLessThanOrEqualTo(String value) {
            addCriterion("zuangxhangfuzhudeng <=", value, "zuangxhangfuzhudeng");
            return (Criteria) this;
        }
        public Criteria andZuangxhangfuzhudengLike(String value) {
            addCriterion("zuangxhangfuzhudeng like", value, "zuangxhangfuzhudeng");
            return (Criteria) this;
        }
        public Criteria andZuangxhangfuzhudengNotLike(String value) {
            addCriterion("zuangxhangfuzhudeng not like", value, "zuangxhangfuzhudeng");
            return (Criteria) this;
        }
        public Criteria andZuangxhangfuzhudengIn(List<String> values) {
            addCriterion("zuangxhangfuzhudeng in", values, "zuangxhangfuzhudeng");
            return (Criteria) this;
        }
        public Criteria andZuangxhangfuzhudengNotIn(List<String> values) {
            addCriterion("zuangxhangfuzhudeng not in", values, "zuangxhangfuzhudeng");
            return (Criteria) this;
        }
        public Criteria andZuangxhangfuzhudengBetween(String value1, String value2) {
            addCriterion("zuangxhangfuzhudeng between", value1, value2, "zuangxhangfuzhudeng");
            return (Criteria) this;
        }
        public Criteria andZuangxhangfuzhudengNotBetween(String value1, String value2) {
            addCriterion("zuangxhangfuzhudeng not between", value1, value2, "zuangxhangfuzhudeng");
            return (Criteria) this;
        }
        public Criteria andZhuangxhangdengIsNull() {
            addCriterion("zhuangxhangdeng is null");
            return (Criteria) this;
        }
        public Criteria andZhuangxhangdengIsNotNull() {
            addCriterion("zhuangxhangdeng is not null");
            return (Criteria) this;
        }
        public Criteria andZhuangxhangdengEqualTo(String value) {
            addCriterion("zhuangxhangdeng =", value, "zhuangxhangdeng");
            return (Criteria) this;
        }
        public Criteria andZhuangxhangdengNotEqualTo(String value) {
            addCriterion("zhuangxhangdeng <>", value, "zhuangxhangdeng");
            return (Criteria) this;
        }
        public Criteria andZhuangxhangdengGreaterThan(String value) {
            addCriterion("zhuangxhangdeng >", value, "zhuangxhangdeng");
            return (Criteria) this;
        }
        public Criteria andZhuangxhangdengGreaterThanOrEqualTo(String value) {
            addCriterion("zhuangxhangdeng >=", value, "zhuangxhangdeng");
            return (Criteria) this;
        }
        public Criteria andZhuangxhangdengLessThan(String value) {
            addCriterion("zhuangxhangdeng <", value, "zhuangxhangdeng");
            return (Criteria) this;
        }
        public Criteria andZhuangxhangdengLessThanOrEqualTo(String value) {
            addCriterion("zhuangxhangdeng <=", value, "zhuangxhangdeng");
            return (Criteria) this;
        }
        public Criteria andZhuangxhangdengLike(String value) {
            addCriterion("zhuangxhangdeng like", value, "zhuangxhangdeng");
            return (Criteria) this;
        }
        public Criteria andZhuangxhangdengNotLike(String value) {
            addCriterion("zhuangxhangdeng not like", value, "zhuangxhangdeng");
            return (Criteria) this;
        }
        public Criteria andZhuangxhangdengIn(List<String> values) {
            addCriterion("zhuangxhangdeng in", values, "zhuangxhangdeng");
            return (Criteria) this;
        }
        public Criteria andZhuangxhangdengNotIn(List<String> values) {
            addCriterion("zhuangxhangdeng not in", values, "zhuangxhangdeng");
            return (Criteria) this;
        }
        public Criteria andZhuangxhangdengBetween(String value1, String value2) {
            addCriterion("zhuangxhangdeng between", value1, value2, "zhuangxhangdeng");
            return (Criteria) this;
        }
        public Criteria andZhuangxhangdengNotBetween(String value1, String value2) {
            addCriterion("zhuangxhangdeng not between", value1, value2, "zhuangxhangdeng");
            return (Criteria) this;
        }
        public Criteria andQianwedingIsNull() {
            addCriterion("qianweding is null");
            return (Criteria) this;
        }
        public Criteria andQianwedingIsNotNull() {
            addCriterion("qianweding is not null");
            return (Criteria) this;
        }
        public Criteria andQianwedingEqualTo(String value) {
            addCriterion("qianweding =", value, "qianweding");
            return (Criteria) this;
        }
        public Criteria andQianwedingNotEqualTo(String value) {
            addCriterion("qianweding <>", value, "qianweding");
            return (Criteria) this;
        }
        public Criteria andQianwedingGreaterThan(String value) {
            addCriterion("qianweding >", value, "qianweding");
            return (Criteria) this;
        }
        public Criteria andQianwedingGreaterThanOrEqualTo(String value) {
            addCriterion("qianweding >=", value, "qianweding");
            return (Criteria) this;
        }
        public Criteria andQianwedingLessThan(String value) {
            addCriterion("qianweding <", value, "qianweding");
            return (Criteria) this;
        }
        public Criteria andQianwedingLessThanOrEqualTo(String value) {
            addCriterion("qianweding <=", value, "qianweding");
            return (Criteria) this;
        }
        public Criteria andQianwedingLike(String value) {
            addCriterion("qianweding like", value, "qianweding");
            return (Criteria) this;
        }
        public Criteria andQianwedingNotLike(String value) {
            addCriterion("qianweding not like", value, "qianweding");
            return (Criteria) this;
        }
        public Criteria andQianwedingIn(List<String> values) {
            addCriterion("qianweding in", values, "qianweding");
            return (Criteria) this;
        }
        public Criteria andQianwedingNotIn(List<String> values) {
            addCriterion("qianweding not in", values, "qianweding");
            return (Criteria) this;
        }
        public Criteria andQianwedingBetween(String value1, String value2) {
            addCriterion("qianweding between", value1, value2, "qianweding");
            return (Criteria) this;
        }
        public Criteria andQianwedingNotBetween(String value1, String value2) {
            addCriterion("qianweding not between", value1, value2, "qianweding");
            return (Criteria) this;
        }
        public Criteria andDadenggaodutijieIsNull() {
            addCriterion("dadenggaodutijie is null");
            return (Criteria) this;
        }
        public Criteria andDadenggaodutijieIsNotNull() {
            addCriterion("dadenggaodutijie is not null");
            return (Criteria) this;
        }
        public Criteria andDadenggaodutijieEqualTo(String value) {
            addCriterion("dadenggaodutijie =", value, "dadenggaodutijie");
            return (Criteria) this;
        }
        public Criteria andDadenggaodutijieNotEqualTo(String value) {
            addCriterion("dadenggaodutijie <>", value, "dadenggaodutijie");
            return (Criteria) this;
        }
        public Criteria andDadenggaodutijieGreaterThan(String value) {
            addCriterion("dadenggaodutijie >", value, "dadenggaodutijie");
            return (Criteria) this;
        }
        public Criteria andDadenggaodutijieGreaterThanOrEqualTo(String value) {
            addCriterion("dadenggaodutijie >=", value, "dadenggaodutijie");
            return (Criteria) this;
        }
        public Criteria andDadenggaodutijieLessThan(String value) {
            addCriterion("dadenggaodutijie <", value, "dadenggaodutijie");
            return (Criteria) this;
        }
        public Criteria andDadenggaodutijieLessThanOrEqualTo(String value) {
            addCriterion("dadenggaodutijie <=", value, "dadenggaodutijie");
            return (Criteria) this;
        }
        public Criteria andDadenggaodutijieLike(String value) {
            addCriterion("dadenggaodutijie like", value, "dadenggaodutijie");
            return (Criteria) this;
        }
        public Criteria andDadenggaodutijieNotLike(String value) {
            addCriterion("dadenggaodutijie not like", value, "dadenggaodutijie");
            return (Criteria) this;
        }
        public Criteria andDadenggaodutijieIn(List<String> values) {
            addCriterion("dadenggaodutijie in", values, "dadenggaodutijie");
            return (Criteria) this;
        }
        public Criteria andDadenggaodutijieNotIn(List<String> values) {
            addCriterion("dadenggaodutijie not in", values, "dadenggaodutijie");
            return (Criteria) this;
        }
        public Criteria andDadenggaodutijieBetween(String value1, String value2) {
            addCriterion("dadenggaodutijie between", value1, value2, "dadenggaodutijie");
            return (Criteria) this;
        }
        public Criteria andDadenggaodutijieNotBetween(String value1, String value2) {
            addCriterion("dadenggaodutijie not between", value1, value2, "dadenggaodutijie");
            return (Criteria) this;
        }
        public Criteria andDadengqingxizhuangzhiIsNull() {
            addCriterion("dadengqingxizhuangzhi is null");
            return (Criteria) this;
        }
        public Criteria andDadengqingxizhuangzhiIsNotNull() {
            addCriterion("dadengqingxizhuangzhi is not null");
            return (Criteria) this;
        }
        public Criteria andDadengqingxizhuangzhiEqualTo(String value) {
            addCriterion("dadengqingxizhuangzhi =", value, "dadengqingxizhuangzhi");
            return (Criteria) this;
        }
        public Criteria andDadengqingxizhuangzhiNotEqualTo(String value) {
            addCriterion("dadengqingxizhuangzhi <>", value, "dadengqingxizhuangzhi");
            return (Criteria) this;
        }
        public Criteria andDadengqingxizhuangzhiGreaterThan(String value) {
            addCriterion("dadengqingxizhuangzhi >", value, "dadengqingxizhuangzhi");
            return (Criteria) this;
        }
        public Criteria andDadengqingxizhuangzhiGreaterThanOrEqualTo(String value) {
            addCriterion("dadengqingxizhuangzhi >=", value, "dadengqingxizhuangzhi");
            return (Criteria) this;
        }
        public Criteria andDadengqingxizhuangzhiLessThan(String value) {
            addCriterion("dadengqingxizhuangzhi <", value, "dadengqingxizhuangzhi");
            return (Criteria) this;
        }
        public Criteria andDadengqingxizhuangzhiLessThanOrEqualTo(String value) {
            addCriterion("dadengqingxizhuangzhi <=", value, "dadengqingxizhuangzhi");
            return (Criteria) this;
        }
        public Criteria andDadengqingxizhuangzhiLike(String value) {
            addCriterion("dadengqingxizhuangzhi like", value, "dadengqingxizhuangzhi");
            return (Criteria) this;
        }
        public Criteria andDadengqingxizhuangzhiNotLike(String value) {
            addCriterion("dadengqingxizhuangzhi not like", value, "dadengqingxizhuangzhi");
            return (Criteria) this;
        }
        public Criteria andDadengqingxizhuangzhiIn(List<String> values) {
            addCriterion("dadengqingxizhuangzhi in", values, "dadengqingxizhuangzhi");
            return (Criteria) this;
        }
        public Criteria andDadengqingxizhuangzhiNotIn(List<String> values) {
            addCriterion("dadengqingxizhuangzhi not in", values, "dadengqingxizhuangzhi");
            return (Criteria) this;
        }
        public Criteria andDadengqingxizhuangzhiBetween(String value1, String value2) {
            addCriterion("dadengqingxizhuangzhi between", value1, value2, "dadengqingxizhuangzhi");
            return (Criteria) this;
        }
        public Criteria andDadengqingxizhuangzhiNotBetween(String value1, String value2) {
            addCriterion("dadengqingxizhuangzhi not between", value1, value2, "dadengqingxizhuangzhi");
            return (Criteria) this;
        }
        public Criteria andChennengfenweidengIsNull() {
            addCriterion("chennengfenweideng is null");
            return (Criteria) this;
        }
        public Criteria andChennengfenweidengIsNotNull() {
            addCriterion("chennengfenweideng is not null");
            return (Criteria) this;
        }
        public Criteria andChennengfenweidengEqualTo(String value) {
            addCriterion("chennengfenweideng =", value, "chennengfenweideng");
            return (Criteria) this;
        }
        public Criteria andChennengfenweidengNotEqualTo(String value) {
            addCriterion("chennengfenweideng <>", value, "chennengfenweideng");
            return (Criteria) this;
        }
        public Criteria andChennengfenweidengGreaterThan(String value) {
            addCriterion("chennengfenweideng >", value, "chennengfenweideng");
            return (Criteria) this;
        }
        public Criteria andChennengfenweidengGreaterThanOrEqualTo(String value) {
            addCriterion("chennengfenweideng >=", value, "chennengfenweideng");
            return (Criteria) this;
        }
        public Criteria andChennengfenweidengLessThan(String value) {
            addCriterion("chennengfenweideng <", value, "chennengfenweideng");
            return (Criteria) this;
        }
        public Criteria andChennengfenweidengLessThanOrEqualTo(String value) {
            addCriterion("chennengfenweideng <=", value, "chennengfenweideng");
            return (Criteria) this;
        }
        public Criteria andChennengfenweidengLike(String value) {
            addCriterion("chennengfenweideng like", value, "chennengfenweideng");
            return (Criteria) this;
        }
        public Criteria andChennengfenweidengNotLike(String value) {
            addCriterion("chennengfenweideng not like", value, "chennengfenweideng");
            return (Criteria) this;
        }
        public Criteria andChennengfenweidengIn(List<String> values) {
            addCriterion("chennengfenweideng in", values, "chennengfenweideng");
            return (Criteria) this;
        }
        public Criteria andChennengfenweidengNotIn(List<String> values) {
            addCriterion("chennengfenweideng not in", values, "chennengfenweideng");
            return (Criteria) this;
        }
        public Criteria andChennengfenweidengBetween(String value1, String value2) {
            addCriterion("chennengfenweideng between", value1, value2, "chennengfenweideng");
            return (Criteria) this;
        }
        public Criteria andChennengfenweidengNotBetween(String value1, String value2) {
            addCriterion("chennengfenweideng not between", value1, value2, "chennengfenweideng");
            return (Criteria) this;
        }
        public Criteria andDiandongchechaungIsNull() {
            addCriterion("diandongchechaung is null");
            return (Criteria) this;
        }
        public Criteria andDiandongchechaungIsNotNull() {
            addCriterion("diandongchechaung is not null");
            return (Criteria) this;
        }
        public Criteria andDiandongchechaungEqualTo(String value) {
            addCriterion("diandongchechaung =", value, "diandongchechaung");
            return (Criteria) this;
        }
        public Criteria andDiandongchechaungNotEqualTo(String value) {
            addCriterion("diandongchechaung <>", value, "diandongchechaung");
            return (Criteria) this;
        }
        public Criteria andDiandongchechaungGreaterThan(String value) {
            addCriterion("diandongchechaung >", value, "diandongchechaung");
            return (Criteria) this;
        }
        public Criteria andDiandongchechaungGreaterThanOrEqualTo(String value) {
            addCriterion("diandongchechaung >=", value, "diandongchechaung");
            return (Criteria) this;
        }
        public Criteria andDiandongchechaungLessThan(String value) {
            addCriterion("diandongchechaung <", value, "diandongchechaung");
            return (Criteria) this;
        }
        public Criteria andDiandongchechaungLessThanOrEqualTo(String value) {
            addCriterion("diandongchechaung <=", value, "diandongchechaung");
            return (Criteria) this;
        }
        public Criteria andDiandongchechaungLike(String value) {
            addCriterion("diandongchechaung like", value, "diandongchechaung");
            return (Criteria) this;
        }
        public Criteria andDiandongchechaungNotLike(String value) {
            addCriterion("diandongchechaung not like", value, "diandongchechaung");
            return (Criteria) this;
        }
        public Criteria andDiandongchechaungIn(List<String> values) {
            addCriterion("diandongchechaung in", values, "diandongchechaung");
            return (Criteria) this;
        }
        public Criteria andDiandongchechaungNotIn(List<String> values) {
            addCriterion("diandongchechaung not in", values, "diandongchechaung");
            return (Criteria) this;
        }
        public Criteria andDiandongchechaungBetween(String value1, String value2) {
            addCriterion("diandongchechaung between", value1, value2, "diandongchechaung");
            return (Criteria) this;
        }
        public Criteria andDiandongchechaungNotBetween(String value1, String value2) {
            addCriterion("diandongchechaung not between", value1, value2, "diandongchechaung");
            return (Criteria) this;
        }
        public Criteria andYijiangshangjiangIsNull() {
            addCriterion("yijiangshangjiang is null");
            return (Criteria) this;
        }
        public Criteria andYijiangshangjiangIsNotNull() {
            addCriterion("yijiangshangjiang is not null");
            return (Criteria) this;
        }
        public Criteria andYijiangshangjiangEqualTo(String value) {
            addCriterion("yijiangshangjiang =", value, "yijiangshangjiang");
            return (Criteria) this;
        }
        public Criteria andYijiangshangjiangNotEqualTo(String value) {
            addCriterion("yijiangshangjiang <>", value, "yijiangshangjiang");
            return (Criteria) this;
        }
        public Criteria andYijiangshangjiangGreaterThan(String value) {
            addCriterion("yijiangshangjiang >", value, "yijiangshangjiang");
            return (Criteria) this;
        }
        public Criteria andYijiangshangjiangGreaterThanOrEqualTo(String value) {
            addCriterion("yijiangshangjiang >=", value, "yijiangshangjiang");
            return (Criteria) this;
        }
        public Criteria andYijiangshangjiangLessThan(String value) {
            addCriterion("yijiangshangjiang <", value, "yijiangshangjiang");
            return (Criteria) this;
        }
        public Criteria andYijiangshangjiangLessThanOrEqualTo(String value) {
            addCriterion("yijiangshangjiang <=", value, "yijiangshangjiang");
            return (Criteria) this;
        }
        public Criteria andYijiangshangjiangLike(String value) {
            addCriterion("yijiangshangjiang like", value, "yijiangshangjiang");
            return (Criteria) this;
        }
        public Criteria andYijiangshangjiangNotLike(String value) {
            addCriterion("yijiangshangjiang not like", value, "yijiangshangjiang");
            return (Criteria) this;
        }
        public Criteria andYijiangshangjiangIn(List<String> values) {
            addCriterion("yijiangshangjiang in", values, "yijiangshangjiang");
            return (Criteria) this;
        }
        public Criteria andYijiangshangjiangNotIn(List<String> values) {
            addCriterion("yijiangshangjiang not in", values, "yijiangshangjiang");
            return (Criteria) this;
        }
        public Criteria andYijiangshangjiangBetween(String value1, String value2) {
            addCriterion("yijiangshangjiang between", value1, value2, "yijiangshangjiang");
            return (Criteria) this;
        }
        public Criteria andYijiangshangjiangNotBetween(String value1, String value2) {
            addCriterion("yijiangshangjiang not between", value1, value2, "yijiangshangjiang");
            return (Criteria) this;
        }
        public Criteria andFangjiashouIsNull() {
            addCriterion("fangjiashou is null");
            return (Criteria) this;
        }
        public Criteria andFangjiashouIsNotNull() {
            addCriterion("fangjiashou is not null");
            return (Criteria) this;
        }
        public Criteria andFangjiashouEqualTo(String value) {
            addCriterion("fangjiashou =", value, "fangjiashou");
            return (Criteria) this;
        }
        public Criteria andFangjiashouNotEqualTo(String value) {
            addCriterion("fangjiashou <>", value, "fangjiashou");
            return (Criteria) this;
        }
        public Criteria andFangjiashouGreaterThan(String value) {
            addCriterion("fangjiashou >", value, "fangjiashou");
            return (Criteria) this;
        }
        public Criteria andFangjiashouGreaterThanOrEqualTo(String value) {
            addCriterion("fangjiashou >=", value, "fangjiashou");
            return (Criteria) this;
        }
        public Criteria andFangjiashouLessThan(String value) {
            addCriterion("fangjiashou <", value, "fangjiashou");
            return (Criteria) this;
        }
        public Criteria andFangjiashouLessThanOrEqualTo(String value) {
            addCriterion("fangjiashou <=", value, "fangjiashou");
            return (Criteria) this;
        }
        public Criteria andFangjiashouLike(String value) {
            addCriterion("fangjiashou like", value, "fangjiashou");
            return (Criteria) this;
        }
        public Criteria andFangjiashouNotLike(String value) {
            addCriterion("fangjiashou not like", value, "fangjiashou");
            return (Criteria) this;
        }
        public Criteria andFangjiashouIn(List<String> values) {
            addCriterion("fangjiashou in", values, "fangjiashou");
            return (Criteria) this;
        }
        public Criteria andFangjiashouNotIn(List<String> values) {
            addCriterion("fangjiashou not in", values, "fangjiashou");
            return (Criteria) this;
        }
        public Criteria andFangjiashouBetween(String value1, String value2) {
            addCriterion("fangjiashou between", value1, value2, "fangjiashou");
            return (Criteria) this;
        }
        public Criteria andFangjiashouNotBetween(String value1, String value2) {
            addCriterion("fangjiashou not between", value1, value2, "fangjiashou");
            return (Criteria) this;
        }
        public Criteria andGereboliIsNull() {
            addCriterion("gereboli is null");
            return (Criteria) this;
        }
        public Criteria andGereboliIsNotNull() {
            addCriterion("gereboli is not null");
            return (Criteria) this;
        }
        public Criteria andGereboliEqualTo(String value) {
            addCriterion("gereboli =", value, "gereboli");
            return (Criteria) this;
        }
        public Criteria andGereboliNotEqualTo(String value) {
            addCriterion("gereboli <>", value, "gereboli");
            return (Criteria) this;
        }
        public Criteria andGereboliGreaterThan(String value) {
            addCriterion("gereboli >", value, "gereboli");
            return (Criteria) this;
        }
        public Criteria andGereboliGreaterThanOrEqualTo(String value) {
            addCriterion("gereboli >=", value, "gereboli");
            return (Criteria) this;
        }
        public Criteria andGereboliLessThan(String value) {
            addCriterion("gereboli <", value, "gereboli");
            return (Criteria) this;
        }
        public Criteria andGereboliLessThanOrEqualTo(String value) {
            addCriterion("gereboli <=", value, "gereboli");
            return (Criteria) this;
        }
        public Criteria andGereboliLike(String value) {
            addCriterion("gereboli like", value, "gereboli");
            return (Criteria) this;
        }
        public Criteria andGereboliNotLike(String value) {
            addCriterion("gereboli not like", value, "gereboli");
            return (Criteria) this;
        }
        public Criteria andGereboliIn(List<String> values) {
            addCriterion("gereboli in", values, "gereboli");
            return (Criteria) this;
        }
        public Criteria andGereboliNotIn(List<String> values) {
            addCriterion("gereboli not in", values, "gereboli");
            return (Criteria) this;
        }
        public Criteria andGereboliBetween(String value1, String value2) {
            addCriterion("gereboli between", value1, value2, "gereboli");
            return (Criteria) this;
        }
        public Criteria andGereboliNotBetween(String value1, String value2) {
            addCriterion("gereboli not between", value1, value2, "gereboli");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongtiaojieIsNull() {
            addCriterion("houshijingdiandongtiaojie is null");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongtiaojieIsNotNull() {
            addCriterion("houshijingdiandongtiaojie is not null");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongtiaojieEqualTo(String value) {
            addCriterion("houshijingdiandongtiaojie =", value, "houshijingdiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongtiaojieNotEqualTo(String value) {
            addCriterion("houshijingdiandongtiaojie <>", value, "houshijingdiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongtiaojieGreaterThan(String value) {
            addCriterion("houshijingdiandongtiaojie >", value, "houshijingdiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongtiaojieGreaterThanOrEqualTo(String value) {
            addCriterion("houshijingdiandongtiaojie >=", value, "houshijingdiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongtiaojieLessThan(String value) {
            addCriterion("houshijingdiandongtiaojie <", value, "houshijingdiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongtiaojieLessThanOrEqualTo(String value) {
            addCriterion("houshijingdiandongtiaojie <=", value, "houshijingdiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongtiaojieLike(String value) {
            addCriterion("houshijingdiandongtiaojie like", value, "houshijingdiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongtiaojieNotLike(String value) {
            addCriterion("houshijingdiandongtiaojie not like", value, "houshijingdiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongtiaojieIn(List<String> values) {
            addCriterion("houshijingdiandongtiaojie in", values, "houshijingdiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongtiaojieNotIn(List<String> values) {
            addCriterion("houshijingdiandongtiaojie not in", values, "houshijingdiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongtiaojieBetween(String value1, String value2) {
            addCriterion("houshijingdiandongtiaojie between", value1, value2, "houshijingdiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongtiaojieNotBetween(String value1, String value2) {
            addCriterion("houshijingdiandongtiaojie not between", value1, value2, "houshijingdiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoushijingjiareIsNull() {
            addCriterion("houshijingjiare is null");
            return (Criteria) this;
        }
        public Criteria andHoushijingjiareIsNotNull() {
            addCriterion("houshijingjiare is not null");
            return (Criteria) this;
        }
        public Criteria andHoushijingjiareEqualTo(String value) {
            addCriterion("houshijingjiare =", value, "houshijingjiare");
            return (Criteria) this;
        }
        public Criteria andHoushijingjiareNotEqualTo(String value) {
            addCriterion("houshijingjiare <>", value, "houshijingjiare");
            return (Criteria) this;
        }
        public Criteria andHoushijingjiareGreaterThan(String value) {
            addCriterion("houshijingjiare >", value, "houshijingjiare");
            return (Criteria) this;
        }
        public Criteria andHoushijingjiareGreaterThanOrEqualTo(String value) {
            addCriterion("houshijingjiare >=", value, "houshijingjiare");
            return (Criteria) this;
        }
        public Criteria andHoushijingjiareLessThan(String value) {
            addCriterion("houshijingjiare <", value, "houshijingjiare");
            return (Criteria) this;
        }
        public Criteria andHoushijingjiareLessThanOrEqualTo(String value) {
            addCriterion("houshijingjiare <=", value, "houshijingjiare");
            return (Criteria) this;
        }
        public Criteria andHoushijingjiareLike(String value) {
            addCriterion("houshijingjiare like", value, "houshijingjiare");
            return (Criteria) this;
        }
        public Criteria andHoushijingjiareNotLike(String value) {
            addCriterion("houshijingjiare not like", value, "houshijingjiare");
            return (Criteria) this;
        }
        public Criteria andHoushijingjiareIn(List<String> values) {
            addCriterion("houshijingjiare in", values, "houshijingjiare");
            return (Criteria) this;
        }
        public Criteria andHoushijingjiareNotIn(List<String> values) {
            addCriterion("houshijingjiare not in", values, "houshijingjiare");
            return (Criteria) this;
        }
        public Criteria andHoushijingjiareBetween(String value1, String value2) {
            addCriterion("houshijingjiare between", value1, value2, "houshijingjiare");
            return (Criteria) this;
        }
        public Criteria andHoushijingjiareNotBetween(String value1, String value2) {
            addCriterion("houshijingjiare not between", value1, value2, "houshijingjiare");
            return (Criteria) this;
        }
        public Criteria andNenwaihoushijingfangxuanyunIsNull() {
            addCriterion("nenwaihoushijingfangxuanyun is null");
            return (Criteria) this;
        }
        public Criteria andNenwaihoushijingfangxuanyunIsNotNull() {
            addCriterion("nenwaihoushijingfangxuanyun is not null");
            return (Criteria) this;
        }
        public Criteria andNenwaihoushijingfangxuanyunEqualTo(String value) {
            addCriterion("nenwaihoushijingfangxuanyun =", value, "nenwaihoushijingfangxuanyun");
            return (Criteria) this;
        }
        public Criteria andNenwaihoushijingfangxuanyunNotEqualTo(String value) {
            addCriterion("nenwaihoushijingfangxuanyun <>", value, "nenwaihoushijingfangxuanyun");
            return (Criteria) this;
        }
        public Criteria andNenwaihoushijingfangxuanyunGreaterThan(String value) {
            addCriterion("nenwaihoushijingfangxuanyun >", value, "nenwaihoushijingfangxuanyun");
            return (Criteria) this;
        }
        public Criteria andNenwaihoushijingfangxuanyunGreaterThanOrEqualTo(String value) {
            addCriterion("nenwaihoushijingfangxuanyun >=", value, "nenwaihoushijingfangxuanyun");
            return (Criteria) this;
        }
        public Criteria andNenwaihoushijingfangxuanyunLessThan(String value) {
            addCriterion("nenwaihoushijingfangxuanyun <", value, "nenwaihoushijingfangxuanyun");
            return (Criteria) this;
        }
        public Criteria andNenwaihoushijingfangxuanyunLessThanOrEqualTo(String value) {
            addCriterion("nenwaihoushijingfangxuanyun <=", value, "nenwaihoushijingfangxuanyun");
            return (Criteria) this;
        }
        public Criteria andNenwaihoushijingfangxuanyunLike(String value) {
            addCriterion("nenwaihoushijingfangxuanyun like", value, "nenwaihoushijingfangxuanyun");
            return (Criteria) this;
        }
        public Criteria andNenwaihoushijingfangxuanyunNotLike(String value) {
            addCriterion("nenwaihoushijingfangxuanyun not like", value, "nenwaihoushijingfangxuanyun");
            return (Criteria) this;
        }
        public Criteria andNenwaihoushijingfangxuanyunIn(List<String> values) {
            addCriterion("nenwaihoushijingfangxuanyun in", values, "nenwaihoushijingfangxuanyun");
            return (Criteria) this;
        }
        public Criteria andNenwaihoushijingfangxuanyunNotIn(List<String> values) {
            addCriterion("nenwaihoushijingfangxuanyun not in", values, "nenwaihoushijingfangxuanyun");
            return (Criteria) this;
        }
        public Criteria andNenwaihoushijingfangxuanyunBetween(String value1, String value2) {
            addCriterion("nenwaihoushijingfangxuanyun between", value1, value2, "nenwaihoushijingfangxuanyun");
            return (Criteria) this;
        }
        public Criteria andNenwaihoushijingfangxuanyunNotBetween(String value1, String value2) {
            addCriterion("nenwaihoushijingfangxuanyun not between", value1, value2, "nenwaihoushijingfangxuanyun");
            return (Criteria) this;
        }
        public Criteria andJiumeitichenenghoushijingIsNull() {
            addCriterion("jiumeitichenenghoushijing is null");
            return (Criteria) this;
        }
        public Criteria andJiumeitichenenghoushijingIsNotNull() {
            addCriterion("jiumeitichenenghoushijing is not null");
            return (Criteria) this;
        }
        public Criteria andJiumeitichenenghoushijingEqualTo(String value) {
            addCriterion("jiumeitichenenghoushijing =", value, "jiumeitichenenghoushijing");
            return (Criteria) this;
        }
        public Criteria andJiumeitichenenghoushijingNotEqualTo(String value) {
            addCriterion("jiumeitichenenghoushijing <>", value, "jiumeitichenenghoushijing");
            return (Criteria) this;
        }
        public Criteria andJiumeitichenenghoushijingGreaterThan(String value) {
            addCriterion("jiumeitichenenghoushijing >", value, "jiumeitichenenghoushijing");
            return (Criteria) this;
        }
        public Criteria andJiumeitichenenghoushijingGreaterThanOrEqualTo(String value) {
            addCriterion("jiumeitichenenghoushijing >=", value, "jiumeitichenenghoushijing");
            return (Criteria) this;
        }
        public Criteria andJiumeitichenenghoushijingLessThan(String value) {
            addCriterion("jiumeitichenenghoushijing <", value, "jiumeitichenenghoushijing");
            return (Criteria) this;
        }
        public Criteria andJiumeitichenenghoushijingLessThanOrEqualTo(String value) {
            addCriterion("jiumeitichenenghoushijing <=", value, "jiumeitichenenghoushijing");
            return (Criteria) this;
        }
        public Criteria andJiumeitichenenghoushijingLike(String value) {
            addCriterion("jiumeitichenenghoushijing like", value, "jiumeitichenenghoushijing");
            return (Criteria) this;
        }
        public Criteria andJiumeitichenenghoushijingNotLike(String value) {
            addCriterion("jiumeitichenenghoushijing not like", value, "jiumeitichenenghoushijing");
            return (Criteria) this;
        }
        public Criteria andJiumeitichenenghoushijingIn(List<String> values) {
            addCriterion("jiumeitichenenghoushijing in", values, "jiumeitichenenghoushijing");
            return (Criteria) this;
        }
        public Criteria andJiumeitichenenghoushijingNotIn(List<String> values) {
            addCriterion("jiumeitichenenghoushijing not in", values, "jiumeitichenenghoushijing");
            return (Criteria) this;
        }
        public Criteria andJiumeitichenenghoushijingBetween(String value1, String value2) {
            addCriterion("jiumeitichenenghoushijing between", value1, value2, "jiumeitichenenghoushijing");
            return (Criteria) this;
        }
        public Criteria andJiumeitichenenghoushijingNotBetween(String value1, String value2) {
            addCriterion("jiumeitichenenghoushijing not between", value1, value2, "jiumeitichenenghoushijing");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongzhedieIsNull() {
            addCriterion("houshijingdiandongzhedie is null");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongzhedieIsNotNull() {
            addCriterion("houshijingdiandongzhedie is not null");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongzhedieEqualTo(String value) {
            addCriterion("houshijingdiandongzhedie =", value, "houshijingdiandongzhedie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongzhedieNotEqualTo(String value) {
            addCriterion("houshijingdiandongzhedie <>", value, "houshijingdiandongzhedie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongzhedieGreaterThan(String value) {
            addCriterion("houshijingdiandongzhedie >", value, "houshijingdiandongzhedie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongzhedieGreaterThanOrEqualTo(String value) {
            addCriterion("houshijingdiandongzhedie >=", value, "houshijingdiandongzhedie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongzhedieLessThan(String value) {
            addCriterion("houshijingdiandongzhedie <", value, "houshijingdiandongzhedie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongzhedieLessThanOrEqualTo(String value) {
            addCriterion("houshijingdiandongzhedie <=", value, "houshijingdiandongzhedie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongzhedieLike(String value) {
            addCriterion("houshijingdiandongzhedie like", value, "houshijingdiandongzhedie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongzhedieNotLike(String value) {
            addCriterion("houshijingdiandongzhedie not like", value, "houshijingdiandongzhedie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongzhedieIn(List<String> values) {
            addCriterion("houshijingdiandongzhedie in", values, "houshijingdiandongzhedie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongzhedieNotIn(List<String> values) {
            addCriterion("houshijingdiandongzhedie not in", values, "houshijingdiandongzhedie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongzhedieBetween(String value1, String value2) {
            addCriterion("houshijingdiandongzhedie between", value1, value2, "houshijingdiandongzhedie");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongzhedieNotBetween(String value1, String value2) {
            addCriterion("houshijingdiandongzhedie not between", value1, value2, "houshijingdiandongzhedie");
            return (Criteria) this;
        }
        public Criteria andHoushijiangjiyiIsNull() {
            addCriterion("houshijiangjiyi is null");
            return (Criteria) this;
        }
        public Criteria andHoushijiangjiyiIsNotNull() {
            addCriterion("houshijiangjiyi is not null");
            return (Criteria) this;
        }
        public Criteria andHoushijiangjiyiEqualTo(String value) {
            addCriterion("houshijiangjiyi =", value, "houshijiangjiyi");
            return (Criteria) this;
        }
        public Criteria andHoushijiangjiyiNotEqualTo(String value) {
            addCriterion("houshijiangjiyi <>", value, "houshijiangjiyi");
            return (Criteria) this;
        }
        public Criteria andHoushijiangjiyiGreaterThan(String value) {
            addCriterion("houshijiangjiyi >", value, "houshijiangjiyi");
            return (Criteria) this;
        }
        public Criteria andHoushijiangjiyiGreaterThanOrEqualTo(String value) {
            addCriterion("houshijiangjiyi >=", value, "houshijiangjiyi");
            return (Criteria) this;
        }
        public Criteria andHoushijiangjiyiLessThan(String value) {
            addCriterion("houshijiangjiyi <", value, "houshijiangjiyi");
            return (Criteria) this;
        }
        public Criteria andHoushijiangjiyiLessThanOrEqualTo(String value) {
            addCriterion("houshijiangjiyi <=", value, "houshijiangjiyi");
            return (Criteria) this;
        }
        public Criteria andHoushijiangjiyiLike(String value) {
            addCriterion("houshijiangjiyi like", value, "houshijiangjiyi");
            return (Criteria) this;
        }
        public Criteria andHoushijiangjiyiNotLike(String value) {
            addCriterion("houshijiangjiyi not like", value, "houshijiangjiyi");
            return (Criteria) this;
        }
        public Criteria andHoushijiangjiyiIn(List<String> values) {
            addCriterion("houshijiangjiyi in", values, "houshijiangjiyi");
            return (Criteria) this;
        }
        public Criteria andHoushijiangjiyiNotIn(List<String> values) {
            addCriterion("houshijiangjiyi not in", values, "houshijiangjiyi");
            return (Criteria) this;
        }
        public Criteria andHoushijiangjiyiBetween(String value1, String value2) {
            addCriterion("houshijiangjiyi between", value1, value2, "houshijiangjiyi");
            return (Criteria) this;
        }
        public Criteria andHoushijiangjiyiNotBetween(String value1, String value2) {
            addCriterion("houshijiangjiyi not between", value1, value2, "houshijiangjiyi");
            return (Criteria) this;
        }
        public Criteria andZheyanglianIsNull() {
            addCriterion("zheyanglian is null");
            return (Criteria) this;
        }
        public Criteria andZheyanglianIsNotNull() {
            addCriterion("zheyanglian is not null");
            return (Criteria) this;
        }
        public Criteria andZheyanglianEqualTo(String value) {
            addCriterion("zheyanglian =", value, "zheyanglian");
            return (Criteria) this;
        }
        public Criteria andZheyanglianNotEqualTo(String value) {
            addCriterion("zheyanglian <>", value, "zheyanglian");
            return (Criteria) this;
        }
        public Criteria andZheyanglianGreaterThan(String value) {
            addCriterion("zheyanglian >", value, "zheyanglian");
            return (Criteria) this;
        }
        public Criteria andZheyanglianGreaterThanOrEqualTo(String value) {
            addCriterion("zheyanglian >=", value, "zheyanglian");
            return (Criteria) this;
        }
        public Criteria andZheyanglianLessThan(String value) {
            addCriterion("zheyanglian <", value, "zheyanglian");
            return (Criteria) this;
        }
        public Criteria andZheyanglianLessThanOrEqualTo(String value) {
            addCriterion("zheyanglian <=", value, "zheyanglian");
            return (Criteria) this;
        }
        public Criteria andZheyanglianLike(String value) {
            addCriterion("zheyanglian like", value, "zheyanglian");
            return (Criteria) this;
        }
        public Criteria andZheyanglianNotLike(String value) {
            addCriterion("zheyanglian not like", value, "zheyanglian");
            return (Criteria) this;
        }
        public Criteria andZheyanglianIn(List<String> values) {
            addCriterion("zheyanglian in", values, "zheyanglian");
            return (Criteria) this;
        }
        public Criteria andZheyanglianNotIn(List<String> values) {
            addCriterion("zheyanglian not in", values, "zheyanglian");
            return (Criteria) this;
        }
        public Criteria andZheyanglianBetween(String value1, String value2) {
            addCriterion("zheyanglian between", value1, value2, "zheyanglian");
            return (Criteria) this;
        }
        public Criteria andZheyanglianNotBetween(String value1, String value2) {
            addCriterion("zheyanglian not between", value1, value2, "zheyanglian");
            return (Criteria) this;
        }
        public Criteria andHoupaizheyanglianIsNull() {
            addCriterion("houpaizheyanglian is null");
            return (Criteria) this;
        }
        public Criteria andHoupaizheyanglianIsNotNull() {
            addCriterion("houpaizheyanglian is not null");
            return (Criteria) this;
        }
        public Criteria andHoupaizheyanglianEqualTo(String value) {
            addCriterion("houpaizheyanglian =", value, "houpaizheyanglian");
            return (Criteria) this;
        }
        public Criteria andHoupaizheyanglianNotEqualTo(String value) {
            addCriterion("houpaizheyanglian <>", value, "houpaizheyanglian");
            return (Criteria) this;
        }
        public Criteria andHoupaizheyanglianGreaterThan(String value) {
            addCriterion("houpaizheyanglian >", value, "houpaizheyanglian");
            return (Criteria) this;
        }
        public Criteria andHoupaizheyanglianGreaterThanOrEqualTo(String value) {
            addCriterion("houpaizheyanglian >=", value, "houpaizheyanglian");
            return (Criteria) this;
        }
        public Criteria andHoupaizheyanglianLessThan(String value) {
            addCriterion("houpaizheyanglian <", value, "houpaizheyanglian");
            return (Criteria) this;
        }
        public Criteria andHoupaizheyanglianLessThanOrEqualTo(String value) {
            addCriterion("houpaizheyanglian <=", value, "houpaizheyanglian");
            return (Criteria) this;
        }
        public Criteria andHoupaizheyanglianLike(String value) {
            addCriterion("houpaizheyanglian like", value, "houpaizheyanglian");
            return (Criteria) this;
        }
        public Criteria andHoupaizheyanglianNotLike(String value) {
            addCriterion("houpaizheyanglian not like", value, "houpaizheyanglian");
            return (Criteria) this;
        }
        public Criteria andHoupaizheyanglianIn(List<String> values) {
            addCriterion("houpaizheyanglian in", values, "houpaizheyanglian");
            return (Criteria) this;
        }
        public Criteria andHoupaizheyanglianNotIn(List<String> values) {
            addCriterion("houpaizheyanglian not in", values, "houpaizheyanglian");
            return (Criteria) this;
        }
        public Criteria andHoupaizheyanglianBetween(String value1, String value2) {
            addCriterion("houpaizheyanglian between", value1, value2, "houpaizheyanglian");
            return (Criteria) this;
        }
        public Criteria andHoupaizheyanglianNotBetween(String value1, String value2) {
            addCriterion("houpaizheyanglian not between", value1, value2, "houpaizheyanglian");
            return (Criteria) this;
        }
        public Criteria andHoupaiyinsiboliIsNull() {
            addCriterion("houpaiyinsiboli is null");
            return (Criteria) this;
        }
        public Criteria andHoupaiyinsiboliIsNotNull() {
            addCriterion("houpaiyinsiboli is not null");
            return (Criteria) this;
        }
        public Criteria andHoupaiyinsiboliEqualTo(String value) {
            addCriterion("houpaiyinsiboli =", value, "houpaiyinsiboli");
            return (Criteria) this;
        }
        public Criteria andHoupaiyinsiboliNotEqualTo(String value) {
            addCriterion("houpaiyinsiboli <>", value, "houpaiyinsiboli");
            return (Criteria) this;
        }
        public Criteria andHoupaiyinsiboliGreaterThan(String value) {
            addCriterion("houpaiyinsiboli >", value, "houpaiyinsiboli");
            return (Criteria) this;
        }
        public Criteria andHoupaiyinsiboliGreaterThanOrEqualTo(String value) {
            addCriterion("houpaiyinsiboli >=", value, "houpaiyinsiboli");
            return (Criteria) this;
        }
        public Criteria andHoupaiyinsiboliLessThan(String value) {
            addCriterion("houpaiyinsiboli <", value, "houpaiyinsiboli");
            return (Criteria) this;
        }
        public Criteria andHoupaiyinsiboliLessThanOrEqualTo(String value) {
            addCriterion("houpaiyinsiboli <=", value, "houpaiyinsiboli");
            return (Criteria) this;
        }
        public Criteria andHoupaiyinsiboliLike(String value) {
            addCriterion("houpaiyinsiboli like", value, "houpaiyinsiboli");
            return (Criteria) this;
        }
        public Criteria andHoupaiyinsiboliNotLike(String value) {
            addCriterion("houpaiyinsiboli not like", value, "houpaiyinsiboli");
            return (Criteria) this;
        }
        public Criteria andHoupaiyinsiboliIn(List<String> values) {
            addCriterion("houpaiyinsiboli in", values, "houpaiyinsiboli");
            return (Criteria) this;
        }
        public Criteria andHoupaiyinsiboliNotIn(List<String> values) {
            addCriterion("houpaiyinsiboli not in", values, "houpaiyinsiboli");
            return (Criteria) this;
        }
        public Criteria andHoupaiyinsiboliBetween(String value1, String value2) {
            addCriterion("houpaiyinsiboli between", value1, value2, "houpaiyinsiboli");
            return (Criteria) this;
        }
        public Criteria andHoupaiyinsiboliNotBetween(String value1, String value2) {
            addCriterion("houpaiyinsiboli not between", value1, value2, "houpaiyinsiboli");
            return (Criteria) this;
        }
        public Criteria andZheyangbanhuangzhuangjingIsNull() {
            addCriterion("zheyangbanhuangzhuangjing is null");
            return (Criteria) this;
        }
        public Criteria andZheyangbanhuangzhuangjingIsNotNull() {
            addCriterion("zheyangbanhuangzhuangjing is not null");
            return (Criteria) this;
        }
        public Criteria andZheyangbanhuangzhuangjingEqualTo(String value) {
            addCriterion("zheyangbanhuangzhuangjing =", value, "zheyangbanhuangzhuangjing");
            return (Criteria) this;
        }
        public Criteria andZheyangbanhuangzhuangjingNotEqualTo(String value) {
            addCriterion("zheyangbanhuangzhuangjing <>", value, "zheyangbanhuangzhuangjing");
            return (Criteria) this;
        }
        public Criteria andZheyangbanhuangzhuangjingGreaterThan(String value) {
            addCriterion("zheyangbanhuangzhuangjing >", value, "zheyangbanhuangzhuangjing");
            return (Criteria) this;
        }
        public Criteria andZheyangbanhuangzhuangjingGreaterThanOrEqualTo(String value) {
            addCriterion("zheyangbanhuangzhuangjing >=", value, "zheyangbanhuangzhuangjing");
            return (Criteria) this;
        }
        public Criteria andZheyangbanhuangzhuangjingLessThan(String value) {
            addCriterion("zheyangbanhuangzhuangjing <", value, "zheyangbanhuangzhuangjing");
            return (Criteria) this;
        }
        public Criteria andZheyangbanhuangzhuangjingLessThanOrEqualTo(String value) {
            addCriterion("zheyangbanhuangzhuangjing <=", value, "zheyangbanhuangzhuangjing");
            return (Criteria) this;
        }
        public Criteria andZheyangbanhuangzhuangjingLike(String value) {
            addCriterion("zheyangbanhuangzhuangjing like", value, "zheyangbanhuangzhuangjing");
            return (Criteria) this;
        }
        public Criteria andZheyangbanhuangzhuangjingNotLike(String value) {
            addCriterion("zheyangbanhuangzhuangjing not like", value, "zheyangbanhuangzhuangjing");
            return (Criteria) this;
        }
        public Criteria andZheyangbanhuangzhuangjingIn(List<String> values) {
            addCriterion("zheyangbanhuangzhuangjing in", values, "zheyangbanhuangzhuangjing");
            return (Criteria) this;
        }
        public Criteria andZheyangbanhuangzhuangjingNotIn(List<String> values) {
            addCriterion("zheyangbanhuangzhuangjing not in", values, "zheyangbanhuangzhuangjing");
            return (Criteria) this;
        }
        public Criteria andZheyangbanhuangzhuangjingBetween(String value1, String value2) {
            addCriterion("zheyangbanhuangzhuangjing between", value1, value2, "zheyangbanhuangzhuangjing");
            return (Criteria) this;
        }
        public Criteria andZheyangbanhuangzhuangjingNotBetween(String value1, String value2) {
            addCriterion("zheyangbanhuangzhuangjing not between", value1, value2, "zheyangbanhuangzhuangjing");
            return (Criteria) this;
        }
        public Criteria andHouyvshuaIsNull() {
            addCriterion("houyvshua is null");
            return (Criteria) this;
        }
        public Criteria andHouyvshuaIsNotNull() {
            addCriterion("houyvshua is not null");
            return (Criteria) this;
        }
        public Criteria andHouyvshuaEqualTo(String value) {
            addCriterion("houyvshua =", value, "houyvshua");
            return (Criteria) this;
        }
        public Criteria andHouyvshuaNotEqualTo(String value) {
            addCriterion("houyvshua <>", value, "houyvshua");
            return (Criteria) this;
        }
        public Criteria andHouyvshuaGreaterThan(String value) {
            addCriterion("houyvshua >", value, "houyvshua");
            return (Criteria) this;
        }
        public Criteria andHouyvshuaGreaterThanOrEqualTo(String value) {
            addCriterion("houyvshua >=", value, "houyvshua");
            return (Criteria) this;
        }
        public Criteria andHouyvshuaLessThan(String value) {
            addCriterion("houyvshua <", value, "houyvshua");
            return (Criteria) this;
        }
        public Criteria andHouyvshuaLessThanOrEqualTo(String value) {
            addCriterion("houyvshua <=", value, "houyvshua");
            return (Criteria) this;
        }
        public Criteria andHouyvshuaLike(String value) {
            addCriterion("houyvshua like", value, "houyvshua");
            return (Criteria) this;
        }
        public Criteria andHouyvshuaNotLike(String value) {
            addCriterion("houyvshua not like", value, "houyvshua");
            return (Criteria) this;
        }
        public Criteria andHouyvshuaIn(List<String> values) {
            addCriterion("houyvshua in", values, "houyvshua");
            return (Criteria) this;
        }
        public Criteria andHouyvshuaNotIn(List<String> values) {
            addCriterion("houyvshua not in", values, "houyvshua");
            return (Criteria) this;
        }
        public Criteria andHouyvshuaBetween(String value1, String value2) {
            addCriterion("houyvshua between", value1, value2, "houyvshua");
            return (Criteria) this;
        }
        public Criteria andHouyvshuaNotBetween(String value1, String value2) {
            addCriterion("houyvshua not between", value1, value2, "houyvshua");
            return (Criteria) this;
        }
        public Criteria andGanyingyvshuIsNull() {
            addCriterion("ganyingyvshu is null");
            return (Criteria) this;
        }
        public Criteria andGanyingyvshuIsNotNull() {
            addCriterion("ganyingyvshu is not null");
            return (Criteria) this;
        }
        public Criteria andGanyingyvshuEqualTo(String value) {
            addCriterion("ganyingyvshu =", value, "ganyingyvshu");
            return (Criteria) this;
        }
        public Criteria andGanyingyvshuNotEqualTo(String value) {
            addCriterion("ganyingyvshu <>", value, "ganyingyvshu");
            return (Criteria) this;
        }
        public Criteria andGanyingyvshuGreaterThan(String value) {
            addCriterion("ganyingyvshu >", value, "ganyingyvshu");
            return (Criteria) this;
        }
        public Criteria andGanyingyvshuGreaterThanOrEqualTo(String value) {
            addCriterion("ganyingyvshu >=", value, "ganyingyvshu");
            return (Criteria) this;
        }
        public Criteria andGanyingyvshuLessThan(String value) {
            addCriterion("ganyingyvshu <", value, "ganyingyvshu");
            return (Criteria) this;
        }
        public Criteria andGanyingyvshuLessThanOrEqualTo(String value) {
            addCriterion("ganyingyvshu <=", value, "ganyingyvshu");
            return (Criteria) this;
        }
        public Criteria andGanyingyvshuLike(String value) {
            addCriterion("ganyingyvshu like", value, "ganyingyvshu");
            return (Criteria) this;
        }
        public Criteria andGanyingyvshuNotLike(String value) {
            addCriterion("ganyingyvshu not like", value, "ganyingyvshu");
            return (Criteria) this;
        }
        public Criteria andGanyingyvshuIn(List<String> values) {
            addCriterion("ganyingyvshu in", values, "ganyingyvshu");
            return (Criteria) this;
        }
        public Criteria andGanyingyvshuNotIn(List<String> values) {
            addCriterion("ganyingyvshu not in", values, "ganyingyvshu");
            return (Criteria) this;
        }
        public Criteria andGanyingyvshuBetween(String value1, String value2) {
            addCriterion("ganyingyvshu between", value1, value2, "ganyingyvshu");
            return (Criteria) this;
        }
        public Criteria andGanyingyvshuNotBetween(String value1, String value2) {
            addCriterion("ganyingyvshu not between", value1, value2, "ganyingyvshu");
            return (Criteria) this;
        }
        public Criteria andKongtiaokongzhifangshiIsNull() {
            addCriterion("kongtiaokongzhifangshi is null");
            return (Criteria) this;
        }
        public Criteria andKongtiaokongzhifangshiIsNotNull() {
            addCriterion("kongtiaokongzhifangshi is not null");
            return (Criteria) this;
        }
        public Criteria andKongtiaokongzhifangshiEqualTo(String value) {
            addCriterion("kongtiaokongzhifangshi =", value, "kongtiaokongzhifangshi");
            return (Criteria) this;
        }
        public Criteria andKongtiaokongzhifangshiNotEqualTo(String value) {
            addCriterion("kongtiaokongzhifangshi <>", value, "kongtiaokongzhifangshi");
            return (Criteria) this;
        }
        public Criteria andKongtiaokongzhifangshiGreaterThan(String value) {
            addCriterion("kongtiaokongzhifangshi >", value, "kongtiaokongzhifangshi");
            return (Criteria) this;
        }
        public Criteria andKongtiaokongzhifangshiGreaterThanOrEqualTo(String value) {
            addCriterion("kongtiaokongzhifangshi >=", value, "kongtiaokongzhifangshi");
            return (Criteria) this;
        }
        public Criteria andKongtiaokongzhifangshiLessThan(String value) {
            addCriterion("kongtiaokongzhifangshi <", value, "kongtiaokongzhifangshi");
            return (Criteria) this;
        }
        public Criteria andKongtiaokongzhifangshiLessThanOrEqualTo(String value) {
            addCriterion("kongtiaokongzhifangshi <=", value, "kongtiaokongzhifangshi");
            return (Criteria) this;
        }
        public Criteria andKongtiaokongzhifangshiLike(String value) {
            addCriterion("kongtiaokongzhifangshi like", value, "kongtiaokongzhifangshi");
            return (Criteria) this;
        }
        public Criteria andKongtiaokongzhifangshiNotLike(String value) {
            addCriterion("kongtiaokongzhifangshi not like", value, "kongtiaokongzhifangshi");
            return (Criteria) this;
        }
        public Criteria andKongtiaokongzhifangshiIn(List<String> values) {
            addCriterion("kongtiaokongzhifangshi in", values, "kongtiaokongzhifangshi");
            return (Criteria) this;
        }
        public Criteria andKongtiaokongzhifangshiNotIn(List<String> values) {
            addCriterion("kongtiaokongzhifangshi not in", values, "kongtiaokongzhifangshi");
            return (Criteria) this;
        }
        public Criteria andKongtiaokongzhifangshiBetween(String value1, String value2) {
            addCriterion("kongtiaokongzhifangshi between", value1, value2, "kongtiaokongzhifangshi");
            return (Criteria) this;
        }
        public Criteria andKongtiaokongzhifangshiNotBetween(String value1, String value2) {
            addCriterion("kongtiaokongzhifangshi not between", value1, value2, "kongtiaokongzhifangshi");
            return (Criteria) this;
        }
        public Criteria andHoupaidulikongtiaoIsNull() {
            addCriterion("houpaidulikongtiao is null");
            return (Criteria) this;
        }
        public Criteria andHoupaidulikongtiaoIsNotNull() {
            addCriterion("houpaidulikongtiao is not null");
            return (Criteria) this;
        }
        public Criteria andHoupaidulikongtiaoEqualTo(String value) {
            addCriterion("houpaidulikongtiao =", value, "houpaidulikongtiao");
            return (Criteria) this;
        }
        public Criteria andHoupaidulikongtiaoNotEqualTo(String value) {
            addCriterion("houpaidulikongtiao <>", value, "houpaidulikongtiao");
            return (Criteria) this;
        }
        public Criteria andHoupaidulikongtiaoGreaterThan(String value) {
            addCriterion("houpaidulikongtiao >", value, "houpaidulikongtiao");
            return (Criteria) this;
        }
        public Criteria andHoupaidulikongtiaoGreaterThanOrEqualTo(String value) {
            addCriterion("houpaidulikongtiao >=", value, "houpaidulikongtiao");
            return (Criteria) this;
        }
        public Criteria andHoupaidulikongtiaoLessThan(String value) {
            addCriterion("houpaidulikongtiao <", value, "houpaidulikongtiao");
            return (Criteria) this;
        }
        public Criteria andHoupaidulikongtiaoLessThanOrEqualTo(String value) {
            addCriterion("houpaidulikongtiao <=", value, "houpaidulikongtiao");
            return (Criteria) this;
        }
        public Criteria andHoupaidulikongtiaoLike(String value) {
            addCriterion("houpaidulikongtiao like", value, "houpaidulikongtiao");
            return (Criteria) this;
        }
        public Criteria andHoupaidulikongtiaoNotLike(String value) {
            addCriterion("houpaidulikongtiao not like", value, "houpaidulikongtiao");
            return (Criteria) this;
        }
        public Criteria andHoupaidulikongtiaoIn(List<String> values) {
            addCriterion("houpaidulikongtiao in", values, "houpaidulikongtiao");
            return (Criteria) this;
        }
        public Criteria andHoupaidulikongtiaoNotIn(List<String> values) {
            addCriterion("houpaidulikongtiao not in", values, "houpaidulikongtiao");
            return (Criteria) this;
        }
        public Criteria andHoupaidulikongtiaoBetween(String value1, String value2) {
            addCriterion("houpaidulikongtiao between", value1, value2, "houpaidulikongtiao");
            return (Criteria) this;
        }
        public Criteria andHoupaidulikongtiaoNotBetween(String value1, String value2) {
            addCriterion("houpaidulikongtiao not between", value1, value2, "houpaidulikongtiao");
            return (Criteria) this;
        }
        public Criteria andHoupaichufengkouIsNull() {
            addCriterion("houpaichufengkou is null");
            return (Criteria) this;
        }
        public Criteria andHoupaichufengkouIsNotNull() {
            addCriterion("houpaichufengkou is not null");
            return (Criteria) this;
        }
        public Criteria andHoupaichufengkouEqualTo(String value) {
            addCriterion("houpaichufengkou =", value, "houpaichufengkou");
            return (Criteria) this;
        }
        public Criteria andHoupaichufengkouNotEqualTo(String value) {
            addCriterion("houpaichufengkou <>", value, "houpaichufengkou");
            return (Criteria) this;
        }
        public Criteria andHoupaichufengkouGreaterThan(String value) {
            addCriterion("houpaichufengkou >", value, "houpaichufengkou");
            return (Criteria) this;
        }
        public Criteria andHoupaichufengkouGreaterThanOrEqualTo(String value) {
            addCriterion("houpaichufengkou >=", value, "houpaichufengkou");
            return (Criteria) this;
        }
        public Criteria andHoupaichufengkouLessThan(String value) {
            addCriterion("houpaichufengkou <", value, "houpaichufengkou");
            return (Criteria) this;
        }
        public Criteria andHoupaichufengkouLessThanOrEqualTo(String value) {
            addCriterion("houpaichufengkou <=", value, "houpaichufengkou");
            return (Criteria) this;
        }
        public Criteria andHoupaichufengkouLike(String value) {
            addCriterion("houpaichufengkou like", value, "houpaichufengkou");
            return (Criteria) this;
        }
        public Criteria andHoupaichufengkouNotLike(String value) {
            addCriterion("houpaichufengkou not like", value, "houpaichufengkou");
            return (Criteria) this;
        }
        public Criteria andHoupaichufengkouIn(List<String> values) {
            addCriterion("houpaichufengkou in", values, "houpaichufengkou");
            return (Criteria) this;
        }
        public Criteria andHoupaichufengkouNotIn(List<String> values) {
            addCriterion("houpaichufengkou not in", values, "houpaichufengkou");
            return (Criteria) this;
        }
        public Criteria andHoupaichufengkouBetween(String value1, String value2) {
            addCriterion("houpaichufengkou between", value1, value2, "houpaichufengkou");
            return (Criteria) this;
        }
        public Criteria andHoupaichufengkouNotBetween(String value1, String value2) {
            addCriterion("houpaichufengkou not between", value1, value2, "houpaichufengkou");
            return (Criteria) this;
        }
        public Criteria andWendufenqvkongzhiIsNull() {
            addCriterion("wendufenqvkongzhi is null");
            return (Criteria) this;
        }
        public Criteria andWendufenqvkongzhiIsNotNull() {
            addCriterion("wendufenqvkongzhi is not null");
            return (Criteria) this;
        }
        public Criteria andWendufenqvkongzhiEqualTo(String value) {
            addCriterion("wendufenqvkongzhi =", value, "wendufenqvkongzhi");
            return (Criteria) this;
        }
        public Criteria andWendufenqvkongzhiNotEqualTo(String value) {
            addCriterion("wendufenqvkongzhi <>", value, "wendufenqvkongzhi");
            return (Criteria) this;
        }
        public Criteria andWendufenqvkongzhiGreaterThan(String value) {
            addCriterion("wendufenqvkongzhi >", value, "wendufenqvkongzhi");
            return (Criteria) this;
        }
        public Criteria andWendufenqvkongzhiGreaterThanOrEqualTo(String value) {
            addCriterion("wendufenqvkongzhi >=", value, "wendufenqvkongzhi");
            return (Criteria) this;
        }
        public Criteria andWendufenqvkongzhiLessThan(String value) {
            addCriterion("wendufenqvkongzhi <", value, "wendufenqvkongzhi");
            return (Criteria) this;
        }
        public Criteria andWendufenqvkongzhiLessThanOrEqualTo(String value) {
            addCriterion("wendufenqvkongzhi <=", value, "wendufenqvkongzhi");
            return (Criteria) this;
        }
        public Criteria andWendufenqvkongzhiLike(String value) {
            addCriterion("wendufenqvkongzhi like", value, "wendufenqvkongzhi");
            return (Criteria) this;
        }
        public Criteria andWendufenqvkongzhiNotLike(String value) {
            addCriterion("wendufenqvkongzhi not like", value, "wendufenqvkongzhi");
            return (Criteria) this;
        }
        public Criteria andWendufenqvkongzhiIn(List<String> values) {
            addCriterion("wendufenqvkongzhi in", values, "wendufenqvkongzhi");
            return (Criteria) this;
        }
        public Criteria andWendufenqvkongzhiNotIn(List<String> values) {
            addCriterion("wendufenqvkongzhi not in", values, "wendufenqvkongzhi");
            return (Criteria) this;
        }
        public Criteria andWendufenqvkongzhiBetween(String value1, String value2) {
            addCriterion("wendufenqvkongzhi between", value1, value2, "wendufenqvkongzhi");
            return (Criteria) this;
        }
        public Criteria andWendufenqvkongzhiNotBetween(String value1, String value2) {
            addCriterion("wendufenqvkongzhi not between", value1, value2, "wendufenqvkongzhi");
            return (Criteria) this;
        }
        public Criteria andHuafenguolvIsNull() {
            addCriterion("huafenguolv is null");
            return (Criteria) this;
        }
        public Criteria andHuafenguolvIsNotNull() {
            addCriterion("huafenguolv is not null");
            return (Criteria) this;
        }
        public Criteria andHuafenguolvEqualTo(String value) {
            addCriterion("huafenguolv =", value, "huafenguolv");
            return (Criteria) this;
        }
        public Criteria andHuafenguolvNotEqualTo(String value) {
            addCriterion("huafenguolv <>", value, "huafenguolv");
            return (Criteria) this;
        }
        public Criteria andHuafenguolvGreaterThan(String value) {
            addCriterion("huafenguolv >", value, "huafenguolv");
            return (Criteria) this;
        }
        public Criteria andHuafenguolvGreaterThanOrEqualTo(String value) {
            addCriterion("huafenguolv >=", value, "huafenguolv");
            return (Criteria) this;
        }
        public Criteria andHuafenguolvLessThan(String value) {
            addCriterion("huafenguolv <", value, "huafenguolv");
            return (Criteria) this;
        }
        public Criteria andHuafenguolvLessThanOrEqualTo(String value) {
            addCriterion("huafenguolv <=", value, "huafenguolv");
            return (Criteria) this;
        }
        public Criteria andHuafenguolvLike(String value) {
            addCriterion("huafenguolv like", value, "huafenguolv");
            return (Criteria) this;
        }
        public Criteria andHuafenguolvNotLike(String value) {
            addCriterion("huafenguolv not like", value, "huafenguolv");
            return (Criteria) this;
        }
        public Criteria andHuafenguolvIn(List<String> values) {
            addCriterion("huafenguolv in", values, "huafenguolv");
            return (Criteria) this;
        }
        public Criteria andHuafenguolvNotIn(List<String> values) {
            addCriterion("huafenguolv not in", values, "huafenguolv");
            return (Criteria) this;
        }
        public Criteria andHuafenguolvBetween(String value1, String value2) {
            addCriterion("huafenguolv between", value1, value2, "huafenguolv");
            return (Criteria) this;
        }
        public Criteria andHuafenguolvNotBetween(String value1, String value2) {
            addCriterion("huafenguolv not between", value1, value2, "huafenguolv");
            return (Criteria) this;
        }
        public Criteria andChezaijinghuaqiIsNull() {
            addCriterion("chezaijinghuaqi is null");
            return (Criteria) this;
        }
        public Criteria andChezaijinghuaqiIsNotNull() {
            addCriterion("chezaijinghuaqi is not null");
            return (Criteria) this;
        }
        public Criteria andChezaijinghuaqiEqualTo(String value) {
            addCriterion("chezaijinghuaqi =", value, "chezaijinghuaqi");
            return (Criteria) this;
        }
        public Criteria andChezaijinghuaqiNotEqualTo(String value) {
            addCriterion("chezaijinghuaqi <>", value, "chezaijinghuaqi");
            return (Criteria) this;
        }
        public Criteria andChezaijinghuaqiGreaterThan(String value) {
            addCriterion("chezaijinghuaqi >", value, "chezaijinghuaqi");
            return (Criteria) this;
        }
        public Criteria andChezaijinghuaqiGreaterThanOrEqualTo(String value) {
            addCriterion("chezaijinghuaqi >=", value, "chezaijinghuaqi");
            return (Criteria) this;
        }
        public Criteria andChezaijinghuaqiLessThan(String value) {
            addCriterion("chezaijinghuaqi <", value, "chezaijinghuaqi");
            return (Criteria) this;
        }
        public Criteria andChezaijinghuaqiLessThanOrEqualTo(String value) {
            addCriterion("chezaijinghuaqi <=", value, "chezaijinghuaqi");
            return (Criteria) this;
        }
        public Criteria andChezaijinghuaqiLike(String value) {
            addCriterion("chezaijinghuaqi like", value, "chezaijinghuaqi");
            return (Criteria) this;
        }
        public Criteria andChezaijinghuaqiNotLike(String value) {
            addCriterion("chezaijinghuaqi not like", value, "chezaijinghuaqi");
            return (Criteria) this;
        }
        public Criteria andChezaijinghuaqiIn(List<String> values) {
            addCriterion("chezaijinghuaqi in", values, "chezaijinghuaqi");
            return (Criteria) this;
        }
        public Criteria andChezaijinghuaqiNotIn(List<String> values) {
            addCriterion("chezaijinghuaqi not in", values, "chezaijinghuaqi");
            return (Criteria) this;
        }
        public Criteria andChezaijinghuaqiBetween(String value1, String value2) {
            addCriterion("chezaijinghuaqi between", value1, value2, "chezaijinghuaqi");
            return (Criteria) this;
        }
        public Criteria andChezaijinghuaqiNotBetween(String value1, String value2) {
            addCriterion("chezaijinghuaqi not between", value1, value2, "chezaijinghuaqi");
            return (Criteria) this;
        }
        public Criteria andChezaibingxiangIsNull() {
            addCriterion("chezaibingxiang is null");
            return (Criteria) this;
        }
        public Criteria andChezaibingxiangIsNotNull() {
            addCriterion("chezaibingxiang is not null");
            return (Criteria) this;
        }
        public Criteria andChezaibingxiangEqualTo(String value) {
            addCriterion("chezaibingxiang =", value, "chezaibingxiang");
            return (Criteria) this;
        }
        public Criteria andChezaibingxiangNotEqualTo(String value) {
            addCriterion("chezaibingxiang <>", value, "chezaibingxiang");
            return (Criteria) this;
        }
        public Criteria andChezaibingxiangGreaterThan(String value) {
            addCriterion("chezaibingxiang >", value, "chezaibingxiang");
            return (Criteria) this;
        }
        public Criteria andChezaibingxiangGreaterThanOrEqualTo(String value) {
            addCriterion("chezaibingxiang >=", value, "chezaibingxiang");
            return (Criteria) this;
        }
        public Criteria andChezaibingxiangLessThan(String value) {
            addCriterion("chezaibingxiang <", value, "chezaibingxiang");
            return (Criteria) this;
        }
        public Criteria andChezaibingxiangLessThanOrEqualTo(String value) {
            addCriterion("chezaibingxiang <=", value, "chezaibingxiang");
            return (Criteria) this;
        }
        public Criteria andChezaibingxiangLike(String value) {
            addCriterion("chezaibingxiang like", value, "chezaibingxiang");
            return (Criteria) this;
        }
        public Criteria andChezaibingxiangNotLike(String value) {
            addCriterion("chezaibingxiang not like", value, "chezaibingxiang");
            return (Criteria) this;
        }
        public Criteria andChezaibingxiangIn(List<String> values) {
            addCriterion("chezaibingxiang in", values, "chezaibingxiang");
            return (Criteria) this;
        }
        public Criteria andChezaibingxiangNotIn(List<String> values) {
            addCriterion("chezaibingxiang not in", values, "chezaibingxiang");
            return (Criteria) this;
        }
        public Criteria andChezaibingxiangBetween(String value1, String value2) {
            addCriterion("chezaibingxiang between", value1, value2, "chezaibingxiang");
            return (Criteria) this;
        }
        public Criteria andChezaibingxiangNotBetween(String value1, String value2) {
            addCriterion("chezaibingxiang not between", value1, value2, "chezaibingxiang");
            return (Criteria) this;
        }
        public Criteria andWaiguanyanseIsNull() {
            addCriterion("waiguanyanse is null");
            return (Criteria) this;
        }
        public Criteria andWaiguanyanseIsNotNull() {
            addCriterion("waiguanyanse is not null");
            return (Criteria) this;
        }
        public Criteria andWaiguanyanseEqualTo(String value) {
            addCriterion("waiguanyanse =", value, "waiguanyanse");
            return (Criteria) this;
        }
        public Criteria andWaiguanyanseNotEqualTo(String value) {
            addCriterion("waiguanyanse <>", value, "waiguanyanse");
            return (Criteria) this;
        }
        public Criteria andWaiguanyanseGreaterThan(String value) {
            addCriterion("waiguanyanse >", value, "waiguanyanse");
            return (Criteria) this;
        }
        public Criteria andWaiguanyanseGreaterThanOrEqualTo(String value) {
            addCriterion("waiguanyanse >=", value, "waiguanyanse");
            return (Criteria) this;
        }
        public Criteria andWaiguanyanseLessThan(String value) {
            addCriterion("waiguanyanse <", value, "waiguanyanse");
            return (Criteria) this;
        }
        public Criteria andWaiguanyanseLessThanOrEqualTo(String value) {
            addCriterion("waiguanyanse <=", value, "waiguanyanse");
            return (Criteria) this;
        }
        public Criteria andWaiguanyanseLike(String value) {
            addCriterion("waiguanyanse like", value, "waiguanyanse");
            return (Criteria) this;
        }
        public Criteria andWaiguanyanseNotLike(String value) {
            addCriterion("waiguanyanse not like", value, "waiguanyanse");
            return (Criteria) this;
        }
        public Criteria andWaiguanyanseIn(List<String> values) {
            addCriterion("waiguanyanse in", values, "waiguanyanse");
            return (Criteria) this;
        }
        public Criteria andWaiguanyanseNotIn(List<String> values) {
            addCriterion("waiguanyanse not in", values, "waiguanyanse");
            return (Criteria) this;
        }
        public Criteria andWaiguanyanseBetween(String value1, String value2) {
            addCriterion("waiguanyanse between", value1, value2, "waiguanyanse");
            return (Criteria) this;
        }
        public Criteria andWaiguanyanseNotBetween(String value1, String value2) {
            addCriterion("waiguanyanse not between", value1, value2, "waiguanyanse");
            return (Criteria) this;
        }
        public Criteria andNeshiyansiIsNull() {
            addCriterion("neshiyansi is null");
            return (Criteria) this;
        }
        public Criteria andNeshiyansiIsNotNull() {
            addCriterion("neshiyansi is not null");
            return (Criteria) this;
        }
        public Criteria andNeshiyansiEqualTo(String value) {
            addCriterion("neshiyansi =", value, "neshiyansi");
            return (Criteria) this;
        }
        public Criteria andNeshiyansiNotEqualTo(String value) {
            addCriterion("neshiyansi <>", value, "neshiyansi");
            return (Criteria) this;
        }
        public Criteria andNeshiyansiGreaterThan(String value) {
            addCriterion("neshiyansi >", value, "neshiyansi");
            return (Criteria) this;
        }
        public Criteria andNeshiyansiGreaterThanOrEqualTo(String value) {
            addCriterion("neshiyansi >=", value, "neshiyansi");
            return (Criteria) this;
        }
        public Criteria andNeshiyansiLessThan(String value) {
            addCriterion("neshiyansi <", value, "neshiyansi");
            return (Criteria) this;
        }
        public Criteria andNeshiyansiLessThanOrEqualTo(String value) {
            addCriterion("neshiyansi <=", value, "neshiyansi");
            return (Criteria) this;
        }
        public Criteria andNeshiyansiLike(String value) {
            addCriterion("neshiyansi like", value, "neshiyansi");
            return (Criteria) this;
        }
        public Criteria andNeshiyansiNotLike(String value) {
            addCriterion("neshiyansi not like", value, "neshiyansi");
            return (Criteria) this;
        }
        public Criteria andNeshiyansiIn(List<String> values) {
            addCriterion("neshiyansi in", values, "neshiyansi");
            return (Criteria) this;
        }
        public Criteria andNeshiyansiNotIn(List<String> values) {
            addCriterion("neshiyansi not in", values, "neshiyansi");
            return (Criteria) this;
        }
        public Criteria andNeshiyansiBetween(String value1, String value2) {
            addCriterion("neshiyansi between", value1, value2, "neshiyansi");
            return (Criteria) this;
        }
        public Criteria andNeshiyansiNotBetween(String value1, String value2) {
            addCriterion("neshiyansi not between", value1, value2, "neshiyansi");
            return (Criteria) this;
        }
        public Criteria andZmLikeInsensitive(String value) {
            addCriterion("upper(zm) like", value.toUpperCase(), "zm");
            return (Criteria) this;
        }
        public Criteria andPinpaiLikeInsensitive(String value) {
            addCriterion("upper(pinpai) like", value.toUpperCase(), "pinpai");
            return (Criteria) this;
        }
        public Criteria andPinpai_idLikeInsensitive(String value) {
            addCriterion("upper(pinpai_id) like", value.toUpperCase(), "pinpai_id");
            return (Criteria) this;
        }
        public Criteria andLogoLikeInsensitive(String value) {
            addCriterion("upper(logo) like", value.toUpperCase(), "logo");
            return (Criteria) this;
        }
        public Criteria andChexiLikeInsensitive(String value) {
            addCriterion("upper(chexi) like", value.toUpperCase(), "chexi");
            return (Criteria) this;
        }
        public Criteria andChexi_idLikeInsensitive(String value) {
            addCriterion("upper(chexi_id) like", value.toUpperCase(), "chexi_id");
            return (Criteria) this;
        }
        public Criteria andImgLikeInsensitive(String value) {
            addCriterion("upper(img) like", value.toUpperCase(), "img");
            return (Criteria) this;
        }
        public Criteria andChemingLikeInsensitive(String value) {
            addCriterion("upper(cheming) like", value.toUpperCase(), "cheming");
            return (Criteria) this;
        }
        public Criteria andChexing_idLikeInsensitive(String value) {
            addCriterion("upper(chexing_id) like", value.toUpperCase(), "chexing_id");
            return (Criteria) this;
        }
        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(type) like", value.toUpperCase(), "type");
            return (Criteria) this;
        }
        public Criteria andChangjiaLikeInsensitive(String value) {
            addCriterion("upper(changjia) like", value.toUpperCase(), "changjia");
            return (Criteria) this;
        }
        public Criteria andNiankuanLikeInsensitive(String value) {
            addCriterion("upper(niankuan) like", value.toUpperCase(), "niankuan");
            return (Criteria) this;
        }
        public Criteria andGengxin_timeLikeInsensitive(String value) {
            addCriterion("upper(gengxin_time) like", value.toUpperCase(), "gengxin_time");
            return (Criteria) this;
        }
        public Criteria andShangshi_timeLikeInsensitive(String value) {
            addCriterion("upper(shangshi_time) like", value.toUpperCase(), "shangshi_time");
            return (Criteria) this;
        }
        public Criteria andZhidaojiaLikeInsensitive(String value) {
            addCriterion("upper(zhidaojia) like", value.toUpperCase(), "zhidaojia");
            return (Criteria) this;
        }
        public Criteria andJibieLikeInsensitive(String value) {
            addCriterion("upper(jibie) like", value.toUpperCase(), "jibie");
            return (Criteria) this;
        }
        public Criteria andFadongjiLikeInsensitive(String value) {
            addCriterion("upper(fadongji) like", value.toUpperCase(), "fadongji");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangLikeInsensitive(String value) {
            addCriterion("upper(biansuxiang) like", value.toUpperCase(), "biansuxiang");
            return (Criteria) this;
        }
        public Criteria andChangkuanggaoLikeInsensitive(String value) {
            addCriterion("upper(changkuanggao) like", value.toUpperCase(), "changkuanggao");
            return (Criteria) this;
        }
        public Criteria andJiegouLikeInsensitive(String value) {
            addCriterion("upper(jiegou) like", value.toUpperCase(), "jiegou");
            return (Criteria) this;
        }
        public Criteria andZuigaochesuLikeInsensitive(String value) {
            addCriterion("upper(zuigaochesu) like", value.toUpperCase(), "zuigaochesu");
            return (Criteria) this;
        }
        public Criteria andGuangfang_jiasuLikeInsensitive(String value) {
            addCriterion("upper(guangfang_jiasu) like", value.toUpperCase(), "guangfang_jiasu");
            return (Criteria) this;
        }
        public Criteria andShice__jiasuLikeInsensitive(String value) {
            addCriterion("upper(shice__jiasu) like", value.toUpperCase(), "shice__jiasu");
            return (Criteria) this;
        }
        public Criteria andZhidongLikeInsensitive(String value) {
            addCriterion("upper(zhidong) like", value.toUpperCase(), "zhidong");
            return (Criteria) this;
        }
        public Criteria andLidijianxiLikeInsensitive(String value) {
            addCriterion("upper(lidijianxi) like", value.toUpperCase(), "lidijianxi");
            return (Criteria) this;
        }
        public Criteria andZonghe_youhaoLikeInsensitive(String value) {
            addCriterion("upper(zonghe_youhao) like", value.toUpperCase(), "zonghe_youhao");
            return (Criteria) this;
        }
        public Criteria andShice__youhaoLikeInsensitive(String value) {
            addCriterion("upper(shice__youhao) like", value.toUpperCase(), "shice__youhao");
            return (Criteria) this;
        }
        public Criteria andBaozhiqiLikeInsensitive(String value) {
            addCriterion("upper(baozhiqi) like", value.toUpperCase(), "baozhiqi");
            return (Criteria) this;
        }
        public Criteria andChangduLikeInsensitive(String value) {
            addCriterion("upper(changdu) like", value.toUpperCase(), "changdu");
            return (Criteria) this;
        }
        public Criteria andKuanduLikeInsensitive(String value) {
            addCriterion("upper(kuandu) like", value.toUpperCase(), "kuandu");
            return (Criteria) this;
        }
        public Criteria andGaoduLikeInsensitive(String value) {
            addCriterion("upper(gaodu) like", value.toUpperCase(), "gaodu");
            return (Criteria) this;
        }
        public Criteria andZhoujvLikeInsensitive(String value) {
            addCriterion("upper(zhoujv) like", value.toUpperCase(), "zhoujv");
            return (Criteria) this;
        }
        public Criteria andQianlun_jvLikeInsensitive(String value) {
            addCriterion("upper(qianlun_jv) like", value.toUpperCase(), "qianlun_jv");
            return (Criteria) this;
        }
        public Criteria andHoulun_jvLikeInsensitive(String value) {
            addCriterion("upper(houlun_jv) like", value.toUpperCase(), "houlun_jv");
            return (Criteria) this;
        }
        public Criteria andLidi_jianxiLikeInsensitive(String value) {
            addCriterion("upper(lidi_jianxi) like", value.toUpperCase(), "lidi_jianxi");
            return (Criteria) this;
        }
        public Criteria andChemenshuLikeInsensitive(String value) {
            addCriterion("upper(chemenshu) like", value.toUpperCase(), "chemenshu");
            return (Criteria) this;
        }
        public Criteria andZuoweishuLikeInsensitive(String value) {
            addCriterion("upper(zuoweishu) like", value.toUpperCase(), "zuoweishu");
            return (Criteria) this;
        }
        public Criteria andYouxiangLikeInsensitive(String value) {
            addCriterion("upper(youxiang) like", value.toUpperCase(), "youxiang");
            return (Criteria) this;
        }
        public Criteria andHoubeixiangLikeInsensitive(String value) {
            addCriterion("upper(houbeixiang) like", value.toUpperCase(), "houbeixiang");
            return (Criteria) this;
        }
        public Criteria andHoumenkaiqiLikeInsensitive(String value) {
            addCriterion("upper(houmenkaiqi) like", value.toUpperCase(), "houmenkaiqi");
            return (Criteria) this;
        }
        public Criteria andHuoxiangchichunLikeInsensitive(String value) {
            addCriterion("upper(huoxiangchichun) like", value.toUpperCase(), "huoxiangchichun");
            return (Criteria) this;
        }
        public Criteria andZhengbeizhiliangLikeInsensitive(String value) {
            addCriterion("upper(zhengbeizhiliang) like", value.toUpperCase(), "zhengbeizhiliang");
            return (Criteria) this;
        }
        public Criteria andFadongjiaxinghaoLikeInsensitive(String value) {
            addCriterion("upper(fadongjiaxinghao) like", value.toUpperCase(), "fadongjiaxinghao");
            return (Criteria) this;
        }
        public Criteria andPailiangLikeInsensitive(String value) {
            addCriterion("upper(pailiang) like", value.toUpperCase(), "pailiang");
            return (Criteria) this;
        }
        public Criteria andJinqixiangshiLikeInsensitive(String value) {
            addCriterion("upper(jinqixiangshi) like", value.toUpperCase(), "jinqixiangshi");
            return (Criteria) this;
        }
        public Criteria andQigangpailiexingshiLikeInsensitive(String value) {
            addCriterion("upper(qigangpailiexingshi) like", value.toUpperCase(), "qigangpailiexingshi");
            return (Criteria) this;
        }
        public Criteria andQigangLikeInsensitive(String value) {
            addCriterion("upper(qigang) like", value.toUpperCase(), "qigang");
            return (Criteria) this;
        }
        public Criteria andMeigangqimenshuLikeInsensitive(String value) {
            addCriterion("upper(meigangqimenshu) like", value.toUpperCase(), "meigangqimenshu");
            return (Criteria) this;
        }
        public Criteria andYasuobiLikeInsensitive(String value) {
            addCriterion("upper(yasuobi) like", value.toUpperCase(), "yasuobi");
            return (Criteria) this;
        }
        public Criteria andPeiqijigouLikeInsensitive(String value) {
            addCriterion("upper(peiqijigou) like", value.toUpperCase(), "peiqijigou");
            return (Criteria) this;
        }
        public Criteria andGangjingLikeInsensitive(String value) {
            addCriterion("upper(gangjing) like", value.toUpperCase(), "gangjing");
            return (Criteria) this;
        }
        public Criteria andXingchengLikeInsensitive(String value) {
            addCriterion("upper(xingcheng) like", value.toUpperCase(), "xingcheng");
            return (Criteria) this;
        }
        public Criteria andZuida_maliLikeInsensitive(String value) {
            addCriterion("upper(zuida_mali) like", value.toUpperCase(), "zuida_mali");
            return (Criteria) this;
        }
        public Criteria andZuida_gonglvLikeInsensitive(String value) {
            addCriterion("upper(zuida_gonglv) like", value.toUpperCase(), "zuida_gonglv");
            return (Criteria) this;
        }
        public Criteria andZuida_zhuansuLikeInsensitive(String value) {
            addCriterion("upper(zuida_zhuansu) like", value.toUpperCase(), "zuida_zhuansu");
            return (Criteria) this;
        }
        public Criteria andZuida_niujvLikeInsensitive(String value) {
            addCriterion("upper(zuida_niujv) like", value.toUpperCase(), "zuida_niujv");
            return (Criteria) this;
        }
        public Criteria andZuida_nuijvzhuansuLikeInsensitive(String value) {
            addCriterion("upper(zuida_nuijvzhuansu) like", value.toUpperCase(), "zuida_nuijvzhuansu");
            return (Criteria) this;
        }
        public Criteria andTeyoujishhuLikeInsensitive(String value) {
            addCriterion("upper(teyoujishhu) like", value.toUpperCase(), "teyoujishhu");
            return (Criteria) this;
        }
        public Criteria andRanliaoxingshiLikeInsensitive(String value) {
            addCriterion("upper(ranliaoxingshi) like", value.toUpperCase(), "ranliaoxingshi");
            return (Criteria) this;
        }
        public Criteria andRanyoubiaohaoLikeInsensitive(String value) {
            addCriterion("upper(ranyoubiaohao) like", value.toUpperCase(), "ranyoubiaohao");
            return (Criteria) this;
        }
        public Criteria andGongyoufangshiLikeInsensitive(String value) {
            addCriterion("upper(gongyoufangshi) like", value.toUpperCase(), "gongyoufangshi");
            return (Criteria) this;
        }
        public Criteria andGanggaicailiaoLikeInsensitive(String value) {
            addCriterion("upper(ganggaicailiao) like", value.toUpperCase(), "ganggaicailiao");
            return (Criteria) this;
        }
        public Criteria andGangticailiaoLikeInsensitive(String value) {
            addCriterion("upper(gangticailiao) like", value.toUpperCase(), "gangticailiao");
            return (Criteria) this;
        }
        public Criteria andHuanbaobiaozhuanLikeInsensitive(String value) {
            addCriterion("upper(huanbaobiaozhuan) like", value.toUpperCase(), "huanbaobiaozhuan");
            return (Criteria) this;
        }
        public Criteria andDianjia_leixingLikeInsensitive(String value) {
            addCriterion("upper(dianjia_leixing) like", value.toUpperCase(), "dianjia_leixing");
            return (Criteria) this;
        }
        public Criteria andDainji_zongguonglvLikeInsensitive(String value) {
            addCriterion("upper(dainji_zongguonglv) like", value.toUpperCase(), "dainji_zongguonglv");
            return (Criteria) this;
        }
        public Criteria andDianji_zongniujvLikeInsensitive(String value) {
            addCriterion("upper(dianji_zongniujv) like", value.toUpperCase(), "dianji_zongniujv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidadonglvLikeInsensitive(String value) {
            addCriterion("upper(qiandainji_zuidadonglv) like", value.toUpperCase(), "qiandainji_zuidadonglv");
            return (Criteria) this;
        }
        public Criteria andQiandainji_zuidaniujvLikeInsensitive(String value) {
            addCriterion("upper(qiandainji_zuidaniujv) like", value.toUpperCase(), "qiandainji_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andHoutianji_zuidagonglvLikeInsensitive(String value) {
            addCriterion("upper(houtianji_zuidagonglv) like", value.toUpperCase(), "houtianji_zuidagonglv");
            return (Criteria) this;
        }
        public Criteria andHoudainjia_zuidaniujvLikeInsensitive(String value) {
            addCriterion("upper(houdainjia_zuidaniujv) like", value.toUpperCase(), "houdainjia_zuidaniujv");
            return (Criteria) this;
        }
        public Criteria andXitong_zonghegonglvLikeInsensitive(String value) {
            addCriterion("upper(xitong_zonghegonglv) like", value.toUpperCase(), "xitong_zonghegonglv");
            return (Criteria) this;
        }
        public Criteria andXitong_zongheniujvLikeInsensitive(String value) {
            addCriterion("upper(xitong_zongheniujv) like", value.toUpperCase(), "xitong_zongheniujv");
            return (Criteria) this;
        }
        public Criteria andQvdongdianjishuLikeInsensitive(String value) {
            addCriterion("upper(qvdongdianjishu) like", value.toUpperCase(), "qvdongdianjishu");
            return (Criteria) this;
        }
        public Criteria andDianjibuqvLikeInsensitive(String value) {
            addCriterion("upper(dianjibuqv) like", value.toUpperCase(), "dianjibuqv");
            return (Criteria) this;
        }
        public Criteria andDianchileixingLikeInsensitive(String value) {
            addCriterion("upper(dianchileixing) like", value.toUpperCase(), "dianchileixing");
            return (Criteria) this;
        }
        public Criteria andNengyuanleixingLikeInsensitive(String value) {
            addCriterion("upper(nengyuanleixing) like", value.toUpperCase(), "nengyuanleixing");
            return (Criteria) this;
        }
        public Criteria andXvhuanglichengLikeInsensitive(String value) {
            addCriterion("upper(xvhuanglicheng) like", value.toUpperCase(), "xvhuanglicheng");
            return (Criteria) this;
        }
        public Criteria andBaiFenBiLikeInsensitive(String value) {
            addCriterion("upper(baiFenBi) like", value.toUpperCase(), "baiFenBi");
            return (Criteria) this;
        }
        public Criteria andXvhanglichengLikeInsensitive(String value) {
            addCriterion("upper(xvhanglicheng) like", value.toUpperCase(), "xvhanglicheng");
            return (Criteria) this;
        }
        public Criteria andDainchirongliangLikeInsensitive(String value) {
            addCriterion("upper(dainchirongliang) like", value.toUpperCase(), "dainchirongliang");
            return (Criteria) this;
        }
        public Criteria andYouhaoLikeInsensitive(String value) {
            addCriterion("upper(youhao) like", value.toUpperCase(), "youhao");
            return (Criteria) this;
        }
        public Criteria andKuaichnegdainliangLikeInsensitive(String value) {
            addCriterion("upper(kuaichnegdainliang) like", value.toUpperCase(), "kuaichnegdainliang");
            return (Criteria) this;
        }
        public Criteria andChengdianzhnagjiageLikeInsensitive(String value) {
            addCriterion("upper(chengdianzhnagjiage) like", value.toUpperCase(), "chengdianzhnagjiage");
            return (Criteria) this;
        }
        public Criteria andDangweishuLikeInsensitive(String value) {
            addCriterion("upper(dangweishu) like", value.toUpperCase(), "dangweishu");
            return (Criteria) this;
        }
        public Criteria andBiansuxiangleixingLikeInsensitive(String value) {
            addCriterion("upper(biansuxiangleixing) like", value.toUpperCase(), "biansuxiangleixing");
            return (Criteria) this;
        }
        public Criteria andJianchengLikeInsensitive(String value) {
            addCriterion("upper(jiancheng) like", value.toUpperCase(), "jiancheng");
            return (Criteria) this;
        }
        public Criteria andQvdongfangshiLikeInsensitive(String value) {
            addCriterion("upper(qvdongfangshi) like", value.toUpperCase(), "qvdongfangshi");
            return (Criteria) this;
        }
        public Criteria andQianxuan_jialeixingLikeInsensitive(String value) {
            addCriterion("upper(qianxuan_jialeixing) like", value.toUpperCase(), "qianxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andHouxuan_jialeixingLikeInsensitive(String value) {
            addCriterion("upper(houxuan_jialeixing) like", value.toUpperCase(), "houxuan_jialeixing");
            return (Criteria) this;
        }
        public Criteria andZhulileixingLikeInsensitive(String value) {
            addCriterion("upper(zhulileixing) like", value.toUpperCase(), "zhulileixing");
            return (Criteria) this;
        }
        public Criteria andChetijiegouLikeInsensitive(String value) {
            addCriterion("upper(chetijiegou) like", value.toUpperCase(), "chetijiegou");
            return (Criteria) this;
        }
        public Criteria andHouzhidongLikeInsensitive(String value) {
            addCriterion("upper(houzhidong) like", value.toUpperCase(), "houzhidong");
            return (Criteria) this;
        }
        public Criteria andHouzhidongleixingLikeInsensitive(String value) {
            addCriterion("upper(houzhidongleixing) like", value.toUpperCase(), "houzhidongleixing");
            return (Criteria) this;
        }
        public Criteria andZhuchezhidongLikeInsensitive(String value) {
            addCriterion("upper(zhuchezhidong) like", value.toUpperCase(), "zhuchezhidong");
            return (Criteria) this;
        }
        public Criteria andQianluantaiLikeInsensitive(String value) {
            addCriterion("upper(qianluantai) like", value.toUpperCase(), "qianluantai");
            return (Criteria) this;
        }
        public Criteria andHouluantaiLikeInsensitive(String value) {
            addCriterion("upper(houluantai) like", value.toUpperCase(), "houluantai");
            return (Criteria) this;
        }
        public Criteria andBeitaiLikeInsensitive(String value) {
            addCriterion("upper(beitai) like", value.toUpperCase(), "beitai");
            return (Criteria) this;
        }
        public Criteria andZhufuqilangLikeInsensitive(String value) {
            addCriterion("upper(zhufuqilang) like", value.toUpperCase(), "zhufuqilang");
            return (Criteria) this;
        }
        public Criteria andCepaiqinangLikeInsensitive(String value) {
            addCriterion("upper(cepaiqinang) like", value.toUpperCase(), "cepaiqinang");
            return (Criteria) this;
        }
        public Criteria andToubuqinangLikeInsensitive(String value) {
            addCriterion("upper(toubuqinang) like", value.toUpperCase(), "toubuqinang");
            return (Criteria) this;
        }
        public Criteria andXibuqinangLikeInsensitive(String value) {
            addCriterion("upper(xibuqinang) like", value.toUpperCase(), "xibuqinang");
            return (Criteria) this;
        }
        public Criteria andTaiyajianceLikeInsensitive(String value) {
            addCriterion("upper(taiyajiance) like", value.toUpperCase(), "taiyajiance");
            return (Criteria) this;
        }
        public Criteria andLiangtaiyaLikeInsensitive(String value) {
            addCriterion("upper(liangtaiya) like", value.toUpperCase(), "liangtaiya");
            return (Criteria) this;
        }
        public Criteria andAnquandaitishiLikeInsensitive(String value) {
            addCriterion("upper(anquandaitishi) like", value.toUpperCase(), "anquandaitishi");
            return (Criteria) this;
        }
        public Criteria andISOFIXLikeInsensitive(String value) {
            addCriterion("upper(ISOFIX) like", value.toUpperCase(), "ISOFIX");
            return (Criteria) this;
        }
        public Criteria andABSLikeInsensitive(String value) {
            addCriterion("upper(ABS) like", value.toUpperCase(), "ABS");
            return (Criteria) this;
        }
        public Criteria andZhidongfanpeiLikeInsensitive(String value) {
            addCriterion("upper(zhidongfanpei) like", value.toUpperCase(), "zhidongfanpei");
            return (Criteria) this;
        }
        public Criteria andShachefuzhuLikeInsensitive(String value) {
            addCriterion("upper(shachefuzhu) like", value.toUpperCase(), "shachefuzhu");
            return (Criteria) this;
        }
        public Criteria andQianyinlikongzhiLikeInsensitive(String value) {
            addCriterion("upper(qianyinlikongzhi) like", value.toUpperCase(), "qianyinlikongzhi");
            return (Criteria) this;
        }
        public Criteria andCheshenwendingkongzhiLikeInsensitive(String value) {
            addCriterion("upper(cheshenwendingkongzhi) like", value.toUpperCase(), "cheshenwendingkongzhi");
            return (Criteria) this;
        }
        public Criteria andBingxianfuzhuLikeInsensitive(String value) {
            addCriterion("upper(bingxianfuzhu) like", value.toUpperCase(), "bingxianfuzhu");
            return (Criteria) this;
        }
        public Criteria andPianliyvjingLikeInsensitive(String value) {
            addCriterion("upper(pianliyvjing) like", value.toUpperCase(), "pianliyvjing");
            return (Criteria) this;
        }
        public Criteria andZhudongshanchuLikeInsensitive(String value) {
            addCriterion("upper(zhudongshanchu) like", value.toUpperCase(), "zhudongshanchu");
            return (Criteria) this;
        }
        public Criteria andYieshixitongLikeInsensitive(String value) {
            addCriterion("upper(yieshixitong) like", value.toUpperCase(), "yieshixitong");
            return (Criteria) this;
        }
        public Criteria andPilaojiashiLikeInsensitive(String value) {
            addCriterion("upper(pilaojiashi) like", value.toUpperCase(), "pilaojiashi");
            return (Criteria) this;
        }
        public Criteria andZhucheliedaLikeInsensitive(String value) {
            addCriterion("upper(zhuchelieda) like", value.toUpperCase(), "zhuchelieda");
            return (Criteria) this;
        }
        public Criteria andDaocheyangxiangLikeInsensitive(String value) {
            addCriterion("upper(daocheyangxiang) like", value.toUpperCase(), "daocheyangxiang");
            return (Criteria) this;
        }
        public Criteria andQuanqingshexaingtoouLikeInsensitive(String value) {
            addCriterion("upper(quanqingshexaingtoou) like", value.toUpperCase(), "quanqingshexaingtoou");
            return (Criteria) this;
        }
        public Criteria andDingsuxunhangLikeInsensitive(String value) {
            addCriterion("upper(dingsuxunhang) like", value.toUpperCase(), "dingsuxunhang");
            return (Criteria) this;
        }
        public Criteria andZishiyingyunhangLikeInsensitive(String value) {
            addCriterion("upper(zishiyingyunhang) like", value.toUpperCase(), "zishiyingyunhang");
            return (Criteria) this;
        }
        public Criteria andZidongbuocheLikeInsensitive(String value) {
            addCriterion("upper(zidongbuoche) like", value.toUpperCase(), "zidongbuoche");
            return (Criteria) this;
        }
        public Criteria andFadongjizhantingLikeInsensitive(String value) {
            addCriterion("upper(fadongjizhanting) like", value.toUpperCase(), "fadongjizhanting");
            return (Criteria) this;
        }
        public Criteria andZhidongjiashiLikeInsensitive(String value) {
            addCriterion("upper(zhidongjiashi) like", value.toUpperCase(), "zhidongjiashi");
            return (Criteria) this;
        }
        public Criteria andShangbuofuzhuLikeInsensitive(String value) {
            addCriterion("upper(shangbuofuzhu) like", value.toUpperCase(), "shangbuofuzhu");
            return (Criteria) this;
        }
        public Criteria andZhidongzhucheLikeInsensitive(String value) {
            addCriterion("upper(zhidongzhuche) like", value.toUpperCase(), "zhidongzhuche");
            return (Criteria) this;
        }
        public Criteria andDoupohuanjiangLikeInsensitive(String value) {
            addCriterion("upper(doupohuanjiang) like", value.toUpperCase(), "doupohuanjiang");
            return (Criteria) this;
        }
        public Criteria andKebianxuanjiaLikeInsensitive(String value) {
            addCriterion("upper(kebianxuanjia) like", value.toUpperCase(), "kebianxuanjia");
            return (Criteria) this;
        }
        public Criteria andKongqixuanjiaLikeInsensitive(String value) {
            addCriterion("upper(kongqixuanjia) like", value.toUpperCase(), "kongqixuanjia");
            return (Criteria) this;
        }
        public Criteria andDainceganyingxuanjiaLikeInsensitive(String value) {
            addCriterion("upper(dainceganyingxuanjia) like", value.toUpperCase(), "dainceganyingxuanjia");
            return (Criteria) this;
        }
        public Criteria andKebianzhuanxiangbiLikeInsensitive(String value) {
            addCriterion("upper(kebianzhuanxiangbi) like", value.toUpperCase(), "kebianzhuanxiangbi");
            return (Criteria) this;
        }
        public Criteria andDiandongtianchuangLikeInsensitive(String value) {
            addCriterion("upper(diandongtianchuang) like", value.toUpperCase(), "diandongtianchuang");
            return (Criteria) this;
        }
        public Criteria andQuanjingtianchuangLikeInsensitive(String value) {
            addCriterion("upper(quanjingtianchuang) like", value.toUpperCase(), "quanjingtianchuang");
            return (Criteria) this;
        }
        public Criteria andYundongwaiguanLikeInsensitive(String value) {
            addCriterion("upper(yundongwaiguan) like", value.toUpperCase(), "yundongwaiguan");
            return (Criteria) this;
        }
        public Criteria andLuhejinlunquanLikeInsensitive(String value) {
            addCriterion("upper(luhejinlunquan) like", value.toUpperCase(), "luhejinlunquan");
            return (Criteria) this;
        }
        public Criteria andDaindongxihemenLikeInsensitive(String value) {
            addCriterion("upper(daindongxihemen) like", value.toUpperCase(), "daindongxihemen");
            return (Criteria) this;
        }
        public Criteria andCehuamenLikeInsensitive(String value) {
            addCriterion("upper(cehuamen) like", value.toUpperCase(), "cehuamen");
            return (Criteria) this;
        }
        public Criteria andDiandonghuobeixiangLikeInsensitive(String value) {
            addCriterion("upper(diandonghuobeixiang) like", value.toUpperCase(), "diandonghuobeixiang");
            return (Criteria) this;
        }
        public Criteria andGanyinghoubeixingLikeInsensitive(String value) {
            addCriterion("upper(ganyinghoubeixing) like", value.toUpperCase(), "ganyinghoubeixing");
            return (Criteria) this;
        }
        public Criteria andChedingxinglijiaLikeInsensitive(String value) {
            addCriterion("upper(chedingxinglijia) like", value.toUpperCase(), "chedingxinglijia");
            return (Criteria) this;
        }
        public Criteria andFadongjiadianzifangdaoLikeInsensitive(String value) {
            addCriterion("upper(fadongjiadianzifangdao) like", value.toUpperCase(), "fadongjiadianzifangdao");
            return (Criteria) this;
        }
        public Criteria andChenenzhongkongsuoLikeInsensitive(String value) {
            addCriterion("upper(chenenzhongkongsuo) like", value.toUpperCase(), "chenenzhongkongsuo");
            return (Criteria) this;
        }
        public Criteria andYaokongyaoshiLikeInsensitive(String value) {
            addCriterion("upper(yaokongyaoshi) like", value.toUpperCase(), "yaokongyaoshi");
            return (Criteria) this;
        }
        public Criteria andWuyaoshiqidongxitongLikeInsensitive(String value) {
            addCriterion("upper(wuyaoshiqidongxitong) like", value.toUpperCase(), "wuyaoshiqidongxitong");
            return (Criteria) this;
        }
        public Criteria andWuyaoshijinruxitongLikeInsensitive(String value) {
            addCriterion("upper(wuyaoshijinruxitong) like", value.toUpperCase(), "wuyaoshijinruxitong");
            return (Criteria) this;
        }
        public Criteria andYuanchengqidongLikeInsensitive(String value) {
            addCriterion("upper(yuanchengqidong) like", value.toUpperCase(), "yuanchengqidong");
            return (Criteria) this;
        }
        public Criteria andPizhifangxiangpanLikeInsensitive(String value) {
            addCriterion("upper(pizhifangxiangpan) like", value.toUpperCase(), "pizhifangxiangpan");
            return (Criteria) this;
        }
        public Criteria andFangxiangpantiaojieqiLikeInsensitive(String value) {
            addCriterion("upper(fangxiangpantiaojieqi) like", value.toUpperCase(), "fangxiangpantiaojieqi");
            return (Criteria) this;
        }
        public Criteria andFangxiangpandiandongtiaojieLikeInsensitive(String value) {
            addCriterion("upper(fangxiangpandiandongtiaojie) like", value.toUpperCase(), "fangxiangpandiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andDuogongnnegfangxiangpanLikeInsensitive(String value) {
            addCriterion("upper(duogongnnegfangxiangpan) like", value.toUpperCase(), "duogongnnegfangxiangpan");
            return (Criteria) this;
        }
        public Criteria andFxp_huandangLikeInsensitive(String value) {
            addCriterion("upper(fxp_huandang) like", value.toUpperCase(), "fxp_huandang");
            return (Criteria) this;
        }
        public Criteria andFxp_jiareLikeInsensitive(String value) {
            addCriterion("upper(fxp_jiare) like", value.toUpperCase(), "fxp_jiare");
            return (Criteria) this;
        }
        public Criteria andFxp_jiyiLikeInsensitive(String value) {
            addCriterion("upper(fxp_jiyi) like", value.toUpperCase(), "fxp_jiyi");
            return (Criteria) this;
        }
        public Criteria andDainnaoxianshipingLikeInsensitive(String value) {
            addCriterion("upper(dainnaoxianshiping) like", value.toUpperCase(), "dainnaoxianshiping");
            return (Criteria) this;
        }
        public Criteria andYiejingyibiaopanLikeInsensitive(String value) {
            addCriterion("upper(yiejingyibiaopan) like", value.toUpperCase(), "yiejingyibiaopan");
            return (Criteria) this;
        }
        public Criteria andHUDLikeInsensitive(String value) {
            addCriterion("upper(HUD) like", value.toUpperCase(), "HUD");
            return (Criteria) this;
        }
        public Criteria andNenzhixingchejiluyiLikeInsensitive(String value) {
            addCriterion("upper(nenzhixingchejiluyi) like", value.toUpperCase(), "nenzhixingchejiluyi");
            return (Criteria) this;
        }
        public Criteria andZhudongjiangzaoLikeInsensitive(String value) {
            addCriterion("upper(zhudongjiangzao) like", value.toUpperCase(), "zhudongjiangzao");
            return (Criteria) this;
        }
        public Criteria andShoujiwuxianchengdianLikeInsensitive(String value) {
            addCriterion("upper(shoujiwuxianchengdian) like", value.toUpperCase(), "shoujiwuxianchengdian");
            return (Criteria) this;
        }
        public Criteria andZuoyicaizhiLikeInsensitive(String value) {
            addCriterion("upper(zuoyicaizhi) like", value.toUpperCase(), "zuoyicaizhi");
            return (Criteria) this;
        }
        public Criteria andYongdongfenggezuoyiLikeInsensitive(String value) {
            addCriterion("upper(yongdongfenggezuoyi) like", value.toUpperCase(), "yongdongfenggezuoyi");
            return (Criteria) this;
        }
        public Criteria andZuoyigaoditiaojieLikeInsensitive(String value) {
            addCriterion("upper(zuoyigaoditiaojie) like", value.toUpperCase(), "zuoyigaoditiaojie");
            return (Criteria) this;
        }
        public Criteria andYaobuzhichengtiaojieLikeInsensitive(String value) {
            addCriterion("upper(yaobuzhichengtiaojie) like", value.toUpperCase(), "yaobuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andJianbuzhichengtiaojieLikeInsensitive(String value) {
            addCriterion("upper(jianbuzhichengtiaojie) like", value.toUpperCase(), "jianbuzhichengtiaojie");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyitiaojieLikeInsensitive(String value) {
            addCriterion("upper(diandongzuoyitiaojie) like", value.toUpperCase(), "diandongzuoyitiaojie");
            return (Criteria) this;
        }
        public Criteria andJiaodutiaojieLikeInsensitive(String value) {
            addCriterion("upper(jiaodutiaojie) like", value.toUpperCase(), "jiaodutiaojie");
            return (Criteria) this;
        }
        public Criteria andDierpaizuoyiyidongLikeInsensitive(String value) {
            addCriterion("upper(dierpaizuoyiyidong) like", value.toUpperCase(), "dierpaizuoyiyidong");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyidiandongtiaojieLikeInsensitive(String value) {
            addCriterion("upper(houpaizuoyidiandongtiaojie) like", value.toUpperCase(), "houpaizuoyidiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andFujiashiketiaojieLikeInsensitive(String value) {
            addCriterion("upper(fujiashiketiaojie) like", value.toUpperCase(), "fujiashiketiaojie");
            return (Criteria) this;
        }
        public Criteria andDiandongzuoyijiyiLikeInsensitive(String value) {
            addCriterion("upper(diandongzuoyijiyi) like", value.toUpperCase(), "diandongzuoyijiyi");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyijiareLikeInsensitive(String value) {
            addCriterion("upper(qianhoupaizuoyijiare) like", value.toUpperCase(), "qianhoupaizuoyijiare");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyidongfengLikeInsensitive(String value) {
            addCriterion("upper(qianhoupaizuoyidongfeng) like", value.toUpperCase(), "qianhoupaizuoyidongfeng");
            return (Criteria) this;
        }
        public Criteria andQianhoupaizuoyianmoLikeInsensitive(String value) {
            addCriterion("upper(qianhoupaizuoyianmo) like", value.toUpperCase(), "qianhoupaizuoyianmo");
            return (Criteria) this;
        }
        public Criteria andDierpaidulizuoyiLikeInsensitive(String value) {
            addCriterion("upper(dierpaidulizuoyi) like", value.toUpperCase(), "dierpaidulizuoyi");
            return (Criteria) this;
        }
        public Criteria andDisanpaizuoyiLikeInsensitive(String value) {
            addCriterion("upper(disanpaizuoyi) like", value.toUpperCase(), "disanpaizuoyi");
            return (Criteria) this;
        }
        public Criteria andHoupaizuoyifabfshiLikeInsensitive(String value) {
            addCriterion("upper(houpaizuoyifabfshi) like", value.toUpperCase(), "houpaizuoyifabfshi");
            return (Criteria) this;
        }
        public Criteria andQianhouzhongyangfushouLikeInsensitive(String value) {
            addCriterion("upper(qianhouzhongyangfushou) like", value.toUpperCase(), "qianhouzhongyangfushou");
            return (Criteria) this;
        }
        public Criteria andHoupaibeijiaLikeInsensitive(String value) {
            addCriterion("upper(houpaibeijia) like", value.toUpperCase(), "houpaibeijia");
            return (Criteria) this;
        }
        public Criteria andJiarezhilingbeijiaLikeInsensitive(String value) {
            addCriterion("upper(jiarezhilingbeijia) like", value.toUpperCase(), "jiarezhilingbeijia");
            return (Criteria) this;
        }
        public Criteria andGPSLikeInsensitive(String value) {
            addCriterion("upper(GPS) like", value.toUpperCase(), "GPS");
            return (Criteria) this;
        }
        public Criteria andDingweihudongfuwuLikeInsensitive(String value) {
            addCriterion("upper(dingweihudongfuwu) like", value.toUpperCase(), "dingweihudongfuwu");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingLikeInsensitive(String value) {
            addCriterion("upper(zhongkongtai_daping) like", value.toUpperCase(), "zhongkongtai_daping");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_dapingchicunLikeInsensitive(String value) {
            addCriterion("upper(zhongkongtai_dapingchicun) like", value.toUpperCase(), "zhongkongtai_dapingchicun");
            return (Criteria) this;
        }
        public Criteria andZhongkongtai_xianshiLikeInsensitive(String value) {
            addCriterion("upper(zhongkongtai_xianshi) like", value.toUpperCase(), "zhongkongtai_xianshi");
            return (Criteria) this;
        }
        public Criteria andLanyachezaidianhuLikeInsensitive(String value) {
            addCriterion("upper(lanyachezaidianhu) like", value.toUpperCase(), "lanyachezaidianhu");
            return (Criteria) this;
        }
        public Criteria andShoujihulianyingsheLikeInsensitive(String value) {
            addCriterion("upper(shoujihulianyingshe) like", value.toUpperCase(), "shoujihulianyingshe");
            return (Criteria) this;
        }
        public Criteria andChelianwangLikeInsensitive(String value) {
            addCriterion("upper(chelianwang) like", value.toUpperCase(), "chelianwang");
            return (Criteria) this;
        }
        public Criteria andChezaidianshiLikeInsensitive(String value) {
            addCriterion("upper(chezaidianshi) like", value.toUpperCase(), "chezaidianshi");
            return (Criteria) this;
        }
        public Criteria andHoupaiyiejingpingLikeInsensitive(String value) {
            addCriterion("upper(houpaiyiejingping) like", value.toUpperCase(), "houpaiyiejingping");
            return (Criteria) this;
        }
        public Criteria andDianyuanLikeInsensitive(String value) {
            addCriterion("upper(dianyuan) like", value.toUpperCase(), "dianyuan");
            return (Criteria) this;
        }
        public Criteria andWaijieyinwuanjiekouLikeInsensitive(String value) {
            addCriterion("upper(waijieyinwuanjiekou) like", value.toUpperCase(), "waijieyinwuanjiekou");
            return (Criteria) this;
        }
        public Criteria andCDDVDLikeInsensitive(String value) {
            addCriterion("upper(CDDVD) like", value.toUpperCase(), "CDDVD");
            return (Criteria) this;
        }
        public Criteria andYinxhangpinpaiLikeInsensitive(String value) {
            addCriterion("upper(yinxhangpinpai) like", value.toUpperCase(), "yinxhangpinpai");
            return (Criteria) this;
        }
        public Criteria andYinxiangshuliangLikeInsensitive(String value) {
            addCriterion("upper(yinxiangshuliang) like", value.toUpperCase(), "yinxiangshuliang");
            return (Criteria) this;
        }
        public Criteria andJinguangdengLikeInsensitive(String value) {
            addCriterion("upper(jinguangdeng) like", value.toUpperCase(), "jinguangdeng");
            return (Criteria) this;
        }
        public Criteria andYuanguangdengLikeInsensitive(String value) {
            addCriterion("upper(yuanguangdeng) like", value.toUpperCase(), "yuanguangdeng");
            return (Criteria) this;
        }
        public Criteria andLEDLikeInsensitive(String value) {
            addCriterion("upper(LED) like", value.toUpperCase(), "LED");
            return (Criteria) this;
        }
        public Criteria andZishiyingyuanjinguangLikeInsensitive(String value) {
            addCriterion("upper(zishiyingyuanjinguang) like", value.toUpperCase(), "zishiyingyuanjinguang");
            return (Criteria) this;
        }
        public Criteria andZidongtoudengLikeInsensitive(String value) {
            addCriterion("upper(zidongtoudeng) like", value.toUpperCase(), "zidongtoudeng");
            return (Criteria) this;
        }
        public Criteria andZuangxhangfuzhudengLikeInsensitive(String value) {
            addCriterion("upper(zuangxhangfuzhudeng) like", value.toUpperCase(), "zuangxhangfuzhudeng");
            return (Criteria) this;
        }
        public Criteria andZhuangxhangdengLikeInsensitive(String value) {
            addCriterion("upper(zhuangxhangdeng) like", value.toUpperCase(), "zhuangxhangdeng");
            return (Criteria) this;
        }
        public Criteria andQianwedingLikeInsensitive(String value) {
            addCriterion("upper(qianweding) like", value.toUpperCase(), "qianweding");
            return (Criteria) this;
        }
        public Criteria andDadenggaodutijieLikeInsensitive(String value) {
            addCriterion("upper(dadenggaodutijie) like", value.toUpperCase(), "dadenggaodutijie");
            return (Criteria) this;
        }
        public Criteria andDadengqingxizhuangzhiLikeInsensitive(String value) {
            addCriterion("upper(dadengqingxizhuangzhi) like", value.toUpperCase(), "dadengqingxizhuangzhi");
            return (Criteria) this;
        }
        public Criteria andChennengfenweidengLikeInsensitive(String value) {
            addCriterion("upper(chennengfenweideng) like", value.toUpperCase(), "chennengfenweideng");
            return (Criteria) this;
        }
        public Criteria andDiandongchechaungLikeInsensitive(String value) {
            addCriterion("upper(diandongchechaung) like", value.toUpperCase(), "diandongchechaung");
            return (Criteria) this;
        }
        public Criteria andYijiangshangjiangLikeInsensitive(String value) {
            addCriterion("upper(yijiangshangjiang) like", value.toUpperCase(), "yijiangshangjiang");
            return (Criteria) this;
        }
        public Criteria andFangjiashouLikeInsensitive(String value) {
            addCriterion("upper(fangjiashou) like", value.toUpperCase(), "fangjiashou");
            return (Criteria) this;
        }
        public Criteria andGereboliLikeInsensitive(String value) {
            addCriterion("upper(gereboli) like", value.toUpperCase(), "gereboli");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongtiaojieLikeInsensitive(String value) {
            addCriterion("upper(houshijingdiandongtiaojie) like", value.toUpperCase(), "houshijingdiandongtiaojie");
            return (Criteria) this;
        }
        public Criteria andHoushijingjiareLikeInsensitive(String value) {
            addCriterion("upper(houshijingjiare) like", value.toUpperCase(), "houshijingjiare");
            return (Criteria) this;
        }
        public Criteria andNenwaihoushijingfangxuanyunLikeInsensitive(String value) {
            addCriterion("upper(nenwaihoushijingfangxuanyun) like", value.toUpperCase(), "nenwaihoushijingfangxuanyun");
            return (Criteria) this;
        }
        public Criteria andJiumeitichenenghoushijingLikeInsensitive(String value) {
            addCriterion("upper(jiumeitichenenghoushijing) like", value.toUpperCase(), "jiumeitichenenghoushijing");
            return (Criteria) this;
        }
        public Criteria andHoushijingdiandongzhedieLikeInsensitive(String value) {
            addCriterion("upper(houshijingdiandongzhedie) like", value.toUpperCase(), "houshijingdiandongzhedie");
            return (Criteria) this;
        }
        public Criteria andHoushijiangjiyiLikeInsensitive(String value) {
            addCriterion("upper(houshijiangjiyi) like", value.toUpperCase(), "houshijiangjiyi");
            return (Criteria) this;
        }
        public Criteria andZheyanglianLikeInsensitive(String value) {
            addCriterion("upper(zheyanglian) like", value.toUpperCase(), "zheyanglian");
            return (Criteria) this;
        }
        public Criteria andHoupaizheyanglianLikeInsensitive(String value) {
            addCriterion("upper(houpaizheyanglian) like", value.toUpperCase(), "houpaizheyanglian");
            return (Criteria) this;
        }
        public Criteria andHoupaiyinsiboliLikeInsensitive(String value) {
            addCriterion("upper(houpaiyinsiboli) like", value.toUpperCase(), "houpaiyinsiboli");
            return (Criteria) this;
        }
        public Criteria andZheyangbanhuangzhuangjingLikeInsensitive(String value) {
            addCriterion("upper(zheyangbanhuangzhuangjing) like", value.toUpperCase(), "zheyangbanhuangzhuangjing");
            return (Criteria) this;
        }
        public Criteria andHouyvshuaLikeInsensitive(String value) {
            addCriterion("upper(houyvshua) like", value.toUpperCase(), "houyvshua");
            return (Criteria) this;
        }
        public Criteria andGanyingyvshuLikeInsensitive(String value) {
            addCriterion("upper(ganyingyvshu) like", value.toUpperCase(), "ganyingyvshu");
            return (Criteria) this;
        }
        public Criteria andKongtiaokongzhifangshiLikeInsensitive(String value) {
            addCriterion("upper(kongtiaokongzhifangshi) like", value.toUpperCase(), "kongtiaokongzhifangshi");
            return (Criteria) this;
        }
        public Criteria andHoupaidulikongtiaoLikeInsensitive(String value) {
            addCriterion("upper(houpaidulikongtiao) like", value.toUpperCase(), "houpaidulikongtiao");
            return (Criteria) this;
        }
        public Criteria andHoupaichufengkouLikeInsensitive(String value) {
            addCriterion("upper(houpaichufengkou) like", value.toUpperCase(), "houpaichufengkou");
            return (Criteria) this;
        }
        public Criteria andWendufenqvkongzhiLikeInsensitive(String value) {
            addCriterion("upper(wendufenqvkongzhi) like", value.toUpperCase(), "wendufenqvkongzhi");
            return (Criteria) this;
        }
        public Criteria andHuafenguolvLikeInsensitive(String value) {
            addCriterion("upper(huafenguolv) like", value.toUpperCase(), "huafenguolv");
            return (Criteria) this;
        }
        public Criteria andChezaijinghuaqiLikeInsensitive(String value) {
            addCriterion("upper(chezaijinghuaqi) like", value.toUpperCase(), "chezaijinghuaqi");
            return (Criteria) this;
        }
        public Criteria andChezaibingxiangLikeInsensitive(String value) {
            addCriterion("upper(chezaibingxiang) like", value.toUpperCase(), "chezaibingxiang");
            return (Criteria) this;
        }
        public Criteria andWaiguanyanseLikeInsensitive(String value) {
            addCriterion("upper(waiguanyanse) like", value.toUpperCase(), "waiguanyanse");
            return (Criteria) this;
        }
        public Criteria andNeshiyansiLikeInsensitive(String value) {
            addCriterion("upper(neshiyansi) like", value.toUpperCase(), "neshiyansi");
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