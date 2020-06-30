package ex.interface1;

interface Repairable {}
class GroundUnit extends Unit1{
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit1 {
	AirUnit(int hp) {
		super(hp);
	}
}
class Unit1 {
	int hitPoint;
	final int MAX_HP;
	Unit1(int hp) {
		MAX_HP = hp;
	}
}
class Tank1 extends GroundUnit implements Repairable {
	Tank1() {
	super(150);       //Tank의 HP
	hitPoint = MAX_HP;
 }
	public String toString() {
		return "Tank";
	}
}
class Dropship1 extends AirUnit implements Repairable {
	Dropship1(){
		super(125);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Dropship";
	}
}

class Marine1 extends GroundUnit {
	Marine1(){
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable {
   SCV() {
	   super(60);
		hitPoint = MAX_HP;
   }
	void repair(Repairable r) {   //repair 메서드 부여
		if (r instanceof Unit1) { //instanceof 연산자로 타입을 체크한 뒤 캐스팅
			Unit1 u1 = (Unit1)r; //인터페이스를 구현한 클래스들만 수리
			while(u1.hitPoint != u1.MAX_HP) {   //체력이 감소되는 동안
				u1.hitPoint++;   //유닛의 hp를 증가시킨다.
			}
			System.out.println(u1.toString() + "의 수리가 끝났습니다.");
		}
	}
}

public class interfaceEx4 {

	public static void main(String[] args) {
		 Tank1 tank = new Tank1();
		 Dropship1 dropship = new Dropship1();
		 
		 Marine1 marine = new Marine1();
		 SCV scv = new SCV();
		 
	     scv.repair(tank);
		 scv.repair(dropship);
		 //scv.repair(marine);  // 에러발생. 인터페이스 구현 x

	}

}
