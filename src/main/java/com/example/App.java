package com.example;

import com.example.test.lookup.method.bean.AbstractGetBeanTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        AbstractGetBeanTest test = (AbstractGetBeanTest) applicationContext.getBean("abstractGetBeanTest");
        test.showMe();
    }
}
