package MyTest;

public class Points {
	private int x, y;
	
	public Points(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		Points s = (Points)obj;
		if((this.x==s.x)&&(this.y==s.y))				
			return true;
		else return false;
	}

	public static void main(String[] args) {
		Points a = new Points(2, 3);
		Points b = new Points(2, 3);
		Points c = a;
		
		if(a.equals(b))
			System.out.println("같다");
		else
			System.out.println("같지 않다");
	}
}
