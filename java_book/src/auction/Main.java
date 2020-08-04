package auction;

import java.util.LinkedList;
import java.util.Scanner;

import hotel.Customer;

public class Main {

	public static void main(String[] args) {
		SellerManagement sm = new SellerManagement();
		
		CustomerManagement cm = new CustomerManagement();
		LinkedList<Seller> loginInfo = new LinkedList<Seller>();
		LinkedList<Customer> loginInfo2 = new LinkedList<Customer>();
		Auction auction = new Auction();

		LinkedList login = new LinkedList();
		LinkedList<Goods> itemList = new LinkedList<Goods>();
	
		Scanner sc = new Scanner(System.in);
		Goods g = new Goods();
		
		int idx;
		int a=-1;
		int min=0;

		
		while (true) {
			System.out.println("1:회원가입   2:로그인");
			String input=sc.nextLine();
			switch (input) {
			case "1":
				System.out.println("1.판매자등록 2.구매자등록");
				String login1 = sc.next();
				switch (login1) {
				case "1":
					loginInfo.add(sm.join2());
					//System.out.println(loginInfo.toString());
					break;

				case "2":
					cm.join();
					break;
				}
				break;

			case "2"://로그인
				System.out.println("1.판매자 2.구매자");
                String input2 = sc.nextLine();
                switch (input2) {
                case "1"://판매자로그인
                  	login.add(sm.login());
       			//	System.out.println(login.toString());
       		while(a!=1) {
                    System.out.print("1.물품등록 2.물품확인 3.결제확인 4.로그아웃");
                    String input3 = sc.nextLine();
                    switch (input3) {
                    case "1"://물품등록
                    	
                    
                       itemList=sm.addItem();
                      // System.out.println(itemList.toString());
                       break;
                    case "2"://물품확인
                       sm.printItem();
                       break;
                       
                       
                    case "3"://결제확인
                    	
                    	
                       sm.payCheck();
                       
                
                       break;
                    case "4":
                    	//itemList.clear();
                      	System.out.println("로그아웃");
                      	login.clear();
                      	a=1;
                      	break;
                     
                    }
			}continue;
                case "2" ://구매자 로그인
                	login.add(cm.logIn());
                	//System.out.println(login.toString());
                  	a=0;
                	while(a!=2) {
              		
       					
	                        System.out.print("1.물품조회 2.결제 3.로그아웃");
	                        String input4 = sc.nextLine();
	                        switch (input4) {
	                        case "1"://물품조회
	                        	//cm.printGoods();
	                        	
	                        	System.out.println(itemList.toString());
	                           break;
	                        case "2"://결제
	                        
	                        	auction.purchase();
	  
	                        	
	                        	
	                        	
	                            break;
	                            
	                        case "3"://로그아웃
	                        	a=2;
	                        	login.clear();
	                        	break;
	                    
	                        }
                    
                	}continue;
                	
                }
			}
		}
	}
}
		

