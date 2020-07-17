import java.util.Calendar;
import java.util.Scanner;

public class CalendarMission {

	public static void main(String[] args) {
		// 2020 7월 캘린더 만들기
		// 월 입력 : 7
		// <2020 7월>
		// 일 월 화 수 목 금 토 tab
		// 1 2 3 4
		// 5 6 7 8 9 10

		int start = 0;
		int end = 0;

		Scanner sc = new Scanner(System.in);
		Calendar gc = Calendar.getInstance();

		gc.set(Calendar.DATE, 1); // 7월 1일
		start = gc.get(Calendar.DAY_OF_WEEK); // 수요일 (4) 가져오기
		end = gc.getActualMaximum(Calendar.DATE); //마지막 일 값 (31) 가져오기

		System.out.println("보고싶은 달을 입력해주세요 (7월 : 7)");
		System.out.println("입력 : ");
		String now = gc.get(Calendar.YEAR) + "년 " + (gc.get(Calendar.MONTH) + 1) + "월 ";
	
		int input = sc.nextInt();

		if (input == (gc.get(Calendar.MONTH) + 1)) {
			System.out.println("                  <" + now + ">");
			char[] week = { '일', '월', '화', '수', '목', '금', '토' };
			for (int i = 0; i < week.length; i++) {
				char a = week[i];
				System.out.print(a + "\t");
			}
			
			System.out.println();
			
			for (int i = 1; i < start; i++) {
				System.out.print("\t"); // start(4)까지 탭 실행
			}

			for (int i = 1; i <= end; i++) { //end(31)까지 출력
				System.out.print(i + "\t"); 
				if (start % 7 == 0) { // 7의 배수마다 개행
					System.out.println();

				}
				start++; // 7 , 14 , 21 마다 개행하도록 카운트
			}
		}
	}
}
