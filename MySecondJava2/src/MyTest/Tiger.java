package MyTest;

public class Tiger extends Animal{
	int numofHunting;
	public void hunt() {
		System.out.println("����� �մϴ�");
	}
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.numofHunting = 10;
		tiger.hunt();
		tiger.move();
	}

}
