package kosta.oop;

public class Board {
	
	int seq;
	String title;
	String writer;
	String content;
	String date;
	int cnt;
	
	Board(){
		this(1, "게시글", "홍길동", "글 내용입니다..", "2020-07-07", 1);																																																																	
	}
	
	Board(int seq, String title, String writer, String content, String date, int cnt){
		this.seq = seq;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.date = date;
		this.cnt = cnt;			
	}
	
	public void print() {
		System.out.println("글 번호 : " + seq);
		System.out.println("글 제목 : " + title);
		System.out.println("작성자 : " + writer);
		System.out.println("글 내용 : " + content);
		System.out.println("작성일 : "  + date);
		System.out.println("조회수 : " + cnt);
	}
}
