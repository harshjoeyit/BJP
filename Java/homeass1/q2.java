import java.lang.*;
import java.util.*;


class concat
{
	String s = "";	// empty string , if not initializes then s = null

	public String join( String nextWord )
	{
		s = nextWord + " " + s;
		return s;
	}
}

class q2
{
	public static void main( String args[] )
	{
		concat C = new concat();

		String s = "my name is Harshit";
		String aux = "", sent = "";

		for( int i = 0; i<s.length(); i++ )
		{
			if( s.charAt(i) == ' ' )
			{
				sent = C.join(aux);
				aux = "";
			}
			else
				aux = aux + s.charAt(i);
		}
		sent = C.join(aux);

		System.out.println("reversed word wise:\t" + sent );
	}
}
