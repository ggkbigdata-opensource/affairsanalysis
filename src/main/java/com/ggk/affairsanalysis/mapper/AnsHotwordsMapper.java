package com.ggk.affairsanalysis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ggk.affairsanalysis.model.AnsHotwords;

public interface AnsHotwordsMapper {
	
	public List<AnsHotwords> queryAnsHotwords(@Param("startDate")String startDate,@Param("endDate")String endDate);
	
	public List<AnsHotwords> queryMainChart(@Param("startDate")String startDate,@Param("endDate")String endDate,@Param("subject")String subject);
	
	public List<AnsHotwords> queryHotTrendAnalysisChart(@Param("day")String day,@Param("wordList")List<String> wordList);
	
	public List<AnsHotwords> queryEveryoneAsk();
}
