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
		gc.set(2020, 6, 1); //7월 1일 이동
		int n = gc.getActualMaximum(Calendar.DATE);
		System.out.println(n);
	}

}
