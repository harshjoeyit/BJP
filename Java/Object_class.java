
class Book {
	String ISBN;
	Book(String isbn) {
		this.ISBN = isbn;
	}

	public String getISBN() {
		return this.ISBN;
	}

	@Override // method of object class 
	public boolean equals(Object obj) {
		if (obj instanceof Book)
			return (ISBN == ((Book)obj).getISBN());
		else
			return false;
	}

	public void printClassName() {
		System.out.println("The obj is of " + this.getClass());
	}

	public String toString() {
		return "This is a Book object with ISBN: " + this.ISBN; 
	}
}


class Test {
	public static void main(String[] args) {
		Book firstBook  = new Book("0201914670");
		Book secondBook = new Book("0201914670");
		
		/* 
		This program displays objects are equal even though firstBook and secondBook reference 
		two distinct objects. They are considered equal because the objects compared contain 
		the same ISBN number.
		*/
		
		if (firstBook.equals(secondBook)) {
			System.out.println("objects are equal");
		} else {
			System.out.println("objects are not equal");
		}

		firstBook.printClassName();

		System.out.println(firstBook.toString());
	}
}