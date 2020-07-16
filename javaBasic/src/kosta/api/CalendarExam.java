package kosta.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {

		Calendar gc = Calendar.getInstance();
		String now = gc.get(Calendar.YEAR) + "년 " + gc.get(Calendar.MONTH) + "월 " + gc.get(Calendar.DATE) + "일 "
				+ gc.get(Calendar.HOUR) + "시 " + gc.get(Calendar.MINUTE) + "분 ";
		System.out.println("현재시간 : " + now);

		// 100일 후
		gc.add(Calendar.DATE, 100);
		String future = gc.get(Calendar.YEAR) + "년 " + gc.get(Calendar.MONTH) + "월 " + gc.get(Calendar.DATE) + "일 "
				+ gc.get(Calendar.HOUR) + "시 " + gc.get(Calendar.MINUTE) + "분 ";
		System.out.println("현재시간 : " + future);

		
		gc.set(2020, 5, 30); // 6월 30일
		gc.add(Calendar.DATE, 100); //100일 후
		
		SimpleDateFormat dateFormat = 
				new SimpleDateFormat("yyyy-MM-dd hh:mm");
		String str = dateFormat.format(gc.getTime());
		System.out.println(str);
		
		char[] week = {'일', '월', '화', '수', '목', '금', '토'};
		
		for(int i = 2020; i <= 2030; i++) {
			gc.set(i, 8, 30);
			char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
			System.out.println(i+ "년의 생일은 " + c + "요일 입니다.");
		}
	}

}
