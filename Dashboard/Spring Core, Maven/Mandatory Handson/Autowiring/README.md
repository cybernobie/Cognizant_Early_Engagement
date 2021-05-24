# Autowiring

Create a class called Passport that has the below attributes:

| ------- | --- |
| passNum | int | 
| dateOfIssue | Date |
| dateOfExpiry | Date |

Create another class called Employee that has the below attributes                  

| ----- | --- |
| empId | int |
| empName | String |
| passObj | Passport |

All attributes, Getters and Setters are provided as a part of code skeleton.

The Passport object should be autowired above the property via annotations. Create a class called ApplicationConfig that has the required annotations for scanning and registering the bean definitions.

Create a class called Driver with the main method and write the logic to verify the correctness of your code. (Note: UI will not be tested).

## Design Constraints:

Employee and Passport class should be public and should be present in com.spring.app package
The className/Attribute Name/PackageName should be same as specified in the problem statement. Do not create any new packages.

Attributes should be private.

Do not create any XML configuration file. You need to use only annotations for configuration.