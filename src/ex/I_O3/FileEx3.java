package ex.I_O3;
import java.io.*;
import java.util.*;

public class FileEx3 {

	static int totalFiles = 0;
	static int totalDirs = 0;
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java FileEx3 DIRECTOTY");
			System.exit(0);
		}
		
		File dir = new File(args[0]);
		
		if(!dir.exists() || !dir.isDirectory()) {  //dir이 존재하지 않거나 디렉토리에 포함되지 않는다면
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
			
		}
		
		printFileList(dir);
		
		System.out.println();
		System.out.println("총 " + totalFiles + "개의 파일");
		System.out.println("총 " + totalDirs + "개의 파일");

	}
	
	public static void printFileList(File dir) {
		System.out.println(dir.getAbsolutePath() + " 디렉토리"); //절대경로 출력
		File[] files = dir.listFiles();  //파일 리스트를 files 배열에 담는다.
		
		ArrayList subDir = new ArrayList(); //디덱토리 담기, 재귀호출
		
		for(int i = 0; i < files.length; i++) {
			String filename = files[i].getName();  //for문을 통해 파일의 이름을 하나씩 꺼냄
			
			if(files[i].isDirectory()) {  // 파일이 디렉토리에 포함된다면
				filename = "[" + filename + "]";
				subDir.add(i+"");  
			}
			System.out.println(filename);
		}
		
		int dirNum = subDir.size();
		int fileNum = files.length - dirNum;  // 중복파일 제거
		
		totalFiles += fileNum;
		totalDirs += dirNum;
		
		System.out.println(fileNum + "개의 파일, " + dirNum + "개의 디렉토리");
		System.out.println();
		
		for(int i = 0; i < subDir.size(); i++) {
			int index = Integer.parseInt((String)subDir.get(i));
			printFileList(files[index]);
		}
	}

}
