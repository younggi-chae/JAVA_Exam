package ex.condition;
import java.util.*;
public class conditionEx5 {
       //switch문 연습, 가위바위보 게임
	public static void main(String[] args) {
		
		int user, com;
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하십시오.");
		
		Scanner sc = new Scanner(System.in);
            while(sc.hasNextLine()) {
        	String tmp = sc.nextLine();
        	user = Integer.parseInt(tmp);
        	//(int)(math.random *3)은 0,1,2를 출력, ex) 0.9*3 = 2.7 정수형 int로 형변환하면 최대 2출력
        	com = (int)(Math.random()*3) + 1;  //math.random은 실수를 반환하기에 int 정수형으로 형변환
        	
        	System.out.println("당신은 "+user+"입니다.");
        	System.out.println("컴퓨터는 "+com+"입니다.");
        	
        	switch(user-com) { // 유저와 컴퓨터의 차 값으로 조건생성
        	     
        	case 2: case -1: //user - com   ex) user = 바위(2), com = 보(3), 2-3 = -1
        		System.out.println("당신이 졌습니다.");
        		break;
        	case 1: case -2:
        		System.out.println("당신이 이겼습니다.");
        		break;
        	case 0:
        		System.out.println("비겼습니다.");
        	}
        }
	}

}
