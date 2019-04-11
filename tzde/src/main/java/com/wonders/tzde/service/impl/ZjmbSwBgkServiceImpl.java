package com.wonders.tzde.service.impl;


import com.wonders.tzde.mapper.ZjmbSwBgkMapper;
import com.wonders.tzde.model.ZjmbSwBgk;
import org.springframework.stereotype.Service;

import com.wonders.tzde.service.ZjmbSwBgkService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("zjmbSwBgkService")
public class ZjmbSwBgkServiceImpl implements ZjmbSwBgkService {

	@Resource
	private ZjmbSwBgkMapper zjmbSwBgkMapper;
	
	@Override
	public List<Map<String, Object>> getSwData(ZjmbSwBgk params) {
		return zjmbSwBgkMapper.getSwData(params);
	}

	@Override
	public Integer updateUploadFlag(Map<String, Object> params) {
		return zjmbSwBgkMapper.updateUploadFlag(params);
	}
}
