package miniDos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		FileSystem fileSystem = new FileSystem();
		Scanner sc = new Scanner(System.in);
		
		String moveDir = "^cd\\p{Space}.+$";
		String moveSuper = "^cd\\p{Space}?\\.\\.$";
		String mkdirReg = "^mkdir\\p{Space}.+$";
		String cpReg = "^cp\\p{Space}.+$";
		
		while(true) {
			System.out.println(fileSystem.getCurFile().getPath());
			System.out.print("ют╥б : ");
			String command = sc.nextLine().trim();
			
			if(command.equals("ls")) {
				fileSystem.fileList();
			} else if(command.matches(moveDir)) {
				String modifyCmd = moveDir.substring(3);
				fileSystem.moveDirectory(modifyCmd);
			} else if(command.matches(moveSuper)) {
				fileSystem.superDirectory();
			} else if(command.matches(mkdirReg)) {
				String modifyCmd = mkdirReg.substring(6);
				fileSystem.makeDirectory(modifyCmd);
			}
		}
	}
}
