# Employee Salary Calculation

Create a class Employee with the following private member variables.

- int employeeId
- String employeeName
- double salary
- double netSalary

Include appropriate getters and setters method in Employee class. Write the following method in the Employee class:

`public void calculateNetSalary(int pfpercentage)`  - This method should take PF percentage as argument. Deduct the PF amount from the salary and set the netSalary.  

Create a Main class which has the main method which invokes the method to get the input and prints the details as shown in the sample. 

Also write a method :

- `public static Employee getEmployeeDetails()` -  which gets the employee details - id, name and salary, and returns the employee object.

- `public static int getPFPercentage()` -  which gets the PF percentage and returns the same

In the main method invoke the above two methods, and then call the calculateNetSalary method in Employee class and print the output as shown below.

> Sample Input 1:

    Enter Id:
    101
    Enter Name:
    Vivek
    Enter salary:
    20000
    Enter PF percentage:
    7

> Sample Output 1:

    Id : 101
    Name : Vivek
    Salary : 20000.0
    Net Salary : 18600.0
