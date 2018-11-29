package com.example.demo.entity.Example;

import java.util.ArrayList;
import java.util.List;

public class SongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SongExample() {
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

        public Criteria andSongpathIsNull() {
            addCriterion("SONGPATH is null");
            return (Criteria) this;
        }

        public Criteria andSongpathIsNotNull() {
            addCriterion("SONGPATH is not null");
            return (Criteria) this;
        }

        public Criteria andSongpathEqualTo(String value) {
            addCriterion("SONGPATH =", value, "songpath");
            return (Criteria) this;
        }

        public Criteria andSongpathNotEqualTo(String value) {
            addCriterion("SONGPATH <>", value, "songpath");
            return (Criteria) this;
        }

        public Criteria andSongpathGreaterThan(String value) {
            addCriterion("SONGPATH >", value, "songpath");
            return (Criteria) this;
        }

        public Criteria andSongpathGreaterThanOrEqualTo(String value) {
            addCriterion("SONGPATH >=", value, "songpath");
            return (Criteria) this;
        }

        public Criteria andSongpathLessThan(String value) {
            addCriterion("SONGPATH <", value, "songpath");
            return (Criteria) this;
        }

        public Criteria andSongpathLessThanOrEqualTo(String value) {
            addCriterion("SONGPATH <=", value, "songpath");
            return (Criteria) this;
        }

        public Criteria andSongpathLike(String value) {
            addCriterion("SONGPATH like", value, "songpath");
            return (Criteria) this;
        }

        public Criteria andSongpathNotLike(String value) {
            addCriterion("SONGPATH not like", value, "songpath");
            return (Criteria) this;
        }

        public Criteria andSongpathIn(List<String> values) {
            addCriterion("SONGPATH in", values, "songpath");
            return (Criteria) this;
        }

        public Criteria andSongpathNotIn(List<String> values) {
            addCriterion("SONGPATH not in", values, "songpath");
            return (Criteria) this;
        }

        public Criteria andSongpathBetween(String value1, String value2) {
            addCriterion("SONGPATH between", value1, value2, "songpath");
            return (Criteria) this;
        }

        public Criteria andSongpathNotBetween(String value1, String value2) {
            addCriterion("SONGPATH not between", value1, value2, "songpath");
            return (Criteria) this;
        }

        public Criteria andSongnameIsNull() {
            addCriterion("SONGNAME is null");
            return (Criteria) this;
        }

