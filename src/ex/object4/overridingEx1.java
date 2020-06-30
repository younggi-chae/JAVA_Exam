package ex.object4;

public class overridingEx1 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();

	}

}

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x); //자식클래스의 멤버변수 x를 뜻함
		System.out.println("super.x = " + super.x); //부모클래스 멤버변수 x를 뜻함
	}
}