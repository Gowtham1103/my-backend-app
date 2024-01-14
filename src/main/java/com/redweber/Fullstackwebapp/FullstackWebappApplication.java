package com.redweber.Fullstackwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication

public class FullstackWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullstackWebappApplication.class, args);
	}



}
