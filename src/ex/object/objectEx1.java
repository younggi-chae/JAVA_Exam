package ex.object;

class Tv {
	// Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;

	// Tv의 기능(메서드)
	void power() {
		power = !power;
	} // power의 값이 true면 false로, false면 true로 변경하는 역할

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

public class objectEx1 {

	public static void main(String[] args) {

		Tv t1 = new Tv(); // Tv인스턴스 생성
		Tv t2 = new Tv();

		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

		t1.channel = 7; // channel의 값을 7로 한다.
		t1.channelDown(); // Tv인스턴스의 메서드 channelDown을 호출
		t2.channel = 11;
		t2.channelUp();
		System.out.println("t1의 channel은 " + t1.channel + "번으로 변경되었습니다.");
		System.out.println("t2의 channel은 " + t2.channel + "번으로 변경되었습니다.");
	}

}
