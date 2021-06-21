package mySwingTest;

import javax.swing.*;
import java.awt.*;

public class ComboBoxEx extends JFrame{
	private String [] fruits = {"apple", "banana", "kiwi", "mango","pear",
								"peach", "berry", "strawberry", "blackberry"};
	private String[] names = {"국어", "수학", "영어", "과학", "체육"};
	public ComboBoxEx() {
		setTitle("콤보박스 만들기 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		c.add(strCombo);
		
		JComboBox<String> nameCombo = new JComboBox<String>();
		for(int i=0; i<names.length; i++)
			nameCombo.addItem(names[i]);
		c.add(nameCombo);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboBoxEx();
	}
}
