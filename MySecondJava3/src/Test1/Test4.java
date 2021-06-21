package Test1;

import java.util.*;
//import java.util.Vector;


public class Test4 {
	public static void main(String[] args) {
	Vector<Double> v = new Vector<Double>();
	Scanner scanner = new Scanner(System.in);
	System.out.println("양의 정수를 입력하세요.0보다 큰 값이 아닌 경우 입력이 종료됩니다.");
	System.out.print("값을 입력하세요 --> ");
	double s = scanner.nextDouble();
	while(s>0) {
	 System.out.print("값을 입력하세요 --> ");
	 v.add(s);
	 s = scanner.nextDouble();
	}
	double max= v.get(0);
	double min= v.get(0);
	for(int i = 0; i<v.size(); i++) {
	 if(v.get(i)>max) {
	 max = v.get(i);
	}
	 if(v.get(i)<min) {
		 min = v.get(i);
	}
	}
	 double cha = max-min;
	System.out.println("----------------------------------------");
	System.out.println("가장 큰 수는 "+ max + ", 가장 작은수는 " +min + "이고 두 값의 차는 " 
			+ cha + "입니다.");
	}
}
