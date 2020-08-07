
/* 
There are three reasons that you might use a Number object rather than a primitive:

1. As an argument of a method that expects an object (often used 
when manipulating collections of numbers).

2. To use constants defined by the class, such as MIN_VALUE and 
MAX_VALUE, that provide the upper and lower bounds of the data type.

3. To use class methods for converting values to and from other 
primitive types, for converting to and from strings, and for 
converting between number systems (decimal, octal, hexadecimal, 
binary).

boolean
byte
char
float
int 
long
short
double

*/


import java.util.*;

class Test {
	public static void main(String[] args) {

		Integer i = new Integer(-8);

		// 1. Unboxing through method invocation
		int absVal = absoluteValue(i);

		System.out.println("absolute value of " + i + " = " + absVal);

		List<Double> ld = new ArrayList<>();
		//  is autoboxed through method invocation.
		ld.add(3.1416);    

		// 2. Unboxing through assignment
		double pi = ld.get(0);
		System.out.println("pi = " + pi);
	}

	public static int absoluteValue(int i) {
		return (i < 0) ? -i : i;
	}
}