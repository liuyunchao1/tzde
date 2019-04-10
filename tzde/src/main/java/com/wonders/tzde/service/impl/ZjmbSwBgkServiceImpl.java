package com.wonders.tzde.service.impl;


import com.wonders.tzde.mapper.ZjmbSwBgkMapper;
import com.wonders.tzde.model.ZjmbSwBgk;
import org.springframework.stereotype.Service;

import com.wonders.tzde.service.ZjmbSwBgkService;

import javax.annotation.Resource;
import java.util.List;

@Service("zjmbSwBgkService")
public class ZjmbSwBgkServiceImpl implements ZjmbSwBgkService {

	@Resource
	private ZjmbSwBgkMapper zjmbSwBgkMapper;
	
	@Override
	public List<ZjmbSwBgk> selectByVcUpSpFLAG(short vcUpSpFlag){
		return zjmbSwBgkMapper.selectByVcUpSpFLAG(vcUpSpFlag);
	}

}
