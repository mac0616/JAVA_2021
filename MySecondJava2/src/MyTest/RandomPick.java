package MyTest;

public class RandomPick {
	public static void main(String[] args) {
		for(int x=0; x<10; x++){
			System.out.print((int)(Math.random()*255+1));   
			System.out.print(" , ");        
		}

	}
}
