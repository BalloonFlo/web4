package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DB����Main {

	public static void main(String[] args) throws Exception {
		
		//�Է��ϴ� ȭ���� UI�Ŀ��� ������
		String id = JOptionPane.showInputDialog("id");
		String pw = JOptionPane.showInputDialog("pw");
		String name = JOptionPane.showInputDialog("name");
		String tel = JOptionPane.showInputDialog("tel");
		
		//�Է��� �����͸� ������ DB�� ����
		//DB�� member���̺� �ְ� �ʹ�
		// ==> MemberDAO����ϸ�ȴ�
		DAO dao = new DAO();
		dao.insert(id, pw, name, tel);
	}
}
