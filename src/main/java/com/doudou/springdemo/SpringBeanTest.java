package com.doudou.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/doudou/springdemo/springdemo.xml");

        Object person = classPathXmlApplicationContext.getBean("person");

        System.out.println(person);
    }
}
