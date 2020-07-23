package kosta.thread;

public class SumMain {

	public static void main(String[] args) {
		SumThread t1 = new SumThread(1, 50);
		SumThread t2 = new SumThread(51, 100);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("1~100까지 합 : " + (t1.getSum()+t2.getSum()));

	}

}
