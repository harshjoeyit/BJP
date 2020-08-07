
/*
An enum type is a special data type that enables for a variable 
to be a set of predefined constants. The variable must be equal 
to one of the values that have been predefined for it. Common 
examples include compass directions (values of NORTH, SOUTH, 
EAST, and WEST) and the days of the week.
*/

// all enum classes extend java.lang.enum

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURDAY 
}

class EnumTest {
	Day day;
	
	public EnumTest(Day day) {
	    this.day = day;
	}
	
	public void tellItLikeItIs() {
	    switch (day) {
		  case MONDAY:
			System.out.println("Mondays are bad.");
			break;
			    
		  case FRIDAY:
			System.out.println("Fridays are better.");
			break;
				   
		  case SATURDAY: case SUNDAY:
			System.out.println("Weekends are best.");
			break;
				  
		  default:
			System.out.println("Midweek days are so-so.");
			break;
	    }
	}

	public static void main(String[] args) {
	    	EnumTest firstDay = new EnumTest(Day.MONDAY);
	    	firstDay.tellItLikeItIs();
	    	EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
	    	thirdDay.tellItLikeItIs();
	    	EnumTest fifthDay = new EnumTest(Day.FRIDAY);
	    	fifthDay.tellItLikeItIs();
	    	EnumTest sixthDay = new EnumTest(Day.SATURDAY);
	    	sixthDay.tellItLikeItIs();
	    	EnumTest seventhDay = new EnumTest(Day.SUNDAY);
	    	seventhDay.tellItLikeItIs();


	    	// .....................
		/*
		The enum class body can include methods and other fields.
		The compiler automatically adds some special methods when 
		it creates an enum. For example, they have a static values
		method that returns an array containing all of the values 
		of the enum in the order they are declared.
		*/

	    	for(Day d: Day.values()) {
			System.out.println(d);
	    	}
	}
}