//Header in Circle.java


public class TestCircle
{

public static void main(String[] args)
{
Circle spot1 = new Circle();//first circle object

Circle spot2 = new Circle(4);//second circle object

spot1.setRadius(3);//first circle object
System.out.println("Circle radius " + spot1.getRadius());//displays circle radius
System.out.println("Circle circumference: " + spot1.circumference(3));//displays circle circumference
System.out.println("Circle area " + spot1.area(3));//displays circle area
spot1.displayAreaformula();//displays formula for area of a circle


System.out.println("\n \n \n");

spot2.setRadius(4);//second circle object
System.out.println("Circle radius " + spot2.getRadius());//displays circle radius
System.out.println("Circle circumference: " + spot2.circumference(4));//displays circle circumference
System.out.println("Circle area " + spot2.area(4));//displays circle area
spot2.displayAreaformula();//displays formula for area of a circle



System.out.println("\n \n \n");

if (spot1.equals(spot2))
{
System.out.println("Objects are equal.");//displays this when the objects are equal
}

else
{
System.out.println("Objects are not equal.");//displays this when the objects are equal
}

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
