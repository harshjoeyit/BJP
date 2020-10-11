
/* 
Java Thread pool 
represents a group of worker threads that 
are waiting for the job and reuse many times.

In case of thread pool, a group of fixed size threads are created.
A thread from the thread pool is pulled out and assigned a job 
by the service provider. After completion of the job, thread 
is contained in the thread pool again.

Advantage of Java Thread Pool
Better performance It saves time because there is no need to create new thread.

Real time usage
It is used in Servlet and JSP where container creates a thread pool to process the request.





Thread Group 
Java provides a convenient way to group multiple threads in a single object. 
In such way, we can suspend, resume or interrupt group of threads by a single method call.
Java thread group is implemented by java.lang.ThreadGroup class.

Note: Now suspend(), resume() and stop() methods are deprecated.

A ThreadGroup represents a set of threads. A thread group can also include 
the other thread group. The thread group creates a tree in which every 
thread group except the initial thread group has a parent.

>> IMP: 
A thread is allowed to access information about its own thread group, but 
it cannot access the information about its thread group's parent thread 
group or any other thread groups.

*/


import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  

// Thread Pool

class WorkerThread implements Runnable {  
      private String message;  
      public WorkerThread(String s){  
            this.message=s;  
      }  
      public void run() {  
            System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
            processmessage();
            //call processmessage method that sleeps the thread for 2 seconds  
            System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
      }  
      private void processmessage() {  
            try {  Thread.sleep(2000);  } 
            catch (InterruptedException e) { e.printStackTrace(); }  
      }  
}  


// Thread Group

class ThreadGroupDemo implements Runnable{  
      public void run() {  
            System.out.println(Thread.currentThread().getName());  
      }   
} 


class Test {  
      public static void main(String[] args) {  
            // ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
            // for (int i = 0; i < 10; i++) {  
            //       Runnable worker = new WorkerThread("" + i);  
            //       // The new threads occupy the empty pool 
            //       executor.execute(worker);
            // }  
            // executor.shutdown();  
            // while (!executor.isTerminated()) {   }  
            
            // System.out.println("Finished all threads");  
            
            
            
            ThreadGroupDemo runnable = new ThreadGroupDemo();  
            ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");  
            
            Thread t1 = new Thread(tg1, runnable,"one");  
            Thread t2 = new Thread(tg1, runnable,"two");  
            Thread t3 = new Thread(tg1, runnable,"three");  
            t1.start();  
            t2.start();  
            t3.start();  
            
            System.out.println("Thread Group Name: "+tg1.getName());  
            tg1.list();
                          
      }  
}  
      
      
      