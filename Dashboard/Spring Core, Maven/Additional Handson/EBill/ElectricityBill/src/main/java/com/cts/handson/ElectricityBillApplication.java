package com.cts.handson;

import com.cts.handson.dao.EBillDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.cts.handson")
public class ElectricityBillApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        EBillDAO eBillDAO = applicationContext.getBean(EBillDAO.class);

        eBillDAO.deleteBill(100L, 99L);

        System.out.format("%-5s %-15s %-10s %10s %5s %s\n", "Id", "Consumer Id", "Month", "Reading", "Unit", "Amount");
        eBillDAO.getAllBill().forEach(System.out::println);
    }
}
