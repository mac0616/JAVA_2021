package MyTest2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ListPhone {
	public static void main(String[] args) {
		FileWriter fw = null;
		File file = new File("c:\\Temp\\list.txt");
		try {
			fw = new FileWriter(file);
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("����ó�� �Է��ϴ� ���α׷��Դϴ�.");
			while(true) {
				System.out.print("�̸��� ��ȭ��ȣ�� �Է��ϼ��� ==> ");
				String sc = scanner.nextLine();
				if(sc.equals("�׸��մϴ�"))
						break;
				fw.write("�̸��� ��ȭ��ȣ�� �Է��ϼ��� ==> " + sc + "\n");
			}
			System.out.println("\n" + file.getPath()+"���Ͽ� �����Ͽ����ϴ�.");
			
			scanner.close();
			fw.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}