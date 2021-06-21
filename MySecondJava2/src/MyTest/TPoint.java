package MyTest;

class Point{
    protected int x;
	protected int y;
    public Point(int x, int y){
        this.x=x; 
        this.y=y;
    }
    public int getX( ){ 
        return x; 
    }
    public int getY( ){ 
        return y;
    }
    public void move(int newX, int newY){ 
        this.x = newX; 
        this.y = newY;
    }
}
class DynamicPoint extends Point {

   private String color;
   private int a, b, xpos, ypos;
   public DynamicPoint(int x, int y, String color) {
      super(x, y);
      this.color = color;
   }
   public void setXY(int x, int y){
       move(x, y);
	   xpos = x;
       ypos = y;
  }
  int getXpos() { 
      return xpos; 
      
  } 
  int getYpos() { 
      return ypos; 
      
  }
   public void move(int a, int b){
       x = RandomPick.abs(x-a);
       y = RandomPick.abs(y-b);
       return;
   }
   public String printInfo() {
      String str = "이동한 위치는 x축으로 " + x + "이동, y축으로 " + y + "이동하였습니다" + "("+getXpos()+","+getYpos()+")점은"+ color+"색입니다.";
      return str;
   }
}
public class TPoint{
    public static void main(String[] args) {
        DynamicPoint dp = new DynamicPoint(10, 20, "빨강");
        dp.setXY(20, 50);
        
        System.out.println(dp.printInfo());
    }
}