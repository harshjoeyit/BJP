

class ParentDemo {
      int z;
      // access specifiers may be used to limit the use 
      protected ParentDemo () {
		System.out.println("In Parent Demo");
      }
}

class Demo extends ParentDemo {
	int x, y;
	
	Demo(int x, int y) {
		// calling another constructor must be the first line
		this.x = x;
		this.y = y;
	}

	Demo(int x) {
		this(x, 10);
	}

	Demo() {
		this(10, 10);
	}

	public int sum() {
		return x+y;
	}
}

class Test {
	public static void main(String[] args) {
		Demo d1 = new Demo(4, 3);
		Demo d2 = new Demo(4);
		Demo d3 = new Demo();

		System.out.println(d1.sum());
		System.out.println(d2.sum());
		System.out.println(d3.sum());
	}
}

