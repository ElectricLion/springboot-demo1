package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*@SpringBootApplication 注解中包含了
@SpringBootConfiguration    //注解配置类，配置类相对于applicationContext.xml配置文件
@EnableAutoConfiguration    //启动自动化配置，使用默认配置来整合其他第三方框架
@ComponentScan              //扫描注解，相当于applicationContext.xml文件中<context-component-scan>注解进行扫描
这三个注解功能，@SpringBootApplication都有。

@SpringBootApplication 用在SpringBoot框架的启动类中。进行扫描注解是从该启动类所在包的目录中以及其下面子目录中迭代进行自动扫描，注解不在这个范围内的就需要手动指定扫描注解。
*/
@SpringBootApplication
//@EnableConfigurationProperties(Project.class)//1.开启@ConfigurationProperteis注解的使用，并指定要将属性文件封装到哪个类的实例中。
public class DemoApplication {
    /**
     * 启动SpringBoot 框架的main方法 也可以通过maven命令
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
/*  关闭Banner
   SpringApplication springApplication = new SpringApplication(DemoApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);//关闭启动时显示的SpringBoot框架Banner(旗帜)
        springApplication.run(args);*/
    }
}
