package ex.array;

public class arrayEx9 {
          // 2차원 배열 연습
	public static void main(String[] args) {
		int score[][] = { { 100, 90, 80 }, { 90, 80, 70 }, { 80, 70, 60 }, { 70, 60, 50 } };
        //과목별 총정 변수선언
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;

		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("==========================");

		for (int i = 0; i < score.length; i++) { //과목별 합계 
			int sum = 0;   //개인별 총점
			float avg = 0.0f; //개인별 평균

			korTotal += score[i][0]; // 행만 for문으로 순환 1번째열, 국어합계
			engTotal += score[i][1]; // 행만 for문으로 순환 2번째열, 영어합계
			mathTotal += score[i][2]; // 행만 for문으로 순환 3번째열, 수학합계
			System.out.printf("%1d", i + 1);

			for (int j = 0; j < score[i].length; j++) { //개인별 합계
				sum += score[i][j];
				System.out.printf("%4d", score[i][j]);

			}
			avg = sum / (float) score[i].length; //평균 계산
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("==========================");
		System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, mathTotal);
	}

}
