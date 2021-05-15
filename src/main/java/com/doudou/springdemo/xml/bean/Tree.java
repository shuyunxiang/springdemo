package com.doudou.springdemo.xml.bean;

public class Tree {
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age='" + age + '\'' +
                '}';
    }
}
