import java.lang.*;
import java.util.*;


class RoulettePocket
{
    int PocketNumber;
    
    RoulettePocket() { }

    RoulettePocket( int PocketNumber )
    {
        this.PocketNumber = PocketNumber; 
    }

    String getPocketColor()          // returns pocket color as string
    {
        if( PocketNumber == 0 )
            return "Green";
        
        else if( (PocketNumber >= 1 && PocketNumber <=10) || (PocketNumber >= 19 && PocketNumber <= 28) )
        {
            if( PocketNumber % 2 == 0)
                return "Black";
            else
                return "Red";
        }

        else
        {
            if( PocketNumber % 2 == 0 )
                return "Red";
            else
                return "Black";
        }

    }
}


class q15
{
    public static void main( String args[] )
    {

        Scanner enter = new Scanner(System.in);
        System.out.print("Pocket Number: ");
        int PN = enter.nextInt();

        RoulettePocket RP = new RoulettePocket(PN);

        System.out.println("Pocket Color: " + RP.getPocketColor() );

    }
}