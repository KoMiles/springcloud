package com.example.servicefeigntest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServiceFeignTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignTestApplication.class, args);
        System.out.println("================ Service Feign test end =======");
    }

}
