package com.doudou.springdemo.anno;

import com.doudou.springdemo.xml.bean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(SpringDemoConfiguration.class);

//        // 配置类注入
//        Object person = annotationConfigApplicationContext.getBean("personOne");
//        System.out.println(person);
//
//        Object cat = annotationConfigApplicationContext.getBean("cat");
//        System.out.println(cat);

        Person bean = annotationConfigApplicationContext.getBean(Person.class);
        System.out.println(bean);
    }
}
