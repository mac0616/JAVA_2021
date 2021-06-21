package MyTest2;

public class MyTrycatch {

	public static void main(String[] args) {
	 try {
		int[] a=new int[5];
		a[5]=10;
		System.out.println(a[5]);
	}
	catch(IndexOutOfBoundsException e) {
		e.printStackTrace();
		System.out.println("나는 안다");
	}
	}
}
