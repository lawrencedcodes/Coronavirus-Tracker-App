package com.topsoutherncoders.rona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RonaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RonaApplication.class, args);
	}

}
