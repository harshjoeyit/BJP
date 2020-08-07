class Grandparent { 
	public int val = 10;
  	public void Print() { 
	    System.out.println("Grandparent's Print()"); 
	} 
  } 
     
  class Parent extends Grandparent { 
	public void Print() {        
	    System.out.println("Parent's Print()"); 
	} 
  } 
     
  class Child extends Parent { 
	public void Print() { 
	//     super.super.Print();  
	// Trying to access Grandparent's Print() 
	// not possible in java
	System.out.println("Child's Print()"); 
		System.out.println(val);
	} 
  } 
     
   class Test { 
	public static void main(String[] args) { 
	    Grandparent g = new Child(); 
	    g.Print(); 
	} 
  } 