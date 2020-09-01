package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyStack {
	public static void main(String[] args) {
		
	
	Map<String, String> map = new HashMap<>();
	
	map.put("abcd", "1234");
	map.put("aaaa", "1111");
	
	Scanner sc = new Scanner(System.in);
	
	while(true) {
	System.out.println("id와 password를 입력해주세요.");
	System.out.println("id : ");
	String id = sc.nextLine().trim();
	System.out.println("password : ");
	String password = sc.nextLine().trim();
	System.out.println();
	
	if(!map.containsKey(id)) {
		System.out.println("아이디가 존재하지 않습니다.");
		continue;
	} else {
		if(!(map.get(id)).equals(password)){
			System.out.println("비밀번호가 일치하지 않습니다.");
		} else {
			System.out.println("로그인 되었습니다.");
			break;
		}
	}
	
	}
	
	
	}
}
