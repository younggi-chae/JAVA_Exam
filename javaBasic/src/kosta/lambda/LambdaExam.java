package kosta.lambda;

public class LambdaExam {
	public static void main(String[] args) {
		
		//익명 내부 클래스
		MyType my1 = new MyType() {
			
			@Override
			public void hello() {
				System.out.println("익명 내부 클래스 형식");
			}
		};
		
		my1.hello();
		
		//람다식(익명 메서드)
//		MyType my2 = ()-> {
//			System.out.println("람다식 형식");
//		};		
		MyType my2 = () -> System.out.println("람다식 형식");
		
		my2.hello();
		
		//기본형식(람다식)
		YourType you1 = (name) -> {
			System.out.println("내이름 : " + name);
		};
		you1.talk("홍길동");
		
		//단일 매개변수 -> 변수명만 사용 가능
		YourType you2 = name -> System.out.println("내이름 : "  + name);
		you2.talk("박길동");
	}
		
}
