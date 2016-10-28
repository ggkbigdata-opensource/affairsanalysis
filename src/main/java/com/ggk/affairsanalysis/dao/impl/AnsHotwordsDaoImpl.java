package com.ggk.affairsanalysis.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ggk.affairsanalysis.dao.AnsHotwordsDao;
import com.ggk.affairsanalysis.mapper.AnsHotwordsMapper;
import com.ggk.affairsanalysis.model.AnsHotwords;
import com.ggk.affairsanalysis.model.AnsWorkorder;

@Component
public class AnsHotwordsDaoImpl implements AnsHotwordsDao {
	
	@Autowired
	private AnsHotwordsMapper ansHotwordsMapper;

	@Override
	public List<AnsHotwords> querySubject(String startDate,String endDate,int type) {
		return ansHotwordsMapper.querySubject(startDate,endDate, type);
	}
	
	@Override
	public List<AnsHotwords> queryAllSubject(String startDate,String endDate,int type) {
		return ansHotwordsMapper.queryAllSubject(startDate,endDate, type);
	}
	
	@Override
	public List<AnsHotwords> queryMainChart(String startDate,String endDate,String subject) {
		return ansHotwordsMapper.queryMainChart(startDate,endDate,subject);
	}
	
	@Override
	public List<AnsHotwords> queryHotTrendAnalysisChart(String startDate,String endDate,List<String> wordList,int type) {
		return ansHotwordsMapper.queryHotTrendAnalysisChart(startDate,endDate,wordList, type);
	}
	
	@Override
	public List<AnsHotwords> queryEveryoneAsk(String startDate,String endDate,int type) {
		return ansHotwordsMapper.queryEveryoneAsk(startDate,endDate, type);
	}
	
	@Override
	public List<AnsWorkorder> queryTraceabilityList(String wordName,String startDate,String endDate,int type) {
	    System.out.println(startDate + "\t" + endDate);
		return ansHotwordsMapper.queryTraceabilityList(wordName,startDate,endDate, type);
	}
	
	@Override
	public List<AnsHotwords> queryAreaWordName(String date,String areaName) {
		return ansHotwordsMapper.queryAreaWordName(date,areaName);
	}
	
	@Override
	public List<AnsHotwords> queryHotWordRank(String newStartDate,String newEndDate,String oldStartDate,String oldEndDate,int type) {
		return ansHotwordsMapper.queryHotWordRank(newStartDate,newEndDate,oldStartDate,oldEndDate, type);
	}
	
	@Override
	public List<AnsHotwords> queryHotWordGoingUp(String newStartDate,String newEndDate,String oldStartDate,String oldEndDate,int type) {
		return ansHotwordsMapper.queryHotWordGoingUp(newStartDate,newEndDate,oldStartDate,oldEndDate, type);
	}
	
	@Override
	public List<AnsHotwords> queryHotWordDeclining(String newStartDate,String newEndDate,String oldStartDate,String oldEndDate,int type) {
		return ansHotwordsMapper.queryHotWordDeclining(newStartDate,newEndDate,oldStartDate,oldEndDate, type);
	}

}
