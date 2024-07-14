package me.skyhero.spring_practice;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import me.skyhero.spring_practice.run.Location;

import me.skyhero.spring_practice.run.Run;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("Hello Spring Boot");
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1, "My first run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 10,
					Location.OUTDOOR);

			log.info("Run: {}", run);
		};
	}

}
