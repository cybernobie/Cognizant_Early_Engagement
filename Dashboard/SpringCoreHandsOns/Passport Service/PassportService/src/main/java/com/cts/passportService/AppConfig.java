package com.cts.passportService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Type your code here
// Type your code here

@Configuration
@ComponentScan
public class AppConfig {

	// Type your code here
	@Bean
	public Document chennaiDocument() {

		Document document = new Document();
		document.setName("Joe");
		document.setIdProof("Driving Licence");
		document.setCity("Chennai");

		return document;
	}

	// Type your code here
	@Bean
	public Document bangaloreDocument() {

		Document document = new Document();
		document.setName("John");
		document.setIdProof("Aadhaar Card");
		document.setCity("Bangalore");

		return document;
	}

}
