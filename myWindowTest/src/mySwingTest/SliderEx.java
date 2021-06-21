package mySwingTest;

import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame{
	public SliderEx() {
		setTitle("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 300, 50);
		//JSlider slider = new JSlider(JSlider.VERTICAL, 0, 300, 50);  --세로 
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		
		c.add(slider);
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SliderEx();
	}
}
