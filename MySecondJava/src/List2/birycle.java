package List2;

import java.util.*;

public class birycle {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Vector<Integer> v = new Vector<Integer>();
	int a;
	int min= 0, max = 0, sum = 0;
		
	System.out.print("�Ǹŷ��Է�(0 �Է½� ����): ");
	a = s.nextInt();
	
	while(a>0) {
		v.add(a); 
		min = v.get(0);	
		max = v.get(0);
		
	for(int i=0; i<v.size(); i++) {
		System.out.print(v.get(i) + "  ");
		sum = sum + v.get(i);
		if(v.get(i)<= min)
			min = v.get(i);
		if(v.get(i)>max)
			max = v.get(i);
	} //end of for
	
	System.out.println();
	System.out.println("��ü: " + sum + " �ִ�: " + max + " ����: " + min);
	System.out.println();
	System.out.print("�Ǹŷ��Է�(0 �Է½� ����): ");
	a = s.nextInt();
	}//end of while
	
	System.out.println();
	System.out.println("���α׷��� �����մϴ�");
}

}

