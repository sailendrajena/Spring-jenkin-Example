package com.jenkin.core.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinExampleApplication {
	public static Logger log = LoggerFactory.getLogger(SpringJenkinExampleApplication.class);
	
	@PostConstruct
	public void init() {
		log.info("Application started successfully.......");
	}

	public static void main(String[] args) {
		log.info("Application executed successfully.......");
		SpringApplication.run(SpringJenkinExampleApplication.class, args);
	}

}
