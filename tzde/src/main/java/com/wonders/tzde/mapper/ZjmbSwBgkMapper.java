package com.wonders.tzde.mapper;

import com.wonders.tzde.model.ZjmbSwBgk;

import java.util.List;
import java.util.Map;

public interface ZjmbSwBgkMapper {
    int insert(ZjmbSwBgk record);

    int insertSelective(ZjmbSwBgk record);
    
    /**
     * 获取死亡数据(共享接口使用)
     * @param params
     * @return
     */
    List<Map<String, Object>> getSwData(ZjmbSwBgk params);
}