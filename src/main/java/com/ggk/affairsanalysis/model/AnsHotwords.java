package com.ggk.affairsanalysis.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class AnsHotwords {
	
	private String id;
	private BigDecimal frequencyCount; //频次
	private String wordName; //关键字
	private String area; //地区
	private Timestamp createDate; // 开始时间
	private Timestamp updateDate; // 修改时间
	private Timestamp statisticalDate; //发生时间
	private String timeSize; //
	
	//自定义属性
	private BigDecimal sumCount; //时间区间内,各关键字总频次
	private String time; //
	
	
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public BigDecimal getSumCount() {
		return sumCount;
	}
	public void setSumCount(BigDecimal sumCount) {
		this.sumCount = sumCount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BigDecimal getFrequencyCount() {
		return frequencyCount;
	}
	public void setFrequencyCount(BigDecimal frequencyCount) {
		this.frequencyCount = frequencyCount;
	}
	public String getWordName() {
		return wordName;
	}
	public void setWordName(String wordName) {
		this.wordName = wordName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public Timestamp getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}
	public Timestamp getStatisticalDate() {
		return statisticalDate;
	}
	public void setStatisticalDate(Timestamp statisticalDate) {
		this.statisticalDate = statisticalDate;
	}
	public String getTimeSize() {
		return timeSize;
	}
	public void setTimeSize(String timeSize) {
		this.timeSize = timeSize;
	}
	
}
