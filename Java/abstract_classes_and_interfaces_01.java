
// Link
// https://cc-mnnit.github.io/2018-19-Classes/Java/2018_08_16_Java-Class-3/

import java.util.Calendar;
import java.util.Date;

interface Repairable{
	boolean isRepairable();
	void repair();
}

abstract class Car{

	// Abstract Class can also have instance variables .....

	private String modelName;
	private int passengerCapacity;
	private double topSpeed;
	private Date manufacturingDate;

	// Abstract Class can have constructor just like other classes ....

	public Car(String modelName, int passengerCapacity, double topSpeed){
		this.modelName = modelName;
		this.passengerCapacity = passengerCapacity;
		this.topSpeed = topSpeed;
		this.manufacturingDate = Calendar.getInstance().getTime();
	}

	// Abstract Methods

	public abstract void accelerate();
	public abstract void brake();
	public abstract String getDescription();

	// Accessor Methods (See Abstract Class can also have concrete methods)

	public String getModelName(){
		return this.modelName;
	}

	public int getPassengerCapacity(){
		return this.passengerCapacity;
	}

	public double getTopSpeed(){
		return this.topSpeed;
	}

	public Date getManufacturingDate(){
		return this.manufacturingDate;
	}

	// Mutator Methods

	public void setModelName(String modelName){
		this.modelName = modelName;
	}

	public void setPassengerCapcity(int passengerCapacity){
		this.passengerCapacity = passengerCapacity;
	}

	public void setTopSpeed(double topSpeed){
		this.topSpeed = topSpeed;
	}

}


class TeslaCar extends Car implements Repairable{

	public TeslaCar(String modelName, int passengerCapacity, double topSpeed){
		super(modelName, passengerCapacity, topSpeed);
	}

	// Overriding Abstract methods

	public void accelerate(){
		System.out.println("Tesla's specialized acceleration system");
	}

	public void brake(){
		System.out.println("Tesla's specialized braking system");
	}

	public String getDescription(){
		return "Tesla Car, Model Name: " + this.getModelName() + ", Top Speed: " + this.getTopSpeed();
      }
      
      /*
		additional code to implement intreface 
	*/

	public boolean isRepairable(){
		// Tesla Car has a warranty time and can be repaired during that time only .... 
		Date currentDate = Calendar.getInstance().getTime();
		if(currentDate.getTime() - this.getManufacturingDate().getTime() > 100000)
			return false;
		return true;
	}

	public void repair(){
		System.out.println("Procedure for repairing Tesla Car");
	}

}

class AudiCar extends Car{

	public AudiCar(String modelName, int passengerCapacity, double topSpeed){
		super(modelName, passengerCapacity, topSpeed);
	}

	// Overriding Abstract methods

	public void accelerate(){
		System.out.println("Audi's specialized acceleration system");
	}

	public void brake(){
		System.out.println("Audi's specialized braking system");
	}

	public String getDescription(){
		return "Audi Car, Model Name: " + this.getModelName() + ", Top Speed: " + this.getTopSpeed();
	}

}


class SonyMusicPlayer implements Repairable{

	// Some code for Music Player ..... 

	public boolean isRepairable(){
		// Let's assume that our music player comes with lifetime warranty :P
		return true;
	}

	public void repair(){
		System.out.println("Procedure for repairing Sony Music Player");
	}

}


class RepairingGuy{

	// Static doRepair method of RepairingGuy ....

	public static void doRepair(Repairable object){

		if(!object.isRepairable())
			System.out.println("Sorry I can't repair this item. Please contact someone else");
		else{
			object.repair();
			System.out.println("Your item has been successfully repaired.");
		}
	}

}


class Test {

      public static void main(String args[]){

            /* 
                  abstract class test 
            */

            Car[] showroom = new Car[3];

            showroom[0] = new TeslaCar("Model S", 4, 250.0);
            showroom[1] = new AudiCar("Audi A3", 4, 240.0);
            showroom[2] = new TeslaCar("Model X", 4, 210.0);

            for(Car c: showroom)
                  System.out.println(c.getDescription());


            /*
                  Interface test 
            */

            System.out.println("....................................\n");

            Repairable[] item_to_repair = new Repairable[3];

		item_to_repair[0] = new TeslaCar("Model S", 4, 250.0);
		item_to_repair[1] = new SonyMusicPlayer();
		item_to_repair[2] = new TeslaCar("Model X", 4,210.0);

		for(Repairable item: item_to_repair)
			RepairingGuy.doRepair(item);
      }

}


/* 
A major difference between Java Interfaces and Abstract Classes is that, 
interfaces can’t have instance members and concrete methods(like constructor, accessor methods, mutator methods etc).

Tips when to use interface : 
Two unrelated classes that want to have the same functionality can implement a interface 
instead of implementing that seperately inside them 
*/