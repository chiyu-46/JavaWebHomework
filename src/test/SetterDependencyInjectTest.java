package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.services.HelloService;

public class SetterDependencyInjectTest {
    public static void main(String[] args) {
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("helloworld.xml");
        HelloService bean =
                beanFactory.getBean("bean", HelloService.class);
        bean.sayHello();
    }
}
