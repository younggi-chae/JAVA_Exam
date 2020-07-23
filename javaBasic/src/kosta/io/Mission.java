package kosta.io;

import java.io.File;

public class Mission {

	public static void main(String[] args) {
		// 1.바이트스트림을 이용하여 파일 복사를 구현
		String source = "C:\\Users\\kosta\\Desktop\\ddd";
		String dest = "C:\\Users\\kosta\\Desktop\\ddd2";
		
		try {			
			CopyUtil.copyDirectory(new File(source), new File(dest));
			System.out.println("복사완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
