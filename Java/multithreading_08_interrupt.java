
/*

Interrupting a Thread:
If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked), 
calling the interrupt() method on the thread, breaks out the sleeping or waiting 
state throwing InterruptedException. 
IMP: 
If the thread is not in the sleeping or 
waiting state, calling the interrupt() method performs normal behaviour and 
doesn't interrupt the thread but sets the interrupt flag to true. Let's first 
see the methods provided by the Thread class for thread interruption.

The 3 methods provided by the Thread class for interrupting a thread
 - public void interrupt()
 - public static boolean interrupted()
 - public boolean isInterrupted()


In this example, after interrupting the thread, we are propagating it, 
so it will stop working. If we don't want to stop the thread, we can handle 
it where sleep() or wait() method is invoked. Let's first see the example 
where we are propagating the exception.

*/

class Test extends Thread{  
      public void run(){  
            try{  
                  Thread.sleep(1000);  
                  System.out.println("task");  
            }catch(InterruptedException e){  
                  // we could either 
                  // - handle the exception here in catch block
                  // --- this will conyinue with the method after handling exception
                  // or 
                  // - throw it from here 
                  // --- this will stop the run method(thread becomes dead) immediately 
                  // jump back to where it was interrupted
                 
                  // here we throw 
                  throw new RuntimeException("\nThread interrupted..."+e);  
            }  
            
      }  
      
      public static void main(String args[]){  
            Test t1=new Test();  
            t1.start();  
            try{  
                  t1.interrupt();  
            }catch(Exception e){System.out.println("\nException handled "+e);}  
            
      }  
} 