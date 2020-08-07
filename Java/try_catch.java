
class GoClass {
	public void meth1() {
		try {
			throw new Exception("some exception");
		} catch (Exception e) {
			System.out.println("catch block");
			return;
		} finally {
			System.out.println("finally block");
		}
	}

	/* 
	By Calling System.exit(0) in try or catch block, we 
	can skip the finally block. 
	
	System.exit(int) method can throw a SecurityException. 
	
	If Sysytem.exit(0) exits the JVM without throwing that 
	exception then finally block will not execute. 
	
	But, if System.exit(0) does throw security exception 
	then finally block will be executed.
	*/

	public void meth2() {
		try {
			throw new Exception("some exception");
		} catch (Exception e) {
			System.out.println("catch block");
			System.exit(0);
		} finally {
			System.out.println("finally block");
		}
	}	
}

class Test {
	public static void main(String[] args) {	
		GoClass obj = new GoClass();
		obj.meth1();
		System.out.println("...............");
		obj.meth2();
	}
}