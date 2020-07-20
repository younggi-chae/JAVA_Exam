package kosta.oop2;

public class AccountMain {

	public boolean equals(Object a) {
		Account a1 = (Account) a;
		if(a1 == a)
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {

		Account a = new Account("111", "홍길동", 10000);
		Account a2 = new Account("111", "홍길동", 10000);
		CheckCard c= new CheckCard("2", "김길동", 5000, "A");
		
		if(a.equals(a2)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		
		
		
		a.deposit(3000);
		c.deposit(5000);
		
		try {
			c.withdraw(3000);
		} catch (Exception e) {
			System.out.println("잔액이 부족합니다.");
			e.printStackTrace();
		}
		c.print();
		
	}
}