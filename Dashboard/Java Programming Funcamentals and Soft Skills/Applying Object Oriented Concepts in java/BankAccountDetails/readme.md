BankAccountDetails
In the first round of HR interview for a banking sector,  HR decides to make candidates design an application which provides only  information on transaction like amount withdrawn with respect to fields given. Develop a program to implement this scenario. 

Create a class Account with the private attributes: 

accountId  int
accountType String 
balance int
The method public boolean withdraw(int) used  to calculate the current balance of the respective account. Before that it should enough balance.  If there is enough balance, deduct the amount from the balance and print "Balance amount after withdraw: XXX" and return true.  If there is no enough balance, print "Sorry!!! No enough balance" and return false. 

Create a class AccountDetails with main function and the below methods :

public Account getAccountDetails() -  This methods gets the input related to Account from the user and returns the Account object with all values set.  If the input given for balance is less than or equal to zero, consider it as invalid and display "Balance should be positive". Continue this kind of evaluation till user enters a positive value.

public int getWithdrawAmount() -  This methods gets the amount to be withdrawn as input from the user and returns the same.  If the input given for amount is less than or equal to zero, consider it as invalid and display "Amount should be positive". Continue this kind of evaluation till user enters a positive value.
Use appropriate getters and setters.

Sample input 1:

Enter account id:

100
Enter account type:

Savings

Enter balance:

10000
Enter amount to be withdrawn:

500

Sample Output 1:

Balance amount after withdraw: 9500

Sample input 2:
Enter account id:

101
Enter account type:

Savings
Enter balance:
1000
Enter amount to be withdrawn:
1500

Sample Output 2:

Sorry!!! No enough balance



Sample input 3:

Enter account id:

100

Enter account type:

Savings

Enter balance:

-100

Balance should be positive

Enter balance:

5000

Enter amount to be withdrawn:
500

Sample Output 1:

Balance amount after withdraw: 4500

