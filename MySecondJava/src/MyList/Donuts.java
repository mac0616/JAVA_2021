package MyList;

import java.util.*;

public class Donuts {
	public static void print(Vector<Integer> v) {
		int sum = 0;
		int min = v.get(0);
		Iterator<Integer> donut = v.iterator();
		while(donut.hasNext()) {
			int count = donut.next();
			if(min>count)
				min = count;
			System.out.print(count + " blank");
			sum += count;
		}
			
		System.out.println();			
		System.out.println("전체 판매개수: " + sum + " 평균 " + sum/v.size() + " 최저 판매개수: " + min);		
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		while(true) {
			System.out.print("판매량 입력 (0 입력시 종료)>> ");
			int count = scanner.nextInt();
			if(count == 0) 
				break;
			v.add(count);
			print(v);
		}
		
		scanner.close();
	}

}