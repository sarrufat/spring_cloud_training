package com.sarrufat.photo.app.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.sarrufat")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
