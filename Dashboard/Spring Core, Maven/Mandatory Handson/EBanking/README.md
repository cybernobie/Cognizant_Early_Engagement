# E-Banking

Purpose of this exercise is to simulate a banking process which provides below functionalities:

1. Create Current Account and do deposit and withdraw functions.
2. Create Fixed Deposit Account and calculate the maturity amount based on depositand tenure
3. Create Recurring Deposit Account and calculate the maturity amount based ondeposit and tenure.

## Technical Requirement

> BankAccount.java

```
public abstract class BankAccount {
    private int customerId;
    private String name;
    private double balance;
    private List<String> accounts;

    // Constructor

    // Getter - Setter

    public double doDeposit(double amount) {
        // deposite
    }

    public double doWithdraw(double amount) {
        // withdraw
    }

    public abstract double calculateFixedAccount(double amount, int months);

    public abstract double calculateRecurringAccount(double amount, int months);
}
```

> SmartBankAccount.java

```
public class SmartBankAccount extends BankAccount {
    // Constructor

    // Override calculateFixedAccount

    // Override calculateRecurringAccount
}
```

**Step 1**: Create an abstract class BankAccount with below mentioned private membervariables and public methods:
customerId int
name String
balance double
accounts List<String>

Define a public parameterized constructor with all the above variables in the same orderof parameters, along with getter and setter methods.

| Specifier/Modifier | Method Name | Input Parameters | Output Parameters | Logic |
| ------------------ | ----------- | ---------------- | ----------------- | ----- |
| public | doDeposit | double amount | double | This method acceptsamount as parameter and adds amount to balance and returns balance |
| public | doWithdraw | double amount | double | This method accepts amount as parameter and deducts amount from balance and returns balance | 
| Public abstract | calculateFixedAccount | double amount, int months | double | This method takesamount and months asparameters andcalculates fixed maturityamount and returns it |
| Public abstract | calculateRecurringAccount | double amount, int months | double | This method takesamount and months asparameters andcalculates recurringmaturity amount and return it. |

## Business Rules:

| Methods | Business |
| ------- | -------- |
| ConditioncalculateFixedAccount | Amount should be greater than 9999 and less than 1000001 and tenure should be less than 121 months and greater than 0. Return should be format to 2 decimal places.Hint :Use DecimalFormat API |
| calculateRecurringAccount | Amount should be greater than 999 and less than 50001 andtenure less than 61 months and greater than 0. Return shouldbe format to 2 decimal places.Hint :Use DecimalFormat API |

*BankAccount class* should be registered as a bean as ‘abstract= true’ with the spring containervia XML file.

Create class SmartBankAccount which extends BankAccount and giveimplementation for abstract methods calculateFixedAccount and calculateRecurringAccount.Use below formulas to calculate fixed deposit and recurring deposit .For fixed deposit interest isfixed at 10% and for recurring deposit interest is fixed at 7%.

*SmartBankAccount* class should be registered as a bean with the spring container via XML filewith bean id as smartBankAccount.

The values for all the attributes should be injected via constructor based injection , the defaultcustId should be 100, name should be ‘Joe’, balance should be 10000, accounts should be a listcontaining values “CurrentAccount”, “RecurringAccount”, “FixedAccount”. Values of listshould be fetched from properties file called accounts.properties using property configurationconcept by creating a bean of PropertyPlaceholderConfigurer in spring container via XML file.

> accounts.properties 

| Key | Value |
| --- | ----- |
| Current | CurrentAccount |
| Recurring | RecurringAccount |
| Fixed | FixedAccount |

*Fixed Amount* : A=P(1 + r/n) ^ nt

A=final amount, P=initial principal balance, r=interest rate, n=number of times interest appliedper time period, t=number of time periods elapsed

e.g: p=10000, r=10%=0.1, n=12, t=60

result = 10000 * ((1 + (o.10) / 12) ^ (12*(60/12)))

A = 16453.09

*Recurring Amount*: `(P*n)+(P(n(n+1)/(2*12))*(r/100))`

P=initial principal balance, r=interest rate, n=number of times interest applied per time period

e.g: p=10000, r=7%, n=12

result = `(10000*12) + (10000(12(12+1)/24)*(0.07))` = 124550.00

> Sample Input Output 1:

    Welcome Mr/Ms: Joe
    Your customer id is :100
    Please select account type
    1 CurrentAccount
    2 RecurringAccoun
    3 FixedAccount
    1
    Select transaction type
    1.Deposit
    2.Withdraw
    1
    Enter amount to be deposited
    10000
    Your balance amount is 20000.00

> Sample Input Output 2:

    Welcome Mr/Ms: Joe
    Your customer id is :100
    Please select account type
    1 CurrentAccount
    2 RecurringAccoun
    3 FixedAccount
    1
    Select transaction type
    1.Deposit
    2.Withdraw
    2
    Enter amount to be withdrawn
    5000
    Your balance amount is 5000.00

> Sample Input Output 3:

    Welcome Mr/Ms: Joe
    Your customer id is :100
    Please select account type
    1 CurrentAccount
    2 RecurringAccoun
    3 FixedAccount
    2
    Enter monthly installment
    15000
    Enter tenure in months
    10
    Your balance after 10 months will be 154812.50

> Sample Input Output 4:

    Welcome Mr/Ms: Joe
    Your customer id is :100
    Please select account type
    1 CurrentAccount
    2 RecurringAccount
    3 FixedAccount
    3
    Enter FD amount
    100000
    Enter tenure in months
    36
    Your balance after 36 months will be 134818.18