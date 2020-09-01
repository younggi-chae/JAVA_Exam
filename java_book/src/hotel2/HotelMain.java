package hotel2;

import java.util.LinkedList;
import java.util.Scanner;

public class HotelMain {

	public static void main(String[] args) {

		LinkedList<Customer> list = new LinkedList<Customer>();
		Manager m = new Manager();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===========호텔 예약 서비스==========");
			System.out.println("1.예약하기  2.예약정보  3.체크인  4.체크아웃  5.예약취소");
			String select = sc.nextLine();

			switch (select) {
			case "1":
				m.addCustomer(list);
				break;
			case "2":
				m.reInfo(list);
				break;
			case "3":
				m.checkIn(list);
				break;
			case "4":

				break;
			case "5":

				break;
			}
		}

	}

}
