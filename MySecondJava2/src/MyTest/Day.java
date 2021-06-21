package MyTest;
import java.util.Calendar;

public class Day {
	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();
		int hourOfDay=now.get(Calendar.HOUR_OF_DAY);
		int minute=now.get(Calendar.MINUTE);
		System.out.println("현재 시간은 "+hourOfDay+"시 "+minute+"분입니다.");
		
		if ((hourOfDay>=5)&&(hourOfDay<12))
			System.out.println("좋은 아침");
		else if ((hourOfDay>12)&&(hourOfDay<=18))
			System.out.println("좋은 오후");
		else if ((hourOfDay>18)&&(hourOfDay<=20))
			System.out.println("좋은 저녁");
		else
			System.out.println("좋은 밤");
	}
}

