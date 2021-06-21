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
			
			System.out.println("연락처를 입력하는 프로그램입니다.");
			while(true) {
				System.out.print("이름과 전화번호를 입력하세요 ==> ");
				String sc = scanner.nextLine();
				if(sc.equals("그만합니다"))
						break;
				fw.write("이름과 전화번호를 입력하세요 ==> " + sc + "\n");
			}
			System.out.println("\n" + file.getPath()+"파일에 저장하였습니다.");
			
			scanner.close();
			fw.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}