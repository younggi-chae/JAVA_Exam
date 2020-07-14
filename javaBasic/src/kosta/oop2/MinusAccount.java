package kosta.oop2;

public class MinusAccount extends Account {

	private int creadiLine;
	
	public MinusAccount() {}
	
	
	
	public MinusAccount(String accountNo, String ownerName, int balance, int creadiLine) {
		super(accountNo, ownerName, balance);
		this.creadiLine = creadiLine;
	}



	@Override
	public int withdraw(int amount) throws Exception {
		if(balance + creadiLine < amount) {
			throw new Exception("잔액 부족");
		}		
		balance -= amount;
		return amount;
	}
	
	
}
