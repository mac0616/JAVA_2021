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
		System.out.println("가장 큰 수는 " + big + "입니다.");		
	}
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("양의 정수를 입력하세요. 양의 정수가 아닌 경우 입력이 종료됩니다. ");
		while(true) {
			System.out.print("값을 입력하세요-->");
			int n = scanner.nextInt();
			if(n <= 0)
				break;
			v.add(n);
		}
		printInt(v);
		scanner.close();
	}

}