package com.wonders.tzjkbase.service;

import com.wonders.tzjkbase.model.ZjmbSwBgk;

import java.util.List;


public interface ZjmbSwBgkService {
	List<ZjmbSwBgk> selectByVcUpSpFLAG(short vcUpSpFlag);
}
