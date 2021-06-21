package mySwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListEx extends JFrame {
	private String [] fruits = {"apple", "banana", "kiwi", "mango", "pear",
								"peach", "berry", "strawberry", "blackberry"};
	String str = ("C:\\Users\\cheay\\eclipse-workspace\\myWindowTest\\src\\images");
	ImageIcon i1 = new ImageIcon(str + "\\icon1.png");
	ImageIcon i2 = new ImageIcon(str + "\\icon2.png");
	ImageIcon i3 = new ImageIcon(str + "\\icon3.png");
	ImageIcon i4 = new ImageIcon(str + "\\icon4.png");
	
	private ImageIcon [] images = {i1, i2, i3, i4};
	
	public ListEx() {
		setTitle("리스트 만들기 예제");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);
		c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
		
		setSize(300, 300);
		setVisible(true);
}

	public static void main(String[] args) {
		new ListEx();
	}

}
