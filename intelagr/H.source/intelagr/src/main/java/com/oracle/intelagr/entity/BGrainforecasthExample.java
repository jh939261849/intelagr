package com.oracle.intelagr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BGrainforecasthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BGrainforecasthExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("Year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("Year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("Year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("Year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("Year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("Year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("Year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("Year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("Year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("Year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("Year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("Year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("Year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("Year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIsNull() {
            addCriterion("CompanyCode is null");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIsNotNull() {
            addCriterion("CompanyCode is not null");
            return (Criteria) this;
        }

        public Criteria andCompanycodeEqualTo(String value) {
            addCriterion("CompanyCode =", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotEqualTo(String value) {
            addCriterion("CompanyCode <>", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeGreaterThan(String value) {
            addCriterion("CompanyCode >", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyCode >=", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLessThan(String value) {
            addCriterion("CompanyCode <", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLessThanOrEqualTo(String value) {
            addCriterion("CompanyCode <=", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLike(String value) {
            addCriterion("CompanyCode like", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotLike(String value) {
            addCriterion("CompanyCode not like", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIn(List<String> values) {
            addCriterion("CompanyCode in", values, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotIn(List<String> values) {
            addCriterion("CompanyCode not in", values, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeBetween(String value1, String value2) {
            addCriterion("CompanyCode between", value1, value2, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotBetween(String value1, String value2) {
            addCriterion("CompanyCode not between", value1, value2, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("CompanyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("CompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("CompanyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("CompanyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("CompanyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("CompanyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("CompanyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("CompanyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("CompanyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("CompanyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("CompanyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("CompanyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("CompanyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andForecastdateIsNull() {
            addCriterion("ForecastDate is null");
            return (Criteria) this;
        }

        public Criteria andForecastdateIsNotNull() {
            addCriterion("ForecastDate is not null");
            return (Criteria) this;
        }

        public Criteria andForecastdateEqualTo(Date value) {
            addCriterion("ForecastDate =", value, "forecastdate");
            return (Criteria) this;
        }

        public Criteria andForecastdateNotEqualTo(Date value) {
            addCriterion("ForecastDate <>", value, "forecastdate");
            return (Criteria) this;
        }

        public Criteria andForecastdateGreaterThan(Date value) {
            addCriterion("ForecastDate >", value, "forecastdate");
            return (Criteria) this;
        }

        public Criteria andForecastdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ForecastDate >=", value, "forecastdate");
            return (Criteria) this;
        }

        public Criteria andForecastdateLessThan(Date value) {
            addCriterion("ForecastDate <", value, "forecastdate");
            return (Criteria) this;
        }

        public Criteria andForecastdateLessThanOrEqualTo(Date value) {
            addCriterion("ForecastDate <=", value, "forecastdate");
            return (Criteria) this;
        }

        public Criteria andForecastdateIn(List<Date> values) {
            addCriterion("ForecastDate in", values, "forecastdate");
            return (Criteria) this;
        }

        public Criteria andForecastdateNotIn(List<Date> values) {
            addCriterion("ForecastDate not in", values, "forecastdate");
            return (Criteria) this;
        }

        public Criteria andForecastdateBetween(Date value1, Date value2) {
            addCriterion("ForecastDate between", value1, value2, "forecastdate");
            return (Criteria) this;
        }

        public Criteria andForecastdateNotBetween(Date value1, Date value2) {
            addCriterion("ForecastDate not between", value1, value2, "forecastdate");
            return (Criteria) this;
        }

        public Criteria andFarmernameIsNull() {
            addCriterion("FarmerName is null");
            return (Criteria) this;
        }

        public Criteria andFarmernameIsNotNull() {
            addCriterion("FarmerName is not null");
            return (Criteria) this;
        }

        public Criteria andFarmernameEqualTo(String value) {
            addCriterion("FarmerName =", value, "farmername");
            return (Criteria) this;
        }

        public Criteria andFarmernameNotEqualTo(String value) {
            addCriterion("FarmerName <>", value, "farmername");
            return (Criteria) this;
        }

        public Criteria andFarmernameGreaterThan(String value) {
            addCriterion("FarmerName >", value, "farmername");
            return (Criteria) this;
        }

        public Criteria andFarmernameGreaterThanOrEqualTo(String value) {
            addCriterion("FarmerName >=", value, "farmername");
            return (Criteria) this;
        }

        public Criteria andFarmernameLessThan(String value) {
            addCriterion("FarmerName <", value, "farmername");
            return (Criteria) this;
        }

        public Criteria andFarmernameLessThanOrEqualTo(String value) {
            addCriterion("FarmerName <=", value, "farmername");
            return (Criteria) this;
        }

        public Criteria andFarmernameLike(String value) {
            addCriterion("FarmerName like", value, "farmername");
            return (Criteria) this;
        }

        public Criteria andFarmernameNotLike(String value) {
            addCriterion("FarmerName not like", value, "farmername");
            return (Criteria) this;
        }

        public Criteria andFarmernameIn(List<String> values) {
            addCriterion("FarmerName in", values, "farmername");
            return (Criteria) this;
        }

        public Criteria andFarmernameNotIn(List<String> values) {
            addCriterion("FarmerName not in", values, "farmername");
            return (Criteria) this;
        }

        public Criteria andFarmernameBetween(String value1, String value2) {
            addCriterion("FarmerName between", value1, value2, "farmername");
            return (Criteria) this;
        }

        public Criteria andFarmernameNotBetween(String value1, String value2) {
            addCriterion("FarmerName not between", value1, value2, "farmername");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNull() {
            addCriterion("IDNumber is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("IDNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("IDNumber =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("IDNumber <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("IDNumber >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("IDNumber >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("IDNumber <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("IDNumber <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("IDNumber like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("IDNumber not like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("IDNumber in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("IDNumber not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("IDNumber between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("IDNumber not between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andActualmuIsNull() {
            addCriterion("ActualMu is null");
            return (Criteria) this;
        }

        public Criteria andActualmuIsNotNull() {
            addCriterion("ActualMu is not null");
            return (Criteria) this;
        }

        public Criteria andActualmuEqualTo(Float value) {
            addCriterion("ActualMu =", value, "actualmu");
            return (Criteria) this;
        }

        public Criteria andActualmuNotEqualTo(Float value) {
            addCriterion("ActualMu <>", value, "actualmu");
            return (Criteria) this;
        }

        public Criteria andActualmuGreaterThan(Float value) {
            addCriterion("ActualMu >", value, "actualmu");
            return (Criteria) this;
        }

        public Criteria andActualmuGreaterThanOrEqualTo(Float value) {
            addCriterion("ActualMu >=", value, "actualmu");
            return (Criteria) this;
        }

        public Criteria andActualmuLessThan(Float value) {
            addCriterion("ActualMu <", value, "actualmu");
            return (Criteria) this;
        }

        public Criteria andActualmuLessThanOrEqualTo(Float value) {
            addCriterion("ActualMu <=", value, "actualmu");
            return (Criteria) this;
        }

        public Criteria andActualmuIn(List<Float> values) {
            addCriterion("ActualMu in", values, "actualmu");
            return (Criteria) this;
        }

        public Criteria andActualmuNotIn(List<Float> values) {
            addCriterion("ActualMu not in", values, "actualmu");
            return (Criteria) this;
        }

        public Criteria andActualmuBetween(Float value1, Float value2) {
            addCriterion("ActualMu between", value1, value2, "actualmu");
            return (Criteria) this;
        }

        public Criteria andActualmuNotBetween(Float value1, Float value2) {
            addCriterion("ActualMu not between", value1, value2, "actualmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuIsNull() {
            addCriterion("MeasurementMu is null");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuIsNotNull() {
            addCriterion("MeasurementMu is not null");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuEqualTo(Float value) {
            addCriterion("MeasurementMu =", value, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuNotEqualTo(Float value) {
            addCriterion("MeasurementMu <>", value, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuGreaterThan(Float value) {
            addCriterion("MeasurementMu >", value, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuGreaterThanOrEqualTo(Float value) {
            addCriterion("MeasurementMu >=", value, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuLessThan(Float value) {
            addCriterion("MeasurementMu <", value, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuLessThanOrEqualTo(Float value) {
            addCriterion("MeasurementMu <=", value, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuIn(List<Float> values) {
            addCriterion("MeasurementMu in", values, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuNotIn(List<Float> values) {
            addCriterion("MeasurementMu not in", values, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuBetween(Float value1, Float value2) {
            addCriterion("MeasurementMu between", value1, value2, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuNotBetween(Float value1, Float value2) {
            addCriterion("MeasurementMu not between", value1, value2, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMinestimatetotalyieldIsNull() {
            addCriterion("minEstimateTotalYield is null");
            return (Criteria) this;
        }

        public Criteria andMinestimatetotalyieldIsNotNull() {
            addCriterion("minEstimateTotalYield is not null");
            return (Criteria) this;
        }

        public Criteria andMinestimatetotalyieldEqualTo(Float value) {
            addCriterion("minEstimateTotalYield =", value, "minestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMinestimatetotalyieldNotEqualTo(Float value) {
            addCriterion("minEstimateTotalYield <>", value, "minestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMinestimatetotalyieldGreaterThan(Float value) {
            addCriterion("minEstimateTotalYield >", value, "minestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMinestimatetotalyieldGreaterThanOrEqualTo(Float value) {
            addCriterion("minEstimateTotalYield >=", value, "minestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMinestimatetotalyieldLessThan(Float value) {
            addCriterion("minEstimateTotalYield <", value, "minestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMinestimatetotalyieldLessThanOrEqualTo(Float value) {
            addCriterion("minEstimateTotalYield <=", value, "minestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMinestimatetotalyieldIn(List<Float> values) {
            addCriterion("minEstimateTotalYield in", values, "minestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMinestimatetotalyieldNotIn(List<Float> values) {
            addCriterion("minEstimateTotalYield not in", values, "minestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMinestimatetotalyieldBetween(Float value1, Float value2) {
            addCriterion("minEstimateTotalYield between", value1, value2, "minestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMinestimatetotalyieldNotBetween(Float value1, Float value2) {
            addCriterion("minEstimateTotalYield not between", value1, value2, "minestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMaxestimatetotalyieldIsNull() {
            addCriterion("maxEstimateTotalYield is null");
            return (Criteria) this;
        }

        public Criteria andMaxestimatetotalyieldIsNotNull() {
            addCriterion("maxEstimateTotalYield is not null");
            return (Criteria) this;
        }

        public Criteria andMaxestimatetotalyieldEqualTo(Float value) {
            addCriterion("maxEstimateTotalYield =", value, "maxestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMaxestimatetotalyieldNotEqualTo(Float value) {
            addCriterion("maxEstimateTotalYield <>", value, "maxestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMaxestimatetotalyieldGreaterThan(Float value) {
            addCriterion("maxEstimateTotalYield >", value, "maxestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMaxestimatetotalyieldGreaterThanOrEqualTo(Float value) {
            addCriterion("maxEstimateTotalYield >=", value, "maxestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMaxestimatetotalyieldLessThan(Float value) {
            addCriterion("maxEstimateTotalYield <", value, "maxestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMaxestimatetotalyieldLessThanOrEqualTo(Float value) {
            addCriterion("maxEstimateTotalYield <=", value, "maxestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMaxestimatetotalyieldIn(List<Float> values) {
            addCriterion("maxEstimateTotalYield in", values, "maxestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMaxestimatetotalyieldNotIn(List<Float> values) {
            addCriterion("maxEstimateTotalYield not in", values, "maxestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMaxestimatetotalyieldBetween(Float value1, Float value2) {
            addCriterion("maxEstimateTotalYield between", value1, value2, "maxestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andMaxestimatetotalyieldNotBetween(Float value1, Float value2) {
            addCriterion("maxEstimateTotalYield not between", value1, value2, "maxestimatetotalyield");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNull() {
            addCriterion("DeleteFlag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNotNull() {
            addCriterion("DeleteFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagEqualTo(String value) {
            addCriterion("DeleteFlag =", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotEqualTo(String value) {
            addCriterion("DeleteFlag <>", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThan(String value) {
            addCriterion("DeleteFlag >", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThanOrEqualTo(String value) {
            addCriterion("DeleteFlag >=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThan(String value) {
            addCriterion("DeleteFlag <", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThanOrEqualTo(String value) {
            addCriterion("DeleteFlag <=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLike(String value) {
            addCriterion("DeleteFlag like", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotLike(String value) {
            addCriterion("DeleteFlag not like", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIn(List<String> values) {
            addCriterion("DeleteFlag in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotIn(List<String> values) {
            addCriterion("DeleteFlag not in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagBetween(String value1, String value2) {
            addCriterion("DeleteFlag between", value1, value2, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotBetween(String value1, String value2) {
            addCriterion("DeleteFlag not between", value1, value2, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("CreateUserId is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("CreateUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(String value) {
            addCriterion("CreateUserId =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(String value) {
            addCriterion("CreateUserId <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(String value) {
            addCriterion("CreateUserId >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("CreateUserId >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(String value) {
            addCriterion("CreateUserId <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(String value) {
            addCriterion("CreateUserId <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLike(String value) {
            addCriterion("CreateUserId like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotLike(String value) {
            addCriterion("CreateUserId not like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<String> values) {
            addCriterion("CreateUserId in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<String> values) {
            addCriterion("CreateUserId not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(String value1, String value2) {
            addCriterion("CreateUserId between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(String value1, String value2) {
            addCriterion("CreateUserId not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNull() {
            addCriterion("UpdateUserId is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNotNull() {
            addCriterion("UpdateUserId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridEqualTo(String value) {
            addCriterion("UpdateUserId =", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotEqualTo(String value) {
            addCriterion("UpdateUserId <>", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThan(String value) {
            addCriterion("UpdateUserId >", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("UpdateUserId >=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThan(String value) {
            addCriterion("UpdateUserId <", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThanOrEqualTo(String value) {
            addCriterion("UpdateUserId <=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLike(String value) {
            addCriterion("UpdateUserId like", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotLike(String value) {
            addCriterion("UpdateUserId not like", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIn(List<String> values) {
            addCriterion("UpdateUserId in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotIn(List<String> values) {
            addCriterion("UpdateUserId not in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridBetween(String value1, String value2) {
            addCriterion("UpdateUserId between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotBetween(String value1, String value2) {
            addCriterion("UpdateUserId not between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("UpdateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UpdateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("UpdateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("UpdateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("UpdateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("UpdateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("UpdateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("UpdateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("UpdateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("UpdateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("UpdateDate not between", value1, value2, "updatedate");
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