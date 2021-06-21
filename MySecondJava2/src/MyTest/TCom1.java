package MyTest;

abstract class Computer1{
	public void turnOn() {
		System.out.println("엘지 컴퓨터의 전원을 킵니다");
	}
	public void turnOff() {
		System.out.println("엘지 컴퓨터의 전원을 끕니다");
	}
	public abstract void printInfomation();
}

class LGComputer extends Computer1{
	@Override
	public void printInfomation() {
		double screenSize = 51.5;
		int year = 2020;
		String color = "메탈";
		System.out.println("엘지 컴퓨터는 화면크기 " + screenSize + "제조년도" + year + ", 색깔은 " + color + "입니다");
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
