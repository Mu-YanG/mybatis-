package auth.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApproveDefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApproveDefExample() {
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

        public Criteria andApprIdIsNull() {
            addCriterion("APPR_ID is null");
            return (Criteria) this;
        }

        public Criteria andApprIdIsNotNull() {
            addCriterion("APPR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApprIdEqualTo(Long value) {
            addCriterion("APPR_ID =", value, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdNotEqualTo(Long value) {
            addCriterion("APPR_ID <>", value, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdGreaterThan(Long value) {
            addCriterion("APPR_ID >", value, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdGreaterThanOrEqualTo(Long value) {
            addCriterion("APPR_ID >=", value, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdLessThan(Long value) {
            addCriterion("APPR_ID <", value, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdLessThanOrEqualTo(Long value) {
            addCriterion("APPR_ID <=", value, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdIn(List<Long> values) {
            addCriterion("APPR_ID in", values, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdNotIn(List<Long> values) {
            addCriterion("APPR_ID not in", values, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdBetween(Long value1, Long value2) {
            addCriterion("APPR_ID between", value1, value2, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdNotBetween(Long value1, Long value2) {
            addCriterion("APPR_ID not between", value1, value2, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprObjTypeIsNull() {
            addCriterion("APPR_OBJ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andApprObjTypeIsNotNull() {
            addCriterion("APPR_OBJ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApprObjTypeEqualTo(Integer value) {
            addCriterion("APPR_OBJ_TYPE =", value, "apprObjType");
            return (Criteria) this;
        }

        public Criteria andApprObjTypeNotEqualTo(Integer value) {
            addCriterion("APPR_OBJ_TYPE <>", value, "apprObjType");
            return (Criteria) this;
        }

        public Criteria andApprObjTypeGreaterThan(Integer value) {
            addCriterion("APPR_OBJ_TYPE >", value, "apprObjType");
            return (Criteria) this;
        }

        public Criteria andApprObjTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPR_OBJ_TYPE >=", value, "apprObjType");
            return (Criteria) this;
        }

        public Criteria andApprObjTypeLessThan(Integer value) {
            addCriterion("APPR_OBJ_TYPE <", value, "apprObjType");
            return (Criteria) this;
        }

        public Criteria andApprObjTypeLessThanOrEqualTo(Integer value) {
            addCriterion("APPR_OBJ_TYPE <=", value, "apprObjType");
            return (Criteria) this;
        }

        public Criteria andApprObjTypeIn(List<Integer> values) {
            addCriterion("APPR_OBJ_TYPE in", values, "apprObjType");
            return (Criteria) this;
        }

        public Criteria andApprObjTypeNotIn(List<Integer> values) {
            addCriterion("APPR_OBJ_TYPE not in", values, "apprObjType");
            return (Criteria) this;
        }

        public Criteria andApprObjTypeBetween(Integer value1, Integer value2) {
            addCriterion("APPR_OBJ_TYPE between", value1, value2, "apprObjType");
            return (Criteria) this;
        }

        public Criteria andApprObjTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("APPR_OBJ_TYPE not between", value1, value2, "apprObjType");
            return (Criteria) this;
        }

        public Criteria andApprObjIdIsNull() {
            addCriterion("APPR_OBJ_ID is null");
            return (Criteria) this;
        }

        public Criteria andApprObjIdIsNotNull() {
            addCriterion("APPR_OBJ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApprObjIdEqualTo(Long value) {
            addCriterion("APPR_OBJ_ID =", value, "apprObjId");
            return (Criteria) this;
        }

        public Criteria andApprObjIdNotEqualTo(Long value) {
            addCriterion("APPR_OBJ_ID <>", value, "apprObjId");
            return (Criteria) this;
        }

        public Criteria andApprObjIdGreaterThan(Long value) {
            addCriterion("APPR_OBJ_ID >", value, "apprObjId");
            return (Criteria) this;
        }

        public Criteria andApprObjIdGreaterThanOrEqualTo(Long value) {
            addCriterion("APPR_OBJ_ID >=", value, "apprObjId");
            return (Criteria) this;
        }

        public Criteria andApprObjIdLessThan(Long value) {
            addCriterion("APPR_OBJ_ID <", value, "apprObjId");
            return (Criteria) this;
        }

        public Criteria andApprObjIdLessThanOrEqualTo(Long value) {
            addCriterion("APPR_OBJ_ID <=", value, "apprObjId");
            return (Criteria) this;
        }

        public Criteria andApprObjIdIn(List<Long> values) {
            addCriterion("APPR_OBJ_ID in", values, "apprObjId");
            return (Criteria) this;
        }

        public Criteria andApprObjIdNotIn(List<Long> values) {
            addCriterion("APPR_OBJ_ID not in", values, "apprObjId");
            return (Criteria) this;
        }

        public Criteria andApprObjIdBetween(Long value1, Long value2) {
            addCriterion("APPR_OBJ_ID between", value1, value2, "apprObjId");
            return (Criteria) this;
        }

        public Criteria andApprObjIdNotBetween(Long value1, Long value2) {
            addCriterion("APPR_OBJ_ID not between", value1, value2, "apprObjId");
            return (Criteria) this;
        }

        public Criteria andApprObjNameIsNull() {
            addCriterion("APPR_OBJ_NAME is null");
            return (Criteria) this;
        }

        public Criteria andApprObjNameIsNotNull() {
            addCriterion("APPR_OBJ_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andApprObjNameEqualTo(String value) {
            addCriterion("APPR_OBJ_NAME =", value, "apprObjName");
            return (Criteria) this;
        }

        public Criteria andApprObjNameNotEqualTo(String value) {
            addCriterion("APPR_OBJ_NAME <>", value, "apprObjName");
            return (Criteria) this;
        }

        public Criteria andApprObjNameGreaterThan(String value) {
            addCriterion("APPR_OBJ_NAME >", value, "apprObjName");
            return (Criteria) this;
        }

        public Criteria andApprObjNameGreaterThanOrEqualTo(String value) {
            addCriterion("APPR_OBJ_NAME >=", value, "apprObjName");
            return (Criteria) this;
        }

        public Criteria andApprObjNameLessThan(String value) {
            addCriterion("APPR_OBJ_NAME <", value, "apprObjName");
            return (Criteria) this;
        }

        public Criteria andApprObjNameLessThanOrEqualTo(String value) {
            addCriterion("APPR_OBJ_NAME <=", value, "apprObjName");
            return (Criteria) this;
        }

        public Criteria andApprObjNameLike(String value) {
            addCriterion("APPR_OBJ_NAME like", value, "apprObjName");
            return (Criteria) this;
        }

        public Criteria andApprObjNameNotLike(String value) {
            addCriterion("APPR_OBJ_NAME not like", value, "apprObjName");
            return (Criteria) this;
        }

        public Criteria andApprObjNameIn(List<String> values) {
            addCriterion("APPR_OBJ_NAME in", values, "apprObjName");
            return (Criteria) this;
        }

        public Criteria andApprObjNameNotIn(List<String> values) {
            addCriterion("APPR_OBJ_NAME not in", values, "apprObjName");
            return (Criteria) this;
        }

        public Criteria andApprObjNameBetween(String value1, String value2) {
            addCriterion("APPR_OBJ_NAME between", value1, value2, "apprObjName");
            return (Criteria) this;
        }

        public Criteria andApprObjNameNotBetween(String value1, String value2) {
            addCriterion("APPR_OBJ_NAME not between", value1, value2, "apprObjName");
            return (Criteria) this;
        }

        public Criteria andApprStateIsNull() {
            addCriterion("APPR_STATE is null");
            return (Criteria) this;
        }

        public Criteria andApprStateIsNotNull() {
            addCriterion("APPR_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andApprStateEqualTo(Integer value) {
            addCriterion("APPR_STATE =", value, "apprState");
            return (Criteria) this;
        }

        public Criteria andApprStateNotEqualTo(Integer value) {
            addCriterion("APPR_STATE <>", value, "apprState");
            return (Criteria) this;
        }

        public Criteria andApprStateGreaterThan(Integer value) {
            addCriterion("APPR_STATE >", value, "apprState");
            return (Criteria) this;
        }

        public Criteria andApprStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPR_STATE >=", value, "apprState");
            return (Criteria) this;
        }

        public Criteria andApprStateLessThan(Integer value) {
            addCriterion("APPR_STATE <", value, "apprState");
            return (Criteria) this;
        }

        public Criteria andApprStateLessThanOrEqualTo(Integer value) {
            addCriterion("APPR_STATE <=", value, "apprState");
            return (Criteria) this;
        }

        public Criteria andApprStateIn(List<Integer> values) {
            addCriterion("APPR_STATE in", values, "apprState");
            return (Criteria) this;
        }

        public Criteria andApprStateNotIn(List<Integer> values) {
            addCriterion("APPR_STATE not in", values, "apprState");
            return (Criteria) this;
        }

        public Criteria andApprStateBetween(Integer value1, Integer value2) {
            addCriterion("APPR_STATE between", value1, value2, "apprState");
            return (Criteria) this;
        }

        public Criteria andApprStateNotBetween(Integer value1, Integer value2) {
            addCriterion("APPR_STATE not between", value1, value2, "apprState");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpidIsNull() {
            addCriterion("LTST_APPR_OPID is null");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpidIsNotNull() {
            addCriterion("LTST_APPR_OPID is not null");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpidEqualTo(Long value) {
            addCriterion("LTST_APPR_OPID =", value, "ltstApprOpid");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpidNotEqualTo(Long value) {
            addCriterion("LTST_APPR_OPID <>", value, "ltstApprOpid");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpidGreaterThan(Long value) {
            addCriterion("LTST_APPR_OPID >", value, "ltstApprOpid");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpidGreaterThanOrEqualTo(Long value) {
            addCriterion("LTST_APPR_OPID >=", value, "ltstApprOpid");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpidLessThan(Long value) {
            addCriterion("LTST_APPR_OPID <", value, "ltstApprOpid");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpidLessThanOrEqualTo(Long value) {
            addCriterion("LTST_APPR_OPID <=", value, "ltstApprOpid");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpidIn(List<Long> values) {
            addCriterion("LTST_APPR_OPID in", values, "ltstApprOpid");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpidNotIn(List<Long> values) {
            addCriterion("LTST_APPR_OPID not in", values, "ltstApprOpid");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpidBetween(Long value1, Long value2) {
            addCriterion("LTST_APPR_OPID between", value1, value2, "ltstApprOpid");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpidNotBetween(Long value1, Long value2) {
            addCriterion("LTST_APPR_OPID not between", value1, value2, "ltstApprOpid");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpnameIsNull() {
            addCriterion("LTST_APPR_OPNAME is null");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpnameIsNotNull() {
            addCriterion("LTST_APPR_OPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpnameEqualTo(String value) {
            addCriterion("LTST_APPR_OPNAME =", value, "ltstApprOpname");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpnameNotEqualTo(String value) {
            addCriterion("LTST_APPR_OPNAME <>", value, "ltstApprOpname");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpnameGreaterThan(String value) {
            addCriterion("LTST_APPR_OPNAME >", value, "ltstApprOpname");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpnameGreaterThanOrEqualTo(String value) {
            addCriterion("LTST_APPR_OPNAME >=", value, "ltstApprOpname");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpnameLessThan(String value) {
            addCriterion("LTST_APPR_OPNAME <", value, "ltstApprOpname");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpnameLessThanOrEqualTo(String value) {
            addCriterion("LTST_APPR_OPNAME <=", value, "ltstApprOpname");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpnameLike(String value) {
            addCriterion("LTST_APPR_OPNAME like", value, "ltstApprOpname");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpnameNotLike(String value) {
            addCriterion("LTST_APPR_OPNAME not like", value, "ltstApprOpname");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpnameIn(List<String> values) {
            addCriterion("LTST_APPR_OPNAME in", values, "ltstApprOpname");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpnameNotIn(List<String> values) {
            addCriterion("LTST_APPR_OPNAME not in", values, "ltstApprOpname");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpnameBetween(String value1, String value2) {
            addCriterion("LTST_APPR_OPNAME between", value1, value2, "ltstApprOpname");
            return (Criteria) this;
        }

        public Criteria andLtstApprOpnameNotBetween(String value1, String value2) {
            addCriterion("LTST_APPR_OPNAME not between", value1, value2, "ltstApprOpname");
            return (Criteria) this;
        }

        public Criteria andLtstApprTimeIsNull() {
            addCriterion("LTST_APPR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLtstApprTimeIsNotNull() {
            addCriterion("LTST_APPR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLtstApprTimeEqualTo(Date value) {
            addCriterion("LTST_APPR_TIME =", value, "ltstApprTime");
            return (Criteria) this;
        }

        public Criteria andLtstApprTimeNotEqualTo(Date value) {
            addCriterion("LTST_APPR_TIME <>", value, "ltstApprTime");
            return (Criteria) this;
        }

        public Criteria andLtstApprTimeGreaterThan(Date value) {
            addCriterion("LTST_APPR_TIME >", value, "ltstApprTime");
            return (Criteria) this;
        }

        public Criteria andLtstApprTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LTST_APPR_TIME >=", value, "ltstApprTime");
            return (Criteria) this;
        }

        public Criteria andLtstApprTimeLessThan(Date value) {
            addCriterion("LTST_APPR_TIME <", value, "ltstApprTime");
            return (Criteria) this;
        }

        public Criteria andLtstApprTimeLessThanOrEqualTo(Date value) {
            addCriterion("LTST_APPR_TIME <=", value, "ltstApprTime");
            return (Criteria) this;
        }

        public Criteria andLtstApprTimeIn(List<Date> values) {
            addCriterion("LTST_APPR_TIME in", values, "ltstApprTime");
            return (Criteria) this;
        }

        public Criteria andLtstApprTimeNotIn(List<Date> values) {
            addCriterion("LTST_APPR_TIME not in", values, "ltstApprTime");
            return (Criteria) this;
        }

        public Criteria andLtstApprTimeBetween(Date value1, Date value2) {
            addCriterion("LTST_APPR_TIME between", value1, value2, "ltstApprTime");
            return (Criteria) this;
        }

        public Criteria andLtstApprTimeNotBetween(Date value1, Date value2) {
            addCriterion("LTST_APPR_TIME not between", value1, value2, "ltstApprTime");
            return (Criteria) this;
        }

        public Criteria andLtstApprStateIsNull() {
            addCriterion("LTST_APPR_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLtstApprStateIsNotNull() {
            addCriterion("LTST_APPR_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLtstApprStateEqualTo(Integer value) {
            addCriterion("LTST_APPR_STATE =", value, "ltstApprState");
            return (Criteria) this;
        }

        public Criteria andLtstApprStateNotEqualTo(Integer value) {
            addCriterion("LTST_APPR_STATE <>", value, "ltstApprState");
            return (Criteria) this;
        }

        public Criteria andLtstApprStateGreaterThan(Integer value) {
            addCriterion("LTST_APPR_STATE >", value, "ltstApprState");
            return (Criteria) this;
        }

        public Criteria andLtstApprStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("LTST_APPR_STATE >=", value, "ltstApprState");
            return (Criteria) this;
        }

        public Criteria andLtstApprStateLessThan(Integer value) {
            addCriterion("LTST_APPR_STATE <", value, "ltstApprState");
            return (Criteria) this;
        }

        public Criteria andLtstApprStateLessThanOrEqualTo(Integer value) {
            addCriterion("LTST_APPR_STATE <=", value, "ltstApprState");
            return (Criteria) this;
        }

        public Criteria andLtstApprStateIn(List<Integer> values) {
            addCriterion("LTST_APPR_STATE in", values, "ltstApprState");
            return (Criteria) this;
        }

        public Criteria andLtstApprStateNotIn(List<Integer> values) {
            addCriterion("LTST_APPR_STATE not in", values, "ltstApprState");
            return (Criteria) this;
        }

        public Criteria andLtstApprStateBetween(Integer value1, Integer value2) {
            addCriterion("LTST_APPR_STATE between", value1, value2, "ltstApprState");
            return (Criteria) this;
        }

        public Criteria andLtstApprStateNotBetween(Integer value1, Integer value2) {
            addCriterion("LTST_APPR_STATE not between", value1, value2, "ltstApprState");
            return (Criteria) this;
        }

        public Criteria andLtstApprCommentIsNull() {
            addCriterion("LTST_APPR_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andLtstApprCommentIsNotNull() {
            addCriterion("LTST_APPR_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andLtstApprCommentEqualTo(String value) {
            addCriterion("LTST_APPR_COMMENT =", value, "ltstApprComment");
            return (Criteria) this;
        }

        public Criteria andLtstApprCommentNotEqualTo(String value) {
            addCriterion("LTST_APPR_COMMENT <>", value, "ltstApprComment");
            return (Criteria) this;
        }

        public Criteria andLtstApprCommentGreaterThan(String value) {
            addCriterion("LTST_APPR_COMMENT >", value, "ltstApprComment");
            return (Criteria) this;
        }

        public Criteria andLtstApprCommentGreaterThanOrEqualTo(String value) {
            addCriterion("LTST_APPR_COMMENT >=", value, "ltstApprComment");
            return (Criteria) this;
        }

        public Criteria andLtstApprCommentLessThan(String value) {
            addCriterion("LTST_APPR_COMMENT <", value, "ltstApprComment");
            return (Criteria) this;
        }

        public Criteria andLtstApprCommentLessThanOrEqualTo(String value) {
            addCriterion("LTST_APPR_COMMENT <=", value, "ltstApprComment");
            return (Criteria) this;
        }

        public Criteria andLtstApprCommentLike(String value) {
            addCriterion("LTST_APPR_COMMENT like", value, "ltstApprComment");
            return (Criteria) this;
        }

        public Criteria andLtstApprCommentNotLike(String value) {
            addCriterion("LTST_APPR_COMMENT not like", value, "ltstApprComment");
            return (Criteria) this;
        }

        public Criteria andLtstApprCommentIn(List<String> values) {
            addCriterion("LTST_APPR_COMMENT in", values, "ltstApprComment");
            return (Criteria) this;
        }

        public Criteria andLtstApprCommentNotIn(List<String> values) {
            addCriterion("LTST_APPR_COMMENT not in", values, "ltstApprComment");
            return (Criteria) this;
        }

        public Criteria andLtstApprCommentBetween(String value1, String value2) {
            addCriterion("LTST_APPR_COMMENT between", value1, value2, "ltstApprComment");
            return (Criteria) this;
        }

        public Criteria andLtstApprCommentNotBetween(String value1, String value2) {
            addCriterion("LTST_APPR_COMMENT not between", value1, value2, "ltstApprComment");
            return (Criteria) this;
        }

        public Criteria andDataStateIsNull() {
            addCriterion("DATA_STATE is null");
            return (Criteria) this;
        }

        public Criteria andDataStateIsNotNull() {
            addCriterion("DATA_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andDataStateEqualTo(Short value) {
            addCriterion("DATA_STATE =", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateNotEqualTo(Short value) {
            addCriterion("DATA_STATE <>", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateGreaterThan(Short value) {
            addCriterion("DATA_STATE >", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateGreaterThanOrEqualTo(Short value) {
            addCriterion("DATA_STATE >=", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateLessThan(Short value) {
            addCriterion("DATA_STATE <", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateLessThanOrEqualTo(Short value) {
            addCriterion("DATA_STATE <=", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateIn(List<Short> values) {
            addCriterion("DATA_STATE in", values, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateNotIn(List<Short> values) {
            addCriterion("DATA_STATE not in", values, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateBetween(Short value1, Short value2) {
            addCriterion("DATA_STATE between", value1, value2, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateNotBetween(Short value1, Short value2) {
            addCriterion("DATA_STATE not between", value1, value2, "dataState");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Long value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Long value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Long value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Long value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Long value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Long> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Long> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Long value1, Long value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Long value1, Long value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyerIsNull() {
            addCriterion("MODIFYER is null");
            return (Criteria) this;
        }

        public Criteria andModifyerIsNotNull() {
            addCriterion("MODIFYER is not null");
            return (Criteria) this;
        }

        public Criteria andModifyerEqualTo(Long value) {
            addCriterion("MODIFYER =", value, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerNotEqualTo(Long value) {
            addCriterion("MODIFYER <>", value, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerGreaterThan(Long value) {
            addCriterion("MODIFYER >", value, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerGreaterThanOrEqualTo(Long value) {
            addCriterion("MODIFYER >=", value, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerLessThan(Long value) {
            addCriterion("MODIFYER <", value, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerLessThanOrEqualTo(Long value) {
            addCriterion("MODIFYER <=", value, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerIn(List<Long> values) {
            addCriterion("MODIFYER in", values, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerNotIn(List<Long> values) {
            addCriterion("MODIFYER not in", values, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerBetween(Long value1, Long value2) {
            addCriterion("MODIFYER between", value1, value2, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerNotBetween(Long value1, Long value2) {
            addCriterion("MODIFYER not between", value1, value2, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
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