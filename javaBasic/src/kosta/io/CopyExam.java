package kosta.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyExam {

	public static void main(String[] args) {
		//poem.txt => poem3.txt copy
		
		FileReader reader = null;
		FileWriter writer = null;
		char arr[] = new char[100];
		
		try {
			reader = new FileReader("poem.txt");			
			reader.read(arr);			
						
			writer = new FileWriter("poem3.txt");
			writer.write(arr);
			System.out.println("복사완료");
			
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {
			try {				
				writer.close();
				reader.close();
			} catch (Exception e) {				
				e.printStackTrace();
			}
		}
	}

}
