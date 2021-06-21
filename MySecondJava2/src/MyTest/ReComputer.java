package MyTest;

public class ReComputer {
	protected double screenSize;
	
	public ReComputer(double screenSize) {
		super();
		this.screenSize = screenSize;
	}
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
}
