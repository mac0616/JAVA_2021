package mySwingTest;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MouseListenerEx extends Frame {
	private JLabel la = new JLabel("Hello");
	
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		addMouseListener(new MyMouseListener());
		
		setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		add(la);
		
		setSize(250, 250);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}

		@Override
		public void mouseClicked(MouseEvent e) {}

		@Override
		public void mouseReleased(MouseEvent e) {}

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
