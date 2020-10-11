
/* 
The join() 
method waits for a thread to die. In other words, 
it causes the currently running threads to stop executing 
until the thread it joins with completes its task.
*/

class Test extends Thread {    
      public static void main(String args[]){  
            Test t1 = new Test();  
            Test t2 = new Test();  
            Test t3 = new Test();  
            
            t1.start(); 
            try{  
                  // uncomment one by one
                  System.out.println("paused thread: " + Thread.currentThread().getName());
                  // stops the main thread, executes itself completely 
                  // t1.join();
                  // stops the main thread for 800 ms only 
                  // t1.join(800); 
            } catch (Exception e) {
                  e.printStackTrace();
            }
            
            System.out.println(t1.getName() + " " + t1.getState());
            // t1 is dead before main threads calls start on t2 and t3

            t2.start();  
            t3.start();  
      }
      
      public void run(){  
            Thread curr = Thread.currentThread();
            System.out.println(curr.getName() + " " + curr.getState());
            for(int i=1;i<=5;i++){  
                  try{  
                        Thread.sleep(200);  
                  }catch(Exception e){System.out.println(e);}  
                  System.out.println(i);  
            }  
      } 
} 