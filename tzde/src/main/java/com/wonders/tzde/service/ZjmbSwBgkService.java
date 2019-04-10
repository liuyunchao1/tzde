package com.wonders.tzde.service;

import com.wonders.tzde.model.ZjmbSwBgk;

import java.util.List;


public interface ZjmbSwBgkService {
	List<ZjmbSwBgk> selectByVcUpSpFLAG(short vcUpSpFlag);
}
