package mySwingTest;

import javax.swing.*;
import java.awt.*;

public class SimpleCalculator extends JFrame {
	public SimpleCalculator() {
		setTitle("SimpleCalculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(new TextField(""), BorderLayout.NORTH);
		
		JPanel sq = new JPanel();
		sq.setLayout(new GridLayout(4,4,5,5));
		c.add(sq);
		
		for (int i=0; i<10; i++) {
			JButton btn1 = new JButton();
			sq.add(btn1);
				btn1.setText(i+"");
				btn1.setBackground(Color.GREEN);
			}
			
		for (int i=10; i<16; i++) {
			JButton btn2 = new JButton();
			String[] str = {"+", "-", "=", "*", "/","%"};
			sq.add(btn2);
				btn2.setText(str[i-10]);
				btn2.setBackground(Color.GREEN);
			}
		
	setSize(300, 300);
	setVisible(true);
}
	
	public static void main(String[] args) {
		new SimpleCalculator();
	}
}
