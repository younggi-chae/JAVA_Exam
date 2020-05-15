package ex.object;

class MethodTest{
	
	int add(int a, int b) {
		return a+b;
	}
	int multiply(int a, int b) {
		return a*b;
	}
	int subtract(int a, int b) {
		return a-b;
	}
	int divide(int a, int b) {
		return a/b;
	}
	
}

public class objectEx4 {

	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		
		System.out.println(mt.add(3, 5));
		System.out.println(mt.multiply(10, 4));
		System.out.println(mt.subtract(9, 3));
		System.out.println(mt.divide(9, 3));
	}

}
