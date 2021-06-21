package mySwingTest;

import java.awt.event.*;
import javax.swing.JButton;
import java.awt.*;

public class FrameTest2 extends Frame {
	public FrameTest2() {
		setTitle("Action 이벤트 리스너 예제");
		setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		add(btn);
		setSize(350, 150);
		setVisible(true);
}
	
private class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getLabel().equals("Action"))
			b.setLabel("액션");
		else
			b.setLabel("Action");
		FrameTest2.this.setTitle(b.getLabel()); 
	}
}

public static void main(String [] args) {
	new FrameTest2();
}
}