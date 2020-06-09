import java.lang.*;
import java.util.*;


class q17
{
    public static void main( String args[] )
    {
        Coin quarter = new Coin();
        Coin dime = new Coin();
        Coin nickel = new Coin();

        float balance = 0;

        while( balance < 1 )
        {
            quarter.toss();
            if( quarter.getSideup() == "heads" )
                balance += 0.25;
            
            dime.toss();
            if( dime.getSideup() == "heads" )
                balance += 0.10;

            nickel.toss();
            if( nickel.getSideup() == "heads" )
                balance += 0.05;
        }

        if( balance == 1.0 )
            System.out.println("You Win");
        else
            System.out.println("You Loss");
    }
}