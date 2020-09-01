package ex.collection2;
import java.util.*;
 
public class StackEx2 {
      //스택  활용, 뒤로가기 앞으로가기
	  public static Stack back = new Stack();
      public static Stack forward = new Stack();
        
	public static void main(String[] args) {
		
		goURL("1.페이스북");
		goURL("2.네이버");
		goURL("3.다음");
		goURL("4.네이트");
		
		printStatus();
		
		goBack();
		System.out.println("==뒤로가기 버튼을 누른 후 ==");
		printStatus();
		
		goBack();
		System.out.println("==뒤로가기 버튼을 누른 후 ==");
		printStatus();
		
		goForward();
		System.out.println("==앞으로가기 버튼을 누른 후 ==");
		printStatus();
		
		goURL("github.com");
		System.out.println("==새로운 주소로 이동 후 ==");
		printStatus();
		
	}
   public static void printStatus() {
	   System.out.println("back : " + back);
	   System.out.println("forward : " + forward);
	   System.out.println("현재화면은 '" + back.peek() + "' 입니다.");
	   System.out.println();        //현재 back 맨 위의 값을 꺼내지않고 반환
   }
   public static void goURL(String url) {
	   back.push(url);      // back에 url을 저장한다.
	   if(!forward.empty()) // 만약 forward가 비어있지 않다면 forward를 비운다.
		   forward.clear();
   }
   public static void goForward() {
	   if(!forward.empty())            
		   back.push(forward.pop()); // foward 맨 위의 값을 꺼내서 back에 저장
   }
   public static void goBack() {
	   if(!back.empty())
		   forward.push(back.pop()); //back에 맨 위의 값을 꺼내서 forward에 저장
   }
}
