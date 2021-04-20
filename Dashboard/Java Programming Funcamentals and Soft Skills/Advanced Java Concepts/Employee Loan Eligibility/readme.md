## Employee Loan Eligibility

One of the major nationalized banks in the country offers a loan scheme based on the monthly salary to private sector employees. The minimum eligibility to avail this loan scheme is that the applicant must have a certain amount of salary as their minimum income per month. This minimum salary varies depending on the category of business.  So, the bank is in need of an application to segregate the employee details. Help them by developing an application which takes all employee details as input and displays the shortlisted employee details as output.

 You are provided with a code template which includes the following classes:

·         Employee class which includes the attributes empId, empName and salary with all getters and setters.

·         EmployeeUtility class which includes the public Employee[] getEmployeeDetails (String[] details) method, the public Stream<Employee> getStreamOfEmployee (Employee[] empDetails) method and the public String[] shortlistedEmployee (Stream<Employee> empStream, Double minSalary) method declarations.

·         A main class with a main method which includes the entire user interface for this application.

 Functional Requirements:

1.      Enclose your code in the getEmployeeDetails method to convert the employee details from the array of Strings to the array of Employee objects.

2.      Enclose your code in the getStreamOfEmployee method to convert the employee details from the array of Employee to the Stream of Employee.

3.      Enclose your code in the shortlistedEmployee method to segregate the employee details that have at-least the minimumSalary value as their salary and return the sorted order of employee details based on empId as a String array.

 User Interface Requirements:

·         All the User Interface requirements will be provided in the code template itself. Adhere to the code template. Enclose your code in the respective required blocks of the EmployeeUtility class alone.

Note:

·         The input format for each employee details is “<empId;empName;salary>”

·         The Output format for each employee details is “<empId> <empName> <salary>”

·         The empId may start with a numerical value or an alphabet as given in sample input and assume that all the empIds are unique. The output should be in ascending order based on the empId.

·         Do not edit or delete the codes provided in the code template.

·         Adhere to the Sample Inputs/ Outputs.

·         In the Sample Inputs/ Outputs provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.

 







Sample Input 1:

Enter the number of Employees

5

Enter the details of Employees

100;Adonis;25000

104;Andres;20000

103;Sai Shankar;35000

101;James;50000

102;Jack;30000

Enter the minimum eligible salary

30000

Sample Output 1:

Shortlisted Employees are

101 James 50000.0

102 Jack 30000.0

103 Sai Shankar 35000.0

 Sample Input 2:

Enter the number of Employees

10

Enter the details of Employees

A100;Antony;27000

B104;Akbar;26000

100;Adonis;25000

104;Andres;17000

A103;Sophia;20000

103;Sai Shankar;35000

C101;Harry;20000

B102;Grace;30000

101;James;15000

102;Jack;30000

Enter the minimum eligible salary

25000

Sample Output 2:

Shortlisted Employees are

100 Adonis 25000.0

102 Jack 30000.0

103 Sai Shankar 35000.0

A100 Antony 27000.0

B102 Grace 30000.0

B104 Akbar 26000.0

 Sample Input 3:

Enter the number of Employees

4

Enter the details of Employees

C101;Harry;20000

B102;Grace;30000

101;James;15000

102;Jack;30000

Enter the minimum eligible salary

35000

Sample Output 3:

No Employee is having the required salary