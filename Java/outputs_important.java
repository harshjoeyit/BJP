

/* Important outputs */

// filename Main.java 
class Main { 
	public static void main(String args[]) { 
		// System.out.println(fun()); 
		print();
	} 
	private static void print(int x=10) {
		System.out.println(x);
	}
	int fun() { 
		return 20; 
	} 
} 
// Output: Complie Error, non-static method called from a static reference



// filename: Test.java 
public class Test  
{     
    int x = 2; 
    Test(int i) { x = i; }  
    public static void main(String[] args) {     
         Test t = new Test(5); 
         System.out.println("x = " + t.x); 
    } 
}

// constructor changes the value to be 5
// if object is not created the value remains 2



// filename: Test2.java 
class Test1 { 
	Test1(int x) { 
		System.out.println("Constructor called " + x); 
	} 
} 

// This class contains an instance of Test1 
class Test2 {	 
	Test1 t1 = new Test1(10); 
  
	Test2(int i) { t1 = new Test1(i); } 

	public static void main(String[] args) {	 
		Test2 t2 = new Test2(5); 
	} 
} 

// Output: 
// Constructor called 10 
// Constructor called 5



// Main.java 
public class Main 
{ 
    public static void gfg(String s) 
    {     
        System.out.println("String"); 
    } 
    public static void gfg(Object o) 
    { 
        System.out.println("Object"); 
    } 
  
    public static void main(String args[]) 
    { 
        gfg(null); 
    } 
} //end class 

// Output: String
// Explanation : In case of method overloading, the most specific method is 
// chosen at compile time. As ‘java.lang.String’ is a more specific type 
// than ‘java.lang.Object’. In this case the method which takes ‘String’ 
// as a parameter is choosen.


// Main.java 
public class Main 
{ 
    public static void gfg(String s) 
    {     
        System.out.println("String"); 
    } 
    public static void gfg(Object o) 
    { 
        System.out.println("Object"); 
    } 
    public static void gfg(Integer i) 
    { 
        System.out.println("Integer"); 
    } 
  
    public static void main(String args[]) 
    { 
        gfg(null); 
    } 
} //end class 

// Compile Error at line 19.
// Explanation: In this case of method Overloading, the most specific method is choosen at compile time.
// As ‘java.lang.String’ and ‘java.lang.Integer’ is a more specific type than ‘java.lang.Object’,
// but between ‘java.lang.String’ and ‘java.lang.Integer’ none is more specific.
// In this case the Java is unable to decide which method to call.


// Main.java 
public class Main 
{ 
    public static void main(String args[]) 
    { 
        String s1 = "abc"; 
        String s2 = s1; 
        s1 += "d"; 
        System.out.println(s1 + " " + s2 + " " + (s1 == s2)); 
  
        StringBuffer sb1 = new StringBuffer("abc"); 
        StringBuffer sb2 = sb1; 
        sb1.append("d"); 
        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2)); 
    } 
} //end class 


// Explanation:
// 1. In Line 12 The “” in the println causes the numbers to be automatically cast as strings. So it doesn’t do addition, but appends together as string.
// 2. In Line11 the += does an automatic cast to a short. However the number 123456 can’t be contained within a short, so you end up with a negative value (-7616).
// (NOTE – short 2 bytes -32,768 to 32,767), Here the number 123456 doesn’t mean the Value of int z,it shows the length of the int value
// 3. Those other two are red herrings however as the code will never compile du


// Main.java 
public class Main 
{ 
	public static void main(String args[]) 
	{ 
		short s = 0; 
		int x = 07; 
		int y = 08; 
		int z = 112345; 

		s += z; 
		System.out.println("" + x + y + s); 
	} 
} //end class 

// Output:
// Compile Error at line 8


