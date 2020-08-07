class Superclass {
	String f1;
	Superclass(String f1) {
		this.f1 = f1;
		System.out.println("super class constructor");
	}
	public void printMethod() {
	    System.out.println("PrintedMethod in Superclass.");
	}
}

class Subclass extends Superclass {
	String f2;
	Subclass(String f1, String f2) {
		// Invocation of a superclass constructor must be the first line in the subclass constructor.
		// With super(), the superclass no-argument constructor is called. With super(parameter list), 
		// the superclass constructor with a matching parameter list is called.
		super(f1);
		this.f2 = f2;
		System.out.println("sub class constructor");
	}
	// overrides printMethod in Superclass
	public void printMethod() {
		System.out.println("Calling super calss method in sub class");
		// calling instance method of supperclass may not the first line 
	    	super.printMethod();
	    	System.out.println("call finished ");
	}
}

/* 
Note: If a constructor does not explicitly invoke a superclass constructor, 
the Java compiler automatically inserts a call to the no-argument constructor of the superclass. 
If the super class does not have a no-argument constructor, you will get a compile-time error. 
Object does have such a constructor, so if Object is the only superclass, there is no problem.
*/

class SubClass2 extends Superclass {
	SubClass2() {
		// implicitly calls super()
		// but such a constructor with no args is not present in superclass 
		// raises error 
		// so make a constructor in super class with no args 
		System.out.println("sub class constructor");
	}
}

class Test {
	public static void main(String[] args) {
		Superclass s = new Subclass("one", "two");
		// Superclass s1 = new SubClass2();
	}
}