# Add Flight using JDBC

Zaro Flight System wants to automate the process in their organization.  As a start up, they need to automate the flight management system. Help them to develop this application.

You are provided with a public class Flight with following private attribute :

- int flightId
- String source
- String destination
- int noOfSeats
- double flightFare

Appropriate setter and getter are written.

A public 5 argument constructor with arguments – flightId, source, destination, noOfSeats and flightFare is also provided.   

Create a class FlightManagementSystem which has the following method.  Use Database for manipulation.

- `public  boolean addFlight(Flight flightObj)` -  This method should accept a flight object and add that flight details into the database. If flight details are added successfully, return true. Else, return false.

To connect to the database you are provided with database.properties file and DB.java file.

The flight table is already created at the backend. The structure of flight table is:

| Column Name | Datatype |
| ----------- | -------- |
| flightId | int |
| source | varchar(255) | 
| destination | varchar2(30) | 
| noofseats | int |
| flightfare | double |

Create a class Main which has main method to perform the above operation.

In main method, 

When addFlight method is invoked and if added successfully, print “Flight details added successfully” else print “Addition not done”.

To execute on your machine, you can make the necessary changes to the values of connection url, username and password in the database.properties  file.  