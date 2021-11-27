package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.services.HelloService;

public class BeanInjectTest {
    public static void main(String[] args) {
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("helloworld.xml");
        // 通过构造器方式注入
        HelloService bean1 = beanFactory.getBean("bean1", HelloService.class);
        bean1.sayHello();
        // 通过setter方式注入
        HelloService bean2 = beanFactory.getBean("bean2", HelloService.class);
        bean2.sayHello();
    }
}
