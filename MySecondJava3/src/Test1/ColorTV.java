package Test1;

public class ColorTV extends TV{
String color;
public ColorTV(int size, String color) {
super(size);
this.color = color;
 }
 public void printTV() {
System.out.println(getSize()+"��ġ "+color+"Į�� �ڷ������Դϴ�.");
 }
 public static void main(String[] args) {
ColorTV tp = new ColorTV(48, "yellow"); 
tp.printTV(); 
 }
}