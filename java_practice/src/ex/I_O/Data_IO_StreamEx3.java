package ex.I_O;
import java.io.*;

public class Data_IO_StreamEx3 {

	public static void main(String[] args) {
		int sum = 0;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("score.dat");
			dis = new DataInputStream(fis);
			
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
			
		}catch (EOFException e) {  // 더 이상 읽을 데이터가 없으면 EOFException 발생
			System.out.println("점수의 총합은  " + sum + "입니다.");
		}catch (IOException ie) {
			ie.printStackTrace();
		}finally {   // while문이 무한반복이기 때문에 finally를 통해 스트림을 닫도록 처리
			try {
				if(dis != null)
					dis.close();
			}catch(IOException ie) {
				ie.printStackTrace();
			}
		}

	}

}
