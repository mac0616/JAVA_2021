package MyList;

import java.util.Scanner;
import java.util.Vector;

public class GetintAnswer {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		int a;
		int max=0;
		
		System.out.println("양의 정수를 입력하세요. 양의 정수가 아닌 경우 프로그램은 종료됩니다.");
		System.out.print("값을 입력하세요==> ");
		a = s.nextInt();
		
		while(a>0) {
			v.add(a);
			System.out.print("값을 입력하세요==> ");
			a = s.nextInt();
		}
		System.out.println("----------------------------");
		
		for(int i=0; i<v.size(); i++) {
			if(v.get(i)> max)
				max = v.get(i);
		}
		System.out.println("가장 큰 값은 " + max + "입니다.");
		
		System.out.println("프로그램 종료");
	}

}
