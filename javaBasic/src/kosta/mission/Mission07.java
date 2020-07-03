package kosta.mission;

import java.util.Scanner;

public class Mission07 {

	public static void main(String[] args) {

		// up_down Game 구현
		// 임의의 난수를 1~100 생성해서
		// 입력한 숫자와 비교해서 UP/DOWN 메세지를 출력하여
		// 정 답을 맞추는 게임

		int num;
		int input;

		Scanner sc = new Scanner(System.in);
		num = (int) (Math.random() * 100) + 1;
		System.out.println("UP & DOWN Game");
		
		while (true) {			
			System.out.println("숫자를 입력해 주세요. >>");
			input = sc.nextInt();			
			
			if (num > input)
				System.out.println("UP");
			else if (num < input)
				System.out.println("DOWN");
			else {
				System.out.println("정답입니다!");
				break;
			}
		}
	}

}
