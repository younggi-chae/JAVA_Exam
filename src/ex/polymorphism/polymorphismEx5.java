package ex.polymorphism;
import java.util.*;  //Vector클래스를 사용하기 위해 추가

class Product {
	int price;       //제품의 가격
	int bonusPoint;  //제품 구매 시 제공되는 포인트
	
	Product(int price) {
	   	 this.price = price;
	   	 bonusPoint = (int)(price/10.0);
	}
	Product () {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv extends Product {
	Tv() { super(100);  }
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200);  }
	public String toString() { return "Computer"; }
}

class Audio extends Product {
	Audio() { super(50);  }
	public String toString() { return "Audio"; }
}

class Buyer {
	int money = 1000;   //소유금액
	int bonusPoint = 0; //보너스점수
	Vector item = new Vector();  //구입할 제품을 저장하는데 사용될 Vector객체
	//Vector클래스는 내부적으로 Object타입의 배열을 가지고 있어, 배열에 객체를 추가하거나 제거할 수 있게 작성되어 있다.
	//그리고 배열의 크기를 알아서 관리해주기 때문에 저장할 인스턴스의 개수에 신경쓰지 않아도 됨.
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;            //가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;  //제품의 보너스점수를 더한다.
		item.add(p);                 //구입한 제품을 Vector에 저장한다.
		System.out.println(p+"을/를 구입하셨습니다.");
		
	}
	void refund(Product p) {    //구입한 제품 환불
		if(item.remove(p)) {    //제품을 Vector에서 제거
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"을/를 반품하셨습니다.");
		} else {            //제거에 실패할 경우   
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	void summary() {           //구매한 물품에 대한 정보 요약
		int sum = 0;           //구입한 물품의 총 가격 합계
		String itemList = "";  //구입한 물품 목록
		int bonus = 0;
		
		if(item.isEmpty()) {   //Vector가 비어있는 확인
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);  //Vector의 i번째에 있는 객체를 얻어온다.
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
			bonus += p.bonusPoint;
		}
		System.out.println("구입하신 물품의 총 금액은  "+ sum + "만원입니다.");
	    System.out.println("구입하신 제품은 " + itemList + "입니다.");
	    System.out.println("적립된 보너스포인트는 "+ bonus + "포인트입니다.");
	}
}

public class polymorphismEx5 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		Tv t = new Tv();
		Computer c = new Computer();
		Audio a = new Audio();
		
		b.buy(t);
		b.buy(c);
		b.buy(a);
		b.summary();
		System.out.println();
		b.refund(c);
		b.summary();

	}

}


