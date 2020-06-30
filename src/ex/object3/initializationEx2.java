package ex.object3;

class Product{
	static int count = 0; //클래스 변수 , 생성된 인스턴스의 수를 저장하기 위한 변수, 만약 인스턴스 변수로 선언했다면 인스턴스가 생성될 때마다 0으로 초기화
	int serialNo; // 인스턴스 고유번호
	
	{  //인스턴스 초기화 블럭
		++count;  // Product인스턴스가 생성될 때마다 count의 값을 1씩 증가시켜서 serialNo에 저장한다.
		serialNo = count;
	}
	
	public Product() {}  //기본생성자, 생략가능, 생성자를 사용해도 결과는 같지만 모든 생성자에서 공통으로 수행되어야하는 내용이기에 인스턴스 블럭 사용
}

public class initializationEx2 {

	public static void main(String[] args) {
		 Product p1 = new Product();
		 Product p2 = new Product();
		 Product p3 = new Product();
		 
		 System.out.println("p1의 제품번호(serial no)는 "+p1.serialNo);
		 System.out.println("p2의 제품번호(serial no)는 "+p2.serialNo);
		 System.out.println("p3의 제품번호(serial no)는 "+p3.serialNo);
		 System.out.println("생산된 제품의 수는 모두 "+Product.count+"개 입니다.");
	}

}
