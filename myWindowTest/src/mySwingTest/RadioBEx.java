package mySwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioBEx extends JFrame{
	public RadioBEx() {
		setTitle("라디오버튼 체크 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
			ImageIcon cherryIcon = new ImageIcon("C:\\Users\\cheay\\eclipse-workspace\\myWindowTest\\src\\images\\cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("C:\\Users\\cheay\\eclipse-workspace\\myWindowTest\\src\\images\\selectedcherry.jpg");		
		
		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		JRadioButton banana = new JRadioButton("바나나");
		cherry.setSelectedIcon(selectedCherryIcon);
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		g.add(banana);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		c.add(banana);
		setSize(500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioBEx();
	}
}
