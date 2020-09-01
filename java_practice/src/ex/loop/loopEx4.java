package ex.loop;

public class loopEx4 {
     //구구단 2~9단까지 출력 연습
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {  //2단~9단까지 8번 반복출력한다. 안쪽 for문 1~9까지 순환 후 다음 반복으로 변경
			for(int j = 1; j <= 9; j++) { //1~9까지 반복적으로 순환
			 System.out.println(i+ " x "+ j +" = " + i*j);	
			}
		}

	}

}
