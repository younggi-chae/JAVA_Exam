package kosta.io;

import java.io.File;


public class FileExam {

	public static void main(String[] args) {
		File file = new File(".");
		File arr[] = file.listFiles();
		for(int i = 0; i < arr.length; i++) {
			String name = arr[i].getName();
			if(arr[i].isFile())
				System.out.println(name + "," + arr[i].length() + ", " + arr[i].getPath());
			else
				System.out.println("<DIR> " + name);
			
		}

	}

}
