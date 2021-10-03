package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2021-10-01 17:50
 */
public class TestBean {

    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = context.getBean("UserService", UserService.class);

        userService.show();

    }
}
