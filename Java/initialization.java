
/* 
 Instance variables can be initialized in constructors, where error handling or other logic 
 can be used. To provide the same capability for class variables, the Java programming language 
 includes static initialization blocks.

A class can have any number of static initialization blocks, and they can 
appear anywhere in the class body. The runtime system guarantees that 
static initialization blocks are called in the order that they appear 
in the source code.

*/

class One {
	public static int var2;
	public static int var1 = initClassVar();
	private int var3;
	private int var4;

	// alternative to static blocks
	// private static method 
	// The advantage of private static methods is that they 
	// can be reused later if you need to reinitialize the class variable.
	private static int initClassVar() {
		System.out.println("private static method");
		return 10;
	}

	static {
		System.out.println("static block");
		var2 = 10;
	}

	// initializer block
	// The Java compiler copies initializer blocks into every 
	// constructor. 
	// Therefore, this approach can be used to 
	// share a block of code between multiple constructors.
	{
		System.out.println("initializer block");
		var3 = 30;
	}

	// final method
	// This is especially useful if subclasses might want to reuse
	// the initialization method. The method is final because 
	// calling non-final methods during instance initialization 
	// can cause problems.
	protected final int initInstanceVar() {
		System.out.println("final method block");
		return 40;
	}

	public One() {
		System.out.println("constructor");
		// we can choose when to invoke initializer block
		var4 = initInstanceVar();
	}
}

class Two {
	public static int var1;
	public static int var2 = initClassVar();
	static {
		var1 = 10;
		System.out.println("static block of 2");
	}

	private static int initClassVar() {
		System.out.println("private static method of 2");
		return 29;
	}
}

class Test {
	public static void main(String[] args) {
		// this line invokes the static block and private static method  
		System.out.println(One.var1);
		// same with this line
		System.out.println(Two.var2);

		// invokes the initializer block and constructor 
		One obj = new One();
	}
}

