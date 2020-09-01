package ex.object2;

class Factorial {} 

public class object2Ex3 {

	public static void main(String[] args) {
		int result = factorial(4); // int result = Factorial.factorial(4);
		System.out.println(result);

	}

	static int factorial(int n) { // static메서드이므로 인스턴스를 생성하지 않고 직접 호출 가능
		int result = 0;
      //n의 값이 0이나 큰 수를 입력하게 되면 stack Overflow Error 발생, 유효성검사 필요
		if (n == 1) { 
			result = 1;
		} else {
			result = n * factorial(n - 1); // 재귀호출 발생
		}
		return result;

	}
}
