package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DB연결Main3 {

	public static void main(String[] args) throws Exception {
		
		//입력하는 화면을 UI파엘에 만들자
		String id = JOptionPane.showInputDialog("id");
		String pw = JOptionPane.showInputDialog("pw");
		String name = JOptionPane.showInputDialog("name");
		String tel = JOptionPane.showInputDialog("tel");
		
		//입력한 데이터를 가지고 DB에 넣자
		//DB의 member테이블에 넣고 싶다
		// ==> MemberDAO사용하면된다
		MemberDAO dao = new MemberDAO();
		
		//보내는 쪽
		//1) 가방을 만든다
		MemberVO bag = new MemberVO();
		//2) 가방에 입력한 값들을 넣자 (set()이용)
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		//3) 가방을 DAO에게 전달
		
		dao.insert(bag);
		
	}
}
