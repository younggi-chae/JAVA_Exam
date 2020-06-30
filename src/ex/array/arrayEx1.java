package ex.array;

public class arrayEx1 {

	public static void main(String[] args) {
		int[] score = new int[5]; //배열선언 및 배열생성
		//int[] score = {50, 60, 70 ,80, 90}
		int j = 1; //test
		
		score[0] = 50;
		score[1] = 60;
		score[j+1] = 70; //test
		score[3] = 80;
		score[4] = 90;
		//score[5] = 100; //인덱스의 범위가 넘어가면 ArrayIndexOutOfBoundsException 에러발생
		
		int tmp = score[j+1] + score[4]; // 인덱스[2]와 인덱스[4]의 합계, tmp에 저장
		
		for(int i = 0; i < score.length; i++) { //length를 통해 인덱스의 길이측정
			 System.out.println(score[i]);
			 
			
		}
		System.out.println(tmp); // 합계
	}

}
