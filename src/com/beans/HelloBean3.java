package com.beans;

import com.services.HelloService;

public class HelloBean3 implements HelloService {
    private String message;
    private int index;
    @java.beans.ConstructorProperties({"message", "index"})
    public HelloBean3(String message, int index) {
        this.message = message;
        this.index = index;
    }
    @Override
    public void sayHello() {
        System.out.println(index + ":" + message);
    }
}
