package ex.operator;
import java.util.*;
public class operatorEx7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char c = ' ';
		
		System.out.println("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine();
		c = input.charAt(0);
		
		if('0' <= c && c <= '9') {
			System.out.println("입력하신 문자는 숫자입니다.");
			
		}
		else if('a' <= c && c <= 'z') {
		     System.out.println("입력하신 문자는 영문자입니다.");
		}
	}

}
