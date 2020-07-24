package templateCallbackPattern;

public class Client {

	public static void main(String[] args) {
		Soldier rambo = new Soldier();
		
		rambo.runContext("ÃÑ! ÃÑÃÑÃÑÃÑ!");
		
		System.out.println();
		
		rambo.runContext("Ä®! Ä«Ä«Ä«Ä®!");
		
		System.out.println();
		
		rambo.runContext("µµ³¢! µµµµµµµ¶³¢!");
		
	}

}
