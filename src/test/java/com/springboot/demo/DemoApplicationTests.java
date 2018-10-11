package com.springboot.demo;

import com.springboot.demo.entity.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

/*    @Autowired
    private Project project;*/

    @Test
    public void contextLoads() {
    }

    @Test
    public void name() {
        Project project2 = null;
        Project project1 = new Project();
        System.out.println(project1 == project2);
        System.out.println(project1.equals(project2));

/*        System.out.println(project.getProjectName());
        System.out.println(project.getValue());*/
    }
}
