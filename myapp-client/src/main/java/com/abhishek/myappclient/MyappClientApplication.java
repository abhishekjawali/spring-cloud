package com.abhishek.myappclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MyappClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyappClientApplication.class, args);
    }
}
