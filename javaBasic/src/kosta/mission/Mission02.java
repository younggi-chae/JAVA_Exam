package kosta.mission;

import java.util.Scanner;

public class Mission02 {
	public static void main(String[] args) {
		char grade = 0;
		Scanner sc = new Scanner(System.in);

		while (grade != -1) {
			System.out.println("국어 점수를 입력해주세요.");
			int kor = sc.nextInt();

			System.out.println("영어 점수를 입력해주세요.");
			int eng = sc.nextInt();

			System.out.println("수학 점수를 입력해주세요.");
			int math = sc.nextInt();

			int sum = kor + eng + math;

			if (sum >= 270) {
				grade = 'A';
			} else if (sum >= 240) {
				grade = 'B';
			} else if (sum >= 210) {
				grade = 'C';
			} else {
				grade = 'F';
			}

			if (grade == 'F')
				System.out.println("당신의 총점은 " + sum + "입니다." + grade + "등급으로 과락입니다.");
			else
				System.out.println("당신의 총점은 " + sum + "입니다. 등급은 " + grade + "입니다.");
			
		}
	}
}

//		
//		int kor = 80;                                                   
//	    int eng = 90;
//		int math = 70;
//		
//		int total = kor+eng+math;
//	    int avg = (int) (total/3.0);
//		
//		System.out.println("총점 : " + total);
//		System.out.println("평균 : " + avg);
