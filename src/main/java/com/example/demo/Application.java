package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.err.println("tomcat-jasper added in pom.xml");
		 System.err.println("Goto Chrome-->localhost:2999/helo \n Result will be displayed");
		System.err.println("Springboot Application Started");
		
	}

}
