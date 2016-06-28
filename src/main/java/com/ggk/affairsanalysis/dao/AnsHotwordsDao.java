package com.ggk.affairsanalysis.dao;

import java.util.List;

import com.ggk.affairsanalysis.model.AnsHotwords;
import com.ggk.affairsanalysis.model.AnsWorkorder;

public interface AnsHotwordsDao {
	
	public List<AnsHotwords> queryAnsHotwords(String startDate,String endDate);
	
	public List<AnsHotwords> queryMainChart(String startDate,String endDate,String subject);
	
	public List<AnsHotwords> queryHotTrendAnalysisChart(String startDate,String endDate,List<String> wordList);
	
	public List<AnsHotwords> queryEveryoneAsk(String startDate,String endDate);
	
	public List<AnsWorkorder> queryTraceabilityList(String wordName);
	
}
