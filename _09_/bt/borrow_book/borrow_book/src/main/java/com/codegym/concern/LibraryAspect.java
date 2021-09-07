package com.codegym.concern;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LibraryAspect {
    private int count = 0;

    @Pointcut("execution(* com.codegym.controller.LibraryController.*(..))")
    public void viewCount() {
    }

    @Before("viewCount()")
    public void count() {
       count += 1;
        System.err.println("Total  " +count );
    }


}
