package ex.object3;

class Init {
	static {
		System.out.println("static{ }");   //클래스 초기화 블럭
	}                                      //가장 먼저 수행되어 화면에 출력
	{
		System.out.println("{ }");  //인스턴스 초기화 블럭
	}                             
        //인스턴스 초기화 블럭이 먼저 수행되고 생성자가 수행된다.
	public Init() {
		System.out.println("생성자");
	}
}
    
public class initializationEx1 {

	public static void main(String[] args) {
		System.out.println("Init i = new Init();");
		Init i = new Init();

		System.out.println("Init i2 = new Init();");
		Init i2 = new Init();
	}

}

     //클래스 초기화 블럭은 처음 메모리에 로딩될 때 한번만 수행되지만, 인스턴스 초기화 블럭은 인스턴스가 생성될 때마다 수행된다.
