package ex.loop;

public class loopEx1 {

	public static void main(String[] args) {
		int sum = 0; //합계를 저장하기 위한 변수
	//for(초기화 ; 조건식 ; 증감식) 조건식이 참일때 동안 반복실행
		for(int i = 1; i <= 10; i++ ) {
			sum += i;
			System.out.println("1부터 "+ i +"까지의 합 = "+sum);
		}
    }
}
