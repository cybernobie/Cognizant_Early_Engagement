# Insurance Bazaar

Insurance Bazaar is developing an online website for showcasing various types of Insurance policies to their customers based on their needs. There are various types of Insurances provided by different insurance agencies. The admin of Insurance Bazaar wants to add different insurance policy names like Max Bupa Health Insurance, SBI Health Insurance, IFFCO Tokio Two Wheeler Insurance and New India Assurance Two Wheeler Insurance to his database with Policy ID as the Tags.

Customers can view the names of all the polices available in Insurance Bazaar based on the type of insurance.

Write a Java program to simulate this scenario. Key (Policy ID) should be an Integer and Value (Insurance policy name) should be a String. The key-value should be sorted based on the key. Use the appropriate Collection to Store all these details and display.

The addPolicyDetails method should add the Policy ID and the Policy name into the appropriate map.

The searchBasedOnPolicyType method should return the list of Insurance policy ID depending on the input provided. This method takes the input as string (Input can be either Health or Two Wheeler).

The signature of the above functions are given as part of code skeleton, do not change the function signature.

Sample Policy ID and policy names:

| Policy ID | Policy names |
| --------- | ------------ |
| 10654 | Max Bupa Health Insurance |
| 10321 | SBI Health Insurance |
| 20145 | IFFCO Tokio Two Wheeler Insurance |
| 20165 | New India Assurance Two Wheeler Insurance |
| 10110 | Reliance Health Insurance |

> Sample Input and Output1

    Enter the no of Policy names you want to store
    5
    Enter the Policy ID
    10654
    Enter the Policy Name
    Max Bupa Health Insurance
    Enter the Policy ID
    10321
    Enter the Policy Name
    SBI Health Insurance
    Enter the Policy ID
    20145
    Enter the Policy Name
    IFFCO Tokio Two Wheeler Insurance
    Enter the Policy ID
    20165
    Enter the Policy Name
    New India Assurance Two Wheeler Insurance
    Enter the Policy ID
    10110
    Enter the Policy Name
    Reliance Health Insurance
    10110 Reliance Health Insurance
    10321 SBI Health Insurance
    10654 Max Bupa Health Insurance
    20145 IFFCO Tokio Two Wheeler Insurance
    20165 New India Assurance Two Wheeler Insurance
    Enter the policy type to be searched
    Two Wheeler
    20145
    20165

--- 

> Sample Input and Output2

    Enter the no of Policy names you want to store
    4
    Enter the Policy ID
    10654
    Enter the Policy Name
    Max Bupa Health Insurance
    Enter the Policy ID
    10321
    Enter the Policy Name
    SBI Health Insurance
    Enter the Policy ID
    20145
    Enter the Policy Name
    IFFCO Tokio Two Wheeler Insurance
    Enter the Policy ID
    20165
    Enter the Policy Name
    New India Assurance Two Wheeler Insurance
    10321 SBI Health Insurance
    10654 Max Bupa Health Insurance
    20145 IFFCO Tokio Two Wheeler Insurance
    20165 New India Assurance Two Wheeler Insurance
    Enter the policy type to be searched
    Health
    10321
    10654