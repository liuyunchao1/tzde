package com.wonders.tzjkbase.mapper;

import com.wonders.tzjkbase.model.ZjmbSwBgk;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZjmbSwBgkMapper {
    int insert(ZjmbSwBgk record);

    int insertSelective(ZjmbSwBgk record);
    
    List<ZjmbSwBgk> selectByVcUpSpFLAG(@Param("vcUpSpFlag") Short vcUpSpFlag);
}