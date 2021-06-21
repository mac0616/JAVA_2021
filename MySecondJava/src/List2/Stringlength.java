package List2;

import java.util.Scanner;
import java.util.Vector;

public class Stringlength {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Vector<String> v = new Vector<String>();
		String a;
		String long_st = "";
		
		System.out.println("문자열을 입력하세요. 문자열이 'quit'이면 입력이 종료됩니다.");
		System.out.print("값을 입력하세요==> ");
		a = s.next();
		
		while(true) {
			v.add(a);
			System.out.print("값을 입력하세요==> ");
			a = s.next();
			if(a.equals("quit"))
				break;
		}
		System.out.println("----------------------------");
		
		for(int i=0; i<v.size(); i++) {
			if(long_st.length() < v.elementAt(i).length())
				long_st = v.elementAt(i);
		}
		System.out.println("가장 긴 문자열은 " + long_st + "입니다.");
		
		System.out.println("프로그램 종료");
	}
}
