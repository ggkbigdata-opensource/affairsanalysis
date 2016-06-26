package com.ggk.affairsanalysis.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ggk.affairsanalysis.dao.AnsHotwordsDao;
import com.ggk.affairsanalysis.mapper.AnsHotwordsMapper;
import com.ggk.affairsanalysis.model.AnsHotwords;

@Component
public class AnsHotwordsDaoImpl implements AnsHotwordsDao {
	
	@Autowired
	private AnsHotwordsMapper ansHotwordsMapper;

	@Override
	public List<AnsHotwords> queryAnsHotwords(String startDate,String endDate) {
		return ansHotwordsMapper.queryAnsHotwords(startDate,endDate);
	}
	
	@Override
	public List<AnsHotwords> queryMainChart(String startDate,String endDate,String subject) {
		return ansHotwordsMapper.queryMainChart(startDate,endDate,subject);
	}
	
	@Override
	public List<AnsHotwords> queryHotTrendAnalysisChart(int day,List<String> wordList) {
		return ansHotwordsMapper.queryHotTrendAnalysisChart((day-1)*-1+" days",wordList);
	}
	
	@Override
	public List<AnsHotwords> queryEveryoneAsk() {
		return ansHotwordsMapper.queryEveryoneAsk();
	}

}
