package ex.polymorphism;

class ParentTest {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class ChildTest extends ParentTest {
	int x = 200;

	void method() {
		System.out.println("x = " + x);
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
	}
}

public class polymorphismEx4 {

	public static void main(String[] args) {

		ParentTest p = new ChildTest();
		ChildTest c = new ChildTest();

		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
	}

}
