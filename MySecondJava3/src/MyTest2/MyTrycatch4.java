package MyTest2;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

public class MyTrycatch4 {
	public static void main(String[] args) {
		int i;
		try (FileOutputStream fis = new FileOutputStream("c:\\Temp\\input.txt", true)){
			fis.write(65);
			fis.write(66);
			fis.write(67);
			fis.write(68);
		} 
		catch (IOException e){
			System.out.println(e);
		}
		catch(NoSuchElementException e) {
			System.out.println(e);
		}
		System.out.println("end");
		}
}
