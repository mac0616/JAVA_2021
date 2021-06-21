package mySwingTest;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class SliderChangeEx extends JFrame {
	private JLabel colorLabel;
	private JSlider [] sl = new JSlider [3];
	int r, g, b;
	public SliderChangeEx() {
		setTitle("슬라이더와 ChangeEvent 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		colorLabel = new JLabel("슬라이더의 RGB색깔");
		for (int i=0; i<sl.length; i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 100);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			sl[i].addChangeListener(new MyChangeListener());
			c.add(sl[i]);
		}
		
		sl[0].setForeground(Color.RED);
		sl[1].setForeground(Color.GREEN);
		sl[2].setForeground(Color.BLUE);
		
		r = sl[0].getValue();
		g = sl[1].getValue();
		b = sl[2].getValue();
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(r, g, b));
		c.add(colorLabel);
		setSize(300, 230);
		setVisible(true);
	}
	
	class MyChangeListener implements ChangeListener{
		public void stateChanged(ChangeEvent e) {
			JSlider a = (JSlider)e.getSource();
			if(a.equals(sl[0]))
				r = a.getValue();
			else if (a.equals(sl[1]))
				g = a.getValue();
				b = a.getValue();
			colorLabel.setBackground(new Color(r, g, b));
		}
	}

	public static void main(String[] args) {
		new SliderChangeEx();
	}
}
