package mySwingTest;

import javax.swing.*;
import java.awt.*;

public class GridLayout3 extends JFrame {
	public GridLayout3() {
		setTitle("swing패키지 기반 Ten Color Buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		GridLayout grid = new GridLayout(1, 10);
		c.setLayout(grid);
		
		for(int i=1; i<11; i++) {
			Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, 
							 Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY}; 
			
			String str = Integer.toString(i);
			JButton btn = new JButton(str);
			btn.setBackground(color[i-1]);
			c.add(btn);
		}
	setSize(500, 400);
	setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayout3();
	}
}
 