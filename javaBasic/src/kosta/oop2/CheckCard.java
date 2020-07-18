package kosta.oop2;

public class CheckCard extends Account{

	String CardNo;
	
	public CheckCard() {}

	public CheckCard(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		CardNo = cardNo;
	}
	
	public int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.CardNo) || (balance < amount)) {
			throw new Exception("지불이 불가능 합니다.");
			
		}
		return balance -= amount;
	}
}
