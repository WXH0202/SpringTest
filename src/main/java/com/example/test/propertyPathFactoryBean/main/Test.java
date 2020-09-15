package com.example.test.propertyPathFactoryBean.main;

import com.example.test.propertyPathFactoryBean.entity.Persson;
import com.example.test.propertyPathFactoryBean.entity.Son;
import com.example.test.propertyPathFactoryBean.entity.Toys;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // Persson son = new Son();
        // System.out.println("son = " + son);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        // Toys toys = applicationContext.getBean("son.toys1", Toys.class);
        // System.out.println("toys = " + toys);
        // Son son = applicationContext.getBean("son", Son.class);
        // System.out.println("son.getAge() = " + son.getAge());
        // Double aDouble = applicationContext.getBean("son.toys.price", Double.class);
        // System.out.println("aDouble = " + aDouble);
        // Double age = applicationContext.getBean("age", Double.class);
        // System.out.println("age = " + age);
        // Toys toys = applicationContext.getBean("son.toys2", Toys.class);
        // System.out.println("toys = " + toys);
        // Son son = applicationContext.getBean("son2", Son.class);
        // System.out.println("son.getAge() = " + son.getAge());
        // System.out.println("son = " + son);

    }
}
