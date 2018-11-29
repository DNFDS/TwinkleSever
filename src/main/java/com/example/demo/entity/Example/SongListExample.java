package com.example.demo.entity.Example;

import java.util.ArrayList;
import java.util.List;

public class SongListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SongListExample() {
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

        public Criteria andSonglistidIsNull() {
            addCriterion("SONGLISTID is null");
            return (Criteria) this;
        }

        public Criteria andSonglistidIsNotNull() {
            addCriterion("SONGLISTID is not null");
            return (Criteria) this;
        }

        public Criteria andSonglistidEqualTo(String value) {
            addCriterion("SONGLISTID =", value, "songlistid");
            return (Criteria) this;
        }

        public Criteria andSonglistidNotEqualTo(String value) {
            addCriterion("SONGLISTID <>", value, "songlistid");
            return (Criteria) this;
        }

        public Criteria andSonglistidGreaterThan(String value) {
            addCriterion("SONGLISTID >", value, "songlistid");
            return (Criteria) this;
        }

        public Criteria andSonglistidGreaterThanOrEqualTo(String value) {
            addCriterion("SONGLISTID >=", value, "songlistid");
            return (Criteria) this;
        }

        public Criteria andSonglistidLessThan(String value) {
            addCriterion("SONGLISTID <", value, "songlistid");
            return (Criteria) this;
        }

        public Criteria andSonglistidLessThanOrEqualTo(String value) {
            addCriterion("SONGLISTID <=", value, "songlistid");
            return (Criteria) this;
        }

        public Criteria andSonglistidLike(String value) {
            addCriterion("SONGLISTID like", value, "songlistid");
            return (Criteria) this;
        }

        public Criteria andSonglistidNotLike(String value) {
            addCriterion("SONGLISTID not like", value, "songlistid");
            return (Criteria) this;
        }

        public Criteria andSonglistidIn(List<String> values) {
            addCriterion("SONGLISTID in", values, "songlistid");
            return (Criteria) this;
        }

        public Criteria andSonglistidNotIn(List<String> values) {
            addCriterion("SONGLISTID not in", values, "songlistid");
            return (Criteria) this;
        }

        public Criteria andSonglistidBetween(String value1, String value2) {
            addCriterion("SONGLISTID between", value1, value2, "songlistid");
            return (Criteria) this;
        }

        public Criteria andSonglistidNotBetween(String value1, String value2) {
            addCriterion("SONGLISTID not between", value1, value2, "songlistid");
            return (Criteria) this;
        }

        public Criteria andSonglistnameIsNull() {
            addCriterion("SONGLISTNAME is null");
            return (Criteria) this;
        }

