package com.example.demo.entity.Example;

import java.util.ArrayList;
import java.util.List;

public class AlbumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlbumExample() {
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

        public Criteria andAlbumidIsNull() {
            addCriterion("ALBUMID is null");
            return (Criteria) this;
        }

        public Criteria andAlbumidIsNotNull() {
            addCriterion("ALBUMID is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumidEqualTo(String value) {
            addCriterion("ALBUMID =", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidNotEqualTo(String value) {
            addCriterion("ALBUMID <>", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidGreaterThan(String value) {
            addCriterion("ALBUMID >", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidGreaterThanOrEqualTo(String value) {
            addCriterion("ALBUMID >=", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidLessThan(String value) {
            addCriterion("ALBUMID <", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidLessThanOrEqualTo(String value) {
            addCriterion("ALBUMID <=", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidLike(String value) {
            addCriterion("ALBUMID like", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidNotLike(String value) {
            addCriterion("ALBUMID not like", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidIn(List<String> values) {
            addCriterion("ALBUMID in", values, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidNotIn(List<String> values) {
            addCriterion("ALBUMID not in", values, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidBetween(String value1, String value2) {
            addCriterion("ALBUMID between", value1, value2, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidNotBetween(String value1, String value2) {
            addCriterion("ALBUMID not between", value1, value2, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumnameIsNull() {
            addCriterion("ALBUMNAME is null");
            return (Criteria) this;
        }

        public Criteria andAlbumnameIsNotNull() {
            addCriterion("ALBUMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumnameEqualTo(String value) {
            addCriterion("ALBUMNAME =", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameNotEqualTo(String value) {
            addCriterion("ALBUMNAME <>", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameGreaterThan(String value) {
            addCriterion("ALBUMNAME >", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameGreaterThanOrEqualTo(String value) {
            addCriterion("ALBUMNAME >=", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameLessThan(String value) {
            addCriterion("ALBUMNAME <", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameLessThanOrEqualTo(String value) {
            addCriterion("ALBUMNAME <=", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameLike(String value) {
            addCriterion("ALBUMNAME like", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameNotLike(String value) {
            addCriterion("ALBUMNAME not like", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameIn(List<String> values) {
            addCriterion("ALBUMNAME in", values, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameNotIn(List<String> values) {
            addCriterion("ALBUMNAME not in", values, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameBetween(String value1, String value2) {
            addCriterion("ALBUMNAME between", value1, value2, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameNotBetween(String value1, String value2) {
            addCriterion("ALBUMNAME not between", value1, value2, "albumname");
            return (Criteria) this;
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

        public Criteria andAlbumimageIsNull() {
            addCriterion("ALBUMIMAGE is null");
            return (Criteria) this;
        }

        public Criteria andAlbumimageIsNotNull() {
            addCriterion("ALBUMIMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumimageEqualTo(String value) {
            addCriterion("ALBUMIMAGE =", value, "albumimage");
            return (Criteria) this;
        }

        public Criteria andAlbumimageNotEqualTo(String value) {
            addCriterion("ALBUMIMAGE <>", value, "albumimage");
            return (Criteria) this;
        }

        public Criteria andAlbumimageGreaterThan(String value) {
            addCriterion("ALBUMIMAGE >", value, "albumimage");
            return (Criteria) this;
        }

        public Criteria andAlbumimageGreaterThanOrEqualTo(String value) {
            addCriterion("ALBUMIMAGE >=", value, "albumimage");
            return (Criteria) this;
        }

        public Criteria andAlbumimageLessThan(String value) {
            addCriterion("ALBUMIMAGE <", value, "albumimage");
            return (Criteria) this;
        }

        public Criteria andAlbumimageLessThanOrEqualTo(String value) {
            addCriterion("ALBUMIMAGE <=", value, "albumimage");
            return (Criteria) this;
        }

        public Criteria andAlbumimageLike(String value) {
            addCriterion("ALBUMIMAGE like", value, "albumimage");
            return (Criteria) this;
        }

        public Criteria andAlbumimageNotLike(String value) {
            addCriterion("ALBUMIMAGE not like", value, "albumimage");
            return (Criteria) this;
        }

        public Criteria andAlbumimageIn(List<String> values) {
            addCriterion("ALBUMIMAGE in", values, "albumimage");
            return (Criteria) this;
        }

        public Criteria andAlbumimageNotIn(List<String> values) {
            addCriterion("ALBUMIMAGE not in", values, "albumimage");
            return (Criteria) this;
        }

        public Criteria andAlbumimageBetween(String value1, String value2) {
            addCriterion("ALBUMIMAGE between", value1, value2, "albumimage");
            return (Criteria) this;
        }

        public Criteria andAlbumimageNotBetween(String value1, String value2) {
            addCriterion("ALBUMIMAGE not between", value1, value2, "albumimage");
            return (Criteria) this;
        }

        public Criteria andAlbumageIsNull() {
            addCriterion("ALBUMAGE is null");
            return (Criteria) this;
        }

        public Criteria andAlbumageIsNotNull() {
            addCriterion("ALBUMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumageEqualTo(String value) {
            addCriterion("ALBUMAGE =", value, "albumage");
            return (Criteria) this;
        }

        public Criteria andAlbumageNotEqualTo(String value) {
            addCriterion("ALBUMAGE <>", value, "albumage");
            return (Criteria) this;
        }

        public Criteria andAlbumageGreaterThan(String value) {
            addCriterion("ALBUMAGE >", value, "albumage");
            return (Criteria) this;
        }

        public Criteria andAlbumageGreaterThanOrEqualTo(String value) {
            addCriterion("ALBUMAGE >=", value, "albumage");
            return (Criteria) this;
        }

        public Criteria andAlbumageLessThan(String value) {
            addCriterion("ALBUMAGE <", value, "albumage");
            return (Criteria) this;
        }

        public Criteria andAlbumageLessThanOrEqualTo(String value) {
            addCriterion("ALBUMAGE <=", value, "albumage");
            return (Criteria) this;
        }

        public Criteria andAlbumageLike(String value) {
            addCriterion("ALBUMAGE like", value, "albumage");
            return (Criteria) this;
        }

        public Criteria andAlbumageNotLike(String value) {
            addCriterion("ALBUMAGE not like", value, "albumage");
            return (Criteria) this;
        }

        public Criteria andAlbumageIn(List<String> values) {
            addCriterion("ALBUMAGE in", values, "albumage");
            return (Criteria) this;
        }

        public Criteria andAlbumageNotIn(List<String> values) {
            addCriterion("ALBUMAGE not in", values, "albumage");
            return (Criteria) this;
        }

        public Criteria andAlbumageBetween(String value1, String value2) {
            addCriterion("ALBUMAGE between", value1, value2, "albumage");
            return (Criteria) this;
        }

        public Criteria andAlbumageNotBetween(String value1, String value2) {
            addCriterion("ALBUMAGE not between", value1, value2, "albumage");
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