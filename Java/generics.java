
// genrics methods and genric classes 

// genric classes 	
class Pair<Type1, Type2> {
	public Type1 first;
	public Type2 second;

	Pair() {}
	Pair(Type1 first, Type2 second) {
		this.first = first;
		this.second = second;
	}
}


class Test {
	// generic method 
	public static <Type> void print(Type []A) {
		for(Type val: A) {
			System.out.print(val + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Note : primitive types cannot be used as genric type
		print(new Integer[]{1, 2, 3, 4});
		print(new String[]{"hej", "ytas", "kill"});

		// ...................

		Pair<Integer, String> p = new Pair<Integer, String>(100, "Harshit Gangwar");
		System.out.println("first: " + p.first);
		System.out.print("second: " + p.second);
	}
}

