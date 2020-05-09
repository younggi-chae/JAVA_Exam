package ex.loop;
import java.util.*;
public class loopEx8 {
      // do while문 연습
	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100)+1; // 1~100까지의 임의의 수를 저장
		Scanner sc = new Scanner(System.in);
		
		do { // 최소한 한번은 수행할 것을 보장, 조건식의 연산결과가 참일 떄 수행될 문장들을 적는다.
			System.out.println("1과 100사이의 숫자를 입력해주세요.");
			
			String tmp = sc.nextLine();
			input = Integer.parseInt(tmp);
			
			if(input > answer) {
				System.out.println("더 작은 수를 입력해주세요.");
			} 
			else if(input < answer){
		        System.out.println("더 큰 수를 입력해 주세요.");
			}
		}
			while(input != answer);  //조건이 true가 될 떄까지 계쏙 반복실행
				System.out.println("정답입니다!"); 
			
		
	}
}
	
	


