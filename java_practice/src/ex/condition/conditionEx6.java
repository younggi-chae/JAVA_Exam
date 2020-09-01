package ex.condition;
import java.util.*;
public class conditionEx6 {
        //중첩 switch문 연습
	public static void main(String[] args) {
		  
		char gender;
		String num = "";
        System.out.println("주민번호를 입력해주세요. \"000000-0000000\"");
        
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
        	num = sc.nextLine();  //입력받은 값을 num에 저장
        	gender = num.charAt(7); //입력받은 문자에 8번째 문자를 gender에 저장, index의 값은 0부터 시작
        	
        	switch(gender) {
        	   case '1': case '3':
        		   switch(gender) { //switch문 안에 switch문
        	            case '1':
        	            	System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
        	            	break;
        	            case '3':
        	            	System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
        	            	} break;
        	   case '2': case '4':
        		   switch(gender) {
        		        case '2':
        		        	System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
        		        	break;
        		        case '4':
        		        	System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
        		        	break;
        		            } break;
        		    default: //if문의 else의 역할
        		    	System.out.println("유효하지 않는 주민번호입니다. 다시 입력해주세요.");
        		    }
        		}
        	}
        }
	


