package lambda;

//사용자 정의 함수형 인터페이스
public class Lambda005 {

	public static void main(String[] args) {
		MyFunctionalInterface mfi =  a -> a*a;  //(int a) -> { return a*a; };
		                                        //타입 추정 기능
		int b = mfi.runSomething(5);
		
		System.out.println(b);

	}

}


@FunctionalInterface
interface MyFunctionalInterface {
	public abstract int runSomething(int count);
}