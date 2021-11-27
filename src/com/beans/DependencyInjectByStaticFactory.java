package com.beans;

import com.services.HelloService;

public class DependencyInjectByStaticFactory {
    public static HelloService newInstance(String message, int index) {
        return new HelloBean3(message, index);
    }
}
