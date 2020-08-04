package auction;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SellerManagement extends Account implements Join {

   static Scanner sc = new Scanner(System.in);
   Auction a= new Auction();

   LinkedList<Seller> sellerList = new LinkedList<Seller>();
   static LinkedList<Goods> goodsList = new LinkedList<Goods>();

   Seller s;
   int idx;// 현재 로그인한 고객
   int count=0;
   
   Auction auction = new Auction();

   @Override
   public Seller join2() {
	  

      System.out.print("이름:");
      String name = sc.nextLine();
      System.out.print("전화번호:");
      String phoneNo = sc.nextLine();
      System.out.print("주소:");
      String address = sc.nextLine();
      System.out.print("id:");
      String id = sc.nextLine();
      System.out.print("비밀번호:");
      String pwd = sc.nextLine();
      

      sellerList.add(new Seller(name, phoneNo, id, pwd, address));
      System.out.println("회원가입이 완료되었습니다.");
	
      return sellerList.get(count++);

   }

   public Seller login() {
      String id = "";
      String pwd = "";

      while(true) {
    	  for (int i = 0; i<sellerList.size();i++) {
    		  System.out.print("id:");
              id = sc.nextLine();
              System.out.print("비밀번호:");
              pwd = sc.nextLine();
        	  if((id.equals(sellerList.get(i).getId())) && pwd.equals(sellerList.get(i).getPwd())){
        		  
                  idx = i;
                  return sellerList.get(idx);
      }// System.out.println(sellerList.get(idx).getName() + "님 반갑습니다.");
 	 
    	  }

      }

   }
    

   

   public SellerManagement() {
   }

   public LinkedList<Goods> addItem() {

      System.out.print("물품 이름: ");
      String item_name = sc.nextLine();

      System.out.print("물품의 하한가");
      int min = sc.nextInt();
      String str = sc.nextLine();
      System.out.print("물품의 상한가");
      int max = sc.nextInt();
      String str2 = sc.nextLine();

      goodsList.add(new Goods(item_name, min, max));

      System.out.println(" 물품이 등록되었습니다.");
      return goodsList;

   }

   public void printItem() {
      Iterator<Goods> iter = goodsList.iterator(); 
      
      while(iter.hasNext()) {
         iter.next().show();
      }

   }

   public void payCheck() {
      // 낙찰된 가격을 알려주는 메서드
	   
	   
	   
	   int max=auction.max;
	   String address=auction.address;
	   
	   

      // successful_price
      System.out.println(max+"원에 낙찰되었습니다.");
      System.out.println("구매자 주소: "+address);
      
     System.out.print("계좌번호를 입력하세요:");
      
      
      //System.out.println("구매자와 채팅을 하시겠습니까?");
      

   }
   
 

@Override
public void join(List<Customer> cust) {
	// TODO Auto-generated method stub
	
}

@Override
public Customer join() {
	// TODO Auto-generated method stub
	return null;
}
   

}