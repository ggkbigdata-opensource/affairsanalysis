package com.ggk.affairsanalysis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ggk.affairsanalysis.dao.DemoDao;
import com.ggk.affairsanalysis.model.Demo;
import com.ggk.affairsanalysis.service.DemoService;

@Component
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DemoDao demoDao;

	@Override
	public List<Demo> queryDemos(String idStr) {
		return demoDao.queryDemos(idStr);
	}

}
