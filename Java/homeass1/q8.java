import java.lang.*;
import java.util.*;



class Anagram
{   
    public boolean are_anagram(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;
        
        int s1_count[], s2_count[];
        s1_count = new int[26];
        s2_count = new int[26];
        int x1, x2, flag = 0;
        
        for(int i = 0; i<s1.length(); i++ )
        {
            x1 = s1.charAt(i) - 'a';
            x2 = s2.charAt(i) - 'a';

            ++s1_count[x1];
            ++s2_count[x2];
        }

        for(int i = 0; i < 26; i++ )                    // if the arrays are exactly the same 
            if( s1_count[i] != s2_count[i] )
            {
                flag = 1;
                break;
            }

        if(flag==1)
            return false;
        else
            return true;
    } 

    public void display(int a[])
    {
        for(int i=0; i<26; i++)
            System.out.print(a[i]);
        System.out.println();
    }
};




class q8
{
    public static void main( String args[] )
    {
        Scanner enter = new Scanner(System.in);
        
        String S1 = enter.nextLine();
        String S2 = enter.nextLine();

        Anagram A = new Anagram();
        
        if(A.are_anagram(S1,S2))
            System.out.println(S1 +", "+ S2 +" are anagram");
        else
            System.out.println("Not anagram");
        
        enter.close();
    }
};