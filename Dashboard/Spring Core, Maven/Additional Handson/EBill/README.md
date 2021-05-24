# EBill (Unsolved)

## Business Scenario

Electricity consumption is recorded in terms of kWh or Units from the electricity meter installed in the premise. A person from the electricity provider records the current reading and subtracts it from previous reading to calculate the current period consumption.

You are required to develop a Spring JDBC application to view such electricity consumption records and delete some. Detailed descriptions given below.

## Skeleton Details:

Following classes/interfaces fully implemented as part of the skeleton,

- com.cts.handson.AppConfiguration
- com.cts.handson.model.EBill
- com.cts.handson.util.DateUtil
- SQL file to create database & table

## Functional Requirements:

The application has the below classes and methods to be implemented by you.

| Class | Method(s) | Responsibilities | Exception |
| ----- | --------- | ---------------- | --------- |
| EBillDAO | `void deleteBill(long… billNumbers)` | Accepts one or more bill numbers as varArgs.<br>In try block, it iterates bill numbers and delete records from the EBILL table if the bill number >= 100<br>After successful transaction, the transaction manager commits entire transaction. | If any bill number is less than 100, throw new Exception() and rollback() entire transaction in catch block. | 
| EBillDAO | `List<EBill> getAllBill()` | Uses BeanPropertyRowMapper and returns EBILL table records as list |  |
| ElectricityBillApplication | main() | Get EBillDAO bean<br>Using dao, delete records (eg. 100, 99)<br>Using dao, retrieve and display all EBills |  |