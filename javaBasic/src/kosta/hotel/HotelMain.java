package kosta.hotel;

import java.util.LinkedList;
import java.util.Scanner;

public class HotelMain {	
		public static void main(String[] args) {			
			LinkedList<Customer> list = new LinkedList<Customer>();
			Scanner sc = new Scanner(System.in);
			Manager m = new Manager();			

			while (true) {
				System.out.println("=======호텔 예약========");
				System.out.println("1.고객등록  2.예약정보 3.체크인  4.체크아웃  5.예약취소 ");
				System.out.println("선택 : ");
				String menu = sc.nextLine();

				switch (menu) {
				case "1":
					m.addCustomer(list);						
					break;
				case "2":
					m.printInfo(list);
					break;
				case "3":
					m.checkIn();
					break;
				case "4":
					m.checkOut(list);
					break;
				case "5":
					m.cancel(list);
					break;
				case "6":
					System.out.println("종료");
					return;					
				} // end switch
			} // end while
		} // end main()
	}