package kosta.oop2;

public class AccountMain {

	public static void main(String[] args) {

		Account a = new Account("1", "홍길동", 10000);
		CheckCard c= new CheckCard("2", "김길동", 5000, "A");
		a.deposit(3000);
		
		try {
			c.withdraw(3000);
		} catch (Exception e) {
			System.out.println("잔액이 부족합니다.");
			e.printStackTrace();
		}
		c.print();
	}
}