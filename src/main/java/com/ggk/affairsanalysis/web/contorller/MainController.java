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
    
    /**
     * 诉求类首页页面
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("/html/index.html");
        return result;
    }
    
    /**
     * 咨询类首页页面
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/index_zx")
    public ModelAndView index_zx(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("/html/index_zx.html");
        return result;
    }
    
    /**
     * 热力图页面
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/hotChart")
    public ModelAndView hotChart(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("/html/hotChart.html");
        return result;
    }
    
    /**
     * 诉求类大家都在问页面
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/hotTrendAnalysisChart")
    public ModelAndView hotTrendAnalysisChart(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("/html/hotTrendAnalysisChart.html");
        return result;
    }
    
    /**
     * 咨询类大家都在问页面
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/hotTrendAnalysisChart_zx")
    public ModelAndView hotTrendAnalysisChart_zx(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("/html/hotTrendAnalysisChart_zx.html");
        return result;
    }
    
    /**
     * 诉求类追溯页面
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/traceabilityList")
    public ModelAndView traceabilityList(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("/html/traceabilityList.html");
        return result;
    }
    
    /**
     * 诉求类追溯页面
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/traceabilityList_zx")
    public ModelAndView traceabilityList_zx(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("/html/traceabilityList_zx.html");
        return result;
    }
    
    /**
     * 诉求类热点排名列表页面
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/rankList")
    public ModelAndView rankList(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("/html/rankList.html");
        return result;
    }
    
    /**
     * 咨询类热点排名列表页面
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/rankList_zx")
    public ModelAndView rankList_zx(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("/html/rankList_zx.html");
        return result;
    }
    
    //根据时间查询Top10
    @RequestMapping(value = "/querySubject")
    public List<AnsHotwords> querySubject(@RequestParam String startDate,@RequestParam String endDate,int type) {
    	List<AnsHotwords> list = ansHotwordsService.querySubject(startDate, endDate,type);
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
    public List<AnsHotwords> queryHotTrendAnalysisChart(String startDate,String endDate,String wordList,int type) {
    	List<String> wlist = Arrays.asList(wordList.split(","));
    	List<AnsHotwords> list = ansHotwordsService.queryHotTrendAnalysisChart(startDate,endDate,wlist,type);
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	for(AnsHotwords ans :list){
    		String year = sdf.format(new Date(ans.getStatisticalDate().getTime()));
    		ans.setTime(year);
    	}
    	return list;
    }
    
  //查询总TOP10
    @RequestMapping(value = "/queryEveryoneAsk")
    public List<AnsHotwords> queryEveryoneAsk(String startDate,String endDate,int type) {
    	List<AnsHotwords> list = ansHotwordsService.queryEveryoneAsk(startDate,endDate, type);
    	return list;
    }
  //查询追溯列表
    @RequestMapping(value = "/queryTraceabilityList")
    public List<AnsWorkorder> queryTraceabilityList(String wordName,String startDate,String endDate,int type ) {
    	try {
    		wordName = new String( wordName.getBytes("ISO-8859-1") , "UTF-8");  
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
    	List<AnsWorkorder> list = ansHotwordsService.queryTraceabilityList(wordName,startDate,endDate,type);
    	return list;
    }
    
    //查询追溯列表
    @RequestMapping(value = "/queryAreaWordName")
    public List<AnsHotwords> queryAreaWordName(String date,String areaName) {
    	List<AnsHotwords> list = ansHotwordsService.queryAreaWordName(date,areaName);
    	return list;
    }
    
  //根据时间区间查询全部主题
    @RequestMapping(value = "/queryAllSubject")
    public List<AnsHotwords> queryAllSubject(String startDate,String endDate,int type) {
    	List<AnsHotwords> list = ansHotwordsService.queryAllSubject(startDate, endDate,type);
    	return list;
    }
    
  //TOP100
    @RequestMapping(value = "/queryHotWordRank")
    public List<AnsHotwords> queryHotWordRank( String newStartDate, String newEndDate, String oldStartDate, String oldEndDate,int type) {
    	List<AnsHotwords> list = ansHotwordsService.queryHotWordRank(newStartDate, newEndDate,oldStartDate,oldEndDate,type);
    	return list;
    }
    
  //上升TOP10
    @RequestMapping(value = "/queryHotWordGoingUp")
    public List<AnsHotwords> queryHotWordGoingUp(String newStartDate, String newEndDate, String oldStartDate, String oldEndDate,int type) {
    	List<AnsHotwords> list = ansHotwordsService.queryHotWordGoingUp(newStartDate, newEndDate,oldStartDate,oldEndDate,type);
    	return list;
    }
    
  //下降TOP10
    @RequestMapping(value = "/queryHotWordDeclining")
    public List<AnsHotwords> queryHotWordDeclining( String newStartDate, String newEndDate, String oldStartDate, String oldEndDate,int type) {
    	List<AnsHotwords> list = ansHotwordsService.queryHotWordDeclining(newStartDate, newEndDate,oldStartDate,oldEndDate,type);
    	return list;
    }
}
