package kosta.bank;

public class Account {
	
	private String id;
	private long balance;
		
	public Account() {}
	public Account(String id, long balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public boolean deposit(long amt) {
		balance += amt;
		return true;
	}
	
	public boolean withdraw(long amt) {
		if(balance < amt) {			
			return false;
		}
		balance -= amt;
		return true;		 
	}

	public String getId() {
		return id;
	}	

	public long getBalance() {
		return balance;
	}	
	
}
