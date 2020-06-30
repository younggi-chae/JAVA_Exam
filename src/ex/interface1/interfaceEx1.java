package ex.interface1;

public class interfaceEx1 {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Units) {
			System.out.println("f는 Units 클래스의 자손입니다.");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable 인터페이스를 구현했습니다.");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Movalbe 인터페이스를 구현했습니다.");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable 인터페이스를 구현했습니다.");
		}
		if(f instanceof Object) {
			System.out.println("f는 Objec 클래스의 자손입니다.");
		}
	}

}

class Fighter extends Units implements Fightable {
	public void move(int x, int y) {}  //오버라이딩 시 조상의 메서드보다 넓은 범위에 접근제어자 지정
	public void attack(Units u) {}     //interface Movable과 Attackable은 public abstract가 생략된 상태
}

interface Movable {
	void move (int x, int y);   //지정된 위치로 이동하는 메서드
}
interface Attackable {
	void attack(Units u);
}

interface Fightable extends Movable, Attackable{}    //인터페이스는 다중상속이 가능은 하다.ㅑ9ㅏ

class Units {
	int currentHP;
	int x;
	int y;
}

