package com.abhishek.myappserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MyappServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappServerApplication.class, args);
	}
}
