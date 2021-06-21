package Test1;

public class ColorTV extends TV{
String color;
public ColorTV(int size, String color) {
super(size);
this.color = color;
 }
 public void printTV() {
System.out.println(getSize()+"인치 "+color+"칼라 텔레비젼입니다.");
 }
 public static void main(String[] args) {
ColorTV tp = new ColorTV(48, "yellow"); 
tp.printTV(); 
 }
}