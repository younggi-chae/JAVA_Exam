package kosta.auction;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import kosta.phone2.PhoneInfo;
import kosta.sort.Person;

public class CustomerManagement extends Account implements Join {

	List<Customer> cust = new LinkedList<Customer>();
	Scanner sc = new Scanner(System.in);
	Customer c;
	Goods g;
	private int bid;

	@Override
	public void join() {
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
	}

	public void logIn() {

		System.out.println("아이디를 입력해주세요.");
		System.out.print("입력 :");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요.");
		System.out.println("입력 : ");
		String password = sc.nextLine();

		for (int i = 0; i < cust.size(); i++) {
			c = cust.get(i);
		}

		if (c.getId().equals(id) && c.getPassword().equals(password))
			System.out.println("로그인 성공");
		if (!c.getId().equals(id))
			System.out.println("해당 아이디가 존재하지 않습니다.");
		if (!c.getPassword().equals(password))
			System.out.println("비밀번호가 일치하지 않습니다.");
	}

	public void printGoods() {
		for (int i = 0; i < SellerManagement.goodsList.size(); i++) {
			System.out.println(i + 1 + "번째 상품 정보");
			SellerManagement.goodsList.get(i).show();
		}
	}

	public void purchase() {
		System.out.println("구매하실 상품을 선택해 주세요.");
		printGoods();
		System.out.println("입력 : ");
		int idx = Integer.parseInt(sc.nextLine());
		SellerManagement.goodsList.get(idx - 1);

		System.out.println("입찰하실 금액을 입력하세요.");
		System.out.println("입력 : ");
		bid = sc.nextInt();
		c.setBid(bid);
		System.out.println(bid + "원이 입찰되었습니다.");

		for (int i = 0; i < cust.size(); i++) {
			c = cust.get(i);
			System.out.println(c);
		}
	}
	
	public void result() {				
				
		Collections.sort(cust, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				//이름을 기준으로 오름차순 정렬
				if(o1.getBid() >o2.getBid()) {
					return 1;  //1 자리를 바꾼		
				} else if(o1.getBid() < o2.getBid()) {
					return -1;
				}
				return 0;
			}
		});
		int max = -1;
		for (int i = 0; i < cust.size(); i++) {
			Customer cc = cust.get(i);
			if (max < cc.getBid()) {
				max = cc.getBid();
				System.out.println("입찰이 완료되었습니다.");
			} else {
				System.out.println("입찰에 실패하였습니다.");
			}
		}	
			
		
		
		
			
		}
	}