// Explanation : In Java, String is immutable and string buffer is mutable.
// So string s2 and s1 both pointing to the same string abc. And, after making
//  the changes the string s1 points to abcd and s2 points to abc, hence false. 
// While in string buffer, both sb1 and sb2 both point to the same object. 
// Since string buffer are mutable, making changes in one string also make 
// changes to the other string. So both string still pointing to the same 
// object after making the changes to the object (here sb2



import java.util.*;  
class I  
{ 
    public static void main (String[] args)  
    { 
        Object i = new ArrayList().iterator();  
        System.out.print((i instanceof List) + ", ");  
        System.out.print((i instanceof Iterator) + ", ");  
        System.out.print(i instanceof ListIterator);  
    }  
} 

// Output:
// false, true, false
// List iterator is subclass of iterator 



class ThreadEx extends Thread 
{ 
    public void run() 
    { 
        System.out.print("Hello..."); 
    } 
    public static void main(String args[]) 
    { 
        ThreadEx T1 = new ThreadEx(); 
        T1.start(); 
        T1.stop(); 
        T1.start(); 
    } 
} 

// Runtime exception 
// start cannot be called twice 


public class Test 
{ 
	public static void main(String[] args) 
	{ 
		StringBuilder s1 = new StringBuilder("Java"); 
		String s2 = "Love"; 
		s1.append(s2); 
		// we need a variable/ new String object to hold the substring returned 
		s1.substring(4); 
		// no change on s1
		int foundAt = s1.indexOf(s2); 
		System.out.println(foundAt); 
	} 
} 

// Answer : C) 4


class GfG 
{ 
	public static void main(String args[]) 
	{ 
		String s1 = new String("geeksforgeeks"); 
		String s2 = new String("geeksforgeeks"); 
		if (s1 == s2) 
			System.out.println("Equal"); 
		else
			System.out.println("Not equal"); 
	} 
} 


// Since, s1 and s2 are two different objects the references are not the same, 
// and the == operator compares object reference. So it prints “Not equal”, to 
// compare the actual characters in the string .equals() method must be used.


class Gfg 
{ 
    // constructor 
    Gfg() 
    { 
        System.out.println("Geeksforgeeks"); 
    } 
      
    static Gfg a = new Gfg(); //line 8 
  
    public static void main(String args[]) 
    { 
        Gfg b; //line 12 
        b = new Gfg(); 
    } 
} 

// Output:

// Geeksforgeeks
// Geeksforgeeks

// Explanation:
// We know that static variables are called when a class loads and static variables are called only once. Now line 13 results to creation of object which inturn calls the constructor and “Geeksforgeeks” is printed second time.
// If in line 8 static variable would not have been used the object would have been called recursively infinitely leading to StackOverFlow error. See this for a sample run.



public class Gfg 
{ 
	public static void main(String[] args) 
	{ 
		Integer a = 128, b = 128; 
		System.out.println(a == b); 

		Integer c = 100, d = 100; 
		System.out.println(c == d); 
	} 
} 

// Output:

// false
// true
 
// Explanation: In the source code of Integer object we will find a method ‘valueOf’ 
//  in which we can see that the range of the Integer object lies from IntegerCache.low(-128)
//  to IntegerCache.high(127). Therefore the numbers above 127 will not give the expected output. 
//  The range of IntegerCache can be observed from the source code of the IntegerCache class. 
//  Please refer this for details


public class Test 
{ 
	public static void main(String[] args) throws InterruptedException 
	{ 
		String str = new String("GeeksForGeeks"); 
			
		// making str eligible for gc 
		str = null; 
			
		// calling garbage collector 
		System.gc(); 
			
		// waiting for gc to complete 
		Thread.sleep(1000); 
	
		System.out.println("end of main"); 
	} 

	@Override
	protected void finalize() 
	{ 
		System.out.println("finalize method called"); 
	} 
} 

// Output:

// end of main

// Explanation : We know that finalize() method is called by Garbage Collector 
// on an object before destroying it. But here, the trick is that the str is String
//  class object, not the Test class. Therefore, finalize() method of String class
//  (if overridden in String class) is called on str. If a class doesn’t override 
//  finalize method, then by default Object class finalize() method is called.


