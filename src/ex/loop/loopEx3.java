package ex.loop;
import java.util.*;
public class loopEx3 {
     //별찍기 삼각형
	public static void main(String[] args) {
	    int num = 0;
	    System.out.println("\"*\"을 출력한 라인의 수를 입력해주십시오.");
	    
	    Scanner sc = new Scanner(System.in);
	    while(sc.hasNextLine()) {	
	    String tmp = sc.nextLine();
	    num = Integer.parseInt(tmp);
	    
		for(int i = 1; i <= num ; i++) { //숫자대신 num이라는 변수를 넣고 사용자의 입력값에 따라 라인을 변경
			for(int j = 1; j <= i; j++) { //숫자대신 i라는 변수를 넣고 i가 1~5까지 증가하는 for문을 안에 넣는다.
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
	    }
	}
}
	