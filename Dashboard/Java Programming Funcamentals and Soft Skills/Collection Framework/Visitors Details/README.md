# Visitors Details

VIP group of companies introduce a new shopping mall “Le Le” . To promote the mall they had approached  “6th Event” a famous commercial event organizer to organize an event of lucky draw. The organizer has to collect name, phone and email id of all the visitors during promotion time and give it to the company.

The organizer needs an automated application and wants to store records in a text file called “visitors.txt”. 

Records should to be stored in the following structure

Name1,phonenumber1,emailId1;Name2,phonenumber2,emailId2;

In a record, each attributes should be separated using comma (,) and records should be separated using semi colon (;). 

Create a Java Application which has two classes called Main.java and FileManager.java

In FileManager class implement the following methods [method skeletons are given]

- `static public File createFile()` – This method should create the file and return it.
- `static public void writeFile(File f, String record)` – In the method, first parameter is the file reference in which records to be added  and second parameter is a record, This record should append in the file. [Record should be as per the given format]
- `static public String[] readFile(File f)` – This method accept file to be read, returns all records in the file.

In Main class use the following Input and Output statements and call the needed methods from FileManager class to manipulate files.

> Sample Input Output: 

    Enter Name
    John
    Enter Phone Number
    1234567
    Enter Email
    johnpeter@abc.com
    Do you want to enter another record(yes/no)
    yes
    Enter Name
    Grace
    Enter Phone Number
    98765412
    Enter Email
    gracepaul@xyz.com
    Do you want to enter another record(yes/no)
    no
    John,1234567,johnpeter@abc.com
    Grace,98765412,gracepaul@xyz.com