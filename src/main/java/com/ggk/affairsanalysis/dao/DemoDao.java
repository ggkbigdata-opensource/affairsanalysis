package com.ggk.affairsanalysis.dao;

import java.util.List;

import com.ggk.affairsanalysis.model.Demo;

public interface DemoDao {
	
	public List<Demo> queryDemos(String idStr);
}
