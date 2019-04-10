package com.wonders.tzjkbase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement//启动事务
@SpringBootApplication
@MapperScan("com.wonders.tzjkbase.mapper")
@EnableScheduling
public class TzjkBaseApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TzjkBaseApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TzjkBaseApplication.class, args);
    }
}
