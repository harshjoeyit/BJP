

// Performing Same task by multiple threads 
// Each thread run in a separate callstack.

class TestMultitasking1 extends Thread{  
      public void run(){  
            System.out.println("task one");  
      }   
}  

class TestMultitasking2 implements Runnable{  
      public void run(){  
            System.out.println("task one");  
      }
}


// Performing Different task by multiple threads 

class Simple1 extends Thread{  
      public void run(){  
            System.out.println("task one");  
      }  
}  

class Simple2 extends Thread{  
      public void run(){  
            System.out.println("task two");  
      }  
}  

class Test {
      public static void main(String args[]){  
            TestMultitasking1 t1=new TestMultitasking1();  
            TestMultitasking1 t2=new TestMultitasking1();  
            t1.start();  
            t2.start();  
            
            Thread t3 =new Thread(new TestMultitasking2());//passing annonymous object of TestMultitasking2 class  
            Thread t4 =new Thread(new TestMultitasking2());  
            t3.start();  
            t4.start();  
            
            Simple1 t5=new Simple1();  
            Simple2 t6=new Simple2();  
            t5.start();  
            t6.start();  
            
            // Using Anonymous class 
            
            Thread t7 = new Thread(){  
                  public void run(){  
                        System.out.println("task one");  
                  }  
            };  
            Thread t8 = new Thread(){  
                  public void run(){  
                        System.out.println("task two");  
                  }  
            };  
            
            t7.start();  
            t8.start(); 
            
            Runnable r1=new Runnable(){  
                  public void run(){  
                        System.out.println("task one");  
                  }  
            };  
            
            Runnable r2=new Runnable(){  
                  public void run(){  
                        System.out.println("task two");  
                  }  
            };  
            
            Thread t9=new Thread(r1);  
            Thread t10=new Thread(r2);  
            
            t9.start();  
            t10.start();
      } 
}