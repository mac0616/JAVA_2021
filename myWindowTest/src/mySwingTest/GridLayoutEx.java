package mySwingTest;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		setTitle("GrideLayout Sample");
		Container c = getContentPane();
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		c.setLayout(grid);
		c.add(new Label(" �̸�"));
		c.add(new TextField(""));
		c.add(new Label(" �й�"));
		c.add(new TextField(""));
		c.add(new Label(" �а�"));
		c.add(new TextField(""));
		c.add(new Label(" ����"));
		c.add(new TextField(""));
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();

	}

}
