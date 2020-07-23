package kosta.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyUtil {

	//새로운 디펙토리를 생성하고 그 안에 모든 파일을 복사
	public static void copyDirectory(File source, File dest) throws Exception {
		dest.mkdir();		
		File list[] = source.listFiles();
		
		for(int i = 0; i < list.length; i++) {
			File sourceFile = list[i];
			if(sourceFile.isDirectory()) {
				File s_destFile = new File(dest, sourceFile.getName());
				copyDirectory(sourceFile, s_destFile);
			} else if(sourceFile.isFile()){
				File destFile = new File(dest, sourceFile.getName());
				copyFile(sourceFile, destFile);		
				
			}
		}
	}	
	
	//바이트값을 가진 파일을 복사
	public static void copyFile(File source, File dest) throws Exception {
		
		FileReader reader = null;
		FileWriter writer = null;
		char arr[] = new char[1000];
		int count = 0;
		
		reader = new FileReader(source);
		writer = new FileWriter(dest);
		
		while((count = reader.read(arr)) != -1) {
			writer.write(arr);
		}
		
		if(reader != null) 
			reader.close();
		if(writer != null)		
			writer.close();
		
	}
}
