package com.ravipati.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.ravipati.controller")
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(HelloWorld.class, args);
		System.out.println("HelloWorld.....");
		
	}

}
