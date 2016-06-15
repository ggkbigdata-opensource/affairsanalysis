package com.ggk.affairsanalysis.web.contorller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ggk.affairsanalysis.model.Demo;
import com.ggk.affairsanalysis.service.DemoService;

@RestController
public class MainController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
    
    @Autowired
    private DemoService demoService;
    
    @RequestMapping(value = "/")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("/html/page/gz_heatmap.html");
        List<Demo> demos = null;
        try {
        	demos = demoService.queryDemos("demo");
		} catch (Exception e) {
			LOGGER.error(e.getLocalizedMessage());
		}
        result.addObject("demos", demos);
        result.getModel().put("test", "");
        return result;
    }
    
    @RequestMapping(value = "/query/hotlineAmounts/")
    public String queryHotlineAmounts(@RequestParam String date) {
    	return date;
    }
}
