package kosta.oop3;

public class PersonMain {
	
	//추상클래스,인터페이스 연습
	public static void main(String[] args) {
		
		Worker w = new Worker();
		Driver d = new Driver();
		Worker2 w2 = new Worker2();
		Driver2 d2 = new Driver2();
		
		Person p = new Person("홍길동", d, w2);
		
		//익명 내부 클래스
		Role r  = new Role() {			
			@Override
			public void doIt() {
				System.out.println("열심히 공부");
				
			}
		};
		
		Role2 r2 = new Role2() {
			
			@Override
			public void doIt() {
				System.out.println("열심히 코딩");
				
			}
		};
		
		p.setRole(r2);
		p.doIt();
	}
                 
}
