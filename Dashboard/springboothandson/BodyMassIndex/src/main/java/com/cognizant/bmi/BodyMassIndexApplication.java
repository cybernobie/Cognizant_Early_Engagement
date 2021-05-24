package com.cognizant.bmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class BodyMassIndexApplication {

	public static void main(String[] args) {
		SpringApplication.run(BodyMassIndexApplication.class, args);
	}

}
