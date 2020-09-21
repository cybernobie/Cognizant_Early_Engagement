# Contact Details of Hosteller

SNMR College of Engineering and Technology wants to create an application to store their students details as well as the details of hostellers.

In case of any changes to be made to the attributes,  admin can update the details like room number and phone number of the hosteler.

Develop a program to implement this scenario.

Create a public class Student with  protected attributes :

- int studentId
- String name
- int departmentId
- String gender
- String phone

Create a public class Hosteller with private attributes

- String hostelName
- int roomNumber

Make this class inherit the Student class, as it holds all the properties of Student. 

Use appropriate public getters and setters for both the classes.

Write a class Main with the main function.

In Main class get the input of the hosteller using the method :

`public static Hosteller getHostellerDetails().`

Invoke this method from the main method and then modify the room number and phone number, if needed.

> Sample Input 1:

    Enter the Details:
    Student Id
    1
    Student Name
    John
    Department Id
    101
    Gender
    Male
    Phone Number
    9876543210
    Hostel Name
    YMCA
    Room Number
    10
    Modify Room Number(Y/N)
    Y
    New Room Number
    11
    Modify Phone Number(Y/N)
    Y
    New Phone Number
    9876543121

> Sample Output 1:

    The Student Details
    1 John 101 Male 9876543121 YMCA 11

---

Sample Input 2:

    Enter the Details:
    Student Id
    2
    Student Name
    John Paul
    Department Id
    112
    Gender
    Male
    Phone Number
    9885526536
    Hostel Name
    YMBA
    Room Number
    5
    Modify Room Number(Y/N)
    N
    Modify Phone Number(Y/N)
    N

> Sample Output 2:

    The Student Details:
    2 John Paul 112 Male 9885526536 YMBA 5

