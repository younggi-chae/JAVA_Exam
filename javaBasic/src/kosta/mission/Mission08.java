package kosta.mission;

import java.util.Scanner;

public class Mission08 {

	public static void main(String[] args) {
		//메뉴를 선택해서 해당 메뉴의 명령을 실행하자.
		//1.추가 2.출력 3.검색 4.종료
		//String 배열을 생성
		//입력 : 1
		//배열에 데이터를 추가
		//입력 : 2
		//배열에 있는 모든 데이터가 출력
		//입력 : 3
		//인덱스 : 2
		//해당 인덱스의 배열 내용이 출력
		//switch문 사용
		
		String[] menu = new String[3];
		int num;
		Scanner sc = new Scanner(System.in);
		
		
		num = sc.nextInt();
		
		switch (num) {
		case 1:
			menu[0] = "햄버거";
			break;
		case 2:
			menu[1] = "치킨";
		case 3:
			menu[2] = "피자";
			break;
		}
		
		for(int i = 0; i < menu.length; i++) {
			System.out.print(menu[i] + ",");
		}
		
	}

}
