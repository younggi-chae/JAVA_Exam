package ex.polymorphism;
//참조변수의 형변환
class Car {
	String color;
	int door;
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!");
	}
}

class Ambulance extends Car {
	void siren() {
		System.out.println("siren~~");
	}
}

public class polymorphismEx1 {

	public static void main(String[] args) {
		Car car = null; //null값으로 초기화
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();  //fe가 참조하고 있는 인스턴스를 참조변수 car가 참조하도록 한다 (car = fe;)
		car = fe;   // car = (Car)fe; 에서 형변환이 생략, 업캐스팅 , fe와 달리 car는 Car타입이므로 Car클래스의 멤버가 아닌 water();를 사용x
		//car.water(); // 컴파일에러, Car타입의 참조변수로는 water()를 호출할 수 없음.
		fe2 = (FireEngine)car; //조상타입 > 자손타입(다운캐스팅), 명시적형변환 필수
		fe2.water(); // car와 달리 fe2는 FireEngine타입이므로 FireEngine인스턴스 모든 멤버들을 사용할 수 있음.
        
		Car c1 = new Car();
		Car c2 = null;
		FireEngine f1 = null;
		
		car.drive();
		f1 = (FireEngine)car; //다운캐스팅
		f1.drive();
		c2 = f1; //업캐스팅
		c2.drive(); 
	}
       
}
