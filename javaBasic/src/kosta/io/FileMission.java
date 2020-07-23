package kosta.io;

import java.io.File;

public class FileMission {

	public static void main(String[] args) {
		String path = "C:\\Users\\kosta\\java_work\\javaBasic\\src\\kosta";
		File file = new File(path);
		
		if(file.exists() && file.isDirectory()) {
			fileList(file);
		}
	}

	public static void fileList(File file) {
		
		File list[] = file.listFiles();

		for (int i = 0; i < list.length; i++) {
			if (list[i].isFile()) {
				System.out.println("-" + list[i].getName());
			} else if (list[i].isDirectory()) {
				System.out.println("*" + list[i].getName());
				fileList(list[i]);
			}
		}
	}

}