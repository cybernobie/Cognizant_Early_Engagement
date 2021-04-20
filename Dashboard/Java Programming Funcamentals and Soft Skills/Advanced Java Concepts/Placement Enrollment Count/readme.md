## Placement Enrollment Count







A university organizes a placement drive in which students from all departments can participate. Each student has to register to this drive by submitting their roll number. The placement coordinator who organizes this event approaches you to develop an application to get the collection of registered student roll numbers which is separated by a comma and display the number of students based on the department. 

All roll numbers are provided in a format in which the first two characters represent the department name through its acronym.

You are provided with a code template which includes the following class:

·         Main class with main method declaration, public static Stream<String> getRollNumbers(String rollNumbers) method declaration and public static int getCount(Stream<String> rollNumberStream, String deptAcronym) method declaration.

Functional Requirements:

1.      Enclose your code in the getRollNumbers method to separate each roll number from the bunch of rollNumbers provided with comma separated values. Convert the separated roll numbers into a Stream<String> and return the Stream.

2.      Enclose your code in the getCount method to return the number of registered students from a particular department by comparing the rollNumberStream with deptAcronym (case insensitive).

3.      Enclose your code in the main method to get the collection of comma separated roll numbers as a String and pass it to the getRollNumbers method to receive the Stream of roll numbers. Also, get the department name acronym as a string and pass it along with the received Stream of roll numbers to the getCount method to receive the number of students registered from that department.

User Interface Requirements:

·         Display “Enter all roll numbers separated by comma” to get the collection of roll numbers.

·         Display “Enter the department name acronym” to get the department name acronym.

·         Display the number of registered students from the given department as “Number of students in <department name acronym> is <count>”

·         If there is no roll numbers with the given department name acronym, then display “No students from <department name acronym>”

Note:

·         The first input should be the roll numbers separated by a comma symbol (,) without any space in it.

·         The second input is the department name acronym which is of two characters. (Case Insensitive)

·         Assume that all roll numbers have seven characters where the first two are the department name acronym. The rest five are numerical digits.

·         All inputs given for processing the functional requirements should be case insensitive.

·         Adhere to the Sample Inputs/ Outputs

·         In the Sample Inputs/ Outputs provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.







Sample Input 1:

Enter all roll numbers separated by comma

ME12345,eC11452,EE21258,me12348,IT15445,Cs12345,EC11453,Ec22258,mE12348,IT15446,CS12345,ec11454,ee21258,Me12348,IT15447,cS12345,EC11455,EC21268,ME12348,ME15445,cs12357,ME12349,mE12350

Enter the department name acronym

me

Sample Output 1:

Number of students in me is 8

Sample Input 2:

Enter all roll numbers separated by comma

ME12345,eC11452,EE21258,me12348,IT15445,Cs12345,EC11453,Ec22258,mE12348,IT15446,CS12345,ec11454,ee21258,Me12348,IT15447,cS12345,EC11455,EC21268,ME12348,ME15445,cs12357,ME12349,mE12350

Enter the department name acronym

EC

Sample Output 2:

Number of students in EC is 6

Sample Input 3:

Enter all roll numbers separated by comma

ME12345,eC11452,EE21258,me12348,IT15445,Cs12345,EC11453,Ec22258,mE12348,IT15446,CS12345,ec11454,ee21258,Me12348,IT15447,cS12345,EC11455,EC21268,ME12348,ME15445,cs12357,ME12349,mE12350

Enter the department name acronym

AG

Sample Output 3:

No students from AG