package ex.exception;

public class exceptionEx2 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch(Exception e) {
			System.out.println(5); //예외발생 x , catch문은 실행되지 않는다.
		}
            System.out.println(6);
            
            System.out.println(7);
            System.out.println(8);
            try {
            	System.out.println(9);
            	System.out.println(0/0); //ArithmeticException 발생
            	System.out.println(10);  //예외발생 이후에 try블럭의 문장들은 실행되지 않는다.
            } catch(ArithmeticException ae) {
            	ae.printStackTrace(); // 예외발생 당시의 호출스택에 있었던 메서드정보와 예외메시지를 출력
            	System.out.println(ae.getMessage());  // 발생한 예외클래스의 인스턴스에 저장된 메세지 출력
            }
                System.out.println(11);
	}         //try블럭에 포함시킬 코드의 범위를 잘 선택하여야만 한다.

}

          