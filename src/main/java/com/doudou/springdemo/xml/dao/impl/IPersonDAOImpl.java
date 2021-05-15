package com.doudou.springdemo.xml.dao.impl;

import com.doudou.springdemo.xml.bean.Person;
import com.doudou.springdemo.xml.dao.IPersonDAO;

public class IPersonDAOImpl implements IPersonDAO {

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "PersonDAOImpl{" +
                "person=" + person +
                '}';
    }
}
