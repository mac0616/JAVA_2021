package MyTest;
import java.util.*;

public class WordST {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력받습니다. 종료하려면 끝을 입력하세요.");
		while(true) {
			System.out.print("문자열을 입력하세요=>");
			String st = scanner.nextLine();
			if(st.equals("끝")) {
				System.out.println("종료합니다...");
				break;
			}
			StringTokenizer StrTok = new StringTokenizer(st, " ");
			System.out.println("어절개수는  " + StrTok.countTokens());
		}
			scanner.close();
	}
}