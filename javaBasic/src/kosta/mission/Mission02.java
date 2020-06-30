package kosta.mission;

public class Mission02 {

	public static void main(String[] args) {
		//국어, 영어 , 수학 점수를 입력받아 
		//총점과 평균을 출력
		
		double kor = 80;
	    double eng = 90;
		double math = 95;
		
		double total = kor+eng+math;
	    double avg = total/3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);

	}

}
