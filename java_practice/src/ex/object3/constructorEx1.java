package ex.object3;

class Data1 {
	int value;
}

class Data2 {

	int value;

	Data2(int x) {

		value = x;
	}
}

public class constructorEx1 {

	public static void main(String[] args) {
		Data1 d1 = new Data1(); // 기본생성자(default constructor)가 자동으로 추가
		// Data2 d2 = new Data2(); //컴파일에러, 이미 생성자가 정의되어 있어 기본생성자 x
		Data2 d2 = new Data2(10);
		// 매개변수를 지정해주던가 클래스 Data2에 Data2() 기본 생성자를 추가해준다.
	}

}
