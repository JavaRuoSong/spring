package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.User;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author shkstart
 * @create 2021-09-20 14:28
 *
 * ioc :控制反转
 *          1.解析xml文件 获得路径 classValue
 *          2.通过反射创建对象  Class clazz = Class.forName(classValue);
 *                              clazz.newInstance;
 *
 * 1.ioc思想基于IOC容器完成，IOC容器底层就是对象工厂
 *
 * 2.Spring提供IOC容器两种实现方式：（两个接口）
 *      1.BeanFactory：ioc 容器最基本实现（spring内部使用的，不提供给开发人员使用，一般不用）
 *          ！！加载配置文件时不会创建对象，在获取对象时才去创建对象
 *
 *
 *      2.ApplicationContext：是BeanFactory接口的子接口，提供更多更强大的功能，一般由开发人员使用
 *           ！！加载配置文件是就会创建对象
 *
 *      3.Application接口有实现类
 *
 *
 *1.bean管理
 *      1.创建对象
 *      2.注入属性
 *
 *2.
 *
 *
 *
 *
 *
 *
 *
 * DI：依赖注入，就是注入属性     ！！DI是ioc的一种具体实现，需要在创建对象的基础上进行完成、
 *      方式一：使用set方法注入
 *      方式二：使用有参构造器注入
 */
public class TestSpring5 {
    @Test
    public void add()  {
        //加载Spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");//项目中的路径
//        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
//        ApplicationContext context1 =
//                new FileSystemXmlApplicationContext("  ")//在系统中的路径，带盘符

        //创建对象
        User user = context.getBean("user", User.class);
        System.out.println(user);

        user.add();
        user.show();

        //通过有参构造器注入属性
        Book book = context.getBean("book", Book.class);

        book.show();

        //
        User user1 = context.getBean("user", user.getClass());

        user1.show();
    }
}
