# Shape - Area Volume Calculator

Create an abstract public class Shape with the below public abstract methods :

`public double area()`

`public double volume()`

Create a public class Rectangle with private attributes :

`double length`

`double width`

Write the public getters and setters for these attributes.

Rectangle class should inherit the Shape class

Area of rectangle is length * width

Create a public class Triangle with private attributes :

`double base`

`double height`

Write the public getters and setters for these attributes.

Triangle class should inherit the Shape class

Area of triangle is  1/2 * base * height

Create a public class Cube with private attributes :

`double length`

`double width`

`double height`

Write the public getters and setters for these attributes.

Cube class should inherit the Shape class

Area of cube is  2 * length * width + 2 * length * height + 2* width * height

Volume of cube is  length * width * height

Create a public class Sphere with private attributes :

`double radius`

Write the public getters and setters for these attributes.

Sphere class should inherit the Shape class

Area of  Sphere is  4  * PI * radius2

Volume of Sphere is   ( 4  * PI * radius3 ) / 3

**Note : You should use Math.PI for the value of PI**

For Rectangle and Triangle class the method volume should return -1.

Create an interface Spatial which is a marker interface. Classes that has proper implementation for volume should implement this interface.

Create a public Main class which has the main method.

Create an array of Shape of size 5.

Get the Shape type and the corresponding attributes and store those objects in the array.

Print the area and volume of the objects created.

Volume of the array object should be printed only if it is of Spatial Type.

> Sample Input :

    Triangle
    10
    20
    Sphere
    14
    Rectangle
    14
    15
    Cube
    5
    7
    9
    Triangle
    18
    24

> Sample Output

    Area 100.0
    Area 2463.0086404143976
    Volume 11494.040321933855
    Area 210.0
    Area 286.0
    Volume 315.0
    Area 216.0

**Note : Volume is displayed only when the shape is cube or sphere **