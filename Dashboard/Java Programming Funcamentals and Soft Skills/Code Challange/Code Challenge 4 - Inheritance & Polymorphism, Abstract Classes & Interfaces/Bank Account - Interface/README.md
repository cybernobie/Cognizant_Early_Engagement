# Bank Account - Interface

KGFB is a financial institution that provides facilities such as current account and savings account to its customers. To add to its facilities they have come up with the locker that is chargeable. Since it is a new facility introduced, many customers have approached them to enquire about this facility.

To make the banking service effective, KGFB plans to automate the calculation of the locker maintenance charges based on the various account types and the duration.(in years).

Help them by creating a Java application that caters to their requirement.

## Requirement 1: Maintenance Charge Calculation

The customer needs to provide information like account type, customer name, account number, balance and number of years to calculate the maintenance charge.

### Component Specification: Account Class (Parent Class)

| Type (Class) | Attributes | Methods | Responsibilities |
| ------------ | ---------- | ------- | ---------------- |
| Account | String accountNumber<br>String customerName<br>double balance | Include a public getter and setter methods.<br><br>Include   a public 3 argument constructor in the order -  accountNumber, customerName, balance |  |
 
### Component Specification: MaintenanceCharge (Interface)

| Component Name | Type (Interface) | Methods | Responsibilities |
| -------------- | ---------------- | ------- | ---------------- |
| Maintenance Charge Calculation | MaintenanceCharge | `public float calculateMaintenanceCharge(float noOfYears)` | This is an abstract method and it should calculate the maintenance charge based on the number of years and account type and return the result. | 

 

### Component Specification: CurrentAccount Class (should be a child of Account Class and implement MaintenanceCharge interface)

| Component Name | Type (Interface) | Methods | Responsibilities |
| -------------- | ---------------- | ------- | ---------------- |
Maintenance Charge Calculation | CurrentAccount | Include  a public 3 argument constructor in the order -  customerName, accountNumber, balance |  | 

### Component Specification: SavingsAccount Class (should be a child of Account Class and implement MaintenanceCharge interface)

| Component Name | Type (Interface) | Methods | Responsibilities |
| -------------- | ---------------- | ------- | ---------------- |
Maintenance Charge Calculation | SavingsAccount | Include  a public 3 argument constructor in the order -  customerName, accountNumber, balance |  |

Both the child classes CurrentAccount and SavingsAccount should override the calculateMaintenanceCharge(float noOfYears) method.

The calculateMaintenanceCharge(float noOfYears) should return the maintenance charge based on the number of years and the account type.

The Maintenance Charge needs to be calculated as shown below:

For Savings Account:  Maintenance Charge = (m * n) + 50

For Current Account:  Maintenance Charge = (m * n) + 200

Here, m is the base charge per year and n is the number of years. The base charge m, is Rs.50 for a Savings account and Rs.100 for a Current account. The number of years n, should be taken as input from the user as noOfYears.

Implement the calculateMaintenanceCharge method in the CurrentAccount and the SavingsAccount class based on the above assumption.

All class, interface and methods need to be public and attributes need to be private.

Write a class UserInterface with the main method to test the above functionality.

> Sample Input 1:

    1. Savings Account
    2. Current Account
    Enter your choice:
    2
    Enter the Account number
    123456789
    Enter the Customer Name
    Rohit
    Enter the Balance amount
    5000
    Enter the number of years
    2

> Sample Output 1:

    Customer Name Rohit
    Account Number 123456789
    Account Balance 5000.0
    Maintenance Charge for Current Account is Rs 400.0

--- 

> Sample Input 2:

    1. Current Account
    2. Savings Account
    Enter your choice:
    1
    Enter the Account number
    123456798
    Enter the Customer Name
    Rohini
    Enter the Balance amount
    5000
    Enter the number of years
    2

> Sample Output 2:

    Customer Name Rohini
    Account Number 123456798
    Account Balance 5000.0
    Maintenance Charge for Savings Account is Rs 150.0