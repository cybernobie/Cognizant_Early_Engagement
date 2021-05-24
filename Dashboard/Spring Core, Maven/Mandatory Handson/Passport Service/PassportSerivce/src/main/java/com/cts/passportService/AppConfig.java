package com.cts.passportService;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cts.passportService")
public class AppConfig {
    @Bean
    public Document chennaiDocument() {
        Document document = new Document();
        document.setName("Joe");
        document.setIdProof("Driving Licence");
        document.setCity("Chennai");

        return document;
    }

    @Bean
    public Document bangaloreDocument() {
        Document document = new Document();
        document.setName("John");
        document.setIdProof("Aadhaar Card");
        document.setCity("Bangalore");

        return document;
    }
}
