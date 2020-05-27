package ex.exception;

public class exceptionEx4 {

	public static void main(String[] args) {
		method1();
		System.out.println("method1()의 수행을 마치고 main메서드로 돌아왔습니다.");

	}
        static void method1() {
        	try {
        		System.out.println("method1()이 호출되었습니다.");
        		return;  //try블럭 return문 실행, finally블럭 실행??
        	} catch(Exception e) {
        		e.printStackTrace();
        	} finally { // finally블럭은 예외 발생여부에 상관없이 무조건 실행된다.
        		System.out.println("method1()의 finally블럭이 실행되었습니다.");
        	}
        }
}
