package com.wonders.tzde.controller;

import com.wonders.tzde.service.ZjmbSwBgkService;
import com.wonders.tzde.model.ZjmbSwBgk;
import com.wonders.tzde.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
     * @param zjhm 身份证号
     * @return
     */
    @GetMapping("/getSwData")
    public Result getSwData(@RequestParam(value = "zjhm", required = false) String zjhm) {
        try {
            ZjmbSwBgk params = new ZjmbSwBgk();
            params.setVcShbz("3");      // 只取区县审核通过状态的

            // 身份证号码过滤条件
            if (!StringUtils.isEmpty(zjhm)) {
                params.setVcSfzhm(zjhm);
            }

            List<Map<String, Object>> list = zjmbSwBgkService.getSwData(params);
            if (CollectionUtils.isEmpty(list)) {
                return Result.fail(-1, "没有可获取的数据", null);
            }

            return Result.success(list);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return Result.fail(-1, "获取数据失败", null);
        }

    }
}
