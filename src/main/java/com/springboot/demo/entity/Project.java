package com.springboot.demo.entity;

/**
 * @author:tanghui
 * @since 1.0
 */
//@ConfigurationProperties(prefix = "springboot") //2.当需要引入的属性比较多的时候，这个时候可以使用@ConfigurationProperties将这些前缀一样的属性封装到一个bean里。

public class Project {
    private String projectName;
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
