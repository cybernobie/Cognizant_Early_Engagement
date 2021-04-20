## Player Selection System_JDBC




The state government organizes a sports meet to encourage the school students. The selection committee for this event receives a huge number of registrations. So to organize things better they are in a need of an application to categorize the students registered as players based on their height (in centimetres) and weight (in Kilograms).

You being their software consultant have been approached to develop an application which can be used for managing their requirement. You need to implement a Java program to view the list of player’s name based on their height and weight.




Note: Appropriate public getters, setters and a four argument constructor in the given order – playerId, playerName, height, weight are provided as a part of the code template.


Requirement: Retrieve the list of player’s name based on their height and weight.

The application should retrieve the player’s names in ascending order, from the database based on the minimum height and maximum weight requirements. The shortlisted players should be within the range of the specified minimum height and the specified maximum weight (both inclusive).






To connect to the database you are provided with the database.properties file and the DB.java file. (Do not change any values in the database.properties file)

Create a class called Main with the main method and get the inputs like the minimum height and the maximum weight from the user.

Display the player’s names returned as List<String> from the method playersBasedOnHeightWeight  in the PlayerSelectionSystem class.

If no player is available in the list, the output should be “No players are with minimum height of <minHeight> and maximum weight of <maxWeight>”


Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.

Ensure to follow the object oriented specifications provided in the question description.

Ensure to provide the names for classes, attributes and methods as specified in the question description.

Adhere to the code template, if provided.

The following Sample Inputs / Outputs are generated based on the above mentioned Sample records are given in the player table.


Sample Input 1:

Enter the minimum height

140

Enter the maximum weight

65

Sample Output 1:

Daisy

Julian

Natalie

Thomas


Sample Input 2:

Enter the minimum height

120

Enter the maximum weight

35

Sample Output 2:

No players are with minimum height of 120.0 and maximum weight of 35.0


Sample Input 3:

Enter the minimum height

250

Enter the maximum weight

65

Sample Output 3:

No players are with minimum height of 250.0 and maximum weight of 65.0