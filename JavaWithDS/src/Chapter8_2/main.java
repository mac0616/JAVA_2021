package Chapter8_2;

import java.nio.channels.SelectionKey;

public class main {	 
	//������
	  public static void main(String[] args) {
		  String a[] = {"Z", "Y", "X", "W", "V", "U", "T", "S", "R"};
		Shell.sort(a);
		System.out.printf("���� ���: ");
		for(int i=0; i < a.length; i++) {
			System.out.printf(a[i] + " ");
		}
	  }
}