package com.cts.patient.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Patient {
    private String pid;
    private String pname;
    private String disease;
    private String sex;
    private String admit_status;
    private Integer age;

    public String getPid() {
        return pid;
    }

    @Value("${pid}")
    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    @Value("${pname}")
    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDisease() {
        return disease;
    }

    @Value("${disease}")
    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getSex() {
        return sex;
    }

    @Value("${sex}")
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdmit_status() {
        return admit_status;
    }

    @Value("${admit_status}")
    public void setAdmit_status(String admit_status) {
        this.admit_status = admit_status;
    }

    public Integer getAge() {
        return age;
    }

    @Value("${age}")
    public void setAge(Integer age) {
        this.age = age;
    }
}
