package kosta.product;

public class Cart {
		
	private Product[] pArr;	
	int total;
	int count;

	public Cart() {
		pArr = new Product[100];
	}

	public void addCart(Product p) {

		pArr = new Product[100];
	}
	
	public void orderList() {
		
		for(int i = 0; i < count; i++) {
			pArr[i].show();
			System.out.println();			
		}
		
		System.out.println("총 주문금액 : " + getTotal());
	}
	
	public int getTotal() {
		for(int i = 0; i < count; i++) {
			total += pArr[i].getPrice() * (1 - pArr[i].getDc());
		}
		return total;
	}

}
