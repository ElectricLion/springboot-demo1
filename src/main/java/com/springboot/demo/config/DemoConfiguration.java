package com.springboot.demo.config;

import com.springboot.demo.entity.Project;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 采用java配置方式
 *
 * @author:tanghui
 * @since 1.0
 */
@Configuration        //等同于@Configuration，将这个类声明为配置类，配置类相当于applicationContext.xml配置文件
@PropertySource("classpath:application-value.properties")
/*
用来在框架中加载指定的属性文件。application.properties是默认加载的。也可以通过spring.profiles.active=value将属性文件嵌入到application.properties。
如果引入的属性较多可以采用@ConfigurationProperties(prefix = "springboot")这种方式来快速引入属性文件中属性
*/
public class DemoConfiguration {
    //引入属性文件中只有较少的属性的最佳方式
    @Value("${springboot}")
    private String projectName;
    /*    //引入属性文件中有较多属性时的最佳方式
   @Autowired
    private Project project;
    */

    /**
     * 注解@Bean相对于ApplicationContext.xml中的<bean></bean>标签。用来注册一个Bean组件。
     * <p>
     * 该方法用来注册一个Bean 组件，方法名默认为该Bean的id
     * 注册Bean时，不可以使用lombok的@Buider,@Data
     *
     * @return 一个Bean实例
     */
    @Bean
    public Project project() {
        Project project = new Project();
        project.setProjectName(projectName);
        return project;
    }

    /**
     * 当容器中有Bean存在，容器会自动为方法参数注入Bean
     *
     * @param project
     * @return
     */
    @Bean
    public Project project1(Project project) {
        return project;
    }


}
