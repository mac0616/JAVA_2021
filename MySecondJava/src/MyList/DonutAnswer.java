package MyList;

import java.util.Scanner;
import java.util.Vector;

public class DonutAnswer {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		int a;
		int min=0;
		int sum = 0;
		double mean = 0.0;		
		System.out.println("�ǸŰ����� �Է��ϼ���. 0�̸� ���α׷��� ����˴ϴ�.");
		System.out.println("�Ǹ� ������ �Է��ϼ���==>");
		a = s.nextInt();
		
		while(a>0) {
			v.add(a); 
			min = v.get(0);		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i) + "  ");
			sum = sum + v.get(i);
			if(v.get(i)> min)
				min = v.get(i);
		} //end of for
		mean = (double)sum/v.size();
		
		System.out.println("��ü �ǸŰ���: " + sum + " ��� �ǸŰ���: " + mean + " ���� �ǸŰ���: " + min);
		System.out.println();
		System.out.println("�Ǹ� ������ �Է��ϼ���==>  ");
		a = s.nextInt();
		}//end of while
		
		System.out.println("---------------------");
		
		System.out.println("���α׷� ����");
	}

}

