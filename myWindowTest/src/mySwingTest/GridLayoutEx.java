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
		c.add(new Label(" 이름"));
		c.add(new TextField(""));
		c.add(new Label(" 학번"));
		c.add(new TextField(""));
		c.add(new Label(" 학과"));
		c.add(new TextField(""));
		c.add(new Label(" 과목"));
		c.add(new TextField(""));
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();

	}

}
