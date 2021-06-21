package MyTest;

public class Rect {
	 private int x, y;
	 
	  public Rect(int x, int y){
	        this.x = x;
	        this.y = y;
	  }
	  
	  public String toString() {
		  return ("가로가 " + this.x + ", 세로가 " + this.y + "인 사각형입니다.");
	  }
	   
	@Override
	public boolean equals(Object obj) {
		Rect s = (Rect)obj;
		int a = this.x * this.y;
		int b = s.x * s.y;
		if(a==b)				
			return true;
		else return false;
	}

	public static void main(String[] args) {
		  Rect p = new Rect(2, 9);
		  Rect q = new Rect(3, 6);
		  System.out.println(p.toString( ));
		  System.out.println(q.toString( ));
		  if(p.equals(q))
		      System.out.println("두 사각형의 면적은 동일합니다");
		  else System.out.println("두 사각형의 면적은 동일하지 않습니다");

	}
}