        public Criteria andSonglistnameIsNotNull() {
            addCriterion("SONGLISTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSonglistnameEqualTo(String value) {
            addCriterion("SONGLISTNAME =", value, "songlistname");
            return (Criteria) this;
        }

        public Criteria andSonglistnameNotEqualTo(String value) {
            addCriterion("SONGLISTNAME <>", value, "songlistname");
            return (Criteria) this;
        }

        public Criteria andSonglistnameGreaterThan(String value) {
            addCriterion("SONGLISTNAME >", value, "songlistname");
            return (Criteria) this;
        }

        public Criteria andSonglistnameGreaterThanOrEqualTo(String value) {
            addCriterion("SONGLISTNAME >=", value, "songlistname");
            return (Criteria) this;
        }

        public Criteria andSonglistnameLessThan(String value) {
            addCriterion("SONGLISTNAME <", value, "songlistname");
            return (Criteria) this;
        }

        public Criteria andSonglistnameLessThanOrEqualTo(String value) {
            addCriterion("SONGLISTNAME <=", value, "songlistname");
            return (Criteria) this;
        }

        public Criteria andSonglistnameLike(String value) {
            addCriterion("SONGLISTNAME like", value, "songlistname");
            return (Criteria) this;
        }

        public Criteria andSonglistnameNotLike(String value) {
            addCriterion("SONGLISTNAME not like", value, "songlistname");
            return (Criteria) this;
        }

        public Criteria andSonglistnameIn(List<String> values) {
            addCriterion("SONGLISTNAME in", values, "songlistname");
            return (Criteria) this;
        }

        public Criteria andSonglistnameNotIn(List<String> values) {
            addCriterion("SONGLISTNAME not in", values, "songlistname");
            return (Criteria) this;
        }

        public Criteria andSonglistnameBetween(String value1, String value2) {
            addCriterion("SONGLISTNAME between", value1, value2, "songlistname");
            return (Criteria) this;
        }

        public Criteria andSonglistnameNotBetween(String value1, String value2) {
            addCriterion("SONGLISTNAME not between", value1, value2, "songlistname");
            return (Criteria) this;
        }

        public Criteria andSonglistimageIsNull() {
            addCriterion("SONGLISTIMAGE is null");
            return (Criteria) this;
        }

        public Criteria andSonglistimageIsNotNull() {
            addCriterion("SONGLISTIMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andSonglistimageEqualTo(String value) {
            addCriterion("SONGLISTIMAGE =", value, "songlistimage");
            return (Criteria) this;
        }

        public Criteria andSonglistimageNotEqualTo(String value) {
            addCriterion("SONGLISTIMAGE <>", value, "songlistimage");
            return (Criteria) this;
        }

        public Criteria andSonglistimageGreaterThan(String value) {
            addCriterion("SONGLISTIMAGE >", value, "songlistimage");
            return (Criteria) this;
        }

        public Criteria andSonglistimageGreaterThanOrEqualTo(String value) {
            addCriterion("SONGLISTIMAGE >=", value, "songlistimage");
            return (Criteria) this;
        }

        public Criteria andSonglistimageLessThan(String value) {
            addCriterion("SONGLISTIMAGE <", value, "songlistimage");
            return (Criteria) this;
        }

        public Criteria andSonglistimageLessThanOrEqualTo(String value) {
            addCriterion("SONGLISTIMAGE <=", value, "songlistimage");
            return (Criteria) this;
        }

        public Criteria andSonglistimageLike(String value) {
            addCriterion("SONGLISTIMAGE like", value, "songlistimage");
            return (Criteria) this;
        }

        public Criteria andSonglistimageNotLike(String value) {
            addCriterion("SONGLISTIMAGE not like", value, "songlistimage");
            return (Criteria) this;
        }

        public Criteria andSonglistimageIn(List<String> values) {
            addCriterion("SONGLISTIMAGE in", values, "songlistimage");
            return (Criteria) this;
        }

        public Criteria andSonglistimageNotIn(List<String> values) {
            addCriterion("SONGLISTIMAGE not in", values, "songlistimage");
            return (Criteria) this;
        }

        public Criteria andSonglistimageBetween(String value1, String value2) {
            addCriterion("SONGLISTIMAGE between", value1, value2, "songlistimage");
            return (Criteria) this;
        }

        public Criteria andSonglistimageNotBetween(String value1, String value2) {
            addCriterion("SONGLISTIMAGE not between", value1, value2, "songlistimage");
            return (Criteria) this;
        }

        public Criteria andIsprivateIsNull() {
            addCriterion("ISPRIVATE is null");
            return (Criteria) this;
        }

        public Criteria andIsprivateIsNotNull() {
            addCriterion("ISPRIVATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsprivateEqualTo(String value) {
            addCriterion("ISPRIVATE =", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateNotEqualTo(String value) {
            addCriterion("ISPRIVATE <>", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateGreaterThan(String value) {
            addCriterion("ISPRIVATE >", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateGreaterThanOrEqualTo(String value) {
            addCriterion("ISPRIVATE >=", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateLessThan(String value) {
            addCriterion("ISPRIVATE <", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateLessThanOrEqualTo(String value) {
            addCriterion("ISPRIVATE <=", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateLike(String value) {
            addCriterion("ISPRIVATE like", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateNotLike(String value) {
            addCriterion("ISPRIVATE not like", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateIn(List<String> values) {
            addCriterion("ISPRIVATE in", values, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateNotIn(List<String> values) {
            addCriterion("ISPRIVATE not in", values, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateBetween(String value1, String value2) {
            addCriterion("ISPRIVATE between", value1, value2, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateNotBetween(String value1, String value2) {
            addCriterion("ISPRIVATE not between", value1, value2, "isprivate");
            return (Criteria) this;
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