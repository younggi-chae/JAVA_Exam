package ex.I_O2;
import java.io.*;

public class Buffered_ReaderWriter {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("Buffered_ReaderWriter.java");
			BufferedReader br = new BufferedReader(fr);  // 버퍼를 통해 입출력의 효율을 높인다.
			
			String line ="";
			for(int i = 1; (line = br.readLine()) !=null; i++) { // readLine을 통해 파일을 라인단위로 읽는다.
				if(line.indexOf(";") != -1)  // ; 자를 포함하고 있는지 확인
					System.out.println(i + " ; " + line);
			}
			
			br.close();
		}catch(IOException e) {}

	}

}
