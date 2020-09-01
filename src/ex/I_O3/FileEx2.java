package ex.I_O3;
import java.io.*;
public class FileEx2 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java FileEx2 DIRECTORY");
		}
		
		File f = new File(args[0]);
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않는 디렉토리입니다.");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
		}
	}

}
