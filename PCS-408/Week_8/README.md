### Week - 8

#### [Area of Shapes](Area.java)

Write a Java program to calculate the area of a rectangle, a square and a circle. Create an abstract class '**Shape**' with three abstract methods namely **rectangleArea()** taking two parameters, **squareArea()** and **circleArea()** taking one parameter each. Now create another class '**Area**' containing all the three methods rectangleArea(), squareArea() and circleArea() for printing the area of rectangle, square and circle respectively. Create an object of class Area and call all the three methods.

**(Use Runtime Polymorphism)**

#### [Change Temperature](TempConverter.java)

Write a Java program to implement abstract class and abstract method with following details:<br>
Create an abstract Base Class **Temperature** with following:<br>
**Data Member:** double temp<br>
**Member Methods:**<br>
void setTempData(double)<br>
abstract void changeTemp()

Create a class **Fahrenheit** (sub-class of **Temperature**) with following:<br>
**Data Member:** double ctemp<br>
**Member Method:** Override abstract method *changeTemp()* to convert Fahrenheit temperature into degree Celsius by using formula **C = [(F - 32) * 5] / 9** and display converted temperature.

Create a class **Celsius** (sub-class of **Temperature**) with following:<br>
**Data Member:** double ftemp<br>
**Member Method:** Override abstract method *changeTemp()* to convert degree Celsius into Fahrenheit temperature by using formula **F = 9 / 5 * (C + 32)** and display converted temperature.

#### [Volumes of Shapes](Volumes.java)

Write a Java program to create an interface that consists of a method to display **volume()** as an abstract method and redefine this method in the derived classes to suit their requirements.<br>
Create classes called **Cone**, **Hemisphere** and **Cylinder** that implements the interface. Using these three classes, design a program that will accept dimensions of a cone, cylinder and hemisphere interactively and display the volumes.

Volume of cone = (1/3)&pi;r<sup>2</sup>h<br>
Volume of hemisphere = (2/3)&pi;r<sup>3</sup><br>
Volume of cylinder = &pi;r<sup>2</sup>h

---