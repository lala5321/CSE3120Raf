/*

Program: Circle.java          Last Date of this Revision: May 11, 2022

Purpose: An application that uses the formula for a circle to determine area, radius, and circumference, and examine if circles are equal

Author: Rafat E, 
School: CHHS
Course: Computer Programming 20
 

*/

public class Circle
{
 
public static final double PI = 3.14;// PI number value

private double radius;


public Circle()//constructor method
{
radius = 1; //default radius  
}

public Circle(double r)//constructor method2
{
radius = r;
}

public void setRadius(double newRadius)
{
radius = newRadius;
}


public double getRadius()
{
return(radius);
}


public double circumference(double r)//member method circumference
{

return( 2*PI*r);//formula for circumference of a circle
}

public double area(double r)//method for area of a circle
{
return(PI*(r*r));//formula for area of a circle
}

public static void displayAreaformula()//class method displayAreaformula
{
System.out.println("The formula for the area of a circle is a=Pi*r*r");
}



}

/* Screen Dump

Circle radius 3.0
Circle circumference: 18.84
Circle area 28.26
The formula for the area of a circle is a=Pi*r*r




Circle radius 4.0
Circle circumference: 25.12
Circle area 50.24
The formula for the area of a circle is a=Pi*r*r




Objects are not equal.


*/
