package myLibrary;

public class Book {
	String bookName;
	String author;
	int printYear;
	
	public Book(String bookName, String author, int printYear) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.printYear = printYear;
	}

	@Override
	public String toString() {
		return ("책이름: " + bookName + " 저자이름: " + author + " 출판년도: " + printYear);
	}
	
	
	
}
