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
		System.out.println(company + "�� ��ũ�� ����� " + screenSize +
				"�̰� �����⵵�� " + year + "�� ������ " + color + "�Դϴ�");
	}
	
	@Override
	public void turnOn() {
		System.out.print(company + "��ǻ���� ");
		super.turnOn();
	}

	@Override
	public void turnOff() {
		System.out.print(company + "��ǻ���� ");
		super.turnOff();
	}

	public static void main(String[] args) {
		LGCom lg = new LGCom(51.5, 2020, "��Ż");
		lg.printInformation();
		lg.turnOn();
		lg.turnOff();
	}

}
