package com.sap.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @version 1.0.0
 * @author: lif
 * @date: 2020/10/17 2:04 下午
 * @description: WebMvcConfiguration
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Value("${spring.profiles.active}")
    private String env;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }
}
