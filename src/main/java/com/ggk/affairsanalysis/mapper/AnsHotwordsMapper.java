package com.ggk.affairsanalysis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ggk.affairsanalysis.model.AnsHotwords;
import com.ggk.affairsanalysis.model.AnsWorkorder;

public interface AnsHotwordsMapper {
	
	public List<AnsHotwords> querySubject(@Param("startDate")String startDate,@Param("endDate")String endDate,@Param("type")int type);
	
	public List<AnsHotwords> queryAllSubject(@Param("startDate")String startDate,@Param("endDate")String endDate,@Param("type")int type);
	
	public List<AnsHotwords> queryMainChart(@Param("startDate")String startDate,@Param("endDate")String endDate,@Param("subject")String subject);
	
	public List<AnsHotwords> queryHotTrendAnalysisChart(@Param("startDate")String startDate,@Param("endDate")String endDate,@Param("wordList")List<String> wordList,@Param("type")int type);
	
	public List<AnsHotwords> queryEveryoneAsk(@Param("startDate")String startDate,@Param("endDate")String endDate,@Param("type")int type);
	
	public List<AnsWorkorder> queryTraceabilityList(@Param("wordName")String wordName,@Param("startDate")String startDate,@Param("endDate")String endDate,@Param("type")int type);
	
	public List<AnsHotwords> queryAreaWordName(@Param("date")String date,@Param("areaName")String areaName);
	
	public List<AnsHotwords> queryHotWordRank(@Param("newStartDate")String newStartDate,@Param("newEndDate")String newEndDate,@Param("oldStartDate")String oldStartDate,@Param("oldEndDate")String oldEndDate,@Param("type")int type);
	
	public List<AnsHotwords> queryHotWordGoingUp(@Param("newStartDate")String newStartDate,@Param("newEndDate")String newEndDate,@Param("oldStartDate")String oldStartDate,@Param("oldEndDate")String oldEndDate,@Param("type")int type);
	
	public List<AnsHotwords> queryHotWordDeclining(@Param("newStartDate")String newStartDate,@Param("newEndDate")String newEndDate,@Param("oldStartDate")String oldStartDate,@Param("oldEndDate")String oldEndDate,@Param("type")int type);
}
