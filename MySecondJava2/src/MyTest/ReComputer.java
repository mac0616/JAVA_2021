package MyTest;

public class ReComputer {
	protected double screenSize;
	
	public ReComputer(double screenSize) {
		super();
		this.screenSize = screenSize;
	}
	public void turnOn() {
		System.out.println("������ �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�");
	}
}
