package kosta.thread;

public class MultiThreadExam {	
	public static void main(String[] args) {
		Thread thread = new DigitThread();
		Thread thread2 = new Thread(new SmallLetters());
		
		thread.start();
		thread2.start();
		
		for(char ch ='A'; ch <= 'Z'; ch++ ) {
			System.out.println(ch);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}

class DigitThread extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class SmallLetters implements Runnable {

	@Override
	public void run() {
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
}