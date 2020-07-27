package kosta.lambda;

public class LambdaExam2 {

	public static void main(String[] args) {
		
		//Max값 구하기
		MyNumber my = (num1, num2) -> num1 > num2 ? num1 : num2;		
		System.out.println(my.getMax(5, 10));

		
		//Runnable => 람다식 (1~10) 출력
		Runnable r = () -> {
			for(int i =1; i <= 10; i++)
				System.out.println(i);
		};	
		Thread t = new Thread(r);
		t.start();
	}

}
