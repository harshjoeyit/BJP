
// Collections - Map

import java.util.*;

class Test {
	public static void main(String[] args) throws InterruptedException {
	
		/* 
				Map (interface)
			|				|
		    extends 		   implements 
		  SortedMap (interface)	    HashMap (class)
			|				|
		   implements 		   extends
		     TreeMap (class)      LinkedHashMap (class)
		*/

		Map<String, Integer> m = new HashMap<String, Integer>();
		String arr[] = {"Kelly", "Brook", "Oscar", "Wilde", "Oscar", "Brook"};
        	// Initialize frequency table from command line
        	for (String a : arr) {
        	    Integer freq = m.get(a);
        	    m.put(a, (freq == null) ? 1 : freq + 1);
        	}

        	System.out.println(m.size() + " distinct words:");
		System.out.println(m);
		  
		// for sorted keys 

		Map<String, Integer> m2 = new TreeMap<String, Integer>(m);
		System.out.println("\nSorted by keys: \n" + m2);  

		
		
		// Collection Views
		// The Collection view methods allow a Map to be viewed as a Collection in these three ways: 
		// > keySet — the Set of keys contained in the Map.
		// > values — The Collection of values contained in the Map. This Collection is not a Set, because multiple keys can map to the same value.
		// > entrySet — the Set of key-value pairs contained in the Map. 
		// IMP: The Map interface provides a small nested interface called Map.Entry, the type of the elements in this Set.
	
		System.out.println("\nkeys only");  
		for (String key : m.keySet()) {
			System.out.println(key);
		}

		System.out.println("\nvalues only");  
		for (Integer val : m.values()) {
			System.out.println(val);
		}

		System.out.println("\nMap Entries\n");
		for(Map.Entry<String, Integer> e: m.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}

		/*
		some uses  
		if (m1.entrySet().containsAll(m2.entrySet())) {
			...
		}

		if (m1.keySet().equals(m2.keySet())) {
    			...
		}
		*/

		// multimap 
		// it is implemented as 
		Map<Integer, ArrayList<Integer>> multimap;
		
		// for values with same key we add it to array list and search it to get it
	}
}