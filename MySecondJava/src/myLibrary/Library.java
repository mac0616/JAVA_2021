package myLibrary;
import java.util.*;

public class Library {
	Vector<Book> v;
	
	public Library() {
		 v = new Vector<Book>();
	}
	
	public void addBook(Book b) {
		v.add(b);
		System.out.println(b.toString() + " �ԷµǾ����ϴ�");
	}
	
	public void removeBook(int i) {
		Book b = v.remove(i);
		System.out.println(b.toString() + " ���ŵǾ����ϴ�");
	}
	
	public void printBook() {
		for(Book a : v) {
			System.out.println(a.toString() + " �ֽ��ϴ�");
		}
	}

	public static void main(String[] args) {
		Library baewha = new Library();
		Book b1 = new Book("�ھ�����", "�̻�", 1520);
		Book b2 = new Book("�̼���", "�̻�", 1620);
		Book b3 = new Book("��û��", "�̻�", 1720);
		
		baewha.addBook(b1);
		baewha.addBook(b2);
		baewha.addBook(b3);
		baewha.printBook();
		baewha.removeBook(1);
		baewha.printBook();
	}

}
