package MyTest2;

import java.io.IOException;

public class SystemTest1 {
	public static void main(String[] args) {
		try {
		 System.out.print("���ڸ� �Է��ϼ���=>");
		 int i = System.in.read();     //����Ʈ���� ��Ʈ��
		 System.out.println(i);
		 System.out.println((char)i);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
