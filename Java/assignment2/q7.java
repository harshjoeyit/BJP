import java.lang.*;
import java.util.*;

class Circle
{
    double radius;
    static double PI;

    Circle()
    {
        //radius = 0.0; 
    }             // default constructor with empty body

    Circle( double radius )
    {
        this.radius = radius;
    }

    void setRadius( double radius )
    {
        this.radius = radius;
    }

    double getRadius()
    {
        return radius;
    }

    double getArea()
    {
        return PI*radius*radius;
    }

    double getDiameter()
    {
        return 2*radius;
    }

    double getCircumfrence()
    {
        return 2*PI*radius;
    }

    void setPI()            
    {
        PI = 3.14;
    }
}

class q7
{
	public static void main( String args[] )
	{
        Circle C = new Circle(1.0);
        System.out.println("value of PI : " + Circle.PI);

        Scanner enter = new Scanner(System.in);
        System.out.print("radius: " );
        double r = enter.nextDouble();
        C.setRadius(r);
        C.setPI();                  // setPI changes the value of the static field for the while class 
        System.out.println("value of PI : " + Circle.PI);
        System.out.println("area: " + C.getArea() );
        System.out.println("circum: " + C.getCircumfrence() );
        System.out.println("dia: " + C.getDiameter() );
    }
};
