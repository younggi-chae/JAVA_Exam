package ex.array;
       //총점과 평균 구하기 연습
public class arrayEx3 {

	public static void main(String[] args) {
		int sum = 0;    //총점을 저장하기 위한 변수
		double avg = 0; //평균을 저장하기 위한 변수

		int[] score = { 100, 87, 75, 60, 52 };

		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // 반복문을 통해 배열에 값들을 모두 더한다.
		}
		avg = sum / (double) score.length; // 평균값을 실수로 표현하기 위해 형변환

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
 