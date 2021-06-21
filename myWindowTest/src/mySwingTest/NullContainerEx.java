package mySwingTest;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
	JButton[] b = new JButton[10];
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		Label la = new Label("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		
		for(int i = 1; i<=9; i++) {
			b[i] = new JButton(Integer.toString(i));
			b[i].setLocation(i*15, i*15);
			b[i].setSize(50, 20);
			c.add(b[i]);
		}
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NullContainerEx();

	}

}
