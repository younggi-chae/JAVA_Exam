package kosta.oop;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();
		m.setName("홍길동");
		m.setAge(30);
		
		System.out.println(m.getName());
		System.out.println(m.getAge());
	}

}
