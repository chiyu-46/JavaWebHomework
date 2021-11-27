package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.services.HelloService;

public class DependencyInjectByStaticFactoryTest {
    public static void main(String[] args) {
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("helloworld.xml");
        // 获取根据参数索引依赖注入的Bean
        HelloService byIndex =
                beanFactory.getBean("sfByIndex",HelloService.class);
        byIndex.sayHello();
        // 获取根据参数类型依赖注入的Bean
        HelloService byType =
                beanFactory.getBean("sfByType", HelloService.class);
        byType.sayHello();
        // 获取根据参数名字依赖注入的Bean
        HelloService byName =
                beanFactory.getBean("sfByName", HelloService.class);
        byName.sayHello();
    }
}
