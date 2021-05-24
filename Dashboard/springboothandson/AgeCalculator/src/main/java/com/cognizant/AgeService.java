package com.cognizant;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeService {
    public String calculateAge(String date) {
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Period period = Period.between(localDate, LocalDate.now());
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        return "you are " + years + " years, " + months + " months, " + days + " days old.";
    }
}
