

// What if you want to add more methods to an interface 
// Of course we cannot change the old interface as those implementing it would cause problem 
// what to do 

interface IFace1 {
	public void method1();
}

// 1. make another interface and implement the old one 
interface IFace1Plus extends IFace1 {
	public void method1();
}
// now user can either choose to implement old Interface or the new One



// 2. use default method 

interface IFace2 {
	public void method1();
	default void method2() {
		System.out.println("default method of Interface 2\n");
	}
}

class Demo1 implements IFace2 {
	public void method1() {
		System.out.println("method 1 implemented in Demo 1\n");
	}
	// we can choose whether to overridde
	// it according to our need or not 
	// if we do not it will not break the code 
	public void method2() {
		System.out.println("method 2 implemented in Demo 2\n");
	}
}


class Test {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.method1();
		// default method present 
		d1.method2();
	}
}


// 3. we can use static method just as default 



// Hence 
// It is wrong to say no method is implemeted in an interface 