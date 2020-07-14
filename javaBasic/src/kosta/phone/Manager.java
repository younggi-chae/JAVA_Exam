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
		// 1.일반 2.동창(major, year) 3.직장(dept, position)

		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1.일반  2.동창  3.직장");
		String menu = sc.nextLine();

		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("전화번호 : ");
		String phoneNo = sc.nextLine();
		System.out.println("생년월일 : ");
		String birth = sc.nextLine();
		switch (menu) {
		case "1":
			arr[count++] = new PhoneInfo(name, phoneNo, birth);
			break;
		case "2":
			System.out.println("학과 : ");
			String major = sc.nextLine();
			System.out.println("학번 : ");
			String year = sc.nextLine();
			arr[count++] = new Universe(name, phoneNo, birth, major, year);
			break;
		case "3":
			System.out.println("부서 : ");
			String dept = sc.nextLine();
			System.out.println("직책 : ");
			String position = sc.nextLine();
			arr[count++] = new Company(name, phoneNo, birth, dept, position);
			break;
		}
	}

	public void listPhoneInfo() {
		// 배열에 있는 모든 PhoneInfo 객체를 출력
		// show()
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1.전체  2.동창  3.직장");
		String menu = sc.nextLine();

		switch (menu) {
		case "1":
			System.out.println("======전체======");
			for (int i = 0; i < count; i++) {
				arr[i].show();
			}
			break;
		case "2":
			System.out.println("======동창======");
			for (int i = 0; i < count; i++) {
				if (arr[i] instanceof Universe) {
					arr[i].show();
					Universe uni = (Universe) arr[i];
					uni.show2();
				}
			}
			break;
		case "3":
			System.out.println("======직장======");
			for (int i = 0; i < count; i++) {
				if (arr[i] instanceof Company) {
					arr[i].show();
				}
			}
			break;
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
