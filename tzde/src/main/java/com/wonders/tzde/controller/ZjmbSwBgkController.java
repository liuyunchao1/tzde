package com.wonders.tzde.controller;

import com.wonders.tzde.service.ZjmbSwBgkService;
import com.wonders.tzde.model.ZjmbSwBgk;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
public class ZjmbSwBgkController {
    private Logger logger = LoggerFactory.getLogger(ZjmbSwBgkController.class);
    @Autowired
    private ZjmbSwBgkService zjmbSwBgkService;

    @RequestMapping("/selectById")
    public List<ZjmbSwBgk> selectById(HttpServletRequest request, HttpServletResponse response) {
    	short i=0;
    	List<ZjmbSwBgk> list = zjmbSwBgkService.selectByVcUpSpFLAG(i);
        logger.info("test:===========", list);
        return list;
    }
}
