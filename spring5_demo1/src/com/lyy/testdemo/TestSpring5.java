package com.lyy.testdemo;

import com.lyy.Book;
import com.lyy.User;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
/*
    IOC容器基本实现，是Spring内部的使用接口，不提供开发人员使用
    *加载配置文件时不会创建对象，在获取对象（使用）才会创建对象
*/
import org.springframework.context.ApplicationContext;
/*
    BeanFactory接口的子接口，提供更多强大的功能，一般由开发人员进行使用
    *加载配置文件的时候就会把在配置文件对象进行创建
*/
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd(){
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2 获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }


    @Test
    public void testBook(){
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2 获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }



    /*
        ApplicationContext接口实现类：
            FileSystemXmlApplicationContext：带盘符路径的文件
            ClassPathXmlApplicationContext：src路径下的文件
    */

    /*
      IOC操作Bean管理（概念）
        1、Bean管理：
         （1）Bean管理指的是两个属性
         （2）Spring创建对象
         （3）Spring注入属性
        2、Bean管理操作有两种方式
         （1）基于xml配置文件方式
         （2）基于注解方式实现


      IOC操作Bean管理（基于xml方式）
        1、基于xml方式创建对象
         （1）在spring配置文件中，使用bean标签，标签里面添加对应属性，就可以实现对象创建
         （2）在bean标签中有很多属性
         （3）Spring注入属性
        2、基于xml方式注入属性
         （1）基于xml配置文件方式
         （2）基于注解方式实现
    */
}
