package kosta.basic;

import java.util.Scanner;

public class LoopExam {
	public static void main(String[] args) {
		// while : 초기식 -> 조건식 -> 명령문 -> 증감식 : 수직구조
//		int sum = 0;
//		int i = 1;
//		while (i <= 10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1에서 10까지의 합: " + sum);

		// 구구단 7단 출력
		// 7 * 1 = 7
//		int i2 = 1;
//		while(i2 <= 9) {
//			System.out.println(7 + " * " + i2 + " = " + 7*i2);
//			i2++;
//		}

		// do~while : 명령을 먼저 실행한 후 조건을 비교
		// 적어도 1번은 무조건 실행이 필요한 경우

		// 키보드로 부터 숫자를 입력받아 합을 구하자.
		// 음수를 입력하면 새롭게 다시 입력을 받도록 하자.

//		int num = 0;
//		Scanner sc = new Scanner(System.in);		
//		do {			
//			System.out.println("숫자를 입력해 주세요.");
//			num = sc.nextInt();
//		} while(num <= 0);
//		
//			int sum = 0;
//			int i = 1;
//			while(i<=num) {
//				sum+=i;
//				i++;
//			}
//			
//			System.out.println("1에서 " + num + "까지의 합 " + sum);

		// 2자리 숫자만 입력받아서 출력하세요.
//		int num = 0;
//		Scanner sc = new Scanner(System.in);		
//		do {			
//			System.out.println("숫자를 입력해 주세요.");
//			num = sc.nextInt();
//		} while(num < 9 || num > 99);
//		
//			int sum = 0;
//			int i = 1;
//			while(i<=num) {
//				sum+=i;
//				i++;
//			}
//			
//			System.out.println("1에서 " + num + "까지의 합 " + sum);

		// for문 : 초기식 -> 조건식 -> 명령문 -> 증감식 : 수평방향
//		int sum = 0;
//		for(int i = 1; i <=10; i++) {
//			sum += i;			
//		}
//		System.out.println("1에서 10까지의 합: " + sum);
//		
//		
//		for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i +" * " + j + " = " + i*j);
//			}
//			System.out.println();
//		}

		// 1~100 사이에 2의 배수 및 3의 배수가 아닌 숫자만 출력하세요.

//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0 || i % 3 == 0) 
//				continue;
//				System.out.print(i+ ",");

//			if (!(i % 2 == 0 || i % 3 == 0)) {
//				num = i;
//				System.out.print(num + ",");

		int menu = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요(종료:0) >");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				System.out.println();
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
			System.out.println();
		}		
	}

}
