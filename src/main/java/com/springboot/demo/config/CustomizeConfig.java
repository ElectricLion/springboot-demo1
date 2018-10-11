package com.springboot.demo.config;


import com.springboot.demo.intercept.InterceptCustomize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 想自定义配置 需要实现WebMvcConfigurer 接口
 * 实现WebMvcConfigurer 接口 重写方法完成customize自定义配置
 *
 * @author:tanghui
 * @since 1.0
 */
@Configuration
public class CustomizeConfig implements WebMvcConfigurer {

    @Autowired
    private InterceptCustomize interceptCustomize;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(interceptCustomize);
        interceptorRegistration.addPathPatterns("/**"); //定义拦截请求路径
        interceptorRegistration.excludePathPatterns("*.html");//定义不拦截的请求路径
    }
}
