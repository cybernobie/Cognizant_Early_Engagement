# Validate Name

Create a public functional interface Validate with  a method :

- public boolean validateName(String name);

Create a public class ValidateUtility with the below methods :

- public static Validate validateEmployeeName() – The lambda expression  for the validateName  method must return true if the name is valid and return false if the name is invalid. In this case, the name is valid if it contains alphabets and space and it should contain minimum 5 characters and maximum 20 characters.

- public static Validate validateProductName() – The lambda expression  for the validateName  method must return true if the name is valid and return false if the name is invalid. In this case, the name is valid if the first character is an alphabet followed by 5 digits.

Write the main method in ValidateUtility  class.

- Get the value for employee name and product name. 
- Invoke the validateEmployeeName method
- Capture the object of Validate returned by the static method.
- Invoke the validateName method for the employee name received as input  from the user.
- Display the result as shown in sample output. 
- Next, invoke the validateProductName method
- Capture the object of Validate returned by the static method.
- Invoke the validateName method for the product name received as input  from the user.
- Display the result as shown in sample output. 

**Note  :  Implement all the static methods mentioned above using lambda expression.  Don’t create object for the interface using new keyword.**

> Sample Input 1 :

    Pinky Rose
    A8546

> Sample Output 1 :

    Employee name is valid
    Product name is invalid

---

> Sample Input 2 :

    Rahul@123
    X82456

> Sample Output 2 :

    Employee name is invalid
    Product name is valid

