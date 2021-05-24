package com.cts.handson.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private final static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static Date stringToDate(String str) {
        Date date = null;

        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            date = new Date();
        }

        return date;
    }

    public static String dateToString(Date date) {
        return sdf.format(date);
    }
}
