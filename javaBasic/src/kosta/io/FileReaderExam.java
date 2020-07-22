package kosta.io;

import java.io.FileReader;

public class FileReaderExam {

	public static void main(String[] args) {
		//파일에 문자데이터를 일기 위해
		FileReader reader = null;
		char arr[] = new char[50];
		
		try {
			reader = new FileReader("poem.txt");
			
			reader.read(arr);
			System.out.print(arr);
			
//			while(true) {
//				int data = reader.read();
//				if(data == -1) break;
//				char c = (char)data;
//				System.out.print(c);
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e2) {}
		}
	}

}
