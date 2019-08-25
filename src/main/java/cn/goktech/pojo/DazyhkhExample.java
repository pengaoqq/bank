package cn.goktech.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DazyhkhExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DazyhkhExample() {
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

        public Criteria andLiushIsNull() {
            addCriterion("LIUSH is null");
            return (Criteria) this;
        }

        public Criteria andLiushIsNotNull() {
            addCriterion("LIUSH is not null");
            return (Criteria) this;
        }

        public Criteria andLiushEqualTo(Object value) {
            addCriterion("LIUSH =", value, "liush");
            return (Criteria) this;
        }

        public Criteria andLiushNotEqualTo(Object value) {
            addCriterion("LIUSH <>", value, "liush");
            return (Criteria) this;
        }

        public Criteria andLiushGreaterThan(Object value) {
            addCriterion("LIUSH >", value, "liush");
            return (Criteria) this;
        }

        public Criteria andLiushGreaterThanOrEqualTo(Object value) {
            addCriterion("LIUSH >=", value, "liush");
            return (Criteria) this;
        }

        public Criteria andLiushLessThan(Object value) {
            addCriterion("LIUSH <", value, "liush");
            return (Criteria) this;
        }

        public Criteria andLiushLessThanOrEqualTo(Object value) {
            addCriterion("LIUSH <=", value, "liush");
            return (Criteria) this;
        }

        public Criteria andLiushIn(List<Object> values) {
            addCriterion("LIUSH in", values, "liush");
            return (Criteria) this;
        }

        public Criteria andLiushNotIn(List<Object> values) {
            addCriterion("LIUSH not in", values, "liush");
            return (Criteria) this;
        }

        public Criteria andLiushBetween(Object value1, Object value2) {
            addCriterion("LIUSH between", value1, value2, "liush");
            return (Criteria) this;
        }

        public Criteria andLiushNotBetween(Object value1, Object value2) {
            addCriterion("LIUSH not between", value1, value2, "liush");
            return (Criteria) this;
        }

        public Criteria andCunkrmcIsNull() {
            addCriterion("CUNKRMC is null");
            return (Criteria) this;
        }

        public Criteria andCunkrmcIsNotNull() {
            addCriterion("CUNKRMC is not null");
            return (Criteria) this;
        }

        public Criteria andCunkrmcEqualTo(String value) {
            addCriterion("CUNKRMC =", value, "cunkrmc");
            return (Criteria) this;
        }

        public Criteria andCunkrmcNotEqualTo(String value) {
            addCriterion("CUNKRMC <>", value, "cunkrmc");
            return (Criteria) this;
        }

        public Criteria andCunkrmcGreaterThan(String value) {
            addCriterion("CUNKRMC >", value, "cunkrmc");
            return (Criteria) this;
        }

        public Criteria andCunkrmcGreaterThanOrEqualTo(String value) {
            addCriterion("CUNKRMC >=", value, "cunkrmc");
            return (Criteria) this;
        }

        public Criteria andCunkrmcLessThan(String value) {
            addCriterion("CUNKRMC <", value, "cunkrmc");
            return (Criteria) this;
        }

        public Criteria andCunkrmcLessThanOrEqualTo(String value) {
            addCriterion("CUNKRMC <=", value, "cunkrmc");
            return (Criteria) this;
        }

        public Criteria andCunkrmcLike(String value) {
            addCriterion("CUNKRMC like", value, "cunkrmc");
            return (Criteria) this;
        }

        public Criteria andCunkrmcNotLike(String value) {
            addCriterion("CUNKRMC not like", value, "cunkrmc");
            return (Criteria) this;
        }

        public Criteria andCunkrmcIn(List<String> values) {
            addCriterion("CUNKRMC in", values, "cunkrmc");
            return (Criteria) this;
        }

        public Criteria andCunkrmcNotIn(List<String> values) {
            addCriterion("CUNKRMC not in", values, "cunkrmc");
            return (Criteria) this;
        }

        public Criteria andCunkrmcBetween(String value1, String value2) {
            addCriterion("CUNKRMC between", value1, value2, "cunkrmc");
            return (Criteria) this;
        }

        public Criteria andCunkrmcNotBetween(String value1, String value2) {
            addCriterion("CUNKRMC not between", value1, value2, "cunkrmc");
            return (Criteria) this;
        }

        public Criteria andCunkrdhIsNull() {
            addCriterion("CUNKRDH is null");
            return (Criteria) this;
        }

        public Criteria andCunkrdhIsNotNull() {
            addCriterion("CUNKRDH is not null");
            return (Criteria) this;
        }

        public Criteria andCunkrdhEqualTo(String value) {
            addCriterion("CUNKRDH =", value, "cunkrdh");
            return (Criteria) this;
        }

        public Criteria andCunkrdhNotEqualTo(String value) {
            addCriterion("CUNKRDH <>", value, "cunkrdh");
            return (Criteria) this;
        }

        public Criteria andCunkrdhGreaterThan(String value) {
            addCriterion("CUNKRDH >", value, "cunkrdh");
            return (Criteria) this;
        }

        public Criteria andCunkrdhGreaterThanOrEqualTo(String value) {
            addCriterion("CUNKRDH >=", value, "cunkrdh");
            return (Criteria) this;
        }

        public Criteria andCunkrdhLessThan(String value) {
            addCriterion("CUNKRDH <", value, "cunkrdh");
            return (Criteria) this;
        }

        public Criteria andCunkrdhLessThanOrEqualTo(String value) {
            addCriterion("CUNKRDH <=", value, "cunkrdh");
            return (Criteria) this;
        }

        public Criteria andCunkrdhLike(String value) {
            addCriterion("CUNKRDH like", value, "cunkrdh");
            return (Criteria) this;
        }

        public Criteria andCunkrdhNotLike(String value) {
            addCriterion("CUNKRDH not like", value, "cunkrdh");
            return (Criteria) this;
        }

        public Criteria andCunkrdhIn(List<String> values) {
            addCriterion("CUNKRDH in", values, "cunkrdh");
            return (Criteria) this;
        }

        public Criteria andCunkrdhNotIn(List<String> values) {
            addCriterion("CUNKRDH not in", values, "cunkrdh");
            return (Criteria) this;
        }

        public Criteria andCunkrdhBetween(String value1, String value2) {
            addCriterion("CUNKRDH between", value1, value2, "cunkrdh");
            return (Criteria) this;
        }

        public Criteria andCunkrdhNotBetween(String value1, String value2) {
            addCriterion("CUNKRDH not between", value1, value2, "cunkrdh");
            return (Criteria) this;
        }

        public Criteria andZhucqyIsNull() {
            addCriterion("ZHUCQY is null");
            return (Criteria) this;
        }

        public Criteria andZhucqyIsNotNull() {
            addCriterion("ZHUCQY is not null");
            return (Criteria) this;
        }

        public Criteria andZhucqyEqualTo(String value) {
            addCriterion("ZHUCQY =", value, "zhucqy");
            return (Criteria) this;
        }

        public Criteria andZhucqyNotEqualTo(String value) {
            addCriterion("ZHUCQY <>", value, "zhucqy");
            return (Criteria) this;
        }

        public Criteria andZhucqyGreaterThan(String value) {
            addCriterion("ZHUCQY >", value, "zhucqy");
            return (Criteria) this;
        }

        public Criteria andZhucqyGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUCQY >=", value, "zhucqy");
            return (Criteria) this;
        }

        public Criteria andZhucqyLessThan(String value) {
            addCriterion("ZHUCQY <", value, "zhucqy");
            return (Criteria) this;
        }

        public Criteria andZhucqyLessThanOrEqualTo(String value) {
            addCriterion("ZHUCQY <=", value, "zhucqy");
            return (Criteria) this;
        }

        public Criteria andZhucqyLike(String value) {
            addCriterion("ZHUCQY like", value, "zhucqy");
            return (Criteria) this;
        }

        public Criteria andZhucqyNotLike(String value) {
            addCriterion("ZHUCQY not like", value, "zhucqy");
            return (Criteria) this;
        }

        public Criteria andZhucqyIn(List<String> values) {
            addCriterion("ZHUCQY in", values, "zhucqy");
            return (Criteria) this;
        }

        public Criteria andZhucqyNotIn(List<String> values) {
            addCriterion("ZHUCQY not in", values, "zhucqy");
            return (Criteria) this;
        }

        public Criteria andZhucqyBetween(String value1, String value2) {
            addCriterion("ZHUCQY between", value1, value2, "zhucqy");
            return (Criteria) this;
        }

        public Criteria andZhucqyNotBetween(String value1, String value2) {
            addCriterion("ZHUCQY not between", value1, value2, "zhucqy");
            return (Criteria) this;
        }

        public Criteria andZhucdzIsNull() {
            addCriterion("ZHUCDZ is null");
            return (Criteria) this;
        }

        public Criteria andZhucdzIsNotNull() {
            addCriterion("ZHUCDZ is not null");
            return (Criteria) this;
        }

        public Criteria andZhucdzEqualTo(String value) {
            addCriterion("ZHUCDZ =", value, "zhucdz");
            return (Criteria) this;
        }

        public Criteria andZhucdzNotEqualTo(String value) {
            addCriterion("ZHUCDZ <>", value, "zhucdz");
            return (Criteria) this;
        }

        public Criteria andZhucdzGreaterThan(String value) {
            addCriterion("ZHUCDZ >", value, "zhucdz");
            return (Criteria) this;
        }

        public Criteria andZhucdzGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUCDZ >=", value, "zhucdz");
            return (Criteria) this;
        }

        public Criteria andZhucdzLessThan(String value) {
            addCriterion("ZHUCDZ <", value, "zhucdz");
            return (Criteria) this;
        }

        public Criteria andZhucdzLessThanOrEqualTo(String value) {
            addCriterion("ZHUCDZ <=", value, "zhucdz");
            return (Criteria) this;
        }

        public Criteria andZhucdzLike(String value) {
            addCriterion("ZHUCDZ like", value, "zhucdz");
            return (Criteria) this;
        }

        public Criteria andZhucdzNotLike(String value) {
            addCriterion("ZHUCDZ not like", value, "zhucdz");
            return (Criteria) this;
        }

        public Criteria andZhucdzIn(List<String> values) {
            addCriterion("ZHUCDZ in", values, "zhucdz");
            return (Criteria) this;
        }

        public Criteria andZhucdzNotIn(List<String> values) {
            addCriterion("ZHUCDZ not in", values, "zhucdz");
            return (Criteria) this;
        }

        public Criteria andZhucdzBetween(String value1, String value2) {
            addCriterion("ZHUCDZ between", value1, value2, "zhucdz");
            return (Criteria) this;
        }

        public Criteria andZhucdzNotBetween(String value1, String value2) {
            addCriterion("ZHUCDZ not between", value1, value2, "zhucdz");
            return (Criteria) this;
        }

        public Criteria andYouzbmIsNull() {
            addCriterion("YOUZBM is null");
            return (Criteria) this;
        }

        public Criteria andYouzbmIsNotNull() {
            addCriterion("YOUZBM is not null");
            return (Criteria) this;
        }

        public Criteria andYouzbmEqualTo(Object value) {
            addCriterion("YOUZBM =", value, "youzbm");
            return (Criteria) this;
        }

        public Criteria andYouzbmNotEqualTo(Object value) {
            addCriterion("YOUZBM <>", value, "youzbm");
            return (Criteria) this;
        }

        public Criteria andYouzbmGreaterThan(Object value) {
            addCriterion("YOUZBM >", value, "youzbm");
            return (Criteria) this;
        }

        public Criteria andYouzbmGreaterThanOrEqualTo(Object value) {
            addCriterion("YOUZBM >=", value, "youzbm");
            return (Criteria) this;
        }

        public Criteria andYouzbmLessThan(Object value) {
            addCriterion("YOUZBM <", value, "youzbm");
            return (Criteria) this;
        }

        public Criteria andYouzbmLessThanOrEqualTo(Object value) {
            addCriterion("YOUZBM <=", value, "youzbm");
            return (Criteria) this;
        }

        public Criteria andYouzbmIn(List<Object> values) {
            addCriterion("YOUZBM in", values, "youzbm");
            return (Criteria) this;
        }

        public Criteria andYouzbmNotIn(List<Object> values) {
            addCriterion("YOUZBM not in", values, "youzbm");
            return (Criteria) this;
        }

        public Criteria andYouzbmBetween(Object value1, Object value2) {
            addCriterion("YOUZBM between", value1, value2, "youzbm");
            return (Criteria) this;
        }

        public Criteria andYouzbmNotBetween(Object value1, Object value2) {
            addCriterion("YOUZBM not between", value1, value2, "youzbm");
            return (Criteria) this;
        }

        public Criteria andCunkrlbIsNull() {
            addCriterion("CUNKRLB is null");
            return (Criteria) this;
        }

        public Criteria andCunkrlbIsNotNull() {
            addCriterion("CUNKRLB is not null");
            return (Criteria) this;
        }

        public Criteria andCunkrlbEqualTo(Object value) {
            addCriterion("CUNKRLB =", value, "cunkrlb");
            return (Criteria) this;
        }

        public Criteria andCunkrlbNotEqualTo(Object value) {
            addCriterion("CUNKRLB <>", value, "cunkrlb");
            return (Criteria) this;
        }

        public Criteria andCunkrlbGreaterThan(Object value) {
            addCriterion("CUNKRLB >", value, "cunkrlb");
            return (Criteria) this;
        }

        public Criteria andCunkrlbGreaterThanOrEqualTo(Object value) {
            addCriterion("CUNKRLB >=", value, "cunkrlb");
            return (Criteria) this;
        }

        public Criteria andCunkrlbLessThan(Object value) {
            addCriterion("CUNKRLB <", value, "cunkrlb");
            return (Criteria) this;
        }

        public Criteria andCunkrlbLessThanOrEqualTo(Object value) {
            addCriterion("CUNKRLB <=", value, "cunkrlb");
            return (Criteria) this;
        }

        public Criteria andCunkrlbIn(List<Object> values) {
            addCriterion("CUNKRLB in", values, "cunkrlb");
            return (Criteria) this;
        }

        public Criteria andCunkrlbNotIn(List<Object> values) {
            addCriterion("CUNKRLB not in", values, "cunkrlb");
            return (Criteria) this;
        }

        public Criteria andCunkrlbBetween(Object value1, Object value2) {
            addCriterion("CUNKRLB between", value1, value2, "cunkrlb");
            return (Criteria) this;
        }

        public Criteria andCunkrlbNotBetween(Object value1, Object value2) {
            addCriterion("CUNKRLB not between", value1, value2, "cunkrlb");
            return (Criteria) this;
        }

        public Criteria andZuzjgdmIsNull() {
            addCriterion("ZUZJGDM is null");
            return (Criteria) this;
        }

        public Criteria andZuzjgdmIsNotNull() {
            addCriterion("ZUZJGDM is not null");
            return (Criteria) this;
        }

        public Criteria andZuzjgdmEqualTo(String value) {
            addCriterion("ZUZJGDM =", value, "zuzjgdm");
            return (Criteria) this;
        }

        public Criteria andZuzjgdmNotEqualTo(String value) {
            addCriterion("ZUZJGDM <>", value, "zuzjgdm");
            return (Criteria) this;
        }

        public Criteria andZuzjgdmGreaterThan(String value) {
            addCriterion("ZUZJGDM >", value, "zuzjgdm");
            return (Criteria) this;
        }

        public Criteria andZuzjgdmGreaterThanOrEqualTo(String value) {
            addCriterion("ZUZJGDM >=", value, "zuzjgdm");
            return (Criteria) this;
        }

        public Criteria andZuzjgdmLessThan(String value) {
            addCriterion("ZUZJGDM <", value, "zuzjgdm");
            return (Criteria) this;
        }

        public Criteria andZuzjgdmLessThanOrEqualTo(String value) {
            addCriterion("ZUZJGDM <=", value, "zuzjgdm");
            return (Criteria) this;
        }

        public Criteria andZuzjgdmLike(String value) {
            addCriterion("ZUZJGDM like", value, "zuzjgdm");
            return (Criteria) this;
        }

        public Criteria andZuzjgdmNotLike(String value) {
            addCriterion("ZUZJGDM not like", value, "zuzjgdm");
            return (Criteria) this;
        }

        public Criteria andZuzjgdmIn(List<String> values) {
            addCriterion("ZUZJGDM in", values, "zuzjgdm");
            return (Criteria) this;
        }

        public Criteria andZuzjgdmNotIn(List<String> values) {
            addCriterion("ZUZJGDM not in", values, "zuzjgdm");
            return (Criteria) this;
        }

        public Criteria andZuzjgdmBetween(String value1, String value2) {
            addCriterion("ZUZJGDM between", value1, value2, "zuzjgdm");
            return (Criteria) this;
        }

        public Criteria andZuzjgdmNotBetween(String value1, String value2) {
            addCriterion("ZUZJGDM not between", value1, value2, "zuzjgdm");
            return (Criteria) this;
        }

        public Criteria andRenylbIsNull() {
            addCriterion("RENYLB is null");
            return (Criteria) this;
        }

        public Criteria andRenylbIsNotNull() {
            addCriterion("RENYLB is not null");
            return (Criteria) this;
        }

        public Criteria andRenylbEqualTo(Object value) {
            addCriterion("RENYLB =", value, "renylb");
            return (Criteria) this;
        }

        public Criteria andRenylbNotEqualTo(Object value) {
            addCriterion("RENYLB <>", value, "renylb");
            return (Criteria) this;
        }

        public Criteria andRenylbGreaterThan(Object value) {
            addCriterion("RENYLB >", value, "renylb");
            return (Criteria) this;
        }

        public Criteria andRenylbGreaterThanOrEqualTo(Object value) {
            addCriterion("RENYLB >=", value, "renylb");
            return (Criteria) this;
        }

        public Criteria andRenylbLessThan(Object value) {
            addCriterion("RENYLB <", value, "renylb");
            return (Criteria) this;
        }

        public Criteria andRenylbLessThanOrEqualTo(Object value) {
            addCriterion("RENYLB <=", value, "renylb");
            return (Criteria) this;
        }

        public Criteria andRenylbIn(List<Object> values) {
            addCriterion("RENYLB in", values, "renylb");
            return (Criteria) this;
        }

        public Criteria andRenylbNotIn(List<Object> values) {
            addCriterion("RENYLB not in", values, "renylb");
            return (Criteria) this;
        }

        public Criteria andRenylbBetween(Object value1, Object value2) {
            addCriterion("RENYLB between", value1, value2, "renylb");
            return (Criteria) this;
        }

        public Criteria andRenylbNotBetween(Object value1, Object value2) {
            addCriterion("RENYLB not between", value1, value2, "renylb");
            return (Criteria) this;
        }

        public Criteria andFaddbrIsNull() {
            addCriterion("FADDBR is null");
            return (Criteria) this;
        }

        public Criteria andFaddbrIsNotNull() {
            addCriterion("FADDBR is not null");
            return (Criteria) this;
        }

        public Criteria andFaddbrEqualTo(String value) {
            addCriterion("FADDBR =", value, "faddbr");
            return (Criteria) this;
        }

        public Criteria andFaddbrNotEqualTo(String value) {
            addCriterion("FADDBR <>", value, "faddbr");
            return (Criteria) this;
        }

        public Criteria andFaddbrGreaterThan(String value) {
            addCriterion("FADDBR >", value, "faddbr");
            return (Criteria) this;
        }

        public Criteria andFaddbrGreaterThanOrEqualTo(String value) {
            addCriterion("FADDBR >=", value, "faddbr");
            return (Criteria) this;
        }

        public Criteria andFaddbrLessThan(String value) {
            addCriterion("FADDBR <", value, "faddbr");
            return (Criteria) this;
        }

        public Criteria andFaddbrLessThanOrEqualTo(String value) {
            addCriterion("FADDBR <=", value, "faddbr");
            return (Criteria) this;
        }

        public Criteria andFaddbrLike(String value) {
            addCriterion("FADDBR like", value, "faddbr");
            return (Criteria) this;
        }

        public Criteria andFaddbrNotLike(String value) {
            addCriterion("FADDBR not like", value, "faddbr");
            return (Criteria) this;
        }

        public Criteria andFaddbrIn(List<String> values) {
            addCriterion("FADDBR in", values, "faddbr");
            return (Criteria) this;
        }

        public Criteria andFaddbrNotIn(List<String> values) {
            addCriterion("FADDBR not in", values, "faddbr");
            return (Criteria) this;
        }

        public Criteria andFaddbrBetween(String value1, String value2) {
            addCriterion("FADDBR between", value1, value2, "faddbr");
            return (Criteria) this;
        }

        public Criteria andFaddbrNotBetween(String value1, String value2) {
            addCriterion("FADDBR not between", value1, value2, "faddbr");
            return (Criteria) this;
        }

        public Criteria andDanwfzrIsNull() {
            addCriterion("DANWFZR is null");
            return (Criteria) this;
        }

        public Criteria andDanwfzrIsNotNull() {
            addCriterion("DANWFZR is not null");
            return (Criteria) this;
        }

        public Criteria andDanwfzrEqualTo(String value) {
            addCriterion("DANWFZR =", value, "danwfzr");
            return (Criteria) this;
        }

        public Criteria andDanwfzrNotEqualTo(String value) {
            addCriterion("DANWFZR <>", value, "danwfzr");
            return (Criteria) this;
        }

        public Criteria andDanwfzrGreaterThan(String value) {
            addCriterion("DANWFZR >", value, "danwfzr");
            return (Criteria) this;
        }

        public Criteria andDanwfzrGreaterThanOrEqualTo(String value) {
            addCriterion("DANWFZR >=", value, "danwfzr");
            return (Criteria) this;
        }

        public Criteria andDanwfzrLessThan(String value) {
            addCriterion("DANWFZR <", value, "danwfzr");
            return (Criteria) this;
        }

        public Criteria andDanwfzrLessThanOrEqualTo(String value) {
            addCriterion("DANWFZR <=", value, "danwfzr");
            return (Criteria) this;
        }

        public Criteria andDanwfzrLike(String value) {
            addCriterion("DANWFZR like", value, "danwfzr");
            return (Criteria) this;
        }

        public Criteria andDanwfzrNotLike(String value) {
            addCriterion("DANWFZR not like", value, "danwfzr");
            return (Criteria) this;
        }

        public Criteria andDanwfzrIn(List<String> values) {
            addCriterion("DANWFZR in", values, "danwfzr");
            return (Criteria) this;
        }

        public Criteria andDanwfzrNotIn(List<String> values) {
            addCriterion("DANWFZR not in", values, "danwfzr");
            return (Criteria) this;
        }

        public Criteria andDanwfzrBetween(String value1, String value2) {
            addCriterion("DANWFZR between", value1, value2, "danwfzr");
            return (Criteria) this;
        }

        public Criteria andDanwfzrNotBetween(String value1, String value2) {
            addCriterion("DANWFZR not between", value1, value2, "danwfzr");
            return (Criteria) this;
        }

        public Criteria andXingmIsNull() {
            addCriterion("XINGM is null");
            return (Criteria) this;
        }

        public Criteria andXingmIsNotNull() {
            addCriterion("XINGM is not null");
            return (Criteria) this;
        }

        public Criteria andXingmEqualTo(String value) {
            addCriterion("XINGM =", value, "xingm");
            return (Criteria) this;
        }

        public Criteria andXingmNotEqualTo(String value) {
            addCriterion("XINGM <>", value, "xingm");
            return (Criteria) this;
        }

        public Criteria andXingmGreaterThan(String value) {
            addCriterion("XINGM >", value, "xingm");
            return (Criteria) this;
        }

        public Criteria andXingmGreaterThanOrEqualTo(String value) {
            addCriterion("XINGM >=", value, "xingm");
            return (Criteria) this;
        }

        public Criteria andXingmLessThan(String value) {
            addCriterion("XINGM <", value, "xingm");
            return (Criteria) this;
        }

        public Criteria andXingmLessThanOrEqualTo(String value) {
            addCriterion("XINGM <=", value, "xingm");
            return (Criteria) this;
        }

        public Criteria andXingmLike(String value) {
            addCriterion("XINGM like", value, "xingm");
            return (Criteria) this;
        }

        public Criteria andXingmNotLike(String value) {
            addCriterion("XINGM not like", value, "xingm");
            return (Criteria) this;
        }

        public Criteria andXingmIn(List<String> values) {
            addCriterion("XINGM in", values, "xingm");
            return (Criteria) this;
        }

        public Criteria andXingmNotIn(List<String> values) {
            addCriterion("XINGM not in", values, "xingm");
            return (Criteria) this;
        }

        public Criteria andXingmBetween(String value1, String value2) {
            addCriterion("XINGM between", value1, value2, "xingm");
            return (Criteria) this;
        }

        public Criteria andXingmNotBetween(String value1, String value2) {
            addCriterion("XINGM not between", value1, value2, "xingm");
            return (Criteria) this;
        }

        public Criteria andDianhIsNull() {
            addCriterion("DIANH is null");
            return (Criteria) this;
        }

        public Criteria andDianhIsNotNull() {
            addCriterion("DIANH is not null");
            return (Criteria) this;
        }

        public Criteria andDianhEqualTo(String value) {
            addCriterion("DIANH =", value, "dianh");
            return (Criteria) this;
        }

        public Criteria andDianhNotEqualTo(String value) {
            addCriterion("DIANH <>", value, "dianh");
            return (Criteria) this;
        }

        public Criteria andDianhGreaterThan(String value) {
            addCriterion("DIANH >", value, "dianh");
            return (Criteria) this;
        }

        public Criteria andDianhGreaterThanOrEqualTo(String value) {
            addCriterion("DIANH >=", value, "dianh");
            return (Criteria) this;
        }

        public Criteria andDianhLessThan(String value) {
            addCriterion("DIANH <", value, "dianh");
            return (Criteria) this;
        }

        public Criteria andDianhLessThanOrEqualTo(String value) {
            addCriterion("DIANH <=", value, "dianh");
            return (Criteria) this;
        }

        public Criteria andDianhLike(String value) {
            addCriterion("DIANH like", value, "dianh");
            return (Criteria) this;
        }

        public Criteria andDianhNotLike(String value) {
            addCriterion("DIANH not like", value, "dianh");
            return (Criteria) this;
        }

        public Criteria andDianhIn(List<String> values) {
            addCriterion("DIANH in", values, "dianh");
            return (Criteria) this;
        }

        public Criteria andDianhNotIn(List<String> values) {
            addCriterion("DIANH not in", values, "dianh");
            return (Criteria) this;
        }

        public Criteria andDianhBetween(String value1, String value2) {
            addCriterion("DIANH between", value1, value2, "dianh");
            return (Criteria) this;
        }

        public Criteria andDianhNotBetween(String value1, String value2) {
            addCriterion("DIANH not between", value1, value2, "dianh");
            return (Criteria) this;
        }

        public Criteria andZhengjzlIsNull() {
            addCriterion("ZHENGJZL is null");
            return (Criteria) this;
        }

        public Criteria andZhengjzlIsNotNull() {
            addCriterion("ZHENGJZL is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjzlEqualTo(Object value) {
            addCriterion("ZHENGJZL =", value, "zhengjzl");
            return (Criteria) this;
        }

        public Criteria andZhengjzlNotEqualTo(Object value) {
            addCriterion("ZHENGJZL <>", value, "zhengjzl");
            return (Criteria) this;
        }

        public Criteria andZhengjzlGreaterThan(Object value) {
            addCriterion("ZHENGJZL >", value, "zhengjzl");
            return (Criteria) this;
        }

        public Criteria andZhengjzlGreaterThanOrEqualTo(Object value) {
            addCriterion("ZHENGJZL >=", value, "zhengjzl");
            return (Criteria) this;
        }

        public Criteria andZhengjzlLessThan(Object value) {
            addCriterion("ZHENGJZL <", value, "zhengjzl");
            return (Criteria) this;
        }

        public Criteria andZhengjzlLessThanOrEqualTo(Object value) {
            addCriterion("ZHENGJZL <=", value, "zhengjzl");
            return (Criteria) this;
        }

        public Criteria andZhengjzlIn(List<Object> values) {
            addCriterion("ZHENGJZL in", values, "zhengjzl");
            return (Criteria) this;
        }

        public Criteria andZhengjzlNotIn(List<Object> values) {
            addCriterion("ZHENGJZL not in", values, "zhengjzl");
            return (Criteria) this;
        }

        public Criteria andZhengjzlBetween(Object value1, Object value2) {
            addCriterion("ZHENGJZL between", value1, value2, "zhengjzl");
            return (Criteria) this;
        }

        public Criteria andZhengjzlNotBetween(Object value1, Object value2) {
            addCriterion("ZHENGJZL not between", value1, value2, "zhengjzl");
            return (Criteria) this;
        }

        public Criteria andZhengjhmIsNull() {
            addCriterion("ZHENGJHM is null");
            return (Criteria) this;
        }

        public Criteria andZhengjhmIsNotNull() {
            addCriterion("ZHENGJHM is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjhmEqualTo(String value) {
            addCriterion("ZHENGJHM =", value, "zhengjhm");
            return (Criteria) this;
        }

        public Criteria andZhengjhmNotEqualTo(String value) {
            addCriterion("ZHENGJHM <>", value, "zhengjhm");
            return (Criteria) this;
        }

        public Criteria andZhengjhmGreaterThan(String value) {
            addCriterion("ZHENGJHM >", value, "zhengjhm");
            return (Criteria) this;
        }

        public Criteria andZhengjhmGreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGJHM >=", value, "zhengjhm");
            return (Criteria) this;
        }

        public Criteria andZhengjhmLessThan(String value) {
            addCriterion("ZHENGJHM <", value, "zhengjhm");
            return (Criteria) this;
        }

        public Criteria andZhengjhmLessThanOrEqualTo(String value) {
            addCriterion("ZHENGJHM <=", value, "zhengjhm");
            return (Criteria) this;
        }

        public Criteria andZhengjhmLike(String value) {
            addCriterion("ZHENGJHM like", value, "zhengjhm");
            return (Criteria) this;
        }

        public Criteria andZhengjhmNotLike(String value) {
            addCriterion("ZHENGJHM not like", value, "zhengjhm");
            return (Criteria) this;
        }

        public Criteria andZhengjhmIn(List<String> values) {
            addCriterion("ZHENGJHM in", values, "zhengjhm");
            return (Criteria) this;
        }

        public Criteria andZhengjhmNotIn(List<String> values) {
            addCriterion("ZHENGJHM not in", values, "zhengjhm");
            return (Criteria) this;
        }

        public Criteria andZhengjhmBetween(String value1, String value2) {
            addCriterion("ZHENGJHM between", value1, value2, "zhengjhm");
            return (Criteria) this;
        }

        public Criteria andZhengjhmNotBetween(String value1, String value2) {
            addCriterion("ZHENGJHM not between", value1, value2, "zhengjhm");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqzIsNull() {
            addCriterion("ZHENGJYXQZ is null");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqzIsNotNull() {
            addCriterion("ZHENGJYXQZ is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqzEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ =", value, "zhengjyxqz");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqzNotEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ <>", value, "zhengjyxqz");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqzGreaterThan(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ >", value, "zhengjyxqz");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqzGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ >=", value, "zhengjyxqz");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqzLessThan(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ <", value, "zhengjyxqz");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqzLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ <=", value, "zhengjyxqz");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqzIn(List<Date> values) {
            addCriterionForJDBCDate("ZHENGJYXQZ in", values, "zhengjyxqz");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqzNotIn(List<Date> values) {
            addCriterionForJDBCDate("ZHENGJYXQZ not in", values, "zhengjyxqz");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqzBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHENGJYXQZ between", value1, value2, "zhengjyxqz");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqzNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHENGJYXQZ not between", value1, value2, "zhengjyxqz");
            return (Criteria) this;
        }

        public Criteria andZhangqIsNull() {
            addCriterion("ZHANGQ is null");
            return (Criteria) this;
        }

        public Criteria andZhangqIsNotNull() {
            addCriterion("ZHANGQ is not null");
            return (Criteria) this;
        }

        public Criteria andZhangqEqualTo(String value) {
            addCriterion("ZHANGQ =", value, "zhangq");
            return (Criteria) this;
        }

        public Criteria andZhangqNotEqualTo(String value) {
            addCriterion("ZHANGQ <>", value, "zhangq");
            return (Criteria) this;
        }

        public Criteria andZhangqGreaterThan(String value) {
            addCriterion("ZHANGQ >", value, "zhangq");
            return (Criteria) this;
        }

        public Criteria andZhangqGreaterThanOrEqualTo(String value) {
            addCriterion("ZHANGQ >=", value, "zhangq");
            return (Criteria) this;
        }

        public Criteria andZhangqLessThan(String value) {
            addCriterion("ZHANGQ <", value, "zhangq");
            return (Criteria) this;
        }

        public Criteria andZhangqLessThanOrEqualTo(String value) {
            addCriterion("ZHANGQ <=", value, "zhangq");
            return (Criteria) this;
        }

        public Criteria andZhangqLike(String value) {
            addCriterion("ZHANGQ like", value, "zhangq");
            return (Criteria) this;
        }

        public Criteria andZhangqNotLike(String value) {
            addCriterion("ZHANGQ not like", value, "zhangq");
            return (Criteria) this;
        }

        public Criteria andZhangqIn(List<String> values) {
            addCriterion("ZHANGQ in", values, "zhangq");
            return (Criteria) this;
        }

        public Criteria andZhangqNotIn(List<String> values) {
            addCriterion("ZHANGQ not in", values, "zhangq");
            return (Criteria) this;
        }

        public Criteria andZhangqBetween(String value1, String value2) {
            addCriterion("ZHANGQ between", value1, value2, "zhangq");
            return (Criteria) this;
        }

        public Criteria andZhangqNotBetween(String value1, String value2) {
            addCriterion("ZHANGQ not between", value1, value2, "zhangq");
            return (Criteria) this;
        }

        public Criteria andCaiwfzrIsNull() {
            addCriterion("CAIWFZR is null");
            return (Criteria) this;
        }

        public Criteria andCaiwfzrIsNotNull() {
            addCriterion("CAIWFZR is not null");
            return (Criteria) this;
        }

        public Criteria andCaiwfzrEqualTo(String value) {
            addCriterion("CAIWFZR =", value, "caiwfzr");
            return (Criteria) this;
        }

        public Criteria andCaiwfzrNotEqualTo(String value) {
            addCriterion("CAIWFZR <>", value, "caiwfzr");
            return (Criteria) this;
        }

        public Criteria andCaiwfzrGreaterThan(String value) {
            addCriterion("CAIWFZR >", value, "caiwfzr");
            return (Criteria) this;
        }

        public Criteria andCaiwfzrGreaterThanOrEqualTo(String value) {
            addCriterion("CAIWFZR >=", value, "caiwfzr");
            return (Criteria) this;
        }

        public Criteria andCaiwfzrLessThan(String value) {
            addCriterion("CAIWFZR <", value, "caiwfzr");
            return (Criteria) this;
        }

        public Criteria andCaiwfzrLessThanOrEqualTo(String value) {
            addCriterion("CAIWFZR <=", value, "caiwfzr");
            return (Criteria) this;
        }

        public Criteria andCaiwfzrLike(String value) {
            addCriterion("CAIWFZR like", value, "caiwfzr");
            return (Criteria) this;
        }

        public Criteria andCaiwfzrNotLike(String value) {
            addCriterion("CAIWFZR not like", value, "caiwfzr");
            return (Criteria) this;
        }

        public Criteria andCaiwfzrIn(List<String> values) {
            addCriterion("CAIWFZR in", values, "caiwfzr");
            return (Criteria) this;
        }

        public Criteria andCaiwfzrNotIn(List<String> values) {
            addCriterion("CAIWFZR not in", values, "caiwfzr");
            return (Criteria) this;
        }

        public Criteria andCaiwfzrBetween(String value1, String value2) {
            addCriterion("CAIWFZR between", value1, value2, "caiwfzr");
            return (Criteria) this;
        }

        public Criteria andCaiwfzrNotBetween(String value1, String value2) {
            addCriterion("CAIWFZR not between", value1, value2, "caiwfzr");
            return (Criteria) this;
        }

        public Criteria andXingm1IsNull() {
            addCriterion("XINGM1 is null");
            return (Criteria) this;
        }

        public Criteria andXingm1IsNotNull() {
            addCriterion("XINGM1 is not null");
            return (Criteria) this;
        }

        public Criteria andXingm1EqualTo(String value) {
            addCriterion("XINGM1 =", value, "xingm1");
            return (Criteria) this;
        }

        public Criteria andXingm1NotEqualTo(String value) {
            addCriterion("XINGM1 <>", value, "xingm1");
            return (Criteria) this;
        }

        public Criteria andXingm1GreaterThan(String value) {
            addCriterion("XINGM1 >", value, "xingm1");
            return (Criteria) this;
        }

        public Criteria andXingm1GreaterThanOrEqualTo(String value) {
            addCriterion("XINGM1 >=", value, "xingm1");
            return (Criteria) this;
        }

        public Criteria andXingm1LessThan(String value) {
            addCriterion("XINGM1 <", value, "xingm1");
            return (Criteria) this;
        }

        public Criteria andXingm1LessThanOrEqualTo(String value) {
            addCriterion("XINGM1 <=", value, "xingm1");
            return (Criteria) this;
        }

        public Criteria andXingm1Like(String value) {
            addCriterion("XINGM1 like", value, "xingm1");
            return (Criteria) this;
        }

        public Criteria andXingm1NotLike(String value) {
            addCriterion("XINGM1 not like", value, "xingm1");
            return (Criteria) this;
        }

        public Criteria andXingm1In(List<String> values) {
            addCriterion("XINGM1 in", values, "xingm1");
            return (Criteria) this;
        }

        public Criteria andXingm1NotIn(List<String> values) {
            addCriterion("XINGM1 not in", values, "xingm1");
            return (Criteria) this;
        }

        public Criteria andXingm1Between(String value1, String value2) {
            addCriterion("XINGM1 between", value1, value2, "xingm1");
            return (Criteria) this;
        }

        public Criteria andXingm1NotBetween(String value1, String value2) {
            addCriterion("XINGM1 not between", value1, value2, "xingm1");
            return (Criteria) this;
        }

        public Criteria andDianh1IsNull() {
            addCriterion("DIANH1 is null");
            return (Criteria) this;
        }

        public Criteria andDianh1IsNotNull() {
            addCriterion("DIANH1 is not null");
            return (Criteria) this;
        }

        public Criteria andDianh1EqualTo(String value) {
            addCriterion("DIANH1 =", value, "dianh1");
            return (Criteria) this;
        }

        public Criteria andDianh1NotEqualTo(String value) {
            addCriterion("DIANH1 <>", value, "dianh1");
            return (Criteria) this;
        }

        public Criteria andDianh1GreaterThan(String value) {
            addCriterion("DIANH1 >", value, "dianh1");
            return (Criteria) this;
        }

        public Criteria andDianh1GreaterThanOrEqualTo(String value) {
            addCriterion("DIANH1 >=", value, "dianh1");
            return (Criteria) this;
        }

        public Criteria andDianh1LessThan(String value) {
            addCriterion("DIANH1 <", value, "dianh1");
            return (Criteria) this;
        }

        public Criteria andDianh1LessThanOrEqualTo(String value) {
            addCriterion("DIANH1 <=", value, "dianh1");
            return (Criteria) this;
        }

        public Criteria andDianh1Like(String value) {
            addCriterion("DIANH1 like", value, "dianh1");
            return (Criteria) this;
        }

        public Criteria andDianh1NotLike(String value) {
            addCriterion("DIANH1 not like", value, "dianh1");
            return (Criteria) this;
        }

        public Criteria andDianh1In(List<String> values) {
            addCriterion("DIANH1 in", values, "dianh1");
            return (Criteria) this;
        }

        public Criteria andDianh1NotIn(List<String> values) {
            addCriterion("DIANH1 not in", values, "dianh1");
            return (Criteria) this;
        }

        public Criteria andDianh1Between(String value1, String value2) {
            addCriterion("DIANH1 between", value1, value2, "dianh1");
            return (Criteria) this;
        }

        public Criteria andDianh1NotBetween(String value1, String value2) {
            addCriterion("DIANH1 not between", value1, value2, "dianh1");
            return (Criteria) this;
        }

        public Criteria andZhengjzl1IsNull() {
            addCriterion("ZHENGJZL1 is null");
            return (Criteria) this;
        }

        public Criteria andZhengjzl1IsNotNull() {
            addCriterion("ZHENGJZL1 is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjzl1EqualTo(Object value) {
            addCriterion("ZHENGJZL1 =", value, "zhengjzl1");
            return (Criteria) this;
        }

        public Criteria andZhengjzl1NotEqualTo(Object value) {
            addCriterion("ZHENGJZL1 <>", value, "zhengjzl1");
            return (Criteria) this;
        }

        public Criteria andZhengjzl1GreaterThan(Object value) {
            addCriterion("ZHENGJZL1 >", value, "zhengjzl1");
            return (Criteria) this;
        }

        public Criteria andZhengjzl1GreaterThanOrEqualTo(Object value) {
            addCriterion("ZHENGJZL1 >=", value, "zhengjzl1");
            return (Criteria) this;
        }

        public Criteria andZhengjzl1LessThan(Object value) {
            addCriterion("ZHENGJZL1 <", value, "zhengjzl1");
            return (Criteria) this;
        }

        public Criteria andZhengjzl1LessThanOrEqualTo(Object value) {
            addCriterion("ZHENGJZL1 <=", value, "zhengjzl1");
            return (Criteria) this;
        }

        public Criteria andZhengjzl1In(List<Object> values) {
            addCriterion("ZHENGJZL1 in", values, "zhengjzl1");
            return (Criteria) this;
        }

        public Criteria andZhengjzl1NotIn(List<Object> values) {
            addCriterion("ZHENGJZL1 not in", values, "zhengjzl1");
            return (Criteria) this;
        }

        public Criteria andZhengjzl1Between(Object value1, Object value2) {
            addCriterion("ZHENGJZL1 between", value1, value2, "zhengjzl1");
            return (Criteria) this;
        }

        public Criteria andZhengjzl1NotBetween(Object value1, Object value2) {
            addCriterion("ZHENGJZL1 not between", value1, value2, "zhengjzl1");
            return (Criteria) this;
        }

        public Criteria andZhengjhm1IsNull() {
            addCriterion("ZHENGJHM1 is null");
            return (Criteria) this;
        }

        public Criteria andZhengjhm1IsNotNull() {
            addCriterion("ZHENGJHM1 is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjhm1EqualTo(String value) {
            addCriterion("ZHENGJHM1 =", value, "zhengjhm1");
            return (Criteria) this;
        }

        public Criteria andZhengjhm1NotEqualTo(String value) {
            addCriterion("ZHENGJHM1 <>", value, "zhengjhm1");
            return (Criteria) this;
        }

        public Criteria andZhengjhm1GreaterThan(String value) {
            addCriterion("ZHENGJHM1 >", value, "zhengjhm1");
            return (Criteria) this;
        }

        public Criteria andZhengjhm1GreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGJHM1 >=", value, "zhengjhm1");
            return (Criteria) this;
        }

        public Criteria andZhengjhm1LessThan(String value) {
            addCriterion("ZHENGJHM1 <", value, "zhengjhm1");
            return (Criteria) this;
        }

        public Criteria andZhengjhm1LessThanOrEqualTo(String value) {
            addCriterion("ZHENGJHM1 <=", value, "zhengjhm1");
            return (Criteria) this;
        }

        public Criteria andZhengjhm1Like(String value) {
            addCriterion("ZHENGJHM1 like", value, "zhengjhm1");
            return (Criteria) this;
        }

        public Criteria andZhengjhm1NotLike(String value) {
            addCriterion("ZHENGJHM1 not like", value, "zhengjhm1");
            return (Criteria) this;
        }

        public Criteria andZhengjhm1In(List<String> values) {
            addCriterion("ZHENGJHM1 in", values, "zhengjhm1");
            return (Criteria) this;
        }

        public Criteria andZhengjhm1NotIn(List<String> values) {
            addCriterion("ZHENGJHM1 not in", values, "zhengjhm1");
            return (Criteria) this;
        }

        public Criteria andZhengjhm1Between(String value1, String value2) {
            addCriterion("ZHENGJHM1 between", value1, value2, "zhengjhm1");
            return (Criteria) this;
        }

        public Criteria andZhengjhm1NotBetween(String value1, String value2) {
            addCriterion("ZHENGJHM1 not between", value1, value2, "zhengjhm1");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz1IsNull() {
            addCriterion("ZHENGJYXQZ1 is null");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz1IsNotNull() {
            addCriterion("ZHENGJYXQZ1 is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz1EqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ1 =", value, "zhengjyxqz1");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz1NotEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ1 <>", value, "zhengjyxqz1");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz1GreaterThan(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ1 >", value, "zhengjyxqz1");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ1 >=", value, "zhengjyxqz1");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz1LessThan(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ1 <", value, "zhengjyxqz1");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ1 <=", value, "zhengjyxqz1");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz1In(List<Date> values) {
            addCriterionForJDBCDate("ZHENGJYXQZ1 in", values, "zhengjyxqz1");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz1NotIn(List<Date> values) {
            addCriterionForJDBCDate("ZHENGJYXQZ1 not in", values, "zhengjyxqz1");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz1Between(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHENGJYXQZ1 between", value1, value2, "zhengjyxqz1");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHENGJYXQZ1 not between", value1, value2, "zhengjyxqz1");
            return (Criteria) this;
        }

        public Criteria andZhangq1IsNull() {
            addCriterion("ZHANGQ1 is null");
            return (Criteria) this;
        }

        public Criteria andZhangq1IsNotNull() {
            addCriterion("ZHANGQ1 is not null");
            return (Criteria) this;
        }

        public Criteria andZhangq1EqualTo(String value) {
            addCriterion("ZHANGQ1 =", value, "zhangq1");
            return (Criteria) this;
        }

        public Criteria andZhangq1NotEqualTo(String value) {
            addCriterion("ZHANGQ1 <>", value, "zhangq1");
            return (Criteria) this;
        }

        public Criteria andZhangq1GreaterThan(String value) {
            addCriterion("ZHANGQ1 >", value, "zhangq1");
            return (Criteria) this;
        }

        public Criteria andZhangq1GreaterThanOrEqualTo(String value) {
            addCriterion("ZHANGQ1 >=", value, "zhangq1");
            return (Criteria) this;
        }

        public Criteria andZhangq1LessThan(String value) {
            addCriterion("ZHANGQ1 <", value, "zhangq1");
            return (Criteria) this;
        }

        public Criteria andZhangq1LessThanOrEqualTo(String value) {
            addCriterion("ZHANGQ1 <=", value, "zhangq1");
            return (Criteria) this;
        }

        public Criteria andZhangq1Like(String value) {
            addCriterion("ZHANGQ1 like", value, "zhangq1");
            return (Criteria) this;
        }

        public Criteria andZhangq1NotLike(String value) {
            addCriterion("ZHANGQ1 not like", value, "zhangq1");
            return (Criteria) this;
        }

        public Criteria andZhangq1In(List<String> values) {
            addCriterion("ZHANGQ1 in", values, "zhangq1");
            return (Criteria) this;
        }

        public Criteria andZhangq1NotIn(List<String> values) {
            addCriterion("ZHANGQ1 not in", values, "zhangq1");
            return (Criteria) this;
        }

        public Criteria andZhangq1Between(String value1, String value2) {
            addCriterion("ZHANGQ1 between", value1, value2, "zhangq1");
            return (Criteria) this;
        }

        public Criteria andZhangq1NotBetween(String value1, String value2) {
            addCriterion("ZHANGQ1 not between", value1, value2, "zhangq1");
            return (Criteria) this;
        }

        public Criteria andShouqjbrIsNull() {
            addCriterion("SHOUQJBR is null");
            return (Criteria) this;
        }

        public Criteria andShouqjbrIsNotNull() {
            addCriterion("SHOUQJBR is not null");
            return (Criteria) this;
        }

        public Criteria andShouqjbrEqualTo(String value) {
            addCriterion("SHOUQJBR =", value, "shouqjbr");
            return (Criteria) this;
        }

        public Criteria andShouqjbrNotEqualTo(String value) {
            addCriterion("SHOUQJBR <>", value, "shouqjbr");
            return (Criteria) this;
        }

        public Criteria andShouqjbrGreaterThan(String value) {
            addCriterion("SHOUQJBR >", value, "shouqjbr");
            return (Criteria) this;
        }

        public Criteria andShouqjbrGreaterThanOrEqualTo(String value) {
            addCriterion("SHOUQJBR >=", value, "shouqjbr");
            return (Criteria) this;
        }

        public Criteria andShouqjbrLessThan(String value) {
            addCriterion("SHOUQJBR <", value, "shouqjbr");
            return (Criteria) this;
        }

        public Criteria andShouqjbrLessThanOrEqualTo(String value) {
            addCriterion("SHOUQJBR <=", value, "shouqjbr");
            return (Criteria) this;
        }

        public Criteria andShouqjbrLike(String value) {
            addCriterion("SHOUQJBR like", value, "shouqjbr");
            return (Criteria) this;
        }

        public Criteria andShouqjbrNotLike(String value) {
            addCriterion("SHOUQJBR not like", value, "shouqjbr");
            return (Criteria) this;
        }

        public Criteria andShouqjbrIn(List<String> values) {
            addCriterion("SHOUQJBR in", values, "shouqjbr");
            return (Criteria) this;
        }

        public Criteria andShouqjbrNotIn(List<String> values) {
            addCriterion("SHOUQJBR not in", values, "shouqjbr");
            return (Criteria) this;
        }

        public Criteria andShouqjbrBetween(String value1, String value2) {
            addCriterion("SHOUQJBR between", value1, value2, "shouqjbr");
            return (Criteria) this;
        }

        public Criteria andShouqjbrNotBetween(String value1, String value2) {
            addCriterion("SHOUQJBR not between", value1, value2, "shouqjbr");
            return (Criteria) this;
        }

        public Criteria andXingm2IsNull() {
            addCriterion("XINGM2 is null");
            return (Criteria) this;
        }

        public Criteria andXingm2IsNotNull() {
            addCriterion("XINGM2 is not null");
            return (Criteria) this;
        }

        public Criteria andXingm2EqualTo(String value) {
            addCriterion("XINGM2 =", value, "xingm2");
            return (Criteria) this;
        }

        public Criteria andXingm2NotEqualTo(String value) {
            addCriterion("XINGM2 <>", value, "xingm2");
            return (Criteria) this;
        }

        public Criteria andXingm2GreaterThan(String value) {
            addCriterion("XINGM2 >", value, "xingm2");
            return (Criteria) this;
        }

        public Criteria andXingm2GreaterThanOrEqualTo(String value) {
            addCriterion("XINGM2 >=", value, "xingm2");
            return (Criteria) this;
        }

        public Criteria andXingm2LessThan(String value) {
            addCriterion("XINGM2 <", value, "xingm2");
            return (Criteria) this;
        }

        public Criteria andXingm2LessThanOrEqualTo(String value) {
            addCriterion("XINGM2 <=", value, "xingm2");
            return (Criteria) this;
        }

        public Criteria andXingm2Like(String value) {
            addCriterion("XINGM2 like", value, "xingm2");
            return (Criteria) this;
        }

        public Criteria andXingm2NotLike(String value) {
            addCriterion("XINGM2 not like", value, "xingm2");
            return (Criteria) this;
        }

        public Criteria andXingm2In(List<String> values) {
            addCriterion("XINGM2 in", values, "xingm2");
            return (Criteria) this;
        }

        public Criteria andXingm2NotIn(List<String> values) {
            addCriterion("XINGM2 not in", values, "xingm2");
            return (Criteria) this;
        }

        public Criteria andXingm2Between(String value1, String value2) {
            addCriterion("XINGM2 between", value1, value2, "xingm2");
            return (Criteria) this;
        }

        public Criteria andXingm2NotBetween(String value1, String value2) {
            addCriterion("XINGM2 not between", value1, value2, "xingm2");
            return (Criteria) this;
        }

        public Criteria andDianh2IsNull() {
            addCriterion("DIANH2 is null");
            return (Criteria) this;
        }

        public Criteria andDianh2IsNotNull() {
            addCriterion("DIANH2 is not null");
            return (Criteria) this;
        }

        public Criteria andDianh2EqualTo(String value) {
            addCriterion("DIANH2 =", value, "dianh2");
            return (Criteria) this;
        }

        public Criteria andDianh2NotEqualTo(String value) {
            addCriterion("DIANH2 <>", value, "dianh2");
            return (Criteria) this;
        }

        public Criteria andDianh2GreaterThan(String value) {
            addCriterion("DIANH2 >", value, "dianh2");
            return (Criteria) this;
        }

        public Criteria andDianh2GreaterThanOrEqualTo(String value) {
            addCriterion("DIANH2 >=", value, "dianh2");
            return (Criteria) this;
        }

        public Criteria andDianh2LessThan(String value) {
            addCriterion("DIANH2 <", value, "dianh2");
            return (Criteria) this;
        }

        public Criteria andDianh2LessThanOrEqualTo(String value) {
            addCriterion("DIANH2 <=", value, "dianh2");
            return (Criteria) this;
        }

        public Criteria andDianh2Like(String value) {
            addCriterion("DIANH2 like", value, "dianh2");
            return (Criteria) this;
        }

        public Criteria andDianh2NotLike(String value) {
            addCriterion("DIANH2 not like", value, "dianh2");
            return (Criteria) this;
        }

        public Criteria andDianh2In(List<String> values) {
            addCriterion("DIANH2 in", values, "dianh2");
            return (Criteria) this;
        }

        public Criteria andDianh2NotIn(List<String> values) {
            addCriterion("DIANH2 not in", values, "dianh2");
            return (Criteria) this;
        }

        public Criteria andDianh2Between(String value1, String value2) {
            addCriterion("DIANH2 between", value1, value2, "dianh2");
            return (Criteria) this;
        }

        public Criteria andDianh2NotBetween(String value1, String value2) {
            addCriterion("DIANH2 not between", value1, value2, "dianh2");
            return (Criteria) this;
        }

        public Criteria andZhengjzl2IsNull() {
            addCriterion("ZHENGJZL2 is null");
            return (Criteria) this;
        }

        public Criteria andZhengjzl2IsNotNull() {
            addCriterion("ZHENGJZL2 is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjzl2EqualTo(Object value) {
            addCriterion("ZHENGJZL2 =", value, "zhengjzl2");
            return (Criteria) this;
        }

        public Criteria andZhengjzl2NotEqualTo(Object value) {
            addCriterion("ZHENGJZL2 <>", value, "zhengjzl2");
            return (Criteria) this;
        }

        public Criteria andZhengjzl2GreaterThan(Object value) {
            addCriterion("ZHENGJZL2 >", value, "zhengjzl2");
            return (Criteria) this;
        }

        public Criteria andZhengjzl2GreaterThanOrEqualTo(Object value) {
            addCriterion("ZHENGJZL2 >=", value, "zhengjzl2");
            return (Criteria) this;
        }

        public Criteria andZhengjzl2LessThan(Object value) {
            addCriterion("ZHENGJZL2 <", value, "zhengjzl2");
            return (Criteria) this;
        }

        public Criteria andZhengjzl2LessThanOrEqualTo(Object value) {
            addCriterion("ZHENGJZL2 <=", value, "zhengjzl2");
            return (Criteria) this;
        }

        public Criteria andZhengjzl2In(List<Object> values) {
            addCriterion("ZHENGJZL2 in", values, "zhengjzl2");
            return (Criteria) this;
        }

        public Criteria andZhengjzl2NotIn(List<Object> values) {
            addCriterion("ZHENGJZL2 not in", values, "zhengjzl2");
            return (Criteria) this;
        }

        public Criteria andZhengjzl2Between(Object value1, Object value2) {
            addCriterion("ZHENGJZL2 between", value1, value2, "zhengjzl2");
            return (Criteria) this;
        }

        public Criteria andZhengjzl2NotBetween(Object value1, Object value2) {
            addCriterion("ZHENGJZL2 not between", value1, value2, "zhengjzl2");
            return (Criteria) this;
        }

        public Criteria andZhengjhm2IsNull() {
            addCriterion("ZHENGJHM2 is null");
            return (Criteria) this;
        }

        public Criteria andZhengjhm2IsNotNull() {
            addCriterion("ZHENGJHM2 is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjhm2EqualTo(String value) {
            addCriterion("ZHENGJHM2 =", value, "zhengjhm2");
            return (Criteria) this;
        }

        public Criteria andZhengjhm2NotEqualTo(String value) {
            addCriterion("ZHENGJHM2 <>", value, "zhengjhm2");
            return (Criteria) this;
        }

        public Criteria andZhengjhm2GreaterThan(String value) {
            addCriterion("ZHENGJHM2 >", value, "zhengjhm2");
            return (Criteria) this;
        }

        public Criteria andZhengjhm2GreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGJHM2 >=", value, "zhengjhm2");
            return (Criteria) this;
        }

        public Criteria andZhengjhm2LessThan(String value) {
            addCriterion("ZHENGJHM2 <", value, "zhengjhm2");
            return (Criteria) this;
        }

        public Criteria andZhengjhm2LessThanOrEqualTo(String value) {
            addCriterion("ZHENGJHM2 <=", value, "zhengjhm2");
            return (Criteria) this;
        }

        public Criteria andZhengjhm2Like(String value) {
            addCriterion("ZHENGJHM2 like", value, "zhengjhm2");
            return (Criteria) this;
        }

        public Criteria andZhengjhm2NotLike(String value) {
            addCriterion("ZHENGJHM2 not like", value, "zhengjhm2");
            return (Criteria) this;
        }

        public Criteria andZhengjhm2In(List<String> values) {
            addCriterion("ZHENGJHM2 in", values, "zhengjhm2");
            return (Criteria) this;
        }

        public Criteria andZhengjhm2NotIn(List<String> values) {
            addCriterion("ZHENGJHM2 not in", values, "zhengjhm2");
            return (Criteria) this;
        }

        public Criteria andZhengjhm2Between(String value1, String value2) {
            addCriterion("ZHENGJHM2 between", value1, value2, "zhengjhm2");
            return (Criteria) this;
        }

        public Criteria andZhengjhm2NotBetween(String value1, String value2) {
            addCriterion("ZHENGJHM2 not between", value1, value2, "zhengjhm2");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz2IsNull() {
            addCriterion("ZHENGJYXQZ2 is null");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz2IsNotNull() {
            addCriterion("ZHENGJYXQZ2 is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz2EqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ2 =", value, "zhengjyxqz2");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz2NotEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ2 <>", value, "zhengjyxqz2");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz2GreaterThan(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ2 >", value, "zhengjyxqz2");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ2 >=", value, "zhengjyxqz2");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz2LessThan(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ2 <", value, "zhengjyxqz2");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ2 <=", value, "zhengjyxqz2");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz2In(List<Date> values) {
            addCriterionForJDBCDate("ZHENGJYXQZ2 in", values, "zhengjyxqz2");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz2NotIn(List<Date> values) {
            addCriterionForJDBCDate("ZHENGJYXQZ2 not in", values, "zhengjyxqz2");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHENGJYXQZ2 between", value1, value2, "zhengjyxqz2");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHENGJYXQZ2 not between", value1, value2, "zhengjyxqz2");
            return (Criteria) this;
        }

        public Criteria andZhangq2IsNull() {
            addCriterion("ZHANGQ2 is null");
            return (Criteria) this;
        }

        public Criteria andZhangq2IsNotNull() {
            addCriterion("ZHANGQ2 is not null");
            return (Criteria) this;
        }

        public Criteria andZhangq2EqualTo(String value) {
            addCriterion("ZHANGQ2 =", value, "zhangq2");
            return (Criteria) this;
        }

        public Criteria andZhangq2NotEqualTo(String value) {
            addCriterion("ZHANGQ2 <>", value, "zhangq2");
            return (Criteria) this;
        }

        public Criteria andZhangq2GreaterThan(String value) {
            addCriterion("ZHANGQ2 >", value, "zhangq2");
            return (Criteria) this;
        }

        public Criteria andZhangq2GreaterThanOrEqualTo(String value) {
            addCriterion("ZHANGQ2 >=", value, "zhangq2");
            return (Criteria) this;
        }

        public Criteria andZhangq2LessThan(String value) {
            addCriterion("ZHANGQ2 <", value, "zhangq2");
            return (Criteria) this;
        }

        public Criteria andZhangq2LessThanOrEqualTo(String value) {
            addCriterion("ZHANGQ2 <=", value, "zhangq2");
            return (Criteria) this;
        }

        public Criteria andZhangq2Like(String value) {
            addCriterion("ZHANGQ2 like", value, "zhangq2");
            return (Criteria) this;
        }

        public Criteria andZhangq2NotLike(String value) {
            addCriterion("ZHANGQ2 not like", value, "zhangq2");
            return (Criteria) this;
        }

        public Criteria andZhangq2In(List<String> values) {
            addCriterion("ZHANGQ2 in", values, "zhangq2");
            return (Criteria) this;
        }

        public Criteria andZhangq2NotIn(List<String> values) {
            addCriterion("ZHANGQ2 not in", values, "zhangq2");
            return (Criteria) this;
        }

        public Criteria andZhangq2Between(String value1, String value2) {
            addCriterion("ZHANGQ2 between", value1, value2, "zhangq2");
            return (Criteria) this;
        }

        public Criteria andZhangq2NotBetween(String value1, String value2) {
            addCriterion("ZHANGQ2 not between", value1, value2, "zhangq2");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzrIsNull() {
            addCriterion("KONGGGDHSJKZR is null");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzrIsNotNull() {
            addCriterion("KONGGGDHSJKZR is not null");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzrEqualTo(String value) {
            addCriterion("KONGGGDHSJKZR =", value, "kongggdhsjkzr");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzrNotEqualTo(String value) {
            addCriterion("KONGGGDHSJKZR <>", value, "kongggdhsjkzr");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzrGreaterThan(String value) {
            addCriterion("KONGGGDHSJKZR >", value, "kongggdhsjkzr");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzrGreaterThanOrEqualTo(String value) {
            addCriterion("KONGGGDHSJKZR >=", value, "kongggdhsjkzr");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzrLessThan(String value) {
            addCriterion("KONGGGDHSJKZR <", value, "kongggdhsjkzr");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzrLessThanOrEqualTo(String value) {
            addCriterion("KONGGGDHSJKZR <=", value, "kongggdhsjkzr");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzrLike(String value) {
            addCriterion("KONGGGDHSJKZR like", value, "kongggdhsjkzr");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzrNotLike(String value) {
            addCriterion("KONGGGDHSJKZR not like", value, "kongggdhsjkzr");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzrIn(List<String> values) {
            addCriterion("KONGGGDHSJKZR in", values, "kongggdhsjkzr");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzrNotIn(List<String> values) {
            addCriterion("KONGGGDHSJKZR not in", values, "kongggdhsjkzr");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzrBetween(String value1, String value2) {
            addCriterion("KONGGGDHSJKZR between", value1, value2, "kongggdhsjkzr");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzrNotBetween(String value1, String value2) {
            addCriterion("KONGGGDHSJKZR not between", value1, value2, "kongggdhsjkzr");
            return (Criteria) this;
        }

        public Criteria andXingm3IsNull() {
            addCriterion("XINGM3 is null");
            return (Criteria) this;
        }

        public Criteria andXingm3IsNotNull() {
            addCriterion("XINGM3 is not null");
            return (Criteria) this;
        }

        public Criteria andXingm3EqualTo(String value) {
            addCriterion("XINGM3 =", value, "xingm3");
            return (Criteria) this;
        }

        public Criteria andXingm3NotEqualTo(String value) {
            addCriterion("XINGM3 <>", value, "xingm3");
            return (Criteria) this;
        }

        public Criteria andXingm3GreaterThan(String value) {
            addCriterion("XINGM3 >", value, "xingm3");
            return (Criteria) this;
        }

        public Criteria andXingm3GreaterThanOrEqualTo(String value) {
            addCriterion("XINGM3 >=", value, "xingm3");
            return (Criteria) this;
        }

        public Criteria andXingm3LessThan(String value) {
            addCriterion("XINGM3 <", value, "xingm3");
            return (Criteria) this;
        }

        public Criteria andXingm3LessThanOrEqualTo(String value) {
            addCriterion("XINGM3 <=", value, "xingm3");
            return (Criteria) this;
        }

        public Criteria andXingm3Like(String value) {
            addCriterion("XINGM3 like", value, "xingm3");
            return (Criteria) this;
        }

        public Criteria andXingm3NotLike(String value) {
            addCriterion("XINGM3 not like", value, "xingm3");
            return (Criteria) this;
        }

        public Criteria andXingm3In(List<String> values) {
            addCriterion("XINGM3 in", values, "xingm3");
            return (Criteria) this;
        }

        public Criteria andXingm3NotIn(List<String> values) {
            addCriterion("XINGM3 not in", values, "xingm3");
            return (Criteria) this;
        }

        public Criteria andXingm3Between(String value1, String value2) {
            addCriterion("XINGM3 between", value1, value2, "xingm3");
            return (Criteria) this;
        }

        public Criteria andXingm3NotBetween(String value1, String value2) {
            addCriterion("XINGM3 not between", value1, value2, "xingm3");
            return (Criteria) this;
        }

        public Criteria andDianh3IsNull() {
            addCriterion("DIANH3 is null");
            return (Criteria) this;
        }

        public Criteria andDianh3IsNotNull() {
            addCriterion("DIANH3 is not null");
            return (Criteria) this;
        }

        public Criteria andDianh3EqualTo(String value) {
            addCriterion("DIANH3 =", value, "dianh3");
            return (Criteria) this;
        }

        public Criteria andDianh3NotEqualTo(String value) {
            addCriterion("DIANH3 <>", value, "dianh3");
            return (Criteria) this;
        }

        public Criteria andDianh3GreaterThan(String value) {
            addCriterion("DIANH3 >", value, "dianh3");
            return (Criteria) this;
        }

        public Criteria andDianh3GreaterThanOrEqualTo(String value) {
            addCriterion("DIANH3 >=", value, "dianh3");
            return (Criteria) this;
        }

        public Criteria andDianh3LessThan(String value) {
            addCriterion("DIANH3 <", value, "dianh3");
            return (Criteria) this;
        }

        public Criteria andDianh3LessThanOrEqualTo(String value) {
            addCriterion("DIANH3 <=", value, "dianh3");
            return (Criteria) this;
        }

        public Criteria andDianh3Like(String value) {
            addCriterion("DIANH3 like", value, "dianh3");
            return (Criteria) this;
        }

        public Criteria andDianh3NotLike(String value) {
            addCriterion("DIANH3 not like", value, "dianh3");
            return (Criteria) this;
        }

        public Criteria andDianh3In(List<String> values) {
            addCriterion("DIANH3 in", values, "dianh3");
            return (Criteria) this;
        }

        public Criteria andDianh3NotIn(List<String> values) {
            addCriterion("DIANH3 not in", values, "dianh3");
            return (Criteria) this;
        }

        public Criteria andDianh3Between(String value1, String value2) {
            addCriterion("DIANH3 between", value1, value2, "dianh3");
            return (Criteria) this;
        }

        public Criteria andDianh3NotBetween(String value1, String value2) {
            addCriterion("DIANH3 not between", value1, value2, "dianh3");
            return (Criteria) this;
        }

        public Criteria andZhengjzl3IsNull() {
            addCriterion("ZHENGJZL3 is null");
            return (Criteria) this;
        }

        public Criteria andZhengjzl3IsNotNull() {
            addCriterion("ZHENGJZL3 is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjzl3EqualTo(Object value) {
            addCriterion("ZHENGJZL3 =", value, "zhengjzl3");
            return (Criteria) this;
        }

        public Criteria andZhengjzl3NotEqualTo(Object value) {
            addCriterion("ZHENGJZL3 <>", value, "zhengjzl3");
            return (Criteria) this;
        }

        public Criteria andZhengjzl3GreaterThan(Object value) {
            addCriterion("ZHENGJZL3 >", value, "zhengjzl3");
            return (Criteria) this;
        }

        public Criteria andZhengjzl3GreaterThanOrEqualTo(Object value) {
            addCriterion("ZHENGJZL3 >=", value, "zhengjzl3");
            return (Criteria) this;
        }

        public Criteria andZhengjzl3LessThan(Object value) {
            addCriterion("ZHENGJZL3 <", value, "zhengjzl3");
            return (Criteria) this;
        }

        public Criteria andZhengjzl3LessThanOrEqualTo(Object value) {
            addCriterion("ZHENGJZL3 <=", value, "zhengjzl3");
            return (Criteria) this;
        }

        public Criteria andZhengjzl3In(List<Object> values) {
            addCriterion("ZHENGJZL3 in", values, "zhengjzl3");
            return (Criteria) this;
        }

        public Criteria andZhengjzl3NotIn(List<Object> values) {
            addCriterion("ZHENGJZL3 not in", values, "zhengjzl3");
            return (Criteria) this;
        }

        public Criteria andZhengjzl3Between(Object value1, Object value2) {
            addCriterion("ZHENGJZL3 between", value1, value2, "zhengjzl3");
            return (Criteria) this;
        }

        public Criteria andZhengjzl3NotBetween(Object value1, Object value2) {
            addCriterion("ZHENGJZL3 not between", value1, value2, "zhengjzl3");
            return (Criteria) this;
        }

        public Criteria andZhengjhm3IsNull() {
            addCriterion("ZHENGJHM3 is null");
            return (Criteria) this;
        }

        public Criteria andZhengjhm3IsNotNull() {
            addCriterion("ZHENGJHM3 is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjhm3EqualTo(String value) {
            addCriterion("ZHENGJHM3 =", value, "zhengjhm3");
            return (Criteria) this;
        }

        public Criteria andZhengjhm3NotEqualTo(String value) {
            addCriterion("ZHENGJHM3 <>", value, "zhengjhm3");
            return (Criteria) this;
        }

        public Criteria andZhengjhm3GreaterThan(String value) {
            addCriterion("ZHENGJHM3 >", value, "zhengjhm3");
            return (Criteria) this;
        }

        public Criteria andZhengjhm3GreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGJHM3 >=", value, "zhengjhm3");
            return (Criteria) this;
        }

        public Criteria andZhengjhm3LessThan(String value) {
            addCriterion("ZHENGJHM3 <", value, "zhengjhm3");
            return (Criteria) this;
        }

        public Criteria andZhengjhm3LessThanOrEqualTo(String value) {
            addCriterion("ZHENGJHM3 <=", value, "zhengjhm3");
            return (Criteria) this;
        }

        public Criteria andZhengjhm3Like(String value) {
            addCriterion("ZHENGJHM3 like", value, "zhengjhm3");
            return (Criteria) this;
        }

        public Criteria andZhengjhm3NotLike(String value) {
            addCriterion("ZHENGJHM3 not like", value, "zhengjhm3");
            return (Criteria) this;
        }

        public Criteria andZhengjhm3In(List<String> values) {
            addCriterion("ZHENGJHM3 in", values, "zhengjhm3");
            return (Criteria) this;
        }

        public Criteria andZhengjhm3NotIn(List<String> values) {
            addCriterion("ZHENGJHM3 not in", values, "zhengjhm3");
            return (Criteria) this;
        }

        public Criteria andZhengjhm3Between(String value1, String value2) {
            addCriterion("ZHENGJHM3 between", value1, value2, "zhengjhm3");
            return (Criteria) this;
        }

        public Criteria andZhengjhm3NotBetween(String value1, String value2) {
            addCriterion("ZHENGJHM3 not between", value1, value2, "zhengjhm3");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz3IsNull() {
            addCriterion("ZHENGJYXQZ3 is null");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz3IsNotNull() {
            addCriterion("ZHENGJYXQZ3 is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz3EqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ3 =", value, "zhengjyxqz3");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz3NotEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ3 <>", value, "zhengjyxqz3");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz3GreaterThan(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ3 >", value, "zhengjyxqz3");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz3GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ3 >=", value, "zhengjyxqz3");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz3LessThan(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ3 <", value, "zhengjyxqz3");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz3LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ3 <=", value, "zhengjyxqz3");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz3In(List<Date> values) {
            addCriterionForJDBCDate("ZHENGJYXQZ3 in", values, "zhengjyxqz3");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz3NotIn(List<Date> values) {
            addCriterionForJDBCDate("ZHENGJYXQZ3 not in", values, "zhengjyxqz3");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz3Between(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHENGJYXQZ3 between", value1, value2, "zhengjyxqz3");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz3NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHENGJYXQZ3 not between", value1, value2, "zhengjyxqz3");
            return (Criteria) this;
        }

        public Criteria andZhangq3IsNull() {
            addCriterion("ZHANGQ3 is null");
            return (Criteria) this;
        }

        public Criteria andZhangq3IsNotNull() {
            addCriterion("ZHANGQ3 is not null");
            return (Criteria) this;
        }

        public Criteria andZhangq3EqualTo(String value) {
            addCriterion("ZHANGQ3 =", value, "zhangq3");
            return (Criteria) this;
        }

        public Criteria andZhangq3NotEqualTo(String value) {
            addCriterion("ZHANGQ3 <>", value, "zhangq3");
            return (Criteria) this;
        }

        public Criteria andZhangq3GreaterThan(String value) {
            addCriterion("ZHANGQ3 >", value, "zhangq3");
            return (Criteria) this;
        }

        public Criteria andZhangq3GreaterThanOrEqualTo(String value) {
            addCriterion("ZHANGQ3 >=", value, "zhangq3");
            return (Criteria) this;
        }

        public Criteria andZhangq3LessThan(String value) {
            addCriterion("ZHANGQ3 <", value, "zhangq3");
            return (Criteria) this;
        }

        public Criteria andZhangq3LessThanOrEqualTo(String value) {
            addCriterion("ZHANGQ3 <=", value, "zhangq3");
            return (Criteria) this;
        }

        public Criteria andZhangq3Like(String value) {
            addCriterion("ZHANGQ3 like", value, "zhangq3");
            return (Criteria) this;
        }

        public Criteria andZhangq3NotLike(String value) {
            addCriterion("ZHANGQ3 not like", value, "zhangq3");
            return (Criteria) this;
        }

        public Criteria andZhangq3In(List<String> values) {
            addCriterion("ZHANGQ3 in", values, "zhangq3");
            return (Criteria) this;
        }

        public Criteria andZhangq3NotIn(List<String> values) {
            addCriterion("ZHANGQ3 not in", values, "zhangq3");
            return (Criteria) this;
        }

        public Criteria andZhangq3Between(String value1, String value2) {
            addCriterion("ZHANGQ3 between", value1, value2, "zhangq3");
            return (Criteria) this;
        }

        public Criteria andZhangq3NotBetween(String value1, String value2) {
            addCriterion("ZHANGQ3 not between", value1, value2, "zhangq3");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzr1IsNull() {
            addCriterion("KONGGGDHSJKZR1 is null");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzr1IsNotNull() {
            addCriterion("KONGGGDHSJKZR1 is not null");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzr1EqualTo(String value) {
            addCriterion("KONGGGDHSJKZR1 =", value, "kongggdhsjkzr1");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzr1NotEqualTo(String value) {
            addCriterion("KONGGGDHSJKZR1 <>", value, "kongggdhsjkzr1");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzr1GreaterThan(String value) {
            addCriterion("KONGGGDHSJKZR1 >", value, "kongggdhsjkzr1");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzr1GreaterThanOrEqualTo(String value) {
            addCriterion("KONGGGDHSJKZR1 >=", value, "kongggdhsjkzr1");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzr1LessThan(String value) {
            addCriterion("KONGGGDHSJKZR1 <", value, "kongggdhsjkzr1");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzr1LessThanOrEqualTo(String value) {
            addCriterion("KONGGGDHSJKZR1 <=", value, "kongggdhsjkzr1");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzr1Like(String value) {
            addCriterion("KONGGGDHSJKZR1 like", value, "kongggdhsjkzr1");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzr1NotLike(String value) {
            addCriterion("KONGGGDHSJKZR1 not like", value, "kongggdhsjkzr1");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzr1In(List<String> values) {
            addCriterion("KONGGGDHSJKZR1 in", values, "kongggdhsjkzr1");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzr1NotIn(List<String> values) {
            addCriterion("KONGGGDHSJKZR1 not in", values, "kongggdhsjkzr1");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzr1Between(String value1, String value2) {
            addCriterion("KONGGGDHSJKZR1 between", value1, value2, "kongggdhsjkzr1");
            return (Criteria) this;
        }

        public Criteria andKongggdhsjkzr1NotBetween(String value1, String value2) {
            addCriterion("KONGGGDHSJKZR1 not between", value1, value2, "kongggdhsjkzr1");
            return (Criteria) this;
        }

        public Criteria andXingm4IsNull() {
            addCriterion("XINGM4 is null");
            return (Criteria) this;
        }

        public Criteria andXingm4IsNotNull() {
            addCriterion("XINGM4 is not null");
            return (Criteria) this;
        }

        public Criteria andXingm4EqualTo(String value) {
            addCriterion("XINGM4 =", value, "xingm4");
            return (Criteria) this;
        }

        public Criteria andXingm4NotEqualTo(String value) {
            addCriterion("XINGM4 <>", value, "xingm4");
            return (Criteria) this;
        }

        public Criteria andXingm4GreaterThan(String value) {
            addCriterion("XINGM4 >", value, "xingm4");
            return (Criteria) this;
        }

        public Criteria andXingm4GreaterThanOrEqualTo(String value) {
            addCriterion("XINGM4 >=", value, "xingm4");
            return (Criteria) this;
        }

        public Criteria andXingm4LessThan(String value) {
            addCriterion("XINGM4 <", value, "xingm4");
            return (Criteria) this;
        }

        public Criteria andXingm4LessThanOrEqualTo(String value) {
            addCriterion("XINGM4 <=", value, "xingm4");
            return (Criteria) this;
        }

        public Criteria andXingm4Like(String value) {
            addCriterion("XINGM4 like", value, "xingm4");
            return (Criteria) this;
        }

        public Criteria andXingm4NotLike(String value) {
            addCriterion("XINGM4 not like", value, "xingm4");
            return (Criteria) this;
        }

        public Criteria andXingm4In(List<String> values) {
            addCriterion("XINGM4 in", values, "xingm4");
            return (Criteria) this;
        }

        public Criteria andXingm4NotIn(List<String> values) {
            addCriterion("XINGM4 not in", values, "xingm4");
            return (Criteria) this;
        }

        public Criteria andXingm4Between(String value1, String value2) {
            addCriterion("XINGM4 between", value1, value2, "xingm4");
            return (Criteria) this;
        }

        public Criteria andXingm4NotBetween(String value1, String value2) {
            addCriterion("XINGM4 not between", value1, value2, "xingm4");
            return (Criteria) this;
        }

        public Criteria andDianh4IsNull() {
            addCriterion("DIANH4 is null");
            return (Criteria) this;
        }

        public Criteria andDianh4IsNotNull() {
            addCriterion("DIANH4 is not null");
            return (Criteria) this;
        }

        public Criteria andDianh4EqualTo(String value) {
            addCriterion("DIANH4 =", value, "dianh4");
            return (Criteria) this;
        }

        public Criteria andDianh4NotEqualTo(String value) {
            addCriterion("DIANH4 <>", value, "dianh4");
            return (Criteria) this;
        }

        public Criteria andDianh4GreaterThan(String value) {
            addCriterion("DIANH4 >", value, "dianh4");
            return (Criteria) this;
        }

        public Criteria andDianh4GreaterThanOrEqualTo(String value) {
            addCriterion("DIANH4 >=", value, "dianh4");
            return (Criteria) this;
        }

        public Criteria andDianh4LessThan(String value) {
            addCriterion("DIANH4 <", value, "dianh4");
            return (Criteria) this;
        }

        public Criteria andDianh4LessThanOrEqualTo(String value) {
            addCriterion("DIANH4 <=", value, "dianh4");
            return (Criteria) this;
        }

        public Criteria andDianh4Like(String value) {
            addCriterion("DIANH4 like", value, "dianh4");
            return (Criteria) this;
        }

        public Criteria andDianh4NotLike(String value) {
            addCriterion("DIANH4 not like", value, "dianh4");
            return (Criteria) this;
        }

        public Criteria andDianh4In(List<String> values) {
            addCriterion("DIANH4 in", values, "dianh4");
            return (Criteria) this;
        }

        public Criteria andDianh4NotIn(List<String> values) {
            addCriterion("DIANH4 not in", values, "dianh4");
            return (Criteria) this;
        }

        public Criteria andDianh4Between(String value1, String value2) {
            addCriterion("DIANH4 between", value1, value2, "dianh4");
            return (Criteria) this;
        }

        public Criteria andDianh4NotBetween(String value1, String value2) {
            addCriterion("DIANH4 not between", value1, value2, "dianh4");
            return (Criteria) this;
        }

        public Criteria andZhengjzl4IsNull() {
            addCriterion("ZHENGJZL4 is null");
            return (Criteria) this;
        }

        public Criteria andZhengjzl4IsNotNull() {
            addCriterion("ZHENGJZL4 is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjzl4EqualTo(Object value) {
            addCriterion("ZHENGJZL4 =", value, "zhengjzl4");
            return (Criteria) this;
        }

        public Criteria andZhengjzl4NotEqualTo(Object value) {
            addCriterion("ZHENGJZL4 <>", value, "zhengjzl4");
            return (Criteria) this;
        }

        public Criteria andZhengjzl4GreaterThan(Object value) {
            addCriterion("ZHENGJZL4 >", value, "zhengjzl4");
            return (Criteria) this;
        }

        public Criteria andZhengjzl4GreaterThanOrEqualTo(Object value) {
            addCriterion("ZHENGJZL4 >=", value, "zhengjzl4");
            return (Criteria) this;
        }

        public Criteria andZhengjzl4LessThan(Object value) {
            addCriterion("ZHENGJZL4 <", value, "zhengjzl4");
            return (Criteria) this;
        }

        public Criteria andZhengjzl4LessThanOrEqualTo(Object value) {
            addCriterion("ZHENGJZL4 <=", value, "zhengjzl4");
            return (Criteria) this;
        }

        public Criteria andZhengjzl4In(List<Object> values) {
            addCriterion("ZHENGJZL4 in", values, "zhengjzl4");
            return (Criteria) this;
        }

        public Criteria andZhengjzl4NotIn(List<Object> values) {
            addCriterion("ZHENGJZL4 not in", values, "zhengjzl4");
            return (Criteria) this;
        }

        public Criteria andZhengjzl4Between(Object value1, Object value2) {
            addCriterion("ZHENGJZL4 between", value1, value2, "zhengjzl4");
            return (Criteria) this;
        }

        public Criteria andZhengjzl4NotBetween(Object value1, Object value2) {
            addCriterion("ZHENGJZL4 not between", value1, value2, "zhengjzl4");
            return (Criteria) this;
        }

        public Criteria andZhengjhm4IsNull() {
            addCriterion("ZHENGJHM4 is null");
            return (Criteria) this;
        }

        public Criteria andZhengjhm4IsNotNull() {
            addCriterion("ZHENGJHM4 is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjhm4EqualTo(String value) {
            addCriterion("ZHENGJHM4 =", value, "zhengjhm4");
            return (Criteria) this;
        }

        public Criteria andZhengjhm4NotEqualTo(String value) {
            addCriterion("ZHENGJHM4 <>", value, "zhengjhm4");
            return (Criteria) this;
        }

        public Criteria andZhengjhm4GreaterThan(String value) {
            addCriterion("ZHENGJHM4 >", value, "zhengjhm4");
            return (Criteria) this;
        }

        public Criteria andZhengjhm4GreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGJHM4 >=", value, "zhengjhm4");
            return (Criteria) this;
        }

        public Criteria andZhengjhm4LessThan(String value) {
            addCriterion("ZHENGJHM4 <", value, "zhengjhm4");
            return (Criteria) this;
        }

        public Criteria andZhengjhm4LessThanOrEqualTo(String value) {
            addCriterion("ZHENGJHM4 <=", value, "zhengjhm4");
            return (Criteria) this;
        }

        public Criteria andZhengjhm4Like(String value) {
            addCriterion("ZHENGJHM4 like", value, "zhengjhm4");
            return (Criteria) this;
        }

        public Criteria andZhengjhm4NotLike(String value) {
            addCriterion("ZHENGJHM4 not like", value, "zhengjhm4");
            return (Criteria) this;
        }

        public Criteria andZhengjhm4In(List<String> values) {
            addCriterion("ZHENGJHM4 in", values, "zhengjhm4");
            return (Criteria) this;
        }

        public Criteria andZhengjhm4NotIn(List<String> values) {
            addCriterion("ZHENGJHM4 not in", values, "zhengjhm4");
            return (Criteria) this;
        }

        public Criteria andZhengjhm4Between(String value1, String value2) {
            addCriterion("ZHENGJHM4 between", value1, value2, "zhengjhm4");
            return (Criteria) this;
        }

        public Criteria andZhengjhm4NotBetween(String value1, String value2) {
            addCriterion("ZHENGJHM4 not between", value1, value2, "zhengjhm4");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz4IsNull() {
            addCriterion("ZHENGJYXQZ4 is null");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz4IsNotNull() {
            addCriterion("ZHENGJYXQZ4 is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz4EqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ4 =", value, "zhengjyxqz4");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz4NotEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ4 <>", value, "zhengjyxqz4");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz4GreaterThan(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ4 >", value, "zhengjyxqz4");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz4GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ4 >=", value, "zhengjyxqz4");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz4LessThan(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ4 <", value, "zhengjyxqz4");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz4LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZHENGJYXQZ4 <=", value, "zhengjyxqz4");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz4In(List<Date> values) {
            addCriterionForJDBCDate("ZHENGJYXQZ4 in", values, "zhengjyxqz4");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz4NotIn(List<Date> values) {
            addCriterionForJDBCDate("ZHENGJYXQZ4 not in", values, "zhengjyxqz4");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz4Between(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHENGJYXQZ4 between", value1, value2, "zhengjyxqz4");
            return (Criteria) this;
        }

        public Criteria andZhengjyxqz4NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZHENGJYXQZ4 not between", value1, value2, "zhengjyxqz4");
            return (Criteria) this;
        }

        public Criteria andZhangq4IsNull() {
            addCriterion("ZHANGQ4 is null");
            return (Criteria) this;
        }

        public Criteria andZhangq4IsNotNull() {
            addCriterion("ZHANGQ4 is not null");
            return (Criteria) this;
        }

        public Criteria andZhangq4EqualTo(String value) {
            addCriterion("ZHANGQ4 =", value, "zhangq4");
            return (Criteria) this;
        }

        public Criteria andZhangq4NotEqualTo(String value) {
            addCriterion("ZHANGQ4 <>", value, "zhangq4");
            return (Criteria) this;
        }

        public Criteria andZhangq4GreaterThan(String value) {
            addCriterion("ZHANGQ4 >", value, "zhangq4");
            return (Criteria) this;
        }

        public Criteria andZhangq4GreaterThanOrEqualTo(String value) {
            addCriterion("ZHANGQ4 >=", value, "zhangq4");
            return (Criteria) this;
        }

        public Criteria andZhangq4LessThan(String value) {
            addCriterion("ZHANGQ4 <", value, "zhangq4");
            return (Criteria) this;
        }

        public Criteria andZhangq4LessThanOrEqualTo(String value) {
            addCriterion("ZHANGQ4 <=", value, "zhangq4");
            return (Criteria) this;
        }

        public Criteria andZhangq4Like(String value) {
            addCriterion("ZHANGQ4 like", value, "zhangq4");
            return (Criteria) this;
        }

        public Criteria andZhangq4NotLike(String value) {
            addCriterion("ZHANGQ4 not like", value, "zhangq4");
            return (Criteria) this;
        }

        public Criteria andZhangq4In(List<String> values) {
            addCriterion("ZHANGQ4 in", values, "zhangq4");
            return (Criteria) this;
        }

        public Criteria andZhangq4NotIn(List<String> values) {
            addCriterion("ZHANGQ4 not in", values, "zhangq4");
            return (Criteria) this;
        }

        public Criteria andZhangq4Between(String value1, String value2) {
            addCriterion("ZHANGQ4 between", value1, value2, "zhangq4");
            return (Criteria) this;
        }

        public Criteria andZhangq4NotBetween(String value1, String value2) {
            addCriterion("ZHANGQ4 not between", value1, value2, "zhangq4");
            return (Criteria) this;
        }

        public Criteria andHangyflIsNull() {
            addCriterion("HANGYFL is null");
            return (Criteria) this;
        }

        public Criteria andHangyflIsNotNull() {
            addCriterion("HANGYFL is not null");
            return (Criteria) this;
        }

        public Criteria andHangyflEqualTo(Object value) {
            addCriterion("HANGYFL =", value, "hangyfl");
            return (Criteria) this;
        }

        public Criteria andHangyflNotEqualTo(Object value) {
            addCriterion("HANGYFL <>", value, "hangyfl");
            return (Criteria) this;
        }

        public Criteria andHangyflGreaterThan(Object value) {
            addCriterion("HANGYFL >", value, "hangyfl");
            return (Criteria) this;
        }

        public Criteria andHangyflGreaterThanOrEqualTo(Object value) {
            addCriterion("HANGYFL >=", value, "hangyfl");
            return (Criteria) this;
        }

        public Criteria andHangyflLessThan(Object value) {
            addCriterion("HANGYFL <", value, "hangyfl");
            return (Criteria) this;
        }

        public Criteria andHangyflLessThanOrEqualTo(Object value) {
            addCriterion("HANGYFL <=", value, "hangyfl");
            return (Criteria) this;
        }

        public Criteria andHangyflIn(List<Object> values) {
            addCriterion("HANGYFL in", values, "hangyfl");
            return (Criteria) this;
        }

        public Criteria andHangyflNotIn(List<Object> values) {
            addCriterion("HANGYFL not in", values, "hangyfl");
            return (Criteria) this;
        }

        public Criteria andHangyflBetween(Object value1, Object value2) {
            addCriterion("HANGYFL between", value1, value2, "hangyfl");
            return (Criteria) this;
        }

        public Criteria andHangyflNotBetween(Object value1, Object value2) {
            addCriterion("HANGYFL not between", value1, value2, "hangyfl");
            return (Criteria) this;
        }

        public Criteria andZhuczjIsNull() {
            addCriterion("ZHUCZJ is null");
            return (Criteria) this;
        }

        public Criteria andZhuczjIsNotNull() {
            addCriterion("ZHUCZJ is not null");
            return (Criteria) this;
        }

        public Criteria andZhuczjEqualTo(BigDecimal value) {
            addCriterion("ZHUCZJ =", value, "zhuczj");
            return (Criteria) this;
        }

        public Criteria andZhuczjNotEqualTo(BigDecimal value) {
            addCriterion("ZHUCZJ <>", value, "zhuczj");
            return (Criteria) this;
        }

        public Criteria andZhuczjGreaterThan(BigDecimal value) {
            addCriterion("ZHUCZJ >", value, "zhuczj");
            return (Criteria) this;
        }

        public Criteria andZhuczjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHUCZJ >=", value, "zhuczj");
            return (Criteria) this;
        }

        public Criteria andZhuczjLessThan(BigDecimal value) {
            addCriterion("ZHUCZJ <", value, "zhuczj");
            return (Criteria) this;
        }

        public Criteria andZhuczjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHUCZJ <=", value, "zhuczj");
            return (Criteria) this;
        }

        public Criteria andZhuczjIn(List<BigDecimal> values) {
            addCriterion("ZHUCZJ in", values, "zhuczj");
            return (Criteria) this;
        }

        public Criteria andZhuczjNotIn(List<BigDecimal> values) {
            addCriterion("ZHUCZJ not in", values, "zhuczj");
            return (Criteria) this;
        }

        public Criteria andZhuczjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHUCZJ between", value1, value2, "zhuczj");
            return (Criteria) this;
        }

        public Criteria andZhuczjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHUCZJ not between", value1, value2, "zhuczj");
            return (Criteria) this;
        }

        public Criteria andDiqdmIsNull() {
            addCriterion("DIQDM is null");
            return (Criteria) this;
        }

        public Criteria andDiqdmIsNotNull() {
            addCriterion("DIQDM is not null");
            return (Criteria) this;
        }

        public Criteria andDiqdmEqualTo(String value) {
            addCriterion("DIQDM =", value, "diqdm");
            return (Criteria) this;
        }

        public Criteria andDiqdmNotEqualTo(String value) {
            addCriterion("DIQDM <>", value, "diqdm");
            return (Criteria) this;
        }

        public Criteria andDiqdmGreaterThan(String value) {
            addCriterion("DIQDM >", value, "diqdm");
            return (Criteria) this;
        }

        public Criteria andDiqdmGreaterThanOrEqualTo(String value) {
            addCriterion("DIQDM >=", value, "diqdm");
            return (Criteria) this;
        }

        public Criteria andDiqdmLessThan(String value) {
            addCriterion("DIQDM <", value, "diqdm");
            return (Criteria) this;
        }

        public Criteria andDiqdmLessThanOrEqualTo(String value) {
            addCriterion("DIQDM <=", value, "diqdm");
            return (Criteria) this;
        }

        public Criteria andDiqdmLike(String value) {
            addCriterion("DIQDM like", value, "diqdm");
            return (Criteria) this;
        }

        public Criteria andDiqdmNotLike(String value) {
            addCriterion("DIQDM not like", value, "diqdm");
            return (Criteria) this;
        }

        public Criteria andDiqdmIn(List<String> values) {
            addCriterion("DIQDM in", values, "diqdm");
            return (Criteria) this;
        }

        public Criteria andDiqdmNotIn(List<String> values) {
            addCriterion("DIQDM not in", values, "diqdm");
            return (Criteria) this;
        }

        public Criteria andDiqdmBetween(String value1, String value2) {
            addCriterion("DIQDM between", value1, value2, "diqdm");
            return (Criteria) this;
        }

        public Criteria andDiqdmNotBetween(String value1, String value2) {
            addCriterion("DIQDM not between", value1, value2, "diqdm");
            return (Criteria) this;
        }

        public Criteria andJingyfwIsNull() {
            addCriterion("JINGYFW is null");
            return (Criteria) this;
        }

        public Criteria andJingyfwIsNotNull() {
            addCriterion("JINGYFW is not null");
            return (Criteria) this;
        }

        public Criteria andJingyfwEqualTo(String value) {
            addCriterion("JINGYFW =", value, "jingyfw");
            return (Criteria) this;
        }

        public Criteria andJingyfwNotEqualTo(String value) {
            addCriterion("JINGYFW <>", value, "jingyfw");
            return (Criteria) this;
        }

        public Criteria andJingyfwGreaterThan(String value) {
            addCriterion("JINGYFW >", value, "jingyfw");
            return (Criteria) this;
        }

        public Criteria andJingyfwGreaterThanOrEqualTo(String value) {
            addCriterion("JINGYFW >=", value, "jingyfw");
            return (Criteria) this;
        }

        public Criteria andJingyfwLessThan(String value) {
            addCriterion("JINGYFW <", value, "jingyfw");
            return (Criteria) this;
        }

        public Criteria andJingyfwLessThanOrEqualTo(String value) {
            addCriterion("JINGYFW <=", value, "jingyfw");
            return (Criteria) this;
        }

        public Criteria andJingyfwLike(String value) {
            addCriterion("JINGYFW like", value, "jingyfw");
            return (Criteria) this;
        }

        public Criteria andJingyfwNotLike(String value) {
            addCriterion("JINGYFW not like", value, "jingyfw");
            return (Criteria) this;
        }

        public Criteria andJingyfwIn(List<String> values) {
            addCriterion("JINGYFW in", values, "jingyfw");
            return (Criteria) this;
        }

        public Criteria andJingyfwNotIn(List<String> values) {
            addCriterion("JINGYFW not in", values, "jingyfw");
            return (Criteria) this;
        }

        public Criteria andJingyfwBetween(String value1, String value2) {
            addCriterion("JINGYFW between", value1, value2, "jingyfw");
            return (Criteria) this;
        }

        public Criteria andJingyfwNotBetween(String value1, String value2) {
            addCriterion("JINGYFW not between", value1, value2, "jingyfw");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1zlIsNull() {
            addCriterion("ZHENGMWJ1ZL is null");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1zlIsNotNull() {
            addCriterion("ZHENGMWJ1ZL is not null");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1zlEqualTo(Object value) {
            addCriterion("ZHENGMWJ1ZL =", value, "zhengmwj1zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1zlNotEqualTo(Object value) {
            addCriterion("ZHENGMWJ1ZL <>", value, "zhengmwj1zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1zlGreaterThan(Object value) {
            addCriterion("ZHENGMWJ1ZL >", value, "zhengmwj1zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1zlGreaterThanOrEqualTo(Object value) {
            addCriterion("ZHENGMWJ1ZL >=", value, "zhengmwj1zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1zlLessThan(Object value) {
            addCriterion("ZHENGMWJ1ZL <", value, "zhengmwj1zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1zlLessThanOrEqualTo(Object value) {
            addCriterion("ZHENGMWJ1ZL <=", value, "zhengmwj1zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1zlIn(List<Object> values) {
            addCriterion("ZHENGMWJ1ZL in", values, "zhengmwj1zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1zlNotIn(List<Object> values) {
            addCriterion("ZHENGMWJ1ZL not in", values, "zhengmwj1zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1zlBetween(Object value1, Object value2) {
            addCriterion("ZHENGMWJ1ZL between", value1, value2, "zhengmwj1zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1zlNotBetween(Object value1, Object value2) {
            addCriterion("ZHENGMWJ1ZL not between", value1, value2, "zhengmwj1zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1bhIsNull() {
            addCriterion("ZHENGMWJ1BH is null");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1bhIsNotNull() {
            addCriterion("ZHENGMWJ1BH is not null");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1bhEqualTo(String value) {
            addCriterion("ZHENGMWJ1BH =", value, "zhengmwj1bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1bhNotEqualTo(String value) {
            addCriterion("ZHENGMWJ1BH <>", value, "zhengmwj1bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1bhGreaterThan(String value) {
            addCriterion("ZHENGMWJ1BH >", value, "zhengmwj1bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1bhGreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGMWJ1BH >=", value, "zhengmwj1bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1bhLessThan(String value) {
            addCriterion("ZHENGMWJ1BH <", value, "zhengmwj1bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1bhLessThanOrEqualTo(String value) {
            addCriterion("ZHENGMWJ1BH <=", value, "zhengmwj1bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1bhLike(String value) {
            addCriterion("ZHENGMWJ1BH like", value, "zhengmwj1bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1bhNotLike(String value) {
            addCriterion("ZHENGMWJ1BH not like", value, "zhengmwj1bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1bhIn(List<String> values) {
            addCriterion("ZHENGMWJ1BH in", values, "zhengmwj1bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1bhNotIn(List<String> values) {
            addCriterion("ZHENGMWJ1BH not in", values, "zhengmwj1bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1bhBetween(String value1, String value2) {
            addCriterion("ZHENGMWJ1BH between", value1, value2, "zhengmwj1bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj1bhNotBetween(String value1, String value2) {
            addCriterion("ZHENGMWJ1BH not between", value1, value2, "zhengmwj1bh");
            return (Criteria) this;
        }

        public Criteria andWenjyxq1IsNull() {
            addCriterion("WENJYXQ1 is null");
            return (Criteria) this;
        }

        public Criteria andWenjyxq1IsNotNull() {
            addCriterion("WENJYXQ1 is not null");
            return (Criteria) this;
        }

        public Criteria andWenjyxq1EqualTo(Date value) {
            addCriterionForJDBCDate("WENJYXQ1 =", value, "wenjyxq1");
            return (Criteria) this;
        }

        public Criteria andWenjyxq1NotEqualTo(Date value) {
            addCriterionForJDBCDate("WENJYXQ1 <>", value, "wenjyxq1");
            return (Criteria) this;
        }

        public Criteria andWenjyxq1GreaterThan(Date value) {
            addCriterionForJDBCDate("WENJYXQ1 >", value, "wenjyxq1");
            return (Criteria) this;
        }

        public Criteria andWenjyxq1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WENJYXQ1 >=", value, "wenjyxq1");
            return (Criteria) this;
        }

        public Criteria andWenjyxq1LessThan(Date value) {
            addCriterionForJDBCDate("WENJYXQ1 <", value, "wenjyxq1");
            return (Criteria) this;
        }

        public Criteria andWenjyxq1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WENJYXQ1 <=", value, "wenjyxq1");
            return (Criteria) this;
        }

        public Criteria andWenjyxq1In(List<Date> values) {
            addCriterionForJDBCDate("WENJYXQ1 in", values, "wenjyxq1");
            return (Criteria) this;
        }

        public Criteria andWenjyxq1NotIn(List<Date> values) {
            addCriterionForJDBCDate("WENJYXQ1 not in", values, "wenjyxq1");
            return (Criteria) this;
        }

        public Criteria andWenjyxq1Between(Date value1, Date value2) {
            addCriterionForJDBCDate("WENJYXQ1 between", value1, value2, "wenjyxq1");
            return (Criteria) this;
        }

        public Criteria andWenjyxq1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WENJYXQ1 not between", value1, value2, "wenjyxq1");
            return (Criteria) this;
        }

        public Criteria andWenjcq1IsNull() {
            addCriterion("WENJCQ1 is null");
            return (Criteria) this;
        }

        public Criteria andWenjcq1IsNotNull() {
            addCriterion("WENJCQ1 is not null");
            return (Criteria) this;
        }

        public Criteria andWenjcq1EqualTo(String value) {
            addCriterion("WENJCQ1 =", value, "wenjcq1");
            return (Criteria) this;
        }

        public Criteria andWenjcq1NotEqualTo(String value) {
            addCriterion("WENJCQ1 <>", value, "wenjcq1");
            return (Criteria) this;
        }

        public Criteria andWenjcq1GreaterThan(String value) {
            addCriterion("WENJCQ1 >", value, "wenjcq1");
            return (Criteria) this;
        }

        public Criteria andWenjcq1GreaterThanOrEqualTo(String value) {
            addCriterion("WENJCQ1 >=", value, "wenjcq1");
            return (Criteria) this;
        }

        public Criteria andWenjcq1LessThan(String value) {
            addCriterion("WENJCQ1 <", value, "wenjcq1");
            return (Criteria) this;
        }

        public Criteria andWenjcq1LessThanOrEqualTo(String value) {
            addCriterion("WENJCQ1 <=", value, "wenjcq1");
            return (Criteria) this;
        }

        public Criteria andWenjcq1Like(String value) {
            addCriterion("WENJCQ1 like", value, "wenjcq1");
            return (Criteria) this;
        }

        public Criteria andWenjcq1NotLike(String value) {
            addCriterion("WENJCQ1 not like", value, "wenjcq1");
            return (Criteria) this;
        }

        public Criteria andWenjcq1In(List<String> values) {
            addCriterion("WENJCQ1 in", values, "wenjcq1");
            return (Criteria) this;
        }

        public Criteria andWenjcq1NotIn(List<String> values) {
            addCriterion("WENJCQ1 not in", values, "wenjcq1");
            return (Criteria) this;
        }

        public Criteria andWenjcq1Between(String value1, String value2) {
            addCriterion("WENJCQ1 between", value1, value2, "wenjcq1");
            return (Criteria) this;
        }

        public Criteria andWenjcq1NotBetween(String value1, String value2) {
            addCriterion("WENJCQ1 not between", value1, value2, "wenjcq1");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2zlIsNull() {
            addCriterion("ZHENGMWJ2ZL is null");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2zlIsNotNull() {
            addCriterion("ZHENGMWJ2ZL is not null");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2zlEqualTo(Object value) {
            addCriterion("ZHENGMWJ2ZL =", value, "zhengmwj2zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2zlNotEqualTo(Object value) {
            addCriterion("ZHENGMWJ2ZL <>", value, "zhengmwj2zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2zlGreaterThan(Object value) {
            addCriterion("ZHENGMWJ2ZL >", value, "zhengmwj2zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2zlGreaterThanOrEqualTo(Object value) {
            addCriterion("ZHENGMWJ2ZL >=", value, "zhengmwj2zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2zlLessThan(Object value) {
            addCriterion("ZHENGMWJ2ZL <", value, "zhengmwj2zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2zlLessThanOrEqualTo(Object value) {
            addCriterion("ZHENGMWJ2ZL <=", value, "zhengmwj2zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2zlIn(List<Object> values) {
            addCriterion("ZHENGMWJ2ZL in", values, "zhengmwj2zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2zlNotIn(List<Object> values) {
            addCriterion("ZHENGMWJ2ZL not in", values, "zhengmwj2zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2zlBetween(Object value1, Object value2) {
            addCriterion("ZHENGMWJ2ZL between", value1, value2, "zhengmwj2zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2zlNotBetween(Object value1, Object value2) {
            addCriterion("ZHENGMWJ2ZL not between", value1, value2, "zhengmwj2zl");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2bhIsNull() {
            addCriterion("ZHENGMWJ2BH is null");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2bhIsNotNull() {
            addCriterion("ZHENGMWJ2BH is not null");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2bhEqualTo(String value) {
            addCriterion("ZHENGMWJ2BH =", value, "zhengmwj2bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2bhNotEqualTo(String value) {
            addCriterion("ZHENGMWJ2BH <>", value, "zhengmwj2bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2bhGreaterThan(String value) {
            addCriterion("ZHENGMWJ2BH >", value, "zhengmwj2bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2bhGreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGMWJ2BH >=", value, "zhengmwj2bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2bhLessThan(String value) {
            addCriterion("ZHENGMWJ2BH <", value, "zhengmwj2bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2bhLessThanOrEqualTo(String value) {
            addCriterion("ZHENGMWJ2BH <=", value, "zhengmwj2bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2bhLike(String value) {
            addCriterion("ZHENGMWJ2BH like", value, "zhengmwj2bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2bhNotLike(String value) {
            addCriterion("ZHENGMWJ2BH not like", value, "zhengmwj2bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2bhIn(List<String> values) {
            addCriterion("ZHENGMWJ2BH in", values, "zhengmwj2bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2bhNotIn(List<String> values) {
            addCriterion("ZHENGMWJ2BH not in", values, "zhengmwj2bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2bhBetween(String value1, String value2) {
            addCriterion("ZHENGMWJ2BH between", value1, value2, "zhengmwj2bh");
            return (Criteria) this;
        }

        public Criteria andZhengmwj2bhNotBetween(String value1, String value2) {
            addCriterion("ZHENGMWJ2BH not between", value1, value2, "zhengmwj2bh");
            return (Criteria) this;
        }

        public Criteria andWenjyxq2IsNull() {
            addCriterion("WENJYXQ2 is null");
            return (Criteria) this;
        }

        public Criteria andWenjyxq2IsNotNull() {
            addCriterion("WENJYXQ2 is not null");
            return (Criteria) this;
        }

        public Criteria andWenjyxq2EqualTo(Date value) {
            addCriterionForJDBCDate("WENJYXQ2 =", value, "wenjyxq2");
            return (Criteria) this;
        }

        public Criteria andWenjyxq2NotEqualTo(Date value) {
            addCriterionForJDBCDate("WENJYXQ2 <>", value, "wenjyxq2");
            return (Criteria) this;
        }

        public Criteria andWenjyxq2GreaterThan(Date value) {
            addCriterionForJDBCDate("WENJYXQ2 >", value, "wenjyxq2");
            return (Criteria) this;
        }

        public Criteria andWenjyxq2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WENJYXQ2 >=", value, "wenjyxq2");
            return (Criteria) this;
        }

        public Criteria andWenjyxq2LessThan(Date value) {
            addCriterionForJDBCDate("WENJYXQ2 <", value, "wenjyxq2");
            return (Criteria) this;
        }

        public Criteria andWenjyxq2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WENJYXQ2 <=", value, "wenjyxq2");
            return (Criteria) this;
        }

        public Criteria andWenjyxq2In(List<Date> values) {
            addCriterionForJDBCDate("WENJYXQ2 in", values, "wenjyxq2");
            return (Criteria) this;
        }

        public Criteria andWenjyxq2NotIn(List<Date> values) {
            addCriterionForJDBCDate("WENJYXQ2 not in", values, "wenjyxq2");
            return (Criteria) this;
        }

        public Criteria andWenjyxq2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("WENJYXQ2 between", value1, value2, "wenjyxq2");
            return (Criteria) this;
        }

        public Criteria andWenjyxq2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WENJYXQ2 not between", value1, value2, "wenjyxq2");
            return (Criteria) this;
        }

        public Criteria andWenjcq2IsNull() {
            addCriterion("WENJCQ2 is null");
            return (Criteria) this;
        }

        public Criteria andWenjcq2IsNotNull() {
            addCriterion("WENJCQ2 is not null");
            return (Criteria) this;
        }

        public Criteria andWenjcq2EqualTo(String value) {
            addCriterion("WENJCQ2 =", value, "wenjcq2");
            return (Criteria) this;
        }

        public Criteria andWenjcq2NotEqualTo(String value) {
            addCriterion("WENJCQ2 <>", value, "wenjcq2");
            return (Criteria) this;
        }

        public Criteria andWenjcq2GreaterThan(String value) {
            addCriterion("WENJCQ2 >", value, "wenjcq2");
            return (Criteria) this;
        }

        public Criteria andWenjcq2GreaterThanOrEqualTo(String value) {
            addCriterion("WENJCQ2 >=", value, "wenjcq2");
            return (Criteria) this;
        }

        public Criteria andWenjcq2LessThan(String value) {
            addCriterion("WENJCQ2 <", value, "wenjcq2");
            return (Criteria) this;
        }

        public Criteria andWenjcq2LessThanOrEqualTo(String value) {
            addCriterion("WENJCQ2 <=", value, "wenjcq2");
            return (Criteria) this;
        }

        public Criteria andWenjcq2Like(String value) {
            addCriterion("WENJCQ2 like", value, "wenjcq2");
            return (Criteria) this;
        }

        public Criteria andWenjcq2NotLike(String value) {
            addCriterion("WENJCQ2 not like", value, "wenjcq2");
            return (Criteria) this;
        }

        public Criteria andWenjcq2In(List<String> values) {
            addCriterion("WENJCQ2 in", values, "wenjcq2");
            return (Criteria) this;
        }

        public Criteria andWenjcq2NotIn(List<String> values) {
            addCriterion("WENJCQ2 not in", values, "wenjcq2");
            return (Criteria) this;
        }

        public Criteria andWenjcq2Between(String value1, String value2) {
            addCriterion("WENJCQ2 between", value1, value2, "wenjcq2");
            return (Criteria) this;
        }

        public Criteria andWenjcq2NotBetween(String value1, String value2) {
            addCriterion("WENJCQ2 not between", value1, value2, "wenjcq2");
            return (Criteria) this;
        }

        public Criteria andGuosdjzhIsNull() {
            addCriterion("GUOSDJZH is null");
            return (Criteria) this;
        }

        public Criteria andGuosdjzhIsNotNull() {
            addCriterion("GUOSDJZH is not null");
            return (Criteria) this;
        }

        public Criteria andGuosdjzhEqualTo(String value) {
            addCriterion("GUOSDJZH =", value, "guosdjzh");
            return (Criteria) this;
        }

        public Criteria andGuosdjzhNotEqualTo(String value) {
            addCriterion("GUOSDJZH <>", value, "guosdjzh");
            return (Criteria) this;
        }

        public Criteria andGuosdjzhGreaterThan(String value) {
            addCriterion("GUOSDJZH >", value, "guosdjzh");
            return (Criteria) this;
        }

        public Criteria andGuosdjzhGreaterThanOrEqualTo(String value) {
            addCriterion("GUOSDJZH >=", value, "guosdjzh");
            return (Criteria) this;
        }

        public Criteria andGuosdjzhLessThan(String value) {
            addCriterion("GUOSDJZH <", value, "guosdjzh");
            return (Criteria) this;
        }

        public Criteria andGuosdjzhLessThanOrEqualTo(String value) {
            addCriterion("GUOSDJZH <=", value, "guosdjzh");
            return (Criteria) this;
        }

        public Criteria andGuosdjzhLike(String value) {
            addCriterion("GUOSDJZH like", value, "guosdjzh");
            return (Criteria) this;
        }

        public Criteria andGuosdjzhNotLike(String value) {
            addCriterion("GUOSDJZH not like", value, "guosdjzh");
            return (Criteria) this;
        }

        public Criteria andGuosdjzhIn(List<String> values) {
            addCriterion("GUOSDJZH in", values, "guosdjzh");
            return (Criteria) this;
        }

        public Criteria andGuosdjzhNotIn(List<String> values) {
            addCriterion("GUOSDJZH not in", values, "guosdjzh");
            return (Criteria) this;
        }

        public Criteria andGuosdjzhBetween(String value1, String value2) {
            addCriterion("GUOSDJZH between", value1, value2, "guosdjzh");
            return (Criteria) this;
        }

        public Criteria andGuosdjzhNotBetween(String value1, String value2) {
            addCriterion("GUOSDJZH not between", value1, value2, "guosdjzh");
            return (Criteria) this;
        }

        public Criteria andDisdjzhIsNull() {
            addCriterion("DISDJZH is null");
            return (Criteria) this;
        }

        public Criteria andDisdjzhIsNotNull() {
            addCriterion("DISDJZH is not null");
            return (Criteria) this;
        }

        public Criteria andDisdjzhEqualTo(String value) {
            addCriterion("DISDJZH =", value, "disdjzh");
            return (Criteria) this;
        }

        public Criteria andDisdjzhNotEqualTo(String value) {
            addCriterion("DISDJZH <>", value, "disdjzh");
            return (Criteria) this;
        }

        public Criteria andDisdjzhGreaterThan(String value) {
            addCriterion("DISDJZH >", value, "disdjzh");
            return (Criteria) this;
        }

        public Criteria andDisdjzhGreaterThanOrEqualTo(String value) {
            addCriterion("DISDJZH >=", value, "disdjzh");
            return (Criteria) this;
        }

        public Criteria andDisdjzhLessThan(String value) {
            addCriterion("DISDJZH <", value, "disdjzh");
            return (Criteria) this;
        }

        public Criteria andDisdjzhLessThanOrEqualTo(String value) {
            addCriterion("DISDJZH <=", value, "disdjzh");
            return (Criteria) this;
        }

        public Criteria andDisdjzhLike(String value) {
            addCriterion("DISDJZH like", value, "disdjzh");
            return (Criteria) this;
        }

        public Criteria andDisdjzhNotLike(String value) {
            addCriterion("DISDJZH not like", value, "disdjzh");
            return (Criteria) this;
        }

        public Criteria andDisdjzhIn(List<String> values) {
            addCriterion("DISDJZH in", values, "disdjzh");
            return (Criteria) this;
        }

        public Criteria andDisdjzhNotIn(List<String> values) {
            addCriterion("DISDJZH not in", values, "disdjzh");
            return (Criteria) this;
        }

        public Criteria andDisdjzhBetween(String value1, String value2) {
            addCriterion("DISDJZH between", value1, value2, "disdjzh");
            return (Criteria) this;
        }

        public Criteria andDisdjzhNotBetween(String value1, String value2) {
            addCriterion("DISDJZH not between", value1, value2, "disdjzh");
            return (Criteria) this;
        }

        public Criteria andGuosyxqIsNull() {
            addCriterion("GUOSYXQ is null");
            return (Criteria) this;
        }

        public Criteria andGuosyxqIsNotNull() {
            addCriterion("GUOSYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andGuosyxqEqualTo(Date value) {
            addCriterionForJDBCDate("GUOSYXQ =", value, "guosyxq");
            return (Criteria) this;
        }

        public Criteria andGuosyxqNotEqualTo(Date value) {
            addCriterionForJDBCDate("GUOSYXQ <>", value, "guosyxq");
            return (Criteria) this;
        }

        public Criteria andGuosyxqGreaterThan(Date value) {
            addCriterionForJDBCDate("GUOSYXQ >", value, "guosyxq");
            return (Criteria) this;
        }

        public Criteria andGuosyxqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GUOSYXQ >=", value, "guosyxq");
            return (Criteria) this;
        }

        public Criteria andGuosyxqLessThan(Date value) {
            addCriterionForJDBCDate("GUOSYXQ <", value, "guosyxq");
            return (Criteria) this;
        }

        public Criteria andGuosyxqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GUOSYXQ <=", value, "guosyxq");
            return (Criteria) this;
        }

        public Criteria andGuosyxqIn(List<Date> values) {
            addCriterionForJDBCDate("GUOSYXQ in", values, "guosyxq");
            return (Criteria) this;
        }

        public Criteria andGuosyxqNotIn(List<Date> values) {
            addCriterionForJDBCDate("GUOSYXQ not in", values, "guosyxq");
            return (Criteria) this;
        }

        public Criteria andGuosyxqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GUOSYXQ between", value1, value2, "guosyxq");
            return (Criteria) this;
        }

        public Criteria andGuosyxqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GUOSYXQ not between", value1, value2, "guosyxq");
            return (Criteria) this;
        }

        public Criteria andDisyxqIsNull() {
            addCriterion("DISYXQ is null");
            return (Criteria) this;
        }

        public Criteria andDisyxqIsNotNull() {
            addCriterion("DISYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andDisyxqEqualTo(Date value) {
            addCriterionForJDBCDate("DISYXQ =", value, "disyxq");
            return (Criteria) this;
        }

        public Criteria andDisyxqNotEqualTo(Date value) {
            addCriterionForJDBCDate("DISYXQ <>", value, "disyxq");
            return (Criteria) this;
        }

        public Criteria andDisyxqGreaterThan(Date value) {
            addCriterionForJDBCDate("DISYXQ >", value, "disyxq");
            return (Criteria) this;
        }

        public Criteria andDisyxqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DISYXQ >=", value, "disyxq");
            return (Criteria) this;
        }

        public Criteria andDisyxqLessThan(Date value) {
            addCriterionForJDBCDate("DISYXQ <", value, "disyxq");
            return (Criteria) this;
        }

        public Criteria andDisyxqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DISYXQ <=", value, "disyxq");
            return (Criteria) this;
        }

        public Criteria andDisyxqIn(List<Date> values) {
            addCriterionForJDBCDate("DISYXQ in", values, "disyxq");
            return (Criteria) this;
        }

        public Criteria andDisyxqNotIn(List<Date> values) {
            addCriterionForJDBCDate("DISYXQ not in", values, "disyxq");
            return (Criteria) this;
        }

        public Criteria andDisyxqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DISYXQ between", value1, value2, "disyxq");
            return (Criteria) this;
        }

        public Criteria andDisyxqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DISYXQ not between", value1, value2, "disyxq");
            return (Criteria) this;
        }

        public Criteria andGuoscqIsNull() {
            addCriterion("GUOSCQ is null");
            return (Criteria) this;
        }

        public Criteria andGuoscqIsNotNull() {
            addCriterion("GUOSCQ is not null");
            return (Criteria) this;
        }

        public Criteria andGuoscqEqualTo(String value) {
            addCriterion("GUOSCQ =", value, "guoscq");
            return (Criteria) this;
        }

        public Criteria andGuoscqNotEqualTo(String value) {
            addCriterion("GUOSCQ <>", value, "guoscq");
            return (Criteria) this;
        }

        public Criteria andGuoscqGreaterThan(String value) {
            addCriterion("GUOSCQ >", value, "guoscq");
            return (Criteria) this;
        }

        public Criteria andGuoscqGreaterThanOrEqualTo(String value) {
            addCriterion("GUOSCQ >=", value, "guoscq");
            return (Criteria) this;
        }

        public Criteria andGuoscqLessThan(String value) {
            addCriterion("GUOSCQ <", value, "guoscq");
            return (Criteria) this;
        }

        public Criteria andGuoscqLessThanOrEqualTo(String value) {
            addCriterion("GUOSCQ <=", value, "guoscq");
            return (Criteria) this;
        }

        public Criteria andGuoscqLike(String value) {
            addCriterion("GUOSCQ like", value, "guoscq");
            return (Criteria) this;
        }

        public Criteria andGuoscqNotLike(String value) {
            addCriterion("GUOSCQ not like", value, "guoscq");
            return (Criteria) this;
        }

        public Criteria andGuoscqIn(List<String> values) {
            addCriterion("GUOSCQ in", values, "guoscq");
            return (Criteria) this;
        }

        public Criteria andGuoscqNotIn(List<String> values) {
            addCriterion("GUOSCQ not in", values, "guoscq");
            return (Criteria) this;
        }

        public Criteria andGuoscqBetween(String value1, String value2) {
            addCriterion("GUOSCQ between", value1, value2, "guoscq");
            return (Criteria) this;
        }

        public Criteria andGuoscqNotBetween(String value1, String value2) {
            addCriterion("GUOSCQ not between", value1, value2, "guoscq");
            return (Criteria) this;
        }

        public Criteria andDiscqIsNull() {
            addCriterion("DISCQ is null");
            return (Criteria) this;
        }

        public Criteria andDiscqIsNotNull() {
            addCriterion("DISCQ is not null");
            return (Criteria) this;
        }

        public Criteria andDiscqEqualTo(String value) {
            addCriterion("DISCQ =", value, "discq");
            return (Criteria) this;
        }

        public Criteria andDiscqNotEqualTo(String value) {
            addCriterion("DISCQ <>", value, "discq");
            return (Criteria) this;
        }

        public Criteria andDiscqGreaterThan(String value) {
            addCriterion("DISCQ >", value, "discq");
            return (Criteria) this;
        }

        public Criteria andDiscqGreaterThanOrEqualTo(String value) {
            addCriterion("DISCQ >=", value, "discq");
            return (Criteria) this;
        }

        public Criteria andDiscqLessThan(String value) {
            addCriterion("DISCQ <", value, "discq");
            return (Criteria) this;
        }

        public Criteria andDiscqLessThanOrEqualTo(String value) {
            addCriterion("DISCQ <=", value, "discq");
            return (Criteria) this;
        }

        public Criteria andDiscqLike(String value) {
            addCriterion("DISCQ like", value, "discq");
            return (Criteria) this;
        }

        public Criteria andDiscqNotLike(String value) {
            addCriterion("DISCQ not like", value, "discq");
            return (Criteria) this;
        }

        public Criteria andDiscqIn(List<String> values) {
            addCriterion("DISCQ in", values, "discq");
            return (Criteria) this;
        }

        public Criteria andDiscqNotIn(List<String> values) {
            addCriterion("DISCQ not in", values, "discq");
            return (Criteria) this;
        }

        public Criteria andDiscqBetween(String value1, String value2) {
            addCriterion("DISCQ between", value1, value2, "discq");
            return (Criteria) this;
        }

        public Criteria andDiscqNotBetween(String value1, String value2) {
            addCriterion("DISCQ not between", value1, value2, "discq");
            return (Criteria) this;
        }

        public Criteria andZhanghxzIsNull() {
            addCriterion("ZHANGHXZ is null");
            return (Criteria) this;
        }

        public Criteria andZhanghxzIsNotNull() {
            addCriterion("ZHANGHXZ is not null");
            return (Criteria) this;
        }

        public Criteria andZhanghxzEqualTo(Object value) {
            addCriterion("ZHANGHXZ =", value, "zhanghxz");
            return (Criteria) this;
        }

        public Criteria andZhanghxzNotEqualTo(Object value) {
            addCriterion("ZHANGHXZ <>", value, "zhanghxz");
            return (Criteria) this;
        }

        public Criteria andZhanghxzGreaterThan(Object value) {
            addCriterion("ZHANGHXZ >", value, "zhanghxz");
            return (Criteria) this;
        }

        public Criteria andZhanghxzGreaterThanOrEqualTo(Object value) {
            addCriterion("ZHANGHXZ >=", value, "zhanghxz");
            return (Criteria) this;
        }

        public Criteria andZhanghxzLessThan(Object value) {
            addCriterion("ZHANGHXZ <", value, "zhanghxz");
            return (Criteria) this;
        }

        public Criteria andZhanghxzLessThanOrEqualTo(Object value) {
            addCriterion("ZHANGHXZ <=", value, "zhanghxz");
            return (Criteria) this;
        }

        public Criteria andZhanghxzIn(List<Object> values) {
            addCriterion("ZHANGHXZ in", values, "zhanghxz");
            return (Criteria) this;
        }

        public Criteria andZhanghxzNotIn(List<Object> values) {
            addCriterion("ZHANGHXZ not in", values, "zhanghxz");
            return (Criteria) this;
        }

        public Criteria andZhanghxzBetween(Object value1, Object value2) {
            addCriterion("ZHANGHXZ between", value1, value2, "zhanghxz");
            return (Criteria) this;
        }

        public Criteria andZhanghxzNotBetween(Object value1, Object value2) {
            addCriterion("ZHANGHXZ not between", value1, value2, "zhanghxz");
            return (Criteria) this;
        }

        public Criteria andZijxzIsNull() {
            addCriterion("ZIJXZ is null");
            return (Criteria) this;
        }

        public Criteria andZijxzIsNotNull() {
            addCriterion("ZIJXZ is not null");
            return (Criteria) this;
        }

        public Criteria andZijxzEqualTo(Object value) {
            addCriterion("ZIJXZ =", value, "zijxz");
            return (Criteria) this;
        }

        public Criteria andZijxzNotEqualTo(Object value) {
            addCriterion("ZIJXZ <>", value, "zijxz");
            return (Criteria) this;
        }

        public Criteria andZijxzGreaterThan(Object value) {
            addCriterion("ZIJXZ >", value, "zijxz");
            return (Criteria) this;
        }

        public Criteria andZijxzGreaterThanOrEqualTo(Object value) {
            addCriterion("ZIJXZ >=", value, "zijxz");
            return (Criteria) this;
        }

        public Criteria andZijxzLessThan(Object value) {
            addCriterion("ZIJXZ <", value, "zijxz");
            return (Criteria) this;
        }

        public Criteria andZijxzLessThanOrEqualTo(Object value) {
            addCriterion("ZIJXZ <=", value, "zijxz");
            return (Criteria) this;
        }

        public Criteria andZijxzIn(List<Object> values) {
            addCriterion("ZIJXZ in", values, "zijxz");
            return (Criteria) this;
        }

        public Criteria andZijxzNotIn(List<Object> values) {
            addCriterion("ZIJXZ not in", values, "zijxz");
            return (Criteria) this;
        }

        public Criteria andZijxzBetween(Object value1, Object value2) {
            addCriterion("ZIJXZ between", value1, value2, "zijxz");
            return (Criteria) this;
        }

        public Criteria andZijxzNotBetween(Object value1, Object value2) {
            addCriterion("ZIJXZ not between", value1, value2, "zijxz");
            return (Criteria) this;
        }

        public Criteria andZijyxqIsNull() {
            addCriterion("ZIJYXQ is null");
            return (Criteria) this;
        }

        public Criteria andZijyxqIsNotNull() {
            addCriterion("ZIJYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andZijyxqEqualTo(Date value) {
            addCriterionForJDBCDate("ZIJYXQ =", value, "zijyxq");
            return (Criteria) this;
        }

        public Criteria andZijyxqNotEqualTo(Date value) {
            addCriterionForJDBCDate("ZIJYXQ <>", value, "zijyxq");
            return (Criteria) this;
        }

        public Criteria andZijyxqGreaterThan(Date value) {
            addCriterionForJDBCDate("ZIJYXQ >", value, "zijyxq");
            return (Criteria) this;
        }

        public Criteria andZijyxqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZIJYXQ >=", value, "zijyxq");
            return (Criteria) this;
        }

        public Criteria andZijyxqLessThan(Date value) {
            addCriterionForJDBCDate("ZIJYXQ <", value, "zijyxq");
            return (Criteria) this;
        }

        public Criteria andZijyxqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZIJYXQ <=", value, "zijyxq");
            return (Criteria) this;
        }

        public Criteria andZijyxqIn(List<Date> values) {
            addCriterionForJDBCDate("ZIJYXQ in", values, "zijyxq");
            return (Criteria) this;
        }

        public Criteria andZijyxqNotIn(List<Date> values) {
            addCriterionForJDBCDate("ZIJYXQ not in", values, "zijyxq");
            return (Criteria) this;
        }

        public Criteria andZijyxqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZIJYXQ between", value1, value2, "zijyxq");
            return (Criteria) this;
        }

        public Criteria andZijyxqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZIJYXQ not between", value1, value2, "zijyxq");
            return (Criteria) this;
        }

        public Criteria andShangjfrhzgdwmcIsNull() {
            addCriterion("SHANGJFRHZGDWMC is null");
            return (Criteria) this;
        }

        public Criteria andShangjfrhzgdwmcIsNotNull() {
            addCriterion("SHANGJFRHZGDWMC is not null");
            return (Criteria) this;
        }

        public Criteria andShangjfrhzgdwmcEqualTo(String value) {
            addCriterion("SHANGJFRHZGDWMC =", value, "shangjfrhzgdwmc");
            return (Criteria) this;
        }

        public Criteria andShangjfrhzgdwmcNotEqualTo(String value) {
            addCriterion("SHANGJFRHZGDWMC <>", value, "shangjfrhzgdwmc");
            return (Criteria) this;
        }

        public Criteria andShangjfrhzgdwmcGreaterThan(String value) {
            addCriterion("SHANGJFRHZGDWMC >", value, "shangjfrhzgdwmc");
            return (Criteria) this;
        }

        public Criteria andShangjfrhzgdwmcGreaterThanOrEqualTo(String value) {
            addCriterion("SHANGJFRHZGDWMC >=", value, "shangjfrhzgdwmc");
            return (Criteria) this;
        }

        public Criteria andShangjfrhzgdwmcLessThan(String value) {
            addCriterion("SHANGJFRHZGDWMC <", value, "shangjfrhzgdwmc");
            return (Criteria) this;
        }

        public Criteria andShangjfrhzgdwmcLessThanOrEqualTo(String value) {
            addCriterion("SHANGJFRHZGDWMC <=", value, "shangjfrhzgdwmc");
            return (Criteria) this;
        }

        public Criteria andShangjfrhzgdwmcLike(String value) {
            addCriterion("SHANGJFRHZGDWMC like", value, "shangjfrhzgdwmc");
            return (Criteria) this;
        }

        public Criteria andShangjfrhzgdwmcNotLike(String value) {
            addCriterion("SHANGJFRHZGDWMC not like", value, "shangjfrhzgdwmc");
            return (Criteria) this;
        }

        public Criteria andShangjfrhzgdwmcIn(List<String> values) {
            addCriterion("SHANGJFRHZGDWMC in", values, "shangjfrhzgdwmc");
            return (Criteria) this;
        }

        public Criteria andShangjfrhzgdwmcNotIn(List<String> values) {
            addCriterion("SHANGJFRHZGDWMC not in", values, "shangjfrhzgdwmc");
            return (Criteria) this;
        }

        public Criteria andShangjfrhzgdwmcBetween(String value1, String value2) {
            addCriterion("SHANGJFRHZGDWMC between", value1, value2, "shangjfrhzgdwmc");
            return (Criteria) this;
        }

        public Criteria andShangjfrhzgdwmcNotBetween(String value1, String value2) {
            addCriterion("SHANGJFRHZGDWMC not between", value1, value2, "shangjfrhzgdwmc");
            return (Criteria) this;
        }

        public Criteria andJibckzhkhxkzhzhIsNull() {
            addCriterion("JIBCKZHKHXKZHZH is null");
            return (Criteria) this;
        }

        public Criteria andJibckzhkhxkzhzhIsNotNull() {
            addCriterion("JIBCKZHKHXKZHZH is not null");
            return (Criteria) this;
        }

        public Criteria andJibckzhkhxkzhzhEqualTo(String value) {
            addCriterion("JIBCKZHKHXKZHZH =", value, "jibckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andJibckzhkhxkzhzhNotEqualTo(String value) {
            addCriterion("JIBCKZHKHXKZHZH <>", value, "jibckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andJibckzhkhxkzhzhGreaterThan(String value) {
            addCriterion("JIBCKZHKHXKZHZH >", value, "jibckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andJibckzhkhxkzhzhGreaterThanOrEqualTo(String value) {
            addCriterion("JIBCKZHKHXKZHZH >=", value, "jibckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andJibckzhkhxkzhzhLessThan(String value) {
            addCriterion("JIBCKZHKHXKZHZH <", value, "jibckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andJibckzhkhxkzhzhLessThanOrEqualTo(String value) {
            addCriterion("JIBCKZHKHXKZHZH <=", value, "jibckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andJibckzhkhxkzhzhLike(String value) {
            addCriterion("JIBCKZHKHXKZHZH like", value, "jibckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andJibckzhkhxkzhzhNotLike(String value) {
            addCriterion("JIBCKZHKHXKZHZH not like", value, "jibckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andJibckzhkhxkzhzhIn(List<String> values) {
            addCriterion("JIBCKZHKHXKZHZH in", values, "jibckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andJibckzhkhxkzhzhNotIn(List<String> values) {
            addCriterion("JIBCKZHKHXKZHZH not in", values, "jibckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andJibckzhkhxkzhzhBetween(String value1, String value2) {
            addCriterion("JIBCKZHKHXKZHZH between", value1, value2, "jibckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andJibckzhkhxkzhzhNotBetween(String value1, String value2) {
            addCriterion("JIBCKZHKHXKZHZH not between", value1, value2, "jibckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andShangjzzjgdmIsNull() {
            addCriterion("SHANGJZZJGDM is null");
            return (Criteria) this;
        }

        public Criteria andShangjzzjgdmIsNotNull() {
            addCriterion("SHANGJZZJGDM is not null");
            return (Criteria) this;
        }

        public Criteria andShangjzzjgdmEqualTo(String value) {
            addCriterion("SHANGJZZJGDM =", value, "shangjzzjgdm");
            return (Criteria) this;
        }

        public Criteria andShangjzzjgdmNotEqualTo(String value) {
            addCriterion("SHANGJZZJGDM <>", value, "shangjzzjgdm");
            return (Criteria) this;
        }

        public Criteria andShangjzzjgdmGreaterThan(String value) {
            addCriterion("SHANGJZZJGDM >", value, "shangjzzjgdm");
            return (Criteria) this;
        }

        public Criteria andShangjzzjgdmGreaterThanOrEqualTo(String value) {
            addCriterion("SHANGJZZJGDM >=", value, "shangjzzjgdm");
            return (Criteria) this;
        }

        public Criteria andShangjzzjgdmLessThan(String value) {
            addCriterion("SHANGJZZJGDM <", value, "shangjzzjgdm");
            return (Criteria) this;
        }

        public Criteria andShangjzzjgdmLessThanOrEqualTo(String value) {
            addCriterion("SHANGJZZJGDM <=", value, "shangjzzjgdm");
            return (Criteria) this;
        }

        public Criteria andShangjzzjgdmLike(String value) {
            addCriterion("SHANGJZZJGDM like", value, "shangjzzjgdm");
            return (Criteria) this;
        }

        public Criteria andShangjzzjgdmNotLike(String value) {
            addCriterion("SHANGJZZJGDM not like", value, "shangjzzjgdm");
            return (Criteria) this;
        }

        public Criteria andShangjzzjgdmIn(List<String> values) {
            addCriterion("SHANGJZZJGDM in", values, "shangjzzjgdm");
            return (Criteria) this;
        }

        public Criteria andShangjzzjgdmNotIn(List<String> values) {
            addCriterion("SHANGJZZJGDM not in", values, "shangjzzjgdm");
            return (Criteria) this;
        }

        public Criteria andShangjzzjgdmBetween(String value1, String value2) {
            addCriterion("SHANGJZZJGDM between", value1, value2, "shangjzzjgdm");
            return (Criteria) this;
        }

        public Criteria andShangjzzjgdmNotBetween(String value1, String value2) {
            addCriterion("SHANGJZZJGDM not between", value1, value2, "shangjzzjgdm");
            return (Criteria) this;
        }

        public Criteria andShangjrylbIsNull() {
            addCriterion("SHANGJRYLB is null");
            return (Criteria) this;
        }

        public Criteria andShangjrylbIsNotNull() {
            addCriterion("SHANGJRYLB is not null");
            return (Criteria) this;
        }

        public Criteria andShangjrylbEqualTo(Object value) {
            addCriterion("SHANGJRYLB =", value, "shangjrylb");
            return (Criteria) this;
        }

        public Criteria andShangjrylbNotEqualTo(Object value) {
            addCriterion("SHANGJRYLB <>", value, "shangjrylb");
            return (Criteria) this;
        }

        public Criteria andShangjrylbGreaterThan(Object value) {
            addCriterion("SHANGJRYLB >", value, "shangjrylb");
            return (Criteria) this;
        }

        public Criteria andShangjrylbGreaterThanOrEqualTo(Object value) {
            addCriterion("SHANGJRYLB >=", value, "shangjrylb");
            return (Criteria) this;
        }

        public Criteria andShangjrylbLessThan(Object value) {
            addCriterion("SHANGJRYLB <", value, "shangjrylb");
            return (Criteria) this;
        }

        public Criteria andShangjrylbLessThanOrEqualTo(Object value) {
            addCriterion("SHANGJRYLB <=", value, "shangjrylb");
            return (Criteria) this;
        }

        public Criteria andShangjrylbIn(List<Object> values) {
            addCriterion("SHANGJRYLB in", values, "shangjrylb");
            return (Criteria) this;
        }

        public Criteria andShangjrylbNotIn(List<Object> values) {
            addCriterion("SHANGJRYLB not in", values, "shangjrylb");
            return (Criteria) this;
        }

        public Criteria andShangjrylbBetween(Object value1, Object value2) {
            addCriterion("SHANGJRYLB between", value1, value2, "shangjrylb");
            return (Criteria) this;
        }

        public Criteria andShangjrylbNotBetween(Object value1, Object value2) {
            addCriterion("SHANGJRYLB not between", value1, value2, "shangjrylb");
            return (Criteria) this;
        }

        public Criteria andShangjfddbrIsNull() {
            addCriterion("SHANGJFDDBR is null");
            return (Criteria) this;
        }

        public Criteria andShangjfddbrIsNotNull() {
            addCriterion("SHANGJFDDBR is not null");
            return (Criteria) this;
        }

        public Criteria andShangjfddbrEqualTo(String value) {
            addCriterion("SHANGJFDDBR =", value, "shangjfddbr");
            return (Criteria) this;
        }

        public Criteria andShangjfddbrNotEqualTo(String value) {
            addCriterion("SHANGJFDDBR <>", value, "shangjfddbr");
            return (Criteria) this;
        }

        public Criteria andShangjfddbrGreaterThan(String value) {
            addCriterion("SHANGJFDDBR >", value, "shangjfddbr");
            return (Criteria) this;
        }

        public Criteria andShangjfddbrGreaterThanOrEqualTo(String value) {
            addCriterion("SHANGJFDDBR >=", value, "shangjfddbr");
            return (Criteria) this;
        }

        public Criteria andShangjfddbrLessThan(String value) {
            addCriterion("SHANGJFDDBR <", value, "shangjfddbr");
            return (Criteria) this;
        }

        public Criteria andShangjfddbrLessThanOrEqualTo(String value) {
            addCriterion("SHANGJFDDBR <=", value, "shangjfddbr");
            return (Criteria) this;
        }

        public Criteria andShangjfddbrLike(String value) {
            addCriterion("SHANGJFDDBR like", value, "shangjfddbr");
            return (Criteria) this;
        }

        public Criteria andShangjfddbrNotLike(String value) {
            addCriterion("SHANGJFDDBR not like", value, "shangjfddbr");
            return (Criteria) this;
        }

        public Criteria andShangjfddbrIn(List<String> values) {
            addCriterion("SHANGJFDDBR in", values, "shangjfddbr");
            return (Criteria) this;
        }

        public Criteria andShangjfddbrNotIn(List<String> values) {
            addCriterion("SHANGJFDDBR not in", values, "shangjfddbr");
            return (Criteria) this;
        }

        public Criteria andShangjfddbrBetween(String value1, String value2) {
            addCriterion("SHANGJFDDBR between", value1, value2, "shangjfddbr");
            return (Criteria) this;
        }

        public Criteria andShangjfddbrNotBetween(String value1, String value2) {
            addCriterion("SHANGJFDDBR not between", value1, value2, "shangjfddbr");
            return (Criteria) this;
        }

        public Criteria andShangjdwfzrIsNull() {
            addCriterion("SHANGJDWFZR is null");
            return (Criteria) this;
        }

        public Criteria andShangjdwfzrIsNotNull() {
            addCriterion("SHANGJDWFZR is not null");
            return (Criteria) this;
        }

        public Criteria andShangjdwfzrEqualTo(String value) {
            addCriterion("SHANGJDWFZR =", value, "shangjdwfzr");
            return (Criteria) this;
        }

        public Criteria andShangjdwfzrNotEqualTo(String value) {
            addCriterion("SHANGJDWFZR <>", value, "shangjdwfzr");
            return (Criteria) this;
        }

        public Criteria andShangjdwfzrGreaterThan(String value) {
            addCriterion("SHANGJDWFZR >", value, "shangjdwfzr");
            return (Criteria) this;
        }

        public Criteria andShangjdwfzrGreaterThanOrEqualTo(String value) {
            addCriterion("SHANGJDWFZR >=", value, "shangjdwfzr");
            return (Criteria) this;
        }

        public Criteria andShangjdwfzrLessThan(String value) {
            addCriterion("SHANGJDWFZR <", value, "shangjdwfzr");
            return (Criteria) this;
        }

        public Criteria andShangjdwfzrLessThanOrEqualTo(String value) {
            addCriterion("SHANGJDWFZR <=", value, "shangjdwfzr");
            return (Criteria) this;
        }

        public Criteria andShangjdwfzrLike(String value) {
            addCriterion("SHANGJDWFZR like", value, "shangjdwfzr");
            return (Criteria) this;
        }

        public Criteria andShangjdwfzrNotLike(String value) {
            addCriterion("SHANGJDWFZR not like", value, "shangjdwfzr");
            return (Criteria) this;
        }

        public Criteria andShangjdwfzrIn(List<String> values) {
            addCriterion("SHANGJDWFZR in", values, "shangjdwfzr");
            return (Criteria) this;
        }

        public Criteria andShangjdwfzrNotIn(List<String> values) {
            addCriterion("SHANGJDWFZR not in", values, "shangjdwfzr");
            return (Criteria) this;
        }

        public Criteria andShangjdwfzrBetween(String value1, String value2) {
            addCriterion("SHANGJDWFZR between", value1, value2, "shangjdwfzr");
            return (Criteria) this;
        }

        public Criteria andShangjdwfzrNotBetween(String value1, String value2) {
            addCriterion("SHANGJDWFZR not between", value1, value2, "shangjdwfzr");
            return (Criteria) this;
        }

        public Criteria andShangjxmIsNull() {
            addCriterion("SHANGJXM is null");
            return (Criteria) this;
        }

        public Criteria andShangjxmIsNotNull() {
            addCriterion("SHANGJXM is not null");
            return (Criteria) this;
        }

        public Criteria andShangjxmEqualTo(String value) {
            addCriterion("SHANGJXM =", value, "shangjxm");
            return (Criteria) this;
        }

        public Criteria andShangjxmNotEqualTo(String value) {
            addCriterion("SHANGJXM <>", value, "shangjxm");
            return (Criteria) this;
        }

        public Criteria andShangjxmGreaterThan(String value) {
            addCriterion("SHANGJXM >", value, "shangjxm");
            return (Criteria) this;
        }

        public Criteria andShangjxmGreaterThanOrEqualTo(String value) {
            addCriterion("SHANGJXM >=", value, "shangjxm");
            return (Criteria) this;
        }

        public Criteria andShangjxmLessThan(String value) {
            addCriterion("SHANGJXM <", value, "shangjxm");
            return (Criteria) this;
        }

        public Criteria andShangjxmLessThanOrEqualTo(String value) {
            addCriterion("SHANGJXM <=", value, "shangjxm");
            return (Criteria) this;
        }

        public Criteria andShangjxmLike(String value) {
            addCriterion("SHANGJXM like", value, "shangjxm");
            return (Criteria) this;
        }

        public Criteria andShangjxmNotLike(String value) {
            addCriterion("SHANGJXM not like", value, "shangjxm");
            return (Criteria) this;
        }

        public Criteria andShangjxmIn(List<String> values) {
            addCriterion("SHANGJXM in", values, "shangjxm");
            return (Criteria) this;
        }

        public Criteria andShangjxmNotIn(List<String> values) {
            addCriterion("SHANGJXM not in", values, "shangjxm");
            return (Criteria) this;
        }

        public Criteria andShangjxmBetween(String value1, String value2) {
            addCriterion("SHANGJXM between", value1, value2, "shangjxm");
            return (Criteria) this;
        }

        public Criteria andShangjxmNotBetween(String value1, String value2) {
            addCriterion("SHANGJXM not between", value1, value2, "shangjxm");
            return (Criteria) this;
        }

        public Criteria andShangjzjzlIsNull() {
            addCriterion("SHANGJZJZL is null");
            return (Criteria) this;
        }

        public Criteria andShangjzjzlIsNotNull() {
            addCriterion("SHANGJZJZL is not null");
            return (Criteria) this;
        }

        public Criteria andShangjzjzlEqualTo(Object value) {
            addCriterion("SHANGJZJZL =", value, "shangjzjzl");
            return (Criteria) this;
        }

        public Criteria andShangjzjzlNotEqualTo(Object value) {
            addCriterion("SHANGJZJZL <>", value, "shangjzjzl");
            return (Criteria) this;
        }

        public Criteria andShangjzjzlGreaterThan(Object value) {
            addCriterion("SHANGJZJZL >", value, "shangjzjzl");
            return (Criteria) this;
        }

        public Criteria andShangjzjzlGreaterThanOrEqualTo(Object value) {
            addCriterion("SHANGJZJZL >=", value, "shangjzjzl");
            return (Criteria) this;
        }

        public Criteria andShangjzjzlLessThan(Object value) {
            addCriterion("SHANGJZJZL <", value, "shangjzjzl");
            return (Criteria) this;
        }

        public Criteria andShangjzjzlLessThanOrEqualTo(Object value) {
            addCriterion("SHANGJZJZL <=", value, "shangjzjzl");
            return (Criteria) this;
        }

        public Criteria andShangjzjzlIn(List<Object> values) {
            addCriterion("SHANGJZJZL in", values, "shangjzjzl");
            return (Criteria) this;
        }

        public Criteria andShangjzjzlNotIn(List<Object> values) {
            addCriterion("SHANGJZJZL not in", values, "shangjzjzl");
            return (Criteria) this;
        }

        public Criteria andShangjzjzlBetween(Object value1, Object value2) {
            addCriterion("SHANGJZJZL between", value1, value2, "shangjzjzl");
            return (Criteria) this;
        }

        public Criteria andShangjzjzlNotBetween(Object value1, Object value2) {
            addCriterion("SHANGJZJZL not between", value1, value2, "shangjzjzl");
            return (Criteria) this;
        }

        public Criteria andShangjzjhmIsNull() {
            addCriterion("SHANGJZJHM is null");
            return (Criteria) this;
        }

        public Criteria andShangjzjhmIsNotNull() {
            addCriterion("SHANGJZJHM is not null");
            return (Criteria) this;
        }

        public Criteria andShangjzjhmEqualTo(String value) {
            addCriterion("SHANGJZJHM =", value, "shangjzjhm");
            return (Criteria) this;
        }

        public Criteria andShangjzjhmNotEqualTo(String value) {
            addCriterion("SHANGJZJHM <>", value, "shangjzjhm");
            return (Criteria) this;
        }

        public Criteria andShangjzjhmGreaterThan(String value) {
            addCriterion("SHANGJZJHM >", value, "shangjzjhm");
            return (Criteria) this;
        }

        public Criteria andShangjzjhmGreaterThanOrEqualTo(String value) {
            addCriterion("SHANGJZJHM >=", value, "shangjzjhm");
            return (Criteria) this;
        }

        public Criteria andShangjzjhmLessThan(String value) {
            addCriterion("SHANGJZJHM <", value, "shangjzjhm");
            return (Criteria) this;
        }

        public Criteria andShangjzjhmLessThanOrEqualTo(String value) {
            addCriterion("SHANGJZJHM <=", value, "shangjzjhm");
            return (Criteria) this;
        }

        public Criteria andShangjzjhmLike(String value) {
            addCriterion("SHANGJZJHM like", value, "shangjzjhm");
            return (Criteria) this;
        }

        public Criteria andShangjzjhmNotLike(String value) {
            addCriterion("SHANGJZJHM not like", value, "shangjzjhm");
            return (Criteria) this;
        }

        public Criteria andShangjzjhmIn(List<String> values) {
            addCriterion("SHANGJZJHM in", values, "shangjzjhm");
            return (Criteria) this;
        }

        public Criteria andShangjzjhmNotIn(List<String> values) {
            addCriterion("SHANGJZJHM not in", values, "shangjzjhm");
            return (Criteria) this;
        }

        public Criteria andShangjzjhmBetween(String value1, String value2) {
            addCriterion("SHANGJZJHM between", value1, value2, "shangjzjhm");
            return (Criteria) this;
        }

        public Criteria andShangjzjhmNotBetween(String value1, String value2) {
            addCriterion("SHANGJZJHM not between", value1, value2, "shangjzjhm");
            return (Criteria) this;
        }

        public Criteria andKaihyxmcIsNull() {
            addCriterion("KAIHYXMC is null");
            return (Criteria) this;
        }

        public Criteria andKaihyxmcIsNotNull() {
            addCriterion("KAIHYXMC is not null");
            return (Criteria) this;
        }

        public Criteria andKaihyxmcEqualTo(String value) {
            addCriterion("KAIHYXMC =", value, "kaihyxmc");
            return (Criteria) this;
        }

        public Criteria andKaihyxmcNotEqualTo(String value) {
            addCriterion("KAIHYXMC <>", value, "kaihyxmc");
            return (Criteria) this;
        }

        public Criteria andKaihyxmcGreaterThan(String value) {
            addCriterion("KAIHYXMC >", value, "kaihyxmc");
            return (Criteria) this;
        }

        public Criteria andKaihyxmcGreaterThanOrEqualTo(String value) {
            addCriterion("KAIHYXMC >=", value, "kaihyxmc");
            return (Criteria) this;
        }

        public Criteria andKaihyxmcLessThan(String value) {
            addCriterion("KAIHYXMC <", value, "kaihyxmc");
            return (Criteria) this;
        }

        public Criteria andKaihyxmcLessThanOrEqualTo(String value) {
            addCriterion("KAIHYXMC <=", value, "kaihyxmc");
            return (Criteria) this;
        }

        public Criteria andKaihyxmcLike(String value) {
            addCriterion("KAIHYXMC like", value, "kaihyxmc");
            return (Criteria) this;
        }

        public Criteria andKaihyxmcNotLike(String value) {
            addCriterion("KAIHYXMC not like", value, "kaihyxmc");
            return (Criteria) this;
        }

        public Criteria andKaihyxmcIn(List<String> values) {
            addCriterion("KAIHYXMC in", values, "kaihyxmc");
            return (Criteria) this;
        }

        public Criteria andKaihyxmcNotIn(List<String> values) {
            addCriterion("KAIHYXMC not in", values, "kaihyxmc");
            return (Criteria) this;
        }

        public Criteria andKaihyxmcBetween(String value1, String value2) {
            addCriterion("KAIHYXMC between", value1, value2, "kaihyxmc");
            return (Criteria) this;
        }

        public Criteria andKaihyxmcNotBetween(String value1, String value2) {
            addCriterion("KAIHYXMC not between", value1, value2, "kaihyxmc");
            return (Criteria) this;
        }

        public Criteria andKaihyxdmIsNull() {
            addCriterion("KAIHYXDM is null");
            return (Criteria) this;
        }

        public Criteria andKaihyxdmIsNotNull() {
            addCriterion("KAIHYXDM is not null");
            return (Criteria) this;
        }

        public Criteria andKaihyxdmEqualTo(String value) {
            addCriterion("KAIHYXDM =", value, "kaihyxdm");
            return (Criteria) this;
        }

        public Criteria andKaihyxdmNotEqualTo(String value) {
            addCriterion("KAIHYXDM <>", value, "kaihyxdm");
            return (Criteria) this;
        }

        public Criteria andKaihyxdmGreaterThan(String value) {
            addCriterion("KAIHYXDM >", value, "kaihyxdm");
            return (Criteria) this;
        }

        public Criteria andKaihyxdmGreaterThanOrEqualTo(String value) {
            addCriterion("KAIHYXDM >=", value, "kaihyxdm");
            return (Criteria) this;
        }

        public Criteria andKaihyxdmLessThan(String value) {
            addCriterion("KAIHYXDM <", value, "kaihyxdm");
            return (Criteria) this;
        }

        public Criteria andKaihyxdmLessThanOrEqualTo(String value) {
            addCriterion("KAIHYXDM <=", value, "kaihyxdm");
            return (Criteria) this;
        }

        public Criteria andKaihyxdmLike(String value) {
            addCriterion("KAIHYXDM like", value, "kaihyxdm");
            return (Criteria) this;
        }

        public Criteria andKaihyxdmNotLike(String value) {
            addCriterion("KAIHYXDM not like", value, "kaihyxdm");
            return (Criteria) this;
        }

        public Criteria andKaihyxdmIn(List<String> values) {
            addCriterion("KAIHYXDM in", values, "kaihyxdm");
            return (Criteria) this;
        }

        public Criteria andKaihyxdmNotIn(List<String> values) {
            addCriterion("KAIHYXDM not in", values, "kaihyxdm");
            return (Criteria) this;
        }

        public Criteria andKaihyxdmBetween(String value1, String value2) {
            addCriterion("KAIHYXDM between", value1, value2, "kaihyxdm");
            return (Criteria) this;
        }

        public Criteria andKaihyxdmNotBetween(String value1, String value2) {
            addCriterion("KAIHYXDM not between", value1, value2, "kaihyxdm");
            return (Criteria) this;
        }

        public Criteria andZhanghmcIsNull() {
            addCriterion("ZHANGHMC is null");
            return (Criteria) this;
        }

        public Criteria andZhanghmcIsNotNull() {
            addCriterion("ZHANGHMC is not null");
            return (Criteria) this;
        }

        public Criteria andZhanghmcEqualTo(String value) {
            addCriterion("ZHANGHMC =", value, "zhanghmc");
            return (Criteria) this;
        }

        public Criteria andZhanghmcNotEqualTo(String value) {
            addCriterion("ZHANGHMC <>", value, "zhanghmc");
            return (Criteria) this;
        }

        public Criteria andZhanghmcGreaterThan(String value) {
            addCriterion("ZHANGHMC >", value, "zhanghmc");
            return (Criteria) this;
        }

        public Criteria andZhanghmcGreaterThanOrEqualTo(String value) {
            addCriterion("ZHANGHMC >=", value, "zhanghmc");
            return (Criteria) this;
        }

        public Criteria andZhanghmcLessThan(String value) {
            addCriterion("ZHANGHMC <", value, "zhanghmc");
            return (Criteria) this;
        }

        public Criteria andZhanghmcLessThanOrEqualTo(String value) {
            addCriterion("ZHANGHMC <=", value, "zhanghmc");
            return (Criteria) this;
        }

        public Criteria andZhanghmcLike(String value) {
            addCriterion("ZHANGHMC like", value, "zhanghmc");
            return (Criteria) this;
        }

        public Criteria andZhanghmcNotLike(String value) {
            addCriterion("ZHANGHMC not like", value, "zhanghmc");
            return (Criteria) this;
        }

        public Criteria andZhanghmcIn(List<String> values) {
            addCriterion("ZHANGHMC in", values, "zhanghmc");
            return (Criteria) this;
        }

        public Criteria andZhanghmcNotIn(List<String> values) {
            addCriterion("ZHANGHMC not in", values, "zhanghmc");
            return (Criteria) this;
        }

        public Criteria andZhanghmcBetween(String value1, String value2) {
            addCriterion("ZHANGHMC between", value1, value2, "zhanghmc");
            return (Criteria) this;
        }

        public Criteria andZhanghmcNotBetween(String value1, String value2) {
            addCriterion("ZHANGHMC not between", value1, value2, "zhanghmc");
            return (Criteria) this;
        }

        public Criteria andZhanghIsNull() {
            addCriterion("ZHANGH is null");
            return (Criteria) this;
        }

        public Criteria andZhanghIsNotNull() {
            addCriterion("ZHANGH is not null");
            return (Criteria) this;
        }

        public Criteria andZhanghEqualTo(String value) {
            addCriterion("ZHANGH =", value, "zhangh");
            return (Criteria) this;
        }

        public Criteria andZhanghNotEqualTo(String value) {
            addCriterion("ZHANGH <>", value, "zhangh");
            return (Criteria) this;
        }

        public Criteria andZhanghGreaterThan(String value) {
            addCriterion("ZHANGH >", value, "zhangh");
            return (Criteria) this;
        }

        public Criteria andZhanghGreaterThanOrEqualTo(String value) {
            addCriterion("ZHANGH >=", value, "zhangh");
            return (Criteria) this;
        }

        public Criteria andZhanghLessThan(String value) {
            addCriterion("ZHANGH <", value, "zhangh");
            return (Criteria) this;
        }

        public Criteria andZhanghLessThanOrEqualTo(String value) {
            addCriterion("ZHANGH <=", value, "zhangh");
            return (Criteria) this;
        }

        public Criteria andZhanghLike(String value) {
            addCriterion("ZHANGH like", value, "zhangh");
            return (Criteria) this;
        }

        public Criteria andZhanghNotLike(String value) {
            addCriterion("ZHANGH not like", value, "zhangh");
            return (Criteria) this;
        }

        public Criteria andZhanghIn(List<String> values) {
            addCriterion("ZHANGH in", values, "zhangh");
            return (Criteria) this;
        }

        public Criteria andZhanghNotIn(List<String> values) {
            addCriterion("ZHANGH not in", values, "zhangh");
            return (Criteria) this;
        }

        public Criteria andZhanghBetween(String value1, String value2) {
            addCriterion("ZHANGH between", value1, value2, "zhangh");
            return (Criteria) this;
        }

        public Criteria andZhanghNotBetween(String value1, String value2) {
            addCriterion("ZHANGH not between", value1, value2, "zhangh");
            return (Criteria) this;
        }

        public Criteria andYinxckzhkhxkzhzhIsNull() {
            addCriterion("YINXCKZHKHXKZHZH is null");
            return (Criteria) this;
        }

        public Criteria andYinxckzhkhxkzhzhIsNotNull() {
            addCriterion("YINXCKZHKHXKZHZH is not null");
            return (Criteria) this;
        }

        public Criteria andYinxckzhkhxkzhzhEqualTo(String value) {
            addCriterion("YINXCKZHKHXKZHZH =", value, "yinxckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andYinxckzhkhxkzhzhNotEqualTo(String value) {
            addCriterion("YINXCKZHKHXKZHZH <>", value, "yinxckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andYinxckzhkhxkzhzhGreaterThan(String value) {
            addCriterion("YINXCKZHKHXKZHZH >", value, "yinxckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andYinxckzhkhxkzhzhGreaterThanOrEqualTo(String value) {
            addCriterion("YINXCKZHKHXKZHZH >=", value, "yinxckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andYinxckzhkhxkzhzhLessThan(String value) {
            addCriterion("YINXCKZHKHXKZHZH <", value, "yinxckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andYinxckzhkhxkzhzhLessThanOrEqualTo(String value) {
            addCriterion("YINXCKZHKHXKZHZH <=", value, "yinxckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andYinxckzhkhxkzhzhLike(String value) {
            addCriterion("YINXCKZHKHXKZHZH like", value, "yinxckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andYinxckzhkhxkzhzhNotLike(String value) {
            addCriterion("YINXCKZHKHXKZHZH not like", value, "yinxckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andYinxckzhkhxkzhzhIn(List<String> values) {
            addCriterion("YINXCKZHKHXKZHZH in", values, "yinxckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andYinxckzhkhxkzhzhNotIn(List<String> values) {
            addCriterion("YINXCKZHKHXKZHZH not in", values, "yinxckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andYinxckzhkhxkzhzhBetween(String value1, String value2) {
            addCriterion("YINXCKZHKHXKZHZH between", value1, value2, "yinxckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andYinxckzhkhxkzhzhNotBetween(String value1, String value2) {
            addCriterion("YINXCKZHKHXKZHZH not between", value1, value2, "yinxckzhkhxkzhzh");
            return (Criteria) this;
        }

        public Criteria andKaihrqIsNull() {
            addCriterion("KAIHRQ is null");
            return (Criteria) this;
        }

        public Criteria andKaihrqIsNotNull() {
            addCriterion("KAIHRQ is not null");
            return (Criteria) this;
        }

        public Criteria andKaihrqEqualTo(Date value) {
            addCriterionForJDBCDate("KAIHRQ =", value, "kaihrq");
            return (Criteria) this;
        }

        public Criteria andKaihrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("KAIHRQ <>", value, "kaihrq");
            return (Criteria) this;
        }

        public Criteria andKaihrqGreaterThan(Date value) {
            addCriterionForJDBCDate("KAIHRQ >", value, "kaihrq");
            return (Criteria) this;
        }

        public Criteria andKaihrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("KAIHRQ >=", value, "kaihrq");
            return (Criteria) this;
        }

        public Criteria andKaihrqLessThan(Date value) {
            addCriterionForJDBCDate("KAIHRQ <", value, "kaihrq");
            return (Criteria) this;
        }

        public Criteria andKaihrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("KAIHRQ <=", value, "kaihrq");
            return (Criteria) this;
        }

        public Criteria andKaihrqIn(List<Date> values) {
            addCriterionForJDBCDate("KAIHRQ in", values, "kaihrq");
            return (Criteria) this;
        }

        public Criteria andKaihrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("KAIHRQ not in", values, "kaihrq");
            return (Criteria) this;
        }

        public Criteria andKaihrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("KAIHRQ between", value1, value2, "kaihrq");
            return (Criteria) this;
        }

        public Criteria andKaihrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("KAIHRQ not between", value1, value2, "kaihrq");
            return (Criteria) this;
        }

        public Criteria andBeizIsNull() {
            addCriterion("BEIZ is null");
            return (Criteria) this;
        }

        public Criteria andBeizIsNotNull() {
            addCriterion("BEIZ is not null");
            return (Criteria) this;
        }

        public Criteria andBeizEqualTo(String value) {
            addCriterion("BEIZ =", value, "beiz");
            return (Criteria) this;
        }

        public Criteria andBeizNotEqualTo(String value) {
            addCriterion("BEIZ <>", value, "beiz");
            return (Criteria) this;
        }

        public Criteria andBeizGreaterThan(String value) {
            addCriterion("BEIZ >", value, "beiz");
            return (Criteria) this;
        }

        public Criteria andBeizGreaterThanOrEqualTo(String value) {
            addCriterion("BEIZ >=", value, "beiz");
            return (Criteria) this;
        }

        public Criteria andBeizLessThan(String value) {
            addCriterion("BEIZ <", value, "beiz");
            return (Criteria) this;
        }

        public Criteria andBeizLessThanOrEqualTo(String value) {
            addCriterion("BEIZ <=", value, "beiz");
            return (Criteria) this;
        }

        public Criteria andBeizLike(String value) {
            addCriterion("BEIZ like", value, "beiz");
            return (Criteria) this;
        }

        public Criteria andBeizNotLike(String value) {
            addCriterion("BEIZ not like", value, "beiz");
            return (Criteria) this;
        }

        public Criteria andBeizIn(List<String> values) {
            addCriterion("BEIZ in", values, "beiz");
            return (Criteria) this;
        }

        public Criteria andBeizNotIn(List<String> values) {
            addCriterion("BEIZ not in", values, "beiz");
            return (Criteria) this;
        }

        public Criteria andBeizBetween(String value1, String value2) {
            addCriterion("BEIZ between", value1, value2, "beiz");
            return (Criteria) this;
        }

        public Criteria andBeizNotBetween(String value1, String value2) {
            addCriterion("BEIZ not between", value1, value2, "beiz");
            return (Criteria) this;
        }

        public Criteria andZhuangtIsNull() {
            addCriterion("ZHUANGT is null");
            return (Criteria) this;
        }

        public Criteria andZhuangtIsNotNull() {
            addCriterion("ZHUANGT is not null");
            return (Criteria) this;
        }

        public Criteria andZhuangtEqualTo(String value) {
            addCriterion("ZHUANGT =", value, "zhuangt");
            return (Criteria) this;
        }

        public Criteria andZhuangtNotEqualTo(String value) {
            addCriterion("ZHUANGT <>", value, "zhuangt");
            return (Criteria) this;
        }

        public Criteria andZhuangtGreaterThan(String value) {
            addCriterion("ZHUANGT >", value, "zhuangt");
            return (Criteria) this;
        }

        public Criteria andZhuangtGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUANGT >=", value, "zhuangt");
            return (Criteria) this;
        }

        public Criteria andZhuangtLessThan(String value) {
            addCriterion("ZHUANGT <", value, "zhuangt");
            return (Criteria) this;
        }

        public Criteria andZhuangtLessThanOrEqualTo(String value) {
            addCriterion("ZHUANGT <=", value, "zhuangt");
            return (Criteria) this;
        }

        public Criteria andZhuangtLike(String value) {
            addCriterion("ZHUANGT like", value, "zhuangt");
            return (Criteria) this;
        }

        public Criteria andZhuangtNotLike(String value) {
            addCriterion("ZHUANGT not like", value, "zhuangt");
            return (Criteria) this;
        }

        public Criteria andZhuangtIn(List<String> values) {
            addCriterion("ZHUANGT in", values, "zhuangt");
            return (Criteria) this;
        }

        public Criteria andZhuangtNotIn(List<String> values) {
            addCriterion("ZHUANGT not in", values, "zhuangt");
            return (Criteria) this;
        }

        public Criteria andZhuangtBetween(String value1, String value2) {
            addCriterion("ZHUANGT between", value1, value2, "zhuangt");
            return (Criteria) this;
        }

        public Criteria andZhuangtNotBetween(String value1, String value2) {
            addCriterion("ZHUANGT not between", value1, value2, "zhuangt");
            return (Criteria) this;
        }

        public Criteria andChuangjrIsNull() {
            addCriterion("CHUANGJR is null");
            return (Criteria) this;
        }

        public Criteria andChuangjrIsNotNull() {
            addCriterion("CHUANGJR is not null");
            return (Criteria) this;
        }

        public Criteria andChuangjrEqualTo(String value) {
            addCriterion("CHUANGJR =", value, "chuangjr");
            return (Criteria) this;
        }

        public Criteria andChuangjrNotEqualTo(String value) {
            addCriterion("CHUANGJR <>", value, "chuangjr");
            return (Criteria) this;
        }

        public Criteria andChuangjrGreaterThan(String value) {
            addCriterion("CHUANGJR >", value, "chuangjr");
            return (Criteria) this;
        }

        public Criteria andChuangjrGreaterThanOrEqualTo(String value) {
            addCriterion("CHUANGJR >=", value, "chuangjr");
            return (Criteria) this;
        }

        public Criteria andChuangjrLessThan(String value) {
            addCriterion("CHUANGJR <", value, "chuangjr");
            return (Criteria) this;
        }

        public Criteria andChuangjrLessThanOrEqualTo(String value) {
            addCriterion("CHUANGJR <=", value, "chuangjr");
            return (Criteria) this;
        }

        public Criteria andChuangjrLike(String value) {
            addCriterion("CHUANGJR like", value, "chuangjr");
            return (Criteria) this;
        }

        public Criteria andChuangjrNotLike(String value) {
            addCriterion("CHUANGJR not like", value, "chuangjr");
            return (Criteria) this;
        }

        public Criteria andChuangjrIn(List<String> values) {
            addCriterion("CHUANGJR in", values, "chuangjr");
            return (Criteria) this;
        }

        public Criteria andChuangjrNotIn(List<String> values) {
            addCriterion("CHUANGJR not in", values, "chuangjr");
            return (Criteria) this;
        }

        public Criteria andChuangjrBetween(String value1, String value2) {
            addCriterion("CHUANGJR between", value1, value2, "chuangjr");
            return (Criteria) this;
        }

        public Criteria andChuangjrNotBetween(String value1, String value2) {
            addCriterion("CHUANGJR not between", value1, value2, "chuangjr");
            return (Criteria) this;
        }

        public Criteria andXiugrIsNull() {
            addCriterion("XIUGR is null");
            return (Criteria) this;
        }

        public Criteria andXiugrIsNotNull() {
            addCriterion("XIUGR is not null");
            return (Criteria) this;
        }

        public Criteria andXiugrEqualTo(String value) {
            addCriterion("XIUGR =", value, "xiugr");
            return (Criteria) this;
        }

        public Criteria andXiugrNotEqualTo(String value) {
            addCriterion("XIUGR <>", value, "xiugr");
            return (Criteria) this;
        }

        public Criteria andXiugrGreaterThan(String value) {
            addCriterion("XIUGR >", value, "xiugr");
            return (Criteria) this;
        }

        public Criteria andXiugrGreaterThanOrEqualTo(String value) {
            addCriterion("XIUGR >=", value, "xiugr");
            return (Criteria) this;
        }

        public Criteria andXiugrLessThan(String value) {
            addCriterion("XIUGR <", value, "xiugr");
            return (Criteria) this;
        }

        public Criteria andXiugrLessThanOrEqualTo(String value) {
            addCriterion("XIUGR <=", value, "xiugr");
            return (Criteria) this;
        }

        public Criteria andXiugrLike(String value) {
            addCriterion("XIUGR like", value, "xiugr");
            return (Criteria) this;
        }

        public Criteria andXiugrNotLike(String value) {
            addCriterion("XIUGR not like", value, "xiugr");
            return (Criteria) this;
        }

        public Criteria andXiugrIn(List<String> values) {
            addCriterion("XIUGR in", values, "xiugr");
            return (Criteria) this;
        }

        public Criteria andXiugrNotIn(List<String> values) {
            addCriterion("XIUGR not in", values, "xiugr");
            return (Criteria) this;
        }

        public Criteria andXiugrBetween(String value1, String value2) {
            addCriterion("XIUGR between", value1, value2, "xiugr");
            return (Criteria) this;
        }

        public Criteria andXiugrNotBetween(String value1, String value2) {
            addCriterion("XIUGR not between", value1, value2, "xiugr");
            return (Criteria) this;
        }

        public Criteria andChuangjsjIsNull() {
            addCriterion("CHUANGJSJ is null");
            return (Criteria) this;
        }

        public Criteria andChuangjsjIsNotNull() {
            addCriterion("CHUANGJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andChuangjsjEqualTo(Date value) {
            addCriterionForJDBCDate("CHUANGJSJ =", value, "chuangjsj");
            return (Criteria) this;
        }

        public Criteria andChuangjsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("CHUANGJSJ <>", value, "chuangjsj");
            return (Criteria) this;
        }

        public Criteria andChuangjsjGreaterThan(Date value) {
            addCriterionForJDBCDate("CHUANGJSJ >", value, "chuangjsj");
            return (Criteria) this;
        }

        public Criteria andChuangjsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHUANGJSJ >=", value, "chuangjsj");
            return (Criteria) this;
        }

        public Criteria andChuangjsjLessThan(Date value) {
            addCriterionForJDBCDate("CHUANGJSJ <", value, "chuangjsj");
            return (Criteria) this;
        }

        public Criteria andChuangjsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHUANGJSJ <=", value, "chuangjsj");
            return (Criteria) this;
        }

        public Criteria andChuangjsjIn(List<Date> values) {
            addCriterionForJDBCDate("CHUANGJSJ in", values, "chuangjsj");
            return (Criteria) this;
        }

        public Criteria andChuangjsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("CHUANGJSJ not in", values, "chuangjsj");
            return (Criteria) this;
        }

        public Criteria andChuangjsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHUANGJSJ between", value1, value2, "chuangjsj");
            return (Criteria) this;
        }

        public Criteria andChuangjsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHUANGJSJ not between", value1, value2, "chuangjsj");
            return (Criteria) this;
        }

        public Criteria andXiugsjIsNull() {
            addCriterion("XIUGSJ is null");
            return (Criteria) this;
        }

        public Criteria andXiugsjIsNotNull() {
            addCriterion("XIUGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andXiugsjEqualTo(Date value) {
            addCriterionForJDBCDate("XIUGSJ =", value, "xiugsj");
            return (Criteria) this;
        }

        public Criteria andXiugsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("XIUGSJ <>", value, "xiugsj");
            return (Criteria) this;
        }

        public Criteria andXiugsjGreaterThan(Date value) {
            addCriterionForJDBCDate("XIUGSJ >", value, "xiugsj");
            return (Criteria) this;
        }

        public Criteria andXiugsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XIUGSJ >=", value, "xiugsj");
            return (Criteria) this;
        }

        public Criteria andXiugsjLessThan(Date value) {
            addCriterionForJDBCDate("XIUGSJ <", value, "xiugsj");
            return (Criteria) this;
        }

        public Criteria andXiugsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XIUGSJ <=", value, "xiugsj");
            return (Criteria) this;
        }

        public Criteria andXiugsjIn(List<Date> values) {
            addCriterionForJDBCDate("XIUGSJ in", values, "xiugsj");
            return (Criteria) this;
        }

        public Criteria andXiugsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("XIUGSJ not in", values, "xiugsj");
            return (Criteria) this;
        }

        public Criteria andXiugsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XIUGSJ between", value1, value2, "xiugsj");
            return (Criteria) this;
        }

        public Criteria andXiugsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XIUGSJ not between", value1, value2, "xiugsj");
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

        public Criteria andUseridEqualTo(Object value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Object value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Object value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Object value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Object value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Object value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Object> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Object> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Object value1, Object value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Object value1, Object value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andJiaoydmIsNull() {
            addCriterion("JIAOYDM is null");
            return (Criteria) this;
        }

        public Criteria andJiaoydmIsNotNull() {
            addCriterion("JIAOYDM is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoydmEqualTo(String value) {
            addCriterion("JIAOYDM =", value, "jiaoydm");
            return (Criteria) this;
        }

        public Criteria andJiaoydmNotEqualTo(String value) {
            addCriterion("JIAOYDM <>", value, "jiaoydm");
            return (Criteria) this;
        }

        public Criteria andJiaoydmGreaterThan(String value) {
            addCriterion("JIAOYDM >", value, "jiaoydm");
            return (Criteria) this;
        }

        public Criteria andJiaoydmGreaterThanOrEqualTo(String value) {
            addCriterion("JIAOYDM >=", value, "jiaoydm");
            return (Criteria) this;
        }

        public Criteria andJiaoydmLessThan(String value) {
            addCriterion("JIAOYDM <", value, "jiaoydm");
            return (Criteria) this;
        }

        public Criteria andJiaoydmLessThanOrEqualTo(String value) {
            addCriterion("JIAOYDM <=", value, "jiaoydm");
            return (Criteria) this;
        }

        public Criteria andJiaoydmLike(String value) {
            addCriterion("JIAOYDM like", value, "jiaoydm");
            return (Criteria) this;
        }

        public Criteria andJiaoydmNotLike(String value) {
            addCriterion("JIAOYDM not like", value, "jiaoydm");
            return (Criteria) this;
        }

        public Criteria andJiaoydmIn(List<String> values) {
            addCriterion("JIAOYDM in", values, "jiaoydm");
            return (Criteria) this;
        }

        public Criteria andJiaoydmNotIn(List<String> values) {
            addCriterion("JIAOYDM not in", values, "jiaoydm");
            return (Criteria) this;
        }

        public Criteria andJiaoydmBetween(String value1, String value2) {
            addCriterion("JIAOYDM between", value1, value2, "jiaoydm");
            return (Criteria) this;
        }

        public Criteria andJiaoydmNotBetween(String value1, String value2) {
            addCriterion("JIAOYDM not between", value1, value2, "jiaoydm");
            return (Criteria) this;
        }

        public Criteria andDiqdhIsNull() {
            addCriterion("DIQDH is null");
            return (Criteria) this;
        }

        public Criteria andDiqdhIsNotNull() {
            addCriterion("DIQDH is not null");
            return (Criteria) this;
        }

        public Criteria andDiqdhEqualTo(String value) {
            addCriterion("DIQDH =", value, "diqdh");
            return (Criteria) this;
        }

        public Criteria andDiqdhNotEqualTo(String value) {
            addCriterion("DIQDH <>", value, "diqdh");
            return (Criteria) this;
        }

        public Criteria andDiqdhGreaterThan(String value) {
            addCriterion("DIQDH >", value, "diqdh");
            return (Criteria) this;
        }

        public Criteria andDiqdhGreaterThanOrEqualTo(String value) {
            addCriterion("DIQDH >=", value, "diqdh");
            return (Criteria) this;
        }

        public Criteria andDiqdhLessThan(String value) {
            addCriterion("DIQDH <", value, "diqdh");
            return (Criteria) this;
        }

        public Criteria andDiqdhLessThanOrEqualTo(String value) {
            addCriterion("DIQDH <=", value, "diqdh");
            return (Criteria) this;
        }

        public Criteria andDiqdhLike(String value) {
            addCriterion("DIQDH like", value, "diqdh");
            return (Criteria) this;
        }

        public Criteria andDiqdhNotLike(String value) {
            addCriterion("DIQDH not like", value, "diqdh");
            return (Criteria) this;
        }

        public Criteria andDiqdhIn(List<String> values) {
            addCriterion("DIQDH in", values, "diqdh");
            return (Criteria) this;
        }

        public Criteria andDiqdhNotIn(List<String> values) {
            addCriterion("DIQDH not in", values, "diqdh");
            return (Criteria) this;
        }

        public Criteria andDiqdhBetween(String value1, String value2) {
            addCriterion("DIQDH between", value1, value2, "diqdh");
            return (Criteria) this;
        }

        public Criteria andDiqdhNotBetween(String value1, String value2) {
            addCriterion("DIQDH not between", value1, value2, "diqdh");
            return (Criteria) this;
        }

        public Criteria andJigdhIsNull() {
            addCriterion("JIGDH is null");
            return (Criteria) this;
        }

        public Criteria andJigdhIsNotNull() {
            addCriterion("JIGDH is not null");
            return (Criteria) this;
        }

        public Criteria andJigdhEqualTo(String value) {
            addCriterion("JIGDH =", value, "jigdh");
            return (Criteria) this;
        }

        public Criteria andJigdhNotEqualTo(String value) {
            addCriterion("JIGDH <>", value, "jigdh");
            return (Criteria) this;
        }

        public Criteria andJigdhGreaterThan(String value) {
            addCriterion("JIGDH >", value, "jigdh");
            return (Criteria) this;
        }

        public Criteria andJigdhGreaterThanOrEqualTo(String value) {
            addCriterion("JIGDH >=", value, "jigdh");
            return (Criteria) this;
        }

        public Criteria andJigdhLessThan(String value) {
            addCriterion("JIGDH <", value, "jigdh");
            return (Criteria) this;
        }

        public Criteria andJigdhLessThanOrEqualTo(String value) {
            addCriterion("JIGDH <=", value, "jigdh");
            return (Criteria) this;
        }

        public Criteria andJigdhLike(String value) {
            addCriterion("JIGDH like", value, "jigdh");
            return (Criteria) this;
        }

        public Criteria andJigdhNotLike(String value) {
            addCriterion("JIGDH not like", value, "jigdh");
            return (Criteria) this;
        }

        public Criteria andJigdhIn(List<String> values) {
            addCriterion("JIGDH in", values, "jigdh");
            return (Criteria) this;
        }

        public Criteria andJigdhNotIn(List<String> values) {
            addCriterion("JIGDH not in", values, "jigdh");
            return (Criteria) this;
        }

        public Criteria andJigdhBetween(String value1, String value2) {
            addCriterion("JIGDH between", value1, value2, "jigdh");
            return (Criteria) this;
        }

        public Criteria andJigdhNotBetween(String value1, String value2) {
            addCriterion("JIGDH not between", value1, value2, "jigdh");
            return (Criteria) this;
        }

        public Criteria andJiaoygyIsNull() {
            addCriterion("JIAOYGY is null");
            return (Criteria) this;
        }

        public Criteria andJiaoygyIsNotNull() {
            addCriterion("JIAOYGY is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoygyEqualTo(String value) {
            addCriterion("JIAOYGY =", value, "jiaoygy");
            return (Criteria) this;
        }

        public Criteria andJiaoygyNotEqualTo(String value) {
            addCriterion("JIAOYGY <>", value, "jiaoygy");
            return (Criteria) this;
        }

        public Criteria andJiaoygyGreaterThan(String value) {
            addCriterion("JIAOYGY >", value, "jiaoygy");
            return (Criteria) this;
        }

        public Criteria andJiaoygyGreaterThanOrEqualTo(String value) {
            addCriterion("JIAOYGY >=", value, "jiaoygy");
            return (Criteria) this;
        }

        public Criteria andJiaoygyLessThan(String value) {
            addCriterion("JIAOYGY <", value, "jiaoygy");
            return (Criteria) this;
        }

        public Criteria andJiaoygyLessThanOrEqualTo(String value) {
            addCriterion("JIAOYGY <=", value, "jiaoygy");
            return (Criteria) this;
        }

        public Criteria andJiaoygyLike(String value) {
            addCriterion("JIAOYGY like", value, "jiaoygy");
            return (Criteria) this;
        }

        public Criteria andJiaoygyNotLike(String value) {
            addCriterion("JIAOYGY not like", value, "jiaoygy");
            return (Criteria) this;
        }

        public Criteria andJiaoygyIn(List<String> values) {
            addCriterion("JIAOYGY in", values, "jiaoygy");
            return (Criteria) this;
        }

        public Criteria andJiaoygyNotIn(List<String> values) {
            addCriterion("JIAOYGY not in", values, "jiaoygy");
            return (Criteria) this;
        }

        public Criteria andJiaoygyBetween(String value1, String value2) {
            addCriterion("JIAOYGY between", value1, value2, "jiaoygy");
            return (Criteria) this;
        }

        public Criteria andJiaoygyNotBetween(String value1, String value2) {
            addCriterion("JIAOYGY not between", value1, value2, "jiaoygy");
            return (Criteria) this;
        }

        public Criteria andZhongddhIsNull() {
            addCriterion("ZHONGDDH is null");
            return (Criteria) this;
        }

        public Criteria andZhongddhIsNotNull() {
            addCriterion("ZHONGDDH is not null");
            return (Criteria) this;
        }

        public Criteria andZhongddhEqualTo(String value) {
            addCriterion("ZHONGDDH =", value, "zhongddh");
            return (Criteria) this;
        }

        public Criteria andZhongddhNotEqualTo(String value) {
            addCriterion("ZHONGDDH <>", value, "zhongddh");
            return (Criteria) this;
        }

        public Criteria andZhongddhGreaterThan(String value) {
            addCriterion("ZHONGDDH >", value, "zhongddh");
            return (Criteria) this;
        }

        public Criteria andZhongddhGreaterThanOrEqualTo(String value) {
            addCriterion("ZHONGDDH >=", value, "zhongddh");
            return (Criteria) this;
        }

        public Criteria andZhongddhLessThan(String value) {
            addCriterion("ZHONGDDH <", value, "zhongddh");
            return (Criteria) this;
        }

        public Criteria andZhongddhLessThanOrEqualTo(String value) {
            addCriterion("ZHONGDDH <=", value, "zhongddh");
            return (Criteria) this;
        }

        public Criteria andZhongddhLike(String value) {
            addCriterion("ZHONGDDH like", value, "zhongddh");
            return (Criteria) this;
        }

        public Criteria andZhongddhNotLike(String value) {
            addCriterion("ZHONGDDH not like", value, "zhongddh");
            return (Criteria) this;
        }

        public Criteria andZhongddhIn(List<String> values) {
            addCriterion("ZHONGDDH in", values, "zhongddh");
            return (Criteria) this;
        }

        public Criteria andZhongddhNotIn(List<String> values) {
            addCriterion("ZHONGDDH not in", values, "zhongddh");
            return (Criteria) this;
        }

        public Criteria andZhongddhBetween(String value1, String value2) {
            addCriterion("ZHONGDDH between", value1, value2, "zhongddh");
            return (Criteria) this;
        }

        public Criteria andZhongddhNotBetween(String value1, String value2) {
            addCriterion("ZHONGDDH not between", value1, value2, "zhongddh");
            return (Criteria) this;
        }

        public Criteria andQiydhIsNull() {
            addCriterion("QIYDH is null");
            return (Criteria) this;
        }

        public Criteria andQiydhIsNotNull() {
            addCriterion("QIYDH is not null");
            return (Criteria) this;
        }

        public Criteria andQiydhEqualTo(String value) {
            addCriterion("QIYDH =", value, "qiydh");
            return (Criteria) this;
        }

        public Criteria andQiydhNotEqualTo(String value) {
            addCriterion("QIYDH <>", value, "qiydh");
            return (Criteria) this;
        }

        public Criteria andQiydhGreaterThan(String value) {
            addCriterion("QIYDH >", value, "qiydh");
            return (Criteria) this;
        }

        public Criteria andQiydhGreaterThanOrEqualTo(String value) {
            addCriterion("QIYDH >=", value, "qiydh");
            return (Criteria) this;
        }

        public Criteria andQiydhLessThan(String value) {
            addCriterion("QIYDH <", value, "qiydh");
            return (Criteria) this;
        }

        public Criteria andQiydhLessThanOrEqualTo(String value) {
            addCriterion("QIYDH <=", value, "qiydh");
            return (Criteria) this;
        }

        public Criteria andQiydhLike(String value) {
            addCriterion("QIYDH like", value, "qiydh");
            return (Criteria) this;
        }

        public Criteria andQiydhNotLike(String value) {
            addCriterion("QIYDH not like", value, "qiydh");
            return (Criteria) this;
        }

        public Criteria andQiydhIn(List<String> values) {
            addCriterion("QIYDH in", values, "qiydh");
            return (Criteria) this;
        }

        public Criteria andQiydhNotIn(List<String> values) {
            addCriterion("QIYDH not in", values, "qiydh");
            return (Criteria) this;
        }

        public Criteria andQiydhBetween(String value1, String value2) {
            addCriterion("QIYDH between", value1, value2, "qiydh");
            return (Criteria) this;
        }

        public Criteria andQiydhNotBetween(String value1, String value2) {
            addCriterion("QIYDH not between", value1, value2, "qiydh");
            return (Criteria) this;
        }

        public Criteria andGuiylshIsNull() {
            addCriterion("GUIYLSH is null");
            return (Criteria) this;
        }

        public Criteria andGuiylshIsNotNull() {
            addCriterion("GUIYLSH is not null");
            return (Criteria) this;
        }

        public Criteria andGuiylshEqualTo(String value) {
            addCriterion("GUIYLSH =", value, "guiylsh");
            return (Criteria) this;
        }

        public Criteria andGuiylshNotEqualTo(String value) {
            addCriterion("GUIYLSH <>", value, "guiylsh");
            return (Criteria) this;
        }

        public Criteria andGuiylshGreaterThan(String value) {
            addCriterion("GUIYLSH >", value, "guiylsh");
            return (Criteria) this;
        }

        public Criteria andGuiylshGreaterThanOrEqualTo(String value) {
            addCriterion("GUIYLSH >=", value, "guiylsh");
            return (Criteria) this;
        }

        public Criteria andGuiylshLessThan(String value) {
            addCriterion("GUIYLSH <", value, "guiylsh");
            return (Criteria) this;
        }

        public Criteria andGuiylshLessThanOrEqualTo(String value) {
            addCriterion("GUIYLSH <=", value, "guiylsh");
            return (Criteria) this;
        }

        public Criteria andGuiylshLike(String value) {
            addCriterion("GUIYLSH like", value, "guiylsh");
            return (Criteria) this;
        }

        public Criteria andGuiylshNotLike(String value) {
            addCriterion("GUIYLSH not like", value, "guiylsh");
            return (Criteria) this;
        }

        public Criteria andGuiylshIn(List<String> values) {
            addCriterion("GUIYLSH in", values, "guiylsh");
            return (Criteria) this;
        }

        public Criteria andGuiylshNotIn(List<String> values) {
            addCriterion("GUIYLSH not in", values, "guiylsh");
            return (Criteria) this;
        }

        public Criteria andGuiylshBetween(String value1, String value2) {
            addCriterion("GUIYLSH between", value1, value2, "guiylsh");
            return (Criteria) this;
        }

        public Criteria andGuiylshNotBetween(String value1, String value2) {
            addCriterion("GUIYLSH not between", value1, value2, "guiylsh");
            return (Criteria) this;
        }

        public Criteria andKehdhIsNull() {
            addCriterion("KEHDH is null");
            return (Criteria) this;
        }

        public Criteria andKehdhIsNotNull() {
            addCriterion("KEHDH is not null");
            return (Criteria) this;
        }

        public Criteria andKehdhEqualTo(String value) {
            addCriterion("KEHDH =", value, "kehdh");
            return (Criteria) this;
        }

        public Criteria andKehdhNotEqualTo(String value) {
            addCriterion("KEHDH <>", value, "kehdh");
            return (Criteria) this;
        }

        public Criteria andKehdhGreaterThan(String value) {
            addCriterion("KEHDH >", value, "kehdh");
            return (Criteria) this;
        }

        public Criteria andKehdhGreaterThanOrEqualTo(String value) {
            addCriterion("KEHDH >=", value, "kehdh");
            return (Criteria) this;
        }

        public Criteria andKehdhLessThan(String value) {
            addCriterion("KEHDH <", value, "kehdh");
            return (Criteria) this;
        }

        public Criteria andKehdhLessThanOrEqualTo(String value) {
            addCriterion("KEHDH <=", value, "kehdh");
            return (Criteria) this;
        }

        public Criteria andKehdhLike(String value) {
            addCriterion("KEHDH like", value, "kehdh");
            return (Criteria) this;
        }

        public Criteria andKehdhNotLike(String value) {
            addCriterion("KEHDH not like", value, "kehdh");
            return (Criteria) this;
        }

        public Criteria andKehdhIn(List<String> values) {
            addCriterion("KEHDH in", values, "kehdh");
            return (Criteria) this;
        }

        public Criteria andKehdhNotIn(List<String> values) {
            addCriterion("KEHDH not in", values, "kehdh");
            return (Criteria) this;
        }

        public Criteria andKehdhBetween(String value1, String value2) {
            addCriterion("KEHDH between", value1, value2, "kehdh");
            return (Criteria) this;
        }

        public Criteria andKehdhNotBetween(String value1, String value2) {
            addCriterion("KEHDH not between", value1, value2, "kehdh");
            return (Criteria) this;
        }

        public Criteria andKaihyxshyjIsNull() {
            addCriterion("KAIHYXSHYJ is null");
            return (Criteria) this;
        }

        public Criteria andKaihyxshyjIsNotNull() {
            addCriterion("KAIHYXSHYJ is not null");
            return (Criteria) this;
        }

        public Criteria andKaihyxshyjEqualTo(String value) {
            addCriterion("KAIHYXSHYJ =", value, "kaihyxshyj");
            return (Criteria) this;
        }

        public Criteria andKaihyxshyjNotEqualTo(String value) {
            addCriterion("KAIHYXSHYJ <>", value, "kaihyxshyj");
            return (Criteria) this;
        }

        public Criteria andKaihyxshyjGreaterThan(String value) {
            addCriterion("KAIHYXSHYJ >", value, "kaihyxshyj");
            return (Criteria) this;
        }

        public Criteria andKaihyxshyjGreaterThanOrEqualTo(String value) {
            addCriterion("KAIHYXSHYJ >=", value, "kaihyxshyj");
            return (Criteria) this;
        }

        public Criteria andKaihyxshyjLessThan(String value) {
            addCriterion("KAIHYXSHYJ <", value, "kaihyxshyj");
            return (Criteria) this;
        }

        public Criteria andKaihyxshyjLessThanOrEqualTo(String value) {
            addCriterion("KAIHYXSHYJ <=", value, "kaihyxshyj");
            return (Criteria) this;
        }

        public Criteria andKaihyxshyjLike(String value) {
            addCriterion("KAIHYXSHYJ like", value, "kaihyxshyj");
            return (Criteria) this;
        }

        public Criteria andKaihyxshyjNotLike(String value) {
            addCriterion("KAIHYXSHYJ not like", value, "kaihyxshyj");
            return (Criteria) this;
        }

        public Criteria andKaihyxshyjIn(List<String> values) {
            addCriterion("KAIHYXSHYJ in", values, "kaihyxshyj");
            return (Criteria) this;
        }

        public Criteria andKaihyxshyjNotIn(List<String> values) {
            addCriterion("KAIHYXSHYJ not in", values, "kaihyxshyj");
            return (Criteria) this;
        }

        public Criteria andKaihyxshyjBetween(String value1, String value2) {
            addCriterion("KAIHYXSHYJ between", value1, value2, "kaihyxshyj");
            return (Criteria) this;
        }

        public Criteria andKaihyxshyjNotBetween(String value1, String value2) {
            addCriterion("KAIHYXSHYJ not between", value1, value2, "kaihyxshyj");
            return (Criteria) this;
        }

        public Criteria andKaihyxshrqIsNull() {
            addCriterion("KAIHYXSHRQ is null");
            return (Criteria) this;
        }

        public Criteria andKaihyxshrqIsNotNull() {
            addCriterion("KAIHYXSHRQ is not null");
            return (Criteria) this;
        }

        public Criteria andKaihyxshrqEqualTo(Date value) {
            addCriterionForJDBCDate("KAIHYXSHRQ =", value, "kaihyxshrq");
            return (Criteria) this;
        }

        public Criteria andKaihyxshrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("KAIHYXSHRQ <>", value, "kaihyxshrq");
            return (Criteria) this;
        }

        public Criteria andKaihyxshrqGreaterThan(Date value) {
            addCriterionForJDBCDate("KAIHYXSHRQ >", value, "kaihyxshrq");
            return (Criteria) this;
        }

        public Criteria andKaihyxshrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("KAIHYXSHRQ >=", value, "kaihyxshrq");
            return (Criteria) this;
        }

        public Criteria andKaihyxshrqLessThan(Date value) {
            addCriterionForJDBCDate("KAIHYXSHRQ <", value, "kaihyxshrq");
            return (Criteria) this;
        }

        public Criteria andKaihyxshrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("KAIHYXSHRQ <=", value, "kaihyxshrq");
            return (Criteria) this;
        }

        public Criteria andKaihyxshrqIn(List<Date> values) {
            addCriterionForJDBCDate("KAIHYXSHRQ in", values, "kaihyxshrq");
            return (Criteria) this;
        }

        public Criteria andKaihyxshrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("KAIHYXSHRQ not in", values, "kaihyxshrq");
            return (Criteria) this;
        }

        public Criteria andKaihyxshrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("KAIHYXSHRQ between", value1, value2, "kaihyxshrq");
            return (Criteria) this;
        }

        public Criteria andKaihyxshrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("KAIHYXSHRQ not between", value1, value2, "kaihyxshrq");
            return (Criteria) this;
        }

        public Criteria andRenmyxshyjIsNull() {
            addCriterion("RENMYXSHYJ is null");
            return (Criteria) this;
        }

        public Criteria andRenmyxshyjIsNotNull() {
            addCriterion("RENMYXSHYJ is not null");
            return (Criteria) this;
        }

        public Criteria andRenmyxshyjEqualTo(String value) {
            addCriterion("RENMYXSHYJ =", value, "renmyxshyj");
            return (Criteria) this;
        }

        public Criteria andRenmyxshyjNotEqualTo(String value) {
            addCriterion("RENMYXSHYJ <>", value, "renmyxshyj");
            return (Criteria) this;
        }

        public Criteria andRenmyxshyjGreaterThan(String value) {
            addCriterion("RENMYXSHYJ >", value, "renmyxshyj");
            return (Criteria) this;
        }

        public Criteria andRenmyxshyjGreaterThanOrEqualTo(String value) {
            addCriterion("RENMYXSHYJ >=", value, "renmyxshyj");
            return (Criteria) this;
        }

        public Criteria andRenmyxshyjLessThan(String value) {
            addCriterion("RENMYXSHYJ <", value, "renmyxshyj");
            return (Criteria) this;
        }

        public Criteria andRenmyxshyjLessThanOrEqualTo(String value) {
            addCriterion("RENMYXSHYJ <=", value, "renmyxshyj");
            return (Criteria) this;
        }

        public Criteria andRenmyxshyjLike(String value) {
            addCriterion("RENMYXSHYJ like", value, "renmyxshyj");
            return (Criteria) this;
        }

        public Criteria andRenmyxshyjNotLike(String value) {
            addCriterion("RENMYXSHYJ not like", value, "renmyxshyj");
            return (Criteria) this;
        }

        public Criteria andRenmyxshyjIn(List<String> values) {
            addCriterion("RENMYXSHYJ in", values, "renmyxshyj");
            return (Criteria) this;
        }

        public Criteria andRenmyxshyjNotIn(List<String> values) {
            addCriterion("RENMYXSHYJ not in", values, "renmyxshyj");
            return (Criteria) this;
        }

        public Criteria andRenmyxshyjBetween(String value1, String value2) {
            addCriterion("RENMYXSHYJ between", value1, value2, "renmyxshyj");
            return (Criteria) this;
        }

        public Criteria andRenmyxshyjNotBetween(String value1, String value2) {
            addCriterion("RENMYXSHYJ not between", value1, value2, "renmyxshyj");
            return (Criteria) this;
        }

        public Criteria andRenmyxshrqIsNull() {
            addCriterion("RENMYXSHRQ is null");
            return (Criteria) this;
        }

        public Criteria andRenmyxshrqIsNotNull() {
            addCriterion("RENMYXSHRQ is not null");
            return (Criteria) this;
        }

        public Criteria andRenmyxshrqEqualTo(Date value) {
            addCriterionForJDBCDate("RENMYXSHRQ =", value, "renmyxshrq");
            return (Criteria) this;
        }

        public Criteria andRenmyxshrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("RENMYXSHRQ <>", value, "renmyxshrq");
            return (Criteria) this;
        }

        public Criteria andRenmyxshrqGreaterThan(Date value) {
            addCriterionForJDBCDate("RENMYXSHRQ >", value, "renmyxshrq");
            return (Criteria) this;
        }

        public Criteria andRenmyxshrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RENMYXSHRQ >=", value, "renmyxshrq");
            return (Criteria) this;
        }

        public Criteria andRenmyxshrqLessThan(Date value) {
            addCriterionForJDBCDate("RENMYXSHRQ <", value, "renmyxshrq");
            return (Criteria) this;
        }

        public Criteria andRenmyxshrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RENMYXSHRQ <=", value, "renmyxshrq");
            return (Criteria) this;
        }

        public Criteria andRenmyxshrqIn(List<Date> values) {
            addCriterionForJDBCDate("RENMYXSHRQ in", values, "renmyxshrq");
            return (Criteria) this;
        }

        public Criteria andRenmyxshrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("RENMYXSHRQ not in", values, "renmyxshrq");
            return (Criteria) this;
        }

        public Criteria andRenmyxshrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RENMYXSHRQ between", value1, value2, "renmyxshrq");
            return (Criteria) this;
        }

        public Criteria andRenmyxshrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RENMYXSHRQ not between", value1, value2, "renmyxshrq");
            return (Criteria) this;
        }

        public Criteria andJibIsNull() {
            addCriterion("JIB is null");
            return (Criteria) this;
        }

        public Criteria andJibIsNotNull() {
            addCriterion("JIB is not null");
            return (Criteria) this;
        }

        public Criteria andJibEqualTo(String value) {
            addCriterion("JIB =", value, "jib");
            return (Criteria) this;
        }

        public Criteria andJibNotEqualTo(String value) {
            addCriterion("JIB <>", value, "jib");
            return (Criteria) this;
        }

        public Criteria andJibGreaterThan(String value) {
            addCriterion("JIB >", value, "jib");
            return (Criteria) this;
        }

        public Criteria andJibGreaterThanOrEqualTo(String value) {
            addCriterion("JIB >=", value, "jib");
            return (Criteria) this;
        }

        public Criteria andJibLessThan(String value) {
            addCriterion("JIB <", value, "jib");
            return (Criteria) this;
        }

        public Criteria andJibLessThanOrEqualTo(String value) {
            addCriterion("JIB <=", value, "jib");
            return (Criteria) this;
        }

        public Criteria andJibLike(String value) {
            addCriterion("JIB like", value, "jib");
            return (Criteria) this;
        }

        public Criteria andJibNotLike(String value) {
            addCriterion("JIB not like", value, "jib");
            return (Criteria) this;
        }

        public Criteria andJibIn(List<String> values) {
            addCriterion("JIB in", values, "jib");
            return (Criteria) this;
        }

        public Criteria andJibNotIn(List<String> values) {
            addCriterion("JIB not in", values, "jib");
            return (Criteria) this;
        }

        public Criteria andJibBetween(String value1, String value2) {
            addCriterion("JIB between", value1, value2, "jib");
            return (Criteria) this;
        }

        public Criteria andJibNotBetween(String value1, String value2) {
            addCriterion("JIB not between", value1, value2, "jib");
            return (Criteria) this;
        }

        public Criteria andYibIsNull() {
            addCriterion("YIB is null");
            return (Criteria) this;
        }

        public Criteria andYibIsNotNull() {
            addCriterion("YIB is not null");
            return (Criteria) this;
        }

        public Criteria andYibEqualTo(String value) {
            addCriterion("YIB =", value, "yib");
            return (Criteria) this;
        }

        public Criteria andYibNotEqualTo(String value) {
            addCriterion("YIB <>", value, "yib");
            return (Criteria) this;
        }

        public Criteria andYibGreaterThan(String value) {
            addCriterion("YIB >", value, "yib");
            return (Criteria) this;
        }

        public Criteria andYibGreaterThanOrEqualTo(String value) {
            addCriterion("YIB >=", value, "yib");
            return (Criteria) this;
        }

        public Criteria andYibLessThan(String value) {
            addCriterion("YIB <", value, "yib");
            return (Criteria) this;
        }

        public Criteria andYibLessThanOrEqualTo(String value) {
            addCriterion("YIB <=", value, "yib");
            return (Criteria) this;
        }

        public Criteria andYibLike(String value) {
            addCriterion("YIB like", value, "yib");
            return (Criteria) this;
        }

        public Criteria andYibNotLike(String value) {
            addCriterion("YIB not like", value, "yib");
            return (Criteria) this;
        }

        public Criteria andYibIn(List<String> values) {
            addCriterion("YIB in", values, "yib");
            return (Criteria) this;
        }

        public Criteria andYibNotIn(List<String> values) {
            addCriterion("YIB not in", values, "yib");
            return (Criteria) this;
        }

        public Criteria andYibBetween(String value1, String value2) {
            addCriterion("YIB between", value1, value2, "yib");
            return (Criteria) this;
        }

        public Criteria andYibNotBetween(String value1, String value2) {
            addCriterion("YIB not between", value1, value2, "yib");
            return (Criteria) this;
        }

        public Criteria andZhuanyIsNull() {
            addCriterion("ZHUANY is null");
            return (Criteria) this;
        }

        public Criteria andZhuanyIsNotNull() {
            addCriterion("ZHUANY is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanyEqualTo(String value) {
            addCriterion("ZHUANY =", value, "zhuany");
            return (Criteria) this;
        }

        public Criteria andZhuanyNotEqualTo(String value) {
            addCriterion("ZHUANY <>", value, "zhuany");
            return (Criteria) this;
        }

        public Criteria andZhuanyGreaterThan(String value) {
            addCriterion("ZHUANY >", value, "zhuany");
            return (Criteria) this;
        }

        public Criteria andZhuanyGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUANY >=", value, "zhuany");
            return (Criteria) this;
        }

        public Criteria andZhuanyLessThan(String value) {
            addCriterion("ZHUANY <", value, "zhuany");
            return (Criteria) this;
        }

        public Criteria andZhuanyLessThanOrEqualTo(String value) {
            addCriterion("ZHUANY <=", value, "zhuany");
            return (Criteria) this;
        }

        public Criteria andZhuanyLike(String value) {
            addCriterion("ZHUANY like", value, "zhuany");
            return (Criteria) this;
        }

        public Criteria andZhuanyNotLike(String value) {
            addCriterion("ZHUANY not like", value, "zhuany");
            return (Criteria) this;
        }

        public Criteria andZhuanyIn(List<String> values) {
            addCriterion("ZHUANY in", values, "zhuany");
            return (Criteria) this;
        }

        public Criteria andZhuanyNotIn(List<String> values) {
            addCriterion("ZHUANY not in", values, "zhuany");
            return (Criteria) this;
        }

        public Criteria andZhuanyBetween(String value1, String value2) {
            addCriterion("ZHUANY between", value1, value2, "zhuany");
            return (Criteria) this;
        }

        public Criteria andZhuanyNotBetween(String value1, String value2) {
            addCriterion("ZHUANY not between", value1, value2, "zhuany");
            return (Criteria) this;
        }

        public Criteria andLinsIsNull() {
            addCriterion("LINS is null");
            return (Criteria) this;
        }

        public Criteria andLinsIsNotNull() {
            addCriterion("LINS is not null");
            return (Criteria) this;
        }

        public Criteria andLinsEqualTo(String value) {
            addCriterion("LINS =", value, "lins");
            return (Criteria) this;
        }

        public Criteria andLinsNotEqualTo(String value) {
            addCriterion("LINS <>", value, "lins");
            return (Criteria) this;
        }

        public Criteria andLinsGreaterThan(String value) {
            addCriterion("LINS >", value, "lins");
            return (Criteria) this;
        }

        public Criteria andLinsGreaterThanOrEqualTo(String value) {
            addCriterion("LINS >=", value, "lins");
            return (Criteria) this;
        }

        public Criteria andLinsLessThan(String value) {
            addCriterion("LINS <", value, "lins");
            return (Criteria) this;
        }

        public Criteria andLinsLessThanOrEqualTo(String value) {
            addCriterion("LINS <=", value, "lins");
            return (Criteria) this;
        }

        public Criteria andLinsLike(String value) {
            addCriterion("LINS like", value, "lins");
            return (Criteria) this;
        }

        public Criteria andLinsNotLike(String value) {
            addCriterion("LINS not like", value, "lins");
            return (Criteria) this;
        }

        public Criteria andLinsIn(List<String> values) {
            addCriterion("LINS in", values, "lins");
            return (Criteria) this;
        }

        public Criteria andLinsNotIn(List<String> values) {
            addCriterion("LINS not in", values, "lins");
            return (Criteria) this;
        }

        public Criteria andLinsBetween(String value1, String value2) {
            addCriterion("LINS between", value1, value2, "lins");
            return (Criteria) this;
        }

        public Criteria andLinsNotBetween(String value1, String value2) {
            addCriterion("LINS not between", value1, value2, "lins");
            return (Criteria) this;
        }

        public Criteria andJigidIsNull() {
            addCriterion("JIGID is null");
            return (Criteria) this;
        }

        public Criteria andJigidIsNotNull() {
            addCriterion("JIGID is not null");
            return (Criteria) this;
        }

        public Criteria andJigidEqualTo(String value) {
            addCriterion("JIGID =", value, "jigid");
            return (Criteria) this;
        }

        public Criteria andJigidNotEqualTo(String value) {
            addCriterion("JIGID <>", value, "jigid");
            return (Criteria) this;
        }

        public Criteria andJigidGreaterThan(String value) {
            addCriterion("JIGID >", value, "jigid");
            return (Criteria) this;
        }

        public Criteria andJigidGreaterThanOrEqualTo(String value) {
            addCriterion("JIGID >=", value, "jigid");
            return (Criteria) this;
        }

        public Criteria andJigidLessThan(String value) {
            addCriterion("JIGID <", value, "jigid");
            return (Criteria) this;
        }

        public Criteria andJigidLessThanOrEqualTo(String value) {
            addCriterion("JIGID <=", value, "jigid");
            return (Criteria) this;
        }

        public Criteria andJigidLike(String value) {
            addCriterion("JIGID like", value, "jigid");
            return (Criteria) this;
        }

        public Criteria andJigidNotLike(String value) {
            addCriterion("JIGID not like", value, "jigid");
            return (Criteria) this;
        }

        public Criteria andJigidIn(List<String> values) {
            addCriterion("JIGID in", values, "jigid");
            return (Criteria) this;
        }

        public Criteria andJigidNotIn(List<String> values) {
            addCriterion("JIGID not in", values, "jigid");
            return (Criteria) this;
        }

        public Criteria andJigidBetween(String value1, String value2) {
            addCriterion("JIGID between", value1, value2, "jigid");
            return (Criteria) this;
        }

        public Criteria andJigidNotBetween(String value1, String value2) {
            addCriterion("JIGID not between", value1, value2, "jigid");
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