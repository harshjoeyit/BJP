import java.util.Scanner;

import java.util.*;

class A extends Thread {
      public void run() {
            Scanner enter = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                  System.out.println(Thread.currentThread().getName() + " waiting for input");
                  int x = enter.nextInt();
                  System.out.println(Thread.currentThread().getName() + " " + x);
            }
      }

      public static void main(String[] args) {
            Thread t1 = new A();
            Thread t2 = new A();
            t1.start();
            t2.start();
      }
}