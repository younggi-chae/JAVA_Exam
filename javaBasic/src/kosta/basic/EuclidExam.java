package kosta.basic;

public class EuclidExam {

	static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x%y);
		}
	}

	public static void main(String[] args) {
		int x = 78696;
		int y = 19332;
		
		System.out.println("최대 공약수 : " + gcd(x, y));
	}

}
