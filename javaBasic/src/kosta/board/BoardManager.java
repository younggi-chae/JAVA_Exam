package kosta.board;

import java.util.Scanner;

public class BoardManager {

	Board arr[];

	Scanner sc = new Scanner(System.in);

	private int seq = 0;
	private int cnt = 0;
	private int count = 0;

	public BoardManager() {
		arr = new Board[100];
	}

	public void insertBoard() {

		System.out.println("글제목 : ");
		String title = sc.nextLine();
		System.out.println("작성자 : ");
		String writer = sc.nextLine();
		System.out.println("글내용 : ");
		String content = sc.nextLine();
		System.out.println("작성일 : ");
		String date = sc.nextLine();
		System.out.println("파일번호 : ");
		String fileNo = sc.nextLine();
		System.out.println("파일이름 : ");
		String fileName = sc.nextLine();
		System.out.println("파일사이즈 : ");
		String fileSize = sc.nextLine();
		seq++;
		arr[count++] = new Board(seq, title, writer, content, date, fileNo, fileName, fileSize);
	}

	public void getBoardList() {
		for (int i = 0; i < count; i++) {
			arr[i].show();
		}
	}

	public void searchBoard() {
		System.out.println("글번호 : ");
		int seq = sc.nextInt();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			Board b = arr[i];
			if (seq == b.getSeq()) {
				b.setCnt(cnt++);
				b.getCnt();
				b.show();
				idx = i;
			}
		}
		if (idx == -1) {
			System.out.println("게시글이 없습니다.");
		}
	}

	public void updateBoard() {
		System.out.println("글번호 : ");
		int seq = sc.nextInt();
		int idx = -1;
		
		for (int i = 0; i < count; i++) {
			Board b = arr[i];
			if(seq == b.getSeq()) {				
				System.out.println("수정 글제목 입력 : ");
				String title = sc.nextLine();
				b.setTitle(title);
				System.out.println("수정 글내용 입력 : ");
				String content = sc.nextLine();
				b.setContent(content);
				
				idx = i;
				break;
			}
		}

	}

	public void deleteBoard() {
		System.out.println("삭제할 글 번호 : ");
		seq = sc.nextInt();

		for (int i = seq; i < count - 1; i++) {
			arr[i] = arr[i + 1];
		}
		count = count - 1;
	}

}