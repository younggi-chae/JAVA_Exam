package ex.collection5;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");  // 아래 KEY값이 중복된다. key값 중복x
		map.put("asdf", "1234");  // 나중에 온 value값으로 저장됨.

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("id와 passward를 입력해주세요.");
			System.out.print("id : ");
			String id = sc.nextLine();

			System.out.println("passward : ");
			String passward = sc.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if (!map.get(id).equals(passward)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
		}

	}

}
