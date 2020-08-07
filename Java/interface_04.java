
interface Iface {
	public void method1();
}

class One implements Iface {
	@Override
	public void method1() {
		System.out.println("overriden in \"One\" class");
	}
}

class Two extends One {
	@Override
	public void method1() {
		System.out.println("overriden in \"Two\" class ");
	}
}

class Test {
	public static void main(String[] args) {
		Iface obj1 = new One();
		obj1.method1();
		
		Iface obj2 = new Two();
            obj2.method1();
	}
}