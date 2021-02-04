package com.ren.pojo;

public class User {
    private String name;

    // Spring uses default constructor (in Setter-based Dependency Injection)
    public User() {
        System.out.println("default constructor called!");
    }

    public User(String name) {
        System.out.println("parameter constructor called!");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name: " + this.name);
    }
}
