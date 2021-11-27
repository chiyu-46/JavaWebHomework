package com.beans;

import com.services.HelloService;

public class HelloBean2 implements HelloService {
    private String message;

    @Override
    public void sayHello() {
        System.out.println(message);
    }
    public HelloBean2() {
        this.message = "Hello World!";
    }
    public HelloBean2(String message) {
        this.message = message;
    }

}
