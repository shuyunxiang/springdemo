package com.doudou.springdemo;

import com.doudou.springdemo.bean.Person;
import com.doudou.springdemo.dao.PersonDAO;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanTest {

    public static void main(String[] args) {

        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();

        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Person.class);

        beanRegistry.registerBeanDefinition("person", rootBeanDefinition);

        ConstructorArgumentValues constructorArgumentValues = new ConstructorArgumentValues();
        constructorArgumentValues.addIndexedArgumentValue(0, "shuyunxiang");
        constructorArgumentValues.addIndexedArgumentValue(1, "28");
        rootBeanDefinition.setConstructorArgumentValues(constructorArgumentValues);

        Object person = beanRegistry.getBean("person");
        System.out.println(person);


        // ------------------------------------------------
        // 配置文件方式创建
        // ------------------------------------------------
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/doudou/springdemo/springdemo.xml");
//        // ID获取
//        Object person1 = classPathXmlApplicationContext.getBean("person");
//        // 类获取
//        Person person2 = classPathXmlApplicationContext.getBean(Person.class);
//        // 接口获取
//        PersonDAO bean = classPathXmlApplicationContext.getBean(PersonDAO.class);
//
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(bean);
    }
}
