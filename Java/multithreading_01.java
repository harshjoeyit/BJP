
/*

Thread is an independent path of execution within a program 
Multithreading refers to rwo or more threads executing concurrently within a single program 

Tasks that can be done in parallel can use threads 
Example finding the cost of painting the room
A thread can calculate the area 
Another thread can choose the color 
then the area can be calculated 



java.lang.Thread
java.lang.Runnable 

one of the constructor of thread class is 
public Thread(Runnable target, String name) {
      this(null, target, name, 0);
}
the parameter tells us that object of any class that 
implements Runnable interface can be passed as argument 
IMP: the refrence type can be of Runnable or Class that implements runnable 



>> Can start() method be called 2 times on a thread ?
No. After starting a thread, it can never be started again. 
If you does so, an IllegalThreadStateException is thrown. 
In such case, thread will run once but for second time, 
it will throw exception.

>> Significance of start() method 
- creates a seperate call stack

*/
class C implements Runnable {
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println("i = " + i + " Thread-C");
		}
	}
}

class D implements Runnable {
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println("i = " + i + " Thread-D");
		}
	}
}


class A extends Thread {
	public A(String name) {
		this.setName(name);
	}
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println("i = " + i + this.getName());
		}
	}
}

class B extends Thread {
	public B(String name) {
		this.setName(name);
	}
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println("i = " + i + this.getName());
		}
	}
}


class TestCallRun2 extends Thread{  
      public void run(){  
            for(int i=1;i<5;i++){  
                  try{Thread.sleep(200);}catch(InterruptedException e){System.out.println(e);}  
                  System.out.println(i);  
            }  
      }  
}



class Test {
	public static void main(String[] args) {
		
		// Using Runnable interface 

		// Runnable obj1 = new C();
		// Runnable obj2 = new D();
		// Thread t1 = new Thread(obj1, "Thread-C");
		// Thread t2 = new Thread(obj2, "Thread-D");
		// t1.start();
		// t2.start();
		
		
		// Using Thread class

		// A obj1 = new A("Thread A");
		// B obj2 = new B("Thread B");
		// obj1.start();
		// obj2.start();

		// since A and B are child class of Thread 
		// they inherit all the methods of Thread class 
		// so simply we can call start on these objects starightaway

		// Thread obj1 = new A("Thread-A");
		// Thread obj2 = new B("Thread-B");
		// obj1.start();
		// obj2.start();

		// We can even use polymorphism here since Thread is parent class
	


		// What if we call run method directly and dont call start method?
		// TestCallRun2 t1=new TestCallRun2();  
            // TestCallRun2 t2=new TestCallRun2();  
            
            // t1.run();  
            // t2.run(); 

		// IMPORTANT 
		// It is fine, but does not start a separate call stack  
		// there is no context-switching because here t1 and 
		// t2 will be treated as normal object not thread object.
	}
}