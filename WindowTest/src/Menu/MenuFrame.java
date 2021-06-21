package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MenuFrame extends JFrame implements ActionListener{
	MenuDAO dao = new MenuDAO();
	JButton btn3 = new JButton("관리자");  //컴텐트팬(GUI컴포넌트들이 부착되는 공간)에 컴포넌트 달기
	
	
	public void actionPerformed(ActionEvent e) {  //클래스
		Object obj = e.getSource();
		if(obj == btn3) {  //관리자 버튼 클릭 시
			new MenuScreen();  //menuscreen화면 나오도록
		}
	}
	
	public MenuFrame() {
		setTitle("메뉴 계산기");  //제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //윈도운 창 종료 시 프로세스도 종료
		setContentPane(new MenuPanel());   //컨텐트팬 병병
		setSize(970,600);  //프레임 크기
		setVisible(true);  //프레임을 화면에 나타낼 것인가
		btn3.addActionListener(this);
		btn3.setSize(100, 50); //버튼 크기
		btn3.setLocation(802, 480);  //버튼 위치
		btn3.setBackground(Color.yellow);  //버튼 색
		add(btn3);  //컴텐트팬에 컴포넌트 달기
	}
}
