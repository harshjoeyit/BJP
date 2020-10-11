
/* 
Daemon thread 
in java is a service provider thread that provides services
to the user thread. Its life depend on the mercy of user 
threads i.e. when all the user threads dies, JVM terminates 
this thread auomatically.

There are many java daemon threads running automatically 
e.g. gc, finalizer etc.

> Points to remember for Daemon Thread in Java

- It provides services to user threads for background supporting tasks. 
- It has no role in life than to serve user threads.
- Its life depends on user threads.
- It is a low priority thread.

> Why JVM terminates the daemon thread if there is no user thread?
- thier onlyl task is to support the user thread, so if there is no 
thread, then it is meaningless to keep the deamon thread alive

>> methods - 
- setDaemon()
- isDaemon()

>> Note: If you want to make a user thread as Daemon, it must not be in 
running state already otherwise it will throw java.lang.IllegalThreadStateException

Thread can only be set Daemon if start() is not called yet
*/

class Test extends Thread{  
      public void run(){  
            if(Thread.currentThread().isDaemon()){
                  //checking for daemon thread  
                  System.out.println("daemon thread work");  
            }  
            else{  
                  System.out.println("user thread work");  
            }  
      }  
      public static void main(String[] args){  
            Test t1=new Test(); 
            Test t2=new Test();  
            Test t3=new Test();

            //now t1 is daemon thread  
            t1.setDaemon(true);
            
            t1.start();
            t2.start();  
            t3.start();  
      }  
}  