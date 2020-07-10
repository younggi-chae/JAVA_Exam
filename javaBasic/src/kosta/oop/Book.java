package kosta.oop;

public class Book {
	//과제 > 책값을 계산하는 프로그램을 만들어 보자.
		//교재 JAVA, JSP, Oracle 각각 가격이 30000, 25000, 15000 이다.
		//교재 DC는 30000원 이상 25% 할인  20000원 이상 20%할인, 15000원 이상 15% 할인
		//결과 > JAVA 교재는 정가는 30000원 할인된 가격은 22500원 입니다.
		
		//객체지향  책값 DC하는 메서드를 구현, 책값을 출력하는 메서드도 따로 구현
		//객체모델링을 위한 상태와 행동으로 추상화 작업을 수행한 후 클래스를 완성한다.
		
		String bookName;
		int price;
		int dcPrice;
		
		Book(){}
		
		Book(String bookName, int price){
			this.bookName = bookName;
			this.price = price;
		}
		
		Book(String bookName, int price, int dcPice){
			this.bookName = bookName;
			this.price = price;
			this.dcPrice = dcPice;
		}
		
		public void discount() {
			if(price >= 30000) {
				dcPrice = (int) (price -(price*0.25));
			} else if(price >= 25000) {
				dcPrice = (int) (price -(price*0.2));
			} else if(price >= 15000) {
				dcPrice = (int) (price -(price*0.15));
			}
		}
		
		public void print() {
			System.out.println("책 이름 : " + bookName);
			System.out.println("가격 : " + price);
			System.out.println("할인된 가격 : " + dcPrice);
		}
}
