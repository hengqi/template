package com.chenhl.template.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcctRequestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcctRequestExample() {
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

        public Criteria andAcctrequestidIsNull() {
            addCriterion("acctRequestId is null");
            return (Criteria) this;
        }

        public Criteria andAcctrequestidIsNotNull() {
            addCriterion("acctRequestId is not null");
            return (Criteria) this;
        }

        public Criteria andAcctrequestidEqualTo(Long value) {
            addCriterion("acctRequestId =", value, "acctrequestid");
            return (Criteria) this;
        }

        public Criteria andAcctrequestidNotEqualTo(Long value) {
            addCriterion("acctRequestId <>", value, "acctrequestid");
            return (Criteria) this;
        }

        public Criteria andAcctrequestidGreaterThan(Long value) {
            addCriterion("acctRequestId >", value, "acctrequestid");
            return (Criteria) this;
        }

        public Criteria andAcctrequestidGreaterThanOrEqualTo(Long value) {
            addCriterion("acctRequestId >=", value, "acctrequestid");
            return (Criteria) this;
        }

        public Criteria andAcctrequestidLessThan(Long value) {
            addCriterion("acctRequestId <", value, "acctrequestid");
            return (Criteria) this;
        }

        public Criteria andAcctrequestidLessThanOrEqualTo(Long value) {
            addCriterion("acctRequestId <=", value, "acctrequestid");
            return (Criteria) this;
        }

        public Criteria andAcctrequestidIn(List<Long> values) {
            addCriterion("acctRequestId in", values, "acctrequestid");
            return (Criteria) this;
        }

        public Criteria andAcctrequestidNotIn(List<Long> values) {
            addCriterion("acctRequestId not in", values, "acctrequestid");
            return (Criteria) this;
        }

        public Criteria andAcctrequestidBetween(Long value1, Long value2) {
            addCriterion("acctRequestId between", value1, value2, "acctrequestid");
            return (Criteria) this;
        }

        public Criteria andAcctrequestidNotBetween(Long value1, Long value2) {
            addCriterion("acctRequestId not between", value1, value2, "acctrequestid");
            return (Criteria) this;
        }

        public Criteria andAccountingrequestextidIsNull() {
            addCriterion("accountingRequestExtId is null");
            return (Criteria) this;
        }

        public Criteria andAccountingrequestextidIsNotNull() {
            addCriterion("accountingRequestExtId is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingrequestextidEqualTo(Long value) {
            addCriterion("accountingRequestExtId =", value, "accountingrequestextid");
            return (Criteria) this;
        }

        public Criteria andAccountingrequestextidNotEqualTo(Long value) {
            addCriterion("accountingRequestExtId <>", value, "accountingrequestextid");
            return (Criteria) this;
        }

        public Criteria andAccountingrequestextidGreaterThan(Long value) {
            addCriterion("accountingRequestExtId >", value, "accountingrequestextid");
            return (Criteria) this;
        }

        public Criteria andAccountingrequestextidGreaterThanOrEqualTo(Long value) {
            addCriterion("accountingRequestExtId >=", value, "accountingrequestextid");
            return (Criteria) this;
        }

        public Criteria andAccountingrequestextidLessThan(Long value) {
            addCriterion("accountingRequestExtId <", value, "accountingrequestextid");
            return (Criteria) this;
        }

        public Criteria andAccountingrequestextidLessThanOrEqualTo(Long value) {
            addCriterion("accountingRequestExtId <=", value, "accountingrequestextid");
            return (Criteria) this;
        }

        public Criteria andAccountingrequestextidIn(List<Long> values) {
            addCriterion("accountingRequestExtId in", values, "accountingrequestextid");
            return (Criteria) this;
        }

        public Criteria andAccountingrequestextidNotIn(List<Long> values) {
            addCriterion("accountingRequestExtId not in", values, "accountingrequestextid");
            return (Criteria) this;
        }

        public Criteria andAccountingrequestextidBetween(Long value1, Long value2) {
            addCriterion("accountingRequestExtId between", value1, value2, "accountingrequestextid");
            return (Criteria) this;
        }

        public Criteria andAccountingrequestextidNotBetween(Long value1, Long value2) {
            addCriterion("accountingRequestExtId not between", value1, value2, "accountingrequestextid");
            return (Criteria) this;
        }

        public Criteria andBusinesspartidIsNull() {
            addCriterion("businessPartId is null");
            return (Criteria) this;
        }

        public Criteria andBusinesspartidIsNotNull() {
            addCriterion("businessPartId is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesspartidEqualTo(String value) {
            addCriterion("businessPartId =", value, "businesspartid");
            return (Criteria) this;
        }

        public Criteria andBusinesspartidNotEqualTo(String value) {
            addCriterion("businessPartId <>", value, "businesspartid");
            return (Criteria) this;
        }

        public Criteria andBusinesspartidGreaterThan(String value) {
            addCriterion("businessPartId >", value, "businesspartid");
            return (Criteria) this;
        }

        public Criteria andBusinesspartidGreaterThanOrEqualTo(String value) {
            addCriterion("businessPartId >=", value, "businesspartid");
            return (Criteria) this;
        }

        public Criteria andBusinesspartidLessThan(String value) {
            addCriterion("businessPartId <", value, "businesspartid");
            return (Criteria) this;
        }

        public Criteria andBusinesspartidLessThanOrEqualTo(String value) {
            addCriterion("businessPartId <=", value, "businesspartid");
            return (Criteria) this;
        }

        public Criteria andBusinesspartidLike(String value) {
            addCriterion("businessPartId like", value, "businesspartid");
            return (Criteria) this;
        }

        public Criteria andBusinesspartidNotLike(String value) {
            addCriterion("businessPartId not like", value, "businesspartid");
            return (Criteria) this;
        }

        public Criteria andBusinesspartidIn(List<String> values) {
            addCriterion("businessPartId in", values, "businesspartid");
            return (Criteria) this;
        }

        public Criteria andBusinesspartidNotIn(List<String> values) {
            addCriterion("businessPartId not in", values, "businesspartid");
            return (Criteria) this;
        }

        public Criteria andBusinesspartidBetween(String value1, String value2) {
            addCriterion("businessPartId between", value1, value2, "businesspartid");
            return (Criteria) this;
        }

        public Criteria andBusinesspartidNotBetween(String value1, String value2) {
            addCriterion("businessPartId not between", value1, value2, "businesspartid");
            return (Criteria) this;
        }

        public Criteria andExternaltradenumIsNull() {
            addCriterion("externalTradeNum is null");
            return (Criteria) this;
        }

        public Criteria andExternaltradenumIsNotNull() {
            addCriterion("externalTradeNum is not null");
            return (Criteria) this;
        }

        public Criteria andExternaltradenumEqualTo(String value) {
            addCriterion("externalTradeNum =", value, "externaltradenum");
            return (Criteria) this;
        }

        public Criteria andExternaltradenumNotEqualTo(String value) {
            addCriterion("externalTradeNum <>", value, "externaltradenum");
            return (Criteria) this;
        }

        public Criteria andExternaltradenumGreaterThan(String value) {
            addCriterion("externalTradeNum >", value, "externaltradenum");
            return (Criteria) this;
        }

        public Criteria andExternaltradenumGreaterThanOrEqualTo(String value) {
            addCriterion("externalTradeNum >=", value, "externaltradenum");
            return (Criteria) this;
        }

        public Criteria andExternaltradenumLessThan(String value) {
            addCriterion("externalTradeNum <", value, "externaltradenum");
            return (Criteria) this;
        }

        public Criteria andExternaltradenumLessThanOrEqualTo(String value) {
            addCriterion("externalTradeNum <=", value, "externaltradenum");
            return (Criteria) this;
        }

        public Criteria andExternaltradenumLike(String value) {
            addCriterion("externalTradeNum like", value, "externaltradenum");
            return (Criteria) this;
        }

        public Criteria andExternaltradenumNotLike(String value) {
            addCriterion("externalTradeNum not like", value, "externaltradenum");
            return (Criteria) this;
        }

        public Criteria andExternaltradenumIn(List<String> values) {
            addCriterion("externalTradeNum in", values, "externaltradenum");
            return (Criteria) this;
        }

        public Criteria andExternaltradenumNotIn(List<String> values) {
            addCriterion("externalTradeNum not in", values, "externaltradenum");
            return (Criteria) this;
        }

        public Criteria andExternaltradenumBetween(String value1, String value2) {
            addCriterion("externalTradeNum between", value1, value2, "externaltradenum");
            return (Criteria) this;
        }

        public Criteria andExternaltradenumNotBetween(String value1, String value2) {
            addCriterion("externalTradeNum not between", value1, value2, "externaltradenum");
            return (Criteria) this;
        }

        public Criteria andExternaltradetypeIsNull() {
            addCriterion("externalTradeType is null");
            return (Criteria) this;
        }

        public Criteria andExternaltradetypeIsNotNull() {
            addCriterion("externalTradeType is not null");
            return (Criteria) this;
        }

        public Criteria andExternaltradetypeEqualTo(String value) {
            addCriterion("externalTradeType =", value, "externaltradetype");
            return (Criteria) this;
        }

        public Criteria andExternaltradetypeNotEqualTo(String value) {
            addCriterion("externalTradeType <>", value, "externaltradetype");
            return (Criteria) this;
        }

        public Criteria andExternaltradetypeGreaterThan(String value) {
            addCriterion("externalTradeType >", value, "externaltradetype");
            return (Criteria) this;
        }

        public Criteria andExternaltradetypeGreaterThanOrEqualTo(String value) {
            addCriterion("externalTradeType >=", value, "externaltradetype");
            return (Criteria) this;
        }

        public Criteria andExternaltradetypeLessThan(String value) {
            addCriterion("externalTradeType <", value, "externaltradetype");
            return (Criteria) this;
        }

        public Criteria andExternaltradetypeLessThanOrEqualTo(String value) {
            addCriterion("externalTradeType <=", value, "externaltradetype");
            return (Criteria) this;
        }

        public Criteria andExternaltradetypeLike(String value) {
            addCriterion("externalTradeType like", value, "externaltradetype");
            return (Criteria) this;
        }

        public Criteria andExternaltradetypeNotLike(String value) {
            addCriterion("externalTradeType not like", value, "externaltradetype");
            return (Criteria) this;
        }

        public Criteria andExternaltradetypeIn(List<String> values) {
            addCriterion("externalTradeType in", values, "externaltradetype");
            return (Criteria) this;
        }

        public Criteria andExternaltradetypeNotIn(List<String> values) {
            addCriterion("externalTradeType not in", values, "externaltradetype");
            return (Criteria) this;
        }

        public Criteria andExternaltradetypeBetween(String value1, String value2) {
            addCriterion("externalTradeType between", value1, value2, "externaltradetype");
            return (Criteria) this;
        }

        public Criteria andExternaltradetypeNotBetween(String value1, String value2) {
            addCriterion("externalTradeType not between", value1, value2, "externaltradetype");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradenumIsNull() {
            addCriterion("externalSubTradeNum is null");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradenumIsNotNull() {
            addCriterion("externalSubTradeNum is not null");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradenumEqualTo(String value) {
            addCriterion("externalSubTradeNum =", value, "externalsubtradenum");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradenumNotEqualTo(String value) {
            addCriterion("externalSubTradeNum <>", value, "externalsubtradenum");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradenumGreaterThan(String value) {
            addCriterion("externalSubTradeNum >", value, "externalsubtradenum");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradenumGreaterThanOrEqualTo(String value) {
            addCriterion("externalSubTradeNum >=", value, "externalsubtradenum");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradenumLessThan(String value) {
            addCriterion("externalSubTradeNum <", value, "externalsubtradenum");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradenumLessThanOrEqualTo(String value) {
            addCriterion("externalSubTradeNum <=", value, "externalsubtradenum");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradenumLike(String value) {
            addCriterion("externalSubTradeNum like", value, "externalsubtradenum");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradenumNotLike(String value) {
            addCriterion("externalSubTradeNum not like", value, "externalsubtradenum");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradenumIn(List<String> values) {
            addCriterion("externalSubTradeNum in", values, "externalsubtradenum");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradenumNotIn(List<String> values) {
            addCriterion("externalSubTradeNum not in", values, "externalsubtradenum");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradenumBetween(String value1, String value2) {
            addCriterion("externalSubTradeNum between", value1, value2, "externalsubtradenum");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradenumNotBetween(String value1, String value2) {
            addCriterion("externalSubTradeNum not between", value1, value2, "externalsubtradenum");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradetypeIsNull() {
            addCriterion("externalSubTradeType is null");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradetypeIsNotNull() {
            addCriterion("externalSubTradeType is not null");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradetypeEqualTo(String value) {
            addCriterion("externalSubTradeType =", value, "externalsubtradetype");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradetypeNotEqualTo(String value) {
            addCriterion("externalSubTradeType <>", value, "externalsubtradetype");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradetypeGreaterThan(String value) {
            addCriterion("externalSubTradeType >", value, "externalsubtradetype");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradetypeGreaterThanOrEqualTo(String value) {
            addCriterion("externalSubTradeType >=", value, "externalsubtradetype");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradetypeLessThan(String value) {
            addCriterion("externalSubTradeType <", value, "externalsubtradetype");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradetypeLessThanOrEqualTo(String value) {
            addCriterion("externalSubTradeType <=", value, "externalsubtradetype");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradetypeLike(String value) {
            addCriterion("externalSubTradeType like", value, "externalsubtradetype");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradetypeNotLike(String value) {
            addCriterion("externalSubTradeType not like", value, "externalsubtradetype");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradetypeIn(List<String> values) {
            addCriterion("externalSubTradeType in", values, "externalsubtradetype");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradetypeNotIn(List<String> values) {
            addCriterion("externalSubTradeType not in", values, "externalsubtradetype");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradetypeBetween(String value1, String value2) {
            addCriterion("externalSubTradeType between", value1, value2, "externalsubtradetype");
            return (Criteria) this;
        }

        public Criteria andExternalsubtradetypeNotBetween(String value1, String value2) {
            addCriterion("externalSubTradeType not between", value1, value2, "externalsubtradetype");
            return (Criteria) this;
        }

        public Criteria andBusinessabstractIsNull() {
            addCriterion("businessAbstract is null");
            return (Criteria) this;
        }

        public Criteria andBusinessabstractIsNotNull() {
            addCriterion("businessAbstract is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessabstractEqualTo(String value) {
            addCriterion("businessAbstract =", value, "businessabstract");
            return (Criteria) this;
        }

        public Criteria andBusinessabstractNotEqualTo(String value) {
            addCriterion("businessAbstract <>", value, "businessabstract");
            return (Criteria) this;
        }

        public Criteria andBusinessabstractGreaterThan(String value) {
            addCriterion("businessAbstract >", value, "businessabstract");
            return (Criteria) this;
        }

        public Criteria andBusinessabstractGreaterThanOrEqualTo(String value) {
            addCriterion("businessAbstract >=", value, "businessabstract");
            return (Criteria) this;
        }

        public Criteria andBusinessabstractLessThan(String value) {
            addCriterion("businessAbstract <", value, "businessabstract");
            return (Criteria) this;
        }

        public Criteria andBusinessabstractLessThanOrEqualTo(String value) {
            addCriterion("businessAbstract <=", value, "businessabstract");
            return (Criteria) this;
        }

        public Criteria andBusinessabstractLike(String value) {
            addCriterion("businessAbstract like", value, "businessabstract");
            return (Criteria) this;
        }

        public Criteria andBusinessabstractNotLike(String value) {
            addCriterion("businessAbstract not like", value, "businessabstract");
            return (Criteria) this;
        }

        public Criteria andBusinessabstractIn(List<String> values) {
            addCriterion("businessAbstract in", values, "businessabstract");
            return (Criteria) this;
        }

        public Criteria andBusinessabstractNotIn(List<String> values) {
            addCriterion("businessAbstract not in", values, "businessabstract");
            return (Criteria) this;
        }

        public Criteria andBusinessabstractBetween(String value1, String value2) {
            addCriterion("businessAbstract between", value1, value2, "businessabstract");
            return (Criteria) this;
        }

        public Criteria andBusinessabstractNotBetween(String value1, String value2) {
            addCriterion("businessAbstract not between", value1, value2, "businessabstract");
            return (Criteria) this;
        }

        public Criteria andMessagebodyIsNull() {
            addCriterion("messageBody is null");
            return (Criteria) this;
        }

        public Criteria andMessagebodyIsNotNull() {
            addCriterion("messageBody is not null");
            return (Criteria) this;
        }

        public Criteria andMessagebodyEqualTo(String value) {
            addCriterion("messageBody =", value, "messagebody");
            return (Criteria) this;
        }

        public Criteria andMessagebodyNotEqualTo(String value) {
            addCriterion("messageBody <>", value, "messagebody");
            return (Criteria) this;
        }

        public Criteria andMessagebodyGreaterThan(String value) {
            addCriterion("messageBody >", value, "messagebody");
            return (Criteria) this;
        }

        public Criteria andMessagebodyGreaterThanOrEqualTo(String value) {
            addCriterion("messageBody >=", value, "messagebody");
            return (Criteria) this;
        }

        public Criteria andMessagebodyLessThan(String value) {
            addCriterion("messageBody <", value, "messagebody");
            return (Criteria) this;
        }

        public Criteria andMessagebodyLessThanOrEqualTo(String value) {
            addCriterion("messageBody <=", value, "messagebody");
            return (Criteria) this;
        }

        public Criteria andMessagebodyLike(String value) {
            addCriterion("messageBody like", value, "messagebody");
            return (Criteria) this;
        }

        public Criteria andMessagebodyNotLike(String value) {
            addCriterion("messageBody not like", value, "messagebody");
            return (Criteria) this;
        }

        public Criteria andMessagebodyIn(List<String> values) {
            addCriterion("messageBody in", values, "messagebody");
            return (Criteria) this;
        }

        public Criteria andMessagebodyNotIn(List<String> values) {
            addCriterion("messageBody not in", values, "messagebody");
            return (Criteria) this;
        }

        public Criteria andMessagebodyBetween(String value1, String value2) {
            addCriterion("messageBody between", value1, value2, "messagebody");
            return (Criteria) this;
        }

        public Criteria andMessagebodyNotBetween(String value1, String value2) {
            addCriterion("messageBody not between", value1, value2, "messagebody");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIsNull() {
            addCriterion("errorCode is null");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIsNotNull() {
            addCriterion("errorCode is not null");
            return (Criteria) this;
        }

        public Criteria andErrorcodeEqualTo(String value) {
            addCriterion("errorCode =", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotEqualTo(String value) {
            addCriterion("errorCode <>", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeGreaterThan(String value) {
            addCriterion("errorCode >", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("errorCode >=", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLessThan(String value) {
            addCriterion("errorCode <", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLessThanOrEqualTo(String value) {
            addCriterion("errorCode <=", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLike(String value) {
            addCriterion("errorCode like", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotLike(String value) {
            addCriterion("errorCode not like", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIn(List<String> values) {
            addCriterion("errorCode in", values, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotIn(List<String> values) {
            addCriterion("errorCode not in", values, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeBetween(String value1, String value2) {
            addCriterion("errorCode between", value1, value2, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotBetween(String value1, String value2) {
            addCriterion("errorCode not between", value1, value2, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrormsgIsNull() {
            addCriterion("errorMsg is null");
            return (Criteria) this;
        }

        public Criteria andErrormsgIsNotNull() {
            addCriterion("errorMsg is not null");
            return (Criteria) this;
        }

        public Criteria andErrormsgEqualTo(String value) {
            addCriterion("errorMsg =", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotEqualTo(String value) {
            addCriterion("errorMsg <>", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgGreaterThan(String value) {
            addCriterion("errorMsg >", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgGreaterThanOrEqualTo(String value) {
            addCriterion("errorMsg >=", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLessThan(String value) {
            addCriterion("errorMsg <", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLessThanOrEqualTo(String value) {
            addCriterion("errorMsg <=", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLike(String value) {
            addCriterion("errorMsg like", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotLike(String value) {
            addCriterion("errorMsg not like", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgIn(List<String> values) {
            addCriterion("errorMsg in", values, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotIn(List<String> values) {
            addCriterion("errorMsg not in", values, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgBetween(String value1, String value2) {
            addCriterion("errorMsg between", value1, value2, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotBetween(String value1, String value2) {
            addCriterion("errorMsg not between", value1, value2, "errormsg");
            return (Criteria) this;
        }

        public Criteria andAccountingstatusIsNull() {
            addCriterion("accountingStatus is null");
            return (Criteria) this;
        }

        public Criteria andAccountingstatusIsNotNull() {
            addCriterion("accountingStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingstatusEqualTo(String value) {
            addCriterion("accountingStatus =", value, "accountingstatus");
            return (Criteria) this;
        }

        public Criteria andAccountingstatusNotEqualTo(String value) {
            addCriterion("accountingStatus <>", value, "accountingstatus");
            return (Criteria) this;
        }

        public Criteria andAccountingstatusGreaterThan(String value) {
            addCriterion("accountingStatus >", value, "accountingstatus");
            return (Criteria) this;
        }

        public Criteria andAccountingstatusGreaterThanOrEqualTo(String value) {
            addCriterion("accountingStatus >=", value, "accountingstatus");
            return (Criteria) this;
        }

        public Criteria andAccountingstatusLessThan(String value) {
            addCriterion("accountingStatus <", value, "accountingstatus");
            return (Criteria) this;
        }

        public Criteria andAccountingstatusLessThanOrEqualTo(String value) {
            addCriterion("accountingStatus <=", value, "accountingstatus");
            return (Criteria) this;
        }

        public Criteria andAccountingstatusLike(String value) {
            addCriterion("accountingStatus like", value, "accountingstatus");
            return (Criteria) this;
        }

        public Criteria andAccountingstatusNotLike(String value) {
            addCriterion("accountingStatus not like", value, "accountingstatus");
            return (Criteria) this;
        }

        public Criteria andAccountingstatusIn(List<String> values) {
            addCriterion("accountingStatus in", values, "accountingstatus");
            return (Criteria) this;
        }

        public Criteria andAccountingstatusNotIn(List<String> values) {
            addCriterion("accountingStatus not in", values, "accountingstatus");
            return (Criteria) this;
        }

        public Criteria andAccountingstatusBetween(String value1, String value2) {
            addCriterion("accountingStatus between", value1, value2, "accountingstatus");
            return (Criteria) this;
        }

        public Criteria andAccountingstatusNotBetween(String value1, String value2) {
            addCriterion("accountingStatus not between", value1, value2, "accountingstatus");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNull() {
            addCriterion("inputDate is null");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNotNull() {
            addCriterion("inputDate is not null");
            return (Criteria) this;
        }

        public Criteria andInputdateEqualTo(Date value) {
            addCriterion("inputDate =", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotEqualTo(Date value) {
            addCriterion("inputDate <>", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThan(Date value) {
            addCriterion("inputDate >", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThanOrEqualTo(Date value) {
            addCriterion("inputDate >=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThan(Date value) {
            addCriterion("inputDate <", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThanOrEqualTo(Date value) {
            addCriterion("inputDate <=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIn(List<Date> values) {
            addCriterion("inputDate in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotIn(List<Date> values) {
            addCriterion("inputDate not in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateBetween(Date value1, Date value2) {
            addCriterion("inputDate between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotBetween(Date value1, Date value2) {
            addCriterion("inputDate not between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andStampdateIsNull() {
            addCriterion("stampDate is null");
            return (Criteria) this;
        }

        public Criteria andStampdateIsNotNull() {
            addCriterion("stampDate is not null");
            return (Criteria) this;
        }

        public Criteria andStampdateEqualTo(Date value) {
            addCriterion("stampDate =", value, "stampdate");
            return (Criteria) this;
        }

        public Criteria andStampdateNotEqualTo(Date value) {
            addCriterion("stampDate <>", value, "stampdate");
            return (Criteria) this;
        }

        public Criteria andStampdateGreaterThan(Date value) {
            addCriterion("stampDate >", value, "stampdate");
            return (Criteria) this;
        }

        public Criteria andStampdateGreaterThanOrEqualTo(Date value) {
            addCriterion("stampDate >=", value, "stampdate");
            return (Criteria) this;
        }

        public Criteria andStampdateLessThan(Date value) {
            addCriterion("stampDate <", value, "stampdate");
            return (Criteria) this;
        }

        public Criteria andStampdateLessThanOrEqualTo(Date value) {
            addCriterion("stampDate <=", value, "stampdate");
            return (Criteria) this;
        }

        public Criteria andStampdateIn(List<Date> values) {
            addCriterion("stampDate in", values, "stampdate");
            return (Criteria) this;
        }

        public Criteria andStampdateNotIn(List<Date> values) {
            addCriterion("stampDate not in", values, "stampdate");
            return (Criteria) this;
        }

        public Criteria andStampdateBetween(Date value1, Date value2) {
            addCriterion("stampDate between", value1, value2, "stampdate");
            return (Criteria) this;
        }

        public Criteria andStampdateNotBetween(Date value1, Date value2) {
            addCriterion("stampDate not between", value1, value2, "stampdate");
            return (Criteria) this;
        }

        public Criteria andInputmanIsNull() {
            addCriterion("inputMan is null");
            return (Criteria) this;
        }

        public Criteria andInputmanIsNotNull() {
            addCriterion("inputMan is not null");
            return (Criteria) this;
        }

        public Criteria andInputmanEqualTo(String value) {
            addCriterion("inputMan =", value, "inputman");
            return (Criteria) this;
        }

        public Criteria andInputmanNotEqualTo(String value) {
            addCriterion("inputMan <>", value, "inputman");
            return (Criteria) this;
        }

        public Criteria andInputmanGreaterThan(String value) {
            addCriterion("inputMan >", value, "inputman");
            return (Criteria) this;
        }

        public Criteria andInputmanGreaterThanOrEqualTo(String value) {
            addCriterion("inputMan >=", value, "inputman");
            return (Criteria) this;
        }

        public Criteria andInputmanLessThan(String value) {
            addCriterion("inputMan <", value, "inputman");
            return (Criteria) this;
        }

        public Criteria andInputmanLessThanOrEqualTo(String value) {
            addCriterion("inputMan <=", value, "inputman");
            return (Criteria) this;
        }

        public Criteria andInputmanLike(String value) {
            addCriterion("inputMan like", value, "inputman");
            return (Criteria) this;
        }

        public Criteria andInputmanNotLike(String value) {
            addCriterion("inputMan not like", value, "inputman");
            return (Criteria) this;
        }

        public Criteria andInputmanIn(List<String> values) {
            addCriterion("inputMan in", values, "inputman");
            return (Criteria) this;
        }

        public Criteria andInputmanNotIn(List<String> values) {
            addCriterion("inputMan not in", values, "inputman");
            return (Criteria) this;
        }

        public Criteria andInputmanBetween(String value1, String value2) {
            addCriterion("inputMan between", value1, value2, "inputman");
            return (Criteria) this;
        }

        public Criteria andInputmanNotBetween(String value1, String value2) {
            addCriterion("inputMan not between", value1, value2, "inputman");
            return (Criteria) this;
        }

        public Criteria andStampmanIsNull() {
            addCriterion("stampMan is null");
            return (Criteria) this;
        }

        public Criteria andStampmanIsNotNull() {
            addCriterion("stampMan is not null");
            return (Criteria) this;
        }

        public Criteria andStampmanEqualTo(String value) {
            addCriterion("stampMan =", value, "stampman");
            return (Criteria) this;
        }

        public Criteria andStampmanNotEqualTo(String value) {
            addCriterion("stampMan <>", value, "stampman");
            return (Criteria) this;
        }

        public Criteria andStampmanGreaterThan(String value) {
            addCriterion("stampMan >", value, "stampman");
            return (Criteria) this;
        }

        public Criteria andStampmanGreaterThanOrEqualTo(String value) {
            addCriterion("stampMan >=", value, "stampman");
            return (Criteria) this;
        }

        public Criteria andStampmanLessThan(String value) {
            addCriterion("stampMan <", value, "stampman");
            return (Criteria) this;
        }

        public Criteria andStampmanLessThanOrEqualTo(String value) {
            addCriterion("stampMan <=", value, "stampman");
            return (Criteria) this;
        }

        public Criteria andStampmanLike(String value) {
            addCriterion("stampMan like", value, "stampman");
            return (Criteria) this;
        }

        public Criteria andStampmanNotLike(String value) {
            addCriterion("stampMan not like", value, "stampman");
            return (Criteria) this;
        }

        public Criteria andStampmanIn(List<String> values) {
            addCriterion("stampMan in", values, "stampman");
            return (Criteria) this;
        }

        public Criteria andStampmanNotIn(List<String> values) {
            addCriterion("stampMan not in", values, "stampman");
            return (Criteria) this;
        }

        public Criteria andStampmanBetween(String value1, String value2) {
            addCriterion("stampMan between", value1, value2, "stampman");
            return (Criteria) this;
        }

        public Criteria andStampmanNotBetween(String value1, String value2) {
            addCriterion("stampMan not between", value1, value2, "stampman");
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