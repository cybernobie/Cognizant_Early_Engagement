# Engine Analysis

Application created should be a demo of how to test petrol engine and diesel engine
in a car. Car is totally independent of its engine , performance of the car is totally
dependent on the engine fixed or injected. So the application will analyse the
engine by injecting petrol or diesel engine in a runtime basis.

### Step 1: 

Create an abstract class Engine with below mentioned public methods :Variables:torque of type int, rpm of type int, fuel of type String

| AccessSpecifier/Modifier | Method Name | InputParameters | Output Parameters | Logic |
| ------------------------ | ----------- | --------------- | ----------------- | ----- |
| public abstract | getPerformance | nil | int | This method should be implemented by subclass And calculate theperformance |

**Engine** class should be registered as a bean as ‘abstract= true’ with thespring container via XML file. 

### Step 2: 

Create class PetrolEngine which extends Engine and giveimplementation for getPerformance method by using the below formula andreturn horsepower. 

horsepower = (torque * rpm) / 5252 

PetrolEngine class should be registered as a bean with the springcontainer via XML file with bean id as petrolEngine. The values for theattributes should be torque=300 , rpm=4000 and fuel=petrol. 

### Step 3: 

Create class DieselEngine which extends Engine and giveimplementation for getPerformance method by using the below formula and returnhorsepower. 

horsepower = ( torque * rpm) / 63025

**DieselEngine** class should be registered as a bean    with the springcontainer via XML file with bean id as dieselEngine. The values for theattributes should be torque=500 , rpm=3000 and fuel=diesel. 

### Step 4: 

Create class Car which has following methods and variables. 

*Variables*: name of type String , engine of type Engine

| Type | Method Name | Input Parameters | Output Parameters | Logic |
| ---- | ----------- | ---------------- | ----------------- | ----- |
| method | getReport | nil | nil | This method should display the name ofthe car, fuel used and performance |
| Constructor | Car | String name , Engineengine | NA | This parameterized constructor takes name and Engine object which should be injected using XML file. |

Car class should be registered as a bean with the spring container via XMLfile with bean id as petrolCar. The values for the attributes should beconstructor injected with name=Honda and engine referred topetrolEngine bean. 

Car class should be registered as a bean with the spring container via XMLfile with bean id as dieselCar. The values for the attributes should beconstructor  injected with name=Suzuki and engine referred todieselEngine bean. 

> Sample Input Output 1:

    Select option
    1.Petrol Engine
    2.Diesel Engine
    1
    Honda car with petrol engine gives 228 horsepower

> Sample Input Output 2:

    Select option
    1.Petrol Engine
    2.Diesel Engine
    2
    Suzuki car with diesel engine gives 23 horsepower