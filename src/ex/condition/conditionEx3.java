package ex.condition;

import java.util.*;

public class conditionEx3 {

	// 중첩 if문 연습
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		char opt = ' '; // 옵션 변수 추가

		System.out.println("당신의 점수를 입력해주세요.");

		Scanner sc = new Scanner(System.in);
       	String tmp = sc.nextLine();
		score = Integer.parseInt(tmp);

		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {  //중첩 조건문으로 A학점 안에 A+학점 추가
				opt = '+';
			} else if (score >= 93) {
				opt = '-';
			}

		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score >= 83) {
				opt = '-';
			}

		} else {
			grade = 'C';
		}

		System.out.println("당신의 점수는 " + score + "입니다.");
		System.out.println("당신의 학점은 " + grade + opt + "입니다.");
	}

}
