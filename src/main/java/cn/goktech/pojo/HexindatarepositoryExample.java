package cn.goktech.pojo;

import java.util.ArrayList;
import java.util.List;

public class HexindatarepositoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HexindatarepositoryExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andZhdhIsNull() {
            addCriterion("ZHDH is null");
            return (Criteria) this;
        }

        public Criteria andZhdhIsNotNull() {
            addCriterion("ZHDH is not null");
            return (Criteria) this;
        }

        public Criteria andZhdhEqualTo(String value) {
            addCriterion("ZHDH =", value, "zhdh");
            return (Criteria) this;
        }

        public Criteria andZhdhNotEqualTo(String value) {
            addCriterion("ZHDH <>", value, "zhdh");
            return (Criteria) this;
        }

        public Criteria andZhdhGreaterThan(String value) {
            addCriterion("ZHDH >", value, "zhdh");
            return (Criteria) this;
        }

        public Criteria andZhdhGreaterThanOrEqualTo(String value) {
            addCriterion("ZHDH >=", value, "zhdh");
            return (Criteria) this;
        }

        public Criteria andZhdhLessThan(String value) {
            addCriterion("ZHDH <", value, "zhdh");
            return (Criteria) this;
        }

        public Criteria andZhdhLessThanOrEqualTo(String value) {
            addCriterion("ZHDH <=", value, "zhdh");
            return (Criteria) this;
        }

        public Criteria andZhdhLike(String value) {
            addCriterion("ZHDH like", value, "zhdh");
            return (Criteria) this;
        }

        public Criteria andZhdhNotLike(String value) {
            addCriterion("ZHDH not like", value, "zhdh");
            return (Criteria) this;
        }

        public Criteria andZhdhIn(List<String> values) {
            addCriterion("ZHDH in", values, "zhdh");
            return (Criteria) this;
        }

        public Criteria andZhdhNotIn(List<String> values) {
            addCriterion("ZHDH not in", values, "zhdh");
            return (Criteria) this;
        }

        public Criteria andZhdhBetween(String value1, String value2) {
            addCriterion("ZHDH between", value1, value2, "zhdh");
            return (Criteria) this;
        }

        public Criteria andZhdhNotBetween(String value1, String value2) {
            addCriterion("ZHDH not between", value1, value2, "zhdh");
            return (Criteria) this;
        }

        public Criteria andKhdhIsNull() {
            addCriterion("KHDH is null");
            return (Criteria) this;
        }

        public Criteria andKhdhIsNotNull() {
            addCriterion("KHDH is not null");
            return (Criteria) this;
        }

        public Criteria andKhdhEqualTo(String value) {
            addCriterion("KHDH =", value, "khdh");
            return (Criteria) this;
        }

        public Criteria andKhdhNotEqualTo(String value) {
            addCriterion("KHDH <>", value, "khdh");
            return (Criteria) this;
        }

        public Criteria andKhdhGreaterThan(String value) {
            addCriterion("KHDH >", value, "khdh");
            return (Criteria) this;
        }

        public Criteria andKhdhGreaterThanOrEqualTo(String value) {
            addCriterion("KHDH >=", value, "khdh");
            return (Criteria) this;
        }

        public Criteria andKhdhLessThan(String value) {
            addCriterion("KHDH <", value, "khdh");
            return (Criteria) this;
        }

        public Criteria andKhdhLessThanOrEqualTo(String value) {
            addCriterion("KHDH <=", value, "khdh");
            return (Criteria) this;
        }

        public Criteria andKhdhLike(String value) {
            addCriterion("KHDH like", value, "khdh");
            return (Criteria) this;
        }

        public Criteria andKhdhNotLike(String value) {
            addCriterion("KHDH not like", value, "khdh");
            return (Criteria) this;
        }

        public Criteria andKhdhIn(List<String> values) {
            addCriterion("KHDH in", values, "khdh");
            return (Criteria) this;
        }

        public Criteria andKhdhNotIn(List<String> values) {
            addCriterion("KHDH not in", values, "khdh");
            return (Criteria) this;
        }

        public Criteria andKhdhBetween(String value1, String value2) {
            addCriterion("KHDH between", value1, value2, "khdh");
            return (Criteria) this;
        }

        public Criteria andKhdhNotBetween(String value1, String value2) {
            addCriterion("KHDH not between", value1, value2, "khdh");
            return (Criteria) this;
        }

        public Criteria andKhmcIsNull() {
            addCriterion("KHMC is null");
            return (Criteria) this;
        }

        public Criteria andKhmcIsNotNull() {
            addCriterion("KHMC is not null");
            return (Criteria) this;
        }

        public Criteria andKhmcEqualTo(String value) {
            addCriterion("KHMC =", value, "khmc");
            return (Criteria) this;
        }

        public Criteria andKhmcNotEqualTo(String value) {
            addCriterion("KHMC <>", value, "khmc");
            return (Criteria) this;
        }

        public Criteria andKhmcGreaterThan(String value) {
            addCriterion("KHMC >", value, "khmc");
            return (Criteria) this;
        }

        public Criteria andKhmcGreaterThanOrEqualTo(String value) {
            addCriterion("KHMC >=", value, "khmc");
            return (Criteria) this;
        }

        public Criteria andKhmcLessThan(String value) {
            addCriterion("KHMC <", value, "khmc");
            return (Criteria) this;
        }

        public Criteria andKhmcLessThanOrEqualTo(String value) {
            addCriterion("KHMC <=", value, "khmc");
            return (Criteria) this;
        }

        public Criteria andKhmcLike(String value) {
            addCriterion("KHMC like", value, "khmc");
            return (Criteria) this;
        }

        public Criteria andKhmcNotLike(String value) {
            addCriterion("KHMC not like", value, "khmc");
            return (Criteria) this;
        }

        public Criteria andKhmcIn(List<String> values) {
            addCriterion("KHMC in", values, "khmc");
            return (Criteria) this;
        }

        public Criteria andKhmcNotIn(List<String> values) {
            addCriterion("KHMC not in", values, "khmc");
            return (Criteria) this;
        }

        public Criteria andKhmcBetween(String value1, String value2) {
            addCriterion("KHMC between", value1, value2, "khmc");
            return (Criteria) this;
        }

        public Criteria andKhmcNotBetween(String value1, String value2) {
            addCriterion("KHMC not between", value1, value2, "khmc");
            return (Criteria) this;
        }

        public Criteria andKhxkzhzhIsNull() {
            addCriterion("KHXKZHZH is null");
            return (Criteria) this;
        }

        public Criteria andKhxkzhzhIsNotNull() {
            addCriterion("KHXKZHZH is not null");
            return (Criteria) this;
        }

        public Criteria andKhxkzhzhEqualTo(String value) {
            addCriterion("KHXKZHZH =", value, "khxkzhzh");
            return (Criteria) this;
        }

        public Criteria andKhxkzhzhNotEqualTo(String value) {
            addCriterion("KHXKZHZH <>", value, "khxkzhzh");
            return (Criteria) this;
        }

        public Criteria andKhxkzhzhGreaterThan(String value) {
            addCriterion("KHXKZHZH >", value, "khxkzhzh");
            return (Criteria) this;
        }

        public Criteria andKhxkzhzhGreaterThanOrEqualTo(String value) {
            addCriterion("KHXKZHZH >=", value, "khxkzhzh");
            return (Criteria) this;
        }

        public Criteria andKhxkzhzhLessThan(String value) {
            addCriterion("KHXKZHZH <", value, "khxkzhzh");
            return (Criteria) this;
        }

        public Criteria andKhxkzhzhLessThanOrEqualTo(String value) {
            addCriterion("KHXKZHZH <=", value, "khxkzhzh");
            return (Criteria) this;
        }

        public Criteria andKhxkzhzhLike(String value) {
            addCriterion("KHXKZHZH like", value, "khxkzhzh");
            return (Criteria) this;
        }

        public Criteria andKhxkzhzhNotLike(String value) {
            addCriterion("KHXKZHZH not like", value, "khxkzhzh");
            return (Criteria) this;
        }

        public Criteria andKhxkzhzhIn(List<String> values) {
            addCriterion("KHXKZHZH in", values, "khxkzhzh");
            return (Criteria) this;
        }

        public Criteria andKhxkzhzhNotIn(List<String> values) {
            addCriterion("KHXKZHZH not in", values, "khxkzhzh");
            return (Criteria) this;
        }

        public Criteria andKhxkzhzhBetween(String value1, String value2) {
            addCriterion("KHXKZHZH between", value1, value2, "khxkzhzh");
            return (Criteria) this;
        }

        public Criteria andKhxkzhzhNotBetween(String value1, String value2) {
            addCriterion("KHXKZHZH not between", value1, value2, "khxkzhzh");
            return (Criteria) this;
        }

        public Criteria andCkrmcIsNull() {
            addCriterion("CKRMC is null");
            return (Criteria) this;
        }

        public Criteria andCkrmcIsNotNull() {
            addCriterion("CKRMC is not null");
            return (Criteria) this;
        }

        public Criteria andCkrmcEqualTo(String value) {
            addCriterion("CKRMC =", value, "ckrmc");
            return (Criteria) this;
        }

        public Criteria andCkrmcNotEqualTo(String value) {
            addCriterion("CKRMC <>", value, "ckrmc");
            return (Criteria) this;
        }

        public Criteria andCkrmcGreaterThan(String value) {
            addCriterion("CKRMC >", value, "ckrmc");
            return (Criteria) this;
        }

        public Criteria andCkrmcGreaterThanOrEqualTo(String value) {
            addCriterion("CKRMC >=", value, "ckrmc");
            return (Criteria) this;
        }

        public Criteria andCkrmcLessThan(String value) {
            addCriterion("CKRMC <", value, "ckrmc");
            return (Criteria) this;
        }

        public Criteria andCkrmcLessThanOrEqualTo(String value) {
            addCriterion("CKRMC <=", value, "ckrmc");
            return (Criteria) this;
        }

        public Criteria andCkrmcLike(String value) {
            addCriterion("CKRMC like", value, "ckrmc");
            return (Criteria) this;
        }

        public Criteria andCkrmcNotLike(String value) {
            addCriterion("CKRMC not like", value, "ckrmc");
            return (Criteria) this;
        }

        public Criteria andCkrmcIn(List<String> values) {
            addCriterion("CKRMC in", values, "ckrmc");
            return (Criteria) this;
        }

        public Criteria andCkrmcNotIn(List<String> values) {
            addCriterion("CKRMC not in", values, "ckrmc");
            return (Criteria) this;
        }

        public Criteria andCkrmcBetween(String value1, String value2) {
            addCriterion("CKRMC between", value1, value2, "ckrmc");
            return (Criteria) this;
        }

        public Criteria andCkrmcNotBetween(String value1, String value2) {
            addCriterion("CKRMC not between", value1, value2, "ckrmc");
            return (Criteria) this;
        }

        public Criteria andGsmcIsNull() {
            addCriterion("GSMC is null");
            return (Criteria) this;
        }

        public Criteria andGsmcIsNotNull() {
            addCriterion("GSMC is not null");
            return (Criteria) this;
        }

        public Criteria andGsmcEqualTo(String value) {
            addCriterion("GSMC =", value, "gsmc");
            return (Criteria) this;
        }

        public Criteria andGsmcNotEqualTo(String value) {
            addCriterion("GSMC <>", value, "gsmc");
            return (Criteria) this;
        }

        public Criteria andGsmcGreaterThan(String value) {
            addCriterion("GSMC >", value, "gsmc");
            return (Criteria) this;
        }

        public Criteria andGsmcGreaterThanOrEqualTo(String value) {
            addCriterion("GSMC >=", value, "gsmc");
            return (Criteria) this;
        }

        public Criteria andGsmcLessThan(String value) {
            addCriterion("GSMC <", value, "gsmc");
            return (Criteria) this;
        }

        public Criteria andGsmcLessThanOrEqualTo(String value) {
            addCriterion("GSMC <=", value, "gsmc");
            return (Criteria) this;
        }

        public Criteria andGsmcLike(String value) {
            addCriterion("GSMC like", value, "gsmc");
            return (Criteria) this;
        }

        public Criteria andGsmcNotLike(String value) {
            addCriterion("GSMC not like", value, "gsmc");
            return (Criteria) this;
        }

        public Criteria andGsmcIn(List<String> values) {
            addCriterion("GSMC in", values, "gsmc");
            return (Criteria) this;
        }

        public Criteria andGsmcNotIn(List<String> values) {
            addCriterion("GSMC not in", values, "gsmc");
            return (Criteria) this;
        }

        public Criteria andGsmcBetween(String value1, String value2) {
            addCriterion("GSMC between", value1, value2, "gsmc");
            return (Criteria) this;
        }

        public Criteria andGsmcNotBetween(String value1, String value2) {
            addCriterion("GSMC not between", value1, value2, "gsmc");
            return (Criteria) this;
        }

        public Criteria andGsyyzzIsNull() {
            addCriterion("GSYYZZ is null");
            return (Criteria) this;
        }

        public Criteria andGsyyzzIsNotNull() {
            addCriterion("GSYYZZ is not null");
            return (Criteria) this;
        }

        public Criteria andGsyyzzEqualTo(String value) {
            addCriterion("GSYYZZ =", value, "gsyyzz");
            return (Criteria) this;
        }

        public Criteria andGsyyzzNotEqualTo(String value) {
            addCriterion("GSYYZZ <>", value, "gsyyzz");
            return (Criteria) this;
        }

        public Criteria andGsyyzzGreaterThan(String value) {
            addCriterion("GSYYZZ >", value, "gsyyzz");
            return (Criteria) this;
        }

        public Criteria andGsyyzzGreaterThanOrEqualTo(String value) {
            addCriterion("GSYYZZ >=", value, "gsyyzz");
            return (Criteria) this;
        }

        public Criteria andGsyyzzLessThan(String value) {
            addCriterion("GSYYZZ <", value, "gsyyzz");
            return (Criteria) this;
        }

        public Criteria andGsyyzzLessThanOrEqualTo(String value) {
            addCriterion("GSYYZZ <=", value, "gsyyzz");
            return (Criteria) this;
        }

        public Criteria andGsyyzzLike(String value) {
            addCriterion("GSYYZZ like", value, "gsyyzz");
            return (Criteria) this;
        }

        public Criteria andGsyyzzNotLike(String value) {
            addCriterion("GSYYZZ not like", value, "gsyyzz");
            return (Criteria) this;
        }

        public Criteria andGsyyzzIn(List<String> values) {
            addCriterion("GSYYZZ in", values, "gsyyzz");
            return (Criteria) this;
        }

        public Criteria andGsyyzzNotIn(List<String> values) {
            addCriterion("GSYYZZ not in", values, "gsyyzz");
            return (Criteria) this;
        }

        public Criteria andGsyyzzBetween(String value1, String value2) {
            addCriterion("GSYYZZ between", value1, value2, "gsyyzz");
            return (Criteria) this;
        }

        public Criteria andGsyyzzNotBetween(String value1, String value2) {
            addCriterion("GSYYZZ not between", value1, value2, "gsyyzz");
            return (Criteria) this;
        }

        public Criteria andGsdjzhIsNull() {
            addCriterion("GSDJZH is null");
            return (Criteria) this;
        }

        public Criteria andGsdjzhIsNotNull() {
            addCriterion("GSDJZH is not null");
            return (Criteria) this;
        }

        public Criteria andGsdjzhEqualTo(String value) {
            addCriterion("GSDJZH =", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhNotEqualTo(String value) {
            addCriterion("GSDJZH <>", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhGreaterThan(String value) {
            addCriterion("GSDJZH >", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhGreaterThanOrEqualTo(String value) {
            addCriterion("GSDJZH >=", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhLessThan(String value) {
            addCriterion("GSDJZH <", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhLessThanOrEqualTo(String value) {
            addCriterion("GSDJZH <=", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhLike(String value) {
            addCriterion("GSDJZH like", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhNotLike(String value) {
            addCriterion("GSDJZH not like", value, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhIn(List<String> values) {
            addCriterion("GSDJZH in", values, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhNotIn(List<String> values) {
            addCriterion("GSDJZH not in", values, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhBetween(String value1, String value2) {
            addCriterion("GSDJZH between", value1, value2, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andGsdjzhNotBetween(String value1, String value2) {
            addCriterion("GSDJZH not between", value1, value2, "gsdjzh");
            return (Criteria) this;
        }

        public Criteria andDsdjzhIsNull() {
            addCriterion("DSDJZH is null");
            return (Criteria) this;
        }

        public Criteria andDsdjzhIsNotNull() {
            addCriterion("DSDJZH is not null");
            return (Criteria) this;
        }

        public Criteria andDsdjzhEqualTo(String value) {
            addCriterion("DSDJZH =", value, "dsdjzh");
            return (Criteria) this;
        }

        public Criteria andDsdjzhNotEqualTo(String value) {
            addCriterion("DSDJZH <>", value, "dsdjzh");
            return (Criteria) this;
        }

        public Criteria andDsdjzhGreaterThan(String value) {
            addCriterion("DSDJZH >", value, "dsdjzh");
            return (Criteria) this;
        }

        public Criteria andDsdjzhGreaterThanOrEqualTo(String value) {
            addCriterion("DSDJZH >=", value, "dsdjzh");
            return (Criteria) this;
        }

        public Criteria andDsdjzhLessThan(String value) {
            addCriterion("DSDJZH <", value, "dsdjzh");
            return (Criteria) this;
        }

        public Criteria andDsdjzhLessThanOrEqualTo(String value) {
            addCriterion("DSDJZH <=", value, "dsdjzh");
            return (Criteria) this;
        }

        public Criteria andDsdjzhLike(String value) {
            addCriterion("DSDJZH like", value, "dsdjzh");
            return (Criteria) this;
        }

        public Criteria andDsdjzhNotLike(String value) {
            addCriterion("DSDJZH not like", value, "dsdjzh");
            return (Criteria) this;
        }

        public Criteria andDsdjzhIn(List<String> values) {
            addCriterion("DSDJZH in", values, "dsdjzh");
            return (Criteria) this;
        }

        public Criteria andDsdjzhNotIn(List<String> values) {
            addCriterion("DSDJZH not in", values, "dsdjzh");
            return (Criteria) this;
        }

        public Criteria andDsdjzhBetween(String value1, String value2) {
            addCriterion("DSDJZH between", value1, value2, "dsdjzh");
            return (Criteria) this;
        }

        public Criteria andDsdjzhNotBetween(String value1, String value2) {
            addCriterion("DSDJZH not between", value1, value2, "dsdjzh");
            return (Criteria) this;
        }

        public Criteria andFrxmIsNull() {
            addCriterion("FRXM is null");
            return (Criteria) this;
        }

        public Criteria andFrxmIsNotNull() {
            addCriterion("FRXM is not null");
            return (Criteria) this;
        }

        public Criteria andFrxmEqualTo(String value) {
            addCriterion("FRXM =", value, "frxm");
            return (Criteria) this;
        }

        public Criteria andFrxmNotEqualTo(String value) {
            addCriterion("FRXM <>", value, "frxm");
            return (Criteria) this;
        }

        public Criteria andFrxmGreaterThan(String value) {
            addCriterion("FRXM >", value, "frxm");
            return (Criteria) this;
        }

        public Criteria andFrxmGreaterThanOrEqualTo(String value) {
            addCriterion("FRXM >=", value, "frxm");
            return (Criteria) this;
        }

        public Criteria andFrxmLessThan(String value) {
            addCriterion("FRXM <", value, "frxm");
            return (Criteria) this;
        }

        public Criteria andFrxmLessThanOrEqualTo(String value) {
            addCriterion("FRXM <=", value, "frxm");
            return (Criteria) this;
        }

        public Criteria andFrxmLike(String value) {
            addCriterion("FRXM like", value, "frxm");
            return (Criteria) this;
        }

        public Criteria andFrxmNotLike(String value) {
            addCriterion("FRXM not like", value, "frxm");
            return (Criteria) this;
        }

        public Criteria andFrxmIn(List<String> values) {
            addCriterion("FRXM in", values, "frxm");
            return (Criteria) this;
        }

        public Criteria andFrxmNotIn(List<String> values) {
            addCriterion("FRXM not in", values, "frxm");
            return (Criteria) this;
        }

        public Criteria andFrxmBetween(String value1, String value2) {
            addCriterion("FRXM between", value1, value2, "frxm");
            return (Criteria) this;
        }

        public Criteria andFrxmNotBetween(String value1, String value2) {
            addCriterion("FRXM not between", value1, value2, "frxm");
            return (Criteria) this;
        }

        public Criteria andFrzjzlIsNull() {
            addCriterion("FRZJZL is null");
            return (Criteria) this;
        }

        public Criteria andFrzjzlIsNotNull() {
            addCriterion("FRZJZL is not null");
            return (Criteria) this;
        }

        public Criteria andFrzjzlEqualTo(String value) {
            addCriterion("FRZJZL =", value, "frzjzl");
            return (Criteria) this;
        }

        public Criteria andFrzjzlNotEqualTo(String value) {
            addCriterion("FRZJZL <>", value, "frzjzl");
            return (Criteria) this;
        }

        public Criteria andFrzjzlGreaterThan(String value) {
            addCriterion("FRZJZL >", value, "frzjzl");
            return (Criteria) this;
        }

        public Criteria andFrzjzlGreaterThanOrEqualTo(String value) {
            addCriterion("FRZJZL >=", value, "frzjzl");
            return (Criteria) this;
        }

        public Criteria andFrzjzlLessThan(String value) {
            addCriterion("FRZJZL <", value, "frzjzl");
            return (Criteria) this;
        }

        public Criteria andFrzjzlLessThanOrEqualTo(String value) {
            addCriterion("FRZJZL <=", value, "frzjzl");
            return (Criteria) this;
        }

        public Criteria andFrzjzlLike(String value) {
            addCriterion("FRZJZL like", value, "frzjzl");
            return (Criteria) this;
        }

        public Criteria andFrzjzlNotLike(String value) {
            addCriterion("FRZJZL not like", value, "frzjzl");
            return (Criteria) this;
        }

        public Criteria andFrzjzlIn(List<String> values) {
            addCriterion("FRZJZL in", values, "frzjzl");
            return (Criteria) this;
        }

        public Criteria andFrzjzlNotIn(List<String> values) {
            addCriterion("FRZJZL not in", values, "frzjzl");
            return (Criteria) this;
        }

        public Criteria andFrzjzlBetween(String value1, String value2) {
            addCriterion("FRZJZL between", value1, value2, "frzjzl");
            return (Criteria) this;
        }

        public Criteria andFrzjzlNotBetween(String value1, String value2) {
            addCriterion("FRZJZL not between", value1, value2, "frzjzl");
            return (Criteria) this;
        }

        public Criteria andFrzjhmIsNull() {
            addCriterion("FRZJHM is null");
            return (Criteria) this;
        }

        public Criteria andFrzjhmIsNotNull() {
            addCriterion("FRZJHM is not null");
            return (Criteria) this;
        }

        public Criteria andFrzjhmEqualTo(String value) {
            addCriterion("FRZJHM =", value, "frzjhm");
            return (Criteria) this;
        }

        public Criteria andFrzjhmNotEqualTo(String value) {
            addCriterion("FRZJHM <>", value, "frzjhm");
            return (Criteria) this;
        }

        public Criteria andFrzjhmGreaterThan(String value) {
            addCriterion("FRZJHM >", value, "frzjhm");
            return (Criteria) this;
        }

        public Criteria andFrzjhmGreaterThanOrEqualTo(String value) {
            addCriterion("FRZJHM >=", value, "frzjhm");
            return (Criteria) this;
        }

        public Criteria andFrzjhmLessThan(String value) {
            addCriterion("FRZJHM <", value, "frzjhm");
            return (Criteria) this;
        }

        public Criteria andFrzjhmLessThanOrEqualTo(String value) {
            addCriterion("FRZJHM <=", value, "frzjhm");
            return (Criteria) this;
        }

        public Criteria andFrzjhmLike(String value) {
            addCriterion("FRZJHM like", value, "frzjhm");
            return (Criteria) this;
        }

        public Criteria andFrzjhmNotLike(String value) {
            addCriterion("FRZJHM not like", value, "frzjhm");
            return (Criteria) this;
        }

        public Criteria andFrzjhmIn(List<String> values) {
            addCriterion("FRZJHM in", values, "frzjhm");
            return (Criteria) this;
        }

        public Criteria andFrzjhmNotIn(List<String> values) {
            addCriterion("FRZJHM not in", values, "frzjhm");
            return (Criteria) this;
        }

        public Criteria andFrzjhmBetween(String value1, String value2) {
            addCriterion("FRZJHM between", value1, value2, "frzjhm");
            return (Criteria) this;
        }

        public Criteria andFrzjhmNotBetween(String value1, String value2) {
            addCriterion("FRZJHM not between", value1, value2, "frzjhm");
            return (Criteria) this;
        }

        public Criteria andZczjzlIsNull() {
            addCriterion("ZCZJZL is null");
            return (Criteria) this;
        }

        public Criteria andZczjzlIsNotNull() {
            addCriterion("ZCZJZL is not null");
            return (Criteria) this;
        }

        public Criteria andZczjzlEqualTo(String value) {
            addCriterion("ZCZJZL =", value, "zczjzl");
            return (Criteria) this;
        }

        public Criteria andZczjzlNotEqualTo(String value) {
            addCriterion("ZCZJZL <>", value, "zczjzl");
            return (Criteria) this;
        }

        public Criteria andZczjzlGreaterThan(String value) {
            addCriterion("ZCZJZL >", value, "zczjzl");
            return (Criteria) this;
        }

        public Criteria andZczjzlGreaterThanOrEqualTo(String value) {
            addCriterion("ZCZJZL >=", value, "zczjzl");
            return (Criteria) this;
        }

        public Criteria andZczjzlLessThan(String value) {
            addCriterion("ZCZJZL <", value, "zczjzl");
            return (Criteria) this;
        }

        public Criteria andZczjzlLessThanOrEqualTo(String value) {
            addCriterion("ZCZJZL <=", value, "zczjzl");
            return (Criteria) this;
        }

        public Criteria andZczjzlLike(String value) {
            addCriterion("ZCZJZL like", value, "zczjzl");
            return (Criteria) this;
        }

        public Criteria andZczjzlNotLike(String value) {
            addCriterion("ZCZJZL not like", value, "zczjzl");
            return (Criteria) this;
        }

        public Criteria andZczjzlIn(List<String> values) {
            addCriterion("ZCZJZL in", values, "zczjzl");
            return (Criteria) this;
        }

        public Criteria andZczjzlNotIn(List<String> values) {
            addCriterion("ZCZJZL not in", values, "zczjzl");
            return (Criteria) this;
        }

        public Criteria andZczjzlBetween(String value1, String value2) {
            addCriterion("ZCZJZL between", value1, value2, "zczjzl");
            return (Criteria) this;
        }

        public Criteria andZczjzlNotBetween(String value1, String value2) {
            addCriterion("ZCZJZL not between", value1, value2, "zczjzl");
            return (Criteria) this;
        }

        public Criteria andZczjIsNull() {
            addCriterion("ZCZJ is null");
            return (Criteria) this;
        }

        public Criteria andZczjIsNotNull() {
            addCriterion("ZCZJ is not null");
            return (Criteria) this;
        }

        public Criteria andZczjEqualTo(String value) {
            addCriterion("ZCZJ =", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotEqualTo(String value) {
            addCriterion("ZCZJ <>", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjGreaterThan(String value) {
            addCriterion("ZCZJ >", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjGreaterThanOrEqualTo(String value) {
            addCriterion("ZCZJ >=", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjLessThan(String value) {
            addCriterion("ZCZJ <", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjLessThanOrEqualTo(String value) {
            addCriterion("ZCZJ <=", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjLike(String value) {
            addCriterion("ZCZJ like", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotLike(String value) {
            addCriterion("ZCZJ not like", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjIn(List<String> values) {
            addCriterion("ZCZJ in", values, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotIn(List<String> values) {
            addCriterion("ZCZJ not in", values, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjBetween(String value1, String value2) {
            addCriterion("ZCZJ between", value1, value2, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotBetween(String value1, String value2) {
            addCriterion("ZCZJ not between", value1, value2, "zczj");
            return (Criteria) this;
        }

        public Criteria andJyfwIsNull() {
            addCriterion("JYFW is null");
            return (Criteria) this;
        }

        public Criteria andJyfwIsNotNull() {
            addCriterion("JYFW is not null");
            return (Criteria) this;
        }

        public Criteria andJyfwEqualTo(String value) {
            addCriterion("JYFW =", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotEqualTo(String value) {
            addCriterion("JYFW <>", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwGreaterThan(String value) {
            addCriterion("JYFW >", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwGreaterThanOrEqualTo(String value) {
            addCriterion("JYFW >=", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLessThan(String value) {
            addCriterion("JYFW <", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLessThanOrEqualTo(String value) {
            addCriterion("JYFW <=", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLike(String value) {
            addCriterion("JYFW like", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotLike(String value) {
            addCriterion("JYFW not like", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwIn(List<String> values) {
            addCriterion("JYFW in", values, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotIn(List<String> values) {
            addCriterion("JYFW not in", values, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwBetween(String value1, String value2) {
            addCriterion("JYFW between", value1, value2, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotBetween(String value1, String value2) {
            addCriterion("JYFW not between", value1, value2, "jyfw");
            return (Criteria) this;
        }

        public Criteria andDzIsNull() {
            addCriterion("DZ is null");
            return (Criteria) this;
        }

        public Criteria andDzIsNotNull() {
            addCriterion("DZ is not null");
            return (Criteria) this;
        }

        public Criteria andDzEqualTo(String value) {
            addCriterion("DZ =", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotEqualTo(String value) {
            addCriterion("DZ <>", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThan(String value) {
            addCriterion("DZ >", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThanOrEqualTo(String value) {
            addCriterion("DZ >=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThan(String value) {
            addCriterion("DZ <", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThanOrEqualTo(String value) {
            addCriterion("DZ <=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLike(String value) {
            addCriterion("DZ like", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotLike(String value) {
            addCriterion("DZ not like", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzIn(List<String> values) {
            addCriterion("DZ in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotIn(List<String> values) {
            addCriterion("DZ not in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzBetween(String value1, String value2) {
            addCriterion("DZ between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotBetween(String value1, String value2) {
            addCriterion("DZ not between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNull() {
            addCriterion("YZBM is null");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNotNull() {
            addCriterion("YZBM is not null");
            return (Criteria) this;
        }

        public Criteria andYzbmEqualTo(String value) {
            addCriterion("YZBM =", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotEqualTo(String value) {
            addCriterion("YZBM <>", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThan(String value) {
            addCriterion("YZBM >", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThanOrEqualTo(String value) {
            addCriterion("YZBM >=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThan(String value) {
            addCriterion("YZBM <", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThanOrEqualTo(String value) {
            addCriterion("YZBM <=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLike(String value) {
            addCriterion("YZBM like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotLike(String value) {
            addCriterion("YZBM not like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmIn(List<String> values) {
            addCriterion("YZBM in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotIn(List<String> values) {
            addCriterion("YZBM not in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmBetween(String value1, String value2) {
            addCriterion("YZBM between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotBetween(String value1, String value2) {
            addCriterion("YZBM not between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andKhyhdmIsNull() {
            addCriterion("KHYHDM is null");
            return (Criteria) this;
        }

        public Criteria andKhyhdmIsNotNull() {
            addCriterion("KHYHDM is not null");
            return (Criteria) this;
        }

        public Criteria andKhyhdmEqualTo(String value) {
            addCriterion("KHYHDM =", value, "khyhdm");
            return (Criteria) this;
        }

        public Criteria andKhyhdmNotEqualTo(String value) {
            addCriterion("KHYHDM <>", value, "khyhdm");
            return (Criteria) this;
        }

        public Criteria andKhyhdmGreaterThan(String value) {
            addCriterion("KHYHDM >", value, "khyhdm");
            return (Criteria) this;
        }

        public Criteria andKhyhdmGreaterThanOrEqualTo(String value) {
            addCriterion("KHYHDM >=", value, "khyhdm");
            return (Criteria) this;
        }

        public Criteria andKhyhdmLessThan(String value) {
            addCriterion("KHYHDM <", value, "khyhdm");
            return (Criteria) this;
        }

        public Criteria andKhyhdmLessThanOrEqualTo(String value) {
            addCriterion("KHYHDM <=", value, "khyhdm");
            return (Criteria) this;
        }

        public Criteria andKhyhdmLike(String value) {
            addCriterion("KHYHDM like", value, "khyhdm");
            return (Criteria) this;
        }

        public Criteria andKhyhdmNotLike(String value) {
            addCriterion("KHYHDM not like", value, "khyhdm");
            return (Criteria) this;
        }

        public Criteria andKhyhdmIn(List<String> values) {
            addCriterion("KHYHDM in", values, "khyhdm");
            return (Criteria) this;
        }

        public Criteria andKhyhdmNotIn(List<String> values) {
            addCriterion("KHYHDM not in", values, "khyhdm");
            return (Criteria) this;
        }

        public Criteria andKhyhdmBetween(String value1, String value2) {
            addCriterion("KHYHDM between", value1, value2, "khyhdm");
            return (Criteria) this;
        }

        public Criteria andKhyhdmNotBetween(String value1, String value2) {
            addCriterion("KHYHDM not between", value1, value2, "khyhdm");
            return (Criteria) this;
        }

        public Criteria andKhyhjgIsNull() {
            addCriterion("KHYHJG is null");
            return (Criteria) this;
        }

        public Criteria andKhyhjgIsNotNull() {
            addCriterion("KHYHJG is not null");
            return (Criteria) this;
        }

        public Criteria andKhyhjgEqualTo(String value) {
            addCriterion("KHYHJG =", value, "khyhjg");
            return (Criteria) this;
        }

        public Criteria andKhyhjgNotEqualTo(String value) {
            addCriterion("KHYHJG <>", value, "khyhjg");
            return (Criteria) this;
        }

        public Criteria andKhyhjgGreaterThan(String value) {
            addCriterion("KHYHJG >", value, "khyhjg");
            return (Criteria) this;
        }

        public Criteria andKhyhjgGreaterThanOrEqualTo(String value) {
            addCriterion("KHYHJG >=", value, "khyhjg");
            return (Criteria) this;
        }

        public Criteria andKhyhjgLessThan(String value) {
            addCriterion("KHYHJG <", value, "khyhjg");
            return (Criteria) this;
        }

        public Criteria andKhyhjgLessThanOrEqualTo(String value) {
            addCriterion("KHYHJG <=", value, "khyhjg");
            return (Criteria) this;
        }

        public Criteria andKhyhjgLike(String value) {
            addCriterion("KHYHJG like", value, "khyhjg");
            return (Criteria) this;
        }

        public Criteria andKhyhjgNotLike(String value) {
            addCriterion("KHYHJG not like", value, "khyhjg");
            return (Criteria) this;
        }

        public Criteria andKhyhjgIn(List<String> values) {
            addCriterion("KHYHJG in", values, "khyhjg");
            return (Criteria) this;
        }

        public Criteria andKhyhjgNotIn(List<String> values) {
            addCriterion("KHYHJG not in", values, "khyhjg");
            return (Criteria) this;
        }

        public Criteria andKhyhjgBetween(String value1, String value2) {
            addCriterion("KHYHJG between", value1, value2, "khyhjg");
            return (Criteria) this;
        }

        public Criteria andKhyhjgNotBetween(String value1, String value2) {
            addCriterion("KHYHJG not between", value1, value2, "khyhjg");
            return (Criteria) this;
        }

        public Criteria andZhxzIsNull() {
            addCriterion("ZHXZ is null");
            return (Criteria) this;
        }

        public Criteria andZhxzIsNotNull() {
            addCriterion("ZHXZ is not null");
            return (Criteria) this;
        }

        public Criteria andZhxzEqualTo(String value) {
            addCriterion("ZHXZ =", value, "zhxz");
            return (Criteria) this;
        }

        public Criteria andZhxzNotEqualTo(String value) {
            addCriterion("ZHXZ <>", value, "zhxz");
            return (Criteria) this;
        }

        public Criteria andZhxzGreaterThan(String value) {
            addCriterion("ZHXZ >", value, "zhxz");
            return (Criteria) this;
        }

        public Criteria andZhxzGreaterThanOrEqualTo(String value) {
            addCriterion("ZHXZ >=", value, "zhxz");
            return (Criteria) this;
        }

        public Criteria andZhxzLessThan(String value) {
            addCriterion("ZHXZ <", value, "zhxz");
            return (Criteria) this;
        }

        public Criteria andZhxzLessThanOrEqualTo(String value) {
            addCriterion("ZHXZ <=", value, "zhxz");
            return (Criteria) this;
        }

        public Criteria andZhxzLike(String value) {
            addCriterion("ZHXZ like", value, "zhxz");
            return (Criteria) this;
        }

        public Criteria andZhxzNotLike(String value) {
            addCriterion("ZHXZ not like", value, "zhxz");
            return (Criteria) this;
        }

        public Criteria andZhxzIn(List<String> values) {
            addCriterion("ZHXZ in", values, "zhxz");
            return (Criteria) this;
        }

        public Criteria andZhxzNotIn(List<String> values) {
            addCriterion("ZHXZ not in", values, "zhxz");
            return (Criteria) this;
        }

        public Criteria andZhxzBetween(String value1, String value2) {
            addCriterion("ZHXZ between", value1, value2, "zhxz");
            return (Criteria) this;
        }

        public Criteria andZhxzNotBetween(String value1, String value2) {
            addCriterion("ZHXZ not between", value1, value2, "zhxz");
            return (Criteria) this;
        }

        public Criteria andKhsjIsNull() {
            addCriterion("KHSJ is null");
            return (Criteria) this;
        }

        public Criteria andKhsjIsNotNull() {
            addCriterion("KHSJ is not null");
            return (Criteria) this;
        }

        public Criteria andKhsjEqualTo(String value) {
            addCriterion("KHSJ =", value, "khsj");
            return (Criteria) this;
        }

        public Criteria andKhsjNotEqualTo(String value) {
            addCriterion("KHSJ <>", value, "khsj");
            return (Criteria) this;
        }

        public Criteria andKhsjGreaterThan(String value) {
            addCriterion("KHSJ >", value, "khsj");
            return (Criteria) this;
        }

        public Criteria andKhsjGreaterThanOrEqualTo(String value) {
            addCriterion("KHSJ >=", value, "khsj");
            return (Criteria) this;
        }

        public Criteria andKhsjLessThan(String value) {
            addCriterion("KHSJ <", value, "khsj");
            return (Criteria) this;
        }

        public Criteria andKhsjLessThanOrEqualTo(String value) {
            addCriterion("KHSJ <=", value, "khsj");
            return (Criteria) this;
        }

        public Criteria andKhsjLike(String value) {
            addCriterion("KHSJ like", value, "khsj");
            return (Criteria) this;
        }

        public Criteria andKhsjNotLike(String value) {
            addCriterion("KHSJ not like", value, "khsj");
            return (Criteria) this;
        }

        public Criteria andKhsjIn(List<String> values) {
            addCriterion("KHSJ in", values, "khsj");
            return (Criteria) this;
        }

        public Criteria andKhsjNotIn(List<String> values) {
            addCriterion("KHSJ not in", values, "khsj");
            return (Criteria) this;
        }

        public Criteria andKhsjBetween(String value1, String value2) {
            addCriterion("KHSJ between", value1, value2, "khsj");
            return (Criteria) this;
        }

        public Criteria andKhsjNotBetween(String value1, String value2) {
            addCriterion("KHSJ not between", value1, value2, "khsj");
            return (Criteria) this;
        }

        public Criteria andZhztIsNull() {
            addCriterion("ZHZT is null");
            return (Criteria) this;
        }

        public Criteria andZhztIsNotNull() {
            addCriterion("ZHZT is not null");
            return (Criteria) this;
        }

        public Criteria andZhztEqualTo(String value) {
            addCriterion("ZHZT =", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztNotEqualTo(String value) {
            addCriterion("ZHZT <>", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztGreaterThan(String value) {
            addCriterion("ZHZT >", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztGreaterThanOrEqualTo(String value) {
            addCriterion("ZHZT >=", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztLessThan(String value) {
            addCriterion("ZHZT <", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztLessThanOrEqualTo(String value) {
            addCriterion("ZHZT <=", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztLike(String value) {
            addCriterion("ZHZT like", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztNotLike(String value) {
            addCriterion("ZHZT not like", value, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztIn(List<String> values) {
            addCriterion("ZHZT in", values, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztNotIn(List<String> values) {
            addCriterion("ZHZT not in", values, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztBetween(String value1, String value2) {
            addCriterion("ZHZT between", value1, value2, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhztNotBetween(String value1, String value2) {
            addCriterion("ZHZT not between", value1, value2, "zhzt");
            return (Criteria) this;
        }

        public Criteria andZhmcIsNull() {
            addCriterion("ZHMC is null");
            return (Criteria) this;
        }

        public Criteria andZhmcIsNotNull() {
            addCriterion("ZHMC is not null");
            return (Criteria) this;
        }

        public Criteria andZhmcEqualTo(String value) {
            addCriterion("ZHMC =", value, "zhmc");
            return (Criteria) this;
        }

        public Criteria andZhmcNotEqualTo(String value) {
            addCriterion("ZHMC <>", value, "zhmc");
            return (Criteria) this;
        }

        public Criteria andZhmcGreaterThan(String value) {
            addCriterion("ZHMC >", value, "zhmc");
            return (Criteria) this;
        }

        public Criteria andZhmcGreaterThanOrEqualTo(String value) {
            addCriterion("ZHMC >=", value, "zhmc");
            return (Criteria) this;
        }

        public Criteria andZhmcLessThan(String value) {
            addCriterion("ZHMC <", value, "zhmc");
            return (Criteria) this;
        }

        public Criteria andZhmcLessThanOrEqualTo(String value) {
            addCriterion("ZHMC <=", value, "zhmc");
            return (Criteria) this;
        }

        public Criteria andZhmcLike(String value) {
            addCriterion("ZHMC like", value, "zhmc");
            return (Criteria) this;
        }

        public Criteria andZhmcNotLike(String value) {
            addCriterion("ZHMC not like", value, "zhmc");
            return (Criteria) this;
        }

        public Criteria andZhmcIn(List<String> values) {
            addCriterion("ZHMC in", values, "zhmc");
            return (Criteria) this;
        }

        public Criteria andZhmcNotIn(List<String> values) {
            addCriterion("ZHMC not in", values, "zhmc");
            return (Criteria) this;
        }

        public Criteria andZhmcBetween(String value1, String value2) {
            addCriterion("ZHMC between", value1, value2, "zhmc");
            return (Criteria) this;
        }

        public Criteria andZhmcNotBetween(String value1, String value2) {
            addCriterion("ZHMC not between", value1, value2, "zhmc");
            return (Criteria) this;
        }

        public Criteria andTyshxydmIsNull() {
            addCriterion("TYSHXYDM is null");
            return (Criteria) this;
        }

        public Criteria andTyshxydmIsNotNull() {
            addCriterion("TYSHXYDM is not null");
            return (Criteria) this;
        }

        public Criteria andTyshxydmEqualTo(String value) {
            addCriterion("TYSHXYDM =", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmNotEqualTo(String value) {
            addCriterion("TYSHXYDM <>", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmGreaterThan(String value) {
            addCriterion("TYSHXYDM >", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmGreaterThanOrEqualTo(String value) {
            addCriterion("TYSHXYDM >=", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmLessThan(String value) {
            addCriterion("TYSHXYDM <", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmLessThanOrEqualTo(String value) {
            addCriterion("TYSHXYDM <=", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmLike(String value) {
            addCriterion("TYSHXYDM like", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmNotLike(String value) {
            addCriterion("TYSHXYDM not like", value, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmIn(List<String> values) {
            addCriterion("TYSHXYDM in", values, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmNotIn(List<String> values) {
            addCriterion("TYSHXYDM not in", values, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmBetween(String value1, String value2) {
            addCriterion("TYSHXYDM between", value1, value2, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andTyshxydmNotBetween(String value1, String value2) {
            addCriterion("TYSHXYDM not between", value1, value2, "tyshxydm");
            return (Criteria) this;
        }

        public Criteria andZjyxqIsNull() {
            addCriterion("ZJYXQ is null");
            return (Criteria) this;
        }

        public Criteria andZjyxqIsNotNull() {
            addCriterion("ZJYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andZjyxqEqualTo(String value) {
            addCriterion("ZJYXQ =", value, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqNotEqualTo(String value) {
            addCriterion("ZJYXQ <>", value, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqGreaterThan(String value) {
            addCriterion("ZJYXQ >", value, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqGreaterThanOrEqualTo(String value) {
            addCriterion("ZJYXQ >=", value, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqLessThan(String value) {
            addCriterion("ZJYXQ <", value, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqLessThanOrEqualTo(String value) {
            addCriterion("ZJYXQ <=", value, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqLike(String value) {
            addCriterion("ZJYXQ like", value, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqNotLike(String value) {
            addCriterion("ZJYXQ not like", value, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqIn(List<String> values) {
            addCriterion("ZJYXQ in", values, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqNotIn(List<String> values) {
            addCriterion("ZJYXQ not in", values, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqBetween(String value1, String value2) {
            addCriterion("ZJYXQ between", value1, value2, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqNotBetween(String value1, String value2) {
            addCriterion("ZJYXQ not between", value1, value2, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andDqrqIsNull() {
            addCriterion("DQRQ is null");
            return (Criteria) this;
        }

        public Criteria andDqrqIsNotNull() {
            addCriterion("DQRQ is not null");
            return (Criteria) this;
        }

        public Criteria andDqrqEqualTo(String value) {
            addCriterion("DQRQ =", value, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqNotEqualTo(String value) {
            addCriterion("DQRQ <>", value, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqGreaterThan(String value) {
            addCriterion("DQRQ >", value, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqGreaterThanOrEqualTo(String value) {
            addCriterion("DQRQ >=", value, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqLessThan(String value) {
            addCriterion("DQRQ <", value, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqLessThanOrEqualTo(String value) {
            addCriterion("DQRQ <=", value, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqLike(String value) {
            addCriterion("DQRQ like", value, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqNotLike(String value) {
            addCriterion("DQRQ not like", value, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqIn(List<String> values) {
            addCriterion("DQRQ in", values, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqNotIn(List<String> values) {
            addCriterion("DQRQ not in", values, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqBetween(String value1, String value2) {
            addCriterion("DQRQ between", value1, value2, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqNotBetween(String value1, String value2) {
            addCriterion("DQRQ not between", value1, value2, "dqrq");
            return (Criteria) this;
        }

        public Criteria andNjbjIsNull() {
            addCriterion("NJBJ is null");
            return (Criteria) this;
        }

        public Criteria andNjbjIsNotNull() {
            addCriterion("NJBJ is not null");
            return (Criteria) this;
        }

        public Criteria andNjbjEqualTo(String value) {
            addCriterion("NJBJ =", value, "njbj");
            return (Criteria) this;
        }

        public Criteria andNjbjNotEqualTo(String value) {
            addCriterion("NJBJ <>", value, "njbj");
            return (Criteria) this;
        }

        public Criteria andNjbjGreaterThan(String value) {
            addCriterion("NJBJ >", value, "njbj");
            return (Criteria) this;
        }

        public Criteria andNjbjGreaterThanOrEqualTo(String value) {
            addCriterion("NJBJ >=", value, "njbj");
            return (Criteria) this;
        }

        public Criteria andNjbjLessThan(String value) {
            addCriterion("NJBJ <", value, "njbj");
            return (Criteria) this;
        }

        public Criteria andNjbjLessThanOrEqualTo(String value) {
            addCriterion("NJBJ <=", value, "njbj");
            return (Criteria) this;
        }

        public Criteria andNjbjLike(String value) {
            addCriterion("NJBJ like", value, "njbj");
            return (Criteria) this;
        }

        public Criteria andNjbjNotLike(String value) {
            addCriterion("NJBJ not like", value, "njbj");
            return (Criteria) this;
        }

        public Criteria andNjbjIn(List<String> values) {
            addCriterion("NJBJ in", values, "njbj");
            return (Criteria) this;
        }

        public Criteria andNjbjNotIn(List<String> values) {
            addCriterion("NJBJ not in", values, "njbj");
            return (Criteria) this;
        }

        public Criteria andNjbjBetween(String value1, String value2) {
            addCriterion("NJBJ between", value1, value2, "njbj");
            return (Criteria) this;
        }

        public Criteria andNjbjNotBetween(String value1, String value2) {
            addCriterion("NJBJ not between", value1, value2, "njbj");
            return (Criteria) this;
        }

        public Criteria andZjzlIsNull() {
            addCriterion("ZJZL is null");
            return (Criteria) this;
        }

        public Criteria andZjzlIsNotNull() {
            addCriterion("ZJZL is not null");
            return (Criteria) this;
        }

        public Criteria andZjzlEqualTo(String value) {
            addCriterion("ZJZL =", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotEqualTo(String value) {
            addCriterion("ZJZL <>", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlGreaterThan(String value) {
            addCriterion("ZJZL >", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlGreaterThanOrEqualTo(String value) {
            addCriterion("ZJZL >=", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlLessThan(String value) {
            addCriterion("ZJZL <", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlLessThanOrEqualTo(String value) {
            addCriterion("ZJZL <=", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlLike(String value) {
            addCriterion("ZJZL like", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotLike(String value) {
            addCriterion("ZJZL not like", value, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlIn(List<String> values) {
            addCriterion("ZJZL in", values, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotIn(List<String> values) {
            addCriterion("ZJZL not in", values, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlBetween(String value1, String value2) {
            addCriterion("ZJZL between", value1, value2, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjzlNotBetween(String value1, String value2) {
            addCriterion("ZJZL not between", value1, value2, "zjzl");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNull() {
            addCriterion("ZJHM is null");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNotNull() {
            addCriterion("ZJHM is not null");
            return (Criteria) this;
        }

        public Criteria andZjhmEqualTo(String value) {
            addCriterion("ZJHM =", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotEqualTo(String value) {
            addCriterion("ZJHM <>", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThan(String value) {
            addCriterion("ZJHM >", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("ZJHM >=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThan(String value) {
            addCriterion("ZJHM <", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThanOrEqualTo(String value) {
            addCriterion("ZJHM <=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLike(String value) {
            addCriterion("ZJHM like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotLike(String value) {
            addCriterion("ZJHM not like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmIn(List<String> values) {
            addCriterion("ZJHM in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotIn(List<String> values) {
            addCriterion("ZJHM not in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmBetween(String value1, String value2) {
            addCriterion("ZJHM between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotBetween(String value1, String value2) {
            addCriterion("ZJHM not between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andXhztIsNull() {
            addCriterion("XHZT is null");
            return (Criteria) this;
        }

        public Criteria andXhztIsNotNull() {
            addCriterion("XHZT is not null");
            return (Criteria) this;
        }

        public Criteria andXhztEqualTo(String value) {
            addCriterion("XHZT =", value, "xhzt");
            return (Criteria) this;
        }

        public Criteria andXhztNotEqualTo(String value) {
            addCriterion("XHZT <>", value, "xhzt");
            return (Criteria) this;
        }

        public Criteria andXhztGreaterThan(String value) {
            addCriterion("XHZT >", value, "xhzt");
            return (Criteria) this;
        }

        public Criteria andXhztGreaterThanOrEqualTo(String value) {
            addCriterion("XHZT >=", value, "xhzt");
            return (Criteria) this;
        }

        public Criteria andXhztLessThan(String value) {
            addCriterion("XHZT <", value, "xhzt");
            return (Criteria) this;
        }

        public Criteria andXhztLessThanOrEqualTo(String value) {
            addCriterion("XHZT <=", value, "xhzt");
            return (Criteria) this;
        }

        public Criteria andXhztLike(String value) {
            addCriterion("XHZT like", value, "xhzt");
            return (Criteria) this;
        }

        public Criteria andXhztNotLike(String value) {
            addCriterion("XHZT not like", value, "xhzt");
            return (Criteria) this;
        }

        public Criteria andXhztIn(List<String> values) {
            addCriterion("XHZT in", values, "xhzt");
            return (Criteria) this;
        }

        public Criteria andXhztNotIn(List<String> values) {
            addCriterion("XHZT not in", values, "xhzt");
            return (Criteria) this;
        }

        public Criteria andXhztBetween(String value1, String value2) {
            addCriterion("XHZT between", value1, value2, "xhzt");
            return (Criteria) this;
        }

        public Criteria andXhztNotBetween(String value1, String value2) {
            addCriterion("XHZT not between", value1, value2, "xhzt");
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