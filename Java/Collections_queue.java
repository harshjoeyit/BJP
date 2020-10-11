
// Collections - Dque

import java.util.*;

class Test {
	public static void main(String[] args) throws InterruptedException {
		
		/* 
		
			Queue(interface)    --------> implements PriorityQueue(class)
			   |
			extends 
		         |
			Deque (interface)
			   |
			implements 
		     |                  |
		LinkedList(class), ArrayDeque(class)
		
		*/

		// ArrayDeque

		// Insert
		// > The addfirst and offerFirst methods insert elements at the beginning of the Deque instance
		// > When the capacity of the Deque instance is restricted, the preferred 
		// methods are offerFirst and offerLast because addFirst might fail to throw an exception if it is full.
		
		// Remove
		// > pollFirst and pollLast return null if the Deque is empty
		// > removeFirst and removeLast throw an exception if the Deque instance is empty.
	
		// Retrieve
		// > getFirst and getLast throw an exception if the deque instance is empty 
		// > peekFirst and peekLast return NULL.

		Deque<Integer> dq = new ArrayDeque<Integer>();
		dq.addFirst(10);
		dq.addFirst(20);	
		dq.removeLast();
		System.out.println(dq);
		
		
		// LinkedList

		// When queue is empty,
		// remove() throws NoSuchElementException,
		// poll() returns null

		// If the queue is empty,
		// element() throws NoSuchElementException,
		// peek() returns null.

		// it permits null elements, but should not be used since peek and poll return
		// null, can be misleading.

		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 5; i >= 1; i--)
			queue.add(i);

		System.out.print(queue);


		// Priority Queue

		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(34);
		pq.add(12);
		pq.add(23);

		System.out.println(pq);
	}
}