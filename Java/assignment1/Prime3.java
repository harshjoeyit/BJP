import java.lang.*;
import java.util.Scanner;

class checkprime
{
	int n; 
	checkprime( int N )
	{
		n = N;
	}
	int check()
	{
		for(int i = 2; i*i <= n; i++ )
		{
			if( n % i == 0 )
				return 1;
		}
		return 0;
	}
}




class Prime3
{
	public static void main( String arg[] )
	{
		int[] A = new int[500];
		int n , index = 0 , flag;
		
		System.out.print(" enter the number : ");
		Scanner enter = new Scanner( System.in );
		n = enter.nextInt();
		
		System.out.print("primes: ");
		for( int i = 2; i <= n; i++ )
		{
			checkprime cp = new checkprime( i );
			if( cp.check() == 0 )
				A[index++] = i;
		}
		
		flag = 0;
		for( int i = 0; i<index ; i++ )
		{
			for( int j = i; j<index; j++ )
			{
				if( A[i] + A[j] == n )
				{
					System.out.println( A[i] +" , "+ A[j] );
					flag = 1;
					break;
				}
			}
		}
		if( flag == 1)
			System.out.println(" badhai ho ");
		else
			System.out.println(" oops ");
	}
};


