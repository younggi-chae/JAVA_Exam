import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BoardManager b = new BoardManager();
		
				
		while (true) {
			System.out.println("1.추가  2.리스트  3.글 세부조회   4.수정  5.삭제  6.게시판 종료");
			System.out.println("선택 : ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				b.insertBoard();
				break;
			case "2":				
				b.getBoardList();
				break;
			case "3":
				b.searchBoard();
				break;				
			case "4":
				b.updateBoard();
				break;
			case "5":
				b.deleteBoard();
				break;
			case "6":
				System.out.println("게시판 종료");
				return;
			} //end switch
		} // end while
	}

}
