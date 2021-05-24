package com.cts.SpringAopDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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

    public void doWithdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("You have successfully withdrawn " + amount);
        } else {
            System.out.println("Insufficient Fund");
        }
    }

    public void doDeposit(int amount) {
        balance += amount;
        System.out.println("Your  balance is " + balance);
    }

    public void doChangePin(int oldPin, int pin) {
        if (oldPin == pinCode) {
            pinCode = pin;
        } else {
            throw new RuntimeException();
        }
    }

    public void showBalance() {
        System.out.println("Your balance is " + balance);
    }
}
