package com.ggk.affairsanalysis.service;

import java.util.List;

import com.ggk.affairsanalysis.model.AnsHotwords;


public interface AnsHotwordsService {
	
	//根据时间查询Top主题
	public List<AnsHotwords> queryAnsHotwords(String startDate,String endDate);
	
	//根据时间、主题查询chart数据
	public List<AnsHotwords> queryMainChart(String startDate,String endDate,String subject);
	
	//根据时间、主题集合查询chart数据
	public List<AnsHotwords> queryHotTrendAnalysisChart(int day,List<String> wordList);
	
	//查处 地区等于空的 总问题TOP10
	public List<AnsHotwords> queryEveryoneAsk();
	
}
