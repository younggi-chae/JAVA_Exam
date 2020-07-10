package kosta.phone;

import java.util.Scanner;

public class Manager {
	// 상태 : PhoneInfo[] arr
	// 행동 : 추가, 출력

	PhoneInfo arr[];

	Scanner sc = new Scanner(System.in);

	private int count = 0;

	public Manager() {
		arr = new PhoneInfo[10]; // 객체생성과 동시에 배열 초기화
	}

	public void addPhoneInfo() {
		// 이름, 전화번호, 생년월일 입력
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("전화번호 : ");
		String phoneNo = sc.nextLine();
		System.out.println("생년월일 : ");
		String birth = sc.nextLine();
		// PhoneInfo 객체 생성
		// 배열에 추가 => 인덱스 상수x , 변수o
		arr[count++] = new PhoneInfo(name, phoneNo, birth);
	}

	public void listPhoneInfo() {
		// 배열에 있는 모든 PhoneInfo 객체를 출력
		// show()
		for (int i = 0; i < count; i++) {
			arr[i].show();
		}
	}

	public void searchPhoneInfo() {
		// 이름의 전화번호 내역을 검색되도록 한다.
		System.out.println("이름 : ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = arr[i];
			if (name.equals(info.getName())) {
				info.show();
				idx = i;
			}
		}
		if (idx == -1) {
			System.out.println("찾을 수 없습니다.");
		}

	}
}
