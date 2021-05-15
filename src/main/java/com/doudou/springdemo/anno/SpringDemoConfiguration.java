package com.doudou.springdemo.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.doudou.springdemo.anno")
// 引入配置文件
@ImportResource("com/doudou/springdemo/xml/springdemo.xml")
public class SpringDemoConfiguration {

//    @Bean("personOne")
//    public Person person(){
//        Person person = new Person();
//        person.setAge("29");
//        person.setName("shuyunxiang");
//        person.setDog(dog());
//        return person;
//    }
//
//    @Bean
//    public Dog dog(){
//        Dog dog = new Dog();
//        dog.setAge("29");
//        return dog;
//    }

}
