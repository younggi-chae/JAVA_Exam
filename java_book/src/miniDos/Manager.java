package miniDos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Manager {
	public void ls(File file) {
		File list[] = file.listFiles();

		for (int i = 0; i < list.length; i++) {
			if (list[i].isFile()) {
				System.out.println(" [파일]" + list[i].getName());
			} else if (list[i].isDirectory()) {
				System.out.println("[폴더]" + list[i].getName());
				ls(list[i]);
			}
		}
	}

	public void afterDir(File file) {
		File list[] = file.listFiles();

		for (int i = 0; i < list.length; i++) {
			if (list[i].isDirectory()) {
				System.out.println(file.getPath().concat("\\" + file.getName()));
				
			}
		}

	}

	public void backDir() {

	}

	public void makeDir(File file) {		
			try {
				file.mkdir();
				System.out.println("폴더가 생성되었습니다.");
			} catch (Exception e) {
				e.printStackTrace();
			

		}

	}

	public void copy(File file, File dest) {
		FileReader reader = null;
		FileWriter writer = null;

		char arr[] = new char[1000];
		int count = 0;

		try {
			reader = new FileReader(file);
			writer = new FileWriter(dest);

			while ((count = reader.read(arr)) != -1) {
				writer.write(arr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (writer != null)
					writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
