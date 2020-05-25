package ex.interface1;

interface I {
	public abstract void play();
}

class A {
	void autoPlay(I i) {
		i.play();
	}
}

class B implements I {
     public void play() {
    	 System.out.println("play in B class");
     }
}

class C implements I {
	public void play() {
		System.out.println("play in C class");
	}
}

public class interfaceEx5 {

	public static void main(String[] args) {
		A a = new A();           //인터페이스를 통해 간접적으로 관계를 맺음
		a.autoPlay(new B());     // void autoplay(I i) 호출
		a.autoPlay(new C());     // void autoplay(I i) 호출

	}

}
