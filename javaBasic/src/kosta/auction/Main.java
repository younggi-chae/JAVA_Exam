package kosta.auction;


import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SellerManagement sm = new SellerManagement();
		CustomerManagement cm = new CustomerManagement();
		LinkedList<Seller> loginInfo = new LinkedList<Seller>();
		LinkedList<Goods> itemList = new LinkedList<Goods>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1:회원가입   2:로그인");
			String input = sc.nextLine();
			switch (input) {
			case "1":
				cm.join();
				break;
			
			case "2":
				cm.logIn();
				System.out.println(loginInfo.toString());
				
				while (true) {// 로그인을 한 후
					System.out.println("1.판매자등록 2.구매자등록");
					String input2 = sc.nextLine();

					while(true) {
					switch (input2) {
					case "1":// 판매자등록
						
							System.out.print("1.물품등록 2.물품확인 3.결제확인 4.로그아웃");
							String input3 = sc.nextLine();

							switch (input3) {
							case "1":// 물품등록
								itemList = sm.addItem();
								System.out.println(itemList.toString());
								break;
							case "2":// 물품확인
								sm.printItem();
								break;
							case "3":// 결제확인
								cm.purchase();
								System.out.println(itemList);
								break;
							case "4":
								cm.result();
							}
						

					case "2":// 구매자등록
						System.out.println("1.물품조회 2.결제 ");
						String input4 = sc.nextLine();

						switch (input4) {
						case "1":// 물품조회
							cm.purchase();
							break;
						}
//	                        case "2"://결제
//	                           cm.purchase();
//	                           break;
//	                        
						//
//	            
//	            
//	            break;
//	         default:
//	            break;
//	         }
//	      }

						}
					}
				}
			}
		}

	}

}