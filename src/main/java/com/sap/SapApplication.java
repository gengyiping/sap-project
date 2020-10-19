package com.sap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * @version 1.0.0
 * @author: lif
 * @date: 2020/10/16 3:01 下午
 * @description: 项目启动类
 */
@SpringBootApplication
public class SapApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SapApplication.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SapApplication.class);
    }
}
