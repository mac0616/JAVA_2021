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
		System.out.println("판매개수를 입력하세요. 0이면 프로그램은 종료됩니다.");
		System.out.println("판매 개수를 입력하세요==>");
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
		
		System.out.println("전체 판매개수: " + sum + " 평균 판매개수: " + mean + " 최저 판매개수: " + min);
		System.out.println();
		System.out.println("판매 개수를 입력하세요==>  ");
		a = s.nextInt();
		}//end of while
		
		System.out.println("---------------------");
		
		System.out.println("프로그램 종료");
	}

}

