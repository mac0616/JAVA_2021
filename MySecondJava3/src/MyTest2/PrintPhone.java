package MyTest2;

import java.io.FileReader;
import java.io.IOException;

public class PrintPhone {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("C:\\Temp\\list.txt")){
			int i;
			System.out.println("C:\\Temp\\list.txt 파일을 출력합니다");
			while((i=fr.read())!=-1){
				System.out.print((char)i);
			}
		
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
} 
