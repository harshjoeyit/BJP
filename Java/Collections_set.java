
// Collections - Sets

import java.util.*;
import java.util.stream.*;

class Test {
	public static void main(String[] args) {
		
		/* 
					Set (interface)
			|			|			|
		implements		   implements	     implements
		HashSet(class)	LinkedHashSet(class)	TreeSet(class)

		*/

		int a[] = {4,20,15,15,1,4};
		Set<Integer> s = new LinkedHashSet<>();
		
		for(int i=0; i<a.length; i++) {
			if(s.add(a[i])) {
				System.out.println(a[i] + " added");
			} else {
				System.out.println(a[i] + " already present");
			}
		}

		for(Integer val: s) {
			System.out.print(val + ", ");
		}
		System.out.println();

		String ss = s.toString();
		System.out.println(ss);

		Integer arr[] = new Integer[s.size()];
		s.toArray(arr);

		for(Integer i: arr) {
			System.out.print(i + ", ");
		}
		System.out.println();

		System.out.println(s.hashCode());
	}
}