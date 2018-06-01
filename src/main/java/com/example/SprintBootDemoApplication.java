package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Employee;

@SpringBootApplication(scanBasePackages="com.example")
public class SprintBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootDemoApplication.class, args);
	}
}
