package kosta.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		//키보드로 부터 id와 pw 입력을 받아서 
		//id, pw 일치하면 => 로그인 성공
		//id 불일치 => 해당 아이디가 존재하지 않습니다.
		//pw 불일치 => 비밀번호가 일치하지 않습니다.
		
		String m_id ="kosta";
		String m_pass = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력해주세요.");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요.");
		String pass = sc.nextLine();	
				
		if(m_id.equals(id) && m_pass.equals(pass)) 
			System.out.println("로그인 성공");
		if(!m_id.equals(id))
			System.out.println("해당 아이디가 존재하지 않습니다.");		
		if(!m_pass.equals(pass))
			System.out.println("비밀번호가 일치하지 않습니다.");
		 
	}

}
