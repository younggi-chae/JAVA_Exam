package java_exam.java1.Method;

 class Greeting{
	//public, protected, default, private
	    public static void hi() {
	        System.out.println("Hi");
	
	 //private은 같은 클래스 안에서만 사용 가능   
	    }
 }

public class AccessModifiersMethod {
	
	
	public static void main(String[] args) {
		Greeting.hi();
	}
}
