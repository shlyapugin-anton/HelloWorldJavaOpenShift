package com.example.microservices_java_book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.example"
})
public class MicroservicesJavaBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesJavaBookApplication.class, args);
    }

}
