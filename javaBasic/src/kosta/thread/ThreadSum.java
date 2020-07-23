package kosta.thread;

public class ThreadSum {

	static int sum = 0;
	
	public static void main(String[] args) {
		
		Thread t1 = new ThreadSum1();
		Thread t2 = new Thread(new ThreadSum2());
		
		t1.start();
		t2.start();

		try {
			t1.join();
			//t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class ThreadSum1 extends Thread {
	
	public void run() {
		
		for(int i = 1; i <=50; i++) {
			System.out.println(ThreadSum.sum += i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}	
}

class ThreadSum2 implements Runnable {

	@Override
	public void run() {		
		for(int i = 51; i <=100; i++) {
			System.out.println(ThreadSum.sum += i);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
