package mine;


import lombok.extern.slf4j.Slf4j;
import mine.main.MyComponent;
import mine.model.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@ComponentScan({"mine", "others"})
@Slf4j
public class MainApp {

    public static void main(String [] args){
        System.out.println("Hi");
        Person p = new Person();
        SpringApplication app = new SpringApplication(MainApp.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8083"));

        app.run(args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println("Bean:"+ beanName);

            List<String> l = Arrays.asList("jjjjj", "bbbb", "bbbb", "");
            List<Integer> l1 = l.stream().map(x -> x.hashCode()).collect(Collectors.toList());

        }
        MyComponent c = (MyComponent)ctx.getBean("myComponent");
        c.toString();
        try {
            c.calc(1, 2);
            c.doIt();
        }
        catch(Exception exc){
            log.error(exc.toString());
        }

/*
            l.stream().map(String::hashCode).collect(Collectors.toList());
            List<Object> ll = new ArrayList<Object>();
            ll.add("ddd");
            ll.add(1);
            ll.add(new Integer("1"));
            ll.stream().map(String::hashCode);
*/

        };
    }
    private int ccc = 0;
}
