
/* 
Synchronization 

- One Situation could be a ticket booking system 
where seperate thread runs for every person booking the ticket 
so we would want the synchronization in the system 

- A situation may arrive when different threads access the same 
resource, what happens then 

Example 
- 2 people have a joint account 
- each one goes and withdraws money from that account 
- two threads run for withdraw 
- money may be less than what both want to withdraw, 
then data corruption is possible 

- so whenever we have a situation where more than one thread 
access a shared resource - we want others threads to be waiting
if one is already accessing 

- it is called synchronization 

*/

import java.util.Scanner;

class Account {
	private int bal;
	public Account(int bal) {
		this.bal = bal;
	}
	public boolean isSufficientBal(int amount) {
		if(bal > amount) {
			return true;
		}
		return false;
	}
	public void withdraw(int amount) {
		bal = bal-amount;
		System.out.println("withdraw: " + amount);
		System.out.println("balance is: " + bal);
	}
}

class Customer implements Runnable {
	private String name;
	private Account account;
	public Customer(Account account, String name) {
		this.account = account;
		this.name = name;
	}
	public void run() {
		Scanner enter = new Scanner(System.in);
		
		// account is the shared resource 
		// synchronize it 
		synchronized(account) {
			System.out.println(this.name + ", Enter Amount to withdraw: ");
			int amount = enter.nextInt();
			// shared resource among threads is account 
			// so we sychronize it 
			if(account.isSufficientBal(amount)) {
				System.out.println(this.name);
				account.withdraw(amount);
			} else {
				System.out.println("In sufficient balance");
			}
		}
	}
}


// static synchronization
// In simple words a static synchronized method will lock the class instead of the object, 
// and it will lock the class because the keyword static means: "class instead of instance".
// Only one thread can access the class at one time.

class Table{  
      synchronized static void printTable(int n){  
            for(int i=1;i<=10;i++){  
                  System.out.println(n*i);  
                  try{  
                        Thread.sleep(100);  
                  }catch(Exception e){}  
            }  
      }  
      synchronized public void print() {
            System.out.println("Sync Method!");
            for(int i=0; i<10; i++) {
                  System.out.println(i);
                  try {
                        Thread.sleep(100);
                  } catch (Exception e) {
                        e.printStackTrace();
                  }
            }
      }
}  

class MyThread1 extends Thread{  
      public void run(){  
            Table.printTable(1);  
      }  
}  
class MyThread2 extends Thread{  
      public void run(){  
            Table.printTable(10);  
      }  
}  
class MyThread3 extends Thread{  
      public void run(){  
            Table.printTable(100);  
      }  
}  
class MyThread4 extends Thread{  
      public void run(){  
            Table.printTable(1000);  
      }  
} 

// sync method

class SyncMethodTest extends Thread {
      Table t;
      SyncMethodTest(Table t) {
            this.t = t;
      }
      public void run() {
            t.print();
      }
}



class Test {
	public static void main(String[] args) {
		// without synchronization 
		// the balance somethimes reaches negetive 
		// this is because the function isSufficientBal is 
		// run parallel for both threads and returns true fro both
		
		// Account acc = new Account(1000);
		// Customer c1 = new Customer(acc, "Raj");
		// Customer c2 = new Customer(acc, "Simran");
		// Thread th1 = new Thread(c1);
		// Thread th2 = new Thread(c2);
		
		// th1.start();
		// th2.start();



		// sync class 

            // MyThread1 t1=new MyThread1();  
            // MyThread2 t2=new MyThread2();  
            // MyThread3 t3=new MyThread3();  
            // MyThread4 t4=new MyThread4();  
            // // any thread may acquire the lock first 
            // // but keeps the lock untill job is done 
            // t1.start();  
            // t2.start();  
            // t3.start();  
            // t4.start();  
		
		
            
		// sync method 
		
            // // note that both the threads are working on the SAME table OJECT 
            // // if objects are differnt locks are different and thread can run in parallel
            // Table t = new Table();
            // Thread obj1 = new SyncMethodTest(t);
            // Thread obj2 = new SyncMethodTest(t);
            
            // obj1.start();
            // obj2.start();
		
	}
}