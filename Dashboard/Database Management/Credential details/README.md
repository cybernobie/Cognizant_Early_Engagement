# Credential details

Refer to the schema. Write a query to display the username and password of all owners. Give an alias name as USERNAME and PASSWORD. Sort the result based on the username in ascending order.

Username and password is generated as mentioned below

USERNAME: concatenate the owner's name with owner id.

PASSWORD: concatenate first 3 character of owner name with owner id.

> For Example: 

    Owner_id - 01

    Owner_name - jeeva

> Sample Output:

    USERNAME	PASSWORD
    jeeva01	jee01


> HINT: Use Owners table to retrieve records.

*NOTE: Maintain the same sequence of column order, as specified in the question description*

![database diagram](../database_2.png)