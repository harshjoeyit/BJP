
// What is deadly diamond problem?
// The ambiguity is, classes B and C inherits from class A, and class D inherits 
// from the classes B and C. If there is a method in class A, both the B and C classes 
// and overriding the method and D doesn’t override it.

// Deadly Diamond resolved by Interfaces and default methods

interface DemoInterface1 {
      public default void display() {
            System.out.println("the display() method of DemoInterface1 invoked");
      }
}

interface DemoInterface2 {
      public default void display() {
            System.out.println("the display() method of DemoInterface2 invoked");
      }
}

class DemoClass implements DemoInterface1, DemoInterface2 {
      public void display() {
            DemoInterface1.super.display();
            DemoInterface2.super.display();
      }

      public static void main(String args[]) {
            DemoClass obj = new DemoClass();
            obj.display();
      }
}

// Another Example

interface DemoInterface {
      // default method
      default void display() {
            System.out.println("The dispaly() method invoked");
      }
}

// interface without default method
interface DemoInterface1 extends DemoInterface {

}

// interface without default method
interface DemoInterface2 extends DemoInterface {

}

// implementation class code
class DemoClass implements DemoInterface1, DemoInterface2 {
      public static void main(String args[]) {
            DemoClass obj = new DemoClass();
            // calling method
            obj.display();
      }
}