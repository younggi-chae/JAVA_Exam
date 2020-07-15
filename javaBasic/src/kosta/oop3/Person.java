package kosta.oop3;

//추상클래스,인터페이스 연습
public class Person {
	
	private String name;
	private Role role;
	private Role2 role2;
	
	public Person() {}	
	
	public Person(String name, Role role, Role2 role2) {
		super();
		this.name = name;
		this.role = role;
		this.role2 = role2;
	}

	public void doIt() {
		role.doIt();
		role2.doIt();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}

	public Role2 getRole() {
		return role2;
	}

	public void setRole(Role2 role2) {
		this.role2 = role2;
	}
	
	
}
