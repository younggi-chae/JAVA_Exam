package ex.object3;

class Car{
	String color;       //색상
	String gearType;    //변속기종류
	int door;           //문의 개수
	
	Car(){}   //생성자
	Car(String c, String g, int d){ //매개변수가 있는 생성자
		color = c;
		gearType = g;
		door = d;
	}
}

public class constructorEx2 {

	public static void main(String[] args) {
		Car c1 = new Car(); // 기본생성자
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4); // 매개변수가 있는 생성자
		
		System.out.println(c1.color+", "+c1.gearType+", "+c1.door);
		System.out.println(c2.color+", "+c2.gearType+", "+c2.door);
	}

}
