package com.ggk.affairsanalysis.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ggk.affairsanalysis.dao.DemoDao;
import com.ggk.affairsanalysis.mapper.DemoMapper;
import com.ggk.affairsanalysis.model.Demo;

public class DemoDaoImpl implements DemoDao {
	
	@Autowired
	private DemoMapper demoMapper;

	@Override
	public List<Demo> queryDemos(String idStr) {
		return demoMapper.queryDemos(idStr);
	}

}
