package com.cts.patient.config;

import com.cts.patient.model.Patient;
import com.cts.patient.service.PatientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.cts.patient")
@PropertySource("classpath:patient_details.properties")
public class AppConfig {
    @Bean
    Patient patient() {
        return new Patient();
    }

    @Bean
    PatientService patientService() {
        return new PatientService();
    }
}
