package MyTest;
class Computer2 {
    protected double screenSize;
    public Computer2(double screenSize) {
    super();
    this.screenSize = screenSize;
    }
    public void turnOn() {System.out.println("���� ��ǻ���� ������ �մϴ�");}
    public void turnOff() {System.out.println("���� ��ǻ���� ������ ���ϴ�");}
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
    System.out.println("���� ��ǻ�ʹ� ȭ��ũ��"+screenSize+"��ġ�����⵵"+year+", ������ " + color + "�Դϴ�.");
	}
}

public class TCom2{
	public static void main(String[] args) {
		SSComputer ssc = new SSComputer(51.5, 2020, "��Ż");
		ssc.printInformation();
		ssc.turnOn();
		ssc.turnOff();
	}
}