package com.ren.log;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice, AfterReturningAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Calling " + o.getClass().getName() + "'s " + method.getName() + " method");
    }

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Executed " + method.getName() + " method, return value is " + returnValue);
    }
}
