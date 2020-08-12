package ex.I_O;

import java.io.*;

public class Buffered_IO_StreamEx1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fo = new FileOutputStream("123.txt");
            
			//버퍼의 크기를 5로 한다.
			BufferedOutputStream bos = new BufferedOutputStream(fo, 5);

			for (int i = '1'; i <= '9'; i++) {
				bos.write(i); 
			}

			bos.close();   // 버퍼에 쓰이지 못한 소스가 남지않도록 flush()나 close()를 통해 모든 내용이 출력되도록 한다.
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
