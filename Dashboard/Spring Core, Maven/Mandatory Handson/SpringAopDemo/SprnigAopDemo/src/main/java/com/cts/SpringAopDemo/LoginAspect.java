package com.cts.SpringAopDemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {
    private EasyBank easyBank;

    public EasyBank getEasyBank() {
        return easyBank;
    }

    @Autowired
    public void setEasyBank(EasyBank easyBank) {
        this.easyBank = easyBank;
    }

    @Around(value = "execution(public void com.cts.SpringAopDemo.EasyBank.doWithdraw(..))")
    public void validateWithdraw(ProceedingJoinPoint joinPoint) throws Throwable {
        if (easyBank.getTempPin() != easyBank.getPinCode()) {
            throw new Exception();
        } else {
            joinPoint.proceed();
            System.out.println("Your remaining balance is " + (easyBank.getBalance()));
        }
    }

    @Before(value = "execution(public void com.cts.SpringAopDemo.EasyBank.showBalance(..)) || " +
            "execution(public void com.cts.SpringAopDemo.EasyBank.doDeposit(..))")
    public void validateBalance() {
        if (easyBank.getTempPin() != easyBank.getPinCode()) {
            throw new RuntimeException();
        }
    }

    @AfterReturning(value = "execution(public void com.cts.SpringAopDemo.EasyBank.doChangePin(..))")
    public void afterPinChange() {
        System.out.println("You have successfully changed your pin");
    }


    @AfterThrowing(value = "within(com.cts.SpringAopDemo.EasyBank)")
    public void afterWrongPin() {
        System.out.println("Invalid Pin");
    }
}
