# Product Billing Application

A TakeHome company requires billing software for its super market wheredifferent types of products are sold to the customers on retail basis.

This billing software should help

1. The cashier to see the product information by entering the product code
2. Calculate the total cost for each product based on the quanity
3. Display the final bill to user
4. Throw exception for invalid details


## Technical Requirements:-

### Requirement 1:Database design

Use createScripts.sql file for the database requirement

### Requirement 2:Bean class

Create a Product bean class(com.cts.bean) with following members.

| Variable Name | Data type |
| ------------- | --------- |
| product_code | Int |
| product_name | String |
| product_category | String |
| product_description | String |
| product_price | double |

### Requirement 3:DAOInterface

Write a ProductDao interface (com.cts.dao) with following members.

| Interface Name | Method Name Input | Parameters | Output Parameters |
| -------------- | ----------------- | ---------- | ----------------- |
| ProductDao | getProductDetails() | Int | product_code | Product |

### Requirement 4:DAO class implantation

Write a ProductDaoImpl class (com.cts.dao) which implements

ProductDao interface with following members.

| Class Name | Method Name | Input Parameters | Output Parameters | Logic |
| ---------- | ----------- | ---------------- | ----------------- | ----- |
| ProductDao Impl | getProductDetails | Int product_code | Product Query to DB `select a product by product_code` using jdbcTemplte.<br>queryForObject() method and return the object. |

### Requirement 5:Service class Impl

Write a ProductService class (com.cts.service) which has following members.

| Class Name | Method Name | Input Parameters | Output Parameters | Logic |
| ---------- | ----------- | ---------------- | ----------------- | ----- |
| ProductService | getProductDetails | Int product_code | Product | Invoke the ProductDao getProductDetails() return the object. |
| ProductService | calculatePrice() | int quantity, double product_price | double | Use quantity and pricecalculate the total amountand return the value. |
| ProductService | validateProductCode() | int product_code | boolean | Check product_codeshould be > 0 and 4 digitnumber return true else return false | 
| ProductService | validateQuantity() | int quantity | boolean | Check quantity should be>0 return true else return false |

### Requirement 6:Exception Class

Write a BillingException class (com.cts.service) which extends Exception classraise
the exception as per the requirement.

### Requirement 7:MainClass

In main method class to test your application. Use switch case to perform as per
requirement.

**Note**: Throw exception called BillingException with appropriate error message for the
following cases and get input until user enters the valid information

- Quantity should not be lesser than or equal to zero otherwise raise the exception
- Product code should be 4 digit positive number otherwise raise the exception

> Sample Input Output

    1. Generate Bill by entering code and quantity
    2. Exit
    1
    Enter product_code
    Invalid product_code, it should be >0 and 4 digit +ve number
    896
    Invalid product_code, it should be >0 and 4 digit +ve number
    Enter product_code
    -75
    Invalid product_code, it should be >0 and 4 digit +ve number
    Enter product_code
    0
    Invalid product_code, it should be >0 and 4 digit +ve number
    Enter product_code
    1002