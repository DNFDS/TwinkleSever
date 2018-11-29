package com.example.demo.entity.Example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("USERPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("USERPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("USERPASSWORD =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("USERPASSWORD <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("USERPASSWORD >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USERPASSWORD >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("USERPASSWORD <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("USERPASSWORD <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("USERPASSWORD like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("USERPASSWORD not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("USERPASSWORD in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("USERPASSWORD not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("USERPASSWORD between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("USERPASSWORD not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserimageIsNull() {
            addCriterion("USERIMAGE is null");
            return (Criteria) this;
        }

        public Criteria andUserimageIsNotNull() {
            addCriterion("USERIMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andUserimageEqualTo(String value) {
            addCriterion("USERIMAGE =", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageNotEqualTo(String value) {
            addCriterion("USERIMAGE <>", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageGreaterThan(String value) {
            addCriterion("USERIMAGE >", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageGreaterThanOrEqualTo(String value) {
            addCriterion("USERIMAGE >=", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageLessThan(String value) {
            addCriterion("USERIMAGE <", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageLessThanOrEqualTo(String value) {
            addCriterion("USERIMAGE <=", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageLike(String value) {
            addCriterion("USERIMAGE like", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageNotLike(String value) {
            addCriterion("USERIMAGE not like", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageIn(List<String> values) {
            addCriterion("USERIMAGE in", values, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageNotIn(List<String> values) {
            addCriterion("USERIMAGE not in", values, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageBetween(String value1, String value2) {
            addCriterion("USERIMAGE between", value1, value2, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageNotBetween(String value1, String value2) {
            addCriterion("USERIMAGE not between", value1, value2, "userimage");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNull() {
            addCriterion("USERSEX is null");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNotNull() {
            addCriterion("USERSEX is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexEqualTo(String value) {
            addCriterion("USERSEX =", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotEqualTo(String value) {
            addCriterion("USERSEX <>", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThan(String value) {
            addCriterion("USERSEX >", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThanOrEqualTo(String value) {
            addCriterion("USERSEX >=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThan(String value) {
            addCriterion("USERSEX <", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThanOrEqualTo(String value) {
            addCriterion("USERSEX <=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLike(String value) {
            addCriterion("USERSEX like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotLike(String value) {
            addCriterion("USERSEX not like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexIn(List<String> values) {
            addCriterion("USERSEX in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotIn(List<String> values) {
            addCriterion("USERSEX not in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexBetween(String value1, String value2) {
            addCriterion("USERSEX between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotBetween(String value1, String value2) {
            addCriterion("USERSEX not between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andIsvipIsNull() {
            addCriterion("ISVIP is null");
            return (Criteria) this;
        }

        public Criteria andIsvipIsNotNull() {
            addCriterion("ISVIP is not null");
            return (Criteria) this;
        }

        public Criteria andIsvipEqualTo(String value) {
            addCriterion("ISVIP =", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotEqualTo(String value) {
            addCriterion("ISVIP <>", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipGreaterThan(String value) {
            addCriterion("ISVIP >", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipGreaterThanOrEqualTo(String value) {
            addCriterion("ISVIP >=", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipLessThan(String value) {
            addCriterion("ISVIP <", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipLessThanOrEqualTo(String value) {
            addCriterion("ISVIP <=", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipLike(String value) {
            addCriterion("ISVIP like", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotLike(String value) {
            addCriterion("ISVIP not like", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipIn(List<String> values) {
            addCriterion("ISVIP in", values, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotIn(List<String> values) {
            addCriterion("ISVIP not in", values, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipBetween(String value1, String value2) {
            addCriterion("ISVIP between", value1, value2, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotBetween(String value1, String value2) {
            addCriterion("ISVIP not between", value1, value2, "isvip");
            return (Criteria) this;
        }

        public Criteria andUserbalanceIsNull() {
            addCriterion("USERBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andUserbalanceIsNotNull() {
            addCriterion("USERBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andUserbalanceEqualTo(BigDecimal value) {
            addCriterion("USERBALANCE =", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceNotEqualTo(BigDecimal value) {
            addCriterion("USERBALANCE <>", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceGreaterThan(BigDecimal value) {
            addCriterion("USERBALANCE >", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USERBALANCE >=", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceLessThan(BigDecimal value) {
            addCriterion("USERBALANCE <", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USERBALANCE <=", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceIn(List<BigDecimal> values) {
            addCriterion("USERBALANCE in", values, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceNotIn(List<BigDecimal> values) {
            addCriterion("USERBALANCE not in", values, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERBALANCE between", value1, value2, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERBALANCE not between", value1, value2, "userbalance");
            return (Criteria) this;
        }

        public Criteria andIsbannedIsNull() {
            addCriterion("ISBANNED is null");
            return (Criteria) this;
        }

        public Criteria andIsbannedIsNotNull() {
            addCriterion("ISBANNED is not null");
            return (Criteria) this;
        }

        public Criteria andIsbannedEqualTo(String value) {
            addCriterion("ISBANNED =", value, "isbanned");
            return (Criteria) this;
        }

        public Criteria andIsbannedNotEqualTo(String value) {
            addCriterion("ISBANNED <>", value, "isbanned");
            return (Criteria) this;
        }

        public Criteria andIsbannedGreaterThan(String value) {
            addCriterion("ISBANNED >", value, "isbanned");
            return (Criteria) this;
        }

        public Criteria andIsbannedGreaterThanOrEqualTo(String value) {
            addCriterion("ISBANNED >=", value, "isbanned");
            return (Criteria) this;
        }

        public Criteria andIsbannedLessThan(String value) {
            addCriterion("ISBANNED <", value, "isbanned");
            return (Criteria) this;
        }

        public Criteria andIsbannedLessThanOrEqualTo(String value) {
            addCriterion("ISBANNED <=", value, "isbanned");
            return (Criteria) this;
        }

        public Criteria andIsbannedLike(String value) {
            addCriterion("ISBANNED like", value, "isbanned");
            return (Criteria) this;
        }

        public Criteria andIsbannedNotLike(String value) {
            addCriterion("ISBANNED not like", value, "isbanned");
            return (Criteria) this;
        }

        public Criteria andIsbannedIn(List<String> values) {
            addCriterion("ISBANNED in", values, "isbanned");
            return (Criteria) this;
        }

        public Criteria andIsbannedNotIn(List<String> values) {
            addCriterion("ISBANNED not in", values, "isbanned");
            return (Criteria) this;
        }

        public Criteria andIsbannedBetween(String value1, String value2) {
            addCriterion("ISBANNED between", value1, value2, "isbanned");
            return (Criteria) this;
        }

        public Criteria andIsbannedNotBetween(String value1, String value2) {
            addCriterion("ISBANNED not between", value1, value2, "isbanned");
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