package kosta.oop;

public class BoardMain {

	public static void main(String[] args) {
		
		Board board = new Board();
		board.print();
		System.out.println();		
		Board board2 = new Board(2, "게시글2","박길동", "글 내용입니다..", "2020-07-07", 3);
		board2.print();
		
	}

}
