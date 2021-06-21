package myGym;

class Person<E>{
	E myValue;
	
	public Person(E myValue) {
		super();
		this.myValue = myValue;
	}

	public void set(E myValue) {
		this.myValue = myValue; 
	}
	
	public E get() {
		return myValue; 
	}
}

public class PersonEx {

	public static void main(String[] args) {
		Person<String> p1 = new Person<String>("학교에 값니다");
		Person<Double> p2 = new Person<Double>(7.5);
		
		System.out.println(p1.get() + ","+p2.get());
	}

}
