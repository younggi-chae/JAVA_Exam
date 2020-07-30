package kosta.algorithm;

import java.util.Scanner;

public class DfsExam1 {

	static int T;
	static int N; // 조합하고자 하는 숫자, 경우의 수
	static int visited[] = new int[7]; // 방문한 값 체크
	static int Answer[] = new int[7];

	static void dfs(int depth) {
		// 종료 조건
		if (depth == N + 1) { // 더 이상 내려갈 곳이 없을 경우까지
			for (int i = 1; i <= N; i++) {
				System.out.print(Answer[i] + " ");
			}
			System.out.println();
		} else { // 탐색 조건
			for (int i = 1; i <= N; i++) { 
				if (visited[i] == 0) { // 0 방문 x
					visited[i] = 1;    
					Answer[depth] = i; 
					dfs(depth + 1);  //재귀함수를 통해 한층이 올라감
					visited[i] = 0;  //방문한 기록 초기화
					Answer[depth] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();

			for (int i = 1; i <= N; i++) {
				visited[i] = 0;
			}
			System.out.print("#" + test_case);		
			dfs(1);
		}
		
	}
}


/*
[외판원 순회 문제]

1번부터 N번까지 번호가 매겨져 있는 도시가 있고, 도시를 사이에 길이 있는 경우에만
이동할 수 있다. 여행을 좋아하는 종민이는 M번 도시에서 출발하여 출발지를 
제외한 모든 도시를 정확히 한 번씩만 방문한 후 처음 출발지인 M번 도시로
돌아오려 한다. 이때 도시들 사이의 길을 지날갈 때 지불해야 하는 통행료가 있어,
종민이는 최소한의 비용으로 모든 도시를 여행하고 싶다. 종민이가 모든 도시를
여행할 때 필요한 최소비용을 출력하는 프로그램을 작성하시오.

[입력]
첫 번째 줄에 테스트케이스의 수 T(1<= T <= 10)가 주어진다.
각 테스트케이스 마다 첫 번째 줄에는 도시의 수 N과 출발지 M이 공백을 두고 주어진다.
(3<=N<=10, 1<=M<=N) 다음 N개의 줄에는 각 줄에 N개의 숫자들이 공백을
두고 주어지는데 i번째 줄의 j번째 숫자는 i번째 도시에서 j번째 도시로 가는 드는
통행료 MAT[i][j]를 의미한다. 만약 통행료가 0인 경우는 i도시에서 j도시로 가는 길이
없음을 의미하다. (0<=MAT[i][j]<=50)

[제한조건]
- 도시를 잇는 도로는 일방통해이다. 심지어 i번째 도시에서 j번째 도시로 가는
길은 있어도, j번째 도시에서 i번째 도시로 가는 길은 없을 수도 있다.
- 모든 도시를 정확히 한 번씩만 지나야 함에 유의하라.

[출력]
각 줄마다 "#T(T는 테스트케이스 번호)를 출력한 뒤, 종민이가 M번 도시부터
시작하여 모든 도시를 정확히 한 번씩 순회하고 오는데 드는 통행료 최소값을
출력하시오. 단 불가능할 경우 -1을 출력한다.

[sample]
3

3 1
0 1 1
1 0 10
2 20 0

4 3
0 8 13 30
5 0 6 20
6 11 0 21
7 7 6 0

5 5
0 17 0 3 0
1 0 3 4 5
0 5 0 2 5
44 10 0 0 0
9 3 9 7 0

[sampe output]
#1 13
#2 40
#3 30 
 
*/
