package com.platzi.springboot;

import com.platzi.springboot.component.MyBeanCommandLineRunner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final Log logger = LogFactory.getLog(this.getClass());

    private MyBeanCommandLineRunner beanCommandLineRunner;


    public Application(MyBeanCommandLineRunner beanCommandLineRunner) {

        this.beanCommandLineRunner = beanCommandLineRunner;
    }

    @Bean
    public Function<String, String> uppercase() {
        return (String value) -> value.toUpperCase();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {


    }


}
