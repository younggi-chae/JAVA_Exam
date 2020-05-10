package ex.array;

import java.util.*;

public class arrayEx4 {
	// 배열을 통해 최대값, 최소값 구하기, sort(정렬)활용
	public static void main(String[] args) {

		int score[] = { 3, 6, 8, 5, 3, 2, 0, 9, 1 };
		int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화
		int min = score[0]; // 배열의 첫 번쨰 값으로 최소값을 초기화

		Arrays.sort(score); // 배열 정렬

		System.out.println("최대값 : " + score[score.length - 1]);
		System.out.println("최소값 : " + score[0]);

//		int score[] = {100, 90, 80, 70, 60};
//		
//		int max = score[0]; //배열의 첫 번째 값으로 최대값을 초기화
//		int min = score[0]; //배열의 첫 번째 값으로 최소값을 초기화
//		
//		for(int i = 1; i < score.length; i++) { // 배열의 2번째 값부터 for문을 실행하기위해 변수i를 1로 지정
//			 if(score[i] > max) {  // 배열의 index[1]부터 max와 비교하기 시작
//				 max = score[i]; //최대값
//			 } else if(score[i] < min) { // 배열의 index[1]부터 min과 비교하기 시작
//					 min = score[i]; //최소값 
//				 }
//			 }
//			  System.out.println("최대값 : "+max);
//			  System.out.println("최소값 : "+min);
	}

}
