package ex.object3;

class Car2 {
	String color;       //색상
	String gearType;    //변속기종류
	int door;           //문의 개수
	
	Car2() {
		this("white","auto", 4); //Car2(String color, String gearType, int door) 호출
	}                            //생성자 간 호출은 생성자 이름대신 this를 사용
	
	Car2(String color){
		this(color,"auto", 4);
	}   
	Car2(String color, String gearType, int door){ //매개변수가 있는 생성자
		this.color = color; // this.color는 인스턴스변수, color는 생성자 매개변수로 정의된 지역변수
		this.gearType = gearType;
		this.door = door;
	}
}
   //this - 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다. 모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재
   //this(), this(매개변수) - 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용

public class constructorEx3 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
        Car2 c3 = new Car2("dark", "manual", 2);
		
		System.out.println("c1의 color = "+c1.color+", gearType = "+c1.gearType+", door = "+c1.door);
		System.out.println("c2의 color = "+c2.color+", gearType = "+c2.gearType+", door = "+c2.door);
		System.out.println("c3의 color = "+c3.color+", gearType = "+c3.gearType+", door = "+c3.door);
	}

}
