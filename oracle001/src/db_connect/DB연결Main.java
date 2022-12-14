package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DB연결Main {

	public static void main(String[] args) throws Exception {
		
		//입력하는 화면을 UI파엘에 만들자
		String id = JOptionPane.showInputDialog("id");
		String pw = JOptionPane.showInputDialog("pw");
		String name = JOptionPane.showInputDialog("name");
		String tel = JOptionPane.showInputDialog("tel");
		
		//입력한 데이터를 가지고 DB에 넣자
		//DB의 member테이블에 넣고 싶다
		// ==> MemberDAO사용하면된다
		DAO dao = new DAO();
		dao.insert(id, pw, name, tel);
	}
}
