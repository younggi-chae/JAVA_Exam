package kosta.product;

import java.util.Scanner;

public class Main {

	public static void showProduct(Product[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+1 + "번째 상품");
			arr[i].show();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();

		Product arr[] = { new Phone("갤럭시S7", 500000, 0.1), new Phone("갤럭시S8", 900000, 0.15),
				new NoteBook("삼성노트북", 1200000, 0.20) };

		while (true) {
			System.out.println("1.제품구매 2.주문목록  3.종료");
			System.out.print("선택: ");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				showProduct(arr);
				System.out.print("입력: ");
				int idx = Integer.parseInt(sc.nextLine());
				cart.addCart(arr[idx - 1]);
				break;
			case "2":
				cart.orderList();
				break;
			case "3":
				return;
			}
		}

	}

}


/*
물품구매 프로그램 구현

Product (인터페이스)
 - getPrice() : int   => 상품가격(정가) 구하기
 - getDc() : double => 가격할인률 구하기
 - show() : void => 상품내역 출력하기

Phone
 - name, price, dc

NoteBook
 - name, price, dc

Cart
 - pArr : Product[]
 - total : int
 - count : int

 - addCart(Product p) : void => 상품 카트 추가
 - orderList() : void =>상품목록 출력 : 총 주문가격(할인된 가격) 포함

Main
  Product arr[] = {new Phone(name, price, dc), 
	              new NoteBook(name, price, dc)}

  1. 제품구매, 2.구매목록 3.종료
>입력 : 1
 등록된 제품(배열에 있는 제품) 출력(제품이 4개라고 가정하고)
> 입력 : 3(3번째 제품 선택)
   => Cart에 해당 제품 등록
*/