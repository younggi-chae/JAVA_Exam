package ex.object4;

class Point2 {
	int x = 10;
	int y = 20;

	Point2(int x, int y) { //Point 생성자
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point2 {
	int z = 30;

	Point3D() {
		this(100, 200, 300); // Point3D(int x, int y, int z)를 호출한다.
	}

	Point3D(int x, int y, int z) {
		super(x, y); // Point(int x, int y)를 호출한다. 조상클래스의 생성자를 가리킴
		this.z = z;
	}
}

public class overridingEx2 {

	public static void main(String[] args) {
		Point3D p3 = new Point3D();
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.z = " + p3.z);

	}

}
