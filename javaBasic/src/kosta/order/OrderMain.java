package kosta.order;

import java.util.LinkedList;
import java.util.Scanner;

public class OrderMain {

	public static void addMenu(LinkedList<Order> list) {
		System.out.println("요리명 : ");
		String foodName = sc.nextLine();		
		System.out.println("가격 : ");
		int price = Integer.parseInt(sc.nextLine());		
		System.out.println("수량 : ");
		int amount = Integer.parseInt(sc.nextLine());	
		
		list.offer(new Order(new Food(foodName, price), amount));
	}
	
	public static void menuService(LinkedList<Order> list) {
		if(!list.isEmpty()) {
			Order order = list.poll();
			order.show();
			totalSales += order.getTotal();
		}
	}
	
	
	static Scanner sc = new Scanner(System.in);
	static int totalSales;

	public static void main(String[] args) {

		LinkedList<Order> list = new LinkedList<Order>();

		while (true) {
			System.out.println("1.주문요청  2.주문처리 3.매출액 총액  4.종료");
			System.out.print("선택: ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				addMenu(list);
				break;
			case "2":
				menuService(list);
				break;
			case "3":
				System.out.println("총매출액: " + totalSales);
				break;
			case "4":
				System.out.println("종료");
				return;
			}
		}
	}
}
