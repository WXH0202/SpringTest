package com.example;

import com.example.test.lookup.method.bean.AbstractGetBeanTest;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        // AbstractGetBeanTest test = (AbstractGetBeanTest) applicationContext.getBean("abstractGetBeanTest");
        // System.out.println("test.user = " + test.user);
        // test.showMe();
        // 搜索类加载路径下的 beans.xml 文件创建 Resource 对象 
        ApplicationContext pathXmlApplicationContext = new FileSystemXmlApplicationContext("G:\\IdeaWorkSpace\\SpringTest\\src\\main\\resources\\spring-context.xml");
        AbstractGetBeanTest abstractGetBeanTest = pathXmlApplicationContext.getBean("abstractGetBeanTest", AbstractGetBeanTest.class);
        System.out.println("abstractGetBeanTest = " + abstractGetBeanTest.user);
        AbstractGetBeanTest abstractGetBeanTest2 = pathXmlApplicationContext.getBean("abstractGetBeanTest", AbstractGetBeanTest.class);
        System.out.println("abstractGetBeanTest2 = " + abstractGetBeanTest2.user);
        // System.out.println("abstractGetBeanTest.user = " + abstractGetBeanTest.user);
        
        // ApplicationContext pathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-context.xml", "spring-context2.xml");
        // Resource resource = new FileSystemResource("spring-context.xml");
        // Resource resource = new ClassPathResource("spring-context.xml");
        // 创建默认的 BeanFactory 容器
        // DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // new XmlBeanDefinitionReader(beanFactory).loadBeanDefinitions(resource);
    }
}
