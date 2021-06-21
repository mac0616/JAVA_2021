package MyTest;

public class LGCom extends ReComputer {
	static String company="LG";
	int year;
	String color;
	
	
	public LGCom(double screenSize, int year, String color) {
		super(screenSize);
		this.year = year;
		this.color = color;
	}

	public void printInformation() {
		System.out.println(company + "는 스크린 사이즈가 " + screenSize +
				"이고 제조년도가 " + year + "년 색깔은 " + color + "입니다");
	}
	
	@Override
	public void turnOn() {
		System.out.print(company + "컴퓨터의 ");
		super.turnOn();
	}

	@Override
	public void turnOff() {
		System.out.print(company + "컴퓨터의 ");
		super.turnOff();
	}

	public static void main(String[] args) {
		LGCom lg = new LGCom(51.5, 2020, "메탈");
		lg.printInformation();
		lg.turnOn();
		lg.turnOff();
	}

}
