package com.i2i.employeemanagement.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Configuration
@EnableSwagger2
public class EmployeemanagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmployeemanagementApplication.class, args);
	}
}

