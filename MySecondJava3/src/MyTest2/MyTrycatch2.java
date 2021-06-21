package MyTest2;
import java.io.FileInputStream;
import java.io.IOException;

public class MyTrycatch2 {
	public static void main(String[] args) {
		int i;
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("c:\\temp\\input.txt");
			i = fis.read();
			System.out.println((char)i);
		} catch(IOException e) {
			System.out.println(e);
		}finally{
			try { fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		}
		System.out.println("end");
	}
}
