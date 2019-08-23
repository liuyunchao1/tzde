package com.wonders.tzde.controller;

import com.wonders.tzde.model.ZjmbSwBgkQuery;
import com.wonders.tzde.service.ZjmbSwBgkService;
import com.wonders.tzde.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/zjmbSwBgk")
public class ZjmbSwBgkController {
    private Logger logger = LoggerFactory.getLogger(ZjmbSwBgkController.class);
    @Autowired
    private ZjmbSwBgkService zjmbSwBgkService;

    /**
     * 从台州市慢病系统中抽取死亡数据以接口的形式将数据传输给台州市公共数据共享平台
     * @return
     */
    @PostMapping("/getSwData")
    public Result getSwData(ZjmbSwBgkQuery params) {
        try {
            if (params == null || StringUtils.isEmpty(params.getZjhm())) {
                return Result.fail("02", "参数为空");
            }
            List<Map<String, Object>> list = zjmbSwBgkService.getSwData(params);
            if (CollectionUtils.isEmpty(list)) {
                return Result.fail("02", "查询结果为空");
            }

            return Result.success(list.size(), list);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return Result.fail("99", "获取数据失败");
        }

    }

    @PostMapping("/getSwDataToHos")
    public Result getSwDataToHos(ZjmbSwBgkQuery params){
        try {
            if (params == null) {
                return Result.fail("02", "参数为空!");
            }
            if(!"123".equals(params.getUserName()) || !"123".equals(params.getPassword())){
                return Result.fail("02", "用户名或密码不正确!");
            }
            List<Map<String, Object>> list = zjmbSwBgkService.getSwDataToHos(params);
            if (CollectionUtils.isEmpty(list)) {
                return Result.fail("02", "查询结果为空!");
            }
            return Result.success(list.size(), list);
        }catch(Exception e){
            logger.error(e.getMessage(), e);
            return Result.fail("99", "获取数据失败!");
        }
    }
}
