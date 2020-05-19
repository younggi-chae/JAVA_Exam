package ex.object3;

class Document {
	static int count = 0;
	String name; // 문서 이름

	Document() {    //문서 생성 시 문서이름을 지정하지 않았을 때
		this("제목없음" + ++count);
	}

	Document(String name) { //매개변수가 있는 생성자
		this.name = name;  //인스턴스변수 = 지역변수
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}

public class initializationEx3 {

	public static void main(String[] args) {
          Document d1 = new Document();
          Document d2 = new Document("자바.txt");
          Document d3 = new Document();
          Document d4 = new Document();
	}

}
