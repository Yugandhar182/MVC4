package com.example.MVC2.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.example.MVC2.yController" )
public class Mvc2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mvc2Application.class, args);
	}

}
