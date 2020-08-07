
/* 
Nested classes are divided into two categories: static and non-static.
Nested classes that are declared static are called static nested 
classes. Non-static nested classes are called inner classes.

Why use nested class ???

1. If a class is useful to only one other class, then it is logical 
to embed it in that class and keep the two together. Nesting such 
"helper classes" makes their package more streamlined.

2. increases encapsulation

3. more readable and maintainable code 


Non-static nested classes (inner classes) 

have access to other members of the enclosing class, even if 
they are declared private.Static nested classes do not have 
access to other members of the enclosing class. As a member 
of the OuterClass, a nested class can be declared private, 
public, protected, or package private.

As with instance methods and variables, an inner class is associated 
with an instance of its enclosing class and has direct access to that
 object's methods and fields. Also, because an inner class is 
 associated with an instance, it cannot define any static members 
 itself.

An instance of InnerClass can exist only within an instance of 
OuterClass and has direct access to the methods and fields of 
its enclosing instance.

OuterClass.InnerClass innerObject = outerObject.new InnerClass()

Static nested classes

And like static class methods, a static nested class cannot refer 
directly to instance variables or methods defined in its enclosing 
class: it can use them only through an object reference.

Static nested classes are accessed using the enclosing class name:
OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();


When to use ??

Use a non-static nested class (or inner class) if you require access 
to an enclosing instance's non-public fields and methods. Use a static
 nested class if you don't require this access.
*/

class Outer {
	private static int a = 4;
	private int b = 3;
	public int c = 10;
	public int z = 0;

	static class StaticNested {
		StaticNested() {
			a = 5;
		}
		public int a;
		void methodInStatic() {
			System.out.println("method in static");
			System.out.println("static nested a: " + this.a);
			// this is not used since it is non-static context 
			System.out.println("outer a: " + Outer.a);
			// non static val cannot be accessed
			// outerMethod();
			outerStaticMethod();
		}
	}

	class Inner {
		Inner() {
			z = 1;
		}
		public int d;
		public int z;
		void methodInInner(int z) {
			System.out.println("z = " + z);
			System.out.println("this.z = " + this.z);
			//z is referenced from non -static context as this is used 
			System.out.println("Outer.this.z = " + Outer.this.z);
			// can access stativ and non static method
			outerMethod();
			outerStaticMethod();
		}
	}

	public void outerMethod() {
		System.out.println("outer method");
	}

	public static void outerStaticMethod() {
		System.out.println("outer static method");
	}
}

class Test {
	public static void main(String[] args) {
		Outer outerObj = new Outer();
		Outer.Inner innerObj = outerObj.new Inner();
		innerObj.methodInInner(10);

		System.out.println(".........................");

		Outer.StaticNested nestedStaticObj = new Outer.StaticNested();
		nestedStaticObj.methodInStatic();
	}
}