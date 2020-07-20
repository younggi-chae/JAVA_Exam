package kosta.algorithm;

import java.util.Scanner;

public class CardSolution {
	static int t;
	static int N, K, P;// N:영미 구매날짜수, K:현준이 희망개수, P:1일 최대지급수
	static int A[] = new int[101];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();

		for (int test_case = 1; test_case <= t; test_case++) {
			N = sc.nextInt();  //2
			K = sc.nextInt();  //3
			P = sc.nextInt();  //8
			for (int i = 1; i <= N; i++) {
				A[i] = sc.nextInt();
			}

			int Answer = -1;
			// 연산을 수행
			int rem = 0;
			for (int i = 1; i <= N; i++) {
				rem = rem + A[i];
				int m = Math.min(P, rem);
				K = K - m;
				if (K <= 0) {
					Answer = i;
					break;
				}
			}

			System.out.println("#" + test_case + "  " + Answer);

		}
	}

}

/*
[딱지 수집]

영미는 1일부터 N까지 매일 아침 8시에 A개의 딱지를 구매하여
오후 3시에 동생 현준이에게 딱지를 나눠준다.
단. 영미가 가지고 있는 딱지 개수의 범위 내에서 아래와 같은 규칙을 지키기로 했다.

1. 현준이에게는 하루에 P개 이하의 딱지를 준다.
2. 딱지를 나눠주고 남은 딱지가 있다면 보관하고 다음 날 구매한 딱지와 합한다.

현준이는 최종적으로 K개 딱지를 갖고 싶어 하고, 영미도 현준이가 원하는 개수의
딱지를 가능한 빠른 시일 안에 주고 싶다.
현준이가 K개의 딱지를 갖게 되는데 필요한 최소일수를 구하시오.
만약 불가능할 경우 -1을 출력한다.

[입력]
첫 번째 줄에 테스트케이스의 수 T(1<= T<=50)가 주어진다.
각 테스트케이스마다. 첫 번째 줄에는 영미가 딱지를 구매하는 날짜 N,
현준이가 희망하는 딱지 개수 K, 하루에 받을 수 있는 최대 딱지의 양 P가 각각 
공백을 두고 주어진다.
두 번째 줄에는 영미가 1일부터 N일까지 매일 구매하는 딱지의 개수 Ai가 공백을 
두고 N개 주어진다.(1<=Ai<=100)

[출력]
각 줄마다 #T(T는 테스트케이스 번호)를 출력한 뒤, 현준이가 K개의 딱지를 갖기
위해 필요한 최소 일수를 출력한다. 단 불가능할 경우 -1을 출력한다.

[sample put]
2
2 3 8 
1 2 

3 17 6
10 10 10

[sample output]
#1 2
#2 3
*/