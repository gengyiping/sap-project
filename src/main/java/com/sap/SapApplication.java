package com.sap;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;


/**
 * @version 1.0.0
 * @author: lif
 * @date: 2020/10/16 3:01 下午
 * @description: 项目启动类
 */
@SpringBootApplication
public class SapApplication {
    public static void main(String[] args) {
        SpringApplication.run(SapApplication.class);
    }
}
