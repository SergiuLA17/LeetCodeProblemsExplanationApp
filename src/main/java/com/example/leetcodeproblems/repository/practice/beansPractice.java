package com.example.leetcodeproblems.repository.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class beansPractice {

    class A {

    }

    class B {
        A a1;
        A a2;
    }

    @Bean
    @Scope("prototype")
    public A a() {
        return new A();
    }

    @Bean
    public B b(A a1, A a2) {
        return new B();
    }
}

