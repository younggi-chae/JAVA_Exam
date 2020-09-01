package java_exam.java1.Method;

public class OutputMethod {
	

	public static String a() {
		//리턴값이 메소드의 실행결과 그리고 메소드를 종료시킴
		//리턴값의 데이터 타입을 정해줘야 한다. void는 리턴값이 없다.
		return "a";
	}
	public static int one() {
		return 1;
	}
	
	
	public static void main(String[] args) {
               
		System.out.println(a());
		System.out.println(one());
		
	} 
}
