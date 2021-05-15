package com.doudou.springdemo.xml;

import com.doudou.springdemo.xml.bean.Cat;
import com.doudou.springdemo.xml.bean.Dog;
import com.doudou.springdemo.xml.bean.Person;
import com.doudou.springdemo.xml.anno.Animal;
import com.doudou.springdemo.xml.dao.IPersonDAO;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class SpringBeanTest {

    public static void main(String[] args) {

        // ------------------------------------------------
        // 编码方式创建
        // ------------------------------------------------
        // 容器
//        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
//
//        // 对象
//        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Person.class);
//        ConstructorArgumentValues constructorArgumentValues = new ConstructorArgumentValues();
//        constructorArgumentValues.addIndexedArgumentValue(0, "shuyunxiang");
//        constructorArgumentValues.addIndexedArgumentValue(1, "28");
//        rootBeanDefinition.setConstructorArgumentValues(constructorArgumentValues);
//
//         // 注册
//        beanRegistry.registerBeanDefinition("person", rootBeanDefinition);
//        beanRegistry.registerSingleton("person", rootBeanDefinition);
//
//        beanRegistry.registerAlias("person","aaa");
//        beanRegistry.registerAlias("person","444");
//        String[] people = beanRegistry.getAliases("person");
//        for (String person : people) {
//            System.out.println(person);
//        }
//        int singletonCount = beanRegistry.getSingletonCount();
//        System.out.println(singletonCount);
//
//        // 获取
//        Object person = beanRegistry.getBean("person");
//        System.out.println(person);


        // ------------------------------------------------
        // 配置文件方式创建
        // ------------------------------------------------
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/doudou/springdemo/xml/springdemo.xml");

        // ID获取
        Object person1 = classPathXmlApplicationContext.getBean("person");
        System.out.println(person1);

        // 类获取
        Person person2 = classPathXmlApplicationContext.getBean(Person.class);
        System.out.println(person2);

        // 接口获取
        IPersonDAO personDAO = classPathXmlApplicationContext.getBean(IPersonDAO.class);
        System.out.println(personDAO);

        // 类型获取
        Map<String, IPersonDAO> beansOfType = classPathXmlApplicationContext.getBeansOfType(IPersonDAO.class);
        beansOfType.forEach((beanName,bean)->{
            System.out.println(beanName + "："+bean.toString());
        });

        // 注解获取
        Map<String, Object> beansWithAnnotation = classPathXmlApplicationContext.getBeansWithAnnotation(Animal.class);
        beansWithAnnotation.forEach((x, y) -> {
            System.out.println(x + ":" + y);
        });

        // 获取所有ID
        String[] beanDefinitionNames = classPathXmlApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        // 找不到会报错
//        Cat bean = classPathXmlApplicationContext.getBean(Cat.class);
        // 不会报错
        ObjectProvider<Cat> beanProvider = classPathXmlApplicationContext.getBeanProvider(Cat.class);
        // 第二步才会报错，延后异常出现时机
//        Cat object = beanProvider.getObject();
        // 判断为空处理，方法1
        Cat cat = beanProvider.getIfAvailable();
        if(cat==null){
            cat = new Cat();
        }
        // 判断为空处理，方法1
        Cat ifAvailable = beanProvider.getIfAvailable(Cat::new);

        Object cat1 = classPathXmlApplicationContext.getBean("cat");
        System.out.println(cat1);

        com.doudou.springdemo.anno.Person bean = classPathXmlApplicationContext.getBean(com.doudou.springdemo.anno.Person.class);
        System.out.println(bean);
    }
}
