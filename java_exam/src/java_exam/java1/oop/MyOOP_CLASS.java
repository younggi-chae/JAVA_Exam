package java_exam.java1.oop;

class Print{
public static String delimiter = "";  //인스턴스 변수
	public Print(String delimiter) { //생성자
		this.delimiter = delimiter;
	}    //인스턴스를 가르킴
	public static void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}

	public static void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	
}

}

public class MyOOP_CLASS {
   	
	public static void main(String[] args) {
		
		Print.delimiter = "----";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
       
		Print.delimiter = "****";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
	}

	
}

