package ex.object2;

public class object2Ex4 {

	static long factorial(int n) {
		if (n <= 0 || n > 20)
			return -1; // 매배변수 유효성검사
		if (n <= 1)
			return 1;
		return n * factorial(n - 1); //재귀호출
	}

	public static void main(String[] args) {
		int n = 21; // 유효범위에 벗어나는 값
		long result = 0;  //20억이 넘어가는 값은 int타입으로 담을 수 없기 떄문에 long타입 사용

		for (int i = 1; i <= n; i++) {
			result = factorial(i);

			if (result == -1) {
				System.out.println("유효하지 않는 값입니다.(0<" + n + "<=20)");
				break; // return값이 -1이면 for문을 빠져나옴
			}
			System.out.println(i + "! = " + result);
		}

	}

}
