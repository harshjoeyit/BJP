import java.lang.*;
import java.util.*;

class Coin
{
    String sideup;

    Coin()
    {
        String side1 = "heads";
        String side2 = "tails";
        Random rand = new Random();
        int side = rand.nextInt(2) + 1;         // generating a random number for choosing heads and tails              
        //               0-1       + 1
        if(side == 1)
            sideup = side1;
        else
            sideup = side2;
    }

    void toss()
    {
        Random rand = new Random();
        int side = rand.nextInt(2) + 1;
        if(side == 1)
            sideup = "heads";
        else
            sideup = "tails";
    }

    String getSideup()
    {
        return sideup;
    }
}

class q16
{
	public static void main( String args[] )
	{
        Coin C = new Coin();
        int heads = 0;
        int tails = 0;
        String result;

        System.out.println("initially sideup: " + C.getSideup());

        for( int i = 0; i<20; i++ )
        {
            C.toss();
            result = C.getSideup();
            System.out.println("["+ (i+1) +"]");
            System.out.println("toss... \nsideup: " + result );
            
            if( result == "heads")
                ++heads;
            else
                ++tails;   
        }

        System.out.println("heads: " + heads );
        System.out.println("tails: " + tails );
    }
};
