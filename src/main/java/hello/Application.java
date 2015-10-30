package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by saryana on 10/29/15.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        System.out.println("Whats up guys!");

//        String[] beanNames = context.getBeanDefinitionNames();
//        for (String bean : beanNames) {
//            System.out.println(bean);
//        }

    }
}
