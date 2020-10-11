
/*

Thread Priority - 

- Default priority of the thread depends upon the parent class 
- By default the priority is 5 - NORM_PRIORITY (of main thread)
can be between MIN_PRIORITY (0) <= p <= MAX_PRIORITY(10) 

- Higher priority threads get more access to resources than the
lower priority threads 
- Thread with highest priority will get execution chance prior to 
other threads. 

- If two threads have same priority then we can’t expect which thread 
will execute first. It depends on thread scheduler’s algorithm(Round-Robin, First Come First Serve, etc

- If we are using thread priority for thread scheduling then 
we should always keep in mind that underlying platform 
should provide support for scheduling based on thread 
priority

*/


class A extends Thread {
      public A (String name, int p) {
            this.setName(name);
            this.setPriority(p);
      }
      public void run() {
            for(int i=0; i<10; i++) {
                  System.out.println(this.getName() + " " + i);
            }
      }
}
class B extends Thread {
      public B (String name, int p) {
            this.setName(name);
            this.setPriority(p);
      }
      public void run() {
            for(int i=0; i<10; i++) {
                  System.out.println(this.getName() + " " + i);
            }
      }
}
class C extends Thread {
      public C (String name, int p) {
            this.setName(name);
            this.setPriority(p);
      }
      public void run() {
            for(int i=0; i<10; i++) {
                  System.out.println(this.getName() + " " + i);
            }
      }
}

class Test {
      public static void main(String[] args) {
          Thread obj1, obj2, obj3;
          obj1 = new A("A", 10);
          obj2 = new B("B", 5);
          obj3 = new C("C", 1);
          
          obj1.start();
          obj2.start();
          obj3.start();
      }
}