##  Fruit Basket Estimation









A famous fruit stall in the marketplace approaches you to create an application in which their customers can estimate the total bill amount for the fruits in the basket. As a Java developer, create a Java application to add fruits to the basket and calculate the bill amount.

 You are provided with a code template which includes the following classes:

·         FruitBasket class which includes the attributes fruitName, weightInKgs and pricePerKg with all getters and setters, an empty constructor and a three argument constructor which is used to set values to all attributes.

·         FruitBasketUtility class which includes the attribute fruitBasketList with its getter and setter, public void addToBasket(FruitBasket fbObj) method declaration and public int calculateBill(Stream<FruitBasket> fruitBasketStream) method declaration.

·         Main class with a main method having user interface for getting the required inputs and pass them as an object to the addToBasket method.

 Functional Requirements:

1.      Enclose your code in the addToBasket method of the FruitBasketUtility class to add the FruitBasket object into the fruitBasketList.

2.      Enclose your code in the calculateBill method to calculate the total bill amount from the Stream of FruitBasket objects. Each object will have a fruit detail. On multiplying the weightInKgs and pricePerKg of each FruitBasket object, the individual bill amount for that particular fruit can be calculated. This method should return the total bill amount by adding each individual bill amount of fruits present in the Stream.

3.      Enclose your code in the Main class for retrieving the list of FruitBasket object from the FruitBasketUtility class and convert the List of objects into Stream of objects. Then pass the Stream of FruitBasket objects to the calculateBill method in FruitBasketUtility class and display the total bill amount.

 User Interface:

·         Display the options to choose as “Select an option: 1. Add Fruit to Basket 2. Calculate Bill 3.Exit” for all iterations.

·         Any valid option can be chosen as 1 or 2 or 3. Otherwise, display a message as “Invalid option. Please try again.” and continue to display the options.

·         For option 1: get the fruitName, weightInKgs and pricePerKg as inputs to process the functional requirements and continue to display the options.

·         For option 2: retrieve the list as mentioned in the functional requirements. If the retrieved list is empty, then display “Your basket is empty. Please add fruits.” and continue to display the options. Otherwise, display the total bill amount as “The estimated bill amount is Rs <total bill amount>” and continue to display the options.

·         For option 3: display a message “Thank you for using the application” and terminate.

 Note:

·         Few of the User Interface requirements will be provided in the code template itself. Adhere to the code template. Enclose your code in the respective required blocks alone.

·         Do not edit or delete the codes provided in the code template.

·         Adhere to the Sample Inputs/ Outputs.

·         In the Sample Inputs/ Outputs provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.

 







Sample Input/ Output 1:

Select an option:

1.Add Fruit to Basket

2.Calculate Bill

3.Exit

2

Your basket is empty. Please add fruits.

Select an option:

1.Add Fruit to Basket

2.Calculate Bill

3.Exit

1

Enter the fruit name

Mango

Enter weight in Kgs

5

Enter price per Kg

30

Select an option:

1.Add Fruit to Basket

2.Calculate Bill

3.Exit

2

The estimated bill amount is Rs 150

Select an option:

1.Add Fruit to Basket

2.Calculate Bill

3.Exit

1

Enter the fruit name

Apple

Enter weight in Kgs

2

Enter price per Kg

80

Select an option:

1.Add Fruit to Basket

2.Calculate Bill

3.Exit

1

Enter the fruit name

Kiwi

Enter weight in Kgs

3

Enter price per Kg

45

Select an option:

1.Add Fruit to Basket

2.Calculate Bill

3.Exit

2

The estimated bill amount is Rs 445

Select an option:

1.Add Fruit to Basket

2.Calculate Bill

3.Exit

3

Thank you for using the application.

 Sample Input/ Output 2:

Select an option:

1.Add Fruit to Basket

2.Calculate Bill

3.Exit

4

Invalid option. Please try again.

Select an option:

1.Add Fruit to Basket

2.Calculate Bill

3.Exit

2

Your basket is empty. Please add fruits.

Select an option:

1.Add Fruit to Basket

2.Calculate Bill

3.Exit

3

Thank you for using the application.