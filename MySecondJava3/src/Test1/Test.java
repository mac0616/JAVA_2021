package Test1;

import java.util.Scanner;

public class Test {

	public Test(int kuk, int eng, int math) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� ���� ���� ������� ��������(����)�Է�=>");
		int kuk = s.nextInt();
		int eng = s.nextInt();
		int math = s.nextInt();
		
		Test test = new Test(kuk, eng, math);
		
		System.out.println("����� " + test.average() + "�� �Դϴ�");
		s.close();

	}

	public int average(int kuk, int eng, int math) {
		int a = (kuk + eng+math)/3;
		return a;
	}

}
