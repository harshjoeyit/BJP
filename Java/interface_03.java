
/* 
Default methods and abstract methods in interfaces are inherited like instance methods. 
However, when the supertypes of a class or interface provide multiple default methods 
with the same signature, the Java compiler follows inheritance rules to resolve the name 
conflict. These rules are driven by the following two principles:
*/

// >> Instance methods are preferred over interface default methods.

class Horse {
	public String identifyMyself() {
		return "I am a horse.";
	}
}
interface Flyer {
	default public String identifyMyself() {
		return "I am able to fly.";
	}
}
interface Mythical {
	default public String identifyMyself() {
		return "I am a mythical creature.";
	}
}

// class Pegasus extends Horse implements Flyer, Mythical {
// 	public static void main(String... args) {
// 		Pegasus myApp = new Pegasus();
// 		System.out.println(myApp.identifyMyself());
// 		// prints I am a horse 
// 	}
// }


// >> Methods that are already overridden by other candidates are ignored. 
// This circumstance can arise when supertypes share a common ancestor.


interface Animal {
	default public String identifyMyself() {
	    	return "I am an animal.";
	}
}
  
interface EggLayer extends Animal {
	default public String identifyMyself() {
	    	return "I am able to lay eggs.";
	}
}
  
interface FireBreather extends Animal { }
 
// class Dragon implements EggLayer, FireBreather {
// 	public static void main (String... args) {
// 	    	Dragon myApp = new Dragon();
// 	    	System.out.println(myApp.identifyMyself());
// 	}
// }


// >> If two or more independently defined default methods conflict, or a default method conflicts with an abstract method, 
// then the Java compiler produces a compiler error. You must explicitly override the supertype methods.


public interface OperateCar {
	// ...
	default public int startEngine(EncryptedKey key) {
	    // Implementation
	}
  }
  public interface FlyCar {
	// ...
	default public int startEngine(EncryptedKey key) {
	    // Implementation
	}
  }

  public class FlyingCar implements OperateCar, FlyCar {
	// ...
	public int startEngine(EncryptedKey key) {
	    FlyCar.super.startEngine(key);
	    OperateCar.super.startEngine(key);
	}
  }




// >> Inherited instance methods from classes can override abstract interface methods. 
// Consider the following interfaces and classes:
int
// >> Note: Static methods in interfaces are never inherited.

public interface Mammal {
    String identifyMyself();
}
public class Horse {
    public String identifyMyself() {
        return "I am a horse.";
    }
}
public class Mustang extends Horse implements Mammal {
    public static void main(String... args) {
        Mustang myApp = new Mustang();
	  System.out.println(myApp.identifyMyself());
	  // print I am a horse 
    }
}