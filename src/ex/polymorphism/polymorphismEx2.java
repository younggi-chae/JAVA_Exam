package ex.polymorphism;
import ex.polymorphism.*;
//instanceof 연산자 테스트

public class polymorphismEx2 {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();

		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		if(fe instanceof Car) {
			System.out.println("This is a Car instance");
		}
		if(fe instanceof Object) {
			System.out.println("This is an Object instance");
		}
		System.out.println(fe.getClass().getName()); //클래스의 이름 출력
	}
      //모두 true를 반환, FireEngine클래스는 Car클래스와 Object클래스의 자손이기 때문, 따라서 형변환 가능
}
