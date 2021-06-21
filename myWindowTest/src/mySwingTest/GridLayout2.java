package mySwingTest;

import javax.swing.*;
import java.awt.*;

public class GridLayout2 extends JFrame {
	public GridLayout2() {
		setTitle("swing패키지 기반 Ten Color Buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		GridLayout grid = new GridLayout(1, 10);
		c.setLayout(grid);
		
		for(int i=1; i<11; i++) {
			c.add(new JButton(i+""));
		}
	setSize(500, 400);
	setVisible(true);
}
 
public static void main(String[] args) {
	new GridLayout2();
}
}