package com.ggk.affairsanalysis.service;

import java.util.List;

import com.ggk.affairsanalysis.model.Demo;

public interface DemoService {
	
	public List<Demo> queryDemos(String idStr);
}
