package com.nagarro.microservices.springcloudnetflixeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudNetflixEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudNetflixEurekaServerApplication.class, args);
	}

}
