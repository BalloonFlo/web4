package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DB����Main3 {

	public static void main(String[] args) throws Exception {
		
		//�Է��ϴ� ȭ���� UI�Ŀ��� ������
		String id = JOptionPane.showInputDialog("id");
		String pw = JOptionPane.showInputDialog("pw");
		String name = JOptionPane.showInputDialog("name");
		String tel = JOptionPane.showInputDialog("tel");
		
		//�Է��� �����͸� ������ DB�� ����
		//DB�� member���̺� �ְ� �ʹ�
		// ==> MemberDAO����ϸ�ȴ�
		MemberDAO dao = new MemberDAO();
		
		//������ ��
		//1) ������ �����
		MemberVO bag = new MemberVO();
		//2) ���濡 �Է��� ������ ���� (set()�̿�)
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		//3) ������ DAO���� ����
		
		dao.insert(bag);
		
	}
}
