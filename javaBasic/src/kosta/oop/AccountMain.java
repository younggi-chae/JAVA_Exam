package kosta.oop;


public class AccountMain {

	public static void main(String[] args) {

//		Account account = new Account("2222-2222", "김길동", 5000); // 객체생성, 인스턴스화, 인스턴스 변수(account)에 주소값을 넣는다.
//		account.accountNo = "1111-1111";
//		account.ownerName = "홍길동";
//		account.balance = 10000;

//		account.deposit(3000);
//		account.withdraw(5000);
//		account.print();
	
		
		Account arr[] =  {
			new Account("111-111", "홍길동", 10000),
			new Account("222-222", "박길동", 50000)
		};
		
		for(int i = 0; i < arr.length; i++) {
			try {
				arr[i].withdraw(20000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			arr[i].print();
		}
	}
}
