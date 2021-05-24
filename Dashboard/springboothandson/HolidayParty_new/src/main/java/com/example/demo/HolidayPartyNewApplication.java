package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.controller","com.model","com.validate"})

public class HolidayPartyNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolidayPartyNewApplication.class, args);
	}

}
