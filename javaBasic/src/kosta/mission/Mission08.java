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
		
		System.out.println("====메뉴 선택====");
		System.out.println("1.추가  2.출력  3.검색  4.종료");
		num = sc.nextInt();		
		
		switch (num) {		
		case 1:
			System.out.println("1.배열에 추가하기");
		    for(int i = 0; i < menu.length; i++) {
		    	menu[i] = sc.nextLine();
		    }		    
		case 2:
			System.out.println("2.출력");
			for(int i = 0; i <menu.length; i++) {
				System.out.print(menu[i]+ ",");
			}			
		case 3:
			System.out.println("검색");
			System.out.println(menu[2]);
		case 4:
			break;
		}	
		
	}

}
