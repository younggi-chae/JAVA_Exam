package kosta.mission;

import java.util.Scanner;

public class Mission06 {

	public static void main(String[] args) {
		
		//2개의 정수를 입력받아 b-a 결과를 출력하자.
		//b > a 가 되도록 일력받음
		//1. do~ while
		//2. while(true) break;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		do {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int result = b - a;
			if(b < a) {
				break;
			}
			System.out.println("b - a = " + result);
			
		} while (true);
	}
    }


