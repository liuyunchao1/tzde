package com.wonders.tzde.controller;

import com.wonders.tzde.service.ZjmbSwBgkService;
import com.wonders.tzde.model.ZjmbSwBgk;
import com.wonders.tzde.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
     * 获取死亡数据(共享接口使用)
     * @param params
     * @return
     */
    @PostMapping("/getSwData")
    public Result getSwData(@RequestBody(required = false) ZjmbSwBgk params) {
        try {
            if (params == null) {
                params = new ZjmbSwBgk();
            }
            params.setVcShbz("3");      // 只取区县审核通过状态的
            // 如果没有指定发送状态的，则默认只取未发送的
            if (params.getVcUpSpFlag() == null) {
                params.setVcUpSpFlag(Short.valueOf("0"));
            }

            List<Map<String, Object>> list = zjmbSwBgkService.getSwData(params);
            return Result.success(list);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return Result.fail(-1, "获取数据失败", null);
        }

    }
}
