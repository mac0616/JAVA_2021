package mySwingTest;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseFrame extends JFrame {
	public MouseFrame(String str) {
		setTitle(str);
		setSize(300, 300);
		Container c = getContentPane();
		c.setBackground(Color.yellow);
		MyMouseListener myMouse = new MyMouseListener();
		this.addMouseListener(myMouse);
		setVisible(true);
	}

	public static void main(String[] args) {
		MouseFrame myFrame = new MouseFrame("마우스 위치 표시하기");

	}
}
class MyMouseListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		Graphics g = ((Frame)e.getSource()).getGraphics();
		g.drawString(String.valueOf(x)+", "+ String.valueOf(y),x,y);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
}
