package kosta.video;

public class Main {

	public static void main(String[] args) {
		
		Video[] vrr = {
				new Video("1", "반도", "강동원"),
				new Video("2", "나는 살아있다", "유아인")
		};
		
		GeneralMember arr[] = {
				new GeneralMember("a", "홍길동", "서울"),
				new SpecialMember("b", "박길동", "인천", 100)
		};
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].setRentalVideo(vrr[i]);
			arr[i].print();
			System.out.println();
		}
		
//		Video v1 = new Video("1", "반도", "강동원");
//		Video v2 = new Video("2", "나는 살아있다.", "유아인");
		
//		GeneralMember gm = new GeneralMember("a", "홍길동", "서울");
//		SpecialMember sm = new SpecialMember("b", "김길동", "인천", 100);
//		gm.setRentalVideo(v2);
//		sm.setRentalVideo(v1);
//		gm.print();
//		System.out.println();
//		sm.print();
	}

}
