# Array Manipulation - Use try with multi catch

Tom wants to store the price details of the products that he purchased from the departmental store.  Help him do this by using the concept of Arrays.

To do this create a public class ArrayException with a method getPriceDetails as :

public String getPriceDetails() -  This method should do the following

Get the size of an array as input and then get the elements of the array(all elements are int) as input.

Next, user should provide the index of the array. This method should return the element at that index as “The array element is “+<that value>

This program may generate ArrayIndexOutOfBoundsException / InputMismatchException

In case of ArrayIndexOutOfBoundsException, the function should return “Array index is out of range”.

When providing the input, if the input is not an integer, it will generate InputMismatchException.  In this case the function should return “Input was not in the correct format”.

Use exception handling mechanism to handle the exception. Use separate catch block for handling each exception. In the catch block, return the appropriate message.

Write a main method and test the above function.

> Sample Input 1:

    Enter the number of elements in the array
    5
    Enter the price details
    50
    80
    60
    70
    40
    Enter the index of the array element you want to access
    1

> Sample Output 1:

    The array element is 80

---

> Sample Input 2:

    Enter the number of elements in the array
    2
    Enter the price details
    50
    80
    Enter the index of the array element you want to access
    9

> Sample Output 2:

    Array index is out of range
    Sample Input 3:
    Enter the number of elements in the array
    2
    Enter the price details
    30
    j

> Sample Output 3:

    Input was not in the correct format