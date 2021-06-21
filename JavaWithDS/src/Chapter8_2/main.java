package Chapter8_2;

import java.nio.channels.SelectionKey;

public class main {	 
	//쉘정렬
	  public static void main(String[] args) {
		  String a[] = {"Z", "Y", "X", "W", "V", "U", "T", "S", "R"};
		Shell.sort(a);
		System.out.printf("정렬 결과: ");
		for(int i=0; i < a.length; i++) {
			System.out.printf(a[i] + " ");
		}
	  }
}