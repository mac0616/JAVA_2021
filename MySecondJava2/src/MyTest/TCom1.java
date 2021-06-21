package MyTest;

abstract class Computer1{
	public void turnOn() {
		System.out.println("���� ��ǻ���� ������ ŵ�ϴ�");
	}
	public void turnOff() {
		System.out.println("���� ��ǻ���� ������ ���ϴ�");
	}
	public abstract void printInfomation();
}

class LGComputer extends Computer1{
	@Override
	public void printInfomation() {
		double screenSize = 51.5;
		int year = 2020;
		String color = "��Ż";
		System.out.println("���� ��ǻ�ʹ� ȭ��ũ�� " + screenSize + "�����⵵" + year + ", ������ " + color + "�Դϴ�");
	}
}

public class TCom1 {
	public static void main(String[] args) {
		LGComputer lgc = new LGComputer();
		lgc.printInfomation();
		lgc.turnOn();
		lgc.turnOff();
	}
}
