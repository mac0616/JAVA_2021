package List2;

import java.util.Scanner;
import java.util.Vector;

public class Stringlength {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Vector<String> v = new Vector<String>();
		String a;
		String long_st = "";
		
		System.out.println("���ڿ��� �Է��ϼ���. ���ڿ��� 'quit'�̸� �Է��� ����˴ϴ�.");
		System.out.print("���� �Է��ϼ���==> ");
		a = s.next();
		
		while(true) {
			v.add(a);
			System.out.print("���� �Է��ϼ���==> ");
			a = s.next();
			if(a.equals("quit"))
				break;
		}
		System.out.println("----------------------------");
		
		for(int i=0; i<v.size(); i++) {
			if(long_st.length() < v.elementAt(i).length())
				long_st = v.elementAt(i);
		}
		System.out.println("���� �� ���ڿ��� " + long_st + "�Դϴ�.");
		
		System.out.println("���α׷� ����");
	}
}
