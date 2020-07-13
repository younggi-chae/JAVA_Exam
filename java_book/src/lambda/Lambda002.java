package lambda;

//기존 방식의 코드 블록 사용 - 익명 객체 생성
public class Lambda002 {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Hello Lambda!!");
			}
		};
			r.run();
	}

}
