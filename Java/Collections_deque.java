
// Collections - Dque

import java.util.*;

class Test {
	public static void main(String[] args) throws InterruptedException {
		
		// classes that implement the Deque interface
		// > ArrayDeque
		// > LinkedList 
		
		// Insert
		// > The addfirst and offerFirst methods insert elements at the beginning of the Deque instance
		// > When the capacity of the Deque instance is restricted, the preferred 
		// methods are offerFirst and offerLast because addFirst might fail to throw an exception if it is full.
		
		// Remove
		// > The removeFirst and pollFirst methods remove elements from the beginning of the Deque instance. 
		// > The removeLast and pollLast methods remove elements from the end. 
		// > pollFirst and pollLast return null if the Deque is empty
		// > removeFirst and removeLast throw an exception if the Deque instance is empty.
	
		// Retrieve
		// > The methods getFirst and peekFirst retrieve the first element of the Deque instance.  
		// > Similarly, the methods getLast and peekLast retrieve the last element. 
		// > getFirst and getLast throw an exception if the deque instance is empty 
		// > peekFirst and peekLast return NULL.
	}
}