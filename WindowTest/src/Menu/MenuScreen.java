package Menu;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

//JFrame을 상속받고 자체적으로 ActionListener 를 구현해서 이벤트 처리
public class MenuScreen extends JFrame implements ActionListener {
	JPanel p1 = new JPanel(); // TextLabel 패널
	JPanel p2 = new JPanel();
	
	JLabel ml = new JLabel(); // 메시지 출력
	
	JTextField t1 = new JTextField(15); // 입력 양식
	JTextField t2 = new JTextField(15);
	
	JComboBox cb; // 관리 코드 선택
	
	JTextArea ta; // 데이터 출력

	JButton b1 = new JButton("등록/수정"); //버튼
	JButton b2 = new JButton("조회");
	JButton b3 = new JButton("삭제");
	JButton b4 = new JButton("닫기");

	MenuDAO dao = new MenuDAO(); // 데이터베이스 연동 클래스 인스턴스 생성
	
	Menu menu; // 상품정보 출력을 위한 상품 인스턴스 생성
	
	ArrayList<Menu> datas = new ArrayList<Menu>(); // 전체 상품 목록 출력을 위한 ArrayList
	
	boolean editmode; // 수정 또는 등록 모드
	
	public void startUI() {
		ml.setText("관리자 화면");
		ml.setEnabled(false);
	
		p1.setLayout(new GridLayout(5,2,2,2)); // 양식 배치를 위한 패널 레이아웃 설정
	
		JLabel l1 = new JLabel("번호"); // 양식에 사용될 라벨 설정
		JLabel l2 = new JLabel("메뉴");
		JLabel l3 = new JLabel("가격");
	
		cb = new JComboBox();
		ta = new JTextArea(10, 15);
		JScrollPane scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
											 JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		refreshData(); // 화면 데이터 갱신
		
		b1.addActionListener(this); // 이벤트 리스너 등록
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		p1.add(l1); p1.add(cb); p1.add(l2); p1.add(t1); p1.add(l3); p1.add(t2);
		p2.add(b1); p2.add(b2); p2.add(b3); p2.add(b4);
		b4.setBackground(Color.red);
	
		add(ml, BorderLayout.WEST); // 메인 프레임에 패널 및 컴포넌트 배치
		add(p1, BorderLayout.EAST);
		add(scroll, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
	
		setResizable(false);
		setVisible(true);
	}
	
	//전체 데이터 목록 출력 및 갱신 데이터
	public void refreshData() {
		ta.setText("");
		clearField();
		editmode = false;
		ta.append("   번호\t\t메뉴\t\t가격\n");
		datas = dao.getAll();
		
		// 데이터 변경 시 콤보박스 데이터 갱신
		cb.setModel(new DefaultComboBoxModel(dao.getItems()));
		if (datas != null) {
			// ArrayList의 전체 데이터를 형식에 맞춰 출력
			for (Menu p : datas) {
				StringBuffer sb = new StringBuffer();
				sb.append("   "+ p.getNo() + "\t\t");
				sb.append(p.getMenu() + "\t\t");
				sb.append(p.getPrice() + "\n");
				ta.append(sb.toString());
			}
		} else {
			ta.append("없는 메뉴입니다. 새로운 메뉴를 등록해주세요.");
		}
	}
	
	public void clearField() {
		t1.setText("");
		t2.setText("");
	}
	
	public MenuScreen() {
		super("관리자 메뉴관리화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(20, 20));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 450);startUI();
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		// 등록 버튼의 경우, 등록과 수정을 겸하여 처리
		if (obj == b1) {
			menu = new Menu();
			menu.setMenu(t1.getText());
			menu.setPrice(Integer.parseInt(t2.getText()));
			// 수정
			if (editmode == true) {
				menu.setNo(Integer.parseInt((String) cb.getSelectedItem()));
				if (dao.updateMenu(menu)) {
					ml.setText("메뉴 정보를 수정했습니다.");
					clearField();
					editmode = false;
				} else
					ml.setText("메뉴 정보 수정에 실패했습니다.");
			}
			// 등록
			else {
				if (dao.newMenu(menu)) {
					ml.setText("새로운 메뉴를 등록했습니다.");
				} else
					ml.setText("메뉴 등록에 실패했습니다.");
			}
			refreshData();
		}
		// 조회 버튼
		else if (obj == b2) {
			String s = (String) cb.getSelectedItem();
			if (!s.equals("전체")) {
				menu = dao.getMenu(Integer.parseInt(s));
				if (menu != null) {
					ml.setText("메뉴 정보를 조회합니다.");
					t1.setText(menu.getMenu());
					t2.setText(String.valueOf(menu.getPrice()));
					editmode = true;
				} else {
					ml.setText("조회할 수 없는 메뉴입니다.");
				}
			} else
				refreshData();
		}
		// 삭제 버튼
		else if (obj == b3) {
			String s = (String) cb.getSelectedItem();
			if (s.equals("전체")) {
				ml.setText("전체 삭제는 불가합니다.");
			} else {
				if (dao.delMenu(Integer.parseInt(s))) {
					ml.setText("메뉴가 삭제되었습니다.");
				} else {
					ml.setText("메뉴가 삭제되지 않았습니다.");
				}
			}
		}
		// 관리자
		else if (obj == b4) {
			dispose();
		}
	}
	public static void main(String[] args) {
	}
}