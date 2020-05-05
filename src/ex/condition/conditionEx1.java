package ex.condition;

import java.util.*;

public class conditionEx1 {
	
//if문 연습	
	public static void main(String[] args) {
		
		int input;
		System.out.println("숫자를 하나 입력하세요. >");

		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
		String tmp = sc.nextLine(); // 화면을 통해 입력받은 내용 tmp에 저장
		input = Integer.parseInt(tmp); //문자열을 숫자로 변환
		
		if (input < 0) {
			System.out.println("음수의 값입니다.");
		} else if (input > 0) {
			System.out.println("양수의 값입니다.");

		}
		System.out.println("입력하신 숫자는 "+input+"입니다.");
		
		}
	}
}
