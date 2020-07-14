package animal;

public class Animal {
	
	private String name;
	private String gender;
	private int age;
	 
	public Animal(){}
	
	public Animal(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void introduce() {
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
	}
	
	public void bawl() {
		
	}
	
	public void play() {
		System.out.println(name + "는 주인이랑 같이 노는 중...");
	}
	
	public void eat() {
		System.out.println(name + "는 밥을 먹는 중...");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
