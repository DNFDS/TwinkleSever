package com.example.demo.entity.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GetFalseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GetFalseExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andSongidIsNull() {
            addCriterion("SONGID is null");
            return (Criteria) this;
        }

        public Criteria andSongidIsNotNull() {
            addCriterion("SONGID is not null");
            return (Criteria) this;
        }

        public Criteria andSongidEqualTo(String value) {
            addCriterion("SONGID =", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidNotEqualTo(String value) {
            addCriterion("SONGID <>", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidGreaterThan(String value) {
            addCriterion("SONGID >", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidGreaterThanOrEqualTo(String value) {
            addCriterion("SONGID >=", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidLessThan(String value) {
            addCriterion("SONGID <", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidLessThanOrEqualTo(String value) {
            addCriterion("SONGID <=", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidLike(String value) {
            addCriterion("SONGID like", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidNotLike(String value) {
            addCriterion("SONGID not like", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidIn(List<String> values) {
            addCriterion("SONGID in", values, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidNotIn(List<String> values) {
            addCriterion("SONGID not in", values, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidBetween(String value1, String value2) {
            addCriterion("SONGID between", value1, value2, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidNotBetween(String value1, String value2) {
            addCriterion("SONGID not between", value1, value2, "songid");
            return (Criteria) this;
        }

        public Criteria andGetfalsetimeIsNull() {
            addCriterion("GETFALSETIME is null");
            return (Criteria) this;
        }

        public Criteria andGetfalsetimeIsNotNull() {
            addCriterion("GETFALSETIME is not null");
            return (Criteria) this;
        }

        public Criteria andGetfalsetimeEqualTo(Date value) {
            addCriterion("GETFALSETIME =", value, "getfalsetime");
            return (Criteria) this;
        }

        public Criteria andGetfalsetimeNotEqualTo(Date value) {
            addCriterion("GETFALSETIME <>", value, "getfalsetime");
            return (Criteria) this;
        }

        public Criteria andGetfalsetimeGreaterThan(Date value) {
            addCriterion("GETFALSETIME >", value, "getfalsetime");
            return (Criteria) this;
        }

        public Criteria andGetfalsetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("GETFALSETIME >=", value, "getfalsetime");
            return (Criteria) this;
        }

        public Criteria andGetfalsetimeLessThan(Date value) {
            addCriterion("GETFALSETIME <", value, "getfalsetime");
            return (Criteria) this;
        }

        public Criteria andGetfalsetimeLessThanOrEqualTo(Date value) {
            addCriterion("GETFALSETIME <=", value, "getfalsetime");
            return (Criteria) this;
        }

        public Criteria andGetfalsetimeIn(List<Date> values) {
            addCriterion("GETFALSETIME in", values, "getfalsetime");
            return (Criteria) this;
        }

        public Criteria andGetfalsetimeNotIn(List<Date> values) {
            addCriterion("GETFALSETIME not in", values, "getfalsetime");
            return (Criteria) this;
        }

        public Criteria andGetfalsetimeBetween(Date value1, Date value2) {
            addCriterion("GETFALSETIME between", value1, value2, "getfalsetime");
            return (Criteria) this;
        }

        public Criteria andGetfalsetimeNotBetween(Date value1, Date value2) {
            addCriterion("GETFALSETIME not between", value1, value2, "getfalsetime");
            return (Criteria) this;
        }

        public Criteria andFalsetextIsNull() {
            addCriterion("FALSETEXT is null");
            return (Criteria) this;
        }

        public Criteria andFalsetextIsNotNull() {
            addCriterion("FALSETEXT is not null");
            return (Criteria) this;
        }

        public Criteria andFalsetextEqualTo(String value) {
            addCriterion("FALSETEXT =", value, "falsetext");
            return (Criteria) this;
        }

        public Criteria andFalsetextNotEqualTo(String value) {
            addCriterion("FALSETEXT <>", value, "falsetext");
            return (Criteria) this;
        }

        public Criteria andFalsetextGreaterThan(String value) {
            addCriterion("FALSETEXT >", value, "falsetext");
            return (Criteria) this;
        }

        public Criteria andFalsetextGreaterThanOrEqualTo(String value) {
            addCriterion("FALSETEXT >=", value, "falsetext");
            return (Criteria) this;
        }

        public Criteria andFalsetextLessThan(String value) {
            addCriterion("FALSETEXT <", value, "falsetext");
            return (Criteria) this;
        }

        public Criteria andFalsetextLessThanOrEqualTo(String value) {
            addCriterion("FALSETEXT <=", value, "falsetext");
            return (Criteria) this;
        }

        public Criteria andFalsetextLike(String value) {
            addCriterion("FALSETEXT like", value, "falsetext");
            return (Criteria) this;
        }

        public Criteria andFalsetextNotLike(String value) {
            addCriterion("FALSETEXT not like", value, "falsetext");
            return (Criteria) this;
        }

        public Criteria andFalsetextIn(List<String> values) {
            addCriterion("FALSETEXT in", values, "falsetext");
            return (Criteria) this;
        }

        public Criteria andFalsetextNotIn(List<String> values) {
            addCriterion("FALSETEXT not in", values, "falsetext");
            return (Criteria) this;
        }

        public Criteria andFalsetextBetween(String value1, String value2) {
            addCriterion("FALSETEXT between", value1, value2, "falsetext");
            return (Criteria) this;
        }

        public Criteria andFalsetextNotBetween(String value1, String value2) {
            addCriterion("FALSETEXT not between", value1, value2, "falsetext");
            return (Criteria) this;
        }

        public Criteria andIssolvedIsNull() {
            addCriterion("ISSOLVED is null");
            return (Criteria) this;
        }

        public Criteria andIssolvedIsNotNull() {
            addCriterion("ISSOLVED is not null");
            return (Criteria) this;
        }

        public Criteria andIssolvedEqualTo(String value) {
            addCriterion("ISSOLVED =", value, "issolved");
            return (Criteria) this;
        }

        public Criteria andIssolvedNotEqualTo(String value) {
            addCriterion("ISSOLVED <>", value, "issolved");
            return (Criteria) this;
        }

        public Criteria andIssolvedGreaterThan(String value) {
            addCriterion("ISSOLVED >", value, "issolved");
            return (Criteria) this;
        }

        public Criteria andIssolvedGreaterThanOrEqualTo(String value) {
            addCriterion("ISSOLVED >=", value, "issolved");
            return (Criteria) this;
        }

        public Criteria andIssolvedLessThan(String value) {
            addCriterion("ISSOLVED <", value, "issolved");
            return (Criteria) this;
        }

        public Criteria andIssolvedLessThanOrEqualTo(String value) {
            addCriterion("ISSOLVED <=", value, "issolved");
            return (Criteria) this;
        }

        public Criteria andIssolvedLike(String value) {
            addCriterion("ISSOLVED like", value, "issolved");
            return (Criteria) this;
        }

        public Criteria andIssolvedNotLike(String value) {
            addCriterion("ISSOLVED not like", value, "issolved");
            return (Criteria) this;
        }

        public Criteria andIssolvedIn(List<String> values) {
            addCriterion("ISSOLVED in", values, "issolved");
            return (Criteria) this;
        }

        public Criteria andIssolvedNotIn(List<String> values) {
            addCriterion("ISSOLVED not in", values, "issolved");
            return (Criteria) this;
        }

        public Criteria andIssolvedBetween(String value1, String value2) {
            addCriterion("ISSOLVED between", value1, value2, "issolved");
            return (Criteria) this;
        }

        public Criteria andIssolvedNotBetween(String value1, String value2) {
            addCriterion("ISSOLVED not between", value1, value2, "issolved");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNull() {
            addCriterion("ADMINID is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("ADMINID is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(String value) {
            addCriterion("ADMINID =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(String value) {
            addCriterion("ADMINID <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(String value) {
            addCriterion("ADMINID >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINID >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(String value) {
            addCriterion("ADMINID <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(String value) {
            addCriterion("ADMINID <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLike(String value) {
            addCriterion("ADMINID like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotLike(String value) {
            addCriterion("ADMINID not like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<String> values) {
            addCriterion("ADMINID in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<String> values) {
            addCriterion("ADMINID not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(String value1, String value2) {
            addCriterion("ADMINID between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(String value1, String value2) {
            addCriterion("ADMINID not between", value1, value2, "adminid");
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