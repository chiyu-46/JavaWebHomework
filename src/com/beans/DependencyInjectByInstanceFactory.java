package com.beans;

import com.services.HelloService;

public class DependencyInjectByInstanceFactory {
    public HelloService newInstance(String message, int index) {
        return new HelloBean3(message, index);
    }
}
