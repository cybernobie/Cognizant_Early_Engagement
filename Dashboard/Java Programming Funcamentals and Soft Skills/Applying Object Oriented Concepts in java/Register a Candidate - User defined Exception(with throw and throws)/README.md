# Register a Candidate - User defined Exception(with throw and throws)

Geneva Technologies is planning to conduct a Walk-in interview. The interview has 4 levels. To attend the interview, the candidates need to register the following information:
Name, Gender and Expected salary.

Help him do this by writing a java program.

Partial code is provided.

You are provided with a public class Candidate with private attributes :

- String name
- String gender
- double expectedSalary

Appropriate getter and setters are provided.

You are provided with a public class Main.

Write a method getCandidateDetails as –

public static Candidate getCandidateDetails() – This method should get the candidate details, create the Candidate object using those details and return that object.

If the candidate’s expected salary is less than 10000

- throw a user defined exception as InvalidSalaryException with the message “Registration Failed. Salary cannot be less than 10000.” and return null.
- this method should throw / propagate InvalidSalaryException.

To do this, write a class InvalidSalaryException that inherits Exception class.

Write a constructor that takes a String as argument and set this string to the message attribute of the super class, Exception.

In the Main class, write the main method and test the method getCandidateDetails.

If it returns a valid Candidate object, then  display  “Registration Successful”.

Use a catch block to handle the exception that is returned by the method getCandidateDetails. In catch block display the message by using the getMessage() method.

> Sample Input 1:

    Enter the candidate Details
    Name
    Margrett
    Gender
    Female
    Expected Salary
    50000

> Sample Output 1:

    Registration Successful

---

> Sample Input 2:

    Enter the candidate Details
    Name
    Robin
    Gender
    Male
    Expected Salary
    5000

> Sample Output 2:

    Registration Failed. Salary cannot be less than 10000.    