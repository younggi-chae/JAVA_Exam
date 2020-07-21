package kosta.phone2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import kosta.sort.Person;

public class Manager {
	// 상태 : PhoneInfo[] arr
	// 행동 : 추가, 출력

	ArrayList<PhoneInfo> list = new ArrayList<PhoneInfo>();
	Scanner sc = new Scanner(System.in);

	public Manager() {
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
			list.add(new PhoneInfo(name, phoneNo, birth));
			break;
		case "2":
			System.out.println("학과 : ");
			String major = sc.nextLine();
			System.out.println("학번 : ");
			String year = sc.nextLine();
			list.add(new Universe(name, phoneNo, birth, major, year));
			break;
		case "3":
			System.out.println("부서 : ");
			String dept = sc.nextLine();
			System.out.println("직책 : ");
			String position = sc.nextLine();
			list.add(new Company(name, phoneNo, birth, dept, position));
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
			Iterator<PhoneInfo> iter = list.iterator();
			while (iter.hasNext()) {
				iter.next().show();
			}
			break;
		case "2":
			System.out.println("======동창======");
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) instanceof Universe) {
					list.get(i).show();
				}
			}
			break;
		case "3":
			System.out.println("======직장======");
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) instanceof Company) {
					list.get(i).show();
				}
			}
			break;
		}
	}

	public void searchPhoneInfo() {
		// 이름의 전화번호 내역을 검색되도록 한다.
		System.out.println("검색할 이름을 입력해주세요. : ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < list.size(); i++) {
			PhoneInfo info = list.get(i);
			if (name.equals(info.getName())) {
				info.show();
				idx = i;
			}
		}
		if (idx == -1) {
			System.out.println("찾을 수 없습니다.");
		}
	}

	public void updatePhoneInfo() {
		System.out.print("검색할 이름을 입력해주세요. : ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < list.size(); i++) {
			PhoneInfo info = list.get(i);
			if (name.equals(info.getName())) {
				System.out.print("수정 전화번호 입력 : ");
				String phoneNo = sc.nextLine();
				info.setPhoneNo(phoneNo);
				idx = i;
				break;
			}
		}
		if (idx == -1) {
			System.out.println("찾을 수 없습니다.");
		}
	}

	public void deletePhoneInfo() {
		System.out.print("검색할 이름을 입력해주세요. : ");
		String name = sc.nextLine();

		for (int i = 0; i < list.size(); i++) {
			PhoneInfo info = list.get(i);
			if (name.equals(info.getName())) {
				list.remove(i);
			}
		}
	}

	public void sortPhoneInfo() {

		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1.오름차순  2.내림차순 ");
		String menu = sc.nextLine();

		switch (menu) {
		case "1":
			Collections.sort(list, new Comparator<PhoneInfo>() {
				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					if (o1.getName().compareTo(o2.getName()) > 0) {
						return 1;
					} else if (o1.getName().compareTo(o2.getName()) < 0) {
						return -1;
					}
					return 0;
				}
			});
			Iterator<PhoneInfo> iter = list.iterator();
			while (iter.hasNext()) {
				iter.next().show();
			}
			break;
		case "2":
			Collections.sort(list, new Comparator<PhoneInfo>() {
				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					if (o1.getName().compareTo(o2.getName()) > 0) {
						return -1;
					} else if (o1.getName().compareTo(o2.getName()) < 0) {
						return 1;
					}
					return 0;
				}
			});
			Iterator<PhoneInfo> iter2 = list.iterator();
			while (iter2.hasNext()) {
				iter2.next().show();
			}
			break;
		}

	}
} // end class
