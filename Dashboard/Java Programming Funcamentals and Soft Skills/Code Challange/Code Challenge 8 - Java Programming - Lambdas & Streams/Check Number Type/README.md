# Check Number Type

Samir wants to play a mind game with his father. The game is – when Sameer calls out a number his father should say whether that number is odd or even. Since his father doesn't like Mathematics much he needs some help to play the game.

Help his father to identify whether the called out number is odd or even by using the Lambda Expressions.

## Requirement 1: Check the Number Type

Samir's father has to identify whether the number is odd or even. By using the method checkNumberType the given number is identified as odd or even.

### Component Specification: NumberType Interface – This is a Functional Interface.

| Type(Interface) | Methods | Responsibilities |
| --------------- | ------- | ---------------- | 
| NumberType | public boolean checkNumberType(int number) | This method is used to check whether the number  passed as argument is odd or not.

### Component Specification: NumberTypeUtility Class

| Component Name | Type(Class) | Methods | Responsibilities | 
| -------------- | ----------- | ------- | ---------------- | 
| Check Number Type | NumberTypeUtility | public static NumberType isOdd() | This method is a static method which returns true if the number passed as parameter is odd, else return false. |

Don’t create an object for NumberType. Use the lambda expression.
In the NumberTypeUtility class write the main method and perform the given steps :

Get the value for a number.

Invoke the isOdd method

Capture the object of NumberType returned by the static method.

Invoke the checkNumberType method for the number received as input  from the user.

Display the result as shown in the sample output.

> Sample Input 1 :

    58

> Sample Output 1 :

    58 is not odd

---

> Sample Input 2 :

    77

> Sample Output 2 :

    77 is odd