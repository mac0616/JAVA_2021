package MyTest;

class A{
	public A() {
		System.out.println("A����Ʈ������");
	}
	public A(int x) {
		System.out.println("AŬ������ " + x + "���� ���� ������");
	}
}

class B extends A {
	public B() {
		System.out.println("B����Ʈ������");
	}
	public B(int x) {
		super(x);
		System.out.println("BŬ������ " + x + "���� ���� ������");
	}
}

class C extends B {
	public C() {
		System.out.println("C����Ʈ������");
	}
	public C(int x) {
		super(x);
		System.out.println("CŬ������ " + x + "���� ���� ������");
	}
}

public class Myinteritance {
	public static void main(String[] args) {
		int x=10;
		C c = new C(x);
	}

}

