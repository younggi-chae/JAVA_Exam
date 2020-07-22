package kosta.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferExam {

	public static void main(String[] args) {
		//Scanner 외에 입출력 스트림 이용해서 데이터 입력을 구현
		//System.in => InputStream => InputStreamReader => BufferedReader
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		String str = "";
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt", true)); //true 덮어쓰기x, 새롭게 추가
										
			System.out.println("입력 : ");
			while((str = br.readLine())!= null){
				str += "\n";
				bw.write(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
