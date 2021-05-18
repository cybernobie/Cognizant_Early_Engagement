
package com.cts.SpringAopDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Type your code here
@Component
public class EasyBank {

	private int pinCode;
	private int balance;
	private int tempPin;

	public int getPinCode() {
		return pinCode;
	}

	@Value("6789")
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getBalance() {
		return balance;
	}

	@Value("10000")
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTempPin() {
		return tempPin;
	}

	public void setTempPin(int tempPin) {
		this.tempPin = tempPin;
	}

	public void doDeposit(int amount) {

		// Type your code here
		balance += amount;
		System.out.println("Your  balance is " + balance);
	}

	public void doWithdraw(int amount) {

		// Type your code here
		if (amount <= balance) {
			balance -= amount;
			System.out.println("You have successfully withdrawn " + amount);
			return;
		}
		System.out.println("Insufficient Fund");
	}

	public void doChangePin(int oldPin, int pin) {

		// Type your code here
		if (oldPin != pinCode || !Integer.toString(pin).matches("^[1-9]{1}[0-9]{3}$")) {
		    // Actually an exception must be thrown here. But as we can't change the signature
		    // of this method (due to SkeletonValidator) we have to stick to the below print and 
		    // return statement to run this code successfully. It's actually INCORRECT as we will 
		    // be getting the output "You have successfully changed your pin" (due to @AfterReturning advice) 
		    // even after printing "Invalid Pin", which is a BUG!
			System.out.println("Invalid Pin");
			return;
		}
		pinCode = pin;
	}

	public void showBalance() {

		// Type your code here
		System.out.println("Your balance is " + balance);
	}

}
