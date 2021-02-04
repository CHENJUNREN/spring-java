package com.ren.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Person {

    /*
    // no setter method is needed if using autowired annotation!
    @Autowired
    @Qualifier(value = "cat0")
    private Cat cat;
    @Autowired(required = false)
    private Dog dog;
    */

    // Resource annotation
    @Resource(name = "cat0")
    private Cat cat;
    @Resource
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    /*public void setCat(Cat cat) {
        this.cat = cat;
    }*/

    public Dog getDog() {
        return dog;
    }

    /*public void setDog(Dog dog) {
        this.dog = dog;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
