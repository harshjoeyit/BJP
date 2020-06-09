import java.lang.*;
import java.util.*;

class PersonalInformation
{
    String name;
    String address;
    int age;
    int phNumber;

    void set( String name , String address , int age , int phNumber )
    {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phNumber = phNumber;

        this.get();         // calling the function from the class itself  
    }

    void get()
    {
        System.out.println("name: " + name );
        System.out.println("address: " + address );
        System.out.println("age: " + age );
        System.out.println("phNumber: " + phNumber );
    }
}

class q3
{
	public static void main( String args[] )
	{
        PersonalInformation my = new PersonalInformation();
        PersonalInformation friends = new PersonalInformation();

        my.set("harshit" , "new york" , 15 , 457896321 );
        friends.set("raju" , "housten" , 23 , 1234567897 );

    }
};
