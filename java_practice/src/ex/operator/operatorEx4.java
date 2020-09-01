package ex.operator;

public class operatorEx4 {

	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		
		long c = a * b; //2,000,000,000,000??
		System.out.println(c); //데이터 손실이 일어난다.
		// int타입 * int타입 = int타입, long으로 강제형변환을 해야함.
		
	    long a1 = 1000000 * 1000000; //int타입 * int타입
	    long b1 = 1000000 * 1000000L;// int타입 * long타입
	    
	    System.out.println(a1); //오버플로우 발생
	    System.out.println(b1); //정확한 결과값
	}

}
