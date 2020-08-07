
class Demo {
	int x, y;
	Demo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getSum() {
		return x + y;
	}
}

class Circle {
	int x, y;
	Circle(int x, int y) {
		setX(x);
		setY(y);
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void moveCircle(Circle circle, int deltaX, int deltaY) {
		/* 
		circle is copy of reference myCircle

		Inside the method, circle initially refers to myCircle. The method changes 
		the x and y coordinates of the object that circle references (i.e., myCircle) 
		by 23 and 56, respectively. These changes will persist when the method returns. 
		Then circle is assigned a reference to a new Circle object with x = y = 0. 
		This reassignment has no permanence, however, because the REFERENCE WAS PASSED IN BY VALUE
		and cannot change. Within the method, the object pointed to by circle 
		has changed, but, when the method returns, myCircle still references the same 
		Circle object as before the method was called.
		*/
		circle.setX(circle.getX() + deltaX);
		circle.setY(circle.getY() + deltaY);

		circle = new Circle(0, 0);
	}
}


class Test {
	int val = 40;

	public static void main(String[] args) {
		Demo d1 = new Demo(10, 20);
		System.out.println(d1.getSum());
	
		Demo d2 = d1;
		d2.setX(20);

		// d2 and d1 are object reference to same object 
		// changing one changes other 
		System.out.println(d1.getSum());
		System.out.println(d2.getSum());

		// arrays are reference 
		int a[] = {1, 2, 3, 4};
		int b[] = a;
		b[0] = 5;
		System.out.println("value changed: " + a[0]);

		// primitive types do not hold references 
		int x = 10;
		int y = x;
		y = 15;

		System.out.println(x);

		// Not sure, but looks like they do not hold ref 
		// they should because x in object of class Integer
		Integer x2 = 10;
		Integer y2 = x2;
		y2 = 15;

		System.out.println(x2);


		// circle class 
		Circle myCircle = new Circle(0, 0);
		myCircle.moveCircle(myCircle, 23, 56);

		System.out.println(myCircle.getX()+ " " + myCircle.getY());
	}
}

