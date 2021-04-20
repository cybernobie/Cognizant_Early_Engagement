# Auditing


Lego is a famous company in the city. The company is due for auditing in the upcoming days. During the auditing details of the employees will be verified, but only for selected employees.  Manually collecting the details will be difficult. So help them to print the details of the employees as per the requirement. The details of the employees need to be printed according to their salary.

Help them to write a java program to find the employees whose salary is less than or equal to the salary specified by the auditors using Lambdas.



- Requirement 1: Find the employee details

Lego company wants to identify the employees whose salary is less than or equal to the salary specified by the auditors. By using the method fetchEmployeeDetails, identify the employees whose salary is less than or equal to the salary specified by the auditors.

type: EmployeeAudit

methods: public ArrayList<String> fetchEmployeeDetails (double salary)

Responsibilities: This method is used to identify the employees whose salary is less than or equal to the salary passed as an argument by using Lambda expressions.



- Component Specification: Main Class

·         Add the employee details using a Map which holds the key as Employee name and value as Employees’ salary. Where the map is given as a private attribute with the getters and setters as a part of the code skeleton.

·         Then implement the method public static EmployeeAudit findEmployee() which holds the employee details using Lambda Expressions.


Obtain Employee Details

Main

public void addEmployeeDetails(String employeeName, double salary)

This method is used to add the employee details into a map.

Obtain Employee Details

Main

public static EmployeeAudit findEmployee()

This method should return an EmployeeAudit object. To do this, implement the Lambda expression and identify the employees whose salary is less than or equal to the salary passed as an argument.



If the returned list is empty, then display “No Employee Found“.

Use appropriate collections to perform the above tasks.

The signature of the above methods is given as part of the code skeleton, do not change the method signature.

In the Main class create a Main method with the menu as described in the sample Input and Output. When the user selects option 1. Add Employee details, add the employeeName and salary to the employeeMap.

When the user selects option 2. Find Employee details, it should display the employee name returned by the findEmployee method of Main class. If no employee is present, then it should display ” No Employee Found“.

When the user selects option 3. Exit, display the message "Let’s complete the session" and terminate the program.

Don’t create an object for EmployeeAudit. Use the lambda expression.

In the Main class write the Main method and perform the given steps :

•   Get the details of the Employees.

•   Invoke the static method in the Main to identify whose salary is less than or equal to the salary specified

•   Capture the object of EmployeeAudit returned by the static method.

•   Display the result as shown in the sample output.

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.

Ensure to follow the object oriented specifications provided in the question.

Ensure to provide the names for classes, attributes and methods as specified in the question.

Adhere to the code template, if provided.

Sample Input and Output:

1.Add Employee Details

2.Find Employee Details

3.Exit

 Enter the choice

 1

 Enter the Employee name


Faruq

Enter the Employee Salary

10000

1.Add Employee Details

2.Find Employee Details

3.Exit

 Enter the choice

1

Enter the Employee name

Benny

Enter the Employee Salary

20000

1.Add Employee Details

2.Find Employee Details

3.Exit

Enter the choice

2
Enter the salary to be searched

15000

Employee List

Faruq

1.Add Employee Details

2.Find Employee Details

3.Exit

Enter the choice

3

Let's complete the session

