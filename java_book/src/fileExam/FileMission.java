package fileExam;

import java.io.File;

public class FileMission {

	public static void main(String[] args) {
		String path = "C:\\Users\\82109\\Evernote";
		fileList(path);

	}

	public static void fileList(String path) {
		File file = new File(path);
		File list[] = file.listFiles();

		for (int i = 0; i < list.length; i++) {
			if (list[i].isFile()) {
				System.out.println("-" + list[i].getName());
			} else if (list[i].isDirectory()) {
				System.out.println("*" + list[i].getName());
				fileList(list[i].getPath());
			}
		}
	}

}
