package mySwingTest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends Frame {
	public AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getLabel().equals("Action"))
				b.setLabel ("액션");
				else
				b.setLabel ("Action");
				setTitle(b.getLabel());
				}
			});
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new AnonymousClassListener();
	}
}
