package com.cts.patient;

import com.cts.patient.service.PatientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(com.cts.patient.config.AppConfig.class);
        PatientService patientService = context.getBean(PatientService.class);
        patientService.getPatientDetails();
    }
}
