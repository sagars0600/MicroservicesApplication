package com.example.eurka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurkaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurkaProjectApplication.class, args);
	}

}
