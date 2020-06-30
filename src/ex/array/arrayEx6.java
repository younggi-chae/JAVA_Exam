package ex.array;

public class arrayEx6 {
       //배열을 통한 로또번호 생성 연습
	public static void main(String[] args) {
		int ball[] = new int[45]; // 45개의 정수값을 저장하는 배열 생성
		
		for(int i = 0; i < ball.length; i++) { //배열에 1~45값을 저장
			ball[i] = i+1; // ball[0]에 1을 저장, 1부터 시작하도록 만듦
		}
			int tmp = 0; // 두개의 값을 바꾸는데 사용할 임시변수
			int j = 0; // 임의의 값을 저장할 변수
			
			for(int i = 0; i < 6; i++) { // 6개의 임의의 숫자를 뽑는다.
				tmp = ball[i];
				
				j = (int)(Math.random()*45); //1~45까지 임의 값을 얻음
				
				ball[i] = ball[j]; //임의로 뽑은 숫자를 i에 저장
				ball[j] = tmp; // i와 j값을 바꾼다.
			}
			for(int i = 0; i < 6; i++) {
				System.out.println("ball "+i+" = "+ball[i]);
			}
			}

}
