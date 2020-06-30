package ex.polymorphism;

//조상클래스와 자손클래스의 멤버들이 중복으로 정의
class Parent {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;

	void method() {
		System.out.println("Child Method"); 
	}
}

public class polymorphismEx3 {

	public static void main(String[] args) {
       //p와 c 모두 Child인스턴스를 참조
		Parent p = new Child(); //조상타입의 참조변수 p로 Child인스턴스의 멤버들을 사용
		Child c = new Child();  //자손타입의 참조변수 c로 Child인스턴스의 멤버들을 사용

		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
		//메서드인 method()의 경우 참조변수의 타입에 관계없이 항상 실제 인스턴스의 타입인 Child클래스의 정의된 메서드 호출
		//인스턴스변수인 x는 참조변수의 타입에 따라서 달라짐
	}

}
