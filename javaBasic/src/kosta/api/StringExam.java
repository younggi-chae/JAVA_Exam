package kosta.api;

public class StringExam {

	public static void main(String[] args) {
		String str = "ABC";  // 이미 존재하는게 없으면 만듦  
		String str2 = new String("abc"); //새롭게 만듦
		
		//String 불변성
		String str3 = str.concat(str2); //리턴값을 통해 조작
		System.out.println(str3);  //ABCabc
		
		
		String sql = "select * from board ";
		int num = 10;
		if(num == 10) {
			sql += "where num = 10";
			System.out.println(sql); //select * from board where num = 10
		}
		
		//StringBuffer, StringBulider 가변성
		StringBuffer sb = new StringBuffer("가나다");
		sb.append("라마바");
		System.out.println(sb); //가나다라마바
		
		//해당 문자열의 위치를 파악 => indexOf("문자열") => 0시작, 없으면 -1
		System.out.println(sql.indexOf("board")); //14
		
		//문자열의 길이
		System.out.println(sql.length());  //34
		
		//문자열 부분추출 substring(5) 6번째 이후 모두 출력, substring(5,11) 6번째부터 10번째까지
		//select * from board where num = 10
		System.out.println(sql.substring(32,34)); //board
		
		//sql변수 문자에 "board" 단어를 추출해 보자.(indexOf(), substring())		
		System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board")+5));
		
		String fileName = "kosta.jpg";
		String head = "";
		String pattern = "";
		head = fileName.substring(0,fileName.indexOf("."));
		pattern = fileName.substring(fileName.indexOf(".")+1, fileName.length());
		System.out.println(head + " : " + pattern); //kosta : jpg
		
		
		String id = "kosta";
		String m_id = "Kosta ";
		
		if(id.equalsIgnoreCase(m_id.trim())) {
			System.out.println("같다.");  //같다.
		} else {
			System.out.println("다르다.");
		}
		
		
		//문자열 => 배열 변환     split(".")은 문법적의미를 가지고 있다 => "\\." 을 사용한다.
		String fruits = "사과,배,포도,수박";
		String arr[] = fruits.split(",");
		
		for(String name : arr) {
			System.out.println(name);  
		}
		
		
		//startsWith(), endsWith() : 해당 문자열 시작/종료 하는 체크
		//이미지 파일 유무 체크(kosta.jpg)	
		if(fileName.endsWith("gif")|| fileName.endsWith("jpg") || fileName.endsWith("png")) {
			System.out.println("이미지 파일");
		} else {
			System.out.println("일반 파일");
		}
		
		//등대_small.jpg
		String path = "C:\\Users\\Public\\Pictures\\Sample Pictures\\등대.jpg";
		String result = ""; 		
		
		String fileName2 = path.substring(path.indexOf("등대"));
		System.out.println(fileName2);
		
		String head2 = fileName2.substring(0,fileName2.indexOf("."));
		String pattern2 = fileName2.substring(fileName2.indexOf(".")+1);
				
		result = head2 + "_samll." + pattern2;
		System.out.println(result);  //등대_samll.jpg
		
		StringBuffer sb2 = new StringBuffer(path);
		System.out.println(sb2);			
		sb2.insert(path.indexOf("."), "_small");
		System.out.println(sb2);
	}
}
