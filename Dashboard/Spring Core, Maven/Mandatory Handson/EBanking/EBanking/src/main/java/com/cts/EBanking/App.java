package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Code Validator
        new SkeletonValidator();

        Scanner scanner = new Scanner(System.in);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        SmartBankAccount smartBankAccount = context.getBean("smartBankAccount", SmartBankAccount.class);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Welcome Mr/Ms: " + smartBankAccount.getName());
        System.out.println("Your customer id is :" + smartBankAccount.getCustomerId());
        System.out.println("Please select account type");
        System.out.println("1 CurrentAccount");
        System.out.println("2 RecurringAccount");
        System.out.println("3 FixedAccount");
        int accountType = scanner.nextInt();

        switch (accountType) {
            case 1: {
                System.out.println("Select transaction type\n 1.Deposit\n 2.Withdraw");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("Enter amount to be deposited");
                    double amount = scanner.nextDouble();
                    smartBankAccount.doDeposit(amount);
                } else if (choice == 2) {
                    System.out.println("Enter amount to be withdrawn");
                    double amount = scanner.nextDouble();
                    smartBankAccount.doWithdraw(amount);
                }

                if (choice == 1 || choice == 2) {
                    System.out.println("Your balance amount is " + decimalFormat.format(smartBankAccount.getBalance()));
                } else {
                    System.out.println("Wrong choice");
                }

                break;
            }
            case 2: {
                System.out.println("Enter monthly installment");
                double amount = scanner.nextDouble();
                System.out.println("Enter tenure in months");
                int tenure = scanner.nextInt();
                double balance = smartBankAccount.calculateRecurringAccount(amount, tenure);

                System.out.println(String.format("Your balance after %d months will be %s", tenure, decimalFormat.format(balance)));
                break;
            }
            case 3: {
                System.out.println("Enter FD amount");
                double amount = scanner.nextDouble();
                System.out.println("Enter tenure in months");
                int tenure = scanner.nextInt();
                double balance = smartBankAccount.calculateFixedAccount(amount, tenure);

                System.out.println(String.format("Your balance after %d months will be %s", tenure, decimalFormat.format(balance)));
                break;
            }
            default:
                System.out.println("Wrong Choice");
        }
    }
}
