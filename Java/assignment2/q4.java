import java.lang.*;
import java.util.*;

class RetailItem
{
    String description;
    int unitsOnHand;
    double price;

    RetailItem()                                // default constructor
    {
        this("Jacket" , 12 , 59.95 );           // call to the parametrized constructor 
    }

    RetailItem( String description , int unitsOnHand , double price )
    {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }


    void set( String description , int unitsOnHand , double price  )
    {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }

    void get()
    {
        System.out.println("description: " + description);
        System.out.println("unitsOnHand: " + unitsOnHand );
        System.out.println("price: " + price );
    }
}

class q4
{
	public static void main( String args[] )
	{
        RetailItem Item1 = new RetailItem();        // calls default constructor 
        RetailItem Item2 = new RetailItem("Designer Jeans" , 40 , 34.95 );
        RetailItem Item3 = new RetailItem("Shirt" , 20 , 24.95 );

        Item1.get();
        Item2.get();
        Item3.get();
    }
};
