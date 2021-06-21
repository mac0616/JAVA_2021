package MyTest;

public class Tiger extends Animal{
	int numofHunting;
	public void hunt() {
		System.out.println("사냥을 합니다");
	}
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.numofHunting = 10;
		tiger.hunt();
		tiger.move();
	}

}
