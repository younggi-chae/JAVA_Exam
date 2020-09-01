package java_exam.java1.Method;

public class WhyMethod {
	public static void printTwoTimesA() {
		System.out.println("-");
		System.out.println("A");
		System.out.println("A");
		
		
	}
	public static void main(String[] args) {
           //만약 코드가 1억줄이 있다면?? 메소드를 사용하면 1억줄이 한줄로 바꿀 수 있다.
		   //위에 클래스를 바꾸면 코드를 한꺼번에 바꿀 수 있다.
	        printTwoTimesA();
	        printTwoTimesA();
	        printTwoTimesA();
	}
}
