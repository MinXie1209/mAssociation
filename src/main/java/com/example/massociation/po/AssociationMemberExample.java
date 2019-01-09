package com.example.massociation.po;

import java.util.ArrayList;
import java.util.List;

public class AssociationMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssociationMemberExample() {
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

        public Criteria andAssociationMemberIdIsNull() {
            addCriterion("association_member_id is null");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberIdIsNotNull() {
            addCriterion("association_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberIdEqualTo(Integer value) {
            addCriterion("association_member_id =", value, "associationMemberId");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberIdNotEqualTo(Integer value) {
            addCriterion("association_member_id <>", value, "associationMemberId");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberIdGreaterThan(Integer value) {
            addCriterion("association_member_id >", value, "associationMemberId");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("association_member_id >=", value, "associationMemberId");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberIdLessThan(Integer value) {
            addCriterion("association_member_id <", value, "associationMemberId");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("association_member_id <=", value, "associationMemberId");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberIdIn(List<Integer> values) {
            addCriterion("association_member_id in", values, "associationMemberId");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberIdNotIn(List<Integer> values) {
            addCriterion("association_member_id not in", values, "associationMemberId");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("association_member_id between", value1, value2, "associationMemberId");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("association_member_id not between", value1, value2, "associationMemberId");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberNoIsNull() {
            addCriterion("association_member_no is null");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberNoIsNotNull() {
            addCriterion("association_member_no is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberNoEqualTo(Integer value) {
            addCriterion("association_member_no =", value, "associationMemberNo");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberNoNotEqualTo(Integer value) {
            addCriterion("association_member_no <>", value, "associationMemberNo");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberNoGreaterThan(Integer value) {
            addCriterion("association_member_no >", value, "associationMemberNo");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("association_member_no >=", value, "associationMemberNo");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberNoLessThan(Integer value) {
            addCriterion("association_member_no <", value, "associationMemberNo");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberNoLessThanOrEqualTo(Integer value) {
            addCriterion("association_member_no <=", value, "associationMemberNo");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberNoIn(List<Integer> values) {
            addCriterion("association_member_no in", values, "associationMemberNo");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberNoNotIn(List<Integer> values) {
            addCriterion("association_member_no not in", values, "associationMemberNo");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberNoBetween(Integer value1, Integer value2) {
            addCriterion("association_member_no between", value1, value2, "associationMemberNo");
            return (Criteria) this;
        }

        public Criteria andAssociationMemberNoNotBetween(Integer value1, Integer value2) {
            addCriterion("association_member_no not between", value1, value2, "associationMemberNo");
            return (Criteria) this;
        }

        public Criteria andAssociationNameIsNull() {
            addCriterion("association_name is null");
            return (Criteria) this;
        }

        public Criteria andAssociationNameIsNotNull() {
            addCriterion("association_name is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationNameEqualTo(String value) {
            addCriterion("association_name =", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameNotEqualTo(String value) {
            addCriterion("association_name <>", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameGreaterThan(String value) {
            addCriterion("association_name >", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameGreaterThanOrEqualTo(String value) {
            addCriterion("association_name >=", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameLessThan(String value) {
            addCriterion("association_name <", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameLessThanOrEqualTo(String value) {
            addCriterion("association_name <=", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameLike(String value) {
            addCriterion("association_name like", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameNotLike(String value) {
            addCriterion("association_name not like", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameIn(List<String> values) {
            addCriterion("association_name in", values, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameNotIn(List<String> values) {
            addCriterion("association_name not in", values, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameBetween(String value1, String value2) {
            addCriterion("association_name between", value1, value2, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameNotBetween(String value1, String value2) {
            addCriterion("association_name not between", value1, value2, "associationName");
            return (Criteria) this;
        }

        public Criteria andDutiesIsNull() {
            addCriterion("duties is null");
            return (Criteria) this;
        }

        public Criteria andDutiesIsNotNull() {
            addCriterion("duties is not null");
            return (Criteria) this;
        }

        public Criteria andDutiesEqualTo(String value) {
            addCriterion("duties =", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesNotEqualTo(String value) {
            addCriterion("duties <>", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesGreaterThan(String value) {
            addCriterion("duties >", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesGreaterThanOrEqualTo(String value) {
            addCriterion("duties >=", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesLessThan(String value) {
            addCriterion("duties <", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesLessThanOrEqualTo(String value) {
            addCriterion("duties <=", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesLike(String value) {
            addCriterion("duties like", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesNotLike(String value) {
            addCriterion("duties not like", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesIn(List<String> values) {
            addCriterion("duties in", values, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesNotIn(List<String> values) {
            addCriterion("duties not in", values, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesBetween(String value1, String value2) {
            addCriterion("duties between", value1, value2, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesNotBetween(String value1, String value2) {
            addCriterion("duties not between", value1, value2, "duties");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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