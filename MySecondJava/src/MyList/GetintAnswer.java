package MyList;

import java.util.Scanner;
import java.util.Vector;

public class GetintAnswer {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		int a;
		int max=0;
		
		System.out.println("���� ������ �Է��ϼ���. ���� ������ �ƴ� ��� ���α׷��� ����˴ϴ�.");
		System.out.print("���� �Է��ϼ���==> ");
		a = s.nextInt();
		
		while(a>0) {
			v.add(a);
			System.out.print("���� �Է��ϼ���==> ");
			a = s.nextInt();
		}
		System.out.println("----------------------------");
		
		for(int i=0; i<v.size(); i++) {
			if(v.get(i)> max)
				max = v.get(i);
		}
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		
		System.out.println("���α׷� ����");
	}

}
