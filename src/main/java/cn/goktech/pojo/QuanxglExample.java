package cn.goktech.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QuanxglExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuanxglExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGuanldxlxIsNull() {
            addCriterion("GUANLDXLX is null");
            return (Criteria) this;
        }

        public Criteria andGuanldxlxIsNotNull() {
            addCriterion("GUANLDXLX is not null");
            return (Criteria) this;
        }

        public Criteria andGuanldxlxEqualTo(Object value) {
            addCriterion("GUANLDXLX =", value, "guanldxlx");
            return (Criteria) this;
        }

        public Criteria andGuanldxlxNotEqualTo(Object value) {
            addCriterion("GUANLDXLX <>", value, "guanldxlx");
            return (Criteria) this;
        }

        public Criteria andGuanldxlxGreaterThan(Object value) {
            addCriterion("GUANLDXLX >", value, "guanldxlx");
            return (Criteria) this;
        }

        public Criteria andGuanldxlxGreaterThanOrEqualTo(Object value) {
            addCriterion("GUANLDXLX >=", value, "guanldxlx");
            return (Criteria) this;
        }

        public Criteria andGuanldxlxLessThan(Object value) {
            addCriterion("GUANLDXLX <", value, "guanldxlx");
            return (Criteria) this;
        }

        public Criteria andGuanldxlxLessThanOrEqualTo(Object value) {
            addCriterion("GUANLDXLX <=", value, "guanldxlx");
            return (Criteria) this;
        }

        public Criteria andGuanldxlxIn(List<Object> values) {
            addCriterion("GUANLDXLX in", values, "guanldxlx");
            return (Criteria) this;
        }

        public Criteria andGuanldxlxNotIn(List<Object> values) {
            addCriterion("GUANLDXLX not in", values, "guanldxlx");
            return (Criteria) this;
        }

        public Criteria andGuanldxlxBetween(Object value1, Object value2) {
            addCriterion("GUANLDXLX between", value1, value2, "guanldxlx");
            return (Criteria) this;
        }

        public Criteria andGuanldxlxNotBetween(Object value1, Object value2) {
            addCriterion("GUANLDXLX not between", value1, value2, "guanldxlx");
            return (Criteria) this;
        }

        public Criteria andGuanldxbsIsNull() {
            addCriterion("GUANLDXBS is null");
            return (Criteria) this;
        }

        public Criteria andGuanldxbsIsNotNull() {
            addCriterion("GUANLDXBS is not null");
            return (Criteria) this;
        }

        public Criteria andGuanldxbsEqualTo(String value) {
            addCriterion("GUANLDXBS =", value, "guanldxbs");
            return (Criteria) this;
        }

        public Criteria andGuanldxbsNotEqualTo(String value) {
            addCriterion("GUANLDXBS <>", value, "guanldxbs");
            return (Criteria) this;
        }

        public Criteria andGuanldxbsGreaterThan(String value) {
            addCriterion("GUANLDXBS >", value, "guanldxbs");
            return (Criteria) this;
        }

        public Criteria andGuanldxbsGreaterThanOrEqualTo(String value) {
            addCriterion("GUANLDXBS >=", value, "guanldxbs");
            return (Criteria) this;
        }

        public Criteria andGuanldxbsLessThan(String value) {
            addCriterion("GUANLDXBS <", value, "guanldxbs");
            return (Criteria) this;
        }

        public Criteria andGuanldxbsLessThanOrEqualTo(String value) {
            addCriterion("GUANLDXBS <=", value, "guanldxbs");
            return (Criteria) this;
        }

        public Criteria andGuanldxbsLike(String value) {
            addCriterion("GUANLDXBS like", value, "guanldxbs");
            return (Criteria) this;
        }

        public Criteria andGuanldxbsNotLike(String value) {
            addCriterion("GUANLDXBS not like", value, "guanldxbs");
            return (Criteria) this;
        }

        public Criteria andGuanldxbsIn(List<String> values) {
            addCriterion("GUANLDXBS in", values, "guanldxbs");
            return (Criteria) this;
        }

        public Criteria andGuanldxbsNotIn(List<String> values) {
            addCriterion("GUANLDXBS not in", values, "guanldxbs");
            return (Criteria) this;
        }

        public Criteria andGuanldxbsBetween(String value1, String value2) {
            addCriterion("GUANLDXBS between", value1, value2, "guanldxbs");
            return (Criteria) this;
        }

        public Criteria andGuanldxbsNotBetween(String value1, String value2) {
            addCriterion("GUANLDXBS not between", value1, value2, "guanldxbs");
            return (Criteria) this;
        }

        public Criteria andGuanldxmcIsNull() {
            addCriterion("GUANLDXMC is null");
            return (Criteria) this;
        }

        public Criteria andGuanldxmcIsNotNull() {
            addCriterion("GUANLDXMC is not null");
            return (Criteria) this;
        }

        public Criteria andGuanldxmcEqualTo(String value) {
            addCriterion("GUANLDXMC =", value, "guanldxmc");
            return (Criteria) this;
        }

        public Criteria andGuanldxmcNotEqualTo(String value) {
            addCriterion("GUANLDXMC <>", value, "guanldxmc");
            return (Criteria) this;
        }

        public Criteria andGuanldxmcGreaterThan(String value) {
            addCriterion("GUANLDXMC >", value, "guanldxmc");
            return (Criteria) this;
        }

        public Criteria andGuanldxmcGreaterThanOrEqualTo(String value) {
            addCriterion("GUANLDXMC >=", value, "guanldxmc");
            return (Criteria) this;
        }

        public Criteria andGuanldxmcLessThan(String value) {
            addCriterion("GUANLDXMC <", value, "guanldxmc");
            return (Criteria) this;
        }

        public Criteria andGuanldxmcLessThanOrEqualTo(String value) {
            addCriterion("GUANLDXMC <=", value, "guanldxmc");
            return (Criteria) this;
        }

        public Criteria andGuanldxmcLike(String value) {
            addCriterion("GUANLDXMC like", value, "guanldxmc");
            return (Criteria) this;
        }

        public Criteria andGuanldxmcNotLike(String value) {
            addCriterion("GUANLDXMC not like", value, "guanldxmc");
            return (Criteria) this;
        }

        public Criteria andGuanldxmcIn(List<String> values) {
            addCriterion("GUANLDXMC in", values, "guanldxmc");
            return (Criteria) this;
        }

        public Criteria andGuanldxmcNotIn(List<String> values) {
            addCriterion("GUANLDXMC not in", values, "guanldxmc");
            return (Criteria) this;
        }

        public Criteria andGuanldxmcBetween(String value1, String value2) {
            addCriterion("GUANLDXMC between", value1, value2, "guanldxmc");
            return (Criteria) this;
        }

        public Criteria andGuanldxmcNotBetween(String value1, String value2) {
            addCriterion("GUANLDXMC not between", value1, value2, "guanldxmc");
            return (Criteria) this;
        }

        public Criteria andQuanxidIsNull() {
            addCriterion("QUANXID is null");
            return (Criteria) this;
        }

        public Criteria andQuanxidIsNotNull() {
            addCriterion("QUANXID is not null");
            return (Criteria) this;
        }

        public Criteria andQuanxidEqualTo(Object value) {
            addCriterion("QUANXID =", value, "quanxid");
            return (Criteria) this;
        }

        public Criteria andQuanxidNotEqualTo(Object value) {
            addCriterion("QUANXID <>", value, "quanxid");
            return (Criteria) this;
        }

        public Criteria andQuanxidGreaterThan(Object value) {
            addCriterion("QUANXID >", value, "quanxid");
            return (Criteria) this;
        }

        public Criteria andQuanxidGreaterThanOrEqualTo(Object value) {
            addCriterion("QUANXID >=", value, "quanxid");
            return (Criteria) this;
        }

        public Criteria andQuanxidLessThan(Object value) {
            addCriterion("QUANXID <", value, "quanxid");
            return (Criteria) this;
        }

        public Criteria andQuanxidLessThanOrEqualTo(Object value) {
            addCriterion("QUANXID <=", value, "quanxid");
            return (Criteria) this;
        }

        public Criteria andQuanxidIn(List<Object> values) {
            addCriterion("QUANXID in", values, "quanxid");
            return (Criteria) this;
        }

        public Criteria andQuanxidNotIn(List<Object> values) {
            addCriterion("QUANXID not in", values, "quanxid");
            return (Criteria) this;
        }

        public Criteria andQuanxidBetween(Object value1, Object value2) {
            addCriterion("QUANXID between", value1, value2, "quanxid");
            return (Criteria) this;
        }

        public Criteria andQuanxidNotBetween(Object value1, Object value2) {
            addCriterion("QUANXID not between", value1, value2, "quanxid");
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