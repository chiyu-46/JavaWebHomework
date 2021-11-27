package com.beans;

import com.services.HelloService;

public class HelloBean implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
