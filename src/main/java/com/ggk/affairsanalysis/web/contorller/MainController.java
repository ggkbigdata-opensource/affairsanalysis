package com.ggk.affairsanalysis.web.contorller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ggk.affairsanalysis.model.AnsHotwords;
import com.ggk.affairsanalysis.model.AnsWorkorder;
import com.ggk.affairsanalysis.service.AnsHotwordsService;

@RestController
public class MainController {
    
    @Autowired
    private AnsHotwordsService ansHotwordsService;
    
    @RequestMapping(value = "/")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("/html/index.html");
        return result;
    }
    
    @RequestMapping(value = "/hotChart")
    public ModelAndView hotChart(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("/html/hotChart.html");
        return result;
    }
    
    @RequestMapping(value = "/traceabilityList")
    public ModelAndView traceabilityList(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("/html/traceabilityList.html");
        return result;
    }
    @RequestMapping(value = "/hotTrendAnalysisChart")
    public ModelAndView hotTrendAnalysisChart(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("/html/hotTrendAnalysisChart.html");
        return result;
    }
    
    //根据时间查询Top主题
    @RequestMapping(value = "/querySubject")
    public List<AnsHotwords> querySubject(@RequestParam String startDate,@RequestParam String endDate) {
    	List<AnsHotwords> list = ansHotwordsService.queryAnsHotwords(startDate, endDate);
    	return list;
    }
    
    //根据时间、主题查询chart数据
    @RequestMapping(value = "/queryMainChart")
    public Map<String,List<AnsHotwords>> queryMainChart(@RequestParam String startDate,@RequestParam String endDate,@RequestParam String subject) {
    	List<AnsHotwords> list = ansHotwordsService.queryMainChart(startDate, endDate,subject);
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	Map<String,List<AnsHotwords>> map = new TreeMap<String,List<AnsHotwords>>();
    	for(AnsHotwords ans :list){
    		String year = sdf.format(new Date(ans.getStatisticalDate().getTime()));
    		if(!map.containsKey(year)){
    			List<AnsHotwords>  values = new ArrayList<AnsHotwords>();
    			map.put(year, values);
    		}
    		map.get(year).add(ans);
    	}
    	return map;
    }
    
  //根据时间、主题集合 查询chart数据
    @RequestMapping(value = "/queryHotTrendAnalysisChart")
    public List<AnsHotwords> queryHotTrendAnalysisChart(@RequestParam String startDate,@RequestParam String endDate,@RequestParam String wordList) {
    	List<String> wlist = Arrays.asList(wordList.split(","));
    	List<AnsHotwords> list = ansHotwordsService.queryHotTrendAnalysisChart(startDate,endDate,wlist);
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	for(AnsHotwords ans :list){
    		String year = sdf.format(new Date(ans.getStatisticalDate().getTime()));
    		ans.setTime(year);
    	}
    	return list;
    }
    
  //查询总TOP10
    @RequestMapping(value = "/queryEveryoneAsk")
    public List<AnsHotwords> queryEveryoneAsk(String startDate,String endDate) {
    	List<AnsHotwords> list = ansHotwordsService.queryEveryoneAsk(startDate,endDate);
    	return list;
    }
  //查询追溯列表
    @RequestMapping(value = "/queryTraceabilityList")
    public List<AnsWorkorder> queryTraceabilityList(String wordName) {
    	try {
    		wordName = new String( wordName.getBytes("ISO-8859-1") , "UTF-8");  
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
    	List<AnsWorkorder> list = ansHotwordsService.queryTraceabilityList(wordName);
    	return list;
    }
    
}