public class Test 
{ 
	public static void main(String[] args) throws InterruptedException 
	{ 
		Test t = new Test(); 
			
		// making t eligible for garbage collection 
		t = null; 
			
		// calling garbage collector 
		System.gc(); 
			
		// waiting for gc to complete 
		Thread.sleep(1000); 
	
		System.out.println("end main"); 
	} 

	@Override
	protected void finalize() 
	{ 
		System.out.println("finalize method called"); 
		System.out.println(10/0); 
	} 
	
} 

// Output
// finalize method called
// end main

// Explanation :
// When Garbage Collector calls finalize() method on an object, it ignores all the exceptions raised in the method and program will terminate normally.




public class Test 
{ 
	static Test t ; 
	
	static int count =0; 
	
	public static void main(String[] args) throws InterruptedException 
	{ 
		Test t1 = new Test(); 
			
		// making t1 eligible for garbage collection 
		t1 = null; // line 12 
			
		// calling garbage collector 
		System.gc(); // line 15 
			
		// waiting for gc to complete 
		Thread.sleep(1000); 
	
		// making t eligible for garbage collection, 
		t = null; // line 21 
			
		// calling garbage collector 
		System.gc(); // line 24 
	
		// waiting for gc to complete 
		Thread.sleep(1000); 
			
		System.out.println("finalize method called "+count+" times"); 
		
	} 
	
	@Override
	protected void finalize() 
	{ 
		count++; 
		
		t = this; // line 38 
			
	} 
	
} 



// After execution of line 12, t1 becomes eligible for garbage collection. 
// So when we call garbage collector at line 15, Garbage Collector will call
//  finalize() method on t1 before destroying it. But in finalize method, in
//  line 38, we are again referencing the same object by t, so after execution 
// of line 38,this object is no longer eligible for garbage collection. Hence, 
// Garbage Collector will not destroy the object.

// Now again in line 21, we are making same object eligible for garbage collection
//  one more time. Here, we have to clear about one fact about Garbage Collector 
// i.e. it will call finalize() method on a particular object exactly one time. 
// Since on this object, finalize() method is already called, so now Garbage 
// Collector will destroy it without calling finalize() method again.


public class Test 
{ 
	public static void main(String [] args) 
	{ 
		Test t1 = new Test(); 
		Test t2 = m1(t1); // m1 returnd new object 
		Test t3 = new Test(); 
		t2 = t3; 		// object returned by m1 has no reference left , gc can free it 
		
	} 
	
	static Test m1(Test temp) 
	{ 
		temp = new Test(); 
		// unlike c++ functions can return objects,
		// because object was created on heap and the reference to that
		// newly created object is returned 
		// and this object is not destroyed when the function ends 
		return temp; 
	} 
} 

// Question :
// How many objects are eligible for garbage collection after execution of line 8?
// Answer : 1


// Which of the following is FALSE about finally block?
// a) For each try block, there can be only 1 finally block.
// b) finally block will not be executed if program exits by calling System.exit();
// c) If an exception is not handled in the catch statement, before terminating the program, JVM executes the finally block
// d) finally block contains important code segment and so the code inside finally block is executed with/without the presence of try block in java code.

// Answer (d)



// Compilation error - static function cannot access non-static function 
class Main { 
	public static void main(String args[]) {    
	    System.out.println(fun()); 
	}  
	int fun() { 
	    return 20; 
	}  
} 


// Compilation Error
// They cannot access this or super . For example, the following program fails in compilation.
class Base { 
    static int x = 0;        
}    
  
class Derived extends Base  
{ 
   public static void fun() { 
       System.out.println(super.x); // Compiler Error: non-static variable  
                                  // cannot be referenced from a static context 
   }    
} 








// SET 12, 13 remaining 