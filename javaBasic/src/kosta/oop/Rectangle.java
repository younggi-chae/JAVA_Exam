package kosta.oop;

public class Rectangle {
	// 가로, 세로, 면적
	// 면적 구하기
	// 면적 출력
	int a, b, z;
	
	public Rectangle() {}	

	public Rectangle(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void multiply() {
		z = a * b;
	}

	public void print() {
		System.out.println("면적 : " + z);
	}		
}
