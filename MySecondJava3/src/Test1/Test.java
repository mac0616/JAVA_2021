package Test1;

import java.util.Scanner;

public class Test {

	public Test(int kuk, int eng, int math) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("국어 영어 수학 순서대로 시험정수(정수)입력=>");
		int kuk = s.nextInt();
		int eng = s.nextInt();
		int math = s.nextInt();
		
		Test test = new Test(kuk, eng, math);
		
		System.out.println("평균은 " + test.average() + "점 입니다");
		s.close();

	}

	public int average(int kuk, int eng, int math) {
		int a = (kuk + eng+math)/3;
		return a;
	}

}
