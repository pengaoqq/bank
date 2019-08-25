package cn.goktech.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class YonghExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YonghExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Object value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Object value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Object value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Object value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Object value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Object value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Object> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Object> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Object value1, Object value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Object value1, Object value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYonghzhIsNull() {
            addCriterion("YONGHZH is null");
            return (Criteria) this;
        }

        public Criteria andYonghzhIsNotNull() {
            addCriterion("YONGHZH is not null");
            return (Criteria) this;
        }

        public Criteria andYonghzhEqualTo(String value) {
            addCriterion("YONGHZH =", value, "yonghzh");
            return (Criteria) this;
        }

        public Criteria andYonghzhNotEqualTo(String value) {
            addCriterion("YONGHZH <>", value, "yonghzh");
            return (Criteria) this;
        }

        public Criteria andYonghzhGreaterThan(String value) {
            addCriterion("YONGHZH >", value, "yonghzh");
            return (Criteria) this;
        }

        public Criteria andYonghzhGreaterThanOrEqualTo(String value) {
            addCriterion("YONGHZH >=", value, "yonghzh");
            return (Criteria) this;
        }

        public Criteria andYonghzhLessThan(String value) {
            addCriterion("YONGHZH <", value, "yonghzh");
            return (Criteria) this;
        }

        public Criteria andYonghzhLessThanOrEqualTo(String value) {
            addCriterion("YONGHZH <=", value, "yonghzh");
            return (Criteria) this;
        }

        public Criteria andYonghzhLike(String value) {
            addCriterion("YONGHZH like", value, "yonghzh");
            return (Criteria) this;
        }

        public Criteria andYonghzhNotLike(String value) {
            addCriterion("YONGHZH not like", value, "yonghzh");
            return (Criteria) this;
        }

        public Criteria andYonghzhIn(List<String> values) {
            addCriterion("YONGHZH in", values, "yonghzh");
            return (Criteria) this;
        }

        public Criteria andYonghzhNotIn(List<String> values) {
            addCriterion("YONGHZH not in", values, "yonghzh");
            return (Criteria) this;
        }

        public Criteria andYonghzhBetween(String value1, String value2) {
            addCriterion("YONGHZH between", value1, value2, "yonghzh");
            return (Criteria) this;
        }

        public Criteria andYonghzhNotBetween(String value1, String value2) {
            addCriterion("YONGHZH not between", value1, value2, "yonghzh");
            return (Criteria) this;
        }

        public Criteria andYonghxmIsNull() {
            addCriterion("YONGHXM is null");
            return (Criteria) this;
        }

        public Criteria andYonghxmIsNotNull() {
            addCriterion("YONGHXM is not null");
            return (Criteria) this;
        }

        public Criteria andYonghxmEqualTo(String value) {
            addCriterion("YONGHXM =", value, "yonghxm");
            return (Criteria) this;
        }

        public Criteria andYonghxmNotEqualTo(String value) {
            addCriterion("YONGHXM <>", value, "yonghxm");
            return (Criteria) this;
        }

        public Criteria andYonghxmGreaterThan(String value) {
            addCriterion("YONGHXM >", value, "yonghxm");
            return (Criteria) this;
        }

        public Criteria andYonghxmGreaterThanOrEqualTo(String value) {
            addCriterion("YONGHXM >=", value, "yonghxm");
            return (Criteria) this;
        }

        public Criteria andYonghxmLessThan(String value) {
            addCriterion("YONGHXM <", value, "yonghxm");
            return (Criteria) this;
        }

        public Criteria andYonghxmLessThanOrEqualTo(String value) {
            addCriterion("YONGHXM <=", value, "yonghxm");
            return (Criteria) this;
        }

        public Criteria andYonghxmLike(String value) {
            addCriterion("YONGHXM like", value, "yonghxm");
            return (Criteria) this;
        }

        public Criteria andYonghxmNotLike(String value) {
            addCriterion("YONGHXM not like", value, "yonghxm");
            return (Criteria) this;
        }

        public Criteria andYonghxmIn(List<String> values) {
            addCriterion("YONGHXM in", values, "yonghxm");
            return (Criteria) this;
        }

        public Criteria andYonghxmNotIn(List<String> values) {
            addCriterion("YONGHXM not in", values, "yonghxm");
            return (Criteria) this;
        }

        public Criteria andYonghxmBetween(String value1, String value2) {
            addCriterion("YONGHXM between", value1, value2, "yonghxm");
            return (Criteria) this;
        }

        public Criteria andYonghxmNotBetween(String value1, String value2) {
            addCriterion("YONGHXM not between", value1, value2, "yonghxm");
            return (Criteria) this;
        }

        public Criteria andYonghbzIsNull() {
            addCriterion("YONGHBZ is null");
            return (Criteria) this;
        }

        public Criteria andYonghbzIsNotNull() {
            addCriterion("YONGHBZ is not null");
            return (Criteria) this;
        }

        public Criteria andYonghbzEqualTo(String value) {
            addCriterion("YONGHBZ =", value, "yonghbz");
            return (Criteria) this;
        }

        public Criteria andYonghbzNotEqualTo(String value) {
            addCriterion("YONGHBZ <>", value, "yonghbz");
            return (Criteria) this;
        }

        public Criteria andYonghbzGreaterThan(String value) {
            addCriterion("YONGHBZ >", value, "yonghbz");
            return (Criteria) this;
        }

        public Criteria andYonghbzGreaterThanOrEqualTo(String value) {
            addCriterion("YONGHBZ >=", value, "yonghbz");
            return (Criteria) this;
        }

        public Criteria andYonghbzLessThan(String value) {
            addCriterion("YONGHBZ <", value, "yonghbz");
            return (Criteria) this;
        }

        public Criteria andYonghbzLessThanOrEqualTo(String value) {
            addCriterion("YONGHBZ <=", value, "yonghbz");
            return (Criteria) this;
        }

        public Criteria andYonghbzLike(String value) {
            addCriterion("YONGHBZ like", value, "yonghbz");
            return (Criteria) this;
        }

        public Criteria andYonghbzNotLike(String value) {
            addCriterion("YONGHBZ not like", value, "yonghbz");
            return (Criteria) this;
        }

        public Criteria andYonghbzIn(List<String> values) {
            addCriterion("YONGHBZ in", values, "yonghbz");
            return (Criteria) this;
        }

        public Criteria andYonghbzNotIn(List<String> values) {
            addCriterion("YONGHBZ not in", values, "yonghbz");
            return (Criteria) this;
        }

        public Criteria andYonghbzBetween(String value1, String value2) {
            addCriterion("YONGHBZ between", value1, value2, "yonghbz");
            return (Criteria) this;
        }

        public Criteria andYonghbzNotBetween(String value1, String value2) {
            addCriterion("YONGHBZ not between", value1, value2, "yonghbz");
            return (Criteria) this;
        }

        public Criteria andYonghmmIsNull() {
            addCriterion("YONGHMM is null");
            return (Criteria) this;
        }

        public Criteria andYonghmmIsNotNull() {
            addCriterion("YONGHMM is not null");
            return (Criteria) this;
        }

        public Criteria andYonghmmEqualTo(String value) {
            addCriterion("YONGHMM =", value, "yonghmm");
            return (Criteria) this;
        }

        public Criteria andYonghmmNotEqualTo(String value) {
            addCriterion("YONGHMM <>", value, "yonghmm");
            return (Criteria) this;
        }

        public Criteria andYonghmmGreaterThan(String value) {
            addCriterion("YONGHMM >", value, "yonghmm");
            return (Criteria) this;
        }

        public Criteria andYonghmmGreaterThanOrEqualTo(String value) {
            addCriterion("YONGHMM >=", value, "yonghmm");
            return (Criteria) this;
        }

        public Criteria andYonghmmLessThan(String value) {
            addCriterion("YONGHMM <", value, "yonghmm");
            return (Criteria) this;
        }

        public Criteria andYonghmmLessThanOrEqualTo(String value) {
            addCriterion("YONGHMM <=", value, "yonghmm");
            return (Criteria) this;
        }

        public Criteria andYonghmmLike(String value) {
            addCriterion("YONGHMM like", value, "yonghmm");
            return (Criteria) this;
        }

        public Criteria andYonghmmNotLike(String value) {
            addCriterion("YONGHMM not like", value, "yonghmm");
            return (Criteria) this;
        }

        public Criteria andYonghmmIn(List<String> values) {
            addCriterion("YONGHMM in", values, "yonghmm");
            return (Criteria) this;
        }

        public Criteria andYonghmmNotIn(List<String> values) {
            addCriterion("YONGHMM not in", values, "yonghmm");
            return (Criteria) this;
        }

        public Criteria andYonghmmBetween(String value1, String value2) {
            addCriterion("YONGHMM between", value1, value2, "yonghmm");
            return (Criteria) this;
        }

        public Criteria andYonghmmNotBetween(String value1, String value2) {
            addCriterion("YONGHMM not between", value1, value2, "yonghmm");
            return (Criteria) this;
        }

        public Criteria andYonghdlzhsjIsNull() {
            addCriterion("YONGHDLZHSJ is null");
            return (Criteria) this;
        }

        public Criteria andYonghdlzhsjIsNotNull() {
            addCriterion("YONGHDLZHSJ is not null");
            return (Criteria) this;
        }

        public Criteria andYonghdlzhsjEqualTo(Date value) {
            addCriterionForJDBCDate("YONGHDLZHSJ =", value, "yonghdlzhsj");
            return (Criteria) this;
        }

        public Criteria andYonghdlzhsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("YONGHDLZHSJ <>", value, "yonghdlzhsj");
            return (Criteria) this;
        }

        public Criteria andYonghdlzhsjGreaterThan(Date value) {
            addCriterionForJDBCDate("YONGHDLZHSJ >", value, "yonghdlzhsj");
            return (Criteria) this;
        }

        public Criteria andYonghdlzhsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YONGHDLZHSJ >=", value, "yonghdlzhsj");
            return (Criteria) this;
        }

        public Criteria andYonghdlzhsjLessThan(Date value) {
            addCriterionForJDBCDate("YONGHDLZHSJ <", value, "yonghdlzhsj");
            return (Criteria) this;
        }

        public Criteria andYonghdlzhsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YONGHDLZHSJ <=", value, "yonghdlzhsj");
            return (Criteria) this;
        }

        public Criteria andYonghdlzhsjIn(List<Date> values) {
            addCriterionForJDBCDate("YONGHDLZHSJ in", values, "yonghdlzhsj");
            return (Criteria) this;
        }

        public Criteria andYonghdlzhsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("YONGHDLZHSJ not in", values, "yonghdlzhsj");
            return (Criteria) this;
        }

        public Criteria andYonghdlzhsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YONGHDLZHSJ between", value1, value2, "yonghdlzhsj");
            return (Criteria) this;
        }

        public Criteria andYonghdlzhsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YONGHDLZHSJ not between", value1, value2, "yonghdlzhsj");
            return (Criteria) this;
        }

        public Criteria andYonghdlcsIsNull() {
            addCriterion("YONGHDLCS is null");
            return (Criteria) this;
        }

        public Criteria andYonghdlcsIsNotNull() {
            addCriterion("YONGHDLCS is not null");
            return (Criteria) this;
        }

        public Criteria andYonghdlcsEqualTo(BigDecimal value) {
            addCriterion("YONGHDLCS =", value, "yonghdlcs");
            return (Criteria) this;
        }

        public Criteria andYonghdlcsNotEqualTo(BigDecimal value) {
            addCriterion("YONGHDLCS <>", value, "yonghdlcs");
            return (Criteria) this;
        }

        public Criteria andYonghdlcsGreaterThan(BigDecimal value) {
            addCriterion("YONGHDLCS >", value, "yonghdlcs");
            return (Criteria) this;
        }

        public Criteria andYonghdlcsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YONGHDLCS >=", value, "yonghdlcs");
            return (Criteria) this;
        }

        public Criteria andYonghdlcsLessThan(BigDecimal value) {
            addCriterion("YONGHDLCS <", value, "yonghdlcs");
            return (Criteria) this;
        }

        public Criteria andYonghdlcsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YONGHDLCS <=", value, "yonghdlcs");
            return (Criteria) this;
        }

        public Criteria andYonghdlcsIn(List<BigDecimal> values) {
            addCriterion("YONGHDLCS in", values, "yonghdlcs");
            return (Criteria) this;
        }

        public Criteria andYonghdlcsNotIn(List<BigDecimal> values) {
            addCriterion("YONGHDLCS not in", values, "yonghdlcs");
            return (Criteria) this;
        }

        public Criteria andYonghdlcsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YONGHDLCS between", value1, value2, "yonghdlcs");
            return (Criteria) this;
        }

        public Criteria andYonghdlcsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YONGHDLCS not between", value1, value2, "yonghdlcs");
            return (Criteria) this;
        }

        public Criteria andYonghipIsNull() {
            addCriterion("YONGHIP is null");
            return (Criteria) this;
        }

        public Criteria andYonghipIsNotNull() {
            addCriterion("YONGHIP is not null");
            return (Criteria) this;
        }

        public Criteria andYonghipEqualTo(String value) {
            addCriterion("YONGHIP =", value, "yonghip");
            return (Criteria) this;
        }

        public Criteria andYonghipNotEqualTo(String value) {
            addCriterion("YONGHIP <>", value, "yonghip");
            return (Criteria) this;
        }

        public Criteria andYonghipGreaterThan(String value) {
            addCriterion("YONGHIP >", value, "yonghip");
            return (Criteria) this;
        }

        public Criteria andYonghipGreaterThanOrEqualTo(String value) {
            addCriterion("YONGHIP >=", value, "yonghip");
            return (Criteria) this;
        }

        public Criteria andYonghipLessThan(String value) {
            addCriterion("YONGHIP <", value, "yonghip");
            return (Criteria) this;
        }

        public Criteria andYonghipLessThanOrEqualTo(String value) {
            addCriterion("YONGHIP <=", value, "yonghip");
            return (Criteria) this;
        }

        public Criteria andYonghipLike(String value) {
            addCriterion("YONGHIP like", value, "yonghip");
            return (Criteria) this;
        }

        public Criteria andYonghipNotLike(String value) {
            addCriterion("YONGHIP not like", value, "yonghip");
            return (Criteria) this;
        }

        public Criteria andYonghipIn(List<String> values) {
            addCriterion("YONGHIP in", values, "yonghip");
            return (Criteria) this;
        }

        public Criteria andYonghipNotIn(List<String> values) {
            addCriterion("YONGHIP not in", values, "yonghip");
            return (Criteria) this;
        }

        public Criteria andYonghipBetween(String value1, String value2) {
            addCriterion("YONGHIP between", value1, value2, "yonghip");
            return (Criteria) this;
        }

        public Criteria andYonghipNotBetween(String value1, String value2) {
            addCriterion("YONGHIP not between", value1, value2, "yonghip");
            return (Criteria) this;
        }

        public Criteria andZhanghztIsNull() {
            addCriterion("ZHANGHZT is null");
            return (Criteria) this;
        }

        public Criteria andZhanghztIsNotNull() {
            addCriterion("ZHANGHZT is not null");
            return (Criteria) this;
        }

        public Criteria andZhanghztEqualTo(Object value) {
            addCriterion("ZHANGHZT =", value, "zhanghzt");
            return (Criteria) this;
        }

        public Criteria andZhanghztNotEqualTo(Object value) {
            addCriterion("ZHANGHZT <>", value, "zhanghzt");
            return (Criteria) this;
        }

        public Criteria andZhanghztGreaterThan(Object value) {
            addCriterion("ZHANGHZT >", value, "zhanghzt");
            return (Criteria) this;
        }

        public Criteria andZhanghztGreaterThanOrEqualTo(Object value) {
            addCriterion("ZHANGHZT >=", value, "zhanghzt");
            return (Criteria) this;
        }

        public Criteria andZhanghztLessThan(Object value) {
            addCriterion("ZHANGHZT <", value, "zhanghzt");
            return (Criteria) this;
        }

        public Criteria andZhanghztLessThanOrEqualTo(Object value) {
            addCriterion("ZHANGHZT <=", value, "zhanghzt");
            return (Criteria) this;
        }

        public Criteria andZhanghztIn(List<Object> values) {
            addCriterion("ZHANGHZT in", values, "zhanghzt");
            return (Criteria) this;
        }

        public Criteria andZhanghztNotIn(List<Object> values) {
            addCriterion("ZHANGHZT not in", values, "zhanghzt");
            return (Criteria) this;
        }

        public Criteria andZhanghztBetween(Object value1, Object value2) {
            addCriterion("ZHANGHZT between", value1, value2, "zhanghzt");
            return (Criteria) this;
        }

        public Criteria andZhanghztNotBetween(Object value1, Object value2) {
            addCriterion("ZHANGHZT not between", value1, value2, "zhanghzt");
            return (Criteria) this;
        }

        public Criteria andZhucsjIsNull() {
            addCriterion("ZHUCSJ is null");
            return (Criteria) this;
        }

        public Criteria andZhucsjIsNotNull() {
            addCriterion("ZHUCSJ is not null");
            return (Criteria) this;
        }

        public Criteria andZhucsjEqualTo(Date value) {
            addCriterionForJDBCDate("ZHUCSJ =", value, "zhucsj");
            return (Criteria) this;
        }

        public Criteria andZhucsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("ZHUCSJ <>", value, "zhucsj");
            return (Criteria) this;
        }

        public Criteria andZhucsjGreaterThan(Date value) {
            addCriterionForJDBCDate("ZHUCSJ >", value, "zhucsj");
            return (Criteria) this;
        }

        public Criteria andZhucsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHUCSJ >=", value, "zhucsj");
            return (Criteria) this;
        }

        public Criteria andZhucsjLessThan(Date value) {
            addCriterionForJDBCDate("ZHUCSJ <", value, "zhucsj");
            return (Criteria) this;
        }

        public Criteria andZhucsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHUCSJ <=", value, "zhucsj");
            return (Criteria) this;
        }

        public Criteria andZhucsjIn(List<Date> values) {
            addCriterionForJDBCDate("ZHUCSJ in", values, "zhucsj");
            return (Criteria) this;
        }

        public Criteria andZhucsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("ZHUCSJ not in", values, "zhucsj");
            return (Criteria) this;
        }

        public Criteria andZhucsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHUCSJ between", value1, value2, "zhucsj");
            return (Criteria) this;
        }

        public Criteria andZhucsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHUCSJ not between", value1, value2, "zhucsj");
            return (Criteria) this;
        }

        public Criteria andJiaosidIsNull() {
            addCriterion("JIAOSID is null");
            return (Criteria) this;
        }

        public Criteria andJiaosidIsNotNull() {
            addCriterion("JIAOSID is not null");
            return (Criteria) this;
        }

        public Criteria andJiaosidEqualTo(Object value) {
            addCriterion("JIAOSID =", value, "jiaosid");
            return (Criteria) this;
        }

        public Criteria andJiaosidNotEqualTo(Object value) {
            addCriterion("JIAOSID <>", value, "jiaosid");
            return (Criteria) this;
        }

        public Criteria andJiaosidGreaterThan(Object value) {
            addCriterion("JIAOSID >", value, "jiaosid");
            return (Criteria) this;
        }

        public Criteria andJiaosidGreaterThanOrEqualTo(Object value) {
            addCriterion("JIAOSID >=", value, "jiaosid");
            return (Criteria) this;
        }

        public Criteria andJiaosidLessThan(Object value) {
            addCriterion("JIAOSID <", value, "jiaosid");
            return (Criteria) this;
        }

        public Criteria andJiaosidLessThanOrEqualTo(Object value) {
            addCriterion("JIAOSID <=", value, "jiaosid");
            return (Criteria) this;
        }

        public Criteria andJiaosidIn(List<Object> values) {
            addCriterion("JIAOSID in", values, "jiaosid");
            return (Criteria) this;
        }

        public Criteria andJiaosidNotIn(List<Object> values) {
            addCriterion("JIAOSID not in", values, "jiaosid");
            return (Criteria) this;
        }

        public Criteria andJiaosidBetween(Object value1, Object value2) {
            addCriterion("JIAOSID between", value1, value2, "jiaosid");
            return (Criteria) this;
        }

        public Criteria andJiaosidNotBetween(Object value1, Object value2) {
            addCriterion("JIAOSID not between", value1, value2, "jiaosid");
            return (Criteria) this;
        }

        public Criteria andBumidIsNull() {
            addCriterion("BUMID is null");
            return (Criteria) this;
        }

        public Criteria andBumidIsNotNull() {
            addCriterion("BUMID is not null");
            return (Criteria) this;
        }

        public Criteria andBumidEqualTo(String value) {
            addCriterion("BUMID =", value, "bumid");
            return (Criteria) this;
        }

        public Criteria andBumidNotEqualTo(String value) {
            addCriterion("BUMID <>", value, "bumid");
            return (Criteria) this;
        }

        public Criteria andBumidGreaterThan(String value) {
            addCriterion("BUMID >", value, "bumid");
            return (Criteria) this;
        }

        public Criteria andBumidGreaterThanOrEqualTo(String value) {
            addCriterion("BUMID >=", value, "bumid");
            return (Criteria) this;
        }

        public Criteria andBumidLessThan(String value) {
            addCriterion("BUMID <", value, "bumid");
            return (Criteria) this;
        }

        public Criteria andBumidLessThanOrEqualTo(String value) {
            addCriterion("BUMID <=", value, "bumid");
            return (Criteria) this;
        }

        public Criteria andBumidLike(String value) {
            addCriterion("BUMID like", value, "bumid");
            return (Criteria) this;
        }

        public Criteria andBumidNotLike(String value) {
            addCriterion("BUMID not like", value, "bumid");
            return (Criteria) this;
        }

        public Criteria andBumidIn(List<String> values) {
            addCriterion("BUMID in", values, "bumid");
            return (Criteria) this;
        }

        public Criteria andBumidNotIn(List<String> values) {
            addCriterion("BUMID not in", values, "bumid");
            return (Criteria) this;
        }

        public Criteria andBumidBetween(String value1, String value2) {
            addCriterion("BUMID between", value1, value2, "bumid");
            return (Criteria) this;
        }

        public Criteria andBumidNotBetween(String value1, String value2) {
            addCriterion("BUMID not between", value1, value2, "bumid");
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