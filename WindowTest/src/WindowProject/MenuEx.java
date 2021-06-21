package WindowProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

// 메인 프로그램, JFrame 을 상속받고 자체적으로 ActionListener 를 구현해서 이벤트 처리
public class MenuEx extends JFrame implements ActionListener{
	// 화면 구성을 위한 패널 정의
	JPanel p1 = new JPanel(); // Lable과 TextFiled 패널
	JPanel p3 = new JPanel(); // 버튼 패널

	JLabel ml = new JLabel(); //메시지 출력 Label
	
	// 입력양식에 사용될 텍스트 필드
	JTextField t1 = new JTextField(10);
	JTextField t2 = new JTextField(10);
	JTextField t3 = new JTextField(10);
	JTextField t4 = new JTextField(10);
	
	// 관리 코드 선택을 위한 콤보박스
	JComboBox cb;
	
	// 데이터 출력을 위한 텍스트영역
	JTextArea ta;
	
	// 메뉴 버튼
	JButton b1 = new JButton("ADD"); 
	JButton b2 = new JButton("SEARCH");
	JButton b3 = new JButton("DELETE");
 
	 // 데이터베이스 연동 클래스 인스턴스 생성
	MenuDAO dao = new MenuDAO();

	// 상품정보 출력을 위한 상품 인스턴스 생성
	Menu menu;

	// 전체 상품목록 출력을 위한 ArrayList 생성
	ArrayList<Menu> datas = new ArrayList<Menu>();
	boolean editmode;
	
	// 메인 UI 실행 메서드
	public void startUI() {
	ml.setText("메뉴추천프로그램");
	ml.setEnabled(false);
	
	// 양식 배치를 위한 패널 레이아웃 설정
	p1.setLayout(new GridLayout(4,1));
	//p2.setLayout(new GridLayout(5,1,5,5));
	
	// 양식에 사용될 라벨 설정
	JLabel l1 = new JLabel("NO");
	JLabel l2 = new JLabel("CATEGORY");
	JLabel l3 = new JLabel("RESTAURANT");
	JLabel l4 = new JLabel("MENU");
	JLabel l5 = new JLabel("PRICE");
	
	// 양식에 사용될 콤보박스와 텍스트 영역 초기화
	cb = new JComboBox();
	ta = new JTextArea(15,50);
	JScrollPane scroll = new JScrollPane (ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
											  JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    getContentPane().add(scroll);
	
	// 화면 데이터 갱신
	refreshData();
	
	// 이벤트 리스너 등록
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
	// 패널에 컴포넌트 추가
	//p1.add(l1); p1.add(l2); p1.add(l3); p1.add(l4); p1.add(l5);
	//p2.add(cb); p2.add(t1); p2.add(t2); p2.add(t3); p2.add(t4);
	//p3.add(b1); p3.add(b2); p3.add(b3);
	
	p1.add(l1); p1.add(cb); 
	p1.add(l2); p1.add(t1); 
	p1.add(l3); p1.add(t2); 
	p1.add(l4); p1.add(t3); 
	p1.add(l5); p1.add(t4); 
	p3.add(b1); p3.add(b2); p3.add(b3);
	// 메인 프레임에 패널 및 컴포넌트 배치
	add(ml,BorderLayout.WEST); //메시지 라인
	add(p1,BorderLayout.WEST);
	add(scroll,BorderLayout.SOUTH);
	add(p3,BorderLayout.CENTER);
	setResizable(false);
	setVisible(true);
}
	
	// 전체 데이터 목록 출력 및 갱신 메서드
	public void refreshData() {
	//ta.setText("");
	clearField();
	editmode=false;
	ta.append("  No\tCATEGORY\tRESTAURANT\t\tMENU\tPRICE\n");
	datas = dao.getAll();
	// 데이터변경시 콤보박스 데이터 갱신
	cb.setModel(new DefaultComboBoxModel(dao.getItems()));
	if(datas != null) {
		// ArrayList 의 전체 데이터를 형식에 맞춰 출력
		for(Menu m : datas) {
			StringBuffer sb = new StringBuffer();
			sb.append("  " + m.getNo() + "\t");
			sb.append(m.getCategory() + "\t");
			sb.append(m.getRestaurant() + "\t\t");
			sb.append(m.getMenu() + "\t");
			sb.append(m.getPrice() + "\t");
			ta.append(sb.toString());
		}
	}
	else {
		ta.append("등록된 메뉴가 없습니다.");
	}
}
	
// 생성자, 프레임 초기화
public MenuEx() {
	super("메뉴 프로그램");
	setLayout(new BorderLayout(20,20));
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(800,500);
}

// 등록, 삭제, 전체 목록 조회시 필드 초기화
public void clearField() {
	t1.setText("");
	t2.setText("");
	t3.setText("");
}

// 이벤트 발생 처리 메서드
 public void actionPerformed(ActionEvent e) {
	 Object obj = e.getSource();
	 // 등록 버튼인 경우, 등록과 수정을 겸해서 처리함.
	 if(obj == b1) {
		 menu = new Menu();
		 menu.setCategory(t1.getText());
		 menu.setRestaurant(t2.getText());
		 menu.setMenu(t3.getText());
		 menu.setPrice(Integer.parseInt(t4.getText()));
 
		 if(editmode == true) {
			 menu.setNo(Integer.parseInt((String)cb.getSelectedItem()));
			 if(dao.newMenu(menu)) {
				 ml.setText("새로운 메뉴를 등록했습니다.");
			 }
			 else
				 ml.setText("메뉴 등록에 실패했습니다.");
		 }
		 // 화면 데이터 갱신
		 refreshData();
	 }
	 // 조회 버튼인 경우
	 else if(obj == b2) {
		 String s = (String)cb.getSelectedItem();
		 if(!s.equals("All")) {
			 menu = dao.getMenu(Integer.parseInt(s));
			 if(menu != null) {
				 ml.setText("선택하신 메뉴를 조회합니다.");
				 t1.setText(menu.getCategory());
				 t3.setText(menu.getMenu());
				 t4.setText(String.valueOf(menu.getPrice())); 
				 editmode = true;
			 }
			 else {
				 ml.setText("선택하신 메뉴 조회에 실패하였습니다."); 
			 } 
		 }
		 else {
			 // 화면 데이터 갱신
			 refreshData();
		 }
	 }
	 // 삭제 버튼인 경우
	 else if(obj == b3) {
		 String s = (String)cb.getSelectedItem();
		 if(s.equals("All")) {
			 ml.setText("전체 삭제는 불가능합니다.");
		 } else {
			 if(dao.delMenu(Integer.parseInt(s))) {
				 ml.setText("선택하신 메뉴가 삭제되었습니다.");
			 }
			 else {
				 ml.setText("선택하신 메뉴가 삭제되지 않았습니다."); 
			 } 
		 }
		 refreshData();
	 }
 }
 
public static void main(String[] args) {
	MenuEx pm = new MenuEx();
	pm.startUI();
	}
}