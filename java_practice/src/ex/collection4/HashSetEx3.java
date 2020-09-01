package ex.collection4;
import java.util.*;

public class HashSetEx3 {
    // 5x5 빙고판 만들기
	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		int[][] board = new int[5][5];  // 5x5 다차원 배열 생성
		
		for(int i = 0; set.size() < 25; i++) {     // 총 25개의 숫자를 랜덤으로 뽑는다
			set.add((int)(Math.random()*50)+1+""); // 50개의 숫자 중 25개 숫자 랜덤으로 뽑아서 set에 저장
		}
		
		Iterator it = set.iterator();
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String)it.next()); //next의 반환값은 object타입이므로 형변환
				System.out.print((board[i][j] < 10 ? " " : " ")+ board[i][j]);
			}
			System.out.println();
		}

	}

}
