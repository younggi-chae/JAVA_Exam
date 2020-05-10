package ex.condition;
import java.util.*;
public class conditionEx4 {
    //switch문 연습
	public static void main(String[] args) {
		 
		int month = 0;
		System.out.println("현재 몇월인지 입력해주세요.");
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String tmp = sc.nextLine();
			month = Integer.parseInt(tmp);
			System.out.println("이번달은 "+month+"월입니다.");
			switch(month) {
			
			case 3: case 4: case 5: //case문 조건식 결과는 정수 또는 문자열
				System.out.println("현재 계절은 봄입니다.");
				break; // break문을 만나면 switch문을 빠져나간다. break없을 시 아래 case문 값도 출력
			case 6: case 7: case 8:
				System.out.println("현재 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재 계절은 가을입니다.");
				break;
			case 12: case 1: case 2:
				System.out.println("현재 계절은 겨울입니다.");
			}
		}
    }
}

//if문으로 변경 시 코드

				//if(month == 3 || month ==4 || month == 5) {
				//	System.out.println("현재 계절은 봄입니다.");
				//}
				//else if(month == 6 || month == 7 || month == 8) {
				//	System.out.println("현재 계절은 봄입니다.");
				//}
				//else if(month == 9 || month ==10 || month == 11) {
				//	System.out.println("현재 계절은 봄입니다.");
				//}
				//else{
				//	System.out.println("현재 계절은 봄입니다.");
				//}