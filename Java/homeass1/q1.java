import java.lang.*;
import java.util.*;


class printSpiral
{

	void array( int a[][] , int rows , int cols )
	{
		int i,j,tl,tr,br,bl;
		tl = 0; 			
		tr = cols;			
		br = rows;			
		bl = 0;				

		while( (tl < br ) && ( bl < tr ))
		{
			for( j = bl; j<tr; j++ )
				System.out.print(a[tl][j] + " ");
			tl++;

			for( i = tl; i<br; i++ )
				System.out.print(a[i][tr-1] + " ");
			tr--;

			if( tl < br )		// condition check is neccesarry 
			{
				for( j = tr-1; j>=bl; j-- )
					System.out.print(a[br-1][j] + " ");
				br--;
			}

			if( bl < tr )		// condition check is neccesarry 
			{
				for( i = br-1; i>=tl; i-- )
					System.out.print(a[i][bl] + " ");
				bl++;
			}
			
		}

	}	
	
}

class q1
{
	public static void main( String args[] )
	{
		int a[][];
		int rows , cols , input;
		Scanner in = new Scanner(System.in);
		System.out.print("enter rows: ");
		rows = in.nextInt();
		System.out.print("enter cols: ");
		cols = in.nextInt();
		
		a = new int[rows][cols];
			
		for( int i = 0; i < rows; i++ )
		{	
			for( int j = 0; j < cols; j++ )
			{
				System.out.print("A[" + i + "]["+j+"]: " );
				a[i][j] = in.nextInt();
			}
		}			

		printSpiral ps = new printSpiral();
		ps.array(a , rows ,cols );
	}
}
