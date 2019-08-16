package com.example.hello;

import com.example.hello.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {

    @Autowired
    private HelloController helloController;

    @Test
    public void contextLoads() {
    }

    @Test
    public void index() {
        System.out.println(helloController.index());
    }
}
