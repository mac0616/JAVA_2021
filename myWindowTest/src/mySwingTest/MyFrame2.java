/*package mySwingTest;

import javax.swing.*;
import java.awt.*;

class MyFrame2 extends JFrame{
	JButton[ ] b = new JButton[7];
	JPanel[ ] p = new JPanel[3];
public MyFrame2() {
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	setSize(500, 300);
	for(int i=0; i<3; i++)
		p[i] = new JPanel( );
	p1.setBackground(new Color(255,0,0));
	p2.setBackground(new Color(0, 255,0));
	p3.setBackground(new Color(0,0, 255));
	for(int i=0; i<7; i++) {
		b[i] = new JButton(Integer.toString(i+1)); // 버튼 생성
	}
	c.add(p1); c.add(p2); c.add(p3);
	p[0].add(b[0]);
	p[1].add(b[1]);p[1].add(b[2]);
	p[2].add(b[3]); p[2].add(b[4]); p[2].add(b[5]); p[2].add(b[6]);
	setVisible(true);
	}
public static void main(String[] args) {
	MyFrame2 myframe = new MyFrame2();
}
}*/