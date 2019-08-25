package cn.goktech.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RizExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RizExample() {
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

        public Criteria andNeirIsNull() {
            addCriterion("NEIR is null");
            return (Criteria) this;
        }

        public Criteria andNeirIsNotNull() {
            addCriterion("NEIR is not null");
            return (Criteria) this;
        }

        public Criteria andNeirEqualTo(String value) {
            addCriterion("NEIR =", value, "neir");
            return (Criteria) this;
        }

        public Criteria andNeirNotEqualTo(String value) {
            addCriterion("NEIR <>", value, "neir");
            return (Criteria) this;
        }

        public Criteria andNeirGreaterThan(String value) {
            addCriterion("NEIR >", value, "neir");
            return (Criteria) this;
        }

        public Criteria andNeirGreaterThanOrEqualTo(String value) {
            addCriterion("NEIR >=", value, "neir");
            return (Criteria) this;
        }

        public Criteria andNeirLessThan(String value) {
            addCriterion("NEIR <", value, "neir");
            return (Criteria) this;
        }

        public Criteria andNeirLessThanOrEqualTo(String value) {
            addCriterion("NEIR <=", value, "neir");
            return (Criteria) this;
        }

        public Criteria andNeirLike(String value) {
            addCriterion("NEIR like", value, "neir");
            return (Criteria) this;
        }

        public Criteria andNeirNotLike(String value) {
            addCriterion("NEIR not like", value, "neir");
            return (Criteria) this;
        }

        public Criteria andNeirIn(List<String> values) {
            addCriterion("NEIR in", values, "neir");
            return (Criteria) this;
        }

        public Criteria andNeirNotIn(List<String> values) {
            addCriterion("NEIR not in", values, "neir");
            return (Criteria) this;
        }

        public Criteria andNeirBetween(String value1, String value2) {
            addCriterion("NEIR between", value1, value2, "neir");
            return (Criteria) this;
        }

        public Criteria andNeirNotBetween(String value1, String value2) {
            addCriterion("NEIR not between", value1, value2, "neir");
            return (Criteria) this;
        }

        public Criteria andLeixIsNull() {
            addCriterion("LEIX is null");
            return (Criteria) this;
        }

        public Criteria andLeixIsNotNull() {
            addCriterion("LEIX is not null");
            return (Criteria) this;
        }

        public Criteria andLeixEqualTo(Object value) {
            addCriterion("LEIX =", value, "leix");
            return (Criteria) this;
        }

        public Criteria andLeixNotEqualTo(Object value) {
            addCriterion("LEIX <>", value, "leix");
            return (Criteria) this;
        }

        public Criteria andLeixGreaterThan(Object value) {
            addCriterion("LEIX >", value, "leix");
            return (Criteria) this;
        }

        public Criteria andLeixGreaterThanOrEqualTo(Object value) {
            addCriterion("LEIX >=", value, "leix");
            return (Criteria) this;
        }

        public Criteria andLeixLessThan(Object value) {
            addCriterion("LEIX <", value, "leix");
            return (Criteria) this;
        }

        public Criteria andLeixLessThanOrEqualTo(Object value) {
            addCriterion("LEIX <=", value, "leix");
            return (Criteria) this;
        }

        public Criteria andLeixIn(List<Object> values) {
            addCriterion("LEIX in", values, "leix");
            return (Criteria) this;
        }

        public Criteria andLeixNotIn(List<Object> values) {
            addCriterion("LEIX not in", values, "leix");
            return (Criteria) this;
        }

        public Criteria andLeixBetween(Object value1, Object value2) {
            addCriterion("LEIX between", value1, value2, "leix");
            return (Criteria) this;
        }

        public Criteria andLeixNotBetween(Object value1, Object value2) {
            addCriterion("LEIX not between", value1, value2, "leix");
            return (Criteria) this;
        }

        public Criteria andRiqsjIsNull() {
            addCriterion("RIQSJ is null");
            return (Criteria) this;
        }

        public Criteria andRiqsjIsNotNull() {
            addCriterion("RIQSJ is not null");
            return (Criteria) this;
        }

        public Criteria andRiqsjEqualTo(Date value) {
            addCriterionForJDBCDate("RIQSJ =", value, "riqsj");
            return (Criteria) this;
        }

        public Criteria andRiqsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("RIQSJ <>", value, "riqsj");
            return (Criteria) this;
        }

        public Criteria andRiqsjGreaterThan(Date value) {
            addCriterionForJDBCDate("RIQSJ >", value, "riqsj");
            return (Criteria) this;
        }

        public Criteria andRiqsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RIQSJ >=", value, "riqsj");
            return (Criteria) this;
        }

        public Criteria andRiqsjLessThan(Date value) {
            addCriterionForJDBCDate("RIQSJ <", value, "riqsj");
            return (Criteria) this;
        }

        public Criteria andRiqsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RIQSJ <=", value, "riqsj");
            return (Criteria) this;
        }

        public Criteria andRiqsjIn(List<Date> values) {
            addCriterionForJDBCDate("RIQSJ in", values, "riqsj");
            return (Criteria) this;
        }

        public Criteria andRiqsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("RIQSJ not in", values, "riqsj");
            return (Criteria) this;
        }

        public Criteria andRiqsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RIQSJ between", value1, value2, "riqsj");
            return (Criteria) this;
        }

        public Criteria andRiqsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RIQSJ not between", value1, value2, "riqsj");
            return (Criteria) this;
        }

        public Criteria andMokIsNull() {
            addCriterion("MOK is null");
            return (Criteria) this;
        }

        public Criteria andMokIsNotNull() {
            addCriterion("MOK is not null");
            return (Criteria) this;
        }

        public Criteria andMokEqualTo(String value) {
            addCriterion("MOK =", value, "mok");
            return (Criteria) this;
        }

        public Criteria andMokNotEqualTo(String value) {
            addCriterion("MOK <>", value, "mok");
            return (Criteria) this;
        }

        public Criteria andMokGreaterThan(String value) {
            addCriterion("MOK >", value, "mok");
            return (Criteria) this;
        }

        public Criteria andMokGreaterThanOrEqualTo(String value) {
            addCriterion("MOK >=", value, "mok");
            return (Criteria) this;
        }

        public Criteria andMokLessThan(String value) {
            addCriterion("MOK <", value, "mok");
            return (Criteria) this;
        }

        public Criteria andMokLessThanOrEqualTo(String value) {
            addCriterion("MOK <=", value, "mok");
            return (Criteria) this;
        }

        public Criteria andMokLike(String value) {
            addCriterion("MOK like", value, "mok");
            return (Criteria) this;
        }

        public Criteria andMokNotLike(String value) {
            addCriterion("MOK not like", value, "mok");
            return (Criteria) this;
        }

        public Criteria andMokIn(List<String> values) {
            addCriterion("MOK in", values, "mok");
            return (Criteria) this;
        }

        public Criteria andMokNotIn(List<String> values) {
            addCriterion("MOK not in", values, "mok");
            return (Criteria) this;
        }

        public Criteria andMokBetween(String value1, String value2) {
            addCriterion("MOK between", value1, value2, "mok");
            return (Criteria) this;
        }

        public Criteria andMokNotBetween(String value1, String value2) {
            addCriterion("MOK not between", value1, value2, "mok");
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

        public Criteria andBiaomIsNull() {
            addCriterion("BIAOM is null");
            return (Criteria) this;
        }

        public Criteria andBiaomIsNotNull() {
            addCriterion("BIAOM is not null");
            return (Criteria) this;
        }

        public Criteria andBiaomEqualTo(String value) {
            addCriterion("BIAOM =", value, "biaom");
            return (Criteria) this;
        }

        public Criteria andBiaomNotEqualTo(String value) {
            addCriterion("BIAOM <>", value, "biaom");
            return (Criteria) this;
        }

        public Criteria andBiaomGreaterThan(String value) {
            addCriterion("BIAOM >", value, "biaom");
            return (Criteria) this;
        }

        public Criteria andBiaomGreaterThanOrEqualTo(String value) {
            addCriterion("BIAOM >=", value, "biaom");
            return (Criteria) this;
        }

        public Criteria andBiaomLessThan(String value) {
            addCriterion("BIAOM <", value, "biaom");
            return (Criteria) this;
        }

        public Criteria andBiaomLessThanOrEqualTo(String value) {
            addCriterion("BIAOM <=", value, "biaom");
            return (Criteria) this;
        }

        public Criteria andBiaomLike(String value) {
            addCriterion("BIAOM like", value, "biaom");
            return (Criteria) this;
        }

        public Criteria andBiaomNotLike(String value) {
            addCriterion("BIAOM not like", value, "biaom");
            return (Criteria) this;
        }

        public Criteria andBiaomIn(List<String> values) {
            addCriterion("BIAOM in", values, "biaom");
            return (Criteria) this;
        }

        public Criteria andBiaomNotIn(List<String> values) {
            addCriterion("BIAOM not in", values, "biaom");
            return (Criteria) this;
        }

        public Criteria andBiaomBetween(String value1, String value2) {
            addCriterion("BIAOM between", value1, value2, "biaom");
            return (Criteria) this;
        }

        public Criteria andBiaomNotBetween(String value1, String value2) {
            addCriterion("BIAOM not between", value1, value2, "biaom");
            return (Criteria) this;
        }

        public Criteria andSqlyjIsNull() {
            addCriterion("SQLYJ is null");
            return (Criteria) this;
        }

        public Criteria andSqlyjIsNotNull() {
            addCriterion("SQLYJ is not null");
            return (Criteria) this;
        }

        public Criteria andSqlyjEqualTo(String value) {
            addCriterion("SQLYJ =", value, "sqlyj");
            return (Criteria) this;
        }

        public Criteria andSqlyjNotEqualTo(String value) {
            addCriterion("SQLYJ <>", value, "sqlyj");
            return (Criteria) this;
        }

        public Criteria andSqlyjGreaterThan(String value) {
            addCriterion("SQLYJ >", value, "sqlyj");
            return (Criteria) this;
        }

        public Criteria andSqlyjGreaterThanOrEqualTo(String value) {
            addCriterion("SQLYJ >=", value, "sqlyj");
            return (Criteria) this;
        }

        public Criteria andSqlyjLessThan(String value) {
            addCriterion("SQLYJ <", value, "sqlyj");
            return (Criteria) this;
        }

        public Criteria andSqlyjLessThanOrEqualTo(String value) {
            addCriterion("SQLYJ <=", value, "sqlyj");
            return (Criteria) this;
        }

        public Criteria andSqlyjLike(String value) {
            addCriterion("SQLYJ like", value, "sqlyj");
            return (Criteria) this;
        }

        public Criteria andSqlyjNotLike(String value) {
            addCriterion("SQLYJ not like", value, "sqlyj");
            return (Criteria) this;
        }

        public Criteria andSqlyjIn(List<String> values) {
            addCriterion("SQLYJ in", values, "sqlyj");
            return (Criteria) this;
        }

        public Criteria andSqlyjNotIn(List<String> values) {
            addCriterion("SQLYJ not in", values, "sqlyj");
            return (Criteria) this;
        }

        public Criteria andSqlyjBetween(String value1, String value2) {
            addCriterion("SQLYJ between", value1, value2, "sqlyj");
            return (Criteria) this;
        }

        public Criteria andSqlyjNotBetween(String value1, String value2) {
            addCriterion("SQLYJ not between", value1, value2, "sqlyj");
            return (Criteria) this;
        }

        public Criteria andJiegIsNull() {
            addCriterion("JIEG is null");
            return (Criteria) this;
        }

        public Criteria andJiegIsNotNull() {
            addCriterion("JIEG is not null");
            return (Criteria) this;
        }

        public Criteria andJiegEqualTo(String value) {
            addCriterion("JIEG =", value, "jieg");
            return (Criteria) this;
        }

        public Criteria andJiegNotEqualTo(String value) {
            addCriterion("JIEG <>", value, "jieg");
            return (Criteria) this;
        }

        public Criteria andJiegGreaterThan(String value) {
            addCriterion("JIEG >", value, "jieg");
            return (Criteria) this;
        }

        public Criteria andJiegGreaterThanOrEqualTo(String value) {
            addCriterion("JIEG >=", value, "jieg");
            return (Criteria) this;
        }

        public Criteria andJiegLessThan(String value) {
            addCriterion("JIEG <", value, "jieg");
            return (Criteria) this;
        }

        public Criteria andJiegLessThanOrEqualTo(String value) {
            addCriterion("JIEG <=", value, "jieg");
            return (Criteria) this;
        }

        public Criteria andJiegLike(String value) {
            addCriterion("JIEG like", value, "jieg");
            return (Criteria) this;
        }

        public Criteria andJiegNotLike(String value) {
            addCriterion("JIEG not like", value, "jieg");
            return (Criteria) this;
        }

        public Criteria andJiegIn(List<String> values) {
            addCriterion("JIEG in", values, "jieg");
            return (Criteria) this;
        }

        public Criteria andJiegNotIn(List<String> values) {
            addCriterion("JIEG not in", values, "jieg");
            return (Criteria) this;
        }

        public Criteria andJiegBetween(String value1, String value2) {
            addCriterion("JIEG between", value1, value2, "jieg");
            return (Criteria) this;
        }

        public Criteria andJiegNotBetween(String value1, String value2) {
            addCriterion("JIEG not between", value1, value2, "jieg");
            return (Criteria) this;
        }

        public Criteria andYonghidIsNull() {
            addCriterion("YONGHID is null");
            return (Criteria) this;
        }

        public Criteria andYonghidIsNotNull() {
            addCriterion("YONGHID is not null");
            return (Criteria) this;
        }

        public Criteria andYonghidEqualTo(Object value) {
            addCriterion("YONGHID =", value, "yonghid");
            return (Criteria) this;
        }

        public Criteria andYonghidNotEqualTo(Object value) {
            addCriterion("YONGHID <>", value, "yonghid");
            return (Criteria) this;
        }

        public Criteria andYonghidGreaterThan(Object value) {
            addCriterion("YONGHID >", value, "yonghid");
            return (Criteria) this;
        }

        public Criteria andYonghidGreaterThanOrEqualTo(Object value) {
            addCriterion("YONGHID >=", value, "yonghid");
            return (Criteria) this;
        }

        public Criteria andYonghidLessThan(Object value) {
            addCriterion("YONGHID <", value, "yonghid");
            return (Criteria) this;
        }

        public Criteria andYonghidLessThanOrEqualTo(Object value) {
            addCriterion("YONGHID <=", value, "yonghid");
            return (Criteria) this;
        }

        public Criteria andYonghidIn(List<Object> values) {
            addCriterion("YONGHID in", values, "yonghid");
            return (Criteria) this;
        }

        public Criteria andYonghidNotIn(List<Object> values) {
            addCriterion("YONGHID not in", values, "yonghid");
            return (Criteria) this;
        }

        public Criteria andYonghidBetween(Object value1, Object value2) {
            addCriterion("YONGHID between", value1, value2, "yonghid");
            return (Criteria) this;
        }

        public Criteria andYonghidNotBetween(Object value1, Object value2) {
            addCriterion("YONGHID not between", value1, value2, "yonghid");
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