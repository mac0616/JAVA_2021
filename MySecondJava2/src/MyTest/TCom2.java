package MyTest;
class Computer2 {
    protected double screenSize;
    public Computer2(double screenSize) {
    super();
    this.screenSize = screenSize;
    }
    public void turnOn() {System.out.println("엘지 컴퓨터의 전원을 켭니다");}
    public void turnOff() {System.out.println("엘지 컴퓨터의 전원을 끕니다");}
}

class SSComputer extends Computer2 {
	private int year;
	private String color;
	public SSComputer(double Size, int year, String color){
    super(Size);
    this.year = year;
    this.color = color;
	}
	public void printInformation(){
    System.out.println("엘지 컴퓨터는 화면크기"+screenSize+"인치제조년도"+year+", 색깔은 " + color + "입니다.");
	}
}

public class TCom2{
	public static void main(String[] args) {
		SSComputer ssc = new SSComputer(51.5, 2020, "메탈");
		ssc.printInformation();
		ssc.turnOn();
		ssc.turnOff();
	}
}