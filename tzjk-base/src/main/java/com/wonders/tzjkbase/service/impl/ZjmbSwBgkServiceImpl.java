package com.wonders.tzjkbase.service.impl;


import com.wonders.tzjkbase.mapper.ZjmbSwBgkMapper;
import com.wonders.tzjkbase.model.ZjmbSwBgk;
import org.springframework.stereotype.Service;

import com.wonders.tzjkbase.service.ZjmbSwBgkService;

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
