package db_connect;

public class Bbs01VO {

	//DB���̺��� �÷��� ������ �̸����� ���������
	//�ǹ������� ������� �÷����� �����ϰ� ������ָ�
	//���߿��� �˾Ƽ� ���濡 ���� �־��ٰ� ���´ٰ��� �ڵ����� ���ش�
	private int no;
	private String title;
	private String content;
	private String writer;

	//getters/setters �ڵ��ϼ�
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	//toString �ڵ��ϼ�
	@Override
	public String toString() {
		return "Bbs01VO [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
}
