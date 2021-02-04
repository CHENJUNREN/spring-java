package com.ren.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationLog {

    @Before("execution(* com.ren.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=========before=========");
    }

    @After("execution(* com.ren.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("=========after=========");
    }

    @Around("execution(* com.ren.service.UserServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("before");
        Object proceed = jp.proceed();
        System.out.println("after");

        System.out.println(proceed);
        System.out.println(jp.getSignature());
        return proceed;
    }
}
