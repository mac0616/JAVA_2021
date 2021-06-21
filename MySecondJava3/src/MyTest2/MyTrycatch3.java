package MyTest2;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

public class MyTrycatch3 {
	public static void main(String[] args) {
		int i;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\Temp\\input.txt");
			while((i=fis.read()) != -1);
				System.out.println((char)i);
		} catch (IOException e){
			System.out.println(e);
		} finally {
			try { fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NoSuchElementException e) {
				e.printStackTrace();}
		}
		System.out.println("end");
		}
}
