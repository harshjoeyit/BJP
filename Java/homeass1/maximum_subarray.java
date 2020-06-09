import java.lang.*;
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        int a[] = {3,4,2,1,4,3,2,4,0,1,1,3,4,2};
        String s[] = new String[a.length];
        int k = 8 , index = 0;

        for(int i = 0; i < a.length-k; i++ )
        {
            String y = "";

            for(int j = i; j < i + k; j++ )
            {
                String x = Integer.toString(a[j]);
                y = y.concat(x);
            }

            s[index++] = y;
        }

        String max = s[0];
        for(int i = 1; i<index; i++ )
            if( s[i].compareTo(max) > 0)
                max = s[i];
        
        System.out.println("largest: " + max);
    }
}