# Year 11CS - Classes and Objects - Lab - Cube

Your job is to create a class called ```Cube```.

You should pass all of the tests in the ```CubeTester``` class (provided).

Add a new file called "Cube.java" to the src folder, and write a class named "Cube". The ```Cube``` class has the following members:
* a single private int property called ```side``` representing the side length of a cube
* a getter method called ```getSide()```
* a setter method called ```setSide(int side)```
* a method that returns the surface area of the cube called ```calculateSurfaceArea()```
* a method that returns the volume of the cube called ```calculateVolume()```
* a ```toString``` method that returns a String in the following format (see example):

```
Cube c = new Cube(4);
System.out.println(c.toString());   //this will print:   Cube{side=4}
```

The ```Cube``` class also has two constructors. 
* One takes no arguments (has no parameters) and sets ```side``` to 1.
* The other will take a single integer argument that is used to initialize the ```side``` property.

Side should never be less than 1. If a user attempts to create a Cube with a side length less than 1, an IllegalArgumentException will be thrown. The message “A cube’s side length cannot be less than 1!” will be displayed in the console when the exception occurs. If a user attempts to change the side length of an already existing ```Cube``` object to a value less than 1, again, an IllegalArgumentException will be thrown, and the message “A cube’s side length cannot be less than 1!” will be displayed in the console when the exception occurs.

```
if (side < 1) {
  throw new IllegalArgumentException(“A cube’s side length must be equal to or greater than 1!”);
}
```

Note: Learning how to throw exceptions will be useful in the completion of this lab. There are many different types of exceptions in Java. You may have encountered an ```IOException``` or ```FileNotFoundException``` when  were working with files, or an ```ArithmeticException``` if you divide by zero. For instance, if someone was using your ```Cube``` class and passed -1 to the Cube constructor (the user attempts to create a Cube of side length -1) they could handle this exception in their program by using the ```try-catch``` statement and return an informative message to the user. In this lab, you are not expected to catch and handle the thrown ```IllegalArgumentException```.

Notice that the ```setSide``` method and the constructor both perform the same job of checking the ```side``` parameter and throwing an exception if it is negative. To avoid duplication of code, you may consider writing a private helper method that can be called from ```setSide``` and the constructor.
