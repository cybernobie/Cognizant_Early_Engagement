# Array Compatiblilty

Two arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to the ith element in the second array for all i elements.If the array size is zero or lesser then display the message "Invalid array size".Write a Java program to find whether 2 arrays are compatible or not.If the arrays are compatible display the message as "Arrays are Compatible" ,if not then display the message as "Arrays are Not Compatible". 

> Sample Input 1:

    Enter the size for First array:
    5
    Enter the elements for First array:
    5
    14
    17
    19
    15
    Enter the size for Second array:
    5
    Enter the elements for Second array:
    2
    5
    9
    15
    7

> Sample Output 1:

    Arrays are Compatible

---

> Sample Input 2:

    Enter the size for First array:
    3
    Enter the elements for First array:
    1
    4
    7
    Enter the size for Second array:
    5
    Enter the elements for Second array:
    2
    5
    9
    5
    7

> Sample Output 2:

    Arrays are Not Compatible

---

> Sample Input 3:

    Enter the size for First array:
    -2

> Sample Output 3:

    Invalid array size