package kosta.video;

public class Main {

	public static void main(String[] args) {
		
		Video v1 = new Video("1", "반도", "강동원");
		Video v2 = new Video("2", "나는 살아있다.", "유아인");
		
		GeneralMember gm = new GeneralMember("aaa", "홍길동", "서울");
		
		gm.setRentalVideo(v2);
		
		gm.printMember();
		
	}

}
