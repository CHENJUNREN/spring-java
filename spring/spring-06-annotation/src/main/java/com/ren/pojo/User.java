package com.ren.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// <bean id="user" class="com.ren.pojo.User"/>
@Component
@Scope("singleton")
public class User {

    // <property name="name" value="ren"/>
    // @Value("ren")
    public String name;

    @Value("ren")
    public void setName(String name) {
        this.name = name;
    }
}
