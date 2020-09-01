package miniDos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

public class FileSystem {
	
	private File curFile = new File("C:\\");
	
	public FileSystem() {}

	public void fileList() {
		File list[] = curFile.listFiles();
		
		for(int i = 0; i < list.length; i++) {
			if(list[i].isDirectory()) {
				System.out.println("<DIR> " + list[i].getName());
			} else {
				System.out.println("  <FILE> " + list[i].getName());
			}
		}
	}
	
	public void moveDirectory(String dest) {
		File list[] = curFile.listFiles();
		File destFile = new File(curFile, dest);		
		for(int i = 0; i < list.length; i++) {
			if(list[i].getPath().equals(destFile.getPath())) {
				curFile = destFile;
				return;
			}
		}
		System.out.println("일치하는 파일이 없습니다.");
		
	}
	
	public void superDirectory() {
		String filePath = curFile.getPath();
		int fileNameLen = curFile.getName().length();
		String superPath = filePath.substring(0, filePath.length() - fileNameLen);
		curFile = new File(superPath);		
	}	
	
	public void makeDirectory(String newDirName) {		
		File newDir = new File(curFile, newDirName);
		File list[] = curFile.listFiles();
		
		for(int i = 0; i < list.length; i++) {
			if(list[i].getPath().equals(newDir.getPath())) {
				System.out.println("똑같은 이름의 파일이 존재합니다.");
				return;
			}
		}
		newDir.mkdir();
	}

	public void copy(String sourceStr) {
		if(sourceStr.lastIndexOf("\\") == -1) {
			return;
		}
		
		String destStr = sourceStr.substring(sourceStr.lastIndexOf("\\")+1);
		File sourceFile = new File(curFile, sourceStr);
		File dest = new File(curFile, destStr);
		
		copyAllFile(sourceFile, dest);
	}
	
	public void copyAllFile(File sourceFile, File dest) {
		if(sourceFile.isFile()) {
			File destFile = new File(dest, sourceFile.getName());
			copyFile(sourceFile, destFile);
			return;
		}
		
		File[] fileList = sourceFile.listFiles();
		dest.mkdir();
		
		for(int i = 0; i < fileList.length; i++) {
			if(fileList[i].isDirectory()) {
				File destDir = new File(dest, fileList[i].getName());
				copyAllFile(fileList[i], destDir);
			} else {
				File destFile = new File(dest, fileList[i].getName());
				copyFile(fileList[i], destFile);
			}
		}
	}
	
	public void copyFile(File sourceFile, File dest) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(dest);
			
			byte[] arrByte = new byte[5000];
			
			while((fis.read(arrByte)) != -1) {
				fos.write(arrByte);
			}			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("해당 파일이 존재하지 않습니다.");
		} finally {
			try {
				if(fis != null)
					fis.close();
				if(fos != null)
					fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public File getCurFile() {
		return curFile;
	}

	public void setCurFile(File curFile) {
		this.curFile = curFile;
	}

	
	
}
