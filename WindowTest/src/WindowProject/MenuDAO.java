package WindowProject;

import java.sql.*;
import java.util.*;

public class MenuDAO {
	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String jdbcURL = "jdbc:mysql://localhost/menudb";
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	Vector<String> items = null;
	String sql;
	
	// 콤보박스의 상품관리 번호 목록을 위한 벡터 리턴
	public Vector<String> getItems() {
	return items;
	}
	
	// 전체 상품 목록을 가지고 오는 메서드
	public ArrayList<Menu> getAll() {
	connectDB();
	sql = "select * from menus";
	
	//전체 검색 데이터를 전달하기 위한 ArrayList
	ArrayList<Menu> datas = new ArrayList<Menu>();
	
	// 관리코드 콤보박스 데이터를 위한 벡터 초기화
	items = new Vector<String>();
	items.add("전체");
	
	try {
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		// 검색된 데이터수 만큼 루프를 돌며 Product 객체를 만들고 이를 다시 ArrayList 에 추가함. 
		while(rs.next()) {
			Menu m = new Menu();
			m.setNo(rs.getInt("No"));
			m.setCategory(rs.getString("Category"));
			m.setRestaurant(rs.getString("Restaurant"));
			m.setMenu(rs.getString("Menu"));
			m.setPrice(rs.getInt("Price"));
			datas.add(m);
			items.add(String.valueOf(rs.getInt("no")));
		}
	}
	catch(SQLException e) {
		e.printStackTrace();
		return null;
	}
	finally {
		closeDB();
	}
	return datas;
	}
	
// 선택한 상품 코드에 해당하는 상품 정보를 가지고 오는 메서드
public Menu getMenu(int no) {
	connectDB();
	sql = "select * from menus where no=?";
	Menu p = null;
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, no);
		rs = pstmt.executeQuery();
		rs.next();
		p = new Menu();
		p.setNo(rs.getInt("No"));
		p.setCategory(rs.getString("Category"));
		p.setRestaurant(rs.getString("Restaurant"));
		p.setMenu(rs.getString("Menu"));
		p.setPrice(rs.getInt("Price"));
	}
	catch(SQLException e) {
		e.printStackTrace();
		return null;
	}
	finally {
		closeDB();
	}
	return p;
	}

// 새로운 상품을 등록하는 메서드
public boolean newMenu(Menu menu) {
	connectDB();
	
	// prcode 는 자동증가 컬럼이므로 직접 입력하지 않는다. 
	sql = "insert into menus(category,restaurant,menu,price) values(?,?,?,?)";
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, menu.getCategory());
		pstmt.setString(2, menu.getRestaurant());
		pstmt.setString(3, menu.getMenu());
		pstmt.setInt(4, menu.getPrice());
		
		pstmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
		return false;
	}
	finally {
		closeDB();
	}
	return true;
}

// 선택한 상품을 삭제하는 메서드
public boolean delMenu(int no) {
	connectDB();
	sql = "delete from menus where no=?";	
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, no);
		pstmt.executeUpdate();
	}
	catch(SQLException e) {
		e.printStackTrace();
		return false;
	}
	finally {
		closeDB();
	}
	return true;
}

// 수정한 정보로 상품정보를 업데이트 하는 메서드
public boolean updateMenu(Menu menu) {
	connectDB();
	sql = "update menus set  restaurant=?, menu=?, price=? where no=?";
	try {
		pstmt.setString(1, menu.getCategory());
		pstmt.setString(2, menu.getRestaurant());
		pstmt.setString(3, menu.getMenu());
		pstmt.setInt(4, menu.getPrice());
		pstmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
		return false;
	}
	finally {
		closeDB();
	}
	return true;
	}

	public void connectDB() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcURL, "javabook", "1234");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
 
 public void closeDB() {
	 try {
		 pstmt.close();
		 rs.close();
		 conn.close();
	 } catch(SQLException e) {
		 e.printStackTrace();
	 }
}
}