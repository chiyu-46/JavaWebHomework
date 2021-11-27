package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beans.ListTestBean;

public class DependencyInjectListTest {
    public static void main(String[] args) {
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("helloworld.xml");
        // 获取根据参数索引依赖注入的Bean
        ListTestBean listBean =
                (ListTestBean)beanFactory.getBean("listBean");
        listBean.sayHello();
    }
}
