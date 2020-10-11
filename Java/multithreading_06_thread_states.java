/* 

States of thread :

New − new Thread() created
When a thread lies in the new state, it’s code is yet to be run 
and hasn’t started to execute. It is also referred to as a born thread.


Runnable − start() method called

Each and every thread runs for a short while and then pauses and 
relinquishes the CPU to another thread, so that other threads can 
get a chance to run. When this happens, all such threads that are 
ready to run, waiting for the CPU and the currently running thread 
lies in runnable state.


Blocked/Waiting − suspend()/resume(), wait()/notify()/notifyAll(), IO operations

For example, when a thread is waiting for I/O to complete, 
it lies in the blocked state. It’s the responsibility of 
the thread scheduler to reactivate and schedule a blocked/waiting thread. 
A thread in this state cannot continue its execution any further until 
it is moved to runnable state. Any thread in these states does not 
consume any CPU cycle.
A thread is in the blocked state when it tries to access a protected 
section of code that is currently locked by some other thread. 
When the protected section is unlocked, the schedule picks one of 
the thread which is blocked for that section and moves it to the 
runnable state. Happens when
- Object.wait with no timeout
- Thread.join with no timeout
- LockSupport.park


Timed Waiting − sleep()

A runnable thread can enter the timed waiting when it calls a method with 
a time out parameter. A thread lies in this state 
until the timeout is completed or until a notification is received.


Terminated (Dead) − run() is completed, stop(), unhandeled exception/seg fault

-when it completes its task or otherwise terminates. or comething like
-segmentation fault or an unhandled exception.
*/

class thread implements Runnable {
      public void run() {
            // moving THREAD2 to timed waiting state
            try {
                  Thread.sleep(1500);
            } catch (InterruptedException e) {
                  e.printStackTrace();
            }

            System.out.println("State of THREAD1 while it called join() method on THREAD2 -" + Test.THREAD1.getState());
            try {
                  Thread.sleep(200);
            } catch (InterruptedException e) {
                  e.printStackTrace();
            }
      }
}

class Test implements Runnable {
      public static Thread THREAD1;
      public static Test obj;

      public static void main(String[] args) {
            obj = new Test();
            THREAD1 = new Thread(obj);

            // THREAD1 created and is currently in the NEW state.
            System.out.println("State of THREAD1 after creating it - " + THREAD1.getState());

            THREAD1.start();
            // THREAD1 moved to Runnable state
            System.out.println("State of THREAD1 after calling .start() method on it - " + THREAD1.getState());
      }

      public void run() {
            thread myThread = new thread();
            Thread THREAD2 = new Thread(myThread);

            // THREAD2 created and is currently in the NEW state.
            System.out.println("State of THREAD2 after creating it - " + THREAD2.getState());

            THREAD2.start();
            // THREAD2 moved to Runnable state
            System.out.println("State of THREAD2 after calling .start() method on it - " + THREAD2.getState());

            // moving THREAD1 to timed waiting state
            try {
                  // moving THREAD1 to timed waiting state
                  Thread.sleep(200);
            } catch (InterruptedException e) {
                  e.printStackTrace();
            }
            System.out.println("State of THREAD2 after calling .sleep() method on it - " + THREAD2.getState());

            try {
                  // waiting for THREAD2 to die
                  THREAD2.join();
            } catch (InterruptedException e) {
                  e.printStackTrace();
            }
            System.out.println("State of THREAD2 when it has finished it's execution - " + THREAD2.getState());
      }

}
