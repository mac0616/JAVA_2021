package mySwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioBEx extends JFrame{
	public RadioBEx() {
		setTitle("������ư üũ ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
			ImageIcon cherryIcon = new ImageIcon("C:\\Users\\cheay\\eclipse-workspace\\myWindowTest\\src\\images\\cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("C:\\Users\\cheay\\eclipse-workspace\\myWindowTest\\src\\images\\selectedcherry.jpg");		
		
		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��", true);
		JRadioButton cherry = new JRadioButton("ü��", cherryIcon);
		JRadioButton banana = new JRadioButton("�ٳ���");
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
