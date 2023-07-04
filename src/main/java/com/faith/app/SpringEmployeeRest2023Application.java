package com.faith.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//entry point of our spring boot application

//this annotation is applied to the class to indicate

//that it is the main class for a spring boot application

//and triggers the auto-configuration process
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpringEmployeeRest2023Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmployeeRest2023Application.class, args);
		System.out.println(" welcome to spring boot");
	}

}
