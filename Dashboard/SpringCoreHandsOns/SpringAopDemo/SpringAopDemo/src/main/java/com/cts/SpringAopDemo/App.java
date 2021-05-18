package com.cts.SpringAopDemo;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		new SkeletonValidator();

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

		EasyBank bank = context.getBean(EasyBank.class);
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		int pin = 0;
		int amount = 0;
		do {
			System.out.println("\nSelect option \n 1.Deposit\n 2.Withdraw\n 3.Change Pin\n 4.Show Balance\n 5.Exit");
			choice = scanner.nextInt();
			try {
				switch (choice) {
				case 1:
					System.out.println("Enter amount to deposit");
					amount = scanner.nextInt();
					System.out.println("Enter pin");
					pin = scanner.nextInt();
					bank.setTempPin(pin);
					bank.doDeposit(amount);
					break;

				case 2:
					System.out.println("Enter amount to withdraw");
					amount = scanner.nextInt();
					System.out.println("Enter pin");
					pin = scanner.nextInt();
					bank.setTempPin(pin);
					bank.doWithdraw(amount);
					break;

				case 3:
					System.out.println("Enter your current pin");
					int oldPin = scanner.nextInt();
					System.out.println("Enter 4 digit new pin");
					pin = scanner.nextInt();
					bank.doChangePin(oldPin, pin);
					break;

				case 4:
					System.out.println("Enter pin");
					pin = scanner.nextInt();
					bank.setTempPin(pin);
					bank.showBalance();
					break;

				case 5:
					System.out.println("Thanks for using our service");
					break;

				default:
					System.out.println("Wrong choice");

				}
			} catch (Exception e) {

			}

		} while (choice != 5);

        context.close();
		scanner.close();

	}

}
