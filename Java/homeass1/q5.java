import java.lang.*;
import java.util.*;

class match
{
    public int count(String A, int Aindex, String Pattern, int Pindex )
    {
        if( Pindex >= Pattern.length() )
            return 1;                   // reutrning 1 beacause the condition will only be met when full pattern is found once 
        
        int total = 0;                      
        for(int i = Aindex; i < A.length(); i++ )
        {
            if( A.charAt(i) == Pattern.charAt(Pindex) )
            {
                total += count(A, i+1, Pattern, Pindex+1 );
            }
        }
        return total;
    }
}


class q5
{
    public static void main( String args[] )
    {
        match M = new match();

        String A = "aabba";
        String Pattern = "ab";

        int total = M.count(A, 0, Pattern, 0);

        System.out.println(total);
    }
};