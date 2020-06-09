import java.lang.*;
import java.util.*;

class employee
{
	private
	
	String name;
	int idNumber;
	String department;
	String position;
	
	public
	
	employee( String n , int id , String dep , String pos )
	{
		name = n;
		idNumber = id;
		department = dep;
		position = pos;
	}
	
	employee( String n , int id )
	{
		name = n;
		idNumber = id;
		department = "";
		position = "";
	}
	
	employee()
	{
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}
	
	void mutator( String n , int id , String dep , String pos )
	{
		name = n;
		idNumber = id;
		department = dep;
		position = pos;
	}
	
	void accessor()
	{
		System.out.println( "name: " + name );
		System.out.println( "idNumber: " + idNumber );
		System.out.println( "department: " + department );
		System.out.println( "position: " + position );
		System.out.println();
	}
	
};


class q1
{
	public static void main( String args[] )
	{
		employee e1 = new employee("Susan Meyers" , 47899 , "Acoounting" , "Vice President");
		employee e2 = new employee("Mark Jones" , 39119 , "IT" , "Engineer");
		employee e3 = new employee("Joy Rogers" , 81774 , "Manufacturing" , "Engineer");
		employee e4 = new employee();
		e1.accessor();
		e2.accessor();
		e3.accessor();
		e4.accessor();
	}
};
