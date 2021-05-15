package com.doudou.springdemo.anno;

import com.doudou.springdemo.xml.anno.Animal;

@Animal
public class Dog {
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age='" + age + '\'' +
                '}';
    }
}
