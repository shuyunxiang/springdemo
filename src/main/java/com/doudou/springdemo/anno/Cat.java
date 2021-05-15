package com.doudou.springdemo.anno;

import com.doudou.springdemo.xml.anno.Animal;
import org.springframework.stereotype.Component;

@Animal
//@Component
public class Cat {
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age='" + age + '\'' +
                '}';
    }
}
