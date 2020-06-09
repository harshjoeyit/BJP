import java.lang.*;
import java.util.*;

class Car
{
    
	int YearModel;
	String make;
	int Speed;
                                
    Car( int ym , String m )
    {
        YearModel = ym;
        make = m;
        Speed = 0;
    }
	
	void accessor()
	{
		System.out.println( "name: " + YearModel );
		System.out.println( "idNumber: " + make );
		System.out.println( "department: " + Speed );
		System.out.println();
    }
    
    void accelerate()
    {
        Speed += 5;
    }

    void brake()
    {
        Speed -= 5;
    }
	
};


class q2
{
	public static void main( String args[] )
	{
        Car C1 = new Car( 69 , "Porche" );
        C1.accelerate();
        System.out.println("speed: " + C1.Speed );
        C1.accelerate();
        System.out.println("speed: " + C1.Speed );
        C1.accelerate();
        System.out.println("speed: " + C1.Speed );
        C1.accelerate();
        System.out.println("speed: " + C1.Speed );
        C1.accelerate();
        System.out.println("speed: " + C1.Speed );

        C1.brake();
        System.out.println("speed: " + C1.Speed );
        C1.brake();
        System.out.println("speed: " + C1.Speed );
        C1.brake();
        System.out.println("speed: " + C1.Speed );
        C1.brake();
        System.out.println("speed: " + C1.Speed );
        C1.brake();
        System.out.println("speed: " + C1.Speed );
	}
};
