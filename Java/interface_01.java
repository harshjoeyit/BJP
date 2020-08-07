/*
The public access specifier indicates that the interface can be used by any class in any package. 
If you do not specify that the interface is public, then your interface is accessible only to classes 
defined in the same package as the interface.

An interface can extend other interfaces, just as a class subclass or extend another class. 
However, whereas a class can extend only one other class, an interface can extend any number 
of interfaces. The interface declaration includes a comma-separated list of all the interfaces 
that it extends.

The Interface Body

The interface body can contain abstract methods, default methods, and static methods. An abstract
method within an interface is followed by a semicolon, but no braces (an abstract method does not 
contain an implementation). Default methods are defined with the default modifier, and static 
methods with the static keyword. All abstract, default, and static methods in an interface are 
implicitly public, so you can omit the public modifier.

In addition, an interface can contain constant declarations. All constant values defined in 
an interface are implicitly public, static, and final. Once again, you can omit these modifiers.
*/

interface Workable {
	void doWork();
}

class Plumber implements Workable {
	
	/**
	This method is overriden.
	*/
	public void doWork() {
		System.out.println("I am here to fix the toiletries.");
	}
	
	// Other methods.
}

class Cook implements Workable {
	
	/**
	This method is overriden.
	*/
	public void doWork() {
		System.out.println("I am here to cook delicious food.");
	}
	
	// Other methods.
}

class Electrician implements Workable {
	
	/**
	This method is overriden.
	*/
	public void doWork() {
		System.out.println("I am here to fix all electrical appliances.");
	}
	
	// Other methods.
}

class Painter implements Workable {
	
	/**
	This method is overriden.
	*/
	public void doWork() {
		System.out.println("I am here to paint the house with vibrant colours.");
	}
	
	// Other methods.
}


// .................... here is another interface 

interface Relatable {
	// this (object calling isLargerThan) and other must be instances of 
	// the same class returns 1, 0, -1 if this is greater than, equal to, or less than other
	public int isLargerThan(Relatable other);
}

class RectanglePlus implements Relatable {
	public int width = 0;
	public int height = 0;
	
	public RectanglePlus(int w, int h) {
		width = w;
		height = h;
	}
	
	// the area of the rectangle
	public int getArea() {
		return width * height;
	}
	
	// a method required to implement the Relatable interface
	public int isLargerThan(Relatable other) {
		RectanglePlus otherRect = (RectanglePlus)other;
		if (this.getArea() < otherRect.getArea())
			return -1;
		else if (this.getArea() > otherRect.getArea())
			return 1;
		else
			return 0;               
	}
}


class Test {
	public static void main(String args[]) {
		Workable[] workers = new Workable[4];
		workers[0] = new Painter();
		workers[1] = new Plumber();
		workers[2] = new Cook();
		workers[3] = new Electrician();
		
		for(Workable w: workers) {
			w.doWork();
		}

		// .. relatable interface 
		RectanglePlus r1 = new RectanglePlus(5, 6);
		System.out.println(r1.isLargerThan(new RectanglePlus(5, 6)));
	} 
}