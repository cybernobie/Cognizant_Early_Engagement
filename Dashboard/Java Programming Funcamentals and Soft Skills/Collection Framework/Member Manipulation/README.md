# Member Manipulation

Like the book details the district library wants to store the details about their members.So that it is easy to provide login credentials for those members to access books online. The application should be a menu driven. Develop an application to implement the scenario. 

You are provided with  a class Member with the following private attributes:

- int memberId
- String memberName
- String address

Necessary public getter and setter methods are provided.

A  no argument constructor and a 3 arguments constructor ( memberId, memberName and address) are also provided.

Create a class Library which has an  ArrayList of member as attribute as : 

- List<Member> memberList = new ArrayList<Member>().  

Write the getter and setter.

Also Library class should have the following methods :

- `public void addMember(Member memberObj)` - This method should add the memberObj to the memberList.
- `public List<Member> viewAllMembers()` - This method should return the memberList.
- `public List<Member> viewMembersByAddress(String address)` - This method should return the list of members who belong to that address.

Create a class Main which has the main method.  In the main function write the code to create the menu and invoke the needed functions based on the choice provided.

Design the UI as shown in the samples below.

> Sample Input and Output 1:

    1.Add Member
    2.View All Members
    3.Search Member by address
    4.Exit
    Enter your choice:
    1
    Enter the id:
    123
    Enter the name:
    sudha
    Enter the address:
    coimbatore
    1.Add Member
    2.View All Members
    3.Search Member by address
    4.Exit
    Enter your choice:
    1
    Enter the id:
    124
    Enter the name:
    kavin
    Enter the address:
    chennai
    1.Add Member
    2.View All Members
    3.Search Member by address
    4.Exit
    Enter your choice:
    1
    Enter the id:
    124
    Enter the name:
    vivek
    Enter the address:
    coimbatore
    1.Add
    2.Display
    3.Search by address
    4.Exit
    Enter your choice:
    2
    Id:123
    Name:sudha
    Address:coimbatore
    Id:124
    Name:kavin
    Address:chennai
    Id:124
    Name:vivek
    Address:coimbatore
    1.Add Member
    2.View All Members
    3.Search Member by address
    4.Exit
    Enter your choice:
    3
    Enter the address:
    coimbatore
    Id:123
    Name:sudha
    Address:coimbatore
    Id:124
    Name:vivek
    Address:coimbatore
    1.Add Member
    2.View All Members
    3.Search Member by address
    4.Exit
    Enter your choice:
    4

> Sample Input and Output 2:

    1.Add Member
    2.View All Members
    3.Search Member by address
    4.Exit
    Enter your choice:
    1
    Enter the id:
    123
    Enter the name:
    sudha
    Enter the address:
    coimbatore
    1.Add Member
    2.View All Members
    3.Search Member by address
    4.Exit
    Enter your choice:
    3
    Enter the address:
    chennai
    None of the member is from chennai
    1.Add Member
    2.View All Members
    3.Search Member by address
    4.Exit
    Enter your choice:
4

Sample Input and Output 3:

    1.Add Member
    2.View All Members
    3.Search Member by address
    4.Exit
    Enter your choice:
    2
    The list is empty
    1.Add Member
    2.View All Members
    3.Search Member by address
    4.Exit
    Enter your choice:
    4