package kosta.api;

import java.util.Calendar;

public class CalendarMission {

	public static void main(String[] args) {
		// 2020 7월 캘린더 만들기
		// 월 입력 : 7
		// <2020 7월>
		// 일 월 화 수 목 금 토  tab
		//      1 2 3 4
		//  5 6 7 8 9 10
		
Calendar gc = Calendar.getInstance();		
		
		gc.set(2020, 6, 1);
		int n = gc.getActualMaximum(Calendar.DATE);		
		int week = gc.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("<2020년 7월>");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i=1;i<week;i++) {
			System.out.print("\t");
		}
		
		for(int i=1;i<=n;i++) {
			System.out.print(i+"\t");
			if((week + i -1)%7 == 0) {
				System.out.println();
			}
		}
		
	}

}