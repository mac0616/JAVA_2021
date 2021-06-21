package myLibrary;
import java.util.*;

public class Library {
	Vector<Book> v;
	
	public Library() {
		 v = new Vector<Book>();
	}
	
	public void addBook(Book b) {
		v.add(b);
		System.out.println(b.toString() + " 입력되었습니다");
	}
	
	public void removeBook(int i) {
		Book b = v.remove(i);
		System.out.println(b.toString() + " 제거되었습니다");
	}
	
	public void printBook() {
		for(Book a : v) {
			System.out.println(a.toString() + " 있습니다");
		}
	}

	public static void main(String[] args) {
		Library baewha = new Library();
		Book b1 = new Book("박씨부인", "미상", 1520);
		Book b2 = new Book("이순신", "미상", 1620);
		Book b3 = new Book("심청이", "미상", 1720);
		
		baewha.addBook(b1);
		baewha.addBook(b2);
		baewha.addBook(b3);
		baewha.printBook();
		baewha.removeBook(1);
		baewha.printBook();
	}

}
