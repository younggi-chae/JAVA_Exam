package ex.condition;
import java.util.*;

public class conditionEx2 {

//else if문 연습
	
	public static void main(String[] args) {
		int score = 0; //점수 저장
		char grade = ' '; // 학점 저장, 공백으로 초기화

		System.out.println("점수를 입력해주세요.");

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String tmp = sc.nextLine();
			score = Integer.parseInt(tmp);

			if (score >= 90) {  //if-else if 조건문 실행
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else {
				grade = 'D'; // 70미만은 모두 D학점
			}
			System.out.println("당신의 점수는 "+score+"입니다.");
			System.out.println("당신의 학점은 " + grade + "입니다.");
		}

	}

}
