package hotel2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager {

	
	private Customer cust;	
	private Room room;
	private int reNo = 100;
	private int roomNo;
	
	Room[] roomInfo =  { new Room("스탠다드",300000,2),
		             new Room("더블",400000,4),
		             new Room("스위트",500000,5)};
	Scanner sc = new Scanner(System.in);	
	
	public Manager() {}
	
	public void addCustomer(LinkedList<Customer> list) {
		System.out.println("========예약정보 등록========");
		System.out.print("성함 : ");
		String name = sc.nextLine();
		System.out.print("연락처 : ");
		String tel = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();
		
		System.out.println("=======방 선택=======");	
		showRoom(roomInfo);
		int idx = Integer.parseInt(sc.nextLine());
		room = roomInfo[idx-1];
		
		
		reNo++;
		list.add(new Customer(name, tel, birth, reNo, room));
		System.out.println("예약이 완료되었습니다. 고객님의 예약번호는 " + reNo + "입니다.");
	}
	
	public void showRoom(Room[] roomInfo) {
		for(int i = 0; i < roomInfo.length; i++) {
			System.out.println(i+1 + "번째 객실 정보");
			roomInfo[i].show();		
			System.out.println();
		}
	}
	
	public void reInfo(LinkedList<Customer> list) {
		System.out.println("======예약정보 확인========");
		Iterator<Customer> iter = list.iterator();
		while(iter.hasNext()) {
			iter.next().show();
		}
	}
	
	public void checkIn(LinkedList<Customer> list) {
		System.out.println("======체크인 서비스======");
		System.out.println("예약 번호를 입력해 주세요.");
		System.out.println("입력 : ");
		int reserveNo = sc.nextInt();
		sc.nextLine();
		if(reserveNo == reNo) {
			room.setRoomNo(roomNo);
			System.out.println(room.getRoomNo() + "호실로 객실이 배정되었습니다.");
		}
	}
	
	
}
