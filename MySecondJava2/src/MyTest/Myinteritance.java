package MyTest;

class A{
	public A() {
		System.out.println("A디폴트생성자");
	}
	public A(int x) {
		System.out.println("A클래스의 " + x + "값을 가진 생성자");
	}
}

class B extends A {
	public B() {
		System.out.println("B디폴트생성자");
	}
	public B(int x) {
		super(x);
		System.out.println("B클래스의 " + x + "값을 가진 생성자");
	}
}

class C extends B {
	public C() {
		System.out.println("C디폴트생성자");
	}
	public C(int x) {
		super(x);
		System.out.println("C클래스의 " + x + "값을 가진 생성자");
	}
}

public class Myinteritance {
	public static void main(String[] args) {
		int x=10;
		C c = new C(x);
	}

}

