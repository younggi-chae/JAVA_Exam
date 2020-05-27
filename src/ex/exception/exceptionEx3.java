package ex.exception;

import java.io.*;

public class exceptionEx3 {

	public static void main(String[] args) {
		try {  //File클래스에서 예외를 넘겨받아 처리
			File f = createFile(args[0]);
			System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
		}
	}

	static File createFile(String fileName) throws Exception {
           //throws키워드를 통해 Exception을 main메서드로 넘긴다. main메서드에서 Exception처리
		if (fileName == null || fileName.equals(""))
			throw new Exception("파일이름이 유효하지 않습니다.");
		File f = new File(fileName);  //파일클래스의 객체 생성
		f.createNewFile();  //File객체의 createFile메서드를 이용해서 실제 파일을 생성
		return f;   // 생성된 객체의 참조를 반환

	}

}
