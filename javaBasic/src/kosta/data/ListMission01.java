package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMission01 {

	public static void show(List<String> list) {
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+ ", ");
		}

//		for (int i = 0; i < list.size(); i++) {
//		  	String output = list.get(i);
//			System.out.print(output + ",");
//		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// List 자료구조를 활용하여 키보드에 입력한 데이터를 추가하고
		// 데이터를 입력하여 삭제하자. ==> 전체 출력

		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.추가  2.삭제 3.종료");
			System.out.println("선택 : ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				System.out.println("추가 : ");
				list.add(sc.nextLine());
				show(list);
				break;
			case "2":
				System.out.println("삭제 : ");
				String str = sc.nextLine();
				int idx = list.indexOf(str);
				if(idx != -1) {
				list.remove(idx);
				}
				show(list);
				break;
			case "3":
				System.out.println("프로그램 종료");
				return;
			}
		}

	}

}
