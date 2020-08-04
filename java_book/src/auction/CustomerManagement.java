package auction;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerManagement extends Account implements Join {

	   List<Customer> cust = new LinkedList<Customer>();
	   
	   int arr[]= new int[10];
	   
	   Scanner sc = new Scanner(System.in);
	   Customer c;
	   Goods g;
	   private int bid;
	   int count;
	   int idx;
	   int cnt;

	   public void name() {
		for(int i=0;i<cust.size();i++) {
			c.setId(cust.get(i).getId());
		}
	}
	   
	   @Override
	   public Customer join() {
	      System.out.println("************회원가입*************");
	      System.out.println("아이디를 입력해주세요.");
	      System.out.print("입력 :");
	      String id = sc.nextLine();
	      System.out.println("비밀번호를 입력해주세요.");
	      System.out.println("입력 : ");
	      String password = sc.nextLine();
	      System.out.println("이름을 입력해주세요.");
	      System.out.print("입력 : ");
	      String name = sc.nextLine();
	      System.out.println("전화번호를 입력해주세요.");
	      System.out.println("입력 : ");
	      String phoneNo = sc.nextLine();
	      System.out.println("주소를 입력해주세요.");
	      System.out.println("입력 : ");
	      String address = sc.nextLine();

	      cust.add(new Customer(id, password, name, phoneNo, address, bid));
	      System.out.println(name + "님 회원가입이 완료되었습니다.");
	      
	      return cust.get(count++);
	   }

	   public Customer logIn() {


		   
		   
		   String id = "";
		      String pwd = "";

		      while(true) {
		    	  for (int i = 0; i<cust.size();i++) {
		    		  System.out.print("id:");
		              id = sc.nextLine();
		              System.out.print("비밀번호:");
		              pwd = sc.nextLine();
		        	  if((id.equals(cust.get(i).getId())) && pwd.equals(cust.get(i).getPassword())){
		        		  
		                  idx = i;
		                  return cust.get(idx);
		      }// System.out.println(sellerList.get(idx).getName() + "님 반갑습니다.");
		 	 
		    	  }
		    	
		    	 

		      }
		   
	      
	   }
	   
	   

	   
	   
	   
	   
	   


	@Override
	public void join(List<Customer> cust) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller join2() {
		// TODO Auto-generated method stub
		return null;
	}

	}