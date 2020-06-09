import java.lang.*;
import java.util.*;


class Aux
{
    private int min ,temp;

    public void sort(int a[])
    {
        for(int i = 0; i<a.length - 1; i++)
        {
            min = i;
            for(int j = i+1; j<a.length; j++ )
                if(a[j] < a[min])
                    min = j;
            
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    public void display(int a[])
    {
        System.out.print("array: ");
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

};

class q7
{
    public static void main( String args[] )
    {
        int[] a = {52,11,33,17,25,46};
        Aux A = new Aux();

        A.display(a);
        A.sort(a);
        int k;

        System.out.print("k: ");
        Scanner enter = new Scanner(System.in);
        k = enter.nextInt();
        if(k < a.length+1 && k > 0)
        System.out.println(k+ "th smallest element: "+ a[k-1]);
    }
};