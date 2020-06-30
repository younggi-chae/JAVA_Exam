package ex.object2;

class Data{ int x; }

public class object2Ex1 {

	public static void main(String[] args) {
		 Data d = new Data();
		 d.x = 10;  //참조형 매개변수
		 System.out.println("main() : x = "+ d.x);
		 
		 change(d.x); // 원본이 아닌 복사본이 변경, 기본형 매개변수(원본)에는 아무런 영향을 미치지 못함.
		 //change(d); << 참조형 매개변수로 값을 읽어오는 것뿐만 아니라 변경도 가능함.
		 System.out.println("After change(d.x)");
		 System.out.println("main() : x = "+d.x);
	}
		 static void change( int x) { // (data d)로 경경 
			//d.x = 1000;  << 참조형 매개변수
			 x = 1000;   //기본형 매개변수, 읽기만 가능하고 , 변경은 불가능함
			 System.out.println("change() : x = "+x);
		 
		 
	}

}
