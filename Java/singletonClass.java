// Java program implementing Singleton class 
// with getInstance() method 
class Singleton 
{ 
	// static variable singleInstance of type Singleton 
	private static Singleton singleInstance = null; 

	// variable of type String 
	public String s; 

	// private constructor restricted to this class itself 
	private Singleton() 
	{ 
		s = "Hello I am a string part of Singleton class"; 
	} 

	// static method to create instance of Singleton class 
	// this is called lazy initialization - since we are not creating object staright away
	public static Singleton getInstance() 
	{ 
		if (singleInstance == null) {
			// if no object of the class is created 
			// this is the first object created 
			singleInstance = new Singleton(); 
		}

		// all refrence variables point to the same object created first time;
		return singleInstance; 
	} 
} 

// Driver Class 
class Main 
{ 
	public static void main(String args[]) 
	{ 
		// instantiating Singleton class with variable x 
		Singleton x = Singleton.getInstance(); 

		// instantiating Singleton class with variable y 
		Singleton y = Singleton.getInstance(); 

		// instantiating Singleton class with variable z 
		Singleton z = Singleton.getInstance(); 

		// changing variable of instance x 
		// changes all other 
		x.s = (x.s).toUpperCase(); 

		System.out.println("String from x is " + x.s); 
		System.out.println("String from y is " + y.s); 
		System.out.println("String from z is " + z.s); 
		System.out.println("\n"); 

		// changing variable of instance z 
		// changes all other 
		z.s = (z.s).toLowerCase(); 

		System.out.println("String from x is " + x.s); 
		System.out.println("String from y is " + y.s); 
		System.out.println("String from z is " + z.s); 
	} 
} 
