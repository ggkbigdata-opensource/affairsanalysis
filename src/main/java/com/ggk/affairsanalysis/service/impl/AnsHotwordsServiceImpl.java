package com.ggk.affairsanalysis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ggk.affairsanalysis.dao.AnsHotwordsDao;
import com.ggk.affairsanalysis.model.AnsHotwords;
import com.ggk.affairsanalysis.service.AnsHotwordsService;

@Component
public class AnsHotwordsServiceImpl implements AnsHotwordsService {
	
	@Autowired
	private AnsHotwordsDao ansHotwordsDao;

	@Override
	public List<AnsHotwords> queryAnsHotwords(String startDate,String endDate) {
		return ansHotwordsDao.queryAnsHotwords(startDate,endDate);
	}
	
	@Override
	public List<AnsHotwords> queryMainChart(String startDate,String endDate,String subject) {
		return ansHotwordsDao.queryMainChart(startDate,endDate,subject);
	}
	
	@Override
	public List<AnsHotwords> queryHotTrendAnalysisChart(int day,List<String> wordList) {
		return ansHotwordsDao.queryHotTrendAnalysisChart(day,wordList);
	}
	
	@Override
	public List<AnsHotwords> queryEveryoneAsk() {
		return ansHotwordsDao.queryEveryoneAsk();
	}
}