package me.skyhero.spring_practice;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPracticeApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringPracticeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringPracticeApplication.class, args);
		log.info("Hello Spring Boot");
	}

}
