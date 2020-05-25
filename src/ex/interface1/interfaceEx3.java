package ex.interface1;

//인터페이스 다형성 예제 연습.
interface father{}
interface mother{}
interface programmer {
	public void coding();
}
interface believer{}

class Steve implements father, programmer, believer {
	public void coding() {
		System.out.println("fast");
	}
}

class Rachel implements mother, programmer {
	public void coding() {
		System.out.println("elegance");
	}
}

public class interfaceEx3 {

	public static void main(String[] args) {
		//인터페이스인 programmer를 통해서 두사람을 관계하게 한다. 종교나 가족관계는 무시
		programmer employee1 = new Steve();
		programmer employee2 = new Rachel();
		
		employee1.coding();
		employee2.coding();
        //다형성을 쓰는 이유는 한 가지 타입으로 관리하여 묶어서 사용하기 위함
	}

}
