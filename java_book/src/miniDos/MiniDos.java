package miniDos;

import java.io.File;
import java.util.Scanner;

public class MiniDos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		String path = "C:\\Users\\82109\\Desktop\\ddd";
		String dest = "C:\\Users\\82109\\Desktop\\ddd\\home\\test";
		File file = new File(path);
		File file2 = new File(dest);
		
		while(true) {
			System.out.println("======MiniDos 명령어======");
			System.out.println("ls : 파일목록 출력");
			System.out.println("cd : 디렉토리 이동");
			System.out.println("cd .. : 부모디렉토리 이동");
			System.out.println("mkdir : 디렉토리 생성");
			System.out.println("cp : 현재 디렉토리에서 모든 파일 복사");
			System.out.println();
			System.out.println("입력 : ");
			String menu = sc.nextLine();
			switch(menu) {
			case "ls":
				m.ls(file);
				break;
			case ("cd " ):
				m.afterDir(file);
				break;
			case "cd ..":
				m.backDir();
				break;
			case "mkdir":
				m.makeDir(file);
				break;
			case "cp":
				m.copy(file, file2);
				break;
			}
		}
	}
}
