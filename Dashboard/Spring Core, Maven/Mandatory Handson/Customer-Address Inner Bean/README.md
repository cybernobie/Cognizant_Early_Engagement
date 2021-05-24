# Customer-Address Inner Bean

Create an AddressBook class with the below private attributes

|   |   |
| - | - |
| phoneNumber | String |
| tempAddress | Address |

Include getter and setter methods for all the above attributes.

Create an Address class with the private attributes

|   |   |
| - | - |
| houseName | String | 
| street | String | 
| city | String |
| state | String | 

Include getter and setter methods for all the above attributes.

AddressBook should be registered as a bean with the spring container via XML file

Address is used for only particular property , so Address should be declared as a inner bean

to AddressBook.

Address should be injected into AddressBook via Constructor based Injection

Create a class called Driver with the below methods
 - **loadAddressBook** --> This method should fetch the AddressBook object from applicationContext.xml and return the same    
 - **main method** -->  Inside the main method invoke the loadAddressBook and obtain the AddressBook object.<br>Get the Temporary Address details and the phone Number from the user, set the values and display the  temporary address and phone number in the main method.

## Design Constraints:

Address class should be present in com.spring.app package

AddressBook class should be present in com.spring.app package

Driver class should be present in com.spring.ui package

The className/Attribute Name/PackageName should be same as specified in the problem statement. Do not create any new packages.

The XML configuration should be done in the file applicationContext.xml. This XML should be available under the resources folder of the created maven project.

> Sample Input

    Enter the temporary address
    Enter the house name
    Heritage
    Enter the street
    63 West
    Enter the city
    New York
    Enter the state
    United States
    Enter the phone number
    9874561230

> Sample output

    Temporary address
    House name:Heritage
    Street:63West
    City:New York
    State:United States
    Phone number :9874561230