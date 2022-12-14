package db_connect;

public class Bbs01VO {

	//DB테이블의 컬럼과 동일한 이름으로 만들어주자
	//실무에서는 변수명과 컬럼명을 동일하게 만들어주면
	//나중에서 알아서 가방에 값을 넣었다가 꺼냈다가를 자동으로 해준다
	private int no;
	private String title;
	private String content;
	private String writer;

	//getters/setters 자동완성
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
	
	//toString 자동완성
	@Override
	public String toString() {
		return "Bbs01VO [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
}
