package lambda;

//메서드 인자로 람다식(함수형 인터페이스) 참조 변수 사용
public class Lambda006 {

	public static void main(String[] args) {
		
		MyFunctionalInterface mfi = a -> a*a;
		doIt(mfi);

	}
	
	public static void doIt(MyFunctionalInterface mfi) {
		int b = mfi.runSomething(5);
		
		System.out.println(b);
	}

}
