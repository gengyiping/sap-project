package com.sap.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.List;

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


    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        resolvers.add(new HandlerExceptionResolver() {

            @Override
            public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) {
                HandlerMethod handlerMethod = (HandlerMethod) handler;
                Method method = handlerMethod.getMethod();
                ResponseBody annotation = (ResponseBody) method.getAnnotation(ResponseBody.class);
                Class retClz = method.getReturnType();

                return null;
            }
        });
    }
}
