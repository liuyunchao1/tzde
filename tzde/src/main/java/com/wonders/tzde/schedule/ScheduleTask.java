package com.wonders.tzde.schedule;


import java.util.List;

import com.wonders.tzde.service.ZjmbSwBgkService;
import com.wonders.tzde.tool.SoapWebServiceClient;
import com.wonders.tzde.model.ZjmbSwBgk;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import org.springframework.stereotype.Component;

/**
 * 定时任务类
 */
@Component
public class ScheduleTask {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ZjmbSwBgkService zjmbSwBgkService;

    @Scheduled(fixedDelayString = "${mbScheduleTime}" )
    public void scheduler() {
    	short i=0;
    	List<ZjmbSwBgk> list=zjmbSwBgkService.selectByVcUpSpFLAG(i);
        logger.info("excute Schedule size================="+list.size());
    	try {
    		SoapWebServiceClient soap=new SoapWebServiceClient();
    		Object resultJson=soap.callWebService("http://localhost:8080/cfxWSServer/webservice/Greeting?wsdl", "greeting", "suyongji");
    		logger.info("结果："+ resultJson.toString());
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
    }
}
