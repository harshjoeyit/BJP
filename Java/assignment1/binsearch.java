import java.lang.*;
import java.util.*;

class binsearch
{
	public static void main( String args[] )
	{
		 int[] A = new int[50];
		 int i , search , size;
		 
		 System.out.print("size(max 50 ): ");
		 Scanner enter = new Scanner(System.in);
		 size = enter.nextInt();
		 
		 for( i = 0; i < size; i++ )
		 {
		 	System.out.print("a[" + i + "] = ");
		 	A[i] = enter.nextInt();
		 }
		 
		 System.out.print("search: ");
		 search = enter.nextInt();
		 
		 int mid = -1, low=0 , high = size-1;
		 
		 while( low <= high )
		 {
		 	mid = (low + high)/2;
		 	
		 	if( A[mid] == search )
		 		break;
		 	else 
		 	if( A[mid] < search )
		 		low = mid+1; 
		 	else
		 		high = mid-1;
		 }
		 
		 if( low <= high )
		 	System.out.println("found at index: " + mid );
		 else
		 	System.out.println(" not found ");
	}
}
