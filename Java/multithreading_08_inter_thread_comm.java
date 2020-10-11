

/* 

Inter-thread communication in Java
Inter-thread communication or Co-operation is all about allowing synchronized threads 
to communicate with each other.

Cooperation (Inter-thread communication) is a mechanism in which a thread is paused 
running in its critical section and another thread is allowed to enter (or lock) in 
the same critical section to be executed.It is implemented by following methods of 
Object class:

wait()
notify()
notifyAll()



1) wait() method
Causes current thread to release the lock and wait until either another thread 
invokes the notify() method or the notifyAll() method for this object, or a 
specified amount of time has elapsed.

The current thread must own this object's monitor, so it must be called from 
the synchronized method only otherwise it will throw exception.


2) notify() method
Wakes up a single thread that is waiting on this object's monitor. If any 
threads are waiting on this object, one of them is chosen to be awakened. 
The choice is arbitrary and occurs at the discretion of the implementation. 
Syntax:
public final void notify()


3) notifyAll() method
Wakes up all threads that are waiting on this object's monitor. Syntax:
public final void notifyAll()


Why wait(), notify() and notifyAll() methods are defined in Object class 
not Thread class?
It is because they are related to lock and object has a lock.

*/


class Customer{  
      int amount=10000;  
      
      synchronized void withdraw(int amount){  
            System.out.println("going to withdraw...");  
            
            if(this.amount<amount){  
                  System.out.println("Less balance; waiting for deposit...");  
                  try{wait();}catch(Exception e){}  
            }  
            this.amount-=amount;  
            System.out.println("withdraw completed...");  
      }  
      
      synchronized void deposit(int amount){  
            System.out.println("going to deposit...");  
            this.amount+=amount;  
            System.out.println("deposit completed... ");  
            notify();  
      }  
}  

class Test{  
      public static void main(String args[]){  
            // Note there is single customer object 
            final Customer c = new Customer();  
            new Thread(){  
                  public void run(){c.withdraw(15000);}  
            }.start();  
            new Thread(){  
                  public void run(){c.deposit(10000);}  
            }.start();  
            
      }}  