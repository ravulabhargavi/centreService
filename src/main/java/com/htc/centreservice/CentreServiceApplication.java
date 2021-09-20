package com.htc.centreservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class CentreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentreServiceApplication.class, args);
	}

}
