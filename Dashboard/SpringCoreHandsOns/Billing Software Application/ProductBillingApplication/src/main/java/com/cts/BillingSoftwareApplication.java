package com.cts;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cts.bean.Product;
import com.cts.service.BillingException;
import com.cts.service.ProductService;

public class BillingSoftwareApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		ProductService service = context.getBean(ProductService.class);

		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Generate Bill by entering code and quantity \n" + "2. Exit \n");
		int option = scanner.nextInt();
		boolean flag = false;
		double total_amount = 0;
		switch (option) {
		case 1: {

			int product_code = -1;
			int quantity = -1;
			do {
				flag = false;
				System.out.println("Enter product_code");
				product_code = scanner.nextInt();

				try {
					if (!service.validateProductCode(product_code)) {
						flag = true;
						throw new BillingException("Invalid product_code, it should be >0 and 4 digit +ve number");
					}
				} catch (BillingException e) {
					System.err.println(e.getMessage());
				}

			} while (flag);

			do {
				flag = false;
				System.out.println("Enter quantity");
				quantity = scanner.nextInt();

				try {
					if (!service.validateQuantity(quantity)) {
						flag = true;
						throw new BillingException("Invalid quantity, it should be >0");
					} else {
						flag = false;
					}
				} catch (BillingException e) {
					System.err.println(e.getMessage());
				}

			} while (flag);

			Product product = service.getProductDetails(product_code);
			total_amount = service.calculatePrice(quantity, product.getProduct_price());
			System.out.println("Product Name: " + product.getProduct_name());
			System.out.println("Product Category: " + product.getProduct_category());
			System.out.println("Product Description: " + product.getProduct_desc());
			System.out.println("Product Price(Rs): " + product.getProduct_price());
			System.out.println("Quantity: " + quantity);
			System.out.println("Total Bill Amount: Rs." + total_amount);
			
		}
			break;

		case 2:
		    scanner.close();
		    context.close();
			return;
		default:
			System.out.println("Enter option 1 to 2 only");
			break;
		}
		
		scanner.close();
		context.close();
	}

}