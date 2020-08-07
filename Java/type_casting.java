
class Animal {
	public void speak() {
		System.out.println("idk what to speak...");
	}
}

class Cat extends Animal {
	public void speak() {
		System.out.println("meoww...");
	}
}

class Test {
	public static void main(String[] args) {
		// implicit casting 
		Object obj = new Cat();
		Animal a = new Cat();

		// obj.speak();
		// wrong to write this since speak is not defined int object class 
		a.speak();

		// below two statements are valid only if 
		// obj instanceof Cat  = true
		// a instanceof Cat  = true
		
		// that means they are reference to cat object
		
		Cat c1 = (Cat)obj;
		Cat c2 = (Cat)a;

		// This cast inserts a runtime check that obj is assigned a 
		// Cat so that the compiler can safely assume that obj is a Cat. 
		// If obj is not a Cat at runtime, an exception will be thrown. 
		
		

		c1.speak();
		c2.speak();

	}
}

