package kosta.phone;

public class Board {
	//입력 : 글제목, 작성자, 글내용 => Board객체 생성
	
	// 2. 전체출력
	// 글번호 글제목 작성자 작성자일자  조회수
	//3.글세부조회
	//글번호를 통해 해당 글 조회
	//글번호, 글제목, 작성자, 글내용, 작성일자, 조회수 => 1개  Board객체
	//4.수정/삭제
	//5. 검색(제목, 작성자) 내가 원하는 글들만 출력
	
	int seq;
	String title;
	String writer;
	String content;
	String date;
	int cnt;
	
	public Board() {}
	
	public Board(int seq, String title, String writer, String content, String date) {
		super();		
		this.seq = seq;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.date = date;	
	}

	public void show() {
		System.out.println("글번호 : " + seq);
		System.out.println("글제목 : " + title);
		System.out.println("작성자 : " + writer);
		System.out.println("글내용 : " + content);
		System.out.println("작성일 : " + date);
		System.out.println("조회수 : " + cnt);
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}

