package com.example.SWE645a3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.SWE645a3" })
@EntityScan(basePackages = "com.example.SWE645a3")
public class Swe645A3Application {

	public static void main(String[] args) {
		SpringApplication.run(Swe645A3Application.class, args);
	}

}
