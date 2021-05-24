package com.cts.patient.service;


import com.cts.patient.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PatientService {
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    @Autowired
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void getPatientDetails() {
        String result = "Patient Id : " + patient.getPid() +
                "\nPatient Name : " + patient.getPname() +
                "\nDisease : " + patient.getDisease() +
                "\nSex : " + patient.getSex() +
                "\nAdmit Status : " + patient.getAdmit_status() +
                "\nAge : " + patient.getAge();
        System.out.println(result);
    }
}
