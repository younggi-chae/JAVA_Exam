package animal;

public class Cat extends Animal {
		
	CatToy catToy;
	CatFood catFood;
	
	public Cat() {}

	public Cat(String name, String gender, int age, String food) {
		super(name, gender, age);				
	}	
	
	
	@Override
	public void introduce() {		
		super.setName("kitty");
		super.setAge(5);
		super.setGender("¿©");
		super.introduce();
	}

	@Override
	public void bawl() {			
		System.out.println("¾ß¿Ë~~");
	}

	@Override
	public void play() {
		catToy = new CatToy();
		System.out.println(catToy.toy() + "À» °¡Áö°í ³îÀÚ");		
		super.play();
	}

	@Override
	public void eat() {		
		catFood = new CatFood();
		System.out.println(catFood.specialfood() + " ¸ÔÀÚ");
		super.eat();
	}

		
}
