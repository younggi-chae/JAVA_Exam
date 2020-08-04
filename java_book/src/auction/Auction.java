package auction;

import java.util.LinkedList;
import java.util.Scanner;

public class Auction {
	
	static Scanner sc = new Scanner(System.in);
	 private int bid;
	   int count;
	   int idx;
	   int cnt;
	   int arr[]= new int[10];
	   static int max;
	   Goods item;
	   int price;
	   static String address;
	   int key;
	
	public Auction() {}
	
	public void purchase() {
		
		
		  System.out.println("구매하실 상품을 선택해 주세요.");
		  printGoods();
	      System.out.println("입력 : ");
	      idx = sc.nextInt();
	      
	      item = SellerManagement.goodsList.get(idx - 1);

	      System.out.println("입찰하실 금액을 입력하세요.");
	      System.out.println("입력 : ");
	      bid = sc.nextInt();
	      arr[cnt++]=bid;
	      //c.setBid(bid);
	      System.out.println(bid + "원이 입찰되었습니다.");
	    
	      
	      if(cnt==2) {
	    	  price=compare();
	    	  System.out.println("낙찰가는 "+price+"입니다.");
	    	  
	    	  if(bid<price) {
	    		  System.out.println("낙찰에 실패하셨습니다.");
	    		  return;
	    	  }
	    	  else {
	    		 System.out.println("낙찰 성공");
	    		 System.out.print("구매하시겠습니까? 1:예 2:아니오>>");
	   		  int input = sc.nextInt();
	   		  switch (input) {
	   		case 1:
	   			pay(); 
	   			break;

	   		case 2:
	   			break;
	   		}
	    		 
	    	  }
	      }
	
		
		
	}
	
	
	public void buy() {
		 System.out.print("구매하시겠습니까? 1:예 2:아니오");
		  int input = sc.nextInt();
		  switch (input) {
		case 1:
			pay(); 
			break;

		case 2:
			break;
		}
		
	}
	
	
	
	
	
	public void pay() {
		System.out.print("카드번호를 입력하세요: ");
		String cardNo=sc.nextLine();
		
		System.out.print("비밀번호를 입력하세요");
		String pwd=sc.nextLine();
		System.out.println("결제되었습니다.");
		
		System.out.print("주소를 입력하세요");
		address=sc.nextLine();
	}
	
	 public void printGoods() {	
	      for (int i = 0; i < SellerManagement.goodsList.size(); i++) {
	         System.out.println(i + 1 + "번째 상품 정보");     
	         System.out.println(SellerManagement.goodsList.get(i).toString());
	      }
	   }
	 
	
	public int compare() {
		for(int i=0;i<cnt;i++) {
			max=arr[0];
			if(arr[i]>max) {
				max=arr[i];
				key=i;
			}
		}
		return max;
	}
	
	public void listAllItem() {
		
		
	}

}
