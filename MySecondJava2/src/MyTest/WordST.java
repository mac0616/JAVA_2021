package MyTest;
import java.util.*;

public class WordST {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڿ��� �Է¹޽��ϴ�. �����Ϸ��� ���� �Է��ϼ���.");
		while(true) {
			System.out.print("���ڿ��� �Է��ϼ���=>");
			String st = scanner.nextLine();
			if(st.equals("��")) {
				System.out.println("�����մϴ�...");
				break;
			}
			StringTokenizer StrTok = new StringTokenizer(st, " ");
			System.out.println("����������  " + StrTok.countTokens());
		}
			scanner.close();
	}
}