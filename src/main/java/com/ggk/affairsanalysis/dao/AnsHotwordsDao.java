package com.ggk.affairsanalysis.dao;

import java.util.List;

import com.ggk.affairsanalysis.model.AnsHotwords;
import com.ggk.affairsanalysis.model.AnsWorkorder;

public interface AnsHotwordsDao {
	
	public List<AnsHotwords> querySubject(String startDate,String endDate,int type);
	
	public List<AnsHotwords> queryAllSubject(String startDate,String endDate,int type);
	
	public List<AnsHotwords> queryMainChart(String startDate,String endDate,String subject);
	
	public List<AnsHotwords> queryHotTrendAnalysisChart(String startDate,String endDate,List<String> wordList,int type);
	
	public List<AnsHotwords> queryEveryoneAsk(String startDate,String endDate,int type);
	
	public List<AnsWorkorder> queryTraceabilityList(String wordName,String startDate,String endDate,int type);
	
	public List<AnsHotwords> queryAreaWordName(String date,String areaName);
	
	public List<AnsHotwords> queryHotWordRank(String newStartDate,String newEndDate,String oldStartDate,String oldEndDate,int type);
	
	public List<AnsHotwords> queryHotWordGoingUp(String newStartDate,String newEndDate,String oldStartDate,String oldEndDate,int type);
	
	public List<AnsHotwords> queryHotWordDeclining(String newStartDate,String newEndDate,String oldStartDate,String oldEndDate,int type);
}
