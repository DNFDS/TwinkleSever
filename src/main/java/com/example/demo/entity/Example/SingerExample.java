package com.example.demo.entity.Example;

import java.util.ArrayList;
import java.util.List;

public class SingerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SingerExample() {
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

        public Criteria andSingeridIsNull() {
            addCriterion("SINGERID is null");
            return (Criteria) this;
        }

        public Criteria andSingeridIsNotNull() {
            addCriterion("SINGERID is not null");
            return (Criteria) this;
        }

        public Criteria andSingeridEqualTo(String value) {
            addCriterion("SINGERID =", value, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridNotEqualTo(String value) {
            addCriterion("SINGERID <>", value, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridGreaterThan(String value) {
            addCriterion("SINGERID >", value, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridGreaterThanOrEqualTo(String value) {
            addCriterion("SINGERID >=", value, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridLessThan(String value) {
            addCriterion("SINGERID <", value, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridLessThanOrEqualTo(String value) {
            addCriterion("SINGERID <=", value, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridLike(String value) {
            addCriterion("SINGERID like", value, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridNotLike(String value) {
            addCriterion("SINGERID not like", value, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridIn(List<String> values) {
            addCriterion("SINGERID in", values, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridNotIn(List<String> values) {
            addCriterion("SINGERID not in", values, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridBetween(String value1, String value2) {
            addCriterion("SINGERID between", value1, value2, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingeridNotBetween(String value1, String value2) {
            addCriterion("SINGERID not between", value1, value2, "singerid");
            return (Criteria) this;
        }

        public Criteria andSingernameIsNull() {
            addCriterion("SINGERNAME is null");
            return (Criteria) this;
        }

        public Criteria andSingernameIsNotNull() {
            addCriterion("SINGERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSingernameEqualTo(String value) {
            addCriterion("SINGERNAME =", value, "singername");
            return (Criteria) this;
        }

        public Criteria andSingernameNotEqualTo(String value) {
            addCriterion("SINGERNAME <>", value, "singername");
            return (Criteria) this;
        }

        public Criteria andSingernameGreaterThan(String value) {
            addCriterion("SINGERNAME >", value, "singername");
            return (Criteria) this;
        }

        public Criteria andSingernameGreaterThanOrEqualTo(String value) {
            addCriterion("SINGERNAME >=", value, "singername");
            return (Criteria) this;
        }

        public Criteria andSingernameLessThan(String value) {
            addCriterion("SINGERNAME <", value, "singername");
            return (Criteria) this;
        }

        public Criteria andSingernameLessThanOrEqualTo(String value) {
            addCriterion("SINGERNAME <=", value, "singername");
            return (Criteria) this;
        }

        public Criteria andSingernameLike(String value) {
            addCriterion("SINGERNAME like", value, "singername");
            return (Criteria) this;
        }

        public Criteria andSingernameNotLike(String value) {
            addCriterion("SINGERNAME not like", value, "singername");
            return (Criteria) this;
        }

        public Criteria andSingernameIn(List<String> values) {
            addCriterion("SINGERNAME in", values, "singername");
            return (Criteria) this;
        }

        public Criteria andSingernameNotIn(List<String> values) {
            addCriterion("SINGERNAME not in", values, "singername");
            return (Criteria) this;
        }

        public Criteria andSingernameBetween(String value1, String value2) {
            addCriterion("SINGERNAME between", value1, value2, "singername");
            return (Criteria) this;
        }

        public Criteria andSingernameNotBetween(String value1, String value2) {
            addCriterion("SINGERNAME not between", value1, value2, "singername");
            return (Criteria) this;
        }

        public Criteria andSingerimageIsNull() {
            addCriterion("SINGERIMAGE is null");
            return (Criteria) this;
        }

        public Criteria andSingerimageIsNotNull() {
            addCriterion("SINGERIMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andSingerimageEqualTo(String value) {
            addCriterion("SINGERIMAGE =", value, "singerimage");
            return (Criteria) this;
        }

        public Criteria andSingerimageNotEqualTo(String value) {
            addCriterion("SINGERIMAGE <>", value, "singerimage");
            return (Criteria) this;
        }

        public Criteria andSingerimageGreaterThan(String value) {
            addCriterion("SINGERIMAGE >", value, "singerimage");
            return (Criteria) this;
        }

        public Criteria andSingerimageGreaterThanOrEqualTo(String value) {
            addCriterion("SINGERIMAGE >=", value, "singerimage");
            return (Criteria) this;
        }

        public Criteria andSingerimageLessThan(String value) {
            addCriterion("SINGERIMAGE <", value, "singerimage");
            return (Criteria) this;
        }

        public Criteria andSingerimageLessThanOrEqualTo(String value) {
            addCriterion("SINGERIMAGE <=", value, "singerimage");
            return (Criteria) this;
        }

        public Criteria andSingerimageLike(String value) {
            addCriterion("SINGERIMAGE like", value, "singerimage");
            return (Criteria) this;
        }

        public Criteria andSingerimageNotLike(String value) {
            addCriterion("SINGERIMAGE not like", value, "singerimage");
            return (Criteria) this;
        }

        public Criteria andSingerimageIn(List<String> values) {
            addCriterion("SINGERIMAGE in", values, "singerimage");
            return (Criteria) this;
        }

        public Criteria andSingerimageNotIn(List<String> values) {
            addCriterion("SINGERIMAGE not in", values, "singerimage");
            return (Criteria) this;
        }

        public Criteria andSingerimageBetween(String value1, String value2) {
            addCriterion("SINGERIMAGE between", value1, value2, "singerimage");
            return (Criteria) this;
        }

        public Criteria andSingerimageNotBetween(String value1, String value2) {
            addCriterion("SINGERIMAGE not between", value1, value2, "singerimage");
            return (Criteria) this;
        }

        public Criteria andSingersexIsNull() {
            addCriterion("SINGERSEX is null");
            return (Criteria) this;
        }

        public Criteria andSingersexIsNotNull() {
            addCriterion("SINGERSEX is not null");
            return (Criteria) this;
        }

        public Criteria andSingersexEqualTo(String value) {
            addCriterion("SINGERSEX =", value, "singersex");
            return (Criteria) this;
        }

        public Criteria andSingersexNotEqualTo(String value) {
            addCriterion("SINGERSEX <>", value, "singersex");
            return (Criteria) this;
        }

        public Criteria andSingersexGreaterThan(String value) {
            addCriterion("SINGERSEX >", value, "singersex");
            return (Criteria) this;
        }

        public Criteria andSingersexGreaterThanOrEqualTo(String value) {
            addCriterion("SINGERSEX >=", value, "singersex");
            return (Criteria) this;
        }

        public Criteria andSingersexLessThan(String value) {
            addCriterion("SINGERSEX <", value, "singersex");
            return (Criteria) this;
        }

        public Criteria andSingersexLessThanOrEqualTo(String value) {
            addCriterion("SINGERSEX <=", value, "singersex");
            return (Criteria) this;
        }

        public Criteria andSingersexLike(String value) {
            addCriterion("SINGERSEX like", value, "singersex");
            return (Criteria) this;
        }

        public Criteria andSingersexNotLike(String value) {
            addCriterion("SINGERSEX not like", value, "singersex");
            return (Criteria) this;
        }

        public Criteria andSingersexIn(List<String> values) {
            addCriterion("SINGERSEX in", values, "singersex");
            return (Criteria) this;
        }

        public Criteria andSingersexNotIn(List<String> values) {
            addCriterion("SINGERSEX not in", values, "singersex");
            return (Criteria) this;
        }

        public Criteria andSingersexBetween(String value1, String value2) {
            addCriterion("SINGERSEX between", value1, value2, "singersex");
            return (Criteria) this;
        }

        public Criteria andSingersexNotBetween(String value1, String value2) {
            addCriterion("SINGERSEX not between", value1, value2, "singersex");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("REGION is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("REGION is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("REGION =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("REGION <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("REGION >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("REGION >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("REGION <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("REGION <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("REGION like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("REGION not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("REGION in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("REGION not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("REGION between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("REGION not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("INTRODUCTION is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("INTRODUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("INTRODUCTION =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("INTRODUCTION <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("INTRODUCTION >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("INTRODUCTION <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("INTRODUCTION like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("INTRODUCTION not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("INTRODUCTION in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("INTRODUCTION not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("INTRODUCTION between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("INTRODUCTION not between", value1, value2, "introduction");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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