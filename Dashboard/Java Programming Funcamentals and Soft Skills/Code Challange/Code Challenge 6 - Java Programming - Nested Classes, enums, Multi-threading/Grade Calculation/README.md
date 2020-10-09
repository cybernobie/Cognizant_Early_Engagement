# Grade Calculation

Rita is working as a science teacher in an International school. She is the Class Teacher of class V and was busy in calculating the grade for each student in her class, based on his/her total marks obtained in SA1 assessment.

Since she found it very difficult to calculate the grade, she approached you to develop an application which can be used for completing her task faster.  You need to implement a java program using thread to calculate the grade for each student. Student details should be obtained from the user in the console.

## Requirement 1: Calculate the grade for each student.

Calculate the grade based on total marks (sum of all marks) as shown below obtained by each student and set the same in result attribute for respective student.

| Total Marks | Grade | 
| ----------- | ----- |
| 400 to 500 | A |
| 300 to 399 | B |
| 200 to 299 | C |
| Less than 200 | E |

### Assumption: 

Each student will have only five subjects and marks of each subject will be greater than or equal to 0 and lesser than or equal to 100. Hence the maximum Total marks obtained by each student will be 500. And the minimum Total marks obtained by each student will be 0.

## Component Specification: GradeCalculator (Thread Class)

| Component Name | Type(Class) | Attributes | Methods | Responsibilities | 
| -------------- | ----------- | ---------- | ------- | ---------------- |
|  | GradeCalculator | String studName<br>char result<br>int[] marks | Include getters and setter method for all the attributes.<br>Include a two argument constructor in the given order – studName and marks. | Set the values for all the attributes via constructor. | 
| calculate the grade for each student | GradeCalculator |  | public void run() | Calculate the grade based on total marks and set the same to result attribute. | 


### Note: 

The class and methods should be declared as public and all the attributes should be declared as private.

Create a class called Main with the main method and get the inputs like number of threads and Student details from the user.

The student details will be in the form of String in the following format studName:mark1:mark2:mark3:mark4:mark5.

Parse the student details and set the values of studName and marks attributes in GradeCalculator thread class using constructor.

Invoke the GradeCalculator thread class to calculate the grade based on total marks and set the same to result attribute.

Display the Student name and Grade obtained by each student as shown in the sample input and output.

> Sample Input / Output 1:

    Enter the number of Threads:
    4
    Enter the String:
    Jeba:100:80:90:40:55
    Enter the String
    David:10:8:9:40:5
    Enter the String
    Adam:90:80:90:50:75
    Enter the String
    Rohit:99:99:99:99:99
    Jeba:B
    David:E
    Adam:B
    Rohit:A

    4
    Jeba:100:80:90:40:55
    David:10:8:9:40:5
    Adam:90:80:90:50:75
    Rohit:99:99:99:99:99

    1
    Jeba:100:80:90:40:55