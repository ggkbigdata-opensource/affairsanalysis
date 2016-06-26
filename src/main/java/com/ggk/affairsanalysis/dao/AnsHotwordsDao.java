package com.ggk.affairsanalysis.dao;

import java.util.List;

import com.ggk.affairsanalysis.model.AnsHotwords;

public interface AnsHotwordsDao {
	
	public List<AnsHotwords> queryAnsHotwords(String startDate,String endDate);
	
	public List<AnsHotwords> queryMainChart(String startDate,String endDate,String subject);
	
	public List<AnsHotwords> queryHotTrendAnalysisChart(int day,List<String> wordList);
	
	public List<AnsHotwords> queryEveryoneAsk();
	
}
