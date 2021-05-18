package com.cts.passportService;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		new SkeletonValidator();

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HeadPassportOffice passportOffice = null;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Select location:\n1.Chennai\n2.Bangalore");
		int choice = scanner.nextInt();

		if (choice == 1) {
			// Type your code here

			passportOffice = (ChennaiPassportOffice) context.getBean(ChennaiPassportOffice.class);

		} else if (choice == 2) {
			// Type your code here

			passportOffice = (BangalorePassportOffice) context.getBean(BangalorePassportOffice.class);

		} else {
			System.out.println("Wrong Choice");
			return;
		}
		passportOffice.doPhotoVerification();
		passportOffice.issuePassport();
        
		scanner.close();
		context.close();
	}
}
