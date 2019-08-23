package com.wonders.tzde.service;

import com.wonders.tzde.model.ZjmbSwBgkQuery;

import java.util.List;
import java.util.Map;


public interface ZjmbSwBgkService {

	/**
	 * 获取死亡数据(共享接口使用)
	 * @param params
	 * @return
	 */
	List<Map<String, Object>> getSwData(ZjmbSwBgkQuery params);

	/**
	 * 更新数据上传状态(共享接口使用)
	 * @return
	 */
	Integer updateUploadFlag(Map<String, Object> params);

	/**
	 * 死亡数据下发接口
	 * @param params
	 * @return
	 */
	public List<Map<String, Object>> getSwDataToHos(ZjmbSwBgkQuery params);
}
