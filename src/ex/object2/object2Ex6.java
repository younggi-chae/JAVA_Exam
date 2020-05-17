package ex.object2;

class MemberCall{
	int iv = 10; //인스턴스변수
	static int cv = 20; //클래스변수
	
	int iv2 = cv;
     //static int cv2 = iv     //에러발생. 클래스변수는 인스턴스 변수를 사용할 수 없음.
	static int cv2 = new MemberCall().iv; // 객체를 생성하면 사용가능
	
	static void staticMethod1() {
		System.out.println(cv);
	    //System.out.println(iv);      //에러발생. 클래스메서드에서 인스턴스변수 사용불가
	    MemberCall c = new MemberCall();
	    System.out.println(c.iv);  //객체 생성 후 사용가능
	}
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // 인스턴스메서드에서는 인스턴스변수를 바로 사용가능
	}
	static void staticMethod2() {
		staticMethod1();
		//intstanceMethod1(); //에러발생. 클래스메서드에서는 인스턴스메서드를 호출할 수 없음.
		MemberCall c= new MemberCall();
		c.instanceMethod1(); // 인스턴스 생성한 후 호출가능
	}
	void instanceMethod2() {  //인스턴스메서드는 인스턴스메서드, 클래스메서드 모두 인스턴스 생성없이 호출가능
		staticMethod1();
		instanceMethod1();
		
	}
}

public class object2Ex6 {

	public static void main(String[] args) {
		

	}

}
