package ex.loop;
import java.util.*;
public class loopEx7 {
     //simple 계산기 만들기
	public static void main(String[] args) {
		int num;
		int sum = 0;
		boolean condition = true; //while문 스위치 역할 수행
		
		System.out.println("합계를 구할 숫자를 입력해주세요.(끝내려면 0을 입력)");
		
		while(condition) {
			System.out.println(">>");
			
			Scanner sc = new Scanner(System.in);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num != 0) {
				sum += num; // num이 0이 아니면, sum = sum+num을 한다.
			} else {
				condition = false; // num이 0이면, 조건은 false
			}
			
		}
		System.out.println("합계 : "+ sum);
	}

}
