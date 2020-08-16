
// Collections - Queue

import java.util.*;
import java.util.stream.*;

class Test {
	public static void main(String[] args) throws InterruptedException {
		
		// The remove and poll methods 
		// both remove and return the head of the queue.  
		// When queue is empty, 
		// remove throws NoSuchElementException, 
		// poll returns null


		// The element and peek methods 
		// return, but do not remove, the head of the queue. 
		// If the queue is empty, 
		// element throws NoSuchElementException, 
		// peek returns null.

		// it permits null elements, but should not be used since peek and poll return null, can be misleading.

		Queue<Integer> queue = new LinkedList<Integer>();
        	for (int i = 5; i >= 1; i--)
        	    queue.add(i);

        	while (!queue.isEmpty()) {
        	    System.out.print(queue.remove() + " ");
        	    Thread.sleep(250);
		  }
		  System.out.println();


		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(34);
		pq.add(12);
		pq.add(23);

		while (!pq.isEmpty()) {
        	    System.out.print(pq.remove() + " ");
        	    Thread.sleep(250);
        	}

	}
}