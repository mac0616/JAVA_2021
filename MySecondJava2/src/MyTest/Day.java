package MyTest;
import java.util.Calendar;

public class Day {
	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();
		int hourOfDay=now.get(Calendar.HOUR_OF_DAY);
		int minute=now.get(Calendar.MINUTE);
		System.out.println("���� �ð��� "+hourOfDay+"�� "+minute+"���Դϴ�.");
		
		if ((hourOfDay>=5)&&(hourOfDay<12))
			System.out.println("���� ��ħ");
		else if ((hourOfDay>12)&&(hourOfDay<=18))
			System.out.println("���� ����");
		else if ((hourOfDay>18)&&(hourOfDay<=20))
			System.out.println("���� ����");
		else
			System.out.println("���� ��");
	}
}

