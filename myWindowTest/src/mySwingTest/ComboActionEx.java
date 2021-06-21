package mySwingTest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboActionEx extends JFrame {
	private String [] fruits = {"apple", "banana", "kiwi", "mango"};
	private ImageIcon [] images = {new ImageIcon("C:\\Users\\cheay\\eclipse-workspace\\myWindowTest\\src\\images\\apple.jpg"),
			new ImageIcon("C:\\Users\\cheay\\eclipse-workspace\\myWindowTest\\src\\images\\banana.jpg"),
			new ImageIcon("C:\\Users\\cheay\\eclipse-workspace\\myWindowTest\\src\\images\\kiwi.jpg"),
			new ImageIcon("C:\\Users\\cheay\\eclipse-workspace\\myWindowTest\\src\\images\\mango.jpg")};
	
	private JLabel imageLabel = new JLabel(images[0]);
	private JComboBox<String> strCombo = new JComboBox<String>(fruits);
	
	public ComboActionEx() {
		setTitle("콤보박스 활용 예제");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imageLabel);
		
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imageLabel.setIcon(images[index]);
			}
		});
		
		setSize(300, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboActionEx();
	}
}
