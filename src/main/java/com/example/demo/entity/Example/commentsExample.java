package com.example.demo.entity.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class commentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public commentsExample() {
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

        public Criteria andCommenttimeIsNull() {
            addCriterion("COMMENTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNotNull() {
            addCriterion("COMMENTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeEqualTo(Date value) {
            addCriterion("COMMENTTIME =", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotEqualTo(Date value) {
            addCriterion("COMMENTTIME <>", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThan(Date value) {
            addCriterion("COMMENTTIME >", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("COMMENTTIME >=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThan(Date value) {
            addCriterion("COMMENTTIME <", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThanOrEqualTo(Date value) {
            addCriterion("COMMENTTIME <=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIn(List<Date> values) {
            addCriterion("COMMENTTIME in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotIn(List<Date> values) {
            addCriterion("COMMENTTIME not in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeBetween(Date value1, Date value2) {
            addCriterion("COMMENTTIME between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotBetween(Date value1, Date value2) {
            addCriterion("COMMENTTIME not between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttextIsNull() {
            addCriterion("COMMENTTEXT is null");
            return (Criteria) this;
        }

        public Criteria andCommenttextIsNotNull() {
            addCriterion("COMMENTTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttextEqualTo(String value) {
            addCriterion("COMMENTTEXT =", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextNotEqualTo(String value) {
            addCriterion("COMMENTTEXT <>", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextGreaterThan(String value) {
            addCriterion("COMMENTTEXT >", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTTEXT >=", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextLessThan(String value) {
            addCriterion("COMMENTTEXT <", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextLessThanOrEqualTo(String value) {
            addCriterion("COMMENTTEXT <=", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextLike(String value) {
            addCriterion("COMMENTTEXT like", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextNotLike(String value) {
            addCriterion("COMMENTTEXT not like", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextIn(List<String> values) {
            addCriterion("COMMENTTEXT in", values, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextNotIn(List<String> values) {
            addCriterion("COMMENTTEXT not in", values, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextBetween(String value1, String value2) {
            addCriterion("COMMENTTEXT between", value1, value2, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextNotBetween(String value1, String value2) {
            addCriterion("COMMENTTEXT not between", value1, value2, "commenttext");
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