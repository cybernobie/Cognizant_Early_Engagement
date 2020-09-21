# Vehicle-Loan-Insurance - Use Interface

Universal Loan and Insurance Providers is one of the fastest growing organization.   It needs to automate the transactions performed in the organization.  They need to automate the process of issuing loan and insurance coverage for vehicles.

Partial code is provided to do this. Don’t change the skeleton. Do the additions wherever necessary.

You are provided with a public class Vehicle with private attributes :

- String vehicleNumber
- String modelName
- String vehicleType
- double price

Appropriate public getters and setters are already written.

You are also provided with a 4 argument constructor with arguments –vehicleNumber, modelName, vehicleType and price.

**Note that the vehicleType can take the values as “4 wheeler” or “3 wheeler” or “2 wheeler”.**

Write a public interface Loan  with an abstract method “double issueLoan()”.

Write a public interface Insurance with an abstract  method “double takeInsurance ()”.

The above class Vehicle should implement the Interfaces Loan and Insurance.

Provide the implementation for issueLoan method based on the type of Vehicle.

If the vehicleType is “4 wheeler”,  the eligible loan amount is 80% of its price.

If the vehicleType is “3 wheeler”,  the eligible loan amount is 75% of its price.

If the vehicleType is “2 wheeler”,  the eligible loan amount is 50% of its price.

Provide the implementation for takeInsurance based on price of vehicle.

If the vehicle price is less than or equal to 150000 insurance amount is 3500.

If the vehicle price is greater than 150000 and less than or equal to 300000 insurance amount is 4000.

If the vehicle price is greater than 300000 insurance amount is 5000.

You are provided with a public class Main which has the main method.  

Check the correctness of the methods written in these classes.

