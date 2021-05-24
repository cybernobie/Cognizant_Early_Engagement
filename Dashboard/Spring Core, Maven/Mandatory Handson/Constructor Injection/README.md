# Constructor Injection

Create a class called Customer that has the below attributes
|  |  |
| ------ | --- |
| custId | int |
| custName | String |
| emailId | String | 
| contactNo | long |

Create another class  MemberShip that has the below attributes 

|  |  |
| ------------ | --- |
| membershipId | int |
| membershipType | String |
| visitsPerYear | int |
| customer | Customer |

Attributes should be private.

Customer has to set to the membership via constructor injection in the XML file. 

Create a class called Driver with the main method and write the logic to get input from the user such as the customer details, membership details and display the details to verify the correctness of your code. (Note: UI will not be tested).

## Design Constraints

Customer class and the MemberShip class should be present in com.spring.app package.

Write  appropriate getters and setters and constructors

The className/Attribute Name/PackageName should be same as specified in the problem statement. Do not create any new packages.

The XML configuration should be done in the file applicationContext.xml. This XML should be available under the resources folder of the created maven project.
The Customer bean in the applicationContext.xml should have id value as "custObj"