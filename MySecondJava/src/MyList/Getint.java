package MyList;

import java.util.*;

public class Getint {
	public static void printInt(Vector<Integer> v) {
		int big = v.get(0);
		for(int i=1; i<v.size(); i++) {
			if(big < v.get(i))
				big = v.get(i);
		}
		System.out.println("---------------------------------------");
		System.out.println("���� ū ���� " + big + "�Դϴ�.");		
	}
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϼ���. ���� ������ �ƴ� ��� �Է��� ����˴ϴ�. ");
		while(true) {
			System.out.print("���� �Է��ϼ���-->");
			int n = scanner.nextInt();
			if(n <= 0)
				break;
			v.add(n);
		}
		printInt(v);
		scanner.close();
	}

}