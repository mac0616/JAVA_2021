package Test1;

import java.util.*;
//import java.util.Vector;


public class Test4 {
	public static void main(String[] args) {
	Vector<Double> v = new Vector<Double>();
	Scanner scanner = new Scanner(System.in);
	System.out.println("���� ������ �Է��ϼ���.0���� ū ���� �ƴ� ��� �Է��� ����˴ϴ�.");
	System.out.print("���� �Է��ϼ��� --> ");
	double s = scanner.nextDouble();
	while(s>0) {
	 System.out.print("���� �Է��ϼ��� --> ");
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
	System.out.println("���� ū ���� "+ max + ", ���� �������� " +min + "�̰� �� ���� ���� " 
			+ cha + "�Դϴ�.");
	}
}
