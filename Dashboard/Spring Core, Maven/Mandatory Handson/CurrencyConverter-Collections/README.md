# CurrencyConverter-Collections

Susan created a  java application for currency converter. Later she got familiar with  spring core using Maven and wanted to use the features of it to make her application loosely coupled. Create a class called CurrencyConverter that has the following attribute:

|  |  |
| ---- | ------------------ |
| mObj | Map<String,String> |


Map that holds currencyName and the conversion rate. The map needs to be configured in the xml and injected into 
the CurrencyConverter via setter based injection. Write a method called getTotalCurrencyValue that accepts a String. 
The string contains the total currency and the currencyName.  For ex: “7Dollar”. The method needs to parse the string 
and depending on the user input fetch the appropriate currency value from the xml file calculate the total rate 
and return the result back to the user.

Suppose if the user has entered a value “5Dollar”,  then the output should be 325.    

The map values in the xml file for various currencies are as follows:

|  |  |
| --- | --- |      
| DOLLAR | 65 | 
| EURO | 80 |
| DINAR | 218 |

## Design Constraints:

CurrencyConverter class should be present in com.spring.app package

Maintain the same className/Attribute Name/PackageName as specified in the problem statement. Do not create any new packages.

All the configuration should be done in the file named "beans.xml" in the created maven project