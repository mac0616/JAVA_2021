package Menu;

import java.sql.*;	
import java.util.*;

public class MenuDAO {  //DAO는 데이터베이스 관련 작업을 전담하는 클래스, DB에 연결하여 입력, 수정, 삭제, 조회 등의 작업을 하는 클래스
	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String jdbcUrl = "jdbc:mysql://localhost/stockdb";
	Connection conn;
	PreparedStatement statement;
	ResultSet set;
	Vector<String> items = null;
	String sql;
	
	public Vector<String> getItems() {
		return items;
	}
	// 전체 상품 목록
public ArrayList<Menu> getAll() {
	connectDB();
	sql = "select * from stockMgm";
	// 전체 검색 데이터 전달 ArrayList
	ArrayList<Menu> datas = new ArrayList<Menu>();
	// 관리 코드 콤보박스 데이터를 위한 벡터 초기화
	items = new Vector<String>();
	items.add("전체");
	try {
		statement = conn.prepareStatement(sql);
		set = statement.executeQuery();
	// 검색된 데이터 수만큼 루프를 돌며 Product 객체를 만들고 이를 다시 ArrayList에 추가
	while (set.next()) {
		Menu m = new Menu();
		m.setNo(set.getInt("no"));
		m.setMenu(set.getString("menu"));
		m.setPrice(set.getInt("price"));
		datas.add(m);
		items.add(String.valueOf(set.getInt("no")));
	}
	} catch (SQLException e) {
		e.printStackTrace();
		return null;
	} finally {
		closeDB();
	}
		return datas;
}
	// 선택한 상품 코드에 해당하는 상품 정보를 가져오는 메서드
public Menu getMenu(int no) {
	connectDB();
	sql = "select * from stockMgm where no=?";
	Menu m = null;
	try {
		statement = conn.prepareStatement(sql);
		statement.setInt(1, no);
		set = statement.executeQuery();
		set.next();
		m = new Menu();
		m.setNo(set.getInt("no"));
		m.setMenu(set.getString("menu"));
		m.setPrice(set.getInt("price"));
	} catch (SQLException e) {
		e.printStackTrace();
		return null;
	} finally {
		closeDB();
	}
	return m;
}
	// 상품 등록 메서드
public boolean newMenu(Menu menu) {
	connectDB();
	// prcode는 자동증가 컬럼이므로 직접 입력 X
	sql = "insert into stockMgm(menu, price) values(?,?)";
	try {
		statement = conn.prepareStatement(sql);
		statement.setString(1, menu.getMenu());
		statement.setInt(2, menu.getPrice());
		statement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
		return false;
	} finally {
		closeDB();
	}
	return true;
}
// 상품 수정 메서드
public boolean updateMenu(Menu menu) {
	connectDB();
	sql = "update stockMgm set menu=?, price=? where no=?";
	try {
		statement = conn.prepareStatement(sql);
		statement.setString(1, menu.getMenu());
		statement.setInt(2, menu.getPrice());
		statement.setInt(3, menu.getNo());
		statement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
		return false;
	} finally {
		closeDB();
	}
	return true;
}
	// 상품 삭제 메서드
public boolean delMenu(int no) {
	connectDB();
	sql = "delete from stockMgm where no=?";
	try {
		statement = conn.prepareStatement(sql);
		statement.setInt(1, no);
		statement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
		return false;
	} finally {
		closeDB();
	}
	return true;
}
public void connectDB() {
	try {
		Class.forName(jdbcDriver);conn = DriverManager.getConnection(jdbcUrl, "javabook", "1234");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	public void closeDB() {
		try {
			statement.close();
			set.close();
			conn.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}
}