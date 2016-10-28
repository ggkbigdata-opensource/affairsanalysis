package com.ggk.affairsanalysis.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class AnsWorkorder {
	
	private String woID;//编码
	private String callId; //呼叫编号
	private String callDate; //呼叫时间
	private String phone; //来电电话
	private String phoneHome; //来电归属
	private String woRegisterDate; //登记时间
	private String appealSrc; //诉求来源
	private String woType; //工单类型
	private String woStatus; //工单状态
	private String appealClassification; //性质分类
	private String appealLevel; //诉求级别
	private String appealTitle; //诉求标题
	private String appealSubject; //诉求主题
	private String appealDepartNo; //被诉求部门编号
	private String appealDepartName; //被诉求部门名称
	private String incidentSiteLargeArea; //事发地点
	private String incidentSiteSmallArea; //事发地地点小区
	private String monitorStatus; //监察状态
	private String woDeadline; //最后处理期限
	private String woDealLastDate; //最后处理日期
	private BigDecimal preAlarmDay; //预警天簌
	private BigDecimal alarmDay; //告警天数
	private String satisfaction; //满意度
	private String woCloseDate; //工单关闭时间
	private String remarks; //工单备注
	private String migrateDate; //迁移日期
	
	
	
	public String getWoRegisterDate() {
		return woRegisterDate;
	}
	public void setWoRegisterDate(String woRegisterDate) {
		this.woRegisterDate = woRegisterDate;
	}
	public String getWoDeadline() {
		return woDeadline;
	}
	public void setWoDeadline(String woDeadline) {
		this.woDeadline = woDeadline;
	}
	public String getWoID() {
		return woID;
	}
	public void setWoID(String woID) {
		this.woID = woID;
	}
	public String getCallId() {
		return callId;
	}
	public void setCallId(String callId) {
		this.callId = callId;
	}
	public String getCallDate() {
		return callDate;
	}
	public void setCallDate(String callDate) {
		this.callDate = callDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhoneHome() {
		return phoneHome;
	}
	public void setPhoneHome(String phoneHome) {
		this.phoneHome = phoneHome;
	}

	public String getAppealSrc() {
		return appealSrc;
	}
	public void setAppealSrc(String appealSrc) {
		this.appealSrc = appealSrc;
	}
	public String getWoType() {
		return woType;
	}
	public void setWoType(String woType) {
		this.woType = woType;
	}
	public String getWoStatus() {
		return woStatus;
	}
	public void setWoStatus(String woStatus) {
		this.woStatus = woStatus;
	}
	public String getAppealClassification() {
		return appealClassification;
	}
	public void setAppealClassification(String appealClassification) {
		this.appealClassification = appealClassification;
	}
	public String getAppealLevel() {
		return appealLevel;
	}
	public void setAppealLevel(String appealLevel) {
		this.appealLevel = appealLevel;
	}
	public String getAppealTitle() {
		return appealTitle;
	}
	public void setAppealTitle(String appealTitle) {
		this.appealTitle = appealTitle;
	}
	public String getAppealSubject() {
		return appealSubject;
	}
	public void setAppealSubject(String appealSubject) {
		this.appealSubject = appealSubject;
	}
	public String getAppealDepartNo() {
		return appealDepartNo;
	}
	public void setAppealDepartNo(String appealDepartNo) {
		this.appealDepartNo = appealDepartNo;
	}
	public String getAppealDepartName() {
		return appealDepartName;
	}
	public void setAppealDepartName(String appealDepartName) {
		this.appealDepartName = appealDepartName;
	}
	public String getIncidentSiteLargeArea() {
		return incidentSiteLargeArea;
	}
	public void setIncidentSiteLargeArea(String incidentSiteLargeArea) {
		this.incidentSiteLargeArea = incidentSiteLargeArea;
	}
	public String getIncidentSiteSmallArea() {
		return incidentSiteSmallArea;
	}
	public void setIncidentSiteSmallArea(String incidentSiteSmallArea) {
		this.incidentSiteSmallArea = incidentSiteSmallArea;
	}
	public String getMonitorStatus() {
		return monitorStatus;
	}
	public void setMonitorStatus(String monitorStatus) {
		this.monitorStatus = monitorStatus;
	}

	public String getWoDealLastDate() {
		return woDealLastDate;
	}
	public void setWoDealLastDate(String woDealLastDate) {
		this.woDealLastDate = woDealLastDate;
	}
	public BigDecimal getPreAlarmDay() {
		return preAlarmDay;
	}
	public void setPreAlarmDay(BigDecimal preAlarmDay) {
		this.preAlarmDay = preAlarmDay;
	}
	public BigDecimal getAlarmDay() {
		return alarmDay;
	}
	public void setAlarmDay(BigDecimal alarmDay) {
		this.alarmDay = alarmDay;
	}
	public String getSatisfaction() {
		return satisfaction;
	}
	public void setSatisfaction(String satisfaction) {
		this.satisfaction = satisfaction;
	}
	public String getWoCloseDate() {
		return woCloseDate;
	}
	public void setWoCloseDate(String woCloseDate) {
		this.woCloseDate = woCloseDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getMigrateDate() {
		return migrateDate;
	}
	public void setMigrateDate(String migrateDate) {
		this.migrateDate = migrateDate;
	}
	
}
