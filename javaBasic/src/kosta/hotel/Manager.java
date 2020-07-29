package kosta.hotel;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager {

	Room arr[] = { new Room("스탠다드", 300000, 4), new Room("더블 ", 500000, 5),
	               new Room("스위트", 600000, 8) };
	Scanner sc = new Scanner(System.in);
	private Room roomInfo;
	private int reservationNo;	
	private int roomNo;
	
	public void addCustomer(LinkedList<Customer> list) {
		System.out.println("=====고객정보 등록=====");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("전화번호 : ");
		String tel = sc.nextLine();
		System.out.println("생년월일 : ");
		String birth = sc.nextLine();		
		
		System.out.println("원하시는 방의 번호를 선택해주세요.");		
		System.out.println("1.스탠다드  2.더블  3.스위트");
		printRoom(arr);
		System.out.println("입력 : ");
		int idx = Integer.parseInt(sc.nextLine());
		roomInfo = arr[idx - 1];
		
		switch (idx) {
		case 1:
			roomNo = (int) (Math.random() * (110 - 100 + 1) + 100);
			break;
		case 2:
			roomNo = (int) (Math.random() * (210 - 200 + 1) + 200);
			break;
		case 3:
			roomNo = (int) (Math.random() * (310 - 300 + 1) + 300);
			break;
		}
		
		reservationNo = (int) (Math.random() * 1000) + 1;
		list.offer(new Customer(name, tel, birth, reservationNo, roomInfo));
		System.out.println("예약이 완료되었습니다. 예약번호는 " + reservationNo + "입니다.");
		System.out.println();
	}
	
	public void printRoom(Room[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "번째 방 정보");
			arr[i].show();
			System.out.println();
		}
	}

	public void printInfo(LinkedList<Customer> list) {
		Iterator<Customer> iter = list.iterator();
		while(iter.hasNext()) {
			iter.next().show();
		}		
		
	}

	public void checkIn() {
		System.out.println("예약 번호를 입력해 주세요.");
		System.out.println("입력 : ");
		int reNo = sc.nextInt();
		if(reservationNo == reNo) {
			roomInfo.setRoomNo(roomNo);
			System.out.println(roomInfo.getRoomNo() + "호실로 방이 배정되었습니다");
		}
		
	}

	public void checkOut(LinkedList<Customer> list) {
		System.out.println("방번호를 입력해 주세요.");
		System.out.println("입력 : ");
		int roomNum = sc.nextInt();
		sc.nextLine();
		if(roomNum == roomInfo.getRoomNo()) {
			System.out.println(roomInfo.getRoomNo() + "호실 체크아웃 되었습니다.");
			System.out.println("***** 계산서 발생 *****");
			for(int i = 0; i < list.size(); i++) {
				list.poll();
				System.out.println("결제할 금액은 " + roomInfo.getPrice() + "원입니다.");
				System.out.println("결제 수단을 선택해 주세요.");
				System.out.println("1.현금   2.카드   3.수표");
				int idx = Integer.parseInt(sc.nextLine());
				
				switch(idx) {				
				case 1:
					System.out.println("현금 결제 시 20% 할인율 적용");
					int cash = (int) (roomInfo.getPrice() * 0.8);
					System.out.println("총 " + cash + "원이 결제되었습니다.");
					break;
				case 2:
					System.out.println("카드 결제 시 10% 할인율 적용");
					int card = (int) (roomInfo.getPrice() * 0.9);
					System.out.println("총 " + card + "원이 결제되었습니다.");
					break;
				case 3:
					System.out.println("수표 결제 : 신분증을 제시해 주세요.");
					System.out.println("총 " + roomInfo.getPrice() + "원이 결제되었습니다.");
					break;
				}
			}
		}
		
	}

	public void cancel(LinkedList<Customer> list) {
		System.out.println("예약번호를 입력해 주세요.");
		System.out.println("입력 : ");
		int reNo = sc.nextInt();		
		if(reservationNo == reNo) {
			list.poll();
			System.out.println("예약번호 " + reservationNo + " 취소 완료" );
		}
	}
	
	
}