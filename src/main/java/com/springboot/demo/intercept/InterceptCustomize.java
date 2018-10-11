package com.springboot.demo.intercept;

import com.springboot.demo.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 *
 * @author:tanghui
 * @since 1.0
 */
/*如果直接new对象，则这个类中所有的自动注入注解不会生效。
   如果需要这个类的自动注入注解生效，必须将这个对象的创建交给IOC容器来进行管理，也就是注册成一个Bean。
   原因是@Autowired 这类的注解只有在IOC容器中才会生效，也就是说如果该类中有用到注解，那么一定要将这个对象交个IOC容器进行管理
 */
@Component
public class InterceptCustomize implements HandlerInterceptor {
    @Autowired
    private Project project;

    /**
     * 拦截请求，处理请求前
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入自定义的拦截器");
//        return false;
        return true;
    }

    /**
     * 处理请求
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 处理请求后
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
