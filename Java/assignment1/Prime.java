import java.lang.*;

class Prime
{
	public static void main( String arg[] )
	{
		int n = 73;
		int flag = 1;
		for(int i = 2; i*i< n; i++ )
		{
			if( n % i == 0 )
			{
				flag = 0;
				break;
			}
		}
		if( flag == 1 )
			System.out.println( n + "is a prime number");
		else
			System.out.println( n + "is not a prime number");
	}
};
