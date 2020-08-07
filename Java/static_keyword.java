
// read summary 
// https://docs.oracle.com/javase/tutorial/java/IandI/override.html


// methods with the same name 
class ClassA {
	public void methodOne(int i) {
	}
	public void methodTwo(int i) {
	}
	public static void methodThree(int i) {
	}
	public static void methodFour(int i) {
	}
}

class ClassB extends ClassA {
	// compile time error
	// public static void methodOne(int i) {
	// }
	// overrides 
	public void methodTwo(int i) {
	}
	// compile time error 
	// public void methodThree(int i) {
	// }
	// hides the ClassA parent method 
	public static void methodFour(int i) {
		// super.methodFour(11);
		// IMP
		// error: non-static variable super cannot be referenced from a static context
	}
}



class Bicycle {
        
	private int cadence;
	private int gear;
	private int speed;
	private int id;

	// associated with class not objects
	private static int numberOfBicycles = 0;
	    
	public Bicycle(int startCadence, int startSpeed, int startGear){
	    gear = startGear;
	    cadence = startCadence;
	    speed = startSpeed;
  
	    // increment number of Bicycles
	    // and assign ID number
	    id = ++numberOfBicycles;
	}
	
	// instance methods can access instance varibales 
	public int getID() {
	    return id;
	}

	// instance methods can access static member 
	public int getNumBicycles() {
		return numberOfBicycles;
	}    

	public static int getNumberOfBicycles() {
		return numberOfBicycles;
	}

	// not allowed to access non-static variables from static methods
	// public static int returnId() {
	// 	return id;
	// }
}

class Test {
	public static void main(String[] args) {
		Bicycle b = new Bicycle(2, 3, 4);
		
		// can be accessed with class name 
		System.out.println(Bicycle.getNumberOfBicycles());
		// instance methods can access static variables 
		// but is not recommended
		System.out.println(b.getNumBicycles());

		b.getID();

	}
}


/* 
A common use for static methods is to access static fields. 

-  static fields are also called class variables 
-  static methods are also called class methods

-  Instance methods can access instance variables and instance methods directly.
-  Instance methods can access class variables and class methods directly.
-  Class methods can access class variables and class methods directly
-  Class methods cannot access instance variables or instance methods directly—they must use an object reference. 
-  Also, class methods cannot use the this keyword as there is no instance for this to refer to.


- The static modifier, in combination with the final modifier, is also used to define constants. 
The final modifier indicates that the value of this field cannot change.
- Example: static final double PI = 3.141592653589793;

*/


