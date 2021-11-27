package com.beans;

import com.services.HelloService;

public class HelloWorldStaticFactory {
    // 工厂方法
    public static HelloService newInstance(String message) {
        // 返回需要的Bean实例
        return new HelloBean2(message);
    }

}
