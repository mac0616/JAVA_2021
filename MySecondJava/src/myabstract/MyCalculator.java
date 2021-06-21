package myabstract;

/*Calculator를 따로 만들지 않고 한 번에 만들 수 있다.
main메소드를 가지고 있는 클래스에만 public을 쓰고(public class MyCalculator extends Calculator)
main메소드를 가지고 있지 않은 클래스에는 public을 쓰지 않는다.
 abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double divide(int a, int b);
	public abstract double average(int[] score);
}
*/

public class MyCalculator extends Calculator {
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double divide(int a, int b) {
		return (double)a/b;
	}

	@Override
	public double average(int[] score) {
		int hap=0;
		for (int i = 0; i<score.length; i++)
			hap = hap+score[i];
		double mean = hap/score.length;
		return mean;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}

	public static void main(String[] args) {
		MyCalculator myc = new MyCalculator();
		int[] score = {56, 78, 92};
		int a = myc.add(5, 3);
		int b = myc.subtract(10, 20);
		double c = myc.average(score);
		int f = myc.mul(25, 67);
		System.out.println("5+3=" + a + " 10-20=" + b + " 배열평균은 " + c + " 25*67=" + f);
	}

}
