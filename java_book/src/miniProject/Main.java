package miniProject;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		SellerManagement sm = new SellerManagement();

		CustomerManagement cm = new CustomerManagement();

		LinkedList<Seller> loginInfo = new LinkedList<Seller>();

		LinkedList<Goods> itemList = new LinkedList<Goods>();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1:회원가입  2:로그인  3:프로그램 종료");

			String input = sc.nextLine();

			switch (input) {

			case "1":

				System.out.println("1:판매자 회원가입  2.구매자 회원가입");

				String input2 = sc.nextLine();

				switch (input2) {

				case "1":

					sm.join();

					break;

				case "2":

					cm.join();

					break;

				}

				break;

			case "2":

				System.out.println("1:판매자 물건관리  2:구매자 입찰하기");

				String input3 = sc.nextLine();

				switch (input3) {

				case "1":

					sm.login();

					sm.addItem();

					break;

				case "2":

					System.out.println("1:입찰가 입력  2:입찰가 확인  3:취소  4:테스트");

					String input4 = sc.nextLine();

					switch (input4) {

					case "1":

						cm.logIn();

						System.out.println();

						cm.printGoods();

						System.out.println();

						cm.purchase();

						System.out.println();

						cm.purchase2();

						break;

					case "2":

						cm.result();

						cm.account();

						break;

					case "3":

						System.out.println("입찰 취소");

						break;

					case "4":

						System.out.println("구매자 로그인입니다. 입찰을 원하시면 1을 눌러주세요.");

						String input5 = sc.nextLine();

						switch (input5) {

						case "1":

							cm.logIn();

							System.out.println();

							cm.printGoods();

							System.out.println();

							cm.purchase();

							System.out.println();

							cm.purchase2();

							break;

						}

						break;

					}

					break;

				}

				break;

			case "3":

				System.out.println("프로그램 종료");

				return;

			}

		}

	}

}