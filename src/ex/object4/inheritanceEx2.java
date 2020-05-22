package ex.object4;

class Shape {
	String color = "black";

	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Point() {
		this(0, 0);
	}

	String getXY() {
		return "(" + x + ", " + y + ")";
	}
}

class Circle extends Shape {  //Shape의 color와 draw멤버를 사용할 수 있게됨
	Point center;
	int r;

	Circle() {
		this(new Point(0, 0), 100); //Circle(Point center, int r) 호출
	}

	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	void draw() {  //원을 그리는 대신에 원의 정보를 출력, 오버라이딩
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape {  //Shape의 color와 draw멤버를 사용할 수 있게됨
	Point p[] = new Point[3];
 
	Triangle(Point p[]) {
		this.p = p;
	}

	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}

public class inheritanceEx2 {

	public static void main(String[] args) {
		Point p[] = { new Point(100, 100), new Point(140, 50), new Point(200, 100) };
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150, 150), 50);

		t.draw();
		c.draw();
	}

}
