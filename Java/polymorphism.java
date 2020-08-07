
/* 
The Java virtual machine (JVM) calls the appropriate method for the object 
that is referred to in each variable. It does not call the method that is 
defined by the variable's type. 

This behavior is referred to as VIRTUAL METHOD INVOCATION and demonstrates 
an aspect of the important polymorphism features in the Java language.
*/

class Bicycle {
	private int gear;
	private int speed;

	public Bicycle (int startSpeed, int startGear) {
		speed = startSpeed;
		gear = startGear;
	}

	public void printDescription(){
	System.out.println("\nBike is " + "in gear " + this.gear + 
	    " and travelling at a speed of " + this.speed + ". ");
	}
}

class MountainBike extends Bicycle {
	private String suspension;
  
	public MountainBike(int startSpeed, int startGear, String suspensionType) {
	    super(startSpeed, startGear);
	    this.setSuspension(suspensionType);
	}
  
	public String getSuspension(){
	  return this.suspension;
	}
  
	public void setSuspension(String suspensionType) {
	    this.suspension = suspensionType;
	}
  
	public void printDescription() {
	    super.printDescription();
	    System.out.println("The " + "MountainBike has a" +
		  getSuspension() + " suspension.");
	
	}
}

class RoadBike extends Bicycle{
	// In millimeters (mm)
	private int tireWidth;
  
	public RoadBike(int startSpeed, int startGear, int newTireWidth) {
		super(startSpeed, startGear);
		this.setTireWidth(newTireWidth);
	  }
  
	public int getTireWidth(){
	  return this.tireWidth;
	}
  
	public void setTireWidth(int newTireWidth){
	    this.tireWidth = newTireWidth;
	}
  
	public void printDescription(){
	    super.printDescription();
	    System.out.println("The RoadBike" + " has " + getTireWidth() +
		  " MM tires.");
	}
}

class TestBikes {
	public static void main(String[] args){
	  	Bicycle bike01, bike02, bike03;
		
	  	bike01 = new Bicycle(10, 1);
	  	bike02 = new MountainBike(10, 5, "Dual");
	  	bike03 = new RoadBike(20, 8, 23);
		
	  	bike01.printDescription();
	  	bike02.printDescription();
	  	bike03.printDescription();
	}
}