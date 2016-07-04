package com.ggk.affairsanalysis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ggk.affairsanalysis.dao.AnsHotwordsDao;
import com.ggk.affairsanalysis.model.AnsHotwords;
import com.ggk.affairsanalysis.model.AnsWorkorder;
import com.ggk.affairsanalysis.service.AnsHotwordsService;

@Component
public class AnsHotwordsServiceImpl implements AnsHotwordsService {
	
	@Autowired
	private AnsHotwordsDao ansHotwordsDao;

	@Override
	public List<AnsHotwords> querySubject(String startDate,String endDate,int type) {
		return ansHotwordsDao.querySubject(startDate,endDate, type);
	}
	@Override
	public List<AnsHotwords> queryAllSubject(String startDate,String endDate,int type) {
		return ansHotwordsDao.queryAllSubject(startDate,endDate, type);
	}
	
	@Override
	public List<AnsHotwords> queryMainChart(String startDate,String endDate,String subject) {
		return ansHotwordsDao.queryMainChart(startDate,endDate,subject);
	}
	
	@Override
	public List<AnsHotwords> queryHotTrendAnalysisChart(String startDate,String endDate,List<String> wordList,int type) {
		return ansHotwordsDao.queryHotTrendAnalysisChart(startDate,endDate,wordList, type);
	}
	
	@Override
	public List<AnsHotwords> queryEveryoneAsk(String startDate,String endDate,int type) {
		return ansHotwordsDao.queryEveryoneAsk(startDate,endDate, type);
	}
	
	@Override
	public List<AnsWorkorder> queryTraceabilityList(String wordName,String startDate,String endDate,int type) {
		return ansHotwordsDao.queryTraceabilityList(wordName,startDate,endDate, type);
	}
	
	@Override
	public List<AnsHotwords> queryAreaWordName(String date,String areaName) {
		return ansHotwordsDao.queryAreaWordName(date,areaName);
	}
	
	@Override
	public List<AnsHotwords> queryHotWordRank(String newStartDate,String newEndDate,String oldStartDate,String oldEndDate,int type) {
		return ansHotwordsDao.queryHotWordRank(newStartDate,newEndDate,oldStartDate,oldEndDate, type);
	}
	
	@Override
	public List<AnsHotwords> queryHotWordGoingUp(String newStartDate,String newEndDate,String oldStartDate,String oldEndDate,int type) {
		return ansHotwordsDao.queryHotWordGoingUp(newStartDate,newEndDate,oldStartDate,oldEndDate, type);
	}
	
	@Override
	public List<AnsHotwords> queryHotWordDeclining(String newStartDate,String newEndDate,String oldStartDate,String oldEndDate,int type) {
		return ansHotwordsDao.queryHotWordDeclining(newStartDate,newEndDate,oldStartDate,oldEndDate, type);
	}
}