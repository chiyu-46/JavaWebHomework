package com.beans;

import com.services.HelloService;

public class HelloApiDecorator implements HelloService {
    private HelloService helloApi;
    // 空参构造器
    public HelloApiDecorator() {
    }
    // 有参构造器
    public HelloApiDecorator(HelloService helloApi) {
        this.helloApi = helloApi;
    }
    public void setHelloApi(HelloService helloApi) {
        this.helloApi = helloApi;
    }
    @Override
    public void sayHello() {
        System.out.println("==========装饰一下===========");
        helloApi.sayHello();
        System.out.println("==========装饰一下===========");
    }
}
