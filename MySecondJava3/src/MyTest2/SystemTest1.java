package MyTest2;

import java.io.IOException;

public class SystemTest1 {
	public static void main(String[] args) {
		try {
		 System.out.print("문자를 입력하세요=>");
		 int i = System.in.read();     //바이트단위 스트림
		 System.out.println(i);
		 System.out.println((char)i);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
