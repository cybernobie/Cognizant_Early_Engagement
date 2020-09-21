# Employee Loan Eligibility - Polymorphism

Global Engineering is one of the fastest growing company. It needs to automate the transactions performed in the organization.  As start up, they need to automate the Employee management system. 

Partial code is provided to do this. Don’t change the skeleton. Do the additions wherever necessary.


You are provided with a public class Employee with protected attributes :

- int employeeId
- String employeeName
- double salary

Appropriate public getters and setters are already written.

Write a public 2 argument constructor with arguments – employeeId,and employeeName.

Write a public abstract method calculateSalary()  in Employee class as,     

`public abstract void calculateSalary()`

You are provided with a public class PermanentEmployee with private attribute : 

- double basicPay

Appropriate public getters and setters are already written.

Make this class PermanentEmployee to inherit the Employee class.

Write a public 3 argument constructor with arguments – employeeId, employeeName and basicPay.  

Implement the calculateSalary method in Employee class as

salary = basicPay – PF amount

Here PF Amount = basicPay * 0.12; Set this value to the salary attribute.

You are provided with a public class TemporaryEmployee with private attribute : 

- int  hoursWorked
- int hourlyWages

Appropriate public getters and setters are already written.

This class TemporaryEmployee should inherit the Employee class.

Write a public 4 argument constructor with arguments – employeeId, employeeName, hoursWorked and hourlyWages.  

Implement the calculateSalary method in Employee class as

salary = hoursWorked * hourlyWages

Set this value to the salary attribute.

You are provided with a public class Loan

A method calculateLoanAmount is provided as shown below :

public double calculateLoanAmount(Employee employeeObj)

This method should calculate the loan amount and return that amount. 

Provide the implementation for this method as mentioned below

Loan amount is calculated as follows :

If the Employee object is of type PermanentEmployee the loan amount should be 15%  of the salary.  

If the Employee object is of type TemporaryEmployee the loan amount should be 10%  of the salary.

You are provided with a public class Main which has the main method.  

Check the correctness of the methods written in these classes.

**Note :  All class, methods needs to be declared as public**