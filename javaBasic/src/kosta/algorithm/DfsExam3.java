package kosta.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DfsExam3 {

	static int T;
	static int N;	
	static int Answer;
	// 종료조건 x, 범위를 벗어나면 종료
	// 상하좌우 탐색 //동 남 서 북
	static int dr[] = { 0, 1, 0, -1 }; // 로우
	static int dc[] = { 1, 0, -1, 0 }; // 컬럼
	// -1: 파괴된 초원, 0 : 초원   1:바리게이트  2:화산
	static int MAT[][] = new int[11][11]; //지도값 저장
	
	static List<int[]> S = new ArrayList<int[]>(); //화산위치

	// 화산 위치를 넣을 어레이 리스트나 배열
	// 섬의 크기 배열 mat

	public static void dfs(int now_row, int now_col) {
		//탐색 조건		
		//4가지 방향
		for(int i = 0; i < 4; i++) {
			int next_row = now_row + dr[i];
			int next_col = now_col + dc[i];
			//다음 지점이 격자안에 있는 경우
			if(next_row >= 1 && next_row <= N && next_col >=1 && next_col <= N) {
				if(MAT[next_row][next_col] == 0) {
					MAT[next_row][next_col] = -1;  //파괴된 초원
					Answer--;  //초원의 수를 하나 줄여준다.
					dfs(next_row, next_col);  
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			//지도 초기화
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					MAT[i][j] = 0;
				}
			}
			S.clear();
			Answer = 0;
			//지도 입력받기
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					MAT[i][j] = sc.nextInt();
					//초원인 경우
					if(MAT[i][j] == 0) {
						Answer++;
					} else if(MAT[i][j] == 2) {
						S.add(new int[] {i, j});
					}
				}
			}
			
			for(int i = 0; i < S.size(); i++) {
				dfs(S.get(i)[0], S.get(i)[1]);
				System.out.println("#" + test_case + " " + Answer);
			}	
			
		}
	}

}


/*
화산폭발

세로와 가로의 크기가 N인 정사각형 모양의 격자로 이루어진 섬에 화산이 폭발하였다.
최초 격자의 상태는 초원, 바리케이트, 화산 세 가지 상태로 이루어져 있다.
용암은 화산에서 출발하여 상하좌우 네 방향 중 초원이 있는 곳들을 파괴된 초원으로
바꾸며 펴져나간다.

만약네 방향 중 바리케이트가 설치되어 있거나 혹은 화산이 존재한다면 해당 영역을
지나 갈 수 없다.
또한 격자를 벗어나는 것도 허용되지 않는다.
시간이 충분히 지나 용암이 퍼져나갈 수 있는 모든 영역으로 퍼져나갔을 때,
파괴되지 않은 초원의 최대 크기를 구하는 프로그램을 작성하시오.

<입력>
첫 번째 줄에 테스트케이스의 수 T(1<=T<=10)가 주어진다.
각 테스트케이스마다 첫 번째 줄에는 가로와 세로의 크기 N이 공백을 두고 주어진다.
(3<=N<=100)
다음 N개의 줄에는 각 줄에 N개의 숫자들이 공백을 두고 주어지는데 i번째 줄의
j번째 숫자는 i행 j열의 상태 MAT[i][j]를 나타낸다. MAT[i][j] 값이  0인 경우에는
초원이며, 1인 경우에는 이미 세워진 바리케이트, 2인 경우에는 화산이 폭발한 지점이다.

<출력>
각 줄마다 #T(T는 테스트케이스 번호)를 출력한 뒤, 공백을 두고 용암이 퍼져나가도 
파괴되지 않는 초원의 개수를 출력한다.

<sample input]
2
3
0 1 1
0 2 0
1 1 0
4
0 0 0 0 
0 2 1 0
0 1 2 1
0 0 1 0

[sample output]
#1 0
#2 1

*/