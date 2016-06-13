package com.ggk.affairsanalysis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ggk.affairsanalysis.model.Demo;

public interface DemoMapper {
	
	public List<Demo> queryDemos(@Param("idStr")String idStr);
}
