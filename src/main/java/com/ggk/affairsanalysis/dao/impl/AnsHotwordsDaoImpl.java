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
	public List<AnsHotwords> queryAnsHotwords(String startDate,String endDate) {
		return ansHotwordsMapper.queryAnsHotwords(startDate,endDate);
	}
	
	@Override
	public List<AnsHotwords> queryMainChart(String startDate,String endDate,String subject) {
		return ansHotwordsMapper.queryMainChart(startDate,endDate,subject);
	}
	
	@Override
	public List<AnsHotwords> queryHotTrendAnalysisChart(String startDate,String endDate,List<String> wordList) {
		return ansHotwordsMapper.queryHotTrendAnalysisChart(startDate,endDate,wordList);
	}
	
	@Override
	public List<AnsHotwords> queryEveryoneAsk(String startDate,String endDate) {
		return ansHotwordsMapper.queryEveryoneAsk(startDate,endDate);
	}
	
	@Override
	public List<AnsWorkorder> queryTraceabilityList(String wordName) {
		return ansHotwordsMapper.queryTraceabilityList(wordName);
	}

}