        public Criteria andSongnameIsNotNull() {
            addCriterion("SONGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSongnameEqualTo(String value) {
            addCriterion("SONGNAME =", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameNotEqualTo(String value) {
            addCriterion("SONGNAME <>", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameGreaterThan(String value) {
            addCriterion("SONGNAME >", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameGreaterThanOrEqualTo(String value) {
            addCriterion("SONGNAME >=", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameLessThan(String value) {
            addCriterion("SONGNAME <", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameLessThanOrEqualTo(String value) {
            addCriterion("SONGNAME <=", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameLike(String value) {
            addCriterion("SONGNAME like", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameNotLike(String value) {
            addCriterion("SONGNAME not like", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameIn(List<String> values) {
            addCriterion("SONGNAME in", values, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameNotIn(List<String> values) {
            addCriterion("SONGNAME not in", values, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameBetween(String value1, String value2) {
            addCriterion("SONGNAME between", value1, value2, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameNotBetween(String value1, String value2) {
            addCriterion("SONGNAME not between", value1, value2, "songname");
            return (Criteria) this;
        }

        public Criteria andWriternameIsNull() {
            addCriterion("WRITERNAME is null");
            return (Criteria) this;
        }

        public Criteria andWriternameIsNotNull() {
            addCriterion("WRITERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andWriternameEqualTo(String value) {
            addCriterion("WRITERNAME =", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameNotEqualTo(String value) {
            addCriterion("WRITERNAME <>", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameGreaterThan(String value) {
            addCriterion("WRITERNAME >", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameGreaterThanOrEqualTo(String value) {
            addCriterion("WRITERNAME >=", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameLessThan(String value) {
            addCriterion("WRITERNAME <", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameLessThanOrEqualTo(String value) {
            addCriterion("WRITERNAME <=", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameLike(String value) {
            addCriterion("WRITERNAME like", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameNotLike(String value) {
            addCriterion("WRITERNAME not like", value, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameIn(List<String> values) {
            addCriterion("WRITERNAME in", values, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameNotIn(List<String> values) {
            addCriterion("WRITERNAME not in", values, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameBetween(String value1, String value2) {
            addCriterion("WRITERNAME between", value1, value2, "writername");
            return (Criteria) this;
        }

        public Criteria andWriternameNotBetween(String value1, String value2) {
            addCriterion("WRITERNAME not between", value1, value2, "writername");
            return (Criteria) this;
        }

        public Criteria andProducernameIsNull() {
            addCriterion("PRODUCERNAME is null");
            return (Criteria) this;
        }

        public Criteria andProducernameIsNotNull() {
            addCriterion("PRODUCERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProducernameEqualTo(String value) {
            addCriterion("PRODUCERNAME =", value, "producername");
            return (Criteria) this;
        }

        public Criteria andProducernameNotEqualTo(String value) {
            addCriterion("PRODUCERNAME <>", value, "producername");
            return (Criteria) this;
        }

        public Criteria andProducernameGreaterThan(String value) {
            addCriterion("PRODUCERNAME >", value, "producername");
            return (Criteria) this;
        }

        public Criteria andProducernameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCERNAME >=", value, "producername");
            return (Criteria) this;
        }

        public Criteria andProducernameLessThan(String value) {
            addCriterion("PRODUCERNAME <", value, "producername");
            return (Criteria) this;
        }

        public Criteria andProducernameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCERNAME <=", value, "producername");
            return (Criteria) this;
        }

        public Criteria andProducernameLike(String value) {
            addCriterion("PRODUCERNAME like", value, "producername");
            return (Criteria) this;
        }

        public Criteria andProducernameNotLike(String value) {
            addCriterion("PRODUCERNAME not like", value, "producername");
            return (Criteria) this;
        }

        public Criteria andProducernameIn(List<String> values) {
            addCriterion("PRODUCERNAME in", values, "producername");
            return (Criteria) this;
        }

        public Criteria andProducernameNotIn(List<String> values) {
            addCriterion("PRODUCERNAME not in", values, "producername");
            return (Criteria) this;
        }

        public Criteria andProducernameBetween(String value1, String value2) {
            addCriterion("PRODUCERNAME between", value1, value2, "producername");
            return (Criteria) this;
        }

        public Criteria andProducernameNotBetween(String value1, String value2) {
            addCriterion("PRODUCERNAME not between", value1, value2, "producername");
            return (Criteria) this;
        }

        public Criteria andSongimageIsNull() {
            addCriterion("SONGIMAGE is null");
            return (Criteria) this;
        }

        public Criteria andSongimageIsNotNull() {
            addCriterion("SONGIMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andSongimageEqualTo(String value) {
            addCriterion("SONGIMAGE =", value, "songimage");
            return (Criteria) this;
        }

        public Criteria andSongimageNotEqualTo(String value) {
            addCriterion("SONGIMAGE <>", value, "songimage");
            return (Criteria) this;
        }

        public Criteria andSongimageGreaterThan(String value) {
            addCriterion("SONGIMAGE >", value, "songimage");
            return (Criteria) this;
        }

        public Criteria andSongimageGreaterThanOrEqualTo(String value) {
            addCriterion("SONGIMAGE >=", value, "songimage");
            return (Criteria) this;
        }

        public Criteria andSongimageLessThan(String value) {
            addCriterion("SONGIMAGE <", value, "songimage");
            return (Criteria) this;
        }

        public Criteria andSongimageLessThanOrEqualTo(String value) {
            addCriterion("SONGIMAGE <=", value, "songimage");
            return (Criteria) this;
        }

        public Criteria andSongimageLike(String value) {
            addCriterion("SONGIMAGE like", value, "songimage");
            return (Criteria) this;
        }

        public Criteria andSongimageNotLike(String value) {
            addCriterion("SONGIMAGE not like", value, "songimage");
            return (Criteria) this;
        }

        public Criteria andSongimageIn(List<String> values) {
            addCriterion("SONGIMAGE in", values, "songimage");
            return (Criteria) this;
        }

        public Criteria andSongimageNotIn(List<String> values) {
            addCriterion("SONGIMAGE not in", values, "songimage");
            return (Criteria) this;
        }

        public Criteria andSongimageBetween(String value1, String value2) {
            addCriterion("SONGIMAGE between", value1, value2, "songimage");
            return (Criteria) this;
        }

        public Criteria andSongimageNotBetween(String value1, String value2) {
            addCriterion("SONGIMAGE not between", value1, value2, "songimage");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(String value) {
            addCriterion("LENGTH =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(String value) {
            addCriterion("LENGTH <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(String value) {
            addCriterion("LENGTH >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(String value) {
            addCriterion("LENGTH >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(String value) {
            addCriterion("LENGTH <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(String value) {
            addCriterion("LENGTH <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLike(String value) {
            addCriterion("LENGTH like", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotLike(String value) {
            addCriterion("LENGTH not like", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<String> values) {
            addCriterion("LENGTH in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<String> values) {
            addCriterion("LENGTH not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(String value1, String value2) {
            addCriterion("LENGTH between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(String value1, String value2) {
            addCriterion("LENGTH not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andPlaytimesIsNull() {
            addCriterion("PLAYTIMES is null");
            return (Criteria) this;
        }

        public Criteria andPlaytimesIsNotNull() {
            addCriterion("PLAYTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andPlaytimesEqualTo(Integer value) {
            addCriterion("PLAYTIMES =", value, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesNotEqualTo(Integer value) {
            addCriterion("PLAYTIMES <>", value, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesGreaterThan(Integer value) {
            addCriterion("PLAYTIMES >", value, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAYTIMES >=", value, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesLessThan(Integer value) {
            addCriterion("PLAYTIMES <", value, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesLessThanOrEqualTo(Integer value) {
            addCriterion("PLAYTIMES <=", value, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesIn(List<Integer> values) {
            addCriterion("PLAYTIMES in", values, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesNotIn(List<Integer> values) {
            addCriterion("PLAYTIMES not in", values, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesBetween(Integer value1, Integer value2) {
            addCriterion("PLAYTIMES between", value1, value2, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAYTIMES not between", value1, value2, "playtimes");
            return (Criteria) this;
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

        public Criteria andSongschoolIsNull() {
            addCriterion("SONGSCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andSongschoolIsNotNull() {
            addCriterion("SONGSCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andSongschoolEqualTo(String value) {
            addCriterion("SONGSCHOOL =", value, "songschool");
            return (Criteria) this;
        }

        public Criteria andSongschoolNotEqualTo(String value) {
            addCriterion("SONGSCHOOL <>", value, "songschool");
            return (Criteria) this;
        }

        public Criteria andSongschoolGreaterThan(String value) {
            addCriterion("SONGSCHOOL >", value, "songschool");
            return (Criteria) this;
        }

        public Criteria andSongschoolGreaterThanOrEqualTo(String value) {
            addCriterion("SONGSCHOOL >=", value, "songschool");
            return (Criteria) this;
        }

        public Criteria andSongschoolLessThan(String value) {
            addCriterion("SONGSCHOOL <", value, "songschool");
            return (Criteria) this;
        }

        public Criteria andSongschoolLessThanOrEqualTo(String value) {
            addCriterion("SONGSCHOOL <=", value, "songschool");
            return (Criteria) this;
        }

        public Criteria andSongschoolLike(String value) {
            addCriterion("SONGSCHOOL like", value, "songschool");
            return (Criteria) this;
        }

        public Criteria andSongschoolNotLike(String value) {
            addCriterion("SONGSCHOOL not like", value, "songschool");
            return (Criteria) this;
        }

        public Criteria andSongschoolIn(List<String> values) {
            addCriterion("SONGSCHOOL in", values, "songschool");
            return (Criteria) this;
        }

        public Criteria andSongschoolNotIn(List<String> values) {
            addCriterion("SONGSCHOOL not in", values, "songschool");
            return (Criteria) this;
        }

        public Criteria andSongschoolBetween(String value1, String value2) {
            addCriterion("SONGSCHOOL between", value1, value2, "songschool");
            return (Criteria) this;
        }

        public Criteria andSongschoolNotBetween(String value1, String value2) {
            addCriterion("SONGSCHOOL not between", value1, value2, "songschool");
            return (Criteria) this;
        }

        public Criteria andSongageIsNull() {
            addCriterion("SONGAGE is null");
            return (Criteria) this;
        }

        public Criteria andSongageIsNotNull() {
            addCriterion("SONGAGE is not null");
            return (Criteria) this;
        }

        public Criteria andSongageEqualTo(String value) {
            addCriterion("SONGAGE =", value, "songage");
            return (Criteria) this;
        }

        public Criteria andSongageNotEqualTo(String value) {
            addCriterion("SONGAGE <>", value, "songage");
            return (Criteria) this;
        }

        public Criteria andSongageGreaterThan(String value) {
            addCriterion("SONGAGE >", value, "songage");
            return (Criteria) this;
        }

        public Criteria andSongageGreaterThanOrEqualTo(String value) {
            addCriterion("SONGAGE >=", value, "songage");
            return (Criteria) this;
        }

        public Criteria andSongageLessThan(String value) {
            addCriterion("SONGAGE <", value, "songage");
            return (Criteria) this;
        }

        public Criteria andSongageLessThanOrEqualTo(String value) {
            addCriterion("SONGAGE <=", value, "songage");
            return (Criteria) this;
        }

        public Criteria andSongageLike(String value) {
            addCriterion("SONGAGE like", value, "songage");
            return (Criteria) this;
        }

        public Criteria andSongageNotLike(String value) {
            addCriterion("SONGAGE not like", value, "songage");
            return (Criteria) this;
        }

        public Criteria andSongageIn(List<String> values) {
            addCriterion("SONGAGE in", values, "songage");
            return (Criteria) this;
        }

        public Criteria andSongageNotIn(List<String> values) {
            addCriterion("SONGAGE not in", values, "songage");
            return (Criteria) this;
        }

        public Criteria andSongageBetween(String value1, String value2) {
            addCriterion("SONGAGE between", value1, value2, "songage");
            return (Criteria) this;
        }

        public Criteria andSongageNotBetween(String value1, String value2) {
            addCriterion("SONGAGE not between", value1, value2, "songage");
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