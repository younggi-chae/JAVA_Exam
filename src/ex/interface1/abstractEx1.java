package ex.interface1;

public class abstractEx1 {

	public static void main(String[] args) {
		 Marine m = new Marine();
		 Tank t = new Tank();
		 Dropship d = new Dropship();
         
		 m.move(130, 100);
		 t.move(200, 130);
		 d.move(100, 200);
		 m.stop();
		 m.stimPack();
		 t.changeMode();
		 d.load();
		 d.unload();
	}

}

abstract class Unit {
	int x, y;   //현재 위치 좌표.
	abstract void move(int x , int y); //추상메서드, 자식클래스에서 반드시 구현해주어야 한다.
	void stop() {System.out.println("대상이 멈추었습니다.");}
}

class Marine extends Unit {
	void move (int x, int y) {System.out.println("대상이 "+ x + ", "+ y +"만큼 이동하였습니다."); } //추상클래스 구현
    void stimPack()    {System.out.println("스팀팩을 사용하였습니다.");}
	}
class Tank extends Unit {
	void move (int x, int y) { System.out.println("대상이 "+ x + ", "+ y +"만큼 이동하였습니다.");  } //추상클래스 구현
    void changeMode()    {System.out.println("공격모드로 전환하였습니다.");}
	}
class Dropship extends Unit {
	void move (int x, int y) {System.out.println("대상이 "+ x + ", "+ y +"만큼 이동하였습니다.");  } //추상클래스 구현
    void load()    {System.out.println("대상을 태웠습니다.");}
	void unload()  {System.out.println("대상을 내렸습니다.");
}

}
