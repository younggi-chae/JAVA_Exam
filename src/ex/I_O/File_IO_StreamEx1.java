package ex.I_O;

import java.io.*;

public class File_IO_StreamEx1 {
     //문자기반스트림  FileReader, FileWriter
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);

			int data = 0;  // 카피할 내용 저장
			while ((data = fis.read()) != -1) {
				fos.write(data);  // 카피
			}

			fis.close();  //ByteArray와 달리 close메서드 사용
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
