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


class Prime2
{
	public static void main( String arg[] )
	{
		int m , n;
		System.out.print(" enter the interval : ");
		Scanner enter = new Scanner( System.in );
		m = enter.nextInt();
		n = enter.nextInt();
		
		System.out.print("primes: ");
		for( int i = m; i < n; i++ )
		{
			checkprime cp = new checkprime( i );
			if( cp.check() == 0 )
				System.out.print( i + " " );
		}
		System.out.println();
	}
};
