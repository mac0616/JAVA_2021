package myabstract;

/*Calculator�� ���� ������ �ʰ� �� ���� ���� �� �ִ�.
main�޼ҵ带 ������ �ִ� Ŭ�������� public�� ����(public class MyCalculator extends Calculator)
main�޼ҵ带 ������ ���� ���� Ŭ�������� public�� ���� �ʴ´�.
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
		System.out.println("5+3=" + a + " 10-20=" + b + " �迭����� " + c + " 25*67=" + f);
	}

}
