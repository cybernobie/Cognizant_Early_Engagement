# Persist Employee

John is planning to conduct performance appraisal for all the employees who reports to him.  For that he plans to conduct the appraisal  and store the details in a file.  Help him to do this by writing a java program.

As he needs to preserve the details in File, use Streams in java.  To make the work easy, he needs to store all the data of employee as an employee object and also retrieve the details from the file as employee object.  So use the serialization concept to store and deserialization concept to retrieve the details.

To do this, you are provided with a class, Employee with private attributes

- int employeeId
- String name
- float  appraisalRating

Getters, setters and the parameterized constructor are also provided.

Create another public class EmployeeUtility which has the following methods :

- `public  boolean  addEmployee(String fileName,ArrayList<Employee>  employeeList)` -  This method should store all the employee objects in the list.  Store them in a file with the name provided as parameter.  Use serialization concept to preserve the employee details. Please ensure that you write the ArrayList directly in the file and not as individual objects

- `public Employee viewEmployeeById(String fileName,int employeeId)`  -  Use deserialization concept and read the employee objects from the file.  Return the employee with the Id provided as parameter.

Write a public class Main with the main method.  Use the main method to check the correctness of the above methods.