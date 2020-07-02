package kosta.basic;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		// 1. 배열을 선언
		int arr[]; // 배열 선언 => 주소값을 넣을 수 있는 변수가 생성
		arr = new int[5]; // 배열 생성 => int형 변수 5개 생성. 생성된 주소를 arr에 대입

		// 2. 배열 선언가 생성을 함께
		int arr2[] = new int[5];

		// 3. 배열선언, 생성, 초기화 함께
		int arr3[] = { 1, 2, 3, 4, 5 };

		// for문을 이용해서 전체 배열요소를 출력하자.
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "]=" + arr3[i]);
		}
		// 향상된 for문을 이용한 출력
		for (int n : arr3) {
			System.out.print(n + ",");
		}

		// 1. 배열에 사용될 테이터타입은 무엇인가?
		// 2. 배열의 크기를 결정 => 초과사용 => ArrayIndexOutOfBoundsException
		// 3. 배열을 어떻게 초기화(인덱스, for문 , 생성과 동시에)
		// 4. 배열에 잇는 데이터 출력(for문, 향상된 for문)

		// 구구단 7단의 결과 배열안에 초기화 후 출력해 보자.
		int arr4[] = new int[9];
		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = 7 * (i + 1);
			System.out.println("7 * " + (i + 1) + " = " + arr4[i]);
		}

		// 문자열 배열을 생성 후 키보드로 부터 데이터를 초기화
		// 배열 전체 내용을 출력
		// q를 입력하면 그만 받는다.
	
		Scanner sc = new Scanner(System.in);
		String strr[] = new String[100];
		int count = 0;
		while(true) {
			System.out.println("입력 :");
			String str = sc.nextLine();
			if(str.equals("q"))
				break;
			strr[count++] = str;			
		}
		for(int i = 0; i < count; i++) {
			System.out.print(strr[i] + ",");
		}
	}
}